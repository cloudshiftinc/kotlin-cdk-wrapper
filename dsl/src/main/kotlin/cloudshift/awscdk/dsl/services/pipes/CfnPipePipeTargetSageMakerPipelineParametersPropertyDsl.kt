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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipePipeTargetSageMakerPipelineParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetSageMakerPipelineParametersProperty.Builder =
        CfnPipe.PipeTargetSageMakerPipelineParametersProperty.builder()

    private val _pipelineParameterList: MutableList<Any> = mutableListOf()

    public fun pipelineParameterList(vararg pipelineParameterList: Any) {
        _pipelineParameterList.addAll(listOf(*pipelineParameterList))
    }

    public fun pipelineParameterList(pipelineParameterList: Collection<Any>) {
        _pipelineParameterList.addAll(pipelineParameterList)
    }

    public fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
    }

    public fun build(): CfnPipe.PipeTargetSageMakerPipelineParametersProperty {
        if (_pipelineParameterList.isNotEmpty()) cdkBuilder.pipelineParameterList(_pipelineParameterList)
        return cdkBuilder.build()
    }
}
