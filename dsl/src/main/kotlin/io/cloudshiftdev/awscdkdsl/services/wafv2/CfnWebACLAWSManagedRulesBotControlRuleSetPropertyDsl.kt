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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
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
 * // the properties below are optional
 * .enableMachineLearning(false)
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
     * @param enableMachineLearning Applies only to the targeted inspection level. Determines
     *   whether to use machine learning (ML) to analyze your web traffic for bot-related activity.
     *   Machine learning is required for the Bot Control rules `TGT_ML_CoordinatedActivityLow` and
     *   `TGT_ML_CoordinatedActivityMedium` , which inspect for anomalous behavior that might
     *   indicate distributed, coordinated bot activity.
     *
     * For more information about this choice, see the listing for these rules in the table at
     * [Bot Control rules listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
     * in the *AWS WAF Developer Guide* .
     *
     * Default: `TRUE`
     */
    public fun enableMachineLearning(enableMachineLearning: Boolean) {
        cdkBuilder.enableMachineLearning(enableMachineLearning)
    }

    /**
     * @param enableMachineLearning Applies only to the targeted inspection level. Determines
     *   whether to use machine learning (ML) to analyze your web traffic for bot-related activity.
     *   Machine learning is required for the Bot Control rules `TGT_ML_CoordinatedActivityLow` and
     *   `TGT_ML_CoordinatedActivityMedium` , which inspect for anomalous behavior that might
     *   indicate distributed, coordinated bot activity.
     *
     * For more information about this choice, see the listing for these rules in the table at
     * [Bot Control rules listing](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html#aws-managed-rule-groups-bot-rules)
     * in the *AWS WAF Developer Guide* .
     *
     * Default: `TRUE`
     */
    public fun enableMachineLearning(enableMachineLearning: IResolvable) {
        cdkBuilder.enableMachineLearning(enableMachineLearning)
    }

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
