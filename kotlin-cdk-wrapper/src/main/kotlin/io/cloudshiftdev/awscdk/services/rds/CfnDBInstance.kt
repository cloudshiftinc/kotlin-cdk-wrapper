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
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allocatedStorage(): String? = unwrap(this).getAllocatedStorage()

  public open fun allocatedStorage(`value`: String) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  public open fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  public open fun allowMajorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`)
  }

  public open fun allowMajorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`.let(IResolvable::unwrap))
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

  public open fun attrCertificateDetailsCaIdentifier(): String =
      unwrap(this).getAttrCertificateDetailsCaIdentifier()

  public open fun attrCertificateDetailsValidTill(): String =
      unwrap(this).getAttrCertificateDetailsValidTill()

  public open fun attrDbInstanceArn(): String = unwrap(this).getAttrDbInstanceArn()

  public open fun attrDbSystemId(): String = unwrap(this).getAttrDbSystemId()

  public open fun attrDbiResourceId(): String = unwrap(this).getAttrDbiResourceId()

  public open fun attrEndpointAddress(): String = unwrap(this).getAttrEndpointAddress()

  public open fun attrEndpointHostedZoneId(): String = unwrap(this).getAttrEndpointHostedZoneId()

  public open fun attrEndpointPort(): String = unwrap(this).getAttrEndpointPort()

  public open fun attrMasterUserSecretSecretArn(): String =
      unwrap(this).getAttrMasterUserSecretSecretArn()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun automaticBackupReplicationRegion(): String? =
      unwrap(this).getAutomaticBackupReplicationRegion()

  public open fun automaticBackupReplicationRegion(`value`: String) {
    unwrap(this).setAutomaticBackupReplicationRegion(`value`)
  }

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun backupRetentionPeriod(): Number? = unwrap(this).getBackupRetentionPeriod()

  public open fun backupRetentionPeriod(`value`: Number) {
    unwrap(this).setBackupRetentionPeriod(`value`)
  }

  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
  }

  public open fun certificateDetails(): Any? = unwrap(this).getCertificateDetails()

  public open fun certificateDetails(`value`: IResolvable) {
    unwrap(this).setCertificateDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun certificateDetails(`value`: CertificateDetailsProperty) {
    unwrap(this).setCertificateDetails(`value`.let(CertificateDetailsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72c0235a771cef5c2223531d74a28375f5777647f6bad059dc74c67a7be0cf78")
  public open fun certificateDetails(`value`: CertificateDetailsProperty.Builder.() -> Unit): Unit =
      certificateDetails(CertificateDetailsProperty(`value`))

  public open fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  public open fun certificateRotationRestart(`value`: Boolean) {
    unwrap(this).setCertificateRotationRestart(`value`)
  }

  public open fun certificateRotationRestart(`value`: IResolvable) {
    unwrap(this).setCertificateRotationRestart(`value`.let(IResolvable::unwrap))
  }

  public open fun characterSetName(): String? = unwrap(this).getCharacterSetName()

  public open fun characterSetName(`value`: String) {
    unwrap(this).setCharacterSetName(`value`)
  }

  public open fun copyTagsToSnapshot(): Any? = unwrap(this).getCopyTagsToSnapshot()

  public open fun copyTagsToSnapshot(`value`: Boolean) {
    unwrap(this).setCopyTagsToSnapshot(`value`)
  }

  public open fun copyTagsToSnapshot(`value`: IResolvable) {
    unwrap(this).setCopyTagsToSnapshot(`value`.let(IResolvable::unwrap))
  }

  public open fun customIamInstanceProfile(): String? = unwrap(this).getCustomIamInstanceProfile()

  public open fun customIamInstanceProfile(`value`: String) {
    unwrap(this).setCustomIamInstanceProfile(`value`)
  }

  public open fun dbClusterIdentifier(): String? = unwrap(this).getDbClusterIdentifier()

  public open fun dbClusterIdentifier(`value`: String) {
    unwrap(this).setDbClusterIdentifier(`value`)
  }

  public open fun dbClusterSnapshotIdentifier(): String? =
      unwrap(this).getDbClusterSnapshotIdentifier()

  public open fun dbClusterSnapshotIdentifier(`value`: String) {
    unwrap(this).setDbClusterSnapshotIdentifier(`value`)
  }

  public open fun dbInstanceClass(): String? = unwrap(this).getDbInstanceClass()

  public open fun dbInstanceClass(`value`: String) {
    unwrap(this).setDbInstanceClass(`value`)
  }

  public open fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  public open fun dbInstanceIdentifier(`value`: String) {
    unwrap(this).setDbInstanceIdentifier(`value`)
  }

  public open fun dbName(): String? = unwrap(this).getDbName()

  public open fun dbName(`value`: String) {
    unwrap(this).setDbName(`value`)
  }

  public open fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  public open fun dbParameterGroupName(`value`: String) {
    unwrap(this).setDbParameterGroupName(`value`)
  }

  public open fun dbSecurityGroups(): List<String> = unwrap(this).getDbSecurityGroups() ?:
      emptyList()

  public open fun dbSecurityGroups(`value`: List<String>) {
    unwrap(this).setDbSecurityGroups(`value`)
  }

  public open fun dbSecurityGroups(vararg `value`: String): Unit =
      dbSecurityGroups(`value`.toList())

  public open fun dbSnapshotIdentifier(): String? = unwrap(this).getDbSnapshotIdentifier()

  public open fun dbSnapshotIdentifier(`value`: String) {
    unwrap(this).setDbSnapshotIdentifier(`value`)
  }

  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  public open fun dedicatedLogVolume(): Any? = unwrap(this).getDedicatedLogVolume()

  public open fun dedicatedLogVolume(`value`: Boolean) {
    unwrap(this).setDedicatedLogVolume(`value`)
  }

  public open fun dedicatedLogVolume(`value`: IResolvable) {
    unwrap(this).setDedicatedLogVolume(`value`.let(IResolvable::unwrap))
  }

  public open fun deleteAutomatedBackups(): Any? = unwrap(this).getDeleteAutomatedBackups()

  public open fun deleteAutomatedBackups(`value`: Boolean) {
    unwrap(this).setDeleteAutomatedBackups(`value`)
  }

  public open fun deleteAutomatedBackups(`value`: IResolvable) {
    unwrap(this).setDeleteAutomatedBackups(`value`.let(IResolvable::unwrap))
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

  public open fun domainAuthSecretArn(): String? = unwrap(this).getDomainAuthSecretArn()

  public open fun domainAuthSecretArn(`value`: String) {
    unwrap(this).setDomainAuthSecretArn(`value`)
  }

  public open fun domainDnsIps(): List<String> = unwrap(this).getDomainDnsIps() ?: emptyList()

  public open fun domainDnsIps(`value`: List<String>) {
    unwrap(this).setDomainDnsIps(`value`)
  }

  public open fun domainDnsIps(vararg `value`: String): Unit = domainDnsIps(`value`.toList())

  public open fun domainFqdn(): String? = unwrap(this).getDomainFqdn()

  public open fun domainFqdn(`value`: String) {
    unwrap(this).setDomainFqdn(`value`)
  }

  public open fun domainIamRoleName(): String? = unwrap(this).getDomainIamRoleName()

  public open fun domainIamRoleName(`value`: String) {
    unwrap(this).setDomainIamRoleName(`value`)
  }

  public open fun domainOu(): String? = unwrap(this).getDomainOu()

  public open fun domainOu(`value`: String) {
    unwrap(this).setDomainOu(`value`)
  }

  public open fun enableCloudwatchLogsExports(): List<String> =
      unwrap(this).getEnableCloudwatchLogsExports() ?: emptyList()

  public open fun enableCloudwatchLogsExports(`value`: List<String>) {
    unwrap(this).setEnableCloudwatchLogsExports(`value`)
  }

  public open fun enableCloudwatchLogsExports(vararg `value`: String): Unit =
      enableCloudwatchLogsExports(`value`.toList())

  public open fun enableIamDatabaseAuthentication(): Any? =
      unwrap(this).getEnableIamDatabaseAuthentication()

  public open fun enableIamDatabaseAuthentication(`value`: Boolean) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`)
  }

  public open fun enableIamDatabaseAuthentication(`value`: IResolvable) {
    unwrap(this).setEnableIamDatabaseAuthentication(`value`.let(IResolvable::unwrap))
  }

  public open fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  public open fun enablePerformanceInsights(`value`: Boolean) {
    unwrap(this).setEnablePerformanceInsights(`value`)
  }

  public open fun enablePerformanceInsights(`value`: IResolvable) {
    unwrap(this).setEnablePerformanceInsights(`value`.let(IResolvable::unwrap))
  }

  public open fun endpoint(): Any? = unwrap(this).getEndpoint()

  public open fun endpoint(`value`: IResolvable) {
    unwrap(this).setEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun endpoint(`value`: EndpointProperty) {
    unwrap(this).setEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("675265e7a9b1c675662bf4e5ee24963e9bdfa23cca88d689215d07fa6833d5fc")
  public open fun endpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      endpoint(EndpointProperty(`value`))

  public open fun engine(): String? = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
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

  public open fun licenseModel(): String? = unwrap(this).getLicenseModel()

  public open fun licenseModel(`value`: String) {
    unwrap(this).setLicenseModel(`value`)
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
  @JvmName("62c7cc57cdb59a1a7d8a9a6e969b261b145d1740266c88a6f594ec67cedfc2c1")
  public open fun masterUserSecret(`value`: MasterUserSecretProperty.Builder.() -> Unit): Unit =
      masterUserSecret(MasterUserSecretProperty(`value`))

  public open fun masterUsername(): String? = unwrap(this).getMasterUsername()

  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  public open fun maxAllocatedStorage(): Number? = unwrap(this).getMaxAllocatedStorage()

  public open fun maxAllocatedStorage(`value`: Number) {
    unwrap(this).setMaxAllocatedStorage(`value`)
  }

  public open fun monitoringInterval(): Number? = unwrap(this).getMonitoringInterval()

  public open fun monitoringInterval(`value`: Number) {
    unwrap(this).setMonitoringInterval(`value`)
  }

  public open fun monitoringRoleArn(): String? = unwrap(this).getMonitoringRoleArn()

  public open fun monitoringRoleArn(`value`: String) {
    unwrap(this).setMonitoringRoleArn(`value`)
  }

  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  public open fun ncharCharacterSetName(): String? = unwrap(this).getNcharCharacterSetName()

  public open fun ncharCharacterSetName(`value`: String) {
    unwrap(this).setNcharCharacterSetName(`value`)
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  public open fun optionGroupName(): String? = unwrap(this).getOptionGroupName()

  public open fun optionGroupName(`value`: String) {
    unwrap(this).setOptionGroupName(`value`)
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

  public open fun port(): String? = unwrap(this).getPort()

  public open fun port(`value`: String) {
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

  public open fun processorFeatures(): Any? = unwrap(this).getProcessorFeatures()

  public open fun processorFeatures(`value`: IResolvable) {
    unwrap(this).setProcessorFeatures(`value`.let(IResolvable::unwrap))
  }

  public open fun processorFeatures(__idx_ac66f0: List<Any>) {
    unwrap(this).setProcessorFeatures(__idx_ac66f0)
  }

  public open fun processorFeatures(vararg __idx_ac66f0: Any): Unit =
      processorFeatures(__idx_ac66f0.toList())

  public open fun promotionTier(): Number? = unwrap(this).getPromotionTier()

  public open fun promotionTier(`value`: Number) {
    unwrap(this).setPromotionTier(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun replicaMode(): String? = unwrap(this).getReplicaMode()

  public open fun replicaMode(`value`: String) {
    unwrap(this).setReplicaMode(`value`)
  }

  public open fun restoreTime(): String? = unwrap(this).getRestoreTime()

  public open fun restoreTime(`value`: String) {
    unwrap(this).setRestoreTime(`value`)
  }

  public open fun sourceDbClusterIdentifier(): String? = unwrap(this).getSourceDbClusterIdentifier()

  public open fun sourceDbClusterIdentifier(`value`: String) {
    unwrap(this).setSourceDbClusterIdentifier(`value`)
  }

  public open fun sourceDbInstanceAutomatedBackupsArn(): String? =
      unwrap(this).getSourceDbInstanceAutomatedBackupsArn()

  public open fun sourceDbInstanceAutomatedBackupsArn(`value`: String) {
    unwrap(this).setSourceDbInstanceAutomatedBackupsArn(`value`)
  }

  public open fun sourceDbInstanceIdentifier(): String? =
      unwrap(this).getSourceDbInstanceIdentifier()

  public open fun sourceDbInstanceIdentifier(`value`: String) {
    unwrap(this).setSourceDbInstanceIdentifier(`value`)
  }

  public open fun sourceDbiResourceId(): String? = unwrap(this).getSourceDbiResourceId()

  public open fun sourceDbiResourceId(`value`: String) {
    unwrap(this).setSourceDbiResourceId(`value`)
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

  public open fun storageThroughput(): Number? = unwrap(this).getStorageThroughput()

  public open fun storageThroughput(`value`: Number) {
    unwrap(this).setStorageThroughput(`value`)
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

  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialArn(): String? = unwrap(this).getTdeCredentialArn()

  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialArn(`value`: String) {
    unwrap(this).setTdeCredentialArn(`value`)
  }

  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialPassword(): String? = unwrap(this).getTdeCredentialPassword()

  @Deprecated(message = "deprecated in CDK")
  public open fun tdeCredentialPassword(`value`: String) {
    unwrap(this).setTdeCredentialPassword(`value`)
  }

  public open fun timezone(): String? = unwrap(this).getTimezone()

  public open fun timezone(`value`: String) {
    unwrap(this).setTimezone(`value`)
  }

  public open fun useDefaultProcessorFeatures(): Any? =
      unwrap(this).getUseDefaultProcessorFeatures()

  public open fun useDefaultProcessorFeatures(`value`: Boolean) {
    unwrap(this).setUseDefaultProcessorFeatures(`value`)
  }

  public open fun useDefaultProcessorFeatures(`value`: IResolvable) {
    unwrap(this).setUseDefaultProcessorFeatures(`value`.let(IResolvable::unwrap))
  }

  public open fun useLatestRestorableTime(): Any? = unwrap(this).getUseLatestRestorableTime()

  public open fun useLatestRestorableTime(`value`: Boolean) {
    unwrap(this).setUseLatestRestorableTime(`value`)
  }

  public open fun useLatestRestorableTime(`value`: IResolvable) {
    unwrap(this).setUseLatestRestorableTime(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcSecurityGroups(): List<String> = unwrap(this).getVpcSecurityGroups() ?:
      emptyList()

  public open fun vpcSecurityGroups(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroups(`value`)
  }

  public open fun vpcSecurityGroups(vararg `value`: String): Unit =
      vpcSecurityGroups(`value`.toList())

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

    public fun certificateDetails(certificateDetails: CertificateDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("527e2d3895792e597e6dd0df6c49c0c759da008f3ce325ffa8f5506a21c6806b")
    public fun certificateDetails(certificateDetails: CertificateDetailsProperty.Builder.() -> Unit)

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

    public fun endpoint(endpoint: EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4452934eeca24e633389478e0f49757d09a975774c1f229cfa992255ae2a6b9a")
    public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun iops(iops: Number)

    public fun kmsKeyId(kmsKeyId: String)

    public fun licenseModel(licenseModel: String)

    public fun manageMasterUserPassword(manageMasterUserPassword: Boolean)

    public fun manageMasterUserPassword(manageMasterUserPassword: IResolvable)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUserSecret(masterUserSecret: IResolvable)

    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd2e9e3e70cdc72e383888e63bd1e2a69e4b1df6b4c3b633e7736d38e672fb2c")
    public fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBInstance.Builder =
        software.amazon.awscdk.services.rds.CfnDBInstance.Builder.create(scope, id)

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

    override fun certificateDetails(certificateDetails: CertificateDetailsProperty) {
      cdkBuilder.certificateDetails(certificateDetails.let(CertificateDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("527e2d3895792e597e6dd0df6c49c0c759da008f3ce325ffa8f5506a21c6806b")
    override
        fun certificateDetails(certificateDetails: CertificateDetailsProperty.Builder.() -> Unit):
        Unit = certificateDetails(CertificateDetailsProperty(certificateDetails))

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

    override fun endpoint(endpoint: EndpointProperty) {
      cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4452934eeca24e633389478e0f49757d09a975774c1f229cfa992255ae2a6b9a")
    override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
        endpoint(EndpointProperty(endpoint))

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

    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty) {
      cdkBuilder.masterUserSecret(masterUserSecret.let(MasterUserSecretProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd2e9e3e70cdc72e383888e63bd1e2a69e4b1df6b4c3b633e7736d38e672fb2c")
    override fun masterUserSecret(masterUserSecret: MasterUserSecretProperty.Builder.() -> Unit):
        Unit = masterUserSecret(MasterUserSecretProperty(masterUserSecret))

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

    public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance): CfnDBInstance =
        CfnDBInstance(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstance): software.amazon.awscdk.services.rds.CfnDBInstance =
        wrapped.cdkObject
  }

  public interface DBInstanceRoleProperty {
    public fun featureName(): String

    public fun roleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun featureName(featureName: String)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty.builder()

      override fun featureName(featureName: String) {
        cdkBuilder.featureName(featureName)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty,
    ) : CdkObject(cdkObject), DBInstanceRoleProperty {
      override fun featureName(): String = unwrap(this).getFeatureName()

      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DBInstanceRoleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty):
          DBInstanceRoleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DBInstanceRoleProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.DBInstanceRoleProperty
    }
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    public fun port(): String? = unwrap(this).getPort()

    @CdkDslMarker
    public interface Builder {
      public fun address(address: String)

      public fun hostedZoneId(hostedZoneId: String)

      public fun port(port: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      override fun port(port: String) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()

      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      override fun port(): String? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBInstance.EndpointProperty
    }
  }

  public interface CertificateDetailsProperty {
    public fun caIdentifier(): String? = unwrap(this).getCaIdentifier()

    public fun validTill(): String? = unwrap(this).getValidTill()

    @CdkDslMarker
    public interface Builder {
      public fun caIdentifier(caIdentifier: String)

      public fun validTill(validTill: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty.builder()

      override fun caIdentifier(caIdentifier: String) {
        cdkBuilder.caIdentifier(caIdentifier)
      }

      override fun validTill(validTill: String) {
        cdkBuilder.validTill(validTill)
      }

      public fun build():
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty,
    ) : CdkObject(cdkObject), CertificateDetailsProperty {
      override fun caIdentifier(): String? = unwrap(this).getCaIdentifier()

      override fun validTill(): String? = unwrap(this).getValidTill()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CertificateDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty):
          CertificateDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateDetailsProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.CertificateDetailsProperty
    }
  }

  public interface ProcessorFeatureProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty,
    ) : CdkObject(cdkObject), ProcessorFeatureProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorFeatureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty):
          ProcessorFeatureProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProcessorFeatureProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.ProcessorFeatureProperty
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
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty):
          MasterUserSecretProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserSecretProperty):
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBInstance.MasterUserSecretProperty
    }
  }
}
