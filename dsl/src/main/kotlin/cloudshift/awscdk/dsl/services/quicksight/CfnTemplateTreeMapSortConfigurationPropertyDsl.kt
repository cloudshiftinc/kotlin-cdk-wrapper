@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTreeMapSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.TreeMapSortConfigurationProperty.Builder =
      CfnTemplate.TreeMapSortConfigurationProperty.builder()

  private val _treeMapSort: MutableList<Any> = mutableListOf()

  /**
   * @param treeMapGroupItemsLimitConfiguration The limit on the number of groups that are
   * displayed.
   */
  public fun treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration: IResolvable) {
    cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
  }

  /**
   * @param treeMapGroupItemsLimitConfiguration The limit on the number of groups that are
   * displayed.
   */
  public
      fun treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.treeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration)
  }

  /**
   * @param treeMapSort The sort configuration of group by fields.
   */
  public fun treeMapSort(vararg treeMapSort: Any) {
    _treeMapSort.addAll(listOf(*treeMapSort))
  }

  /**
   * @param treeMapSort The sort configuration of group by fields.
   */
  public fun treeMapSort(treeMapSort: Collection<Any>) {
    _treeMapSort.addAll(treeMapSort)
  }

  /**
   * @param treeMapSort The sort configuration of group by fields.
   */
  public fun treeMapSort(treeMapSort: IResolvable) {
    cdkBuilder.treeMapSort(treeMapSort)
  }

  public fun build(): CfnTemplate.TreeMapSortConfigurationProperty {
    if(_treeMapSort.isNotEmpty()) cdkBuilder.treeMapSort(_treeMapSort)
    return cdkBuilder.build()
  }
}
