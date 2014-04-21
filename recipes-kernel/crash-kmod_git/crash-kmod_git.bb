DESCRIPTION = "CRASH kernel module to allow DMA and control/status register access to programmable logic blocks in Xilinx Zynq FPGA Fabric."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=783B7E40CDFB4A1344D15B1F7081AF66"

CRASH_KMOD_VERSION ?= "0.1"
PV = "${CRASH_KMOD_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/jpendlum/crash-kmod.git;protocol=https;branch=master"

SRCREV = "644ec073b4b100f6e2fdb7df8eb7e16741142086"

inherit module

S = "${WORKDIR}/git"
