@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Aurora Serverless v1 Cluster restored from a snapshot.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * ServerlessClusterFromSnapshot.Builder.create(this, "Cluster")
 * .engine(DatabaseClusterEngine.AURORA_MYSQL)
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .build();
 * ```
 */
public open class ServerlessClusterFromSnapshot(
  cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot,
) : Resource(cdkObject),
    IServerlessCluster {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerlessClusterFromSnapshotProps,
  ) :
      this(software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ServerlessClusterFromSnapshotProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerlessClusterFromSnapshotProps.Builder.() -> Unit,
  ) : this(scope, id, ServerlessClusterFromSnapshotProps(props)
  )

  /**
   * Renders the secret attachment target specifications.
   */
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  /**
   * The ARN of the cluster.
   */
  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The endpoint to use for read/write operations.
   */
  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  /**
   * Identifier of the cluster.
   */
  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * The endpoint to use for read/write operations.
   */
  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  /**
   * Access to the network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Grant the given identity to access to the Data API, including read access to the secret
   * attached to the cluster if present.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantDataApiAccess(grantee: IGrantable): Grant =
      unwrap(this).grantDataApiAccess(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * The secret attached to this cluster.
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.ServerlessClusterFromSnapshot].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Automatic backup retention cannot be disabled on serverless clusters.
     * Must be a value from 1 day to 35 days.
     *
     * Default: Duration.days(1)
     *
     * @param backupRetention The number of days during which automatic DB snapshots are retained. 
     */
    public fun backupRetention(backupRetention: Duration)

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param clusterIdentifier An optional identifier for the cluster. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * Master user credentials.
     *
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     *
     * Default: - The existing username and password from the snapshot will be used.
     *
     * @param credentials Master user credentials. 
     */
    public fun credentials(credentials: SnapshotCredentials)

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     *
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster. 
     */
    public fun defaultDatabaseName(defaultDatabaseName: String)

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if removalPolicy is RETAIN, false otherwise
     *
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Whether to enable the Data API.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html)
     * @param enableDataApi Whether to enable the Data API. 
     */
    public fun enableDataApi(enableDataApi: Boolean)

    /**
     * What kind of database to start.
     *
     * @param engine What kind of database to start. 
     */
    public fun engine(engine: IClusterEngine)

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - no parameter group.
     *
     * @param parameterGroup Additional parameters to pass to the database engine. 
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Scaling configuration of an Aurora Serverless database cluster.
     *
     * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
     * minimum capacity: 2 ACU
     * maximum capacity: 16 ACU
     *
     * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
     */
    public fun scaling(scaling: ServerlessScalingOptions)

    /**
     * Scaling configuration of an Aurora Serverless database cluster.
     *
     * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
     * minimum capacity: 2 ACU
     * maximum capacity: 16 ACU
     *
     * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e76e2fe905de025512a2c88106847dd295dff7a28c55de23468e23112c8d08")
    public fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit)

    /**
     * Security group.
     *
     * Default: - a new security group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
     * cluster.
     *
     * @param securityGroups Security group. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * Security group.
     *
     * Default: - a new security group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
     * cluster.
     *
     * @param securityGroups Security group. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     *
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no subnet group will be associated with the DB
     * cluster
     *
     * @param subnetGroup Existing subnet group for the cluster. 
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * The VPC that this Aurora Serverless v1 Cluster has been created in.
     *
     * Default: - the default VPC in the account and region will be used
     *
     * @param vpc The VPC that this Aurora Serverless v1 Cluster has been created in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Where to place the instances within the VPC.
     *
     * If provided, the `vpc` property must also be specified.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Where to place the instances within the VPC.
     *
     * If provided, the `vpc` property must also be specified.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34e7f91f75217a3c85f879442387381bf78e7e6cb28791ef921393214eed8bea")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot.Builder =
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot.Builder.create(scope, id)

    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Automatic backup retention cannot be disabled on serverless clusters.
     * Must be a value from 1 day to 35 days.
     *
     * Default: Duration.days(1)
     *
     * @param backupRetention The number of days during which automatic DB snapshots are retained. 
     */
    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration.Companion::unwrap))
    }

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     *
     * @param clusterIdentifier An optional identifier for the cluster. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     *
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created. 
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * Master user credentials.
     *
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     *
     * Default: - The existing username and password from the snapshot will be used.
     *
     * @param credentials Master user credentials. 
     */
    override fun credentials(credentials: SnapshotCredentials) {
      cdkBuilder.credentials(credentials.let(SnapshotCredentials.Companion::unwrap))
    }

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     *
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster. 
     */
    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if removalPolicy is RETAIN, false otherwise
     *
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Whether to enable the Data API.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html)
     * @param enableDataApi Whether to enable the Data API. 
     */
    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    /**
     * What kind of database to start.
     *
     * @param engine What kind of database to start. 
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine.Companion::unwrap))
    }

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - no parameter group.
     *
     * @param parameterGroup Additional parameters to pass to the database engine. 
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup.Companion::unwrap))
    }

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     *
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Scaling configuration of an Aurora Serverless database cluster.
     *
     * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
     * minimum capacity: 2 ACU
     * maximum capacity: 16 ACU
     *
     * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
     */
    override fun scaling(scaling: ServerlessScalingOptions) {
      cdkBuilder.scaling(scaling.let(ServerlessScalingOptions.Companion::unwrap))
    }

    /**
     * Scaling configuration of an Aurora Serverless database cluster.
     *
     * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
     * minimum capacity: 2 ACU
     * maximum capacity: 16 ACU
     *
     * @param scaling Scaling configuration of an Aurora Serverless database cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("53e76e2fe905de025512a2c88106847dd295dff7a28c55de23468e23112c8d08")
    override fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit): Unit =
        scaling(ServerlessScalingOptions(scaling))

    /**
     * Security group.
     *
     * Default: - a new security group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
     * cluster.
     *
     * @param securityGroups Security group. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * Security group.
     *
     * Default: - a new security group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
     * cluster.
     *
     * @param securityGroups Security group. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     *
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no subnet group will be associated with the DB
     * cluster
     *
     * @param subnetGroup Existing subnet group for the cluster. 
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup.Companion::unwrap))
    }

    /**
     * The VPC that this Aurora Serverless v1 Cluster has been created in.
     *
     * Default: - the default VPC in the account and region will be used
     *
     * @param vpc The VPC that this Aurora Serverless v1 Cluster has been created in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * If provided, the `vpc` property must also be specified.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Where to place the instances within the VPC.
     *
     * If provided, the `vpc` property must also be specified.
     *
     * Default: - the VPC default strategy if not specified.
     *
     * @param vpcSubnets Where to place the instances within the VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("34e7f91f75217a3c85f879442387381bf78e7e6cb28791ef921393214eed8bea")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerlessClusterFromSnapshot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerlessClusterFromSnapshot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot):
        ServerlessClusterFromSnapshot = ServerlessClusterFromSnapshot(cdkObject)

    internal fun unwrap(wrapped: ServerlessClusterFromSnapshot):
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshot
  }
}
