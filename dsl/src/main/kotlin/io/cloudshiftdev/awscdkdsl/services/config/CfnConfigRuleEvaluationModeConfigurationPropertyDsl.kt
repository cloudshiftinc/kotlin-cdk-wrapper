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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Evaluation mode for the AWS Config rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * EvaluationModeConfigurationProperty evaluationModeConfigurationProperty =
 * EvaluationModeConfigurationProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-evaluationmodeconfiguration.html)
 */
@CdkDslMarker
public class CfnConfigRuleEvaluationModeConfigurationPropertyDsl {
    private val cdkBuilder: CfnConfigRule.EvaluationModeConfigurationProperty.Builder =
        CfnConfigRule.EvaluationModeConfigurationProperty.builder()

    /** @param mode Mode of evaluation of AWS Config rule. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnConfigRule.EvaluationModeConfigurationProperty = cdkBuilder.build()
}
