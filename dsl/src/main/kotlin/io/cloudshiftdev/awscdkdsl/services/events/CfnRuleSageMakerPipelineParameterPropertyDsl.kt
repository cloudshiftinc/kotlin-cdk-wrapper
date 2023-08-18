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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnRule

/**
 * Name/Value pair of a parameter to start execution of a SageMaker Model Building Pipeline.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * SageMakerPipelineParameterProperty sageMakerPipelineParameterProperty =
 * SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html)
 */
@CdkDslMarker
public class CfnRuleSageMakerPipelineParameterPropertyDsl {
    private val cdkBuilder: CfnRule.SageMakerPipelineParameterProperty.Builder =
        CfnRule.SageMakerPipelineParameterProperty.builder()

    /** @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRule.SageMakerPipelineParameterProperty = cdkBuilder.build()
}
