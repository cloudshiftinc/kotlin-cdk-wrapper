@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDBInstanceProps {
  public fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

  public fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  public fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun automaticBackupReplicationRegion(): String? =
      unwrap(this).getAutomaticBackupReplicationRegion()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

  public fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  public fun characterSetName(): String? = unwrap(this).getCharacterSetName()

  public fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

  public fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public fun dbClusterSnapshotIdentifier(): String? = unwrap(this).getDbClusterSnapshotIdentifier()

  public fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

  public fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  public fun dbName(): String? = unwrap(this).getDbName()

  public fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  public fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?: emptyList()

  public fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

  public fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

  public fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

  public fun domain(): String? = unwrap(this).getDomain()

  public fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

  public fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

  public fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

  public fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  public fun domainOu(): String? = unwrap(this).getDomainOu()

  public fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  public fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  public fun endpoint(): Any? = unwrap(this).getEndpoint()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun iops(): Number? = unwrap(this).getIops()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun licenseModel(): String? = unwrap(this).getLicenseModel()

  public fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

  public fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

  public fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  public fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  public fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  public fun performanceInsightsKmsKeyId(): String? = unwrap(this).getPerformanceInsightsKmsKeyId()

  public fun performanceInsightsRetentionPeriod(): Number? =
      unwrap(this).getPerformanceInsightsRetentionPeriod()

  public fun port(): String? = unwrap(this).getPort()

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

  public fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun replicaMode(): String? = unwrap(this).getReplicaMode()

  public fun restoreTime(): String? = unwrap(this).getRestoreTime()

  public fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public fun sourceDbInstanceAutomatedBackupsArn(): String? =
      unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

  public fun sourceDbInstanceIdentifier(): String? = unwrap(this).getSourceDbInstanceIdentifier()

  public fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

  public fun sourceRegion(): String? = unwrap(this).getSourceRegion()

  public fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

  public fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

  public fun storageType(): String? = unwrap(this).getStorageType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

  @Deprecated(message = "deprecated in CDK")
  public fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

  public fun timezone(): String? = unwrap(this).getTimezone()

  public fun useDefaultProcessorFeatures(): Any? = unwrap(this).getUseDefaultProcessorFeatures()

  public fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allocatedStorage(allocatedStorage: String)

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    public fun associatedRoles(associatedRoles: IResolvable)

    public fun associatedRoles(associatedRoles: List<Any>)

    public fun associatedRoles(vararg associatedRoles: Any)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String)

    public fun availabilityZone(availabilityZone: String)

    public fun backupRetentionPeriod(backupRetentionPeriod: Number)

    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    public fun certificateDetails(certificateDetails: IResolvable)

    public fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28138b43a7cdc1c509818c0a0be65dc8ab95a94f0468fe9a64f453036e07923")
    public
        fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit)

    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    public fun characterSetName(characterSetName: String)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable)

    public fun customIamInstanceProfile(customIamInstanceProfile: String)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String)

    public fun dbInstanceClass(dbInstanceClass: String)

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    public fun dbName(dbName: String)

    public fun dbParameterGroupName(dbParameterGroupName: String)

    public fun dbSecurityGroups(dbSecurityGroups: List<String>)

    public fun dbSecurityGroups(vararg dbSecurityGroups: String)

    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String)

    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    public fun dedicatedLogVolume(dedicatedLogVolume: Boolean)

    public fun dedicatedLogVolume(dedicatedLogVolume: IResolvable)

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean)

    public fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable)

    public fun deletionProtection(deletionProtection: Boolean)

    public fun deletionProtection(deletionProtection: IResolvable)

    public fun domain(domain: String)

    public fun domainAuthSecretArn(domainAuthSecretArn: String)

    public fun domainDnsIps(domainDnsIps: List<String>)

    public fun domainDnsIps(vararg domainDnsIps: String)

    public fun domainFqdn(domainFqdn: String)

    public fun domainIamRoleName(domainIamRoleName: String)

    public fun domainOu(domainOu: String)

    public fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>)

    public fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String)

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean)

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    public fun endpoint(endpoint: IResolvable)

    public fun endpoint(endpoint: CfnDBInstance.EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7947e5819bba5c75904e4610cb293a5a01f8267d49b226670e67ad3e8b09537d")
    public fun endpoint(endpoint: CfnDBInstance.EndpointProperty.Builder.() -> Unit)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun iops(iops: Number)

    public fun kmsKeyId(kmsKeyId: String)

    public fun licenseModel(licenseModel: String)

    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUserSecret(masterUserSecret: IResolvable)

    public fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64022dfb8dc7b9545e66d18484a4eef57beed16a27bc24d8bd93c488e9761f42")
    public
        fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit)

    public fun masterUsername(masterUsername: String)

    public fun maxAllocatedStorage(maxAllocatedStorage: Number)

    public fun monitoringInterval(monitoringInterval: Number)

    public fun monitoringRoleArn(monitoringRoleArn: String)

    public fun multiAz(multiAz: Boolean)

    public fun multiAz(multiAz: IResolvable)

    public fun ncharCharacterSetName(ncharCharacterSetName: String)

    public fun networkType(networkType: String)

    public fun optionGroupName(optionGroupName: String)

    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String)

    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number)

    public fun port(port: String)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun processorFeatures(processorFeatures: IResolvable)

    public fun processorFeatures(processorFeatures: List<Any>)

    public fun processorFeatures(vararg processorFeatures: Any)

    public fun promotionTier(promotionTier: Number)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun replicaMode(replicaMode: String)

    public fun restoreTime(restoreTime: String)

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String)

    public fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String)

    public fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String)

    public fun sourceDbiResourceId(sourceDbiResourceId: String)

    public fun sourceRegion(sourceRegion: String)

    public fun storageEncrypted(storageEncrypted: Boolean)

    public fun storageEncrypted(storageEncrypted: IResolvable)

    public fun storageThroughput(storageThroughput: Number)

    public fun storageType(storageType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialArn(tdeCredentialArn: String)

    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialPassword(tdeCredentialPassword: String)

    public fun timezone(timezone: String)

    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean)

    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable)

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean)

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable)

    public fun vpcSecurityGroups(vpcSecurityGroups: List<String>)

    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBInstanceProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBInstanceProps.builder()

    override fun allocatedStorage(allocatedStorage: String) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
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

    override fun automaticBackupReplicationRegion(automaticBackupReplicationRegion: String) {
      cdkBuilder.automaticBackupReplicationRegion(automaticBackupReplicationRegion)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun backupRetentionPeriod(backupRetentionPeriod: Number) {
      cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    override fun certificateDetails(certificateDetails: IResolvable) {
      cdkBuilder.certificateDetails(certificateDetails.let(IResolvable::unwrap))
    }

    override fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty) {
      cdkBuilder.certificateDetails(certificateDetails.let(CfnDBInstance.CertificateDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a28138b43a7cdc1c509818c0a0be65dc8ab95a94f0468fe9a64f453036e07923")
    override
        fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit):
        Unit = certificateDetails(CfnDBInstance.CertificateDetailsProperty(certificateDetails))

    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
    }

    override fun characterSetName(characterSetName: String) {
      cdkBuilder.characterSetName(characterSetName)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    override fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot.let(IResolvable::unwrap))
    }

    override fun customIamInstanceProfile(customIamInstanceProfile: String) {
      cdkBuilder.customIamInstanceProfile(customIamInstanceProfile)
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String) {
      cdkBuilder.dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier)
    }

    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    override fun dbName(dbName: String) {
      cdkBuilder.dbName(dbName)
    }

    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    override fun dbSecurityGroups(dbSecurityGroups: List<String>) {
      cdkBuilder.dbSecurityGroups(dbSecurityGroups)
    }

    override fun dbSecurityGroups(vararg dbSecurityGroups: String): Unit =
        dbSecurityGroups(dbSecurityGroups.toList())

    override fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
      cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    override fun dedicatedLogVolume(dedicatedLogVolume: Boolean) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume)
    }

    override fun dedicatedLogVolume(dedicatedLogVolume: IResolvable) {
      cdkBuilder.dedicatedLogVolume(dedicatedLogVolume.let(IResolvable::unwrap))
    }

    override fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    override fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable) {
      cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups.let(IResolvable::unwrap))
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

    override fun domainAuthSecretArn(domainAuthSecretArn: String) {
      cdkBuilder.domainAuthSecretArn(domainAuthSecretArn)
    }

    override fun domainDnsIps(domainDnsIps: List<String>) {
      cdkBuilder.domainDnsIps(domainDnsIps)
    }

    override fun domainDnsIps(vararg domainDnsIps: String): Unit =
        domainDnsIps(domainDnsIps.toList())

    override fun domainFqdn(domainFqdn: String) {
      cdkBuilder.domainFqdn(domainFqdn)
    }

    override fun domainIamRoleName(domainIamRoleName: String) {
      cdkBuilder.domainIamRoleName(domainIamRoleName)
    }

    override fun domainOu(domainOu: String) {
      cdkBuilder.domainOu(domainOu)
    }

    override fun enableCloudwatchLogsExports(enableCloudwatchLogsExports: List<String>) {
      cdkBuilder.enableCloudwatchLogsExports(enableCloudwatchLogsExports)
    }

    override fun enableCloudwatchLogsExports(vararg enableCloudwatchLogsExports: String): Unit =
        enableCloudwatchLogsExports(enableCloudwatchLogsExports.toList())

    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    override fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
      cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.let(IResolvable::unwrap))
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: IResolvable) {
      cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
    }

    override fun endpoint(endpoint: CfnDBInstance.EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(CfnDBInstance.EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7947e5819bba5c75904e4610cb293a5a01f8267d49b226670e67ad3e8b09537d")
    override fun endpoint(endpoint: CfnDBInstance.EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(CfnDBInstance.EndpointProperty(endpoint))

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun iops(iops: Number) {
      cdkBuilder.iops(iops)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun licenseModel(licenseModel: String) {
      cdkBuilder.licenseModel(licenseModel)
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

    override fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(CfnDBInstance.MasterUserSecretProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64022dfb8dc7b9545e66d18484a4eef57beed16a27bc24d8bd93c488e9761f42")
    override
        fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(CfnDBInstance.MasterUserSecretProperty(masterUserSecret))

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun maxAllocatedStorage(maxAllocatedStorage: Number) {
      cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    override fun monitoringInterval(monitoringInterval: Number) {
      cdkBuilder.monitoringInterval(monitoringInterval)
    }

    override fun monitoringRoleArn(monitoringRoleArn: String) {
      cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    override fun ncharCharacterSetName(ncharCharacterSetName: String) {
      cdkBuilder.ncharCharacterSetName(ncharCharacterSetName)
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun optionGroupName(optionGroupName: String) {
      cdkBuilder.optionGroupName(optionGroupName)
    }

    override fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
      cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    override fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
      cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    override fun port(port: String) {
      cdkBuilder.port(port)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun processorFeatures(processorFeatures: IResolvable) {
      cdkBuilder.processorFeatures(processorFeatures.let(IResolvable::unwrap))
    }

    override fun processorFeatures(processorFeatures: List<Any>) {
      cdkBuilder.processorFeatures(processorFeatures)
    }

    override fun processorFeatures(vararg processorFeatures: Any): Unit =
        processorFeatures(processorFeatures.toList())

    override fun promotionTier(promotionTier: Number) {
      cdkBuilder.promotionTier(promotionTier)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun replicaMode(replicaMode: String) {
      cdkBuilder.replicaMode(replicaMode)
    }

    override fun restoreTime(restoreTime: String) {
      cdkBuilder.restoreTime(restoreTime)
    }

    override fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
      cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    override fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String) {
      cdkBuilder.sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn)
    }

    override fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String) {
      cdkBuilder.sourceDbInstanceIdentifier(sourceDbInstanceIdentifier)
    }

    override fun sourceDbiResourceId(sourceDbiResourceId: String) {
      cdkBuilder.sourceDbiResourceId(sourceDbiResourceId)
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

    override fun storageThroughput(storageThroughput: Number) {
      cdkBuilder.storageThroughput(storageThroughput)
    }

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialArn(tdeCredentialArn: String) {
      cdkBuilder.tdeCredentialArn(tdeCredentialArn)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialPassword(tdeCredentialPassword: String) {
      cdkBuilder.tdeCredentialPassword(tdeCredentialPassword)
    }

    override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures)
    }

    override fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable) {
      cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures.let(IResolvable::unwrap))
    }

    override fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    override fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
      cdkBuilder.useLatestRestorableTime(useLatestRestorableTime.let(IResolvable::unwrap))
    }

    override fun vpcSecurityGroups(vpcSecurityGroups: List<String>) {
      cdkBuilder.vpcSecurityGroups(vpcSecurityGroups)
    }

    override fun vpcSecurityGroups(vararg vpcSecurityGroups: String): Unit =
        vpcSecurityGroups(vpcSecurityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBInstanceProps,
  ) : CdkObject(cdkObject), CfnDBInstanceProps {
    override fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

    override fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

    override fun associatedRoles(): Any? = unwrap(this).getAssociatedRoles()

    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun automaticBackupReplicationRegion(): String? =
        unwrap(this).getAutomaticBackupReplicationRegion()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    override fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

    override fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

    override fun characterSetName(): String? = unwrap(this).getCharacterSetName()

    override fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

    override fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

    override fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

    override fun dbClusterSnapshotIdentifier(): String? =
        unwrap(this).getDbClusterSnapshotIdentifier()

    override fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

    override fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

    override fun dbName(): String? = unwrap(this).getDbName()

    override fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

    override fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?:
        emptyList()

    override fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    override fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

    override fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

    override fun deletionProtection(): Any? = unwrap(this).getDeletionProtection()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

    override fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

    override fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

    override fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

    override fun domainOu(): String? = unwrap(this).getDomainOu()

    override fun enableCloudwatchLogsExports(): List<String> =
        unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

    override fun enableIamDatabaseAuthentication(): Any? =
        unwrap(this).getEnableIamDatabaseAuthentication()

    override fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

    override fun endpoint(): Any? = unwrap(this).getEndpoint()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun iops(): Number? = unwrap(this).getIops()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun licenseModel(): String? = unwrap(this).getLicenseModel()

    override fun manageMasterUserPassword(): Any? = unwrap(this).getManageMasterUserPassword()

    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    override fun masterUserSecret(): Any? = unwrap(this).getMasterUserSecret()

    override fun masterUsername(): String? = unwrap(this).getMasterUsername()

    override fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

    override fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

    override fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    override fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

    override fun performanceInsightsKmsKeyId(): String? =
        unwrap(this).getPerformanceInsightsKmsKeyId()

    override fun performanceInsightsRetentionPeriod(): Number? =
        unwrap(this).getPerformanceInsightsRetentionPeriod()

    override fun port(): String? = unwrap(this).getPort()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

    override fun promotionTier(): Number? = unwrap(this).getPromotionTier()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun replicaMode(): String? = unwrap(this).getReplicaMode()

    override fun restoreTime(): String? = unwrap(this).getRestoreTime()

    override fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

    override fun sourceDbInstanceAutomatedBackupsArn(): String? =
        unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

    override fun sourceDbInstanceIdentifier(): String? =
        unwrap(this).getSourceDbInstanceIdentifier()

    override fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

    override fun sourceRegion(): String? = unwrap(this).getSourceRegion()

    override fun storageEncrypted(): Any? = unwrap(this).getStorageEncrypted()

    override fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

    override fun storageType(): String? = unwrap(this).getStorageType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

    @Deprecated(message = "deprecated in CDK")
    override fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

    override fun timezone(): String? = unwrap(this).getTimezone()

    override fun useDefaultProcessorFeatures(): Any? = unwrap(this).getUseDefaultProcessorFeatures()

    override fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

    override fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstanceProps):
        CfnDBInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstanceProps):
        software.amazon.awscdk.services.rds.CfnDBInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.CfnDBInstanceProps
  }
}
