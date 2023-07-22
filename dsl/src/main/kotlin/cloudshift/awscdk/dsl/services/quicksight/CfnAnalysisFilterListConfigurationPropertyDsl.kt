@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A list of filter configurations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterListConfigurationProperty filterListConfigurationProperty =
 * FilterListConfigurationProperty.builder()
 * .matchOperator("matchOperator")
 * // the properties below are optional
 * .categoryValues(List.of("categoryValues"))
 * .selectAllOptions("selectAllOptions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filterlistconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisFilterListConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FilterListConfigurationProperty.Builder =
      CfnAnalysis.FilterListConfigurationProperty.builder()

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

  public fun build(): CfnAnalysis.FilterListConfigurationProperty {
    if(_categoryValues.isNotEmpty()) cdkBuilder.categoryValues(_categoryValues)
    return cdkBuilder.build()
  }
}
