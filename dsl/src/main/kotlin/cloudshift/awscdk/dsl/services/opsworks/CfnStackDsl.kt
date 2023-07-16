@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnStack
import software.constructs.Construct

@CdkDslMarker
public class CfnStackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

  private val _cloneAppIds: MutableList<String> = mutableListOf()

  private val _elasticIps: MutableList<Any> = mutableListOf()

  private val _rdsDbInstances: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun agentVersion(agentVersion: String) {
    cdkBuilder.agentVersion(agentVersion)
  }

  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun chefConfiguration(chefConfiguration: IResolvable) {
    cdkBuilder.chefConfiguration(chefConfiguration)
  }

  public fun chefConfiguration(chefConfiguration: CfnStack.ChefConfigurationProperty) {
    cdkBuilder.chefConfiguration(chefConfiguration)
  }

  public fun cloneAppIds(vararg cloneAppIds: String) {
    _cloneAppIds.addAll(listOf(*cloneAppIds))
  }

  public fun cloneAppIds(cloneAppIds: Collection<String>) {
    _cloneAppIds.addAll(cloneAppIds)
  }

  public fun clonePermissions(clonePermissions: Boolean) {
    cdkBuilder.clonePermissions(clonePermissions)
  }

  public fun clonePermissions(clonePermissions: IResolvable) {
    cdkBuilder.clonePermissions(clonePermissions)
  }

  public fun configurationManager(configurationManager: IResolvable) {
    cdkBuilder.configurationManager(configurationManager)
  }

  public
      fun configurationManager(configurationManager: CfnStack.StackConfigurationManagerProperty) {
    cdkBuilder.configurationManager(configurationManager)
  }

  public fun customCookbooksSource(customCookbooksSource: IResolvable) {
    cdkBuilder.customCookbooksSource(customCookbooksSource)
  }

  public fun customCookbooksSource(customCookbooksSource: CfnStack.SourceProperty) {
    cdkBuilder.customCookbooksSource(customCookbooksSource)
  }

  public fun customJson(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.customJson(builder.map)
  }

  public fun customJson(customJson: Any) {
    cdkBuilder.customJson(customJson)
  }

  public fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
    cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
  }

  public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
    cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
  }

  public fun defaultOs(defaultOs: String) {
    cdkBuilder.defaultOs(defaultOs)
  }

  public fun defaultRootDeviceType(defaultRootDeviceType: String) {
    cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
  }

  public fun defaultSshKeyName(defaultSshKeyName: String) {
    cdkBuilder.defaultSshKeyName(defaultSshKeyName)
  }

  public fun defaultSubnetId(defaultSubnetId: String) {
    cdkBuilder.defaultSubnetId(defaultSubnetId)
  }

  public fun ecsClusterArn(ecsClusterArn: String) {
    cdkBuilder.ecsClusterArn(ecsClusterArn)
  }

  public fun elasticIps(vararg elasticIps: Any) {
    _elasticIps.addAll(listOf(*elasticIps))
  }

  public fun elasticIps(elasticIps: Collection<Any>) {
    _elasticIps.addAll(elasticIps)
  }

  public fun elasticIps(elasticIps: IResolvable) {
    cdkBuilder.elasticIps(elasticIps)
  }

  public fun hostnameTheme(hostnameTheme: String) {
    cdkBuilder.hostnameTheme(hostnameTheme)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun rdsDbInstances(vararg rdsDbInstances: Any) {
    _rdsDbInstances.addAll(listOf(*rdsDbInstances))
  }

  public fun rdsDbInstances(rdsDbInstances: Collection<Any>) {
    _rdsDbInstances.addAll(rdsDbInstances)
  }

  public fun rdsDbInstances(rdsDbInstances: IResolvable) {
    cdkBuilder.rdsDbInstances(rdsDbInstances)
  }

  public fun serviceRoleArn(serviceRoleArn: String) {
    cdkBuilder.serviceRoleArn(serviceRoleArn)
  }

  public fun sourceStackId(sourceStackId: String) {
    cdkBuilder.sourceStackId(sourceStackId)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun useCustomCookbooks(useCustomCookbooks: Boolean) {
    cdkBuilder.useCustomCookbooks(useCustomCookbooks)
  }

  public fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
    cdkBuilder.useCustomCookbooks(useCustomCookbooks)
  }

  public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
    cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
  }

  public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
    cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnStack {
    if(_cloneAppIds.isNotEmpty()) cdkBuilder.cloneAppIds(_cloneAppIds)
    if(_elasticIps.isNotEmpty()) cdkBuilder.elasticIps(_elasticIps)
    if(_rdsDbInstances.isNotEmpty()) cdkBuilder.rdsDbInstances(_rdsDbInstances)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
