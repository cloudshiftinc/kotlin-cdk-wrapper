@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for `ServerlessClusterFromSnapshot`.
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
public interface ServerlessClusterFromSnapshotProps {
  /**
   * The number of days during which automatic DB snapshots are retained.
   *
   * Automatic backup retention cannot be disabled on serverless clusters.
   * Must be a value from 1 day to 35 days.
   *
   * Default: Duration.days(1)
   */
  public fun backupRetention(): Duration? = unwrap(this).getBackupRetention()?.let(Duration::wrap)

  /**
   * An optional identifier for the cluster.
   *
   * Default: - A name is automatically generated.
   */
  public fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

  /**
   * Whether to copy tags to the snapshot when a snapshot is created.
   *
   * Default: - true
   */
  public fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

  /**
   * Master user credentials.
   *
   * Note - It is not possible to change the master username for a snapshot;
   * however, it is possible to provide (or generate) a new password.
   *
   * Default: - The existing username and password from the snapshot will be used.
   */
  public fun credentials(): SnapshotCredentials? =
      unwrap(this).getCredentials()?.let(SnapshotCredentials::wrap)

  /**
   * Name of a database which is automatically created inside the cluster.
   *
   * Default: - Database is not created in cluster.
   */
  public fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

  /**
   * Indicates whether the DB cluster should have deletion protection enabled.
   *
   * Default: - true if removalPolicy is RETAIN, false otherwise
   */
  public fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

  /**
   * Whether to enable the Data API.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html)
   */
  public fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

  /**
   * What kind of database to start.
   */
  public fun engine(): IClusterEngine

  /**
   * Additional parameters to pass to the database engine.
   *
   * Default: - no parameter group.
   */
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  /**
   * The removal policy to apply when the cluster and its instances are removed from the stack or
   * replaced during an update.
   *
   * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
   * the data)
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Scaling configuration of an Aurora Serverless database cluster.
   *
   * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
   * minimum capacity: 2 ACU
   * maximum capacity: 16 ACU
   */
  public fun scaling(): ServerlessScalingOptions? =
      unwrap(this).getScaling()?.let(ServerlessScalingOptions::wrap)

  /**
   * Security group.
   *
   * Default: - a new security group is created if `vpc` was provided.
   * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
   * cluster.
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
   *
   * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot.
   * However, you can use only the ARN to specify a DB instance snapshot.
   */
  public fun snapshotIdentifier(): String

  /**
   * Existing subnet group for the cluster.
   *
   * Default: - a new subnet group is created if `vpc` was provided.
   * If the `vpc` property was not provided, no subnet group will be associated with the DB cluster
   */
  public fun subnetGroup(): ISubnetGroup? = unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

  /**
   * The VPC that this Aurora Serverless cluster has been created in.
   *
   * Default: - the default VPC in the account and region will be used
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * Where to place the instances within the VPC.
   *
   * If provided, the `vpc` property must also be specified.
   *
   * Default: - the VPC default strategy if not specified.
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [ServerlessClusterFromSnapshotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     * Automatic backup retention cannot be disabled on serverless clusters.
     * Must be a value from 1 day to 35 days.
     */
    public fun backupRetention(backupRetention: Duration)

    /**
     * @param clusterIdentifier An optional identifier for the cluster.
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean)

    /**
     * @param credentials Master user credentials.
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     */
    public fun credentials(credentials: SnapshotCredentials)

    /**
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster.
     */
    public fun defaultDatabaseName(defaultDatabaseName: String)

    /**
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled.
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * @param enableDataApi Whether to enable the Data API.
     */
    public fun enableDataApi(enableDataApi: Boolean)

    /**
     * @param engine What kind of database to start. 
     */
    public fun engine(engine: IClusterEngine)

    /**
     * @param parameterGroup Additional parameters to pass to the database engine.
     */
    public fun parameterGroup(parameterGroup: IParameterGroup)

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param scaling Scaling configuration of an Aurora Serverless database cluster.
     */
    public fun scaling(scaling: ServerlessScalingOptions)

