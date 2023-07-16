@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

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
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterProps

@CdkDslMarker
public class CfnDBClusterPropsDsl {
  private val cdkBuilder: CfnDBClusterProps.Builder = CfnDBClusterProps.builder()

  private val _associatedRoles: MutableList<Any> = mutableListOf()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  public fun allocatedStorage(allocatedStorage: Number) {
    cdkBuilder.allocatedStorage(allocatedStorage)
  }

  public fun associatedRoles(vararg associatedRoles: Any) {
    _associatedRoles.addAll(listOf(*associatedRoles))
  }

  public fun associatedRoles(associatedRoles: Collection<Any>) {
    _associatedRoles.addAll(associatedRoles)
  }

  public fun associatedRoles(associatedRoles: IResolvable) {
    cdkBuilder.associatedRoles(associatedRoles)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun backtrackWindow(backtrackWindow: Number) {
    cdkBuilder.backtrackWindow(backtrackWindow)
  }

  public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
  }

  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  public fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
    cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
  }

  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
  }

  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  public fun dbSystemId(dbSystemId: String) {
    cdkBuilder.dbSystemId(dbSystemId)
  }

  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun domain(domain: String) {
    cdkBuilder.domain(domain)
  }

  public fun domainIamRoleName(domainIamRoleName: String) {
    cdkBuilder.domainIamRoleName(domainIamRoleName)
  }

  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  public fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
    cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
  }

  public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
    cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
  }

  public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
    cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
  }

  public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
    cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
  }

  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  public fun engineMode(engineMode: String) {
    cdkBuilder.engineMode(engineMode)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun globalClusterIdentifier(globalClusterIdentifier: String) {
    cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
  }

  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
    cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
  }

  public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
    cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
  }

  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun masterUserSecret(masterUserSecret: IResolvable) {
    cdkBuilder.masterUserSecret(masterUserSecret)
  }

  public fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty) {
    cdkBuilder.masterUserSecret(masterUserSecret)
  }

  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
  }

  public fun monitoringInterval(monitoringInterval: Number) {
    cdkBuilder.monitoringInterval(monitoringInterval)
  }

  public fun monitoringRoleArn(monitoringRoleArn: String) {
    cdkBuilder.monitoringRoleArn(monitoringRoleArn)
  }

  public fun networkType(networkType: String) {
    cdkBuilder.networkType(networkType)
  }

  public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
    cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
  }

  public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
    cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
  }

  public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
    cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
  }

  public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
    cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
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

  public fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
    cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
  }

  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  public fun scalingConfiguration(scalingConfiguration: IResolvable) {
    cdkBuilder.scalingConfiguration(scalingConfiguration)
  }

  public fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty) {
    cdkBuilder.scalingConfiguration(scalingConfiguration)
  }

  public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
    cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration)
  }

  public
      fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty) {
    cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration)
  }

  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  public fun sourceRegion(sourceRegion: String) {
    cdkBuilder.sourceRegion(sourceRegion)
  }

  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun storageType(storageType: String) {
    cdkBuilder.storageType(storageType)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
  }

  public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String) {
    _vpcSecurityGroupIds.addAll(listOf(*vpcSecurityGroupIds))
  }

  public fun vpcSecurityGroupIds(vpcSecurityGroupIds: Collection<String>) {
    _vpcSecurityGroupIds.addAll(vpcSecurityGroupIds)
  }

  public fun build(): CfnDBClusterProps {
    if(_associatedRoles.isNotEmpty()) cdkBuilder.associatedRoles(_associatedRoles)
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_enableCloudwatchLogsExports.isNotEmpty())
        cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
