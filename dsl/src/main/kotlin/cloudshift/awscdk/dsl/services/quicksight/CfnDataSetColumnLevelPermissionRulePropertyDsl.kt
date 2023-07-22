@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A rule defined to grant access on one or more restricted columns.
 *
 * Each dataset can have multiple rules. To create a restricted column, you add it to one or more
 * rules. Each rule must contain at least one column and at least one user or group. To be able to see
 * a restricted column, a user or group needs to be added to a rule for that column.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnLevelPermissionRuleProperty columnLevelPermissionRuleProperty =
 * ColumnLevelPermissionRuleProperty.builder()
 * .columnNames(List.of("columnNames"))
 * .principals(List.of("principals"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columnlevelpermissionrule.html)
 */
@CdkDslMarker
public class CfnDataSetColumnLevelPermissionRulePropertyDsl {
  private val cdkBuilder: CfnDataSet.ColumnLevelPermissionRuleProperty.Builder =
      CfnDataSet.ColumnLevelPermissionRuleProperty.builder()

  private val _columnNames: MutableList<String> = mutableListOf()

  private val _principals: MutableList<String> = mutableListOf()

  /**
   * @param columnNames An array of column names.
   */
  public fun columnNames(vararg columnNames: String) {
    _columnNames.addAll(listOf(*columnNames))
  }

  /**
   * @param columnNames An array of column names.
   */
  public fun columnNames(columnNames: Collection<String>) {
    _columnNames.addAll(columnNames)
  }

  /**
   * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
   * groups.
   */
  public fun principals(vararg principals: String) {
    _principals.addAll(listOf(*principals))
  }

  /**
   * @param principals An array of Amazon Resource Names (ARNs) for Amazon QuickSight users or
   * groups.
   */
  public fun principals(principals: Collection<String>) {
    _principals.addAll(principals)
  }

  public fun build(): CfnDataSet.ColumnLevelPermissionRuleProperty {
    if(_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
    if(_principals.isNotEmpty()) cdkBuilder.principals(_principals)
    return cdkBuilder.build()
  }
}
