@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy
import software.amazon.awscdk.services.ses.IDedicatedIpPool
import software.amazon.awscdk.services.ses.SuppressionReasons
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class ConfigurationSetPropsDsl {
    private val cdkBuilder: ConfigurationSetProps.Builder = ConfigurationSetProps.builder()

    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
        cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
    }

    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
        cdkBuilder.dedicatedIpPool(dedicatedIpPool)
    }

    public fun reputationMetrics(reputationMetrics: Boolean) {
        cdkBuilder.reputationMetrics(reputationMetrics)
    }

    public fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    public fun suppressionReasons(suppressionReasons: SuppressionReasons) {
        cdkBuilder.suppressionReasons(suppressionReasons)
    }

    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
        cdkBuilder.tlsPolicy(tlsPolicy)
    }

    public fun build(): ConfigurationSetProps = cdkBuilder.build()
}
