@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSankeyDiagramSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.SankeyDiagramSortConfigurationProperty.Builder =
      CfnTemplate.SankeyDiagramSortConfigurationProperty.builder()

  private val _weightSort: MutableList<Any> = mutableListOf()

  /**
   * @param destinationItemsLimit The limit on the number of destination nodes that are displayed in
   * a sankey diagram.
   */
  public fun destinationItemsLimit(destinationItemsLimit: IResolvable) {
    cdkBuilder.destinationItemsLimit(destinationItemsLimit)
  }

  /**
   * @param destinationItemsLimit The limit on the number of destination nodes that are displayed in
   * a sankey diagram.
   */
  public
      fun destinationItemsLimit(destinationItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.destinationItemsLimit(destinationItemsLimit)
  }

  /**
   * @param sourceItemsLimit The limit on the number of source nodes that are displayed in a sankey
   * diagram.
   */
  public fun sourceItemsLimit(sourceItemsLimit: IResolvable) {
    cdkBuilder.sourceItemsLimit(sourceItemsLimit)
  }

  /**
   * @param sourceItemsLimit The limit on the number of source nodes that are displayed in a sankey
   * diagram.
   */
  public fun sourceItemsLimit(sourceItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.sourceItemsLimit(sourceItemsLimit)
  }

  /**
   * @param weightSort The sort configuration of the weight fields.
   */
  public fun weightSort(vararg weightSort: Any) {
    _weightSort.addAll(listOf(*weightSort))
  }

  /**
   * @param weightSort The sort configuration of the weight fields.
   */
  public fun weightSort(weightSort: Collection<Any>) {
    _weightSort.addAll(weightSort)
  }

  /**
   * @param weightSort The sort configuration of the weight fields.
   */
  public fun weightSort(weightSort: IResolvable) {
    cdkBuilder.weightSort(weightSort)
  }

  public fun build(): CfnTemplate.SankeyDiagramSortConfigurationProperty {
    if(_weightSort.isNotEmpty()) cdkBuilder.weightSort(_weightSort)
    return cdkBuilder.build()
  }
}
