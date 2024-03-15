@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBClusterProps {
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  public fun restoreType(): String? = unwrap(this).getRestoreType()

  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public fun storageType(): String? = unwrap(this).getStorageType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    public fun engineVersion(engineVersion: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUsername(masterUsername: String)

    public fun port(port: Number)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun restoreToTime(restoreToTime: String)

    public fun restoreType(restoreType: String)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncrypted(storageEncrypted: IResolvable)

    public fun storageType(storageType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBClusterProps.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterProps,
  ) : CdkObject(cdkObject), CfnDBClusterProps {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

    override fun restoreType(): String? = unwrap(this).getRestoreType()

    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    override fun storageType(): String? = unwrap(this).getStorageType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterProps):
        CfnDBClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.docdb.CfnDBClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.CfnDBClusterProps
  }
}
