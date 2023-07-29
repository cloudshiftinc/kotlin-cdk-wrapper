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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.docdb.BackupProps
import software.amazon.awscdk.services.docdb.DatabaseClusterProps
import software.amazon.awscdk.services.docdb.IClusterParameterGroup
import software.amazon.awscdk.services.docdb.Login
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.RetentionDays

/**
 * Properties for a new database cluster.
 *
 * Example:
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .masterUser(Login.builder()
 * .username("myuser")
 * .build())
 * .instanceType(InstanceType.of(InstanceClass.MEMORY5, InstanceSize.LARGE))
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PUBLIC)
 * .build())
 * .vpc(vpc)
 * .deletionProtection(true)
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseClusterPropsDsl {
    private val cdkBuilder: DatabaseClusterProps.Builder = DatabaseClusterProps.builder()

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
     * @param cloudWatchLogsRetention The number of days log events are kept in CloudWatch Logs.
     *   When updating this property, unsetting it doesn't remove the log retention policy. To
     *   remove the retention policy, set the value to `Infinity`.
     */
    public fun cloudWatchLogsRetention(cloudWatchLogsRetention: RetentionDays) {
        cdkBuilder.cloudWatchLogsRetention(cloudWatchLogsRetention)
    }

    /**
     * @param cloudWatchLogsRetentionRole The IAM role for the Lambda function associated with the
     *   custom resource that sets the retention policy.
     */
    public fun cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole: IRole) {
        cdkBuilder.cloudWatchLogsRetentionRole(cloudWatchLogsRetentionRole)
    }

    /** @param dbClusterName An optional identifier for the cluster. */
    public fun dbClusterName(dbClusterName: String) {
        cdkBuilder.dbClusterName(dbClusterName)
    }

    /**
     * @param deletionProtection Specifies whether this cluster can be deleted. If
     *   deletionProtection is enabled, the cluster cannot be deleted unless it is modified and
     *   deletionProtection is disabled. deletionProtection protects clusters from being
     *   accidentally deleted.
     */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param enablePerformanceInsights A value that indicates whether to enable Performance
     *   Insights for the instances in the DB Cluster.
     */
    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
        cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    /** @param engineVersion What version of the database to start. */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param exportAuditLogsToCloudWatch Whether the audit logs should be exported to CloudWatch.
     *   Note that you also have to configure the audit log export in the Cluster's Parameter Group.
     */
    public fun exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch: Boolean) {
        cdkBuilder.exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch)
    }

    /**
     * @param exportProfilerLogsToCloudWatch Whether the profiler logs should be exported to
     *   CloudWatch. Note that you also have to configure the profiler log export in the Cluster's
     *   Parameter Group.
     */
    public fun exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch: Boolean) {
        cdkBuilder.exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch)
    }

    /**
     * @param instanceIdentifierBase Base identifier for instances. Every replica is named by
     *   appending the replica number to this string, 1-based.
     */
    public fun instanceIdentifierBase(instanceIdentifierBase: String) {
        cdkBuilder.instanceIdentifierBase(instanceIdentifierBase)
    }

    /** @param instanceType What type of instance to start for the replicas. */
    public fun instanceType(instanceType: InstanceType) {
        cdkBuilder.instanceType(instanceType)
    }

    /** @param instances Number of DocDB compute instances. */
    public fun instances(instances: Number) {
        cdkBuilder.instances(instances)
    }

    /** @param kmsKey The KMS key for storage encryption. */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    /** @param masterUser Username and password for the administrative user. */
    public fun masterUser(masterUser: LoginDsl.() -> Unit = {}) {
        val builder = LoginDsl()
        builder.apply(masterUser)
        cdkBuilder.masterUser(builder.build())
    }

    /** @param masterUser Username and password for the administrative user. */
    public fun masterUser(masterUser: Login) {
        cdkBuilder.masterUser(masterUser)
    }

    /** @param parameterGroup The DB parameter group to associate with the instance. */
    public fun parameterGroup(parameterGroup: IClusterParameterGroup) {
        cdkBuilder.parameterGroup(parameterGroup)
    }

    /** @param port The port the DocumentDB cluster will listen on. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param preferredMaintenanceWindow A weekly time range in which maintenance should preferably
     *   execute. Must be at least 30 minutes long.
     *
     * Example: 'tue:04:17-tue:04:47'
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     *   removed or replaced during a stack update, or when the stack is deleted. This removal
     *   policy also applies to the implicit security group created for the cluster if one is not
     *   supplied as a parameter.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /** @param securityGroup Security group. */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    /** @param storageEncrypted Whether to enable storage encryption. */
    public fun storageEncrypted(storageEncrypted: Boolean) {
        cdkBuilder.storageEncrypted(storageEncrypted)
    }

    /**
     * @param vpc What subnets to run the DocumentDB instances in. Must be at least 2 subnets in two
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

    public fun build(): DatabaseClusterProps = cdkBuilder.build()
}
