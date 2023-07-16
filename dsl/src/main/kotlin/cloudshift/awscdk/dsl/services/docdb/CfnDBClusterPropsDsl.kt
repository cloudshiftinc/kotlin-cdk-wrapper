@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.docdb

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
import software.amazon.awscdk.services.docdb.CfnDBClusterProps

@CdkDslMarker
public class CfnDBClusterPropsDsl {
  private val cdkBuilder: CfnDBClusterProps.Builder = CfnDBClusterProps.builder()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _vpcSecurityGroupIds: MutableList<String> = mutableListOf()

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
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

  public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
  }

  public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
  }

  public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
  }

  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun deletionProtection(deletionProtection: IResolvable) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String) {
    _enableCloudwatchLogsExports.addAll(listOf(*enableCloudwatchLogsExports))
  }

  public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: Collection<String>) {
    _enableCloudwatchLogsExports.addAll(enableCloudwatchLogsExports)
  }

  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
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

  public fun restoreToTime(restoreToTime: String) {
    cdkBuilder.restoreToTime(restoreToTime)
  }

  public fun restoreType(restoreType: String) {
    cdkBuilder.restoreType(restoreType)
  }

  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
  }

  public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
  }

  public fun storageEncrypted(storageEncrypted: Boolean) {
    cdkBuilder.storageEncrypted(storageEncrypted)
  }

  public fun storageEncrypted(storageEncrypted: IResolvable) {
    cdkBuilder.storageEncrypted(storageEncrypted)
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
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_enableCloudwatchLogsExports.isNotEmpty())
        cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_vpcSecurityGroupIds.isNotEmpty()) cdkBuilder.vpcSecurityGroupIds(_vpcSecurityGroupIds)
    return cdkBuilder.build()
  }
}
