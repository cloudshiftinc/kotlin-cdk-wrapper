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
 * The configuration object for AWS Config rule evaluation mode.
 *
 * The supported valid values are Detective or Proactive.
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

    /** @param mode The mode of an evaluation. The valid values are Detective or Proactive. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnConfigRule.EvaluationModeConfigurationProperty = cdkBuilder.build()
}
