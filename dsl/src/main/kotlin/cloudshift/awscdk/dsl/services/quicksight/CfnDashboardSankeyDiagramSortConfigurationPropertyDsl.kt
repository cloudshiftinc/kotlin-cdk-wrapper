@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSankeyDiagramSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SankeyDiagramSortConfigurationProperty.Builder =
      CfnDashboard.SankeyDiagramSortConfigurationProperty.builder()

  private val _weightSort: MutableList<Any> = mutableListOf()

  public fun destinationItemsLimit(destinationItemsLimit: IResolvable) {
    cdkBuilder.destinationItemsLimit(destinationItemsLimit)
  }

  public
      fun destinationItemsLimit(destinationItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.destinationItemsLimit(destinationItemsLimit)
  }

  public fun sourceItemsLimit(sourceItemsLimit: IResolvable) {
    cdkBuilder.sourceItemsLimit(sourceItemsLimit)
  }

  public fun sourceItemsLimit(sourceItemsLimit: CfnDashboard.ItemsLimitConfigurationProperty) {
    cdkBuilder.sourceItemsLimit(sourceItemsLimit)
  }

  public fun weightSort(vararg weightSort: Any) {
    _weightSort.addAll(listOf(*weightSort))
  }

  public fun weightSort(weightSort: Collection<Any>) {
    _weightSort.addAll(weightSort)
  }

  public fun weightSort(weightSort: IResolvable) {
    cdkBuilder.weightSort(weightSort)
  }

  public fun build(): CfnDashboard.SankeyDiagramSortConfigurationProperty {
    if(_weightSort.isNotEmpty()) cdkBuilder.weightSort(_weightSort)
    return cdkBuilder.build()
  }
}
