@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnCluster
import software.amazon.awscdk.services.redshift.CfnClusterProps

@CdkDslMarker
public class CfnClusterPropsDsl {
  private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

  private val _clusterSecurityGroups: MutableList<String> = mutableListOf()

  private val _iamRoles: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  public fun allowVersionUpgrade(allowVersionUpgrade: Boolean) {
    cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
  }

  public fun allowVersionUpgrade(allowVersionUpgrade: IResolvable) {
    cdkBuilder.allowVersionUpgrade(allowVersionUpgrade)
  }

  public fun aquaConfigurationStatus(aquaConfigurationStatus: String) {
    cdkBuilder.aquaConfigurationStatus(aquaConfigurationStatus)
  }

  public fun automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod: Number) {
    cdkBuilder.automatedSnapshotRetentionPeriod(automatedSnapshotRetentionPeriod)
  }

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun availabilityZoneRelocation(availabilityZoneRelocation: Boolean) {
    cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
  }

  public fun availabilityZoneRelocation(availabilityZoneRelocation: IResolvable) {
    cdkBuilder.availabilityZoneRelocation(availabilityZoneRelocation)
  }

  public fun availabilityZoneRelocationStatus(availabilityZoneRelocationStatus: String) {
    cdkBuilder.availabilityZoneRelocationStatus(availabilityZoneRelocationStatus)
  }

  public fun classic(classic: Boolean) {
    cdkBuilder.classic(classic)
  }

  public fun classic(classic: IResolvable) {
    cdkBuilder.classic(classic)
  }

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun clusterParameterGroupName(clusterParameterGroupName: String) {
    cdkBuilder.clusterParameterGroupName(clusterParameterGroupName)
  }

  public fun clusterSecurityGroups(vararg clusterSecurityGroups: String) {
    _clusterSecurityGroups.addAll(listOf(*clusterSecurityGroups))
  }

  public fun clusterSecurityGroups(clusterSecurityGroups: Collection<String>) {
    _clusterSecurityGroups.addAll(clusterSecurityGroups)
  }

  public fun clusterSubnetGroupName(clusterSubnetGroupName: String) {
    cdkBuilder.clusterSubnetGroupName(clusterSubnetGroupName)
  }

  public fun clusterType(clusterType: String) {
    cdkBuilder.clusterType(clusterType)
  }

  public fun clusterVersion(clusterVersion: String) {
    cdkBuilder.clusterVersion(clusterVersion)
  }

  public fun dbName(dbName: String) {
    cdkBuilder.dbName(dbName)
  }

  public fun deferMaintenance(deferMaintenance: Boolean) {
    cdkBuilder.deferMaintenance(deferMaintenance)
  }

  public fun deferMaintenance(deferMaintenance: IResolvable) {
    cdkBuilder.deferMaintenance(deferMaintenance)
  }

  public fun deferMaintenanceDuration(deferMaintenanceDuration: Number) {
    cdkBuilder.deferMaintenanceDuration(deferMaintenanceDuration)
  }

  public fun deferMaintenanceEndTime(deferMaintenanceEndTime: String) {
    cdkBuilder.deferMaintenanceEndTime(deferMaintenanceEndTime)
  }

  public fun deferMaintenanceStartTime(deferMaintenanceStartTime: String) {
    cdkBuilder.deferMaintenanceStartTime(deferMaintenanceStartTime)
  }

  public fun destinationRegion(destinationRegion: String) {
    cdkBuilder.destinationRegion(destinationRegion)
  }

  public fun elasticIp(elasticIp: String) {
    cdkBuilder.elasticIp(elasticIp)
  }

  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun encrypted(encrypted: IResolvable) {
    cdkBuilder.encrypted(encrypted)
  }

  public fun endpoint(endpoint: IResolvable) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun endpoint(endpoint: CfnCluster.EndpointProperty) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  public fun hsmClientCertificateIdentifier(hsmClientCertificateIdentifier: String) {
    cdkBuilder.hsmClientCertificateIdentifier(hsmClientCertificateIdentifier)
  }

  public fun hsmConfigurationIdentifier(hsmConfigurationIdentifier: String) {
    cdkBuilder.hsmConfigurationIdentifier(hsmConfigurationIdentifier)
  }

  public fun iamRoles(vararg iamRoles: String) {
    _iamRoles.addAll(listOf(*iamRoles))
  }

  public fun iamRoles(iamRoles: Collection<String>) {
    _iamRoles.addAll(iamRoles)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun loggingProperties(loggingProperties: IResolvable) {
    cdkBuilder.loggingProperties(loggingProperties)
  }

  public fun loggingProperties(loggingProperties: CfnCluster.LoggingPropertiesProperty) {
    cdkBuilder.loggingProperties(loggingProperties)
  }

  public fun maintenanceTrackName(maintenanceTrackName: String) {
    cdkBuilder.maintenanceTrackName(maintenanceTrackName)
  }

  public fun manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod: Number) {
    cdkBuilder.manualSnapshotRetentionPeriod(manualSnapshotRetentionPeriod)
  }

  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
  }

  public fun nodeType(nodeType: String) {
    cdkBuilder.nodeType(nodeType)
  }

  public fun numberOfNodes(numberOfNodes: Number) {
    cdkBuilder.numberOfNodes(numberOfNodes)
  }

  public fun ownerAccount(ownerAccount: String) {
    cdkBuilder.ownerAccount(ownerAccount)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  public fun resourceAction(resourceAction: String) {
    cdkBuilder.resourceAction(resourceAction)
  }

  public fun revisionTarget(revisionTarget: String) {
    cdkBuilder.revisionTarget(revisionTarget)
  }

  public fun rotateEncryptionKey(rotateEncryptionKey: Boolean) {
    cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
  }

  public fun rotateEncryptionKey(rotateEncryptionKey: IResolvable) {
    cdkBuilder.rotateEncryptionKey(rotateEncryptionKey)
  }

  public fun snapshotClusterIdentifier(snapshotClusterIdentifier: String) {
    cdkBuilder.snapshotClusterIdentifier(snapshotClusterIdentifier)
  }

  public fun snapshotCopyGrantName(snapshotCopyGrantName: String) {
    cdkBuilder.snapshotCopyGrantName(snapshotCopyGrantName)
  }

  public fun snapshotCopyManual(snapshotCopyManual: Boolean) {
    cdkBuilder.snapshotCopyManual(snapshotCopyManual)
  }

  public fun snapshotCopyManual(snapshotCopyManual: IResolvable) {
    cdkBuilder.snapshotCopyManual(snapshotCopyManual)
  }

  public fun snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod: Number) {
    cdkBuilder.snapshotCopyRetentionPeriod(snapshotCopyRetentionPeriod)
  }

  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnClusterProps {
    if(_clusterSecurityGroups.isNotEmpty()) cdkBuilder.clusterSecurityGroups(_clusterSecurityGroups)
    if(_iamRoles.isNotEmpty()) cdkBuilder.iamRoles(_iamRoles)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
