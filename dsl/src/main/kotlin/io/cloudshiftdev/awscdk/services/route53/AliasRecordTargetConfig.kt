package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AliasRecordTargetConfig {
    /** DNS name of the target. */
    public fun dnsName(): String

    /** Hosted zone ID of the target. */
    public fun hostedZoneId(): String

    /** A builder for [AliasRecordTargetConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param dnsName DNS name of the target. */
        public fun dnsName(dnsName: String)

        /** @param hostedZoneId Hosted zone ID of the target. */
        public fun hostedZoneId(hostedZoneId: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.route53.AliasRecordTargetConfig.Builder =
            software.amazon.awscdk.services.route53.AliasRecordTargetConfig.builder()

        /** @param dnsName DNS name of the target. */
        override fun dnsName(dnsName: String) {
            cdkBuilder.dnsName(dnsName)
        }

        /** @param hostedZoneId Hosted zone ID of the target. */
        override fun hostedZoneId(hostedZoneId: String) {
            cdkBuilder.hostedZoneId(hostedZoneId)
        }

        public fun build(): software.amazon.awscdk.services.route53.AliasRecordTargetConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig,
    ) : AliasRecordTargetConfig {
        /** DNS name of the target. */
        override fun dnsName(): String = unwrap(this).getDnsName()

        /** Hosted zone ID of the target. */
        override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AliasRecordTargetConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig
        ): AliasRecordTargetConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AliasRecordTargetConfig
        ): software.amazon.awscdk.services.route53.AliasRecordTargetConfig =
            (wrapped as Wrapper).cdkObject
    }
}
