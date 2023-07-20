@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.amazon.awscdk.services.rds.CfnDBProxyProps

@CdkDslMarker
public class CfnDBProxyPropsDsl {
  private val cdkBuilder: CfnDBProxyProps.Builder = CfnDBProxyProps.builder()

  private val _auth: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnDBProxy.TagFormatProperty> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  private val _vpcSubnetIds: MutableList<String> = mutableListOf()

  public fun auth(vararg auth: Any) {
    _auth.addAll(listOf(*auth))
  }

  public fun auth(auth: Collection<Any>) {
    _auth.addAll(auth)
  }

  public fun auth(auth: IResolvable) {
    cdkBuilder.auth(auth)
  }

  public fun dbProxyName(dbProxyName: String) {
    cdkBuilder.dbProxyName(dbProxyName)
  }

  public fun debugLogging(debugLogging: Boolean) {
    cdkBuilder.debugLogging(debugLogging)
  }

  public fun debugLogging(debugLogging: IResolvable) {
    cdkBuilder.debugLogging(debugLogging)
  }

  public fun engineFamily(engineFamily: String) {
    cdkBuilder.engineFamily(engineFamily)
  }

  public fun idleClientTimeout(idleClientTimeout: Number) {
    cdkBuilder.idleClientTimeout(idleClientTimeout)
  }

  public fun requireTls(requireTls: Boolean) {
    cdkBuilder.requireTls(requireTls)
  }

  public fun requireTls(requireTls: IResolvable) {
    cdkBuilder.requireTls(requireTls)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun tags(tags: CfnDBProxyTagFormatPropertyDsl.() -> Unit) {
    _tags.add(CfnDBProxyTagFormatPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnDBProxy.TagFormatProperty>) {
    _tags.addAll(tags)
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

  public fun build(): CfnDBProxyProps {
    if(_auth.isNotEmpty()) cdkBuilder.auth(_auth)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    if(_vpcSubnetIds.isNotEmpty()) cdkBuilder.vpcSubnetIds(_vpcSubnetIds)
    return cdkBuilder.build()
  }
}
