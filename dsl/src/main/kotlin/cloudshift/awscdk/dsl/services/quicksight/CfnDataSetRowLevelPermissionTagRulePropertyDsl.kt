@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

@CdkDslMarker
public class CfnDataSetRowLevelPermissionTagRulePropertyDsl {
  private val cdkBuilder: CfnDataSet.RowLevelPermissionTagRuleProperty.Builder =
      CfnDataSet.RowLevelPermissionTagRuleProperty.builder()

  /**
   * @param columnName The column name that a tag key is assigned to.</p>. 
   */
  public fun columnName(columnName: String) {
    cdkBuilder.columnName(columnName)
  }

  /**
   * @param matchAllValue A string that you want to use to filter by all the values in a column in
   * the dataset and don’t want to list the values one by one.
   * For example, you can use an asterisk as your match all value.</p>
   */
  public fun matchAllValue(matchAllValue: String) {
    cdkBuilder.matchAllValue(matchAllValue)
  }

  /**
   * @param tagKey The unique key for a tag.</p>. 
   */
  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  /**
   * @param tagMultiValueDelimiter A string that you want to use to delimit the values when you pass
   * the values at run time.
   * For example, you can delimit the values with a comma.</p>
   */
  public fun tagMultiValueDelimiter(tagMultiValueDelimiter: String) {
    cdkBuilder.tagMultiValueDelimiter(tagMultiValueDelimiter)
  }

  public fun build(): CfnDataSet.RowLevelPermissionTagRuleProperty = cdkBuilder.build()
}