    /**
     * @param scaling Scaling configuration of an Aurora Serverless database cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f532dd0bd4a1ac00a248aff28d8fcdbfe1c0a4c17a25b61412da9197890b9aa3")
    public fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit)

    /**
     * @param securityGroups Security group.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups Security group.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    public fun snapshotIdentifier(snapshotIdentifier: String)

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     */
    public fun subnetGroup(subnetGroup: ISubnetGroup)

    /**
     * @param vpc The VPC that this Aurora Serverless cluster has been created in.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     * If provided, the `vpc` property must also be specified.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     * If provided, the `vpc` property must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26ecb36b2048091ced66bb02cacfc2424ded144d47168c2025232faf49a2c64a")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps.Builder =
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps.builder()

    /**
     * @param backupRetention The number of days during which automatic DB snapshots are retained.
     * Automatic backup retention cannot be disabled on serverless clusters.
     * Must be a value from 1 day to 35 days.
     */
    override fun backupRetention(backupRetention: Duration) {
      cdkBuilder.backupRetention(backupRetention.let(Duration.Companion::unwrap))
    }

    /**
     * @param clusterIdentifier An optional identifier for the cluster.
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
     */
    override fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
      cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
    }

    /**
     * @param credentials Master user credentials.
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     */
    override fun credentials(credentials: SnapshotCredentials) {
      cdkBuilder.credentials(credentials.let(SnapshotCredentials.Companion::unwrap))
    }

    /**
     * @param defaultDatabaseName Name of a database which is automatically created inside the
     * cluster.
     */
    override fun defaultDatabaseName(defaultDatabaseName: String) {
      cdkBuilder.defaultDatabaseName(defaultDatabaseName)
    }

    /**
     * @param deletionProtection Indicates whether the DB cluster should have deletion protection
     * enabled.
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * @param enableDataApi Whether to enable the Data API.
     */
    override fun enableDataApi(enableDataApi: Boolean) {
      cdkBuilder.enableDataApi(enableDataApi)
    }

    /**
     * @param engine What kind of database to start. 
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine.Companion::unwrap))
    }

    /**
     * @param parameterGroup Additional parameters to pass to the database engine.
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup.Companion::unwrap))
    }

    /**
     * @param removalPolicy The removal policy to apply when the cluster and its instances are
     * removed from the stack or replaced during an update.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param scaling Scaling configuration of an Aurora Serverless database cluster.
     */
    override fun scaling(scaling: ServerlessScalingOptions) {
      cdkBuilder.scaling(scaling.let(ServerlessScalingOptions.Companion::unwrap))
    }

    /**
     * @param scaling Scaling configuration of an Aurora Serverless database cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f532dd0bd4a1ac00a248aff28d8fcdbfe1c0a4c17a25b61412da9197890b9aa3")
    override fun scaling(scaling: ServerlessScalingOptions.Builder.() -> Unit): Unit =
        scaling(ServerlessScalingOptions(scaling))

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups Security group.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot
     * to restore from. 
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    override fun snapshotIdentifier(snapshotIdentifier: String) {
      cdkBuilder.snapshotIdentifier(snapshotIdentifier)
    }

    /**
     * @param subnetGroup Existing subnet group for the cluster.
     */
    override fun subnetGroup(subnetGroup: ISubnetGroup) {
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup.Companion::unwrap))
    }

    /**
     * @param vpc The VPC that this Aurora Serverless cluster has been created in.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     * If provided, the `vpc` property must also be specified.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * @param vpcSubnets Where to place the instances within the VPC.
     * If provided, the `vpc` property must also be specified.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26ecb36b2048091ced66bb02cacfc2424ded144d47168c2025232faf49a2c64a")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps,
  ) : CdkObject(cdkObject), ServerlessClusterFromSnapshotProps {
    /**
     * The number of days during which automatic DB snapshots are retained.
     *
     * Automatic backup retention cannot be disabled on serverless clusters.
     * Must be a value from 1 day to 35 days.
     *
     * Default: Duration.days(1)
     */
    override fun backupRetention(): Duration? =
        unwrap(this).getBackupRetention()?.let(Duration::wrap)

    /**
     * An optional identifier for the cluster.
     *
     * Default: - A name is automatically generated.
     */
    override fun clusterIdentifier(): String? = unwrap(this).getClusterIdentifier()

    /**
     * Whether to copy tags to the snapshot when a snapshot is created.
     *
     * Default: - true
     */
    override fun copyTagsToSnapshot(): Boolean? = unwrap(this).getCopyTagsToSnapshot()

    /**
     * Master user credentials.
     *
     * Note - It is not possible to change the master username for a snapshot;
     * however, it is possible to provide (or generate) a new password.
     *
     * Default: - The existing username and password from the snapshot will be used.
     */
    override fun credentials(): SnapshotCredentials? =
        unwrap(this).getCredentials()?.let(SnapshotCredentials::wrap)

    /**
     * Name of a database which is automatically created inside the cluster.
     *
     * Default: - Database is not created in cluster.
     */
    override fun defaultDatabaseName(): String? = unwrap(this).getDefaultDatabaseName()

    /**
     * Indicates whether the DB cluster should have deletion protection enabled.
     *
     * Default: - true if removalPolicy is RETAIN, false otherwise
     */
    override fun deletionProtection(): Boolean? = unwrap(this).getDeletionProtection()

    /**
     * Whether to enable the Data API.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html)
     */
    override fun enableDataApi(): Boolean? = unwrap(this).getEnableDataApi()

    /**
     * What kind of database to start.
     */
    override fun engine(): IClusterEngine = unwrap(this).getEngine().let(IClusterEngine::wrap)

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - no parameter group.
     */
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    /**
     * The removal policy to apply when the cluster and its instances are removed from the stack or
     * replaced during an update.
     *
     * Default: - RemovalPolicy.SNAPSHOT (remove the cluster and instances, but retain a snapshot of
     * the data)
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Scaling configuration of an Aurora Serverless database cluster.
     *
     * Default: - Serverless cluster is automatically paused after 5 minutes of being idle.
     * minimum capacity: 2 ACU
     * maximum capacity: 16 ACU
     */
    override fun scaling(): ServerlessScalingOptions? =
        unwrap(this).getScaling()?.let(ServerlessScalingOptions::wrap)

    /**
     * Security group.
     *
     * Default: - a new security group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no VPC security groups will be associated with the DB
     * cluster.
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * The identifier for the DB instance snapshot or DB cluster snapshot to restore from.
     *
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster
     * snapshot.
     * However, you can use only the ARN to specify a DB instance snapshot.
     */
    override fun snapshotIdentifier(): String = unwrap(this).getSnapshotIdentifier()

    /**
     * Existing subnet group for the cluster.
     *
     * Default: - a new subnet group is created if `vpc` was provided.
     * If the `vpc` property was not provided, no subnet group will be associated with the DB
     * cluster
     */
    override fun subnetGroup(): ISubnetGroup? =
        unwrap(this).getSubnetGroup()?.let(ISubnetGroup::wrap)

    /**
     * The VPC that this Aurora Serverless cluster has been created in.
     *
     * Default: - the default VPC in the account and region will be used
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * Where to place the instances within the VPC.
     *
     * If provided, the `vpc` property must also be specified.
     *
     * Default: - the VPC default strategy if not specified.
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessClusterFromSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps):
        ServerlessClusterFromSnapshotProps = CdkObjectWrappers.wrap(cdkObject) as?
        ServerlessClusterFromSnapshotProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessClusterFromSnapshotProps):
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
  }
}
