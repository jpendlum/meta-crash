FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

CORE_IMAGE_EXTRA_INSTALL += "\
  u-boot-xlnx \
  crash-kmod \
  emacs"
