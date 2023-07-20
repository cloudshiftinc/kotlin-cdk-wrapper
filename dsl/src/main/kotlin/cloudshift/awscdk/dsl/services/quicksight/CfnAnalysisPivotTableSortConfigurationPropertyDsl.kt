@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableSortConfigurationProperty.Builder =
      CfnAnalysis.PivotTableSortConfigurationProperty.builder()

  private val _fieldSortOptions: MutableList<Any> = mutableListOf()

  public fun fieldSortOptions(vararg fieldSortOptions: Any) {
    _fieldSortOptions.addAll(listOf(*fieldSortOptions))
  }

  public fun fieldSortOptions(fieldSortOptions: Collection<Any>) {
    _fieldSortOptions.addAll(fieldSortOptions)
  }

  public fun fieldSortOptions(fieldSortOptions: IResolvable) {
    cdkBuilder.fieldSortOptions(fieldSortOptions)
  }

  public fun build(): CfnAnalysis.PivotTableSortConfigurationProperty {
    if(_fieldSortOptions.isNotEmpty()) cdkBuilder.fieldSortOptions(_fieldSortOptions)
    return cdkBuilder.build()
  }
}
