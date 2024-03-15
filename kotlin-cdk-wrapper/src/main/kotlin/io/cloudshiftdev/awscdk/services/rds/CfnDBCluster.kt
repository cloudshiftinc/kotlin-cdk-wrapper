@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster,
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

  public open fun associatedRoles(vararg __idx_ac66f0: Any): Unit =
      associatedRoles(__idx_ac66f0.toList())

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

  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

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

  public open fun enableCloudwatchLogsExports(vararg `value`: String): Unit =
      enableCloudwatchLogsExports(`value`.toList())

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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

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

    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit)

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

    public fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    public
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit)

    public fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable)

    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    public
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBCluster.Builder =
        software.amazon.awscdk.services.rds.CfnDBCluster.Builder.create(scope, id)

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

    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(MasterUserSecretProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c5177ba2ce09dd6957b01d7244f34d884d28421ebac39c4b8c7938b5c0ca985")
    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(MasterUserSecretProperty(masterUserSecret))

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

    override fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty) {
      cdkBuilder.scalingConfiguration(scalingConfiguration.let(ScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa9676c3039f29f132b6dd8b699ca2cee78d2e1ded81b22cbcd42057c78dafe")
    override
        fun scalingConfiguration(scalingConfiguration: ScalingConfigurationProperty.Builder.() -> Unit):
        Unit = scalingConfiguration(ScalingConfigurationProperty(scalingConfiguration))

    override fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: IResolvable) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty) {
      cdkBuilder.serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration.let(ServerlessV2ScalingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c267a26045ec107b3af7352451263749d4ad8d017efddc544d91f7cc9c89369f")
    override
        fun serverlessV2ScalingConfiguration(serverlessV2ScalingConfiguration: ServerlessV2ScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverlessV2ScalingConfiguration(ServerlessV2ScalingConfigurationProperty(serverlessV2ScalingConfiguration))

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

    public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBCluster.CFN_RESOURCE_TYPE_NAME

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

    @CdkDslMarker
    public interface Builder {
      public fun address(address: String)

      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()

      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBCluster.EndpointProperty
    }
  }

  public interface ServerlessV2ScalingConfigurationProperty {
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty.builder()

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty,
    ) : CdkObject(cdkObject), ServerlessV2ScalingConfigurationProperty {
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
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
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ServerlessV2ScalingConfigurationProperty
    }
  }

  public interface MasterUserSecretProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty,
    ) : CdkObject(cdkObject), MasterUserSecretProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserSecretProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty):
          MasterUserSecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserSecretProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.MasterUserSecretProperty
    }
  }

  public interface ScalingConfigurationProperty {
    public fun autoPause(): Any? = unwrap(this).getAutoPause()

    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

    public fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

    public fun timeoutAction(): String? = unwrap(this).getTimeoutAction()

    @CdkDslMarker
    public interface Builder {
      public fun autoPause(autoPause: Boolean)

      public fun autoPause(autoPause: IResolvable)

      public fun maxCapacity(maxCapacity: Number)

      public fun minCapacity(minCapacity: Number)

      public fun secondsBeforeTimeout(secondsBeforeTimeout: Number)

      public fun secondsUntilAutoPause(secondsUntilAutoPause: Number)

      public fun timeoutAction(timeoutAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty.builder()

      override fun autoPause(autoPause: Boolean) {
        cdkBuilder.autoPause(autoPause)
      }

      override fun autoPause(autoPause: IResolvable) {
        cdkBuilder.autoPause(autoPause.let(IResolvable::unwrap))
      }

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      override fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
        cdkBuilder.secondsBeforeTimeout(secondsBeforeTimeout)
      }

      override fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
        cdkBuilder.secondsUntilAutoPause(secondsUntilAutoPause)
      }

      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty,
    ) : CdkObject(cdkObject), ScalingConfigurationProperty {
      override fun autoPause(): Any? = unwrap(this).getAutoPause()

      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

      override fun secondsBeforeTimeout(): Number? = unwrap(this).getSecondsBeforeTimeout()

      override fun secondsUntilAutoPause(): Number? = unwrap(this).getSecondsUntilAutoPause()

      override fun timeoutAction(): String? = unwrap(this).getTimeoutAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty):
          ScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigurationProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty
    }
  }

  public interface DBClusterRoleProperty {
    public fun featureName(): String? = unwrap(this).getFeatureName()

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun featureName(featureName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty.builder()

      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty,
    ) : CdkObject(cdkObject), DBClusterRoleProperty {
      override fun featureName(): String? = unwrap(this).getFeatureName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DBClusterRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty):
          DBClusterRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBClusterRoleProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.DBClusterRoleProperty
    }
  }

  public interface ReadEndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    @CdkDslMarker
    public interface Builder {
      public fun address(address: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty,
    ) : CdkObject(cdkObject), ReadEndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReadEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty):
          ReadEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReadEndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBCluster.ReadEndpointProperty
    }
  }
}
