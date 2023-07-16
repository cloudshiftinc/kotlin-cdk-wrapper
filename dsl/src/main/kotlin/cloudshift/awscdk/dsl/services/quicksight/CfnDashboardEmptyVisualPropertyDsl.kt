@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardEmptyVisualPropertyDsl {
  private val cdkBuilder: CfnDashboard.EmptyVisualProperty.Builder =
      CfnDashboard.EmptyVisualProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun visualId(visualId: String) {
    cdkBuilder.visualId(visualId)
  }

  public fun build(): CfnDashboard.EmptyVisualProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
