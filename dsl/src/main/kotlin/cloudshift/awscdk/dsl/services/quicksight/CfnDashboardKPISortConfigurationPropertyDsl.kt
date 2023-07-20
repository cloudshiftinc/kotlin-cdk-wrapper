@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardKPISortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.KPISortConfigurationProperty.Builder =
      CfnDashboard.KPISortConfigurationProperty.builder()

  private val _trendGroupSort: MutableList<Any> = mutableListOf()

  public fun trendGroupSort(vararg trendGroupSort: Any) {
    _trendGroupSort.addAll(listOf(*trendGroupSort))
  }

  public fun trendGroupSort(trendGroupSort: Collection<Any>) {
    _trendGroupSort.addAll(trendGroupSort)
  }

  public fun trendGroupSort(trendGroupSort: IResolvable) {
    cdkBuilder.trendGroupSort(trendGroupSort)
  }

  public fun build(): CfnDashboard.KPISortConfigurationProperty {
    if(_trendGroupSort.isNotEmpty()) cdkBuilder.trendGroupSort(_trendGroupSort)
    return cdkBuilder.build()
  }
}
