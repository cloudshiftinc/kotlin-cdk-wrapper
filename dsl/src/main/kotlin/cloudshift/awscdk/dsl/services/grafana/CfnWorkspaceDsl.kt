@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.grafana

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.grafana.CfnWorkspace
import software.constructs.Construct

@CdkDslMarker
public class CfnWorkspaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkspace.Builder = CfnWorkspace.Builder.create(scope, id)

  private val _authenticationProviders: MutableList<String> = mutableListOf()

  private val _dataSources: MutableList<String> = mutableListOf()

  private val _notificationDestinations: MutableList<String> = mutableListOf()

  private val _organizationalUnits: MutableList<String> = mutableListOf()

  public fun accountAccessType(accountAccessType: String) {
    cdkBuilder.accountAccessType(accountAccessType)
  }

  public fun authenticationProviders(vararg authenticationProviders: String) {
    _authenticationProviders.addAll(listOf(*authenticationProviders))
  }

  public fun authenticationProviders(authenticationProviders: Collection<String>) {
    _authenticationProviders.addAll(authenticationProviders)
  }

  public fun clientToken(clientToken: String) {
    cdkBuilder.clientToken(clientToken)
  }

  public fun dataSources(vararg dataSources: String) {
    _dataSources.addAll(listOf(*dataSources))
  }

  public fun dataSources(dataSources: Collection<String>) {
    _dataSources.addAll(dataSources)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun grafanaVersion(grafanaVersion: String) {
    cdkBuilder.grafanaVersion(grafanaVersion)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun networkAccessControl(networkAccessControl: IResolvable) {
    cdkBuilder.networkAccessControl(networkAccessControl)
  }

  public fun networkAccessControl(networkAccessControl: CfnWorkspace.NetworkAccessControlProperty) {
    cdkBuilder.networkAccessControl(networkAccessControl)
  }

  public fun notificationDestinations(vararg notificationDestinations: String) {
    _notificationDestinations.addAll(listOf(*notificationDestinations))
  }

  public fun notificationDestinations(notificationDestinations: Collection<String>) {
    _notificationDestinations.addAll(notificationDestinations)
  }

  public fun organizationRoleName(organizationRoleName: String) {
    cdkBuilder.organizationRoleName(organizationRoleName)
  }

  public fun organizationalUnits(vararg organizationalUnits: String) {
    _organizationalUnits.addAll(listOf(*organizationalUnits))
  }

  public fun organizationalUnits(organizationalUnits: Collection<String>) {
    _organizationalUnits.addAll(organizationalUnits)
  }

  public fun permissionType(permissionType: String) {
    cdkBuilder.permissionType(permissionType)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun samlConfiguration(samlConfiguration: IResolvable) {
    cdkBuilder.samlConfiguration(samlConfiguration)
  }

  public fun samlConfiguration(samlConfiguration: CfnWorkspace.SamlConfigurationProperty) {
    cdkBuilder.samlConfiguration(samlConfiguration)
  }

  public fun stackSetName(stackSetName: String) {
    cdkBuilder.stackSetName(stackSetName)
  }

  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: CfnWorkspace.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnWorkspace {
    if(_authenticationProviders.isNotEmpty())
        cdkBuilder.authenticationProviders(_authenticationProviders)
    if(_dataSources.isNotEmpty()) cdkBuilder.dataSources(_dataSources)
    if(_notificationDestinations.isNotEmpty())
        cdkBuilder.notificationDestinations(_notificationDestinations)
    if(_organizationalUnits.isNotEmpty()) cdkBuilder.organizationalUnits(_organizationalUnits)
    return cdkBuilder.build()
  }
}
