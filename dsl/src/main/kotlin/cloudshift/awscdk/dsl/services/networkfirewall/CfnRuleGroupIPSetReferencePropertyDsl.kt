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
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.String

@CdkDslMarker
public class CfnRuleGroupIPSetReferencePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.IPSetReferenceProperty.Builder =
        CfnRuleGroup.IPSetReferenceProperty.builder()

    public fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
    }

    public fun build(): CfnRuleGroup.IPSetReferenceProperty = cdkBuilder.build()
}
