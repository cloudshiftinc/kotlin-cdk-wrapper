@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.Credentials
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.ServerlessClusterProps
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

/**
 * Properties for a new Aurora Serverless Cluster.
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
@CdkDslMarker
public class ServerlessClusterPropsDsl {
  private val cdkBuilder: ServerlessClusterProps.Builder = ServerlessClusterProps.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param backupRetention The number of days during which automatic DB snapshots are retained.
   * Automatic backup retention cannot be disabled on serverless clusters.
   * Must be a value from 1 day to 35 days.
   */
  public fun backupRetention(backupRetention: Duration) {
    cdkBuilder.backupRetention(backupRetention)
  }

  /**
   * @param clusterIdentifier An optional identifier for the cluster.
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * @param copyTagsToSnapshot Whether to copy tags to the snapshot when a snapshot is created.
   */
  public fun copyTagsToSnapshot(copyTagsToSnapshot: Boolean) {
    cdkBuilder.copyTagsToSnapshot(copyTagsToSnapshot)
  }

  /**
   * @param credentials Credentials for the administrative user.
   */
  public fun credentials(credentials: Credentials) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param defaultDatabaseName Name of a database which is automatically created inside the
   * cluster.
   */
  public fun defaultDatabaseName(defaultDatabaseName: String) {
    cdkBuilder.defaultDatabaseName(defaultDatabaseName)
  }

  /**
   * @param deletionProtection Indicates whether the DB cluster should have deletion protection
   * enabled.
   */
  public fun deletionProtection(deletionProtection: Boolean) {
    cdkBuilder.deletionProtection(deletionProtection)
  }

  /**
   * @param enableDataApi Whether to enable the Data API.
   */
  public fun enableDataApi(enableDataApi: Boolean) {
    cdkBuilder.enableDataApi(enableDataApi)
  }

  /**
   * @param engine What kind of database to start. 
   */
  public fun engine(engine: IClusterEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param parameterGroup Additional parameters to pass to the database engine.
   */
  public fun parameterGroup(parameterGroup: IParameterGroup) {
    cdkBuilder.parameterGroup(parameterGroup)
  }

  /**
   * @param removalPolicy The removal policy to apply when the cluster and its instances are removed
   * from the stack or replaced during an update.
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * @param scaling Scaling configuration of an Aurora Serverless database cluster.
   */
  public fun scaling(scaling: ServerlessScalingOptionsDsl.() -> Unit = {}) {
    val builder = ServerlessScalingOptionsDsl()
    builder.apply(scaling)
    cdkBuilder.scaling(builder.build())
  }

  /**
   * @param scaling Scaling configuration of an Aurora Serverless database cluster.
   */
  public fun scaling(scaling: ServerlessScalingOptions) {
    cdkBuilder.scaling(scaling)
  }

  /**
   * @param securityGroups Security group.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups Security group.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param storageEncryptionKey The KMS key for storage encryption.
   */
  public fun storageEncryptionKey(storageEncryptionKey: IKey) {
    cdkBuilder.storageEncryptionKey(storageEncryptionKey)
  }

  /**
   * @param subnetGroup Existing subnet group for the cluster.
   */
  public fun subnetGroup(subnetGroup: ISubnetGroup) {
    cdkBuilder.subnetGroup(subnetGroup)
  }

  /**
   * @param vpc The VPC that this Aurora Serverless cluster has been created in.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * @param vpcSubnets Where to place the instances within the VPC.
   * If provided, the `vpc` property must also be specified.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * @param vpcSubnets Where to place the instances within the VPC.
   * If provided, the `vpc` property must also be specified.
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): ServerlessClusterProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
