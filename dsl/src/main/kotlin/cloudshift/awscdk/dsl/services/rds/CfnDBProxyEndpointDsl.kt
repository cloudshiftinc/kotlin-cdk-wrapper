@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.constructs.Construct

@CdkDslMarker
public class CfnDBProxyEndpointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDBProxyEndpoint.Builder = CfnDBProxyEndpoint.Builder.create(scope, id)

  private val _tags: MutableList<CfnDBProxyEndpoint.TagFormatProperty> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  private val _vpcSubnetIds: MutableList<String> = mutableListOf()

  public fun dbProxyEndpointName(dbProxyEndpointName: String) {
    cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
  }

  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  public fun tags(tags: CfnDBProxyEndpointTagFormatPropertyDsl.() -> Unit) {
    _tags.add(CfnDBProxyEndpointTagFormatPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnDBProxyEndpoint.TagFormatProperty>) {
    _tags.addAll(tags)
  }

  public fun targetRole(targetRole: String) {
    cdkBuilder.targetRole(targetRole)
  }

  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun vpcSubnetIds(vararg vpcSubnetIds: String) {
    _vpcSubnetIds.addAll(listOf(*vpcSubnetIds))
  }

  public fun vpcSubnetIds(vpcSubnetIds: Collection<String>) {
    _vpcSubnetIds.addAll(vpcSubnetIds)
  }

  public fun build(): CfnDBProxyEndpoint {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    if(_vpcSubnetIds.isNotEmpty()) cdkBuilder.vpcSubnetIds(_vpcSubnetIds)
    return cdkBuilder.build()
  }
}
