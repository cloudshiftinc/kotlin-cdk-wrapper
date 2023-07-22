@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisVisualCustomActionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.VisualCustomActionProperty.Builder =
      CfnAnalysis.VisualCustomActionProperty.builder()

  private val _actionOperations: MutableList<Any> = mutableListOf()

  /**
   * @param actionOperations A list of `VisualCustomActionOperations` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun actionOperations(vararg actionOperations: Any) {
    _actionOperations.addAll(listOf(*actionOperations))
  }

  /**
   * @param actionOperations A list of `VisualCustomActionOperations` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun actionOperations(actionOperations: Collection<Any>) {
    _actionOperations.addAll(actionOperations)
  }

  /**
   * @param actionOperations A list of `VisualCustomActionOperations` . 
   * This is a union type structure. For this structure to be valid, only one of the attributes can
   * be defined.
   */
  public fun actionOperations(actionOperations: IResolvable) {
    cdkBuilder.actionOperations(actionOperations)
  }

  /**
   * @param customActionId The ID of the `VisualCustomAction` . 
   */
  public fun customActionId(customActionId: String) {
    cdkBuilder.customActionId(customActionId)
  }

  /**
   * @param name The name of the `VisualCustomAction` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param status The status of the `VisualCustomAction` .
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param trigger The trigger of the `VisualCustomAction` . 
   * Valid values are defined as follows:
   *
   * * `DATA_POINT_CLICK` : Initiates a custom action by a left pointer click on a data point.
   * * `DATA_POINT_MENU` : Initiates a custom action by right pointer click from the menu.
   */
  public fun trigger(trigger: String) {
    cdkBuilder.trigger(trigger)
  }

  public fun build(): CfnAnalysis.VisualCustomActionProperty {
    if(_actionOperations.isNotEmpty()) cdkBuilder.actionOperations(_actionOperations)
    return cdkBuilder.build()
  }
}
