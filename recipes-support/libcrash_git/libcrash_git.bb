DESCRIPTION = "API to interface with CRASH kmod and user programmable logic blocks in the Xilinx Zynq FPGA fabric."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783b7e40cdfb4a1344d15b1f7081af66"
DEPENDS += "\
	crash-kmod \
	udev"
LIBCRASH_VERSION ?= "0.1"
PV = "${LIBCRASH_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/jpendlum/libcrash.git;protocol=https;branch=master"

SRCREV = "7f06f5f9b3452dddfeecaa655f1c4a39d5017573"

S = "${WORKDIR}/git"

# All the magic (do_compile, do_install, etc...) happens here automatically
inherit cmake
