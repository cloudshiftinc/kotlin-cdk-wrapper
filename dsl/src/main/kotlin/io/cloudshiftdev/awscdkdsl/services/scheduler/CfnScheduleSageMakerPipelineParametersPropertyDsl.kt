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

package io.cloudshiftdev.awscdkdsl.services.scheduler

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The templated target type for the Amazon SageMaker
 * [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
 * API operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * SageMakerPipelineParametersProperty sageMakerPipelineParametersProperty =
 * SageMakerPipelineParametersProperty.builder()
 * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html)
 */
@CdkDslMarker
public class CfnScheduleSageMakerPipelineParametersPropertyDsl {
    private val cdkBuilder: CfnSchedule.SageMakerPipelineParametersProperty.Builder =
        CfnSchedule.SageMakerPipelineParametersProperty.builder()

    private val _pipelineParameterList: MutableList<Any> = mutableListOf()

    /**
     * @param pipelineParameterList List of parameter names and values to use when executing the
     *   SageMaker Model Building Pipeline.
     */
    public fun pipelineParameterList(vararg pipelineParameterList: Any) {
        _pipelineParameterList.addAll(listOf(*pipelineParameterList))
    }

    /**
     * @param pipelineParameterList List of parameter names and values to use when executing the
     *   SageMaker Model Building Pipeline.
     */
    public fun pipelineParameterList(pipelineParameterList: Collection<Any>) {
        _pipelineParameterList.addAll(pipelineParameterList)
    }

    /**
     * @param pipelineParameterList List of parameter names and values to use when executing the
     *   SageMaker Model Building Pipeline.
     */
    public fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
    }

    public fun build(): CfnSchedule.SageMakerPipelineParametersProperty {
        if (_pipelineParameterList.isNotEmpty())
            cdkBuilder.pipelineParameterList(_pipelineParameterList)
        return cdkBuilder.build()
    }
}
