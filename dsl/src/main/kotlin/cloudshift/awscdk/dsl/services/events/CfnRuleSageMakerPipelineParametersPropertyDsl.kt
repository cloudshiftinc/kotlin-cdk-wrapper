@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

/**
 * These are custom parameters to use when the target is a SageMaker Model Building Pipeline that
 * starts based on EventBridge events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * SageMakerPipelineParametersProperty sageMakerPipelineParametersProperty =
 * SageMakerPipelineParametersProperty.builder()
 * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameters.html)
 */
@CdkDslMarker
public class CfnRuleSageMakerPipelineParametersPropertyDsl {
  private val cdkBuilder: CfnRule.SageMakerPipelineParametersProperty.Builder =
      CfnRule.SageMakerPipelineParametersProperty.builder()

  private val _pipelineParameterList: MutableList<Any> = mutableListOf()

  /**
   * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
   * Pipeline execution.
   */
  public fun pipelineParameterList(vararg pipelineParameterList: Any) {
    _pipelineParameterList.addAll(listOf(*pipelineParameterList))
  }

  /**
   * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
   * Pipeline execution.
   */
  public fun pipelineParameterList(pipelineParameterList: Collection<Any>) {
    _pipelineParameterList.addAll(pipelineParameterList)
  }

  /**
   * @param pipelineParameterList List of Parameter names and values for SageMaker Model Building
   * Pipeline execution.
   */
  public fun pipelineParameterList(pipelineParameterList: IResolvable) {
    cdkBuilder.pipelineParameterList(pipelineParameterList)
  }

  public fun build(): CfnRule.SageMakerPipelineParametersProperty {
    if(_pipelineParameterList.isNotEmpty()) cdkBuilder.pipelineParameterList(_pipelineParameterList)
    return cdkBuilder.build()
  }
}
