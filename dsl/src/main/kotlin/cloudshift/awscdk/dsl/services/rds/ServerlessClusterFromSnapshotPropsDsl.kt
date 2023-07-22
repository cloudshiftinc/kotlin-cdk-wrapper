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
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.ISubnetGroup
import software.amazon.awscdk.services.rds.ServerlessClusterFromSnapshotProps
import software.amazon.awscdk.services.rds.ServerlessScalingOptions
import software.amazon.awscdk.services.rds.SnapshotCredentials

@CdkDslMarker
public class ServerlessClusterFromSnapshotPropsDsl {
  private val cdkBuilder: ServerlessClusterFromSnapshotProps.Builder =
      ServerlessClusterFromSnapshotProps.builder()

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
   * @param credentials Master user credentials.
   * Note - It is not possible to change the master username for a snapshot;
   * however, it is possible to provide (or generate) a new password.
   */
  public fun credentials(credentials: SnapshotCredentials) {
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
   * @param snapshotIdentifier The identifier for the DB instance snapshot or DB cluster snapshot to
   * restore from. 
   * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot.
   * However, you can use only the ARN to specify a DB instance snapshot.
   */
  public fun snapshotIdentifier(snapshotIdentifier: String) {
    cdkBuilder.snapshotIdentifier(snapshotIdentifier)
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

  public fun build(): ServerlessClusterFromSnapshotProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
