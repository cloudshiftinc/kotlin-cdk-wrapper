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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl {
    private val cdkBuilder: CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.Builder =
        CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.builder()

    public fun inspectionLevel(inspectionLevel: String) {
        cdkBuilder.inspectionLevel(inspectionLevel)
    }

    public fun build(): CfnWebACL.AWSManagedRulesBotControlRuleSetProperty = cdkBuilder.build()
}
