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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Details for your use of the Bot Control managed rule group, `AWSManagedRulesBotControlRuleSet` .
 *
 * This configuration is used in `ManagedRuleGroupConfig` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * AWSManagedRulesBotControlRuleSetProperty aWSManagedRulesBotControlRuleSetProperty =
 * AWSManagedRulesBotControlRuleSetProperty.builder()
 * .inspectionLevel("inspectionLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-awsmanagedrulesbotcontrolruleset.html)
 */
@CdkDslMarker
public class CfnWebACLAWSManagedRulesBotControlRuleSetPropertyDsl {
    private val cdkBuilder: CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.Builder =
        CfnWebACL.AWSManagedRulesBotControlRuleSetProperty.builder()

    /**
     * @param inspectionLevel The inspection level to use for the Bot Control rule group. The common
     *   level is the least expensive. The targeted level includes all common level rules and adds
     *   rules with more advanced inspection criteria. For details, see
     *   [AWS WAF Bot Control rule group](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)
     *   in the *AWS WAF Developer Guide* .
     */
    public fun inspectionLevel(inspectionLevel: String) {
        cdkBuilder.inspectionLevel(inspectionLevel)
    }

    public fun build(): CfnWebACL.AWSManagedRulesBotControlRuleSetProperty = cdkBuilder.build()
}
