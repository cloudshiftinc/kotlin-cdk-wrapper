@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnDataCellsFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataCellsFilter.Builder = CfnDataCellsFilter.Builder.create(scope, id)

  private val _columnNames: MutableList<String> = mutableListOf()

  public fun columnNames(vararg columnNames: String) {
    _columnNames.addAll(listOf(*columnNames))
  }

  public fun columnNames(columnNames: Collection<String>) {
    _columnNames.addAll(columnNames)
  }

  public fun columnWildcard(columnWildcard: IResolvable) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  public fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rowFilter(rowFilter: IResolvable) {
    cdkBuilder.rowFilter(rowFilter)
  }

  public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty) {
    cdkBuilder.rowFilter(rowFilter)
  }

  public fun tableCatalogId(tableCatalogId: String) {
    cdkBuilder.tableCatalogId(tableCatalogId)
  }

  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnDataCellsFilter {
    if(_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
    return cdkBuilder.build()
  }
}
