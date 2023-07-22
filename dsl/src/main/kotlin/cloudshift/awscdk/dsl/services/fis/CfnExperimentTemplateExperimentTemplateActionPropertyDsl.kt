@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

@CdkDslMarker
public class CfnExperimentTemplateExperimentTemplateActionPropertyDsl {
  private val cdkBuilder: CfnExperimentTemplate.ExperimentTemplateActionProperty.Builder =
      CfnExperimentTemplate.ExperimentTemplateActionProperty.builder()

  private val _startAfter: MutableList<String> = mutableListOf()

  /**
   * @param actionId The ID of the action. 
   * The format of the action ID is: aws: *service-name* : *action-type* .
   */
  public fun actionId(actionId: String) {
    cdkBuilder.actionId(actionId)
  }

  /**
   * @param description A description for the action.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param parameters The parameters for the action, if applicable.
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters The parameters for the action, if applicable.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param startAfter The name of the action that must be completed before the current action
   * starts.
   * Omit this parameter to run the action at the start of the experiment.
   */
  public fun startAfter(vararg startAfter: String) {
    _startAfter.addAll(listOf(*startAfter))
  }

  /**
   * @param startAfter The name of the action that must be completed before the current action
   * starts.
   * Omit this parameter to run the action at the start of the experiment.
   */
  public fun startAfter(startAfter: Collection<String>) {
    _startAfter.addAll(startAfter)
  }

  /**
   * @param targets The targets for the action.
   */
  public fun targets(targets: Map<String, String>) {
    cdkBuilder.targets(targets)
  }

  /**
   * @param targets The targets for the action.
   */
  public fun targets(targets: IResolvable) {
    cdkBuilder.targets(targets)
  }

  public fun build(): CfnExperimentTemplate.ExperimentTemplateActionProperty {
    if(_startAfter.isNotEmpty()) cdkBuilder.startAfter(_startAfter)
    return cdkBuilder.build()
  }
}
