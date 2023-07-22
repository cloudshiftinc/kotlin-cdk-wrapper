@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDataSet

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
