package io.cloudshiftdev.awscdk.services.route53

public interface IAliasRecordTarget {
    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record
     * @param zone
     */
    public fun bind(record: IRecordSet): AliasRecordTargetConfig

    /**
     * Return hosted zone ID and DNS name, usable for Route53 alias targets.
     *
     * @param record
     * @param zone
     */
    public fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget,
    ) : IAliasRecordTarget {
        /**
         * Return hosted zone ID and DNS name, usable for Route53 alias targets.
         *
         * @param record
         * @param zone
         */
        override fun bind(record: IRecordSet): AliasRecordTargetConfig =
            unwrap(this).bind(record.let(IRecordSet::unwrap)).let(AliasRecordTargetConfig::wrap)

        /**
         * Return hosted zone ID and DNS name, usable for Route53 alias targets.
         *
         * @param record
         * @param zone
         */
        override fun bind(record: IRecordSet, zone: IHostedZone): AliasRecordTargetConfig =
            unwrap(this)
                .bind(record.let(IRecordSet::unwrap), zone.let(IHostedZone::unwrap))
                .let(AliasRecordTargetConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.route53.IAliasRecordTarget
        ): IAliasRecordTarget = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IAliasRecordTarget
        ): software.amazon.awscdk.services.route53.IAliasRecordTarget =
            (wrapped as Wrapper).cdkObject
    }
}
