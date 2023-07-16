@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFilledMapSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilledMapSortConfigurationProperty.Builder =
      CfnAnalysis.FilledMapSortConfigurationProperty.builder()

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

  public fun build(): CfnAnalysis.FilledMapSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    return cdkBuilder.build()
  }
}
