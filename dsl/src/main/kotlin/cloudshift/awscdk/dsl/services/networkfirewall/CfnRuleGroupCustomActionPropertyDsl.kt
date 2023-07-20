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
import kotlin.String

@CdkDslMarker
public class CfnRuleGroupCustomActionPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.CustomActionProperty.Builder =
        CfnRuleGroup.CustomActionProperty.builder()

    public fun actionDefinition(actionDefinition: IResolvable) {
        cdkBuilder.actionDefinition(actionDefinition)
    }

    public fun actionDefinition(actionDefinition: CfnRuleGroup.ActionDefinitionProperty) {
        cdkBuilder.actionDefinition(actionDefinition)
    }

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun build(): CfnRuleGroup.CustomActionProperty = cdkBuilder.build()
}
