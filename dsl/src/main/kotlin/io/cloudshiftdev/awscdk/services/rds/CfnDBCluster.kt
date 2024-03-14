package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  public open fun allocatedStorage(`value`: Number) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  public open fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  public open fun associatedRoles(`value`: IResolvable) {
    unwrap(this).setAssociatedRoles(`value`.let(IResolvable::unwrap))
  }

  public open fun associatedRoles(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssociatedRoles(__idx_ac66f0)
  }

  public open fun attrDbClusterArn(): String = unwrap(this).getAttrDbClusterArn()

  public open fun attrDbClusterResourceId(): String = unwrap(this).getAttrDbClusterResourceId()

  public open fun attrEndpoint(): IResolvable =
      unwrap(this).getAttrEndpoint().let(IResolvable::wrap)

  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  public open fun attrMasterUserSecretSecretArn(): String =
      unwrap(this).getAttrMasterUserSecretSecretArn()

  public open fun attrReadEndpoint(): IResolvable =
      unwrap(this).getAttrReadEndpoint().let(IResolvable::wrap)

  public open fun attrReadEndpointAddress(): String = unwrap(this).getAttrReadEndpointAddress()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  public open fun backtrackWindow(): Number? = unwrap(this).getBacktrackWindow()

  public open fun backtrackWindow(`value`: Number) {
    unwrap(this).setBacktrackWindow(`value`)
  }

  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  public open fun dbClusterInstanceClass(): String? = unwrap(this).getDbClusterInstanceClass()

  public open fun dbClusterInstanceClass(`value`: String) {
    unwrap(this).setDbClusterInstanceClass(`value`)
  }

  public open fun dbClusterParameterGroupName(): String? =
      unwrap(this).getDbClusterParameterGroupName()

  public open fun dbClusterParameterGroupName(`value`: String) {
    unwrap(this).setDbClusterParameterGroupName(`value`)
  }

  public open fun dbInstanceParameterGroupName(): String? =
      unwrap(this).getDbInstanceParameterGroupName()

  public open fun dbInstanceParameterGroupName(`value`: String) {
    unwrap(this).setDbInstanceParameterGroupName(`value`)
  }

  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  public open fun dbSystemId(): String? = unwrap(this).getDbSystemId()

  public open fun dbSystemId(`value`: String) {
    unwrap(this).setDbSystemId(`value`)
  }

  public open fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public open fun deletionProtection(`value`: Boolean) {
    unwrap(this).setDeletionProtection(`value`)
  }

  public open fun deletionProtection(`value`: IResolvable) {
    unwrap(this).setDeletionProtection(`value`.let(IResolvable::unwrap))
  }

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public open fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  public open fun domainIamRoleName(`value`: String) {
    unwrap(this).setDomainIamRoleName(`value`)
  }

  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  public open fun enableGlobalWriteForwarding(): Any? =
      unwrap(this).getEnableGlobalWriteForwarding()

  public open fun enableGlobalWriteForwarding(`value`: Boolean) {
    unwrap(this).setEnableGlobalWriteForwarding(`value`)
  }

  public open fun enableGlobalWriteForwarding(`value`: IResolvable) {
    unwrap(this).setEnableGlobalWriteForwarding(`value`.let(IResolvable::unwrap))
  }

  public open fun enableHttpEndpoint(): Any? = unwrap(this).getEnableHttpEndpoint()

  public open fun enableHttpEndpoint(`value`: Boolean) {
    unwrap(this).setEnableHttpEndpoint(`value`)
  }

  public open fun enableHttpEndpoint(`value`: IResolvable) {
    unwrap(this).setEnableHttpEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  public open fun enableIamDatabaseAuthentication(`value`: Boolean) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`)
  }

  public open fun enableIamDatabaseAuthentication(`value`: IResolvable) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun engine(): String? = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineMode(): String? = unwrap(this).getEngineMode()

  public open fun engineMode(`value`: String) {
    unwrap(this).setEngineMode(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun globalClusterIdentifier(): String? = unwrap(this).getGlobalClusterIdentifier()

  public open fun globalClusterIdentifier(`value`: String) {
    unwrap(this).setGlobalClusterIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun iops(): Number? = unwrap(this).getIops()

  public open fun iops(`value`: Number) {
    unwrap(this).setIops(`value`)
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

  public open fun manageMasterUserPassword(`value`: Boolean) {
    unwrap(this).setManageMasterUserPassword(`value`)
  }

  public open fun manageMasterUserPassword(`value`: IResolvable) {
    unwrap(this).setManageMasterUserPassword(`value`.let(IResolvable::unwrap))
  }

  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  public open fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

  public open fun masterUserSecret(`value`: IResolvable) {
    unwrap(this).setMasterUserSecret(`value`.let(IResolvable::unwrap))
  }

  public open fun masterUserSecret(`value`: MasterUserSecretProperty) {
    unwrap(this).setMasterUserSecret(`value`.let(MasterUserSecretProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d73b6deb87473d1504c2b9481f9a6f8dea5646e545a1996e8ef4c8444744e014")
  public open fun masterUserSecret(`value`: MasterUserSecretProperty.Builder.() -> Unit): Unit =
      masterUserSecret(MasterUserSecretProperty(`value`))

  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  public open fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  public open fun monitoringInterval(`value`: Number) {
    unwrap(this).setMonitoringInterval(`value`)
  }

  public open fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  public open fun monitoringRoleArn(`value`: String) {
    unwrap(this).setMonitoringRoleArn(`value`)
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  public open fun performanceInsightsEnabled(): Any? = unwrap(this).getPerformanceInsightsEnabled()

  public open fun performanceInsightsEnabled(`value`: Boolean) {
    unwrap(this).setPerformanceInsightsEnabled(`value`)
  }

  public open fun performanceInsightsEnabled(`value`: IResolvable) {
    unwrap(this).setPerformanceInsightsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun performanceInsightsKmsKeyId(): String? =
      unwrap(this).getPerformanceInsightsKmsKeyId()

  public open fun performanceInsightsKmsKeyId(`value`: String) {
    unwrap(this).setPerformanceInsightsKmsKeyId(`value`)
  }

  public open fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

  public open fun performanceInsightsRetentionPeriod(`value`: Number) {
    unwrap(this).setPerformanceInsightsRetentionPeriod(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationSourceIdentifier(): String? =
      unwrap(this).getReplicationSourceIdentifier()

  public open fun replicationSourceIdentifier(`value`: String) {
    unwrap(this).setReplicationSourceIdentifier(`value`)
  }

  public open fun restoreToTime(): String? = unwrap(this).getRestoreToTime()

  public open fun restoreToTime(`value`: String) {
    unwrap(this).setRestoreToTime(`value`)
  }

  public open fun restoreType(): String? = unwrap(this).getRestoreType()

  public open fun restoreType(`value`: String) {
    unwrap(this).setRestoreType(`value`)
  }

  public open fun scalingConfiguration(): Any? = unwrap(this).getScalingConfiguration()

  public open fun scalingConfiguration(`value`: IResolvable) {
    unwrap(this).setScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty) {
    unwrap(this).setScalingConfiguration(`value`.let(ScalingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("86aad0a68f36b9d040df465f8a32a83e067932cd783b680eeb2aac72b4cbcab5")
  public open fun scalingConfiguration(`value`: ScalingConfigurationProperty.Builder.() -> Unit):
      Unit = scalingConfiguration(ScalingConfigurationProperty(`value`))

  public open fun serverlessV2ScalingConfiguration(): Any? =
      unwrap(this).getServerlessV2ScalingConfiguration()

  public open fun serverlessV2ScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setServerlessV2ScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serverlessV2ScalingConfiguration(`value`: ServerlessV2ScalingConfigurationProperty) {
    unwrap(this).setServerlessV2ScalingConfiguration(`value`.let(ServerlessV2ScalingConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16656dde8dddfb9772783b78be13a984a660ee7b3ee9b1b7709e1f915ad90afd")
  public open
      fun serverlessV2ScalingConfiguration(`value`: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
      Unit = serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty(`value`))

  public open fun snapshotIdentifier(): String? = unwrap(this).getSnapshotIdentifier()

  public open fun snapshotIdentifier(`value`: String) {
    unwrap(this).setSnapshotIdentifier(`value`)
  }

  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  public open fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  public open fun sourceRegion(`value`: String) {
    unwrap(this).setSourceRegion(`value`)
  }

  public open fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public open fun storageEncrypted(`value`: Boolean) {
    unwrap(this).setStorageEncrypted(`value`)
  }

  public open fun storageEncrypted(`value`: IResolvable) {
    unwrap(this).setStorageEncrypted(`value`.let(IResolvable::unwrap))
  }

  public open fun storageType(): String? = unwrap(this).getStorageType()

  public open fun storageType(`value`: String) {
    unwrap(this).setStorageType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number) {
    }

    public fun associatedRoles(associatedRoles: IResolvable) {
    }

    public fun associatedRoles(associatedRoles: List<Any>) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    }

    public fun availabilityZones(availabilityZones: List<String>) {
    }

    public fun backtrackWindow(backtrackWindow: Number) {
    }

    public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
    }

    public fun databaseName(databaseName: String) {
    }

    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
    }

    public fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
    }

    public fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
    }

    public fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
    }

    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    }

    public fun dbSystemId(dbSystemId: String) {
    }

    public fun deletionProtection(deletionProtection: Boolean) {
    }

    public fun deletionProtection(deletionProtection: IResolvable) {
    }

    public fun domain(domain: String) {
    }

    public fun domainIamRoleName(domainIamRoleName: String) {
    }

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
    }

    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean) {
    }

    public fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable) {
    }

    public fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
    }

    public fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
    }

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
    }

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
    }

    public fun engine(engine: String) {
    }

    public fun engineMode(engineMode: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun globalClusterIdentifier(globalClusterIdentifier: String) {
    }

    public fun iops(iops: Number) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
    }

    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
    }

    public fun masterUserPassword(masterUserPassword: String) {
    }

    public fun masterUserSecret(masterUserSecret: IResolvable) {
    }

    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit) {
    }

    public fun masterUsername(masterUsername: String) {
    }

    public fun monitoringInterval(monitoringInterval: Number) {
    }

    public fun monitoringRoleArn(monitoringRoleArn: String) {
    }

    public fun networkType(networkType: String) {
    }

    public fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
    }

    public fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
    }

    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
    }

    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
    }

    public fun port(port: Number) {
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    }

    public fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
    }

    public fun restoreToTime(restoreToTime: String) {
    }

    public fun restoreType(restoreType: String) {
    }

    public fun scalingConfiguration(scalingConfiguration: IResolvable) {
    }

    public fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    public
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
    }

    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit) {
    }

    public fun snapshotIdentifier(snapshotIdentifier: String) {
    }

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
    }

    public fun sourceRegion(sourceRegion: String) {
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
    }

    public fun storageEncrypted(storageEncrypted: IResolvable) {
    }

    public fun storageType(storageType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBCluster.Builder =
        software.amazon.awscdk.services.rds.CfnDBCluster.Builder.create(scope, id)

    public override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public override fun associatedRoles(associatedRoles: IResolvable) {
      cdkBuilder.associatedRoles(associatedRoles.let(IResolvable::unwrap))
    }

    public override fun associatedRoles(associatedRoles: List<Any>) {
      cdkBuilder.associatedRoles(associatedRoles)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    public override fun backtrackWindow(backtrackWindow: Number) {
      cdkBuilder.backtrackWindow(backtrackWindow)
    }

    public override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    public override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    public override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    public override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    public override fun dbClusterInstanceClass(dbClusterInstanceClass: String) {
      cdkBuilder.dbClusterInstanceClass(dbClusterInstanceClass)
    }

    public override fun dbClusterParameterGroupName(dbClusterParameterGroupName: String) {
      cdkBuilder.dbClusterParameterGroupName(dbClusterParameterGroupName)
    }

    public override fun dbInstanceParameterGroupName(dbInstanceParameterGroupName: String) {
      cdkBuilder.dbInstanceParameterGroupName(dbInstanceParameterGroupName)
    }

    public override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    public override fun dbSystemId(dbSystemId: String) {
      cdkBuilder.dbSystemId(dbSystemId)
    }

    public override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    public override fun deletionProtection(deletionProtection: IResolvable) {
      cdkBuilder.deletionProtection(deletionProtection.let(IResolvable::unwrap))
    }

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    public override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    public override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: Boolean) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding)
    }

    public override fun enableGlobalWriteForwarding(enableGlobalWriteForwarding: IResolvable) {
      cdkBuilder.enableGlobalWriteForwarding(enableGlobalWriteForwarding.let(IResolvable::unwrap))
    }

    public override fun enableHttpEndpoint(enableHttpEndpoint: Boolean) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint)
    }

    public override fun enableHttpEndpoint(enableHttpEndpoint: IResolvable) {
      cdkBuilder.enableHttpEndpoint(enableHttpEndpoint.let(IResolvable::unwrap))
    }

    public override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    public override
        fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    public override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    public override fun engineMode(engineMode: String) {
      cdkBuilder.engineMode(engineMode)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun globalClusterIdentifier(globalClusterIdentifier: String) {
      cdkBuilder.globalClusterIdentifier(globalClusterIdentifier)
    }

    public override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun manageMasterUserPassword(manageMasterUserPassword: Boolean) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword)
    }

    public override fun manageMasterUserPassword(manageMasterUserPassword: IResolvable) {
      cdkBuilder.manageMasterUserPassword(manageMasterUserPassword.let(IResolvable::unwrap))
    }

    public override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    public override fun masterUserSecret(masterUserSecret: IResolvable) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(IResolvable::unwrap))
    }

    public override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(MasterUserSecretProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    public override
        fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit): Unit =
        masterUserSecret(MasterUserSecretProperty(masterUserSecret))

    public override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    public override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    public override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    public override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    public override fun performanceInsightsEnabled(performanceInsightsEnabled: Boolean) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled)
    }

    public override fun performanceInsightsEnabled(performanceInsightsEnabled: IResolvable) {
      cdkBuilder.performanceInsightsEnabled(performanceInsightsEnabled.let(IResolvable::unwrap))
    }

    public override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    public override
        fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    public override fun replicationSourceIdentifier(replicationSourceIdentifier: String) {
      cdkBuilder.replicationSourceIdentifier(replicationSourceIdentifier)
    }

    public override fun restoreToTime(restoreToTime: String) {
      cdkBuilder.restoreToTime(restoreToTime)
    }

    public override fun restoreType(restoreType: String) {
      cdkBuilder.restoreType(restoreType)
    }

    public override fun scalingConfiguration(scalingConfiguration: IResolvable) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(IResolvable::unwrap))
    }

    public override fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(ScalingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    public override
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(ScalingConfigurationProperty(scalingConfiguration))

    public override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(ServerlessV2ScalingConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    public override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty(serverlessV2ScalingConfiguration))

    public override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    public override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    public override fun sourceRegion(sourceRegion: String) {
      cdkBuilder.sourceRegion(sourceRegion)
    }

    public override fun storageEncrypted(storageEncrypted: Boolean) {
      cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public override fun storageEncrypted(storageEncrypted: IResolvable) {
      cdkBuilder.storageEncrypted(storageEncrypted.let(IResolvable::unwrap))
    }

    public override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    public override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    public override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster): CfnDBCluster =
        CfnDBCluster(cdkObject)

    internal fun unwrap(wrapped: CfnDBCluster): software.amazon.awscdk.services.rds.CfnDBCluster =
        wrapped.cdkObject
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun port(): String? = unwrap(this).getPort()

    public interface Builder {
      public fun address(address: String) {
      }

      public fun port(port: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty,
    ) : EndpointProperty {
      public override fun address(): String? = unwrap(this).getAddress()

      public override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ServerlessV2ScalingConfigurationProperty {
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public interface Builder {
      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder()

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty,
    ) : ServerlessV2ScalingConfigurationProperty {
      public override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerlessV2ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty):
          ServerlessV2ScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerlessV2ScalingConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MasterUserSecretProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun secretArn(secretArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.builder()

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty,
    ) : MasterUserSecretProperty {
      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty):
          MasterUserSecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserSecretProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScalingConfigurationProperty {
    public fun autoPause(): Any? = unwrap(this).getAutoPause()

    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

    public fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

    public fun timeoutAction(): String? = unwrap(this).getTimeoutAction()

    public interface Builder {
      public fun autoPause(autoPause: Boolean) {
      }

      public fun autoPause(autoPause: IResolvable) {
      }

      public fun maxCapacity(maxCapacity: Number) {
      }

      public fun minCapacity(minCapacity: Number) {
      }

      public fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
      }

      public fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
      }

      public fun timeoutAction(timeoutAction: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.builder()

      public override fun autoPause(autoPause: Boolean) {
        cdkBuilder.autoPause(autoPause)
      }

      public override fun autoPause(autoPause: IResolvable) {
        cdkBuilder.autoPause(autoPause.let(IResolvable::unwrap))
      }

      public override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      public override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public override fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
        cdkBuilder.secondsBeforeTimeout(secondsBeforeTimeout)
      }

      public override fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
        cdkBuilder.secondsUntilAutoPause(secondsUntilAutoPause)
      }

      public override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty,
    ) : ScalingConfigurationProperty {
      public override fun autoPause(): Any? = unwrap(this).getAutoPause()

      public override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

      public override fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

      public override fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

      public override fun timeoutAction(): String? = unwrap(this).getTimeoutAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty):
          ScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface DBClusterRoleProperty {
    public fun featureName(): String? = unwrap(this).getFeatureName()

    public fun roleArn(): String

    public interface Builder {
      public fun featureName(featureName: String) {
      }

      public fun roleArn(roleArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.builder()

      public override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty,
    ) : DBClusterRoleProperty {
      public override fun featureName(): String? = unwrap(this).getFeatureName()

      public override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DBClusterRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty):
          DBClusterRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBClusterRoleProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReadEndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public interface Builder {
      public fun address(address: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty,
    ) : ReadEndpointProperty {
      public override fun address(): String? = unwrap(this).getAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReadEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty):
          ReadEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadEndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
