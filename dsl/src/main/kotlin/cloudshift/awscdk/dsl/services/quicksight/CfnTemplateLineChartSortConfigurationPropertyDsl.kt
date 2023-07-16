@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLineChartSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.LineChartSortConfigurationProperty.Builder =
      CfnTemplate.LineChartSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  private val _smallMultiplesSort: MutableList<Any> = mutableListOf()

  public fun categoryItemsLimitConfiguration(categoryItemsLimitConfiguration: IResolvable) {
    cdkBuilder.categoryItemsLimitConfiguration(categoryItemsLimitConfiguration)
  }

  public
      fun categoryItemsLimitConfiguration(categoryItemsLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.categoryItemsLimitConfiguration(categoryItemsLimitConfiguration)
  }

  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  public fun colorItemsLimitConfiguration(colorItemsLimitConfiguration: IResolvable) {
    cdkBuilder.colorItemsLimitConfiguration(colorItemsLimitConfiguration)
  }

  public
      fun colorItemsLimitConfiguration(colorItemsLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.colorItemsLimitConfiguration(colorItemsLimitConfiguration)
  }

  public fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: IResolvable) {
    cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
  }

  public
      fun smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.smallMultiplesLimitConfiguration(smallMultiplesLimitConfiguration)
  }

  public fun smallMultiplesSort(vararg smallMultiplesSort: Any) {
    _smallMultiplesSort.addAll(listOf(*smallMultiplesSort))
  }

  public fun smallMultiplesSort(smallMultiplesSort: Collection<Any>) {
    _smallMultiplesSort.addAll(smallMultiplesSort)
  }

  public fun smallMultiplesSort(smallMultiplesSort: IResolvable) {
    cdkBuilder.smallMultiplesSort(smallMultiplesSort)
  }

  public fun build(): CfnTemplate.LineChartSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    if(_smallMultiplesSort.isNotEmpty()) cdkBuilder.smallMultiplesSort(_smallMultiplesSort)
    return cdkBuilder.build()
  }
}
