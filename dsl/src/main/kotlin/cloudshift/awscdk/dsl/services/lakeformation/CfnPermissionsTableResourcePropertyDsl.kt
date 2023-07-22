@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions

/**
 * A structure for the table object.
 *
 * A table is a metadata definition that represents your data. You can Grant and Revoke table
 * privileges to a principal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .tableWildcard(TableWildcardProperty.builder().build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html)
 */
@CdkDslMarker
public class CfnPermissionsTableResourcePropertyDsl {
  private val cdkBuilder: CfnPermissions.TableResourceProperty.Builder =
      CfnPermissions.TableResourceProperty.builder()

  /**
   * @param catalogId The identifier for the Data Catalog .
   * By default, it is the account ID of the caller.
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param databaseName The name of the database for the table.
   * Unique to a Data Catalog. A database is a set of associated table definitions organized into a
   * logical group. You can Grant and Revoke database privileges to a principal.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param name The name of the table.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tableWildcard An empty object representing all tables under a database.
   * If this field is specified instead of the `Name` field, all tables under `DatabaseName` will
   * have permission changes applied.
   */
  public fun tableWildcard(tableWildcard: IResolvable) {
    cdkBuilder.tableWildcard(tableWildcard)
  }

  /**
   * @param tableWildcard An empty object representing all tables under a database.
   * If this field is specified instead of the `Name` field, all tables under `DatabaseName` will
   * have permission changes applied.
   */
  public fun tableWildcard(tableWildcard: CfnPermissions.TableWildcardProperty) {
    cdkBuilder.tableWildcard(tableWildcard)
  }

  public fun build(): CfnPermissions.TableResourceProperty = cdkBuilder.build()
}
