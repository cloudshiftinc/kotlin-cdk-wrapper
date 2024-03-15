@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

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
import kotlin.jvm.JvmName

public interface CfnDBClusterProps {
  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  public fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  public fun dbPort(): Number? = unwrap(this).getDbPort()

  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  public fun restoreType(): String? = unwrap(this).getRestoreType()

  public fun serverlessScalingConfiguration(): Any? =
      unwrap(this).getServerlessScalingConfiguration()

  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associatedRoles(associatedRoles: IResolvable)

    public fun associatedRoles(associatedRoles: List<Any>)

    public fun associatedRoles(vararg associatedRoles: Any)

    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

    public fun dbPort(dbPort: Number)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    public fun engineVersion(engineVersion: String)

    public fun iamAuthEnabled(iamAuthEnabled: Boolean)

    public fun iamAuthEnabled(iamAuthEnabled: IResolvable)

    public fun kmsKeyId(kmsKeyId: String)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun restoreToTime(restoreToTime: String)

    public fun restoreType(restoreType: String)

    public fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable)

    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57231fc0e580f9fe8c798e5b3ebf0d30ee11e862ac996a5251d53b67bc91d94b")
    public
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder.() -> Unit)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncrypted(storageEncrypted: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.neptune.CfnDBClusterProps.builder()

    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

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

    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    override fun dbPort(dbPort: Number) {
      cdkBuilder.dbPort(dbPort)
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

    override fun iamAuthEnabled(iamAuthEnabled: Boolean) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled)
    }

    override fun iamAuthEnabled(iamAuthEnabled: IResolvable) {
      cdkBuilder.iamAuthEnabled(iamAuthEnabled.let(IResolvable::unwrap))
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
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

    override fun serverlessScalingConfiguration(serverlessScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty) {
      cdkBuilder.serverlessScalingConfiguration(serverlessScalingConfiguration.let(CfnDBCluster.ServerlessScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57231fc0e580f9fe8c798e5b3ebf0d30ee11e862ac996a5251d53b67bc91d94b")
    override
        fun serverlessScalingConfiguration(serverlessScalingConfiguration: CfnDBCluster.ServerlessScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessScalingConfiguration(CfnDBCluster.ServerlessScalingConfigurationProperty(serverlessScalingConfiguration))

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

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterProps,
  ) : CdkObject(cdkObject), CfnDBClusterProps {
    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    override fun dbInstanceParameterGroupName(): String? =
        unwrap(this).getDbInstanceParameterGroupName()

    override fun dbPort(): Number? = unwrap(this).getDbPort()

    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun iamAuthEnabled(): Any? = unwrap(this).getIamAuthEnabled()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

    override fun restoreType(): String? = unwrap(this).getRestoreType()

    override fun serverlessScalingConfiguration(): Any? =
        unwrap(this).getServerlessScalingConfiguration()

    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterProps):
        CfnDBClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.neptune.CfnDBClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.neptune.CfnDBClusterProps
  }
}
