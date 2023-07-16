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

  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  public fun columnNames(vararg columnNames: String) {
    _columnNames.addAll(listOf(*columnNames))
  }

  public fun columnNames(columnNames: Collection<String>) {
    _columnNames.addAll(columnNames)
  }

  public fun columnWildcard(columnWildcard: IResolvable) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  public fun columnWildcard(columnWildcard: CfnPrincipalPermissions.ColumnWildcardProperty) {
    cdkBuilder.columnWildcard(columnWildcard)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPrincipalPermissions.TableWithColumnsResourceProperty {
    if(_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
    return cdkBuilder.build()
  }
}
