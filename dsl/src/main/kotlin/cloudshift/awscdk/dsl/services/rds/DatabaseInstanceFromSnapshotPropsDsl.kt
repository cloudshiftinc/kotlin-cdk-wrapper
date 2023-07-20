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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshotProps
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.LicenseModel
import software.amazon.awscdk.services.rds.NetworkType
import software.amazon.awscdk.services.rds.PerformanceInsightRetention
import software.amazon.awscdk.services.rds.ProcessorFeatures
import software.amazon.awscdk.services.rds.SnapshotCredentials
import software.amazon.awscdk.services.rds.StorageType
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseInstanceFromSnapshotPropsDsl {
    private val cdkBuilder: DatabaseInstanceFromSnapshotProps.Builder =
        DatabaseInstanceFromSnapshotProps.builder()

    private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

    private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun allocatedStorage(allocatedStorage: Number) {
        cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
        cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun backupRetention(backupRetention: Duration) {
        cdkBuilder.backupRetention(backupRetention)
    }

    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String) {
        _cloudwatchLogsExports.addAll(listOf(*cloudwatchLogsExports))
    }

    public fun cloudwatchLogsExports(cloudwatchLogsExports: Collection<String>) {
        _cloudwatchLogsExports.addAll(cloudwatchLogsExports)
    }

    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention)
    }

    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole)
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    public fun credentials(credentials: SnapshotCredentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    public fun deleteAutomatedBackups(deleteAutomatedBackups: Boolean) {
        cdkBuilder.deleteAutomatedBackups(deleteAutomatedBackups)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun domainRole(domainRole: IRole) {
        cdkBuilder.domainRole(domainRole)
    }

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    public fun engine(engine: IInstanceEngine) {
        cdkBuilder.engine(engine)
    }

    public fun iamAuthentication(iamAuthentication: Boolean) {
        cdkBuilder.iamAuthentication(iamAuthentication)
    }

    public fun instanceIdentifier(instanceIdentifier: String) {
        cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun licenseModel(licenseModel: LicenseModel) {
        cdkBuilder.licenseModel(licenseModel)
    }

    public fun maxAllocatedStorage(maxAllocatedStorage: Number) {
        cdkBuilder.maxAllocatedStorage(maxAllocatedStorage)
    }

    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    public fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
    }

    public fun networkType(networkType: NetworkType) {
        cdkBuilder.networkType(networkType)
    }

    public fun optionGroup(optionGroup: IOptionGroup) {
        cdkBuilder.optionGroup(optionGroup)
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun performanceInsightEncryptionKey(performanceInsightEncryptionKey: IKey) {
        cdkBuilder.performanceInsightEncryptionKey(performanceInsightEncryptionKey)
    }

    public fun performanceInsightRetention(performanceInsightRetention: PerformanceInsightRetention) {
        cdkBuilder.performanceInsightRetention(performanceInsightRetention)
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

    public fun processorFeatures(block: ProcessorFeaturesDsl.() -> Unit = {}) {
        val builder = ProcessorFeaturesDsl()
        builder.apply(block)
        cdkBuilder.processorFeatures(builder.build())
    }

    public fun processorFeatures(processorFeatures: ProcessorFeatures) {
        cdkBuilder.processorFeatures(processorFeatures)
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket) {
        _s3ExportBuckets.addAll(listOf(*s3ExportBuckets))
    }

    public fun s3ExportBuckets(s3ExportBuckets: Collection<IBucket>) {
        _s3ExportBuckets.addAll(s3ExportBuckets)
    }

    public fun s3ExportRole(s3ExportRole: IRole) {
        cdkBuilder.s3ExportRole(s3ExportRole)
    }

    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket) {
        _s3ImportBuckets.addAll(listOf(*s3ImportBuckets))
    }

    public fun s3ImportBuckets(s3ImportBuckets: Collection<IBucket>) {
        _s3ImportBuckets.addAll(s3ImportBuckets)
    }

    public fun s3ImportRole(s3ImportRole: IRole) {
        cdkBuilder.s3ImportRole(s3ImportRole)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun snapshotIdentifier(snapshotIdentifier: String) {
        cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    public fun storageThroughput(storageThroughput: Number) {
        cdkBuilder.storageThroughput(storageThroughput)
    }

    public fun storageType(storageType: StorageType) {
        cdkBuilder.storageType(storageType)
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
    }

    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): DatabaseInstanceFromSnapshotProps {
        if (_cloudwatchLogsExports.isNotEmpty()) cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
        if (_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
        if (_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
