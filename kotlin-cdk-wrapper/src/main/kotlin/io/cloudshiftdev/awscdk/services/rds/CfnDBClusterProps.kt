@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
  public fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

  public fun dbClusterParameterGroupName(): String? = unwrap(this).getDbClusterParameterGroupName()

  public fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public fun dbSystemId(): String? = unwrap(this).getDbSystemId()

  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun domain(): String? = unwrap(this).getDomain()

  public fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public fun enableGlobalWriteForwarding(): Any? = unwrap(this).getEnableGlobalWriteForwarding()

  public fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

  public fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun engineMode(): String? = unwrap(this).getEngineMode()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  public fun iops(): Number? = unwrap(this).getIops()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  public fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

  public fun performanceInsightsKmsKeyId(): String? = unwrap(this).getPerformanceInsightsKmsKeyId()

  public fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun replicationSourceIdentifier(): String? = unwrap(this).getReplicationSourceIdentifier()

  public fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  public fun restoreType(): String? = unwrap(this).getRestoreType()

  public fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  public fun serverlessV2ScalingConfiguration(): Any? =
      unwrap(this).getServerlessV2ScalingConfiguration()

  public fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public fun storageType(): String? = unwrap(this).getStorageType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number)

    public fun associatedRoles(associatedRoles: IResolvable)

    public fun associatedRoles(associatedRoles: List<Any>)

    public fun associatedRoles(vararg associatedRoles: Any)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun backtrackWindow(backtrackWindow: Number)

    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    public fun databaseName(databaseName: String)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbClusterInstanceClass(dbClusterInstanceClass: String)

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String)

    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun dbSystemId(dbSystemId: String)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun domain(domain: String)

    public fun domainIamRoleName(domainIamRoleName: String)

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean)

    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable)

    public fun enableHttpEndpoint(enableHttpEndpoint: Boolean)

    public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable)

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean)

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

    public fun engine(engine: String)

    public fun engineMode(engineMode: String)

    public fun engineVersion(engineVersion: String)

    public fun globalClusterIdentifier(globalClusterIdentifier: String)

    public fun iops(iops: Number)

    public fun kmsKeyId(kmsKeyId: String)

    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUserSecret(masterUserSecret: IResolvable)

    public fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0254e2f4dd72b3247f641935d466cdd46104f547d7ae4c2079f9c0da520fbb36")
    public
        fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty.Builder.() -> Unit)

    public fun masterUsername(masterUsername: String)

    public fun monitoringInterval(monitoringInterval: Number)

    public fun monitoringRoleArn(monitoringRoleArn: String)

    public fun networkType(networkType: String)

    public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean)

    public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable)

    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

    public fun port(port: Number)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun replicationSourceIdentifier(replicationSourceIdentifier: String)

    public fun restoreToTime(restoreToTime: String)

    public fun restoreType(restoreType: String)

    public fun scalingConfiguration(scalingConfiguration: IResolvable)

    public fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669faa99f851803fe28a32b25a008dcb1931d2e5b37783cf7d41a878fa8a1319")
    public
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty.Builder.() -> Unit)

    public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable)

    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7e00644e444918868049b5781d6f9ccb5826a3d4ffc86dc7538c18aba397e2")
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit)

    public fun snapshotIdentifier(snapshotIdentifier: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun sourceRegion(sourceRegion: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBClusterProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBClusterProps.builder()

    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    override fun associatedRoles(vararg associatedRoles: Any): Unit =
        associatedRoles(associatedRoles.toList())

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun backtrackWindow(backtrackWindow: Number) {
      cdkBuilder.backtrackWindow(backtrackWindow)
    }

    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
      cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
    }

    override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    override fun dbSystemId(dbSystemId: String) {
      cdkBuilder.dbSystemId(dbSystemId)
    }

    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding)
    }

    override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding.let(IResolvable::unwrap))
    }

    override fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
    }

    override fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint.let(IResolvable::unwrap))
    }

    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineMode(engineMode: String) {
      cdkBuilder.engineMode(engineMode)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
    }

    override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUserSecret(masterUserSecret: IResolvable) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(IResolvable::unwrap))
    }

    override fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(CfnDBCluster.MasterUserSecretProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0254e2f4dd72b3247f641935d466cdd46104f547d7ae4c2079f9c0da520fbb36")
    override
        fun masterUserSecret(masterUserSecret: CfnDBCluster.MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(CfnDBCluster.MasterUserSecretProperty(masterUserSecret))

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
    }

    override fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled.let(IResolvable::unwrap))
    }

    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
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

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
      cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
    }

    override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(CfnDBCluster.ScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669faa99f851803fe28a32b25a008dcb1931d2e5b37783cf7d41a878fa8a1319")
    override
        fun scalingConfiguration(scalingConfiguration: CfnDBCluster.ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(CfnDBCluster.ScalingConfigurationProperty(scalingConfiguration))

    override fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(CfnDBCluster.ServerlessV2ScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7e00644e444918868049b5781d6f9ccb5826a3d4ffc86dc7538c18aba397e2")
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessV2ScalingConfiguration(CfnDBCluster.ServerlessV2ScalingConfigurationProperty(serverlessV2ScalingConfiguration))

    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
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

    public fun build(): software.amazon.awscdk.services.rds.CfnDBClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterProps,
  ) : CdkObject(cdkObject), CfnDBClusterProps {
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    override fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

    override fun dbClusterParameterGroupName(): String? =
        unwrap(this).getDbClusterParameterGroupName()

    override fun dbInstanceParameterGroupName(): String? =
        unwrap(this).getDbInstanceParameterGroupName()

    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    override fun dbSystemId(): String? = unwrap(this).getDbSystemId()

    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    override fun enableGlobalWriteForwarding(): Any? = unwrap(this).getEnableGlobalWriteForwarding()

    override fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

    override fun enableIamDatabaseAuthentication(): Any? =
        unwrap(this).getEnableIamDatabaseAuthentication()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun engineMode(): String? = unwrap(this).getEngineMode()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    override fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    override fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

    override fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

    override fun performanceInsightsKmsKeyId(): String? =
        unwrap(this).getPerformanceInsightsKmsKeyId()

    override fun performanceInsightsRetentionPeriod(): Number? =
        unwrap(this).getPerformanceInsightsRetentionPeriod()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun replicationSourceIdentifier(): String? =
        unwrap(this).getReplicationSourceIdentifier()

    override fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

    override fun restoreType(): String? = unwrap(this).getRestoreType()

    override fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

    override fun serverlessV2ScalingConfiguration(): Any? =
        unwrap(this).getServerlessV2ScalingConfiguration()

    override fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    override fun sourceRegion(): String? = unwrap(this).getSourceRegion()

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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBClusterProps):
        CfnDBClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterProps):
        software.amazon.awscdk.services.rds.CfnDBClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBClusterProps
  }
}
