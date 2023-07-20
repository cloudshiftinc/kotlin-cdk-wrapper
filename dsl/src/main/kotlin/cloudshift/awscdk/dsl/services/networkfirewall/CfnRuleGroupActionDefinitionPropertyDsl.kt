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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupActionDefinitionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ActionDefinitionProperty.Builder =
        CfnRuleGroup.ActionDefinitionProperty.builder()

    public fun publishMetricAction(publishMetricAction: IResolvable) {
        cdkBuilder.publishMetricAction(publishMetricAction)
    }

    public fun publishMetricAction(publishMetricAction: CfnRuleGroup.PublishMetricActionProperty) {
        cdkBuilder.publishMetricAction(publishMetricAction)
    }

    public fun build(): CfnRuleGroup.ActionDefinitionProperty = cdkBuilder.build()
}
