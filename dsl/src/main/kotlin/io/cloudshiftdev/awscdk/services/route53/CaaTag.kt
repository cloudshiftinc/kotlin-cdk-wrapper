package io.cloudshiftdev.awscdk.services.route53

public enum class CaaTag(
    private val cdkObject: software.amazon.awscdk.services.route53.CaaTag,
) {
    ISSUE(software.amazon.awscdk.services.route53.CaaTag.ISSUE),
    ISSUEWILD(software.amazon.awscdk.services.route53.CaaTag.ISSUEWILD),
    IODEF(software.amazon.awscdk.services.route53.CaaTag.IODEF),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CaaTag): CaaTag =
            when (cdkObject) {
                software.amazon.awscdk.services.route53.CaaTag.ISSUE -> CaaTag.ISSUE
                software.amazon.awscdk.services.route53.CaaTag.ISSUEWILD -> CaaTag.ISSUEWILD
                software.amazon.awscdk.services.route53.CaaTag.IODEF -> CaaTag.IODEF
            }

        internal fun unwrap(wrapped: CaaTag): software.amazon.awscdk.services.route53.CaaTag =
            wrapped.cdkObject
    }
}
