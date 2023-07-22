@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions

@CdkDslMarker
public class CfnPermissionsResourcePropertyDsl {
  private val cdkBuilder: CfnPermissions.ResourceProperty.Builder =
      CfnPermissions.ResourceProperty.builder()

  /**
   * @param dataLocationResource A structure for a data location object where permissions are
   * granted or revoked.
   */
  public fun dataLocationResource(dataLocationResource: IResolvable) {
    cdkBuilder.dataLocationResource(dataLocationResource)
  }

  /**
   * @param dataLocationResource A structure for a data location object where permissions are
   * granted or revoked.
   */
  public
      fun dataLocationResource(dataLocationResource: CfnPermissions.DataLocationResourceProperty) {
    cdkBuilder.dataLocationResource(dataLocationResource)
  }

  /**
   * @param databaseResource A structure for the database object.
   */
  public fun databaseResource(databaseResource: IResolvable) {
    cdkBuilder.databaseResource(databaseResource)
  }

  /**
   * @param databaseResource A structure for the database object.
   */
  public fun databaseResource(databaseResource: CfnPermissions.DatabaseResourceProperty) {
    cdkBuilder.databaseResource(databaseResource)
  }

  /**
   * @param tableResource A structure for the table object.
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   */
  public fun tableResource(tableResource: IResolvable) {
    cdkBuilder.tableResource(tableResource)
  }

  /**
   * @param tableResource A structure for the table object.
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   */
  public fun tableResource(tableResource: CfnPermissions.TableResourceProperty) {
    cdkBuilder.tableResource(tableResource)
  }

  /**
   * @param tableWithColumnsResource A structure for a table with columns object.
   * This object is only used when granting a SELECT permission.
   */
  public fun tableWithColumnsResource(tableWithColumnsResource: IResolvable) {
    cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
  }

  /**
   * @param tableWithColumnsResource A structure for a table with columns object.
   * This object is only used when granting a SELECT permission.
   */
  public
      fun tableWithColumnsResource(tableWithColumnsResource: CfnPermissions.TableWithColumnsResourceProperty) {
    cdkBuilder.tableWithColumnsResource(tableWithColumnsResource)
  }

  public fun build(): CfnPermissions.ResourceProperty = cdkBuilder.build()
}
