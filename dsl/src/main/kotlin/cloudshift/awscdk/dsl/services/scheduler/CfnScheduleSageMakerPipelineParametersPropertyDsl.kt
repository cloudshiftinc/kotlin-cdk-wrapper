@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

@CdkDslMarker
public class CfnScheduleSageMakerPipelineParametersPropertyDsl {
  private val cdkBuilder: CfnSchedule.SageMakerPipelineParametersProperty.Builder =
      CfnSchedule.SageMakerPipelineParametersProperty.builder()

  private val _pipelineParameterList: MutableList<Any> = mutableListOf()

  /**
   * @param pipelineParameterList List of parameter names and values to use when executing the
   * SageMaker Model Building Pipeline.
   */
  public fun pipelineParameterList(vararg pipelineParameterList: Any) {
    _pipelineParameterList.addAll(listOf(*pipelineParameterList))
  }

  /**
   * @param pipelineParameterList List of parameter names and values to use when executing the
   * SageMaker Model Building Pipeline.
   */
  public fun pipelineParameterList(pipelineParameterList: Collection<Any>) {
    _pipelineParameterList.addAll(pipelineParameterList)
  }

  /**
   * @param pipelineParameterList List of parameter names and values to use when executing the
   * SageMaker Model Building Pipeline.
   */
  public fun pipelineParameterList(pipelineParameterList: IResolvable) {
    cdkBuilder.pipelineParameterList(pipelineParameterList)
  }

  public fun build(): CfnSchedule.SageMakerPipelineParametersProperty {
    if(_pipelineParameterList.isNotEmpty()) cdkBuilder.pipelineParameterList(_pipelineParameterList)
    return cdkBuilder.build()
  }
}
