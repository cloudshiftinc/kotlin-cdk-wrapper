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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a SageMaker pipeline as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetSageMakerPipelineParametersProperty pipeTargetSageMakerPipelineParametersProperty =
 * PipeTargetSageMakerPipelineParametersProperty.builder()
 * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsagemakerpipelineparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder =
        CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder()

    private val _pipelineParameterList: MutableList<Any> = mutableListOf()

    /**
     * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
     *   Pipeline execution.
     */
    public fun pipelineParameterList(vararg pipelineParameterList: Any) {
        _pipelineParameterList.addAll(listOf(*pipelineParameterList))
    }

    /**
     * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
     *   Pipeline execution.
     */
    public fun pipelineParameterList(pipelineParameterList: Collection<Any>) {
        _pipelineParameterList.addAll(pipelineParameterList)
    }

    /**
     * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
     *   Pipeline execution.
     */
    public fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
    }

    public fun build(): CfnPipe.PipeTargetSageMakerPipelineParametersProperty {
        if (_pipelineParameterList.isNotEmpty())
            cdkBuilder.pipelineParameterList(_pipelineParameterList)
        return cdkBuilder.build()
    }
}
