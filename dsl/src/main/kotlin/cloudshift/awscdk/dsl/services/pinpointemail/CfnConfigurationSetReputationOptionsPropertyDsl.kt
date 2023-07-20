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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import kotlin.Boolean

@CdkDslMarker
public class CfnConfigurationSetReputationOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.ReputationOptionsProperty.Builder =
        CfnConfigurationSet.ReputationOptionsProperty.builder()

    public fun reputationMetricsEnabled(reputationMetricsEnabled: Boolean) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
    }

    public fun reputationMetricsEnabled(reputationMetricsEnabled: IResolvable) {
        cdkBuilder.reputationMetricsEnabled(reputationMetricsEnabled)
    }

    public fun build(): CfnConfigurationSet.ReputationOptionsProperty = cdkBuilder.build()
}
