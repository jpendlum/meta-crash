DESCRIPTION = "CRASH kernel module to allow DMA and control/status register access to programmable logic blocks in Xilinx Zynq FPGA Fabric."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"
# No need for DEPENDS on the linux kernel as module.bbclass sets this for us
CRASH_KMOD_VERSION ?= "0.1"
PV = "${CRASH_KMOD_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/jpendlum/crash-kmod.git;protocol=https;branch=stable"

SRCREV = "644ec073b4b100f6e2fdb7df8eb7e16741142086"

inherit module

S = "${WORKDIR}/git"

# Normally we would run do_compile() with oe_runmake, however module.bbclass has both a do_compile and do_install definition.
# We need to append to do_install so we can copy the crash-kmod header file to the include directory
do_install_append() {
  install -m 0755 -d ${D}${includedir}
  install -m 0755 ${S}/crash-kmod.h ${D}${includedir}
}
