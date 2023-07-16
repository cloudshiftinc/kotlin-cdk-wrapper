@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps

@CdkDslMarker
public class CfnCacheClusterPropsDsl {
  private val cdkBuilder: CfnCacheClusterProps.Builder = CfnCacheClusterProps.builder()

  private val _cacheSecurityGroupNames: MutableList<String> = mutableListOf()

  private val _logDeliveryConfigurations: MutableList<Any> = mutableListOf()

  private val _preferredAvailabilityZones: MutableList<String> = mutableListOf()

  private val _snapshotArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun azMode(azMode: String) {
    cdkBuilder.azMode(azMode)
  }

  public fun cacheNodeType(cacheNodeType: String) {
    cdkBuilder.cacheNodeType(cacheNodeType)
  }

  public fun cacheParameterGroupName(cacheParameterGroupName: String) {
    cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
  }

  public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String) {
    _cacheSecurityGroupNames.addAll(listOf(*cacheSecurityGroupNames))
  }

  public fun cacheSecurityGroupNames(cacheSecurityGroupNames: Collection<String>) {
    _cacheSecurityGroupNames.addAll(cacheSecurityGroupNames)
  }

  public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
    cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
  }

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun ipDiscovery(ipDiscovery: String) {
    cdkBuilder.ipDiscovery(ipDiscovery)
  }

  public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any) {
    _logDeliveryConfigurations.addAll(listOf(*logDeliveryConfigurations))
  }

  public fun logDeliveryConfigurations(logDeliveryConfigurations: Collection<Any>) {
    _logDeliveryConfigurations.addAll(logDeliveryConfigurations)
  }

  public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
    cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
  }

  public fun networkType(networkType: String) {
    cdkBuilder.networkType(networkType)
  }

  public fun notificationTopicArn(notificationTopicArn: String) {
    cdkBuilder.notificationTopicArn(notificationTopicArn)
  }

  public fun numCacheNodes(numCacheNodes: Number) {
    cdkBuilder.numCacheNodes(numCacheNodes)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun preferredAvailabilityZone(preferredAvailabilityZone: String) {
    cdkBuilder.preferredAvailabilityZone(preferredAvailabilityZone)
  }

  public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String) {
    _preferredAvailabilityZones.addAll(listOf(*preferredAvailabilityZones))
  }

  public fun preferredAvailabilityZones(preferredAvailabilityZones: Collection<String>) {
    _preferredAvailabilityZones.addAll(preferredAvailabilityZones)
  }

  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  public fun snapshotArns(vararg snapshotArns: String) {
    _snapshotArns.addAll(listOf(*snapshotArns))
  }

  public fun snapshotArns(snapshotArns: Collection<String>) {
    _snapshotArns.addAll(snapshotArns)
  }

  public fun snapshotName(snapshotName: String) {
    cdkBuilder.snapshotName(snapshotName)
  }

  public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
    cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
  }

  public fun snapshotWindow(snapshotWindow: String) {
    cdkBuilder.snapshotWindow(snapshotWindow)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnCacheClusterProps {
    if(_cacheSecurityGroupNames.isNotEmpty())
        cdkBuilder.cacheSecurityGroupNames(_cacheSecurityGroupNames)
    if(_logDeliveryConfigurations.isNotEmpty())
        cdkBuilder.logDeliveryConfigurations(_logDeliveryConfigurations)
    if(_preferredAvailabilityZones.isNotEmpty())
        cdkBuilder.preferredAvailabilityZones(_preferredAvailabilityZones)
    if(_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
