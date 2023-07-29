@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy
import software.amazon.awscdk.services.ses.IDedicatedIpPool
import software.amazon.awscdk.services.ses.SuppressionReasons

/**
 * Properties for a configuration set.
 *
 * Example:
 * ```
 * IDedicatedIpPool myPool;
 * ConfigurationSet.Builder.create(this, "ConfigurationSet")
 * .customTrackingRedirectDomain("track.cdk.dev")
 * .suppressionReasons(SuppressionReasons.COMPLAINTS_ONLY)
 * .tlsPolicy(ConfigurationSetTlsPolicy.REQUIRE)
 * .dedicatedIpPool(myPool)
 * .build();
 * ```
 */
@CdkDslMarker
public class ConfigurationSetPropsDsl {
    private val cdkBuilder: ConfigurationSetProps.Builder = ConfigurationSetProps.builder()

    /** @param configurationSetName A name for the configuration set. */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
     *   recipients to the Amazon SES event tracking domain.
     */
    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
        cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
    }

    /** @param dedicatedIpPool The dedicated IP pool to associate with the configuration set. */
    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
        cdkBuilder.dedicatedIpPool(dedicatedIpPool)
    }

    /**
     * @param reputationMetrics Whether to publish reputation metrics for the configuration set,
     *   such as bounce and complaint rates, to Amazon CloudWatch.
     */
    public fun reputationMetrics(reputationMetrics: Boolean) {
        cdkBuilder.reputationMetrics(reputationMetrics)
    }

    /** @param sendingEnabled Whether email sending is enabled. */
    public fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    /**
     * @param suppressionReasons The reasons for which recipient email addresses should be
     *   automatically added to your account's suppression list.
     */
    public fun suppressionReasons(suppressionReasons: SuppressionReasons) {
        cdkBuilder.suppressionReasons(suppressionReasons)
    }

    /**
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     *   use Transport Layer Security (TLS).
     */
    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
        cdkBuilder.tlsPolicy(tlsPolicy)
    }

    public fun build(): ConfigurationSetProps = cdkBuilder.build()
}
