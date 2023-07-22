@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterListConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterListConfigurationProperty.Builder =
      CfnTemplate.FilterListConfigurationProperty.builder()

  private val _categoryValues: MutableList<String> = mutableListOf()

  /**
   * @param categoryValues The list of category values for the filter.
   */
  public fun categoryValues(vararg categoryValues: String) {
    _categoryValues.addAll(listOf(*categoryValues))
  }

  /**
   * @param categoryValues The list of category values for the filter.
   */
  public fun categoryValues(categoryValues: Collection<String>) {
    _categoryValues.addAll(categoryValues)
  }

  /**
   * @param matchOperator The match operator that is used to determine if a filter should be
   * applied. 
   */
  public fun matchOperator(matchOperator: String) {
    cdkBuilder.matchOperator(matchOperator)
  }

  /**
   * @param selectAllOptions Select all of the values. Null is not the assigned value of select all.
   * * `FILTER_ALL_VALUES`
   */
  public fun selectAllOptions(selectAllOptions: String) {
    cdkBuilder.selectAllOptions(selectAllOptions)
  }

  public fun build(): CfnTemplate.FilterListConfigurationProperty {
    if(_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
    return cdkBuilder.build()
  }
}
