@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.constructs.Construct

/**
 * The `AWS::LakeFormation::Permissions` resource represents the permissions that a principal has on
 * an AWS Glue Data Catalog resource (such as AWS Glue database or AWS Glue tables).
 *
 * When you upload a permissions stack, the permissions are granted to the principal and when you
 * remove the stack, the permissions are revoked from the principal. If you remove a stack, and the
 * principal does not have the permissions referenced in the stack then AWS Lake Formation will throw
 * an error because you can’t call revoke on non-existing permissions. To successfully remove the
 * stack, you’ll need to regrant those permissions and then remove the stack.
 *
 *
 * New versions of AWS Lake Formation permission resources are now available. For more information,
 * see:
 * [AWS:LakeFormation::PrincipalPermissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CfnPermissions cfnPermissions = CfnPermissions.Builder.create(this, "MyCfnPermissions")
 * .dataLakePrincipal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .resource(ResourceProperty.builder()
 * .databaseResource(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .dataLocationResource(DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .s3Resource("s3Resource")
 * .build())
 * .tableResource(TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .tableWildcard(TableWildcardProperty.builder().build())
 * .build())
 * .tableWithColumnsResource(TableWithColumnsResourceProperty.builder()
 * .catalogId("catalogId")
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .build())
 * // the properties below are optional
 * .permissions(List.of("permissions"))
 * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html)
 */
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
