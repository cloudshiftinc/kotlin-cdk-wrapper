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
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.rds.BackupProps
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.DBClusterStorageType
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IClusterInstance
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.InstanceProps
import software.amazon.awscdk.services.rds.InstanceUpdateBehaviour
import software.amazon.awscdk.services.rds.NetworkType
import software.amazon.awscdk.services.rds.SnapshotCredentials
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseClusterFromSnapshotDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseClusterFromSnapshot.Builder =
        DatabaseClusterFromSnapshot.Builder.create(scope, id)

    private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _readers: MutableList<IClusterInstance> = mutableListOf()

    private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

    private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun backtrackWindow(backtrackWindow: Duration) {
        cdkBuilder.backtrackWindow(backtrackWindow)
    }

    public fun backup(block: BackupPropsDsl.() -> Unit = {}) {
        val builder = BackupPropsDsl()
        builder.apply(block)
        cdkBuilder.backup(builder.build())
    }

    public fun backup(backup: BackupProps) {
        cdkBuilder.backup(backup)
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

    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    public fun defaultDatabaseName(defaultDatabaseName: String) {
        cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun engine(engine: IClusterEngine) {
        cdkBuilder.engine(engine)
    }

    public fun iamAuthentication(iamAuthentication: Boolean) {
        cdkBuilder.iamAuthentication(iamAuthentication)
    }

    public fun instanceIdentifierBase(instanceIdentifierBase: String) {
        cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(block: InstancePropsDsl.() -> Unit = {}) {
        val builder = InstancePropsDsl()
        builder.apply(block)
        cdkBuilder.instanceProps(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps) {
        cdkBuilder.instanceProps(instanceProps)
    }

    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
        cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun instances(instances: Number) {
        cdkBuilder.instances(instances)
    }

    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    public fun networkType(networkType: NetworkType) {
        cdkBuilder.networkType(networkType)
    }

    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun readers(vararg readers: IClusterInstance) {
        _readers.addAll(listOf(*readers))
    }

    public fun readers(readers: Collection<IClusterInstance>) {
        _readers.addAll(readers)
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

    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
        cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
        cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    public fun snapshotCredentials(snapshotCredentials: SnapshotCredentials) {
        cdkBuilder.snapshotCredentials(snapshotCredentials)
    }

    public fun snapshotIdentifier(snapshotIdentifier: String) {
        cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
        cdkBuilder.storageEncryptionKey(storageEncryptionKey)
    }

    public fun storageType(storageType: DBClusterStorageType) {
        cdkBuilder.storageType(storageType)
    }

    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
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

    public fun writer(writer: IClusterInstance) {
        cdkBuilder.writer(writer)
    }

    public fun build(): DatabaseClusterFromSnapshot {
        if (_cloudwatchLogsExports.isNotEmpty()) cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
        if (_readers.isNotEmpty()) cdkBuilder.readers(_readers)
        if (_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
        if (_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
