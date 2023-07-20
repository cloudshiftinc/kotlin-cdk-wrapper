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
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy
import kotlin.String

@CdkDslMarker
public class CfnFirewallPolicyCustomActionPropertyDsl {
    private val cdkBuilder: CfnFirewallPolicy.CustomActionProperty.Builder =
        CfnFirewallPolicy.CustomActionProperty.builder()

    public fun actionDefinition(actionDefinition: IResolvable) {
        cdkBuilder.actionDefinition(actionDefinition)
    }

    public fun actionDefinition(actionDefinition: CfnFirewallPolicy.ActionDefinitionProperty) {
        cdkBuilder.actionDefinition(actionDefinition)
    }

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun build(): CfnFirewallPolicy.CustomActionProperty = cdkBuilder.build()
}
