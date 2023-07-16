@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilledMapSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilledMapSortConfigurationProperty.Builder =
      CfnTemplate.FilledMapSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  public fun build(): CfnTemplate.FilledMapSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    return cdkBuilder.build()
  }
}
