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
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotation
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create an Aurora Serverless Cluster.
 *
 * Example:
 *
 * ```
 * // Build a data source for AppSync to access the database.
 * GraphqlApi api;
 * // Create username and password secret for DB Cluster
 * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
 * .username("clusteradmin")
 * .build();
 * // The VPC to place the cluster in
 * Vpc vpc = new Vpc(this, "AuroraVpc");
 * // Create the serverless cluster, provide all values needed to customise the database.
 * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AuroraCluster")
 * .engine(DatabaseClusterEngine.AURORA_MYSQL)
 * .vpc(vpc)
 * .credentials(Map.of("username", "clusteradmin"))
 * .clusterIdentifier("db-endpoint-test")
 * .defaultDatabaseName("demos")
 * .build();
 * RdsDataSource rdsDS = api.addRdsDataSource("rds", cluster, secret, "demos");
 * // Set up a resolver for an RDS query.
 * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n     
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
public open class ServerlessCluster(
  cdkObject: software.amazon.awscdk.services.rds.ServerlessCluster,
) : Resource(cdkObject), IServerlessCluster {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerlessClusterProps,
  ) :
      this(software.amazon.awscdk.services.rds.ServerlessCluster(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ServerlessClusterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ServerlessClusterProps.Builder.() -> Unit,
  ) : this(scope, id, ServerlessClusterProps(props)
  )

  /**
   * Adds the multi user rotation to this cluster.
   *
   * @param id 
   * @param options 
   */
  public open fun addRotationMultiUser(id: String, options: RotationMultiUserOptions):
      SecretRotation = unwrap(this).addRotationMultiUser(id,
      options.let(RotationMultiUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the multi user rotation to this cluster.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e3144e2981e2d54c29b77d092c09cc103c3d4bfbd9ad1ec5f454ad3e6812f0")
  public open fun addRotationMultiUser(id: String,
      options: RotationMultiUserOptions.Builder.() -> Unit): SecretRotation =
      addRotationMultiUser(id, RotationMultiUserOptions(options))

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * @param options
   */
  public open fun addRotationSingleUser(): SecretRotation =
      unwrap(this).addRotationSingleUser().let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * @param options
   */
  public open fun addRotationSingleUser(options: RotationSingleUserOptions): SecretRotation =
      unwrap(this).addRotationSingleUser(options.let(RotationSingleUserOptions::unwrap)).let(SecretRotation::wrap)

  /**
   * Adds the single user rotation of the master password to this cluster.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9dc3cae235dd1373fbafbfbb3e452e2b888653b3946f4b0e89a32adad5226775")
  public open fun addRotationSingleUser(options: RotationSingleUserOptions.Builder.() -> Unit):
      SecretRotation = addRotationSingleUser(RotationSingleUserOptions(options))

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
      unwrap(this).grantDataApiAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The secret attached to this cluster.
   */
  public open fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.ServerlessCluster].
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
     * Credentials for the administrative user.
     *
     * Default: - A username of 'admin' and SecretsManager-generated password
     *
     * @param credentials Credentials for the administrative user. 
     */
    public fun credentials(credentials: Credentials)

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
    @JvmName("a66ab5fc033d6677cef9a477412efff77d3611251692c8175fd34d74994a3deb")
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
     * The KMS key for storage encryption.
     *
     * Default: - the default master key will be used for storage encryption
     *
     * @param storageEncryptionKey The KMS key for storage encryption. 
     */
    public fun storageEncryptionKey(storageEncryptionKey: IKey)

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
     * The VPC that this Aurora Serverless cluster has been created in.
     *
     * Default: - the default VPC in the account and region will be used
     *
     * @param vpc The VPC that this Aurora Serverless cluster has been created in. 
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
    @JvmName("19fcc17e7f52f281daf909cf4668087718b2ad26f91bed9271ca5de1cbc15679")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ServerlessCluster.Builder =
        software.amazon.awscdk.services.rds.ServerlessCluster.Builder.create(scope, id)

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
      cdkBuilder.backupRetention(backupRetention.let(Duration::unwrap))
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
     * Credentials for the administrative user.
     *
     * Default: - A username of 'admin' and SecretsManager-generated password
     *
     * @param credentials Credentials for the administrative user. 
     */
    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
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
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    /**
     * Additional parameters to pass to the database engine.
     *
     * Default: - no parameter group.
     *
     * @param parameterGroup Additional parameters to pass to the database engine. 
     */
    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
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
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
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
      cdkBuilder.scaling(scaling.let(ServerlessScalingOptions::unwrap))
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
    @JvmName("a66ab5fc033d6677cef9a477412efff77d3611251692c8175fd34d74994a3deb")
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
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
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
     * The KMS key for storage encryption.
     *
     * Default: - the default master key will be used for storage encryption
     *
     * @param storageEncryptionKey The KMS key for storage encryption. 
     */
    override fun storageEncryptionKey(storageEncryptionKey: IKey) {
      cdkBuilder.storageEncryptionKey(storageEncryptionKey.let(IKey::unwrap))
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
      cdkBuilder.subnetGroup(subnetGroup.let(ISubnetGroup::unwrap))
    }

    /**
     * The VPC that this Aurora Serverless cluster has been created in.
     *
     * Default: - the default VPC in the account and region will be used
     *
     * @param vpc The VPC that this Aurora Serverless cluster has been created in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
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
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
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
    @JvmName("19fcc17e7f52f281daf909cf4668087718b2ad26f91bed9271ca5de1cbc15679")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.ServerlessCluster = cdkBuilder.build()
  }

  public companion object {
    public fun fromServerlessClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerlessClusterAttributes,
    ): IServerlessCluster =
        software.amazon.awscdk.services.rds.ServerlessCluster.fromServerlessClusterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ServerlessClusterAttributes::unwrap)).let(IServerlessCluster::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5ad4c7ad78796d5cee14bd7dd4458c72f8f8535fcd3845598fc5ea0c2c77997f")
    public fun fromServerlessClusterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ServerlessClusterAttributes.Builder.() -> Unit,
    ): IServerlessCluster = fromServerlessClusterAttributes(scope, id,
        ServerlessClusterAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ServerlessCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ServerlessCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessCluster):
        ServerlessCluster = ServerlessCluster(cdkObject)

    internal fun unwrap(wrapped: ServerlessCluster):
        software.amazon.awscdk.services.rds.ServerlessCluster = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.ServerlessCluster
  }
}
