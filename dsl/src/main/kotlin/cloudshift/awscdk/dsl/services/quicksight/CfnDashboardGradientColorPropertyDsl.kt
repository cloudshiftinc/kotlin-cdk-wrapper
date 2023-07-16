@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGradientColorPropertyDsl {
  private val cdkBuilder: CfnDashboard.GradientColorProperty.Builder =
      CfnDashboard.GradientColorProperty.builder()

  private val _stops: MutableList<Any> = mutableListOf()

  public fun stops(vararg stops: Any) {
    _stops.addAll(listOf(*stops))
  }

  public fun stops(stops: Collection<Any>) {
    _stops.addAll(stops)
  }

  public fun stops(stops: IResolvable) {
    cdkBuilder.stops(stops)
  }

  public fun build(): CfnDashboard.GradientColorProperty {
    if(_stops.isNotEmpty()) cdkBuilder.stops(_stops)
    return cdkBuilder.build()
  }
}
