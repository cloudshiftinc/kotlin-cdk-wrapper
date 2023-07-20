@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dax.CfnCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun clusterEndpointEncryptionType(clusterEndpointEncryptionType: String) {
    cdkBuilder.clusterEndpointEncryptionType(clusterEndpointEncryptionType)
  }

  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun iamRoleArn(iamRoleArn: String) {
    cdkBuilder.iamRoleArn(iamRoleArn)
  }

  public fun nodeType(nodeType: String) {
    cdkBuilder.nodeType(nodeType)
  }

  public fun notificationTopicArn(notificationTopicArn: String) {
    cdkBuilder.notificationTopicArn(notificationTopicArn)
  }

  public fun parameterGroupName(parameterGroupName: String) {
    cdkBuilder.parameterGroupName(parameterGroupName)
  }

  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  public fun replicationFactor(replicationFactor: Number) {
    cdkBuilder.replicationFactor(replicationFactor)
  }

  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  public fun sseSpecification(sseSpecification: IResolvable) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  public fun sseSpecification(sseSpecification: CfnCluster.SSESpecificationProperty) {
    cdkBuilder.sseSpecification(sseSpecification)
  }

  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  public fun tags(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.tags(builder.map)
  }

  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnCluster {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    return cdkBuilder.build()
  }
}
