@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions
import software.constructs.Construct

@CdkDslMarker
public class CfnPrincipalPermissionsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPrincipalPermissions.Builder =
      CfnPrincipalPermissions.Builder.create(scope, id)

  private val _permissions: MutableList<String> = mutableListOf()

  private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

  /**
   * The identifier for the Data Catalog .
   *
   * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
   * database definitions, table definitions, and other control information to manage your Lake
   * Formation environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
   * @param catalog The identifier for the Data Catalog . 
   */
  public fun catalog(catalog: String) {
    cdkBuilder.catalog(catalog)
  }

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
   * @param permissions The permissions granted or revoked. 
   */
  public fun permissions(vararg permissions: String) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
   * @param permissions The permissions granted or revoked. 
   */
  public fun permissions(permissions: Collection<String>) {
    _permissions.addAll(permissions)
  }

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted). 
   */
  public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String) {
    _permissionsWithGrantOption.addAll(listOf(*permissionsWithGrantOption))
  }

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted). 
   */
  public fun permissionsWithGrantOption(permissionsWithGrantOption: Collection<String>) {
    _permissionsWithGrantOption.addAll(permissionsWithGrantOption)
  }

  /**
   * The principal to be granted a permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
   * @param principal The principal to be granted a permission. 
   */
  public fun principal(principal: IResolvable) {
    cdkBuilder.principal(principal)
  }

  /**
   * The principal to be granted a permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
   * @param principal The principal to be granted a permission. 
   */
  public fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty) {
    cdkBuilder.principal(principal)
  }

  /**
   * The resource to be granted or revoked permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
   * @param resource The resource to be granted or revoked permissions. 
   */
  public fun resource(resource: IResolvable) {
    cdkBuilder.resource(resource)
  }

  /**
   * The resource to be granted or revoked permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
   * @param resource The resource to be granted or revoked permissions. 
   */
  public fun resource(resource: CfnPrincipalPermissions.ResourceProperty) {
    cdkBuilder.resource(resource)
  }

  public fun build(): CfnPrincipalPermissions {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_permissionsWithGrantOption.isNotEmpty())
        cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
    return cdkBuilder.build()
  }
}
