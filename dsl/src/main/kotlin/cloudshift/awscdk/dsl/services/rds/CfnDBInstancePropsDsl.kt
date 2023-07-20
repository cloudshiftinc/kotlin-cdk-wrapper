@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBInstanceProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDBInstancePropsDsl {
    private val cdkBuilder: CfnDBInstanceProps.Builder = CfnDBInstanceProps.builder()

    private val _associatedRoles: MutableList<Any> = mutableListOf()

    private val _dbSecurityGroups: MutableList<String> = mutableListOf()

    private val _enableCloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _processorFeatures: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpcSecurityGroups: MutableList<String> = mutableListOf()

    public fun allocatedStorage(allocatedStorage: String) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
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

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun backupRetentionPeriod(backupRetentionPeriod: Number) {
        cdkBuilder.backupRetentionPeriod(backupRetentionPeriod)
    }

    public fun caCertificateIdentifier(caCertificateIdentifier: String) {
        cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    public fun certificateDetails(certificateDetails: IResolvable) {
        cdkBuilder.certificateDetails(certificateDetails)
    }

    public fun certificateDetails(certificateDetails: CfnDBInstance.CertificateDetailsProperty) {
        cdkBuilder.certificateDetails(certificateDetails)
    }

    public fun certificateRotationRestart(certificateRotationRestart: Boolean) {
        cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    public fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
        cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    public fun characterSetName(characterSetName: String) {
        cdkBuilder.characterSetName(characterSetName)
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: IResolvable) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public fun customIamInstanceProfile(customIamInstanceProfile: String) {
        cdkBuilder.customIamInstanceProfile(customIamInstanceProfile)
    }

    public fun dbClusterIdentifier(dbClusterIdentifier: String) {
        cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    public fun dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier: String) {
        cdkBuilder.dbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier)
    }

    public fun dbInstanceClass(dbInstanceClass: String) {
        cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
        cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    public fun dbName(dbName: String) {
        cdkBuilder.dbName(dbName)
    }

    public fun dbParameterGroupName(dbParameterGroupName: String) {
        cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    public fun dbSecurityGroups(vararg dbSecurityGroups: String) {
        _dbSecurityGroups.addAll(listOf(*dbSecurityGroups))
    }

    public fun dbSecurityGroups(dbSecurityGroups: Collection<String>) {
        _dbSecurityGroups.addAll(dbSecurityGroups)
    }

    public fun dbSnapshotIdentifier(dbSnapshotIdentifier: String) {
        cdkBuilder.dbSnapshotIdentifier(dbSnapshotIdentifier)
    }

    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
        cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    public fun deleteAutomatedBackups(deleteAutomatedBackups: IResolvable) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
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

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: Boolean) {
        cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    public fun enableIamDatabaseAuthentication(enableIamDatabaseAuthentication: IResolvable) {
        cdkBuilder.enableIamDatabaseAuthentication(enableIamDatabaseAuthentication)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun endpoint(endpoint: CfnDBInstance.EndpointProperty) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun licenseModel(licenseModel: String) {
        cdkBuilder.licenseModel(licenseModel)
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

    public fun masterUserSecret(masterUserSecret: CfnDBInstance.MasterUserSecretProperty) {
        cdkBuilder.masterUserSecret(masterUserSecret)
    }

    public fun masterUsername(masterUsername: String) {
        cdkBuilder.masterUsername(masterUsername)
    }

    public fun maxAllocatedStorage(maxAllocatedStorage: Number) {
        cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    public fun monitoringInterval(monitoringInterval: Number) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    public fun monitoringRoleArn(monitoringRoleArn: String) {
        cdkBuilder.monitoringRoleArn(monitoringRoleArn)
    }

    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    public fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz)
    }

    public fun ncharCharacterSetName(ncharCharacterSetName: String) {
        cdkBuilder.ncharCharacterSetName(ncharCharacterSetName)
    }

    public fun networkType(networkType: String) {
        cdkBuilder.networkType(networkType)
    }

    public fun optionGroupName(optionGroupName: String) {
        cdkBuilder.optionGroupName(optionGroupName)
    }

    public fun performanceInsightsKmsKeyId(performanceInsightsKmsKeyId: String) {
        cdkBuilder.performanceInsightsKmsKeyId(performanceInsightsKmsKeyId)
    }

    public fun performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod: Number) {
        cdkBuilder.performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun preferredBackupWindow(preferredBackupWindow: String) {
        cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun processorFeatures(vararg processorFeatures: Any) {
        _processorFeatures.addAll(listOf(*processorFeatures))
    }

    public fun processorFeatures(processorFeatures: Collection<Any>) {
        _processorFeatures.addAll(processorFeatures)
    }

    public fun processorFeatures(processorFeatures: IResolvable) {
        cdkBuilder.processorFeatures(processorFeatures)
    }

    public fun promotionTier(promotionTier: Number) {
        cdkBuilder.promotionTier(promotionTier)
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun replicaMode(replicaMode: String) {
        cdkBuilder.replicaMode(replicaMode)
    }

    public fun restoreTime(restoreTime: String) {
        cdkBuilder.restoreTime(restoreTime)
    }

    public fun sourceDbClusterIdentifier(sourceDbClusterIdentifier: String) {
        cdkBuilder.sourceDbClusterIdentifier(sourceDbClusterIdentifier)
    }

    public fun sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn: String) {
        cdkBuilder.sourceDbInstanceAutomatedBackupsArn(sourceDbInstanceAutomatedBackupsArn)
    }

    public fun sourceDbInstanceIdentifier(sourceDbInstanceIdentifier: String) {
        cdkBuilder.sourceDbInstanceIdentifier(sourceDbInstanceIdentifier)
    }

    public fun sourceDbiResourceId(sourceDbiResourceId: String) {
        cdkBuilder.sourceDbiResourceId(sourceDbiResourceId)
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

    public fun storageThroughput(storageThroughput: Number) {
        cdkBuilder.storageThroughput(storageThroughput)
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

    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialArn(tdeCredentialArn: String) {
        cdkBuilder.tdeCredentialArn(tdeCredentialArn)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun tdeCredentialPassword(tdeCredentialPassword: String) {
        cdkBuilder.tdeCredentialPassword(tdeCredentialPassword)
    }

    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: Boolean) {
        cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures)
    }

    public fun useDefaultProcessorFeatures(useDefaultProcessorFeatures: IResolvable) {
        cdkBuilder.useDefaultProcessorFeatures(useDefaultProcessorFeatures)
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: Boolean) {
        cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    public fun useLatestRestorableTime(useLatestRestorableTime: IResolvable) {
        cdkBuilder.useLatestRestorableTime(useLatestRestorableTime)
    }

    public fun vpcSecurityGroups(vararg vpcSecurityGroups: String) {
        _vpcSecurityGroups.addAll(listOf(*vpcSecurityGroups))
    }

    public fun vpcSecurityGroups(vpcSecurityGroups: Collection<String>) {
        _vpcSecurityGroups.addAll(vpcSecurityGroups)
    }

    public fun build(): CfnDBInstanceProps {
        if (_associatedRoles.isNotEmpty()) cdkBuilder.associatedRoles(_associatedRoles)
        if (_dbSecurityGroups.isNotEmpty()) cdkBuilder.dbSecurityGroups(_dbSecurityGroups)
        if (_enableCloudwatchLogsExports.isNotEmpty()) {
            cdkBuilder.enableCloudwatchLogsExports(_enableCloudwatchLogsExports)
        }
        if (_processorFeatures.isNotEmpty()) cdkBuilder.processorFeatures(_processorFeatures)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpcSecurityGroups.isNotEmpty()) cdkBuilder.vpcSecurityGroups(_vpcSecurityGroups)
        return cdkBuilder.build()
    }
}
