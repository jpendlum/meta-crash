FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
	         file://80-crash-kmod.rules \
           "

do_install_append() {
    install -m 0644 ${WORKDIR}/80-crash-kmod.rules ${D}${sysconfdir}/udev/rules.d/80-crash-kmod.rules
}
