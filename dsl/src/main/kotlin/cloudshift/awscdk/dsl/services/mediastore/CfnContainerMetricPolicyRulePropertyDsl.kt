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

package cloudshift.awscdk.dsl.services.mediastore

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediastore.CfnContainer
import kotlin.String

@CdkDslMarker
public class CfnContainerMetricPolicyRulePropertyDsl {
    private val cdkBuilder: CfnContainer.MetricPolicyRuleProperty.Builder =
        CfnContainer.MetricPolicyRuleProperty.builder()

    public fun objectGroup(objectGroup: String) {
        cdkBuilder.objectGroup(objectGroup)
    }

    public fun objectGroupName(objectGroupName: String) {
        cdkBuilder.objectGroupName(objectGroupName)
    }

    public fun build(): CfnContainer.MetricPolicyRuleProperty = cdkBuilder.build()
}
