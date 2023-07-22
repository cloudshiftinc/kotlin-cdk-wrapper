@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dashboard error.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardErrorProperty dashboardErrorProperty = DashboardErrorProperty.builder()
 * .message("message")
 * .type("type")
 * .violatedEntities(List.of(EntityProperty.builder()
 * .path("path")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboarderror.html)
 */
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
