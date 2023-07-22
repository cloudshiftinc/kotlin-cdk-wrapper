@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPermissions
import software.amazon.awscdk.services.lakeformation.CfnPermissionsProps

@CdkDslMarker
public class CfnPermissionsPropsDsl {
  private val cdkBuilder: CfnPermissionsProps.Builder = CfnPermissionsProps.builder()

  private val _permissions: MutableList<String> = mutableListOf()

  private val _permissionsWithGrantOption: MutableList<String> = mutableListOf()

  /**
   * @param dataLakePrincipal The AWS Lake Formation principal. 
   */
  public fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
    cdkBuilder.dataLakePrincipal(dataLakePrincipal)
  }

  /**
   * @param dataLakePrincipal The AWS Lake Formation principal. 
   */
  public fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty) {
    cdkBuilder.dataLakePrincipal(dataLakePrincipal)
  }

  /**
   * @param permissions The permissions granted or revoked.
   */
  public fun permissions(vararg permissions: String) {
    _permissions.addAll(listOf(*permissions))
  }

  /**
   * @param permissions The permissions granted or revoked.
   */
  public fun permissions(permissions: Collection<String>) {
    _permissions.addAll(permissions)
  }

  /**
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted).
   */
  public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String) {
    _permissionsWithGrantOption.addAll(listOf(*permissionsWithGrantOption))
  }

  /**
   * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
   * permissions granted).
   */
  public fun permissionsWithGrantOption(permissionsWithGrantOption: Collection<String>) {
    _permissionsWithGrantOption.addAll(permissionsWithGrantOption)
  }

  /**
   * @param resource A structure for the resource. 
   */
  public fun resource(resource: IResolvable) {
    cdkBuilder.resource(resource)
  }

  /**
   * @param resource A structure for the resource. 
   */
  public fun resource(resource: CfnPermissions.ResourceProperty) {
    cdkBuilder.resource(resource)
  }

  public fun build(): CfnPermissionsProps {
    if(_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
    if(_permissionsWithGrantOption.isNotEmpty())
        cdkBuilder.permissionsWithGrantOption(_permissionsWithGrantOption)
    return cdkBuilder.build()
  }
}
