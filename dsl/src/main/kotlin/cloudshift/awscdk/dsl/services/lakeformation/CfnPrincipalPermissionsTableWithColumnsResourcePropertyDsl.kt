@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

@CdkDslMarker
public class CfnPrincipalPermissionsTableWithColumnsResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.TableWithColumnsResourceProperty.Builder =
      CfnPrincipalPermissions.TableWithColumnsResourceProperty.builder()

  private val _columnNames: MutableList<String> = mutableListOf()

  /**
   * @param catalogId The identifier for the Data Catalog where the location is registered with AWS
   * Lake Formation . 
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param columnNames The list of column names for the table.
   * At least one of `ColumnNames` or `ColumnWildcard` is required.
   */
  public fun columnNames(vararg columnNames: String) {
    _columnNames.addAll(listOf(*columnNames))
  }

  /**
   * @param columnNames The list of column names for the table.
   * At least one of `ColumnNames` or `ColumnWildcard` is required.
   */
  public fun columnNames(columnNames: Collection<String>) {
    _columnNames.addAll(columnNames)
  }

  /**
   * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
   * At least one of `ColumnNames` or `ColumnWildcard` is required.
   */
  public fun columnWildcard(columnWildcard: IResolvable) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  /**
   * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
   * At least one of `ColumnNames` or `ColumnWildcard` is required.
   */
  public fun columnWildcard(columnWildcard: CfnPrincipalPermissions.ColumnWildcardProperty) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  /**
   * @param databaseName The name of the database for the table with columns resource. 
   * Unique to the Data Catalog. A database is a set of associated table definitions organized into
   * a logical group. You can Grant and Revoke database privileges to a principal.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param name The name of the table resource. 
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPrincipalPermissions.TableWithColumnsResourceProperty {
    if(_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
    return cdkBuilder.build()
  }
}
