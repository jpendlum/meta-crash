DESCRIPTION = "API to interface with CRASH kmod and user programmable logic blocks in the Xilinx Zynq FPGA fabric."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783B7E40CDFB4A1344D15B1F7081AF66"

LIBCRASH_VERSION ?= "0.1"
PV = "${LIBCRASH_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/jpendlum/libcrash.git;protocol=https;branch=master"

SRCREV = "2c96b3056460b2488cc68e203f8d46e4e0d72635"

inherit module

S = "${WORKDIR}/git"

# Running is the build system default but let's be explicit about it
do_compile() {
  oe_runmake
}

# First create the directory (most likely it already exists, but just in case), then copy libcrash into that directory
do_install() {
  install -m 0755 -d ${D}${libdir}
  install -m 0755 ${S}/libcrash.so ${D}${libdir}
  install -m 0755 ${S}/libcrash.h ${D}${includedir}
}
