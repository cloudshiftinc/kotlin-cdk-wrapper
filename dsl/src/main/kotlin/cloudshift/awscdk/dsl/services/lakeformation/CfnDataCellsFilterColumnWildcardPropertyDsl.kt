@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter

@CdkDslMarker
public class CfnDataCellsFilterColumnWildcardPropertyDsl {
  private val cdkBuilder: CfnDataCellsFilter.ColumnWildcardProperty.Builder =
      CfnDataCellsFilter.ColumnWildcardProperty.builder()

  private val _excludedColumnNames: MutableList<String> = mutableListOf()

  /**
   * @param excludedColumnNames Excludes column names.
   * Any column with this name will be excluded.
   */
  public fun excludedColumnNames(vararg excludedColumnNames: String) {
    _excludedColumnNames.addAll(listOf(*excludedColumnNames))
  }

  /**
   * @param excludedColumnNames Excludes column names.
   * Any column with this name will be excluded.
   */
  public fun excludedColumnNames(excludedColumnNames: Collection<String>) {
    _excludedColumnNames.addAll(excludedColumnNames)
  }

  public fun build(): CfnDataCellsFilter.ColumnWildcardProperty {
    if(_excludedColumnNames.isNotEmpty()) cdkBuilder.excludedColumnNames(_excludedColumnNames)
    return cdkBuilder.build()
  }
}
