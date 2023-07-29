@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
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
import software.amazon.awscdk.services.rds.DatabaseClusterProps
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IClusterInstance
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.InstanceProps
import software.amazon.awscdk.services.rds.InstanceUpdateBehaviour
import software.amazon.awscdk.services.rds.NetworkType
import software.amazon.awscdk.services.s3.IBucket

/**
 * Properties for a new database cluster.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_2_08_1).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseClusterPropsDsl {
    private val cdkBuilder: DatabaseClusterProps.Builder = DatabaseClusterProps.builder()

    private val _cloudwatchLogsExports: MutableList<String> = mutableListOf()

    private val _readers: MutableList<IClusterInstance> = mutableListOf()

    private val _s3ExportBuckets: MutableList<IBucket> = mutableListOf()

    private val _s3ImportBuckets: MutableList<IBucket> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param backtrackWindow The number of seconds to set a cluster's target backtrack window to.
     *   This feature is only supported by the Aurora MySQL database engine and cannot be enabled on
     *   existing clusters.
     */
    public fun backtrackWindow(backtrackWindow: Duration) {
        cdkBuilder.backtrackWindow(backtrackWindow)
    }

    /** @param backup Backup settings. */
    public fun backup(backup: BackupPropsDsl.() -> Unit = {}) {
        val builder = BackupPropsDsl()
        builder.apply(backup)
        cdkBuilder.backup(builder.build())
    }

    /** @param backup Backup settings. */
    public fun backup(backup: BackupProps) {
        cdkBuilder.backup(backup)
    }

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     *   CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(vararg cloudwatchLogsExports: String) {
        _cloudwatchLogsExports.addAll(listOf(*cloudwatchLogsExports))
    }

    /**
     * @param cloudwatchLogsExports The list of log types that need to be enabled for exporting to
     *   CloudWatch Logs.
     */
    public fun cloudwatchLogsExports(cloudwatchLogsExports: Collection<String>) {
        _cloudwatchLogsExports.addAll(cloudwatchLogsExports)
    }

    /**
     * @param cloudwatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     *   When updating this property, unsetting it doesn't remove the log retention policy. To
     *   remove the retention policy, set the value to `Infinity`.
     */
    public fun cloudwatchLogsRetention(cloudwatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudwatchLogsRetention(cloudwatchLogsRetention)
    }

    /**
     * @param cloudwatchLogsRetentionRole The IAM role for the Lambda function associated with the
     *   custom resource that sets the retention policy.
     */
    public fun cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole)
    }

    /** @param clusterIdentifier An optional identifier for the cluster. */
    public fun clusterIdentifier(clusterIdentifier: String) {
        cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
        cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /** @param credentials Credentials for the administrative user. */
    public fun credentials(credentials: Credentials) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     *   cluster.
     */
    public fun defaultDatabaseName(defaultDatabaseName: String) {
        cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    /**
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     *   enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /** @param engine What kind of database to start. */
    public fun engine(engine: IClusterEngine) {
        cdkBuilder.engine(engine)
    }

    /**
     * @param iamAuthentication Whether to enable mapping of AWS Identity and Access Management
     *   (IAM) accounts to database accounts.
     */
    public fun iamAuthentication(iamAuthentication: Boolean) {
        cdkBuilder.iamAuthentication(iamAuthentication)
    }

    /**
     * @param instanceIdentifierBase Base identifier for instances. Every replica is named by
     *   appending the replica number to this string, 1-based.
     */
    public fun instanceIdentifierBase(instanceIdentifierBase: String) {
        cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstancePropsDsl.() -> Unit = {}) {
        val builder = InstancePropsDsl()
        builder.apply(instanceProps)
        cdkBuilder.instanceProps(builder.build())
    }

    /**
     * @param instanceProps Settings for the individual instances that are launched.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceProps(instanceProps: InstanceProps) {
        cdkBuilder.instanceProps(instanceProps)
    }

    /** @param instanceUpdateBehaviour The ordering of updates for instances. */
    public fun instanceUpdateBehaviour(instanceUpdateBehaviour: InstanceUpdateBehaviour) {
        cdkBuilder.instanceUpdateBehaviour(instanceUpdateBehaviour)
    }

    /**
     * @param instances How many replicas/instances to create. Has to be at least 1.
     * @deprecated - use writer and readers instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instances(instances: Number) {
        cdkBuilder.instances(instances)
    }

    /**
     * @param monitoringInterval The interval, in seconds, between points when Amazon RDS collects
     *   enhanced monitoring metrics for the DB instances.
     */
    public fun monitoringInterval(monitoringInterval: Duration) {
        cdkBuilder.monitoringInterval(monitoringInterval)
    }

    /** @param monitoringRole Role that will be used to manage DB instances monitoring. */
    public fun monitoringRole(monitoringRole: IRole) {
        cdkBuilder.monitoringRole(monitoringRole)
    }

    /** @param networkType The network type of the DB instance. */
    public fun networkType(networkType: NetworkType) {
        cdkBuilder.networkType(networkType)
    }

    /** @param parameterGroup Additional parameters to pass to the database engine. */
    public fun parameterGroup(parameterGroup: IParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /**
     * @param parameters The parameters in the DBClusterParameterGroup to create automatically. You
     *   can only specify parameterGroup or parameters but not both. You need to use a versioned
     *   engine to auto-generate a DBClusterParameterGroup.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param port What port to listen on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow A preferred maintenance window day/time range. Should be
     *   specified as a range ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). Example:
     *   'Sun:23:45-Mon:00:15'
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /** @param readers A list of instances to create as cluster reader instances. */
    public fun readers(vararg readers: IClusterInstance) {
        _readers.addAll(listOf(*readers))
    }

    /** @param readers A list of instances to create as cluster reader instances. */
    public fun readers(readers: Collection<IClusterInstance>) {
        _readers.addAll(readers)
    }

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     *   removed from the stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     *   supported by the Aurora database engine. This property must not be used if `s3ExportRole`
     *   is used.
     *
     * For MySQL:
     */
    public fun s3ExportBuckets(vararg s3ExportBuckets: IBucket) {
        _s3ExportBuckets.addAll(listOf(*s3ExportBuckets))
    }

    /**
     * @param s3ExportBuckets S3 buckets that you want to load data into. This feature is only
     *   supported by the Aurora database engine. This property must not be used if `s3ExportRole`
     *   is used.
     *
     * For MySQL:
     */
    public fun s3ExportBuckets(s3ExportBuckets: Collection<IBucket>) {
        _s3ExportBuckets.addAll(s3ExportBuckets)
    }

    /**
     * @param s3ExportRole Role that will be associated with this DB cluster to enable S3 export.
     *   This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ExportBuckets` is used.
     *
     * For MySQL:
     */
    public fun s3ExportRole(s3ExportRole: IRole) {
        cdkBuilder.s3ExportRole(s3ExportRole)
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     *   supported by the Aurora database engine. This property must not be used if `s3ImportRole`
     *   is used.
     *
     * For MySQL:
     */
    public fun s3ImportBuckets(vararg s3ImportBuckets: IBucket) {
        _s3ImportBuckets.addAll(listOf(*s3ImportBuckets))
    }

    /**
     * @param s3ImportBuckets S3 buckets that you want to load data from. This feature is only
     *   supported by the Aurora database engine. This property must not be used if `s3ImportRole`
     *   is used.
     *
     * For MySQL:
     */
    public fun s3ImportBuckets(s3ImportBuckets: Collection<IBucket>) {
        _s3ImportBuckets.addAll(s3ImportBuckets)
    }

    /**
     * @param s3ImportRole Role that will be associated with this DB cluster to enable S3 import.
     *   This feature is only supported by the Aurora database engine.
     *
     * This property must not be used if `s3ImportBuckets` is used.
     *
     * For MySQL:
     */
    public fun s3ImportRole(s3ImportRole: IRole) {
        cdkBuilder.s3ImportRole(s3ImportRole)
    }

    /** @param securityGroups Security group. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups Security group. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param serverlessV2MaxCapacity The maximum number of Aurora capacity units (ACUs) for a DB
     *   instance in an Aurora Serverless v2 cluster. You can specify ACU values in half-step
     *   increments, such as 40, 40.5, 41, and so on. The largest value that you can use is 128
     *   (256GB).
     *
     * The maximum capacity must be higher than 0.5 ACUs.
     */
    public fun serverlessV2MaxCapacity(serverlessV2MaxCapacity: Number) {
        cdkBuilder.serverlessV2MaxCapacity(serverlessV2MaxCapacity)
    }

    /**
     * @param serverlessV2MinCapacity The minimum number of Aurora capacity units (ACUs) for a DB
     *   instance in an Aurora Serverless v2 cluster. You can specify ACU values in half-step
     *   increments, such as 8, 8.5, 9, and so on. The smallest value that you can use is 0.5.
     */
    public fun serverlessV2MinCapacity(serverlessV2MinCapacity: Number) {
        cdkBuilder.serverlessV2MinCapacity(serverlessV2MinCapacity)
    }

    /** @param storageEncrypted Whether to enable storage encryption. */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param storageEncryptionKey The KMS key for storage encryption. If specified,
     *   `storageEncrypted` will be set to `true`.
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey) {
        cdkBuilder.storageEncryptionKey(storageEncryptionKey)
    }

    /** @param storageType The storage type to be associated with the DB cluster. */
    public fun storageType(storageType: DBClusterStorageType) {
        cdkBuilder.storageType(storageType)
    }

    /** @param subnetGroup Existing subnet group for the cluster. */
    public fun subnetGroup(subnetGroup: ISubnetGroup) {
        cdkBuilder.subnetGroup(subnetGroup)
    }

    /**
     * @param vpc What subnets to run the RDS instances in. Must be at least 2 subnets in two
     *   different AZs.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets Where to place the instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Where to place the instances within the VPC. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    /** @param writer The instance to use for the cluster writer. */
    public fun writer(writer: IClusterInstance) {
        cdkBuilder.writer(writer)
    }

    public fun build(): DatabaseClusterProps {
        if (_cloudwatchLogsExports.isNotEmpty())
            cdkBuilder.cloudwatchLogsExports(_cloudwatchLogsExports)
        if (_readers.isNotEmpty()) cdkBuilder.readers(_readers)
        if (_s3ExportBuckets.isNotEmpty()) cdkBuilder.s3ExportBuckets(_s3ExportBuckets)
        if (_s3ImportBuckets.isNotEmpty()) cdkBuilder.s3ImportBuckets(_s3ImportBuckets)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
