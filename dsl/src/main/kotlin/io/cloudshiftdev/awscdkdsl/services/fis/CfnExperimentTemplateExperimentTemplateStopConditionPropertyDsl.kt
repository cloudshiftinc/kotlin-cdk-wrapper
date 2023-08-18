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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies a stop condition for an experiment template.
 *
 * For more information, see
 * [Stop conditions](https://docs.aws.amazon.com/fis/latest/userguide/stop-conditions.html) in the
 * *AWS Fault Injection Simulator User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * ExperimentTemplateStopConditionProperty experimentTemplateStopConditionProperty =
 * ExperimentTemplateStopConditionProperty.builder()
 * .source("source")
 * // the properties below are optional
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-experimenttemplatestopcondition.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateStopConditionPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.Builder =
        CfnExperimentTemplate.ExperimentTemplateStopConditionProperty.builder()

    /**
     * @param source The source for the stop condition. Specify `aws:cloudwatch:alarm` if the stop
     *   condition is defined by a CloudWatch alarm. Specify `none` if there is no stop condition.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * @param value The Amazon Resource Name (ARN) of the CloudWatch alarm. This is required if the
     *   source is a CloudWatch alarm.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnExperimentTemplate.ExperimentTemplateStopConditionProperty =
        cdkBuilder.build()
}
