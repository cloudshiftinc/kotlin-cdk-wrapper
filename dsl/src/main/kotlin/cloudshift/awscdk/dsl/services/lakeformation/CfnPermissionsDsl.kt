@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.constructs.Construct

@CdkDslMarker
public class CfnPermissionsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPermissions.Builder = CfnPermissions.Builder.create(scope, id)

  private val _permissions: MutableList<String> = mutableListOf()

  private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

  /**
   * The AWS Lake Formation principal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
   * @param dataLakePrincipal The AWS Lake Formation principal. 
   */
  public fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
    cdkBuilder.dataLakePrincipal(dataLakePrincipal)
  }

  /**
   * The AWS Lake Formation principal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
   * @param dataLakePrincipal The AWS Lake Formation principal. 
   */
  public fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty) {
    cdkBuilder.dataLakePrincipal(dataLakePrincipal)
  }

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
   * @param permissions The permissions granted or revoked. 
   */
  public fun permissions(vararg permissions: String) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
   * @param permissions The permissions granted or revoked. 
   */
  public fun permissions(permissions: Collection<String>) {
    _permissions.addAll(permissions)
  }

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted). 
   */
  public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String) {
    _permissionsWithGrantOption.addAll(listOf(*permissionsWithGrantOption))
  }

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted). 
   */
  public fun permissionsWithGrantOption(permissionsWithGrantOption: Collection<String>) {
    _permissionsWithGrantOption.addAll(permissionsWithGrantOption)
  }

  /**
   * A structure for the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
   * @param resource A structure for the resource. 
   */
  public fun resource(resource: IResolvable) {
    cdkBuilder.resource(resource)
  }

  /**
   * A structure for the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
   * @param resource A structure for the resource. 
   */
  public fun resource(resource: CfnPermissions.ResourceProperty) {
    cdkBuilder.resource(resource)
  }

  public fun build(): CfnPermissions {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_permissionsWithGrantOption.isNotEmpty())
        cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
    return cdkBuilder.build()
  }
}
