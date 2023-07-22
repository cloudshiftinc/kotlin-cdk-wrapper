@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

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
 * Object tableWildcard;
 * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * // the properties below are optional
 * .name("name")
 * .tableWildcard(tableWildcard)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsTableResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.TableResourceProperty.Builder =
      CfnPrincipalPermissions.TableResourceProperty.builder()

  /**
   * @param catalogId the value to be set. 
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
   * @param tableWildcard A wildcard object representing every table under a database.
   * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
   */
  public fun tableWildcard(tableWildcard: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tableWildcard)
    cdkBuilder.tableWildcard(builder.map)
  }

  /**
   * @param tableWildcard A wildcard object representing every table under a database.
   * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
   */
  public fun tableWildcard(tableWildcard: Any) {
    cdkBuilder.tableWildcard(tableWildcard)
  }

  public fun build(): CfnPrincipalPermissions.TableResourceProperty = cdkBuilder.build()
}
