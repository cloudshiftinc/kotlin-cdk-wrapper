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
public class CfnDashboardDashboardErrorPropertyDsl {
  private val cdkBuilder: CfnDashboard.DashboardErrorProperty.Builder =
      CfnDashboard.DashboardErrorProperty.builder()

  private val _violatedEntities: MutableList<Any> = mutableListOf()

  /**
   * @param message Message.
   */
  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  /**
   * @param type Type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param violatedEntities Lists the violated entities that caused the dashboard error.
   */
  public fun violatedEntities(vararg violatedEntities: Any) {
    _violatedEntities.addAll(listOf(*violatedEntities))
  }

  /**
   * @param violatedEntities Lists the violated entities that caused the dashboard error.
   */
  public fun violatedEntities(violatedEntities: Collection<Any>) {
    _violatedEntities.addAll(violatedEntities)
  }

  /**
   * @param violatedEntities Lists the violated entities that caused the dashboard error.
   */
  public fun violatedEntities(violatedEntities: IResolvable) {
    cdkBuilder.violatedEntities(violatedEntities)
  }

  public fun build(): CfnDashboard.DashboardErrorProperty {
    if(_violatedEntities.isNotEmpty()) cdkBuilder.violatedEntities(_violatedEntities)
    return cdkBuilder.build()
  }
}
