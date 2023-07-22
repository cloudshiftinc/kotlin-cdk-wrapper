@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnReplicationGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnReplicationGroup.Builder = CfnReplicationGroup.Builder.create(scope,
      id)

  private val _cacheSecurityGroupNames: MutableList<String> = mutableListOf()

  private val _logDeliveryConfigurations: MutableList<Any> = mutableListOf()

  private val _nodeGroupConfiguration: MutableList<Any> = mutableListOf()

  private val _preferredCacheClusterAZs: MutableList<String> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _snapshotArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  private val _userGroupIds: MutableList<String> = mutableListOf()

  /**
   * A flag that enables encryption at rest when set to `true` .
   *
   * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
   * created. To enable encryption at rest on a replication group you must set
   * `AtRestEncryptionEnabled` to `true` when you create the replication group.
   *
   * *Required:* Only available when creating a replication group in an Amazon VPC using redis
   * version `3.2.6` or `4.x` onward.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
   * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
   */
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  /**
   * A flag that enables encryption at rest when set to `true` .
   *
   * You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
   * created. To enable encryption at rest on a replication group you must set
   * `AtRestEncryptionEnabled` to `true` when you create the replication group.
   *
   * *Required:* Only available when creating a replication group in an Amazon VPC using redis
   * version `3.2.6` or `4.x` onward.
   *
   * Default: `false`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-atrestencryptionenabled)
   * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` . 
   */
  public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
    cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
  }

  /**
   * *Reserved parameter.* The password used to access a password protected server.
   *
   * `AuthToken` can be specified only on replication groups where `TransitEncryptionEnabled` is
   * `true` . For more information, see [Authenticating Users with the Redis AUTH
   * Command](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html) .
   *
   *
   * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken` ,
   * and a `CacheSubnetGroup` .
   *
   *
   * Password constraints:
   *
   * * Must be only printable ASCII characters.
   * * Must be at least 16 characters and no more than 128 characters in length.
   * * Nonalphanumeric characters are restricted to (!, &amp;, #, $, ^, &lt;, &gt;, -, ).
   *
   * For more information, see [AUTH
   * password](https://docs.aws.amazon.com/http://redis.io/commands/AUTH) at
   * http://redis.io/commands/AUTH.
   *
   *
   * If ADDING the AuthToken, update requires
   * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-authtoken)
   * @param authToken *Reserved parameter.* The password used to access a password protected server.
   * 
   */
  public fun authToken(authToken: String) {
    cdkBuilder.authToken(authToken)
  }

  /**
   * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to
   * opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
   * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
   * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This parameter
   * is disabled for previous versions. 
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to
   * opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-autominorversionupgrade)
   * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
   * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This parameter
   * is disabled for previous versions. 
   */
  public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   *
   * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication groups.
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
   * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically promoted
   * to read/write primary if the existing primary fails. 
   */
  public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
    cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
  }

  /**
   * Specifies whether a read-only replica is automatically promoted to read/write primary if the
   * existing primary fails.
   *
   * `AutomaticFailoverEnabled` must be enabled for Redis (cluster mode enabled) replication groups.
   *
   * Default: false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-automaticfailoverenabled)
   * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically promoted
   * to read/write primary if the existing primary fails. 
   */
  public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
    cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
  }

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   *
   * The following node types are supported by ElastiCache. Generally speaking, the current
   * generation types provide more memory and computational power at lower cost when compared to their
   * equivalent previous generation counterparts.
   *
   * * General purpose:
   * * Current generation:
   *
   * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
   * `cache.m6g.4xlarge` , `cache.m6g.12xlarge` , `cache.m6g.24xlarge`
   *
   * *M5 node types:* `cache.m5.large` , `cache.m5.xlarge` , `cache.m5.2xlarge` , `cache.m5.4xlarge`
   * , `cache.m5.12xlarge` , `cache.m5.24xlarge`
   *
   * *M4 node types:* `cache.m4.large` , `cache.m4.xlarge` , `cache.m4.2xlarge` , `cache.m4.4xlarge`
   * , `cache.m4.10xlarge`
   *
   * *T4g node types:* `cache.t4g.micro` , `cache.t4g.small` , `cache.t4g.medium`
   *
   * *T3 node types:* `cache.t3.micro` , `cache.t3.small` , `cache.t3.medium`
   *
   * *T2 node types:* `cache.t2.micro` , `cache.t2.small` , `cache.t2.medium`
   *
   * * Previous generation: (not recommended)
   *
   * *T1 node types:* `cache.t1.micro`
   *
   * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
   *
   * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` , `cache.m3.2xlarge`
   *
   * * Compute optimized:
   * * Previous generation: (not recommended)
   *
   * *C1 node types:* `cache.c1.xlarge`
   *
   * * Memory optimized:
   * * Current generation:
   *
   * *R6gd node types:* `cache.r6gd.xlarge` , `cache.r6gd.2xlarge` , `cache.r6gd.4xlarge` ,
   * `cache.r6gd.8xlarge` , `cache.r6gd.12xlarge` , `cache.r6gd.16xlarge`
   *
   *
   * The `r6gd` family is available in the following regions: `us-east-2` , `us-east-1` ,
   * `us-west-2` , `us-west-1` , `eu-west-1` , `eu-central-1` , `ap-northeast-1` , `ap-southeast-1` ,
   * `ap-southeast-2` .
   *
   *
   * *R6g node types:* `cache.r6g.large` , `cache.r6g.xlarge` , `cache.r6g.2xlarge` ,
   * `cache.r6g.4xlarge` , `cache.r6g.12xlarge` , `cache.r6g.24xlarge`
   *
   * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` , `cache.r5.4xlarge`
   * , `cache.r5.12xlarge` , `cache.r5.24xlarge`
   *
   * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` , `cache.r4.4xlarge`
   * , `cache.r4.8xlarge` , `cache.r4.16xlarge`
   *
   * * Previous generation: (not recommended)
   *
   * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
   *
   * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` , `cache.r3.4xlarge`
   * , `cache.r3.8xlarge`
   *
   * For region availability, see [Supported Node Types by Amazon
   * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachenodetype)
   * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
   */
  public fun cacheNodeType(cacheNodeType: String) {
    cdkBuilder.cacheNodeType(cacheNodeType)
  }

  /**
   * The name of the parameter group to associate with this replication group.
   *
   * If this argument is omitted, the default cache parameter group for the specified engine is
   * used.
   *
   * If you are running Redis version 3.2.4 or later, only one node group (shard), and want to use a
   * default parameter group, we recommend that you specify the parameter group by name.
   *
   * * To create a Redis (cluster mode disabled) replication group, use
   * `CacheParameterGroupName=default.redis3.2` .
   * * To create a Redis (cluster mode enabled) replication group, use
   * `CacheParameterGroupName=default.redis3.2.cluster.on` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cacheparametergroupname)
   * @param cacheParameterGroupName The name of the parameter group to associate with this
   * replication group. 
   */
  public fun cacheParameterGroupName(cacheParameterGroupName: String) {
    cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
  }

  /**
   * A list of cache security group names to associate with this replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
   * @param cacheSecurityGroupNames A list of cache security group names to associate with this
   * replication group. 
   */
  public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String) {
    _cacheSecurityGroupNames.addAll(listOf(*cacheSecurityGroupNames))
  }

  /**
   * A list of cache security group names to associate with this replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesecuritygroupnames)
   * @param cacheSecurityGroupNames A list of cache security group names to associate with this
   * replication group. 
   */
  public fun cacheSecurityGroupNames(cacheSecurityGroupNames: Collection<String>) {
    _cacheSecurityGroupNames.addAll(cacheSecurityGroupNames)
  }

  /**
   * The name of the cache subnet group to be used for the replication group.
   *
   *
   * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
   * before you start creating a cluster. For more information, see
   * [AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-cachesubnetgroupname)
   * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
   * group. 
   */
  public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
    cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
  }

  /**
   * Enabled or Disabled.
   *
   * To modify cluster mode from Disabled to Enabled, you must first set the cluster mode to
   * Compatible. Compatible mode allows your Redis clients to connect using both cluster mode enabled
   * and cluster mode disabled. After you migrate all Redis clients to use cluster mode enabled, you
   * can then complete cluster mode configuration and set the cluster mode to Enabled. For more
   * information, see [Modify cluster
   * mode](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/modify-cluster-mode.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-clustermode)
   * @param clusterMode Enabled or Disabled. 
   */
  public fun clusterMode(clusterMode: String) {
    cdkBuilder.clusterMode(clusterMode)
  }

  /**
   * Enables data tiering.
   *
   * Data tiering is only supported for replication groups using the r6gd node type. This parameter
   * must be set to true when using r6gd nodes. For more information, see [Data
   * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/data-tiering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
   * @param dataTieringEnabled Enables data tiering. 
   */
  public fun dataTieringEnabled(dataTieringEnabled: Boolean) {
    cdkBuilder.dataTieringEnabled(dataTieringEnabled)
  }

  /**
   * Enables data tiering.
   *
   * Data tiering is only supported for replication groups using the r6gd node type. This parameter
   * must be set to true when using r6gd nodes. For more information, see [Data
   * tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/data-tiering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-datatieringenabled)
   * @param dataTieringEnabled Enables data tiering. 
   */
  public fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
    cdkBuilder.dataTieringEnabled(dataTieringEnabled)
  }

  /**
   * The name of the cache engine to be used for the clusters in this replication group.
   *
   * The value must be set to `Redis` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engine)
   * @param engine The name of the cache engine to be used for the clusters in this replication
   * group. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * The version number of the cache engine to be used for the clusters in this replication group.
   *
   * To view the supported cache engine versions, use the `DescribeCacheEngineVersions` operation.
   *
   * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
   * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
   * ) in the *ElastiCache User Guide* , but you cannot downgrade to an earlier engine version. If you
   * want to use an earlier engine version, you must delete the existing cluster or replication group
   * and create it anew with the earlier engine version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-engineversion)
   * @param engineVersion The version number of the cache engine to be used for the clusters in this
   * replication group. 
   */
  public fun engineVersion(engineVersion: String) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * The name of the Global datastore.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-globalreplicationgroupid)
   * @param globalReplicationGroupId The name of the Global datastore. 
   */
  public fun globalReplicationGroupId(globalReplicationGroupId: String) {
    cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
  }

  /**
   * The network type you choose when creating a replication group, either `ipv4` | `ipv6` .
   *
   * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
   * version 1.6.6 on all instances built on the [Nitro system](https://docs.aws.amazon.com/ec2/nitro/)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-ipdiscovery)
   * @param ipDiscovery The network type you choose when creating a replication group, either `ipv4`
   * | `ipv6` . 
   */
  public fun ipDiscovery(ipDiscovery: String) {
    cdkBuilder.ipDiscovery(ipDiscovery)
  }

  /**
   * The ID of the KMS key used to encrypt the disk on the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-kmskeyid)
   * @param kmsKeyId The ID of the KMS key used to encrypt the disk on the cluster. 
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * Specifies the destination, format and type of the logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
   * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
   */
  public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any) {
    _logDeliveryConfigurations.addAll(listOf(*logDeliveryConfigurations))
  }

  /**
   * Specifies the destination, format and type of the logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
   * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
   */
  public fun logDeliveryConfigurations(logDeliveryConfigurations: Collection<Any>) {
    _logDeliveryConfigurations.addAll(logDeliveryConfigurations)
  }

  /**
   * Specifies the destination, format and type of the logs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-logdeliveryconfigurations)
   * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
   */
  public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
    cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
  }

  /**
   * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
   *
   * For more information, see [Minimizing Downtime:
   * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
   * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
   * tolerance. 
   */
  public fun multiAzEnabled(multiAzEnabled: Boolean) {
    cdkBuilder.multiAzEnabled(multiAzEnabled)
  }

  /**
   * A flag indicating if you have Multi-AZ enabled to enhance fault tolerance.
   *
   * For more information, see [Minimizing Downtime:
   * Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-multiazenabled)
   * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
   * tolerance. 
   */
  public fun multiAzEnabled(multiAzEnabled: IResolvable) {
    cdkBuilder.multiAzEnabled(multiAzEnabled)
  }

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   *
   * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
   * version 1.6.6 on all instances built on the [Nitro system](https://docs.aws.amazon.com/ec2/nitro/)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-networktype)
   * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . 
   */
  public fun networkType(networkType: String) {
    cdkBuilder.networkType(networkType)
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Redis cluster node group.
   *
   * If you set
   * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
   * to `true` , you can update `NodeGroupConfiguration` without interruption. When
   * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
   * results in
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
   * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
   * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache (ElastiCache)
   * Redis cluster node group. 
   */
  public fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any) {
    _nodeGroupConfiguration.addAll(listOf(*nodeGroupConfiguration))
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Redis cluster node group.
   *
   * If you set
   * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
   * to `true` , you can update `NodeGroupConfiguration` without interruption. When
   * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
   * results in
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
   * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
   * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache (ElastiCache)
   * Redis cluster node group. 
   */
  public fun nodeGroupConfiguration(nodeGroupConfiguration: Collection<Any>) {
    _nodeGroupConfiguration.addAll(nodeGroupConfiguration)
  }

  /**
   * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource
   * that configures an Amazon ElastiCache (ElastiCache) Redis cluster node group.
   *
   * If you set
   * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
   * to `true` , you can update `NodeGroupConfiguration` without interruption. When
   * `UseOnlineResharding` is set to `false` , or is not specified, updating `NodeGroupConfiguration`
   * results in
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-nodegroupconfiguration)
   * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
   * `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache (ElastiCache)
   * Redis cluster node group. 
   */
  public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
    cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   *
   *
   * The Amazon SNS topic owner must be the same as the cluster owner.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-notificationtopicarn)
   * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
   * Service (SNS) topic to which notifications are sent. 
   */
  public fun notificationTopicArn(notificationTopicArn: String) {
    cdkBuilder.notificationTopicArn(notificationTopicArn)
  }

  /**
   * The number of clusters this replication group initially has.
   *
   * This parameter is not used if there is more than one node group (shard). You should use
   * `ReplicasPerNodeGroup` instead.
   *
   * If `AutomaticFailoverEnabled` is `true` , the value of this parameter must be at least 2. If
   * `AutomaticFailoverEnabled` is `false` you can omit this parameter (it will default to 1), or you
   * can explicitly set it to a value between 2 and 6.
   *
   * The maximum permitted value for `NumCacheClusters` is 6 (1 primary plus 5 replicas).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numcacheclusters)
   * @param numCacheClusters The number of clusters this replication group initially has. 
   */
  public fun numCacheClusters(numCacheClusters: Number) {
    cdkBuilder.numCacheClusters(numCacheClusters)
  }

  /**
   * An optional parameter that specifies the number of node groups (shards) for this Redis (cluster
   * mode enabled) replication group.
   *
   * For Redis (cluster mode disabled) either omit this parameter or set it to 1.
   *
   * If you set
   * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
   * to `true` , you can update `NumNodeGroups` without interruption. When `UseOnlineResharding` is set
   * to `false` , or is not specified, updating `NumNodeGroups` results in
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   *
   * Default: 1
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-numnodegroups)
   * @param numNodeGroups An optional parameter that specifies the number of node groups (shards)
   * for this Redis (cluster mode enabled) replication group. 
   */
  public fun numNodeGroups(numNodeGroups: Number) {
    cdkBuilder.numNodeGroups(numNodeGroups)
  }

  /**
   * The port number on which each member of the replication group accepts connections.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-port)
   * @param port The port number on which each member of the replication group accepts connections. 
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * A list of EC2 Availability Zones in which the replication group's clusters are created.
   *
   * The order of the Availability Zones in the list is the order in which clusters are allocated.
   * The primary cluster is created in the first AZ in the list.
   *
   * This parameter is not used if there is more than one node group (shard). You should use
   * `NodeGroupConfiguration` instead.
   *
   *
   * If you are creating your replication group in an Amazon VPC (recommended), you can only locate
   * clusters in Availability Zones associated with the subnets in the selected subnet group.
   *
   * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
   *
   *
   * Default: system chosen Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
   * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
   * group's clusters are created. 
   */
  public fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String) {
    _preferredCacheClusterAZs.addAll(listOf(*preferredCacheClusterAZs))
  }

  /**
   * A list of EC2 Availability Zones in which the replication group's clusters are created.
   *
   * The order of the Availability Zones in the list is the order in which clusters are allocated.
   * The primary cluster is created in the first AZ in the list.
   *
   * This parameter is not used if there is more than one node group (shard). You should use
   * `NodeGroupConfiguration` instead.
   *
   *
   * If you are creating your replication group in an Amazon VPC (recommended), you can only locate
   * clusters in Availability Zones associated with the subnets in the selected subnet group.
   *
   * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
   *
   *
   * Default: system chosen Availability Zones.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredcacheclusterazs)
   * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
   * group's clusters are created. 
   */
  public fun preferredCacheClusterAZs(preferredCacheClusterAZs: Collection<String>) {
    _preferredCacheClusterAZs.addAll(preferredCacheClusterAZs)
  }

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   *
   * It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi (24H Clock UTC). The minimum
   * maintenance window is a 60 minute period.
   *
   * Valid values for `ddd` are:
   *
   * * `sun`
   * * `mon`
   * * `tue`
   * * `wed`
   * * `thu`
   * * `fri`
   * * `sat`
   *
   * Example: `sun:23:00-mon:01:30`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-preferredmaintenancewindow)
   * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
   * the cluster is performed. 
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * The identifier of the cluster that serves as the primary for this replication group.
   *
   * This cluster must already exist and have a status of `available` .
   *
   * This parameter is not required if `NumCacheClusters` , `NumNodeGroups` , or
   * `ReplicasPerNodeGroup` is specified.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-primaryclusterid)
   * @param primaryClusterId The identifier of the cluster that serves as the primary for this
   * replication group. 
   */
  public fun primaryClusterId(primaryClusterId: String) {
    cdkBuilder.primaryClusterId(primaryClusterId)
  }

  /**
   * An optional parameter that specifies the number of replica nodes in each node group (shard).
   *
   * Valid values are 0 to 5.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicaspernodegroup)
   * @param replicasPerNodeGroup An optional parameter that specifies the number of replica nodes in
   * each node group (shard). 
   */
  public fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
    cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
  }

  /**
   * A user-created description for the replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupdescription)
   * @param replicationGroupDescription A user-created description for the replication group. 
   */
  public fun replicationGroupDescription(replicationGroupDescription: String) {
    cdkBuilder.replicationGroupDescription(replicationGroupDescription)
  }

  /**
   * The replication group identifier. This parameter is stored as a lowercase string.
   *
   * Constraints:
   *
   * * A name must contain from 1 to 40 alphanumeric characters or hyphens.
   * * The first character must be a letter.
   * * A name cannot end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-replicationgroupid)
   * @param replicationGroupId The replication group identifier. This parameter is stored as a
   * lowercase string. 
   */
  public fun replicationGroupId(replicationGroupId: String) {
    cdkBuilder.replicationGroupId(replicationGroupId)
  }

  /**
   * One or more Amazon VPC security groups associated with this replication group.
   *
   * Use this parameter only when you are creating a replication group in an Amazon Virtual Private
   * Cloud (Amazon VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
   * @param securityGroupIds One or more Amazon VPC security groups associated with this replication
   * group. 
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * One or more Amazon VPC security groups associated with this replication group.
   *
   * Use this parameter only when you are creating a replication group in an Amazon Virtual Private
   * Cloud (Amazon VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-securitygroupids)
   * @param securityGroupIds One or more Amazon VPC security groups associated with this replication
   * group. 
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB snapshot files
   * stored in Amazon S3.
   *
   * The snapshot files are used to populate the new replication group. The Amazon S3 object name in
   * the ARN cannot contain any commas. The new replication group will have the number of node groups
   * (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
   * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
   *
   * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
   * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB
   * snapshot files stored in Amazon S3. 
   */
  public fun snapshotArns(vararg snapshotArns: String) {
    _snapshotArns.addAll(listOf(*snapshotArns))
  }

  /**
   * A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB snapshot files
   * stored in Amazon S3.
   *
   * The snapshot files are used to populate the new replication group. The Amazon S3 object name in
   * the ARN cannot contain any commas. The new replication group will have the number of node groups
   * (console: shards) specified by the parameter *NumNodeGroups* or the number of node groups
   * configured by *NodeGroupConfiguration* regardless of the number of ARNs specified here.
   *
   * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotarns)
   * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Redis RDB
   * snapshot files stored in Amazon S3. 
   */
  public fun snapshotArns(snapshotArns: Collection<String>) {
    _snapshotArns.addAll(snapshotArns)
  }

  /**
   * The name of a snapshot from which to restore data into the new replication group.
   *
   * The snapshot status changes to `restoring` while the new replication group is being created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotname)
   * @param snapshotName The name of a snapshot from which to restore data into the new replication
   * group. 
   */
  public fun snapshotName(snapshotName: String) {
    cdkBuilder.snapshotName(snapshotName)
  }

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   *
   * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot that was taken today is
   * retained for 5 days before being deleted.
   *
   * Default: 0 (i.e., automatic backups are disabled for this cluster).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotretentionlimit)
   * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
   * snapshots before deleting them. 
   */
  public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
    cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
  }

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   *
   * Example: `05:00-09:00`
   *
   * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
   * range.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshotwindow)
   * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
   * daily snapshot of your node group (shard). 
   */
  public fun snapshotWindow(snapshotWindow: String) {
    cdkBuilder.snapshotWindow(snapshotWindow)
  }

  /**
   * The cluster ID that is used as the daily snapshot source for the replication group.
   *
   * This parameter cannot be set for Redis (cluster mode enabled) replication groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-snapshottingclusterid)
   * @param snapshottingClusterId The cluster ID that is used as the daily snapshot source for the
   * replication group. 
   */
  public fun snapshottingClusterId(snapshottingClusterId: String) {
    cdkBuilder.snapshottingClusterId(snapshottingClusterId)
  }

  /**
   * A list of tags to be added to this resource.
   *
   * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
   * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey` ,
   * Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
   * @param tags A list of tags to be added to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags to be added to this resource.
   *
   * Tags are comma-separated key,value pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can
   * include multiple tags as shown following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey` ,
   * Value= `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-tags)
   * @param tags A list of tags to be added to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A flag that enables in-transit encryption when set to `true` .
   *
   * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
   * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
   * you create a cluster.
   *
   * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
   * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
   *
   * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
   *
   * *Required:* Only available when creating a replication group in an Amazon VPC using redis
   * version `3.2.6` or `4.x` onward.
   *
   * Default: `false`
   *
   *
   * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken` ,
   * and a `CacheSubnetGroup` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
   * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true` . 
   */
  public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  /**
   * A flag that enables in-transit encryption when set to `true` .
   *
   * You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created. To
   * enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to `true` when
   * you create a cluster.
   *
   * This parameter is valid only if the `Engine` parameter is `redis` , the `EngineVersion`
   * parameter is `3.2.6` or `4.x` onward, and the cluster is being created in an Amazon VPC.
   *
   * If you enable in-transit encryption, you must also specify a value for `CacheSubnetGroup` .
   *
   * *Required:* Only available when creating a replication group in an Amazon VPC using redis
   * version `3.2.6` or `4.x` onward.
   *
   * Default: `false`
   *
   *
   * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken` ,
   * and a `CacheSubnetGroup` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionenabled)
   * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true` . 
   */
  public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
  }

  /**
   * A setting that allows you to migrate your clients to use in-transit encryption, with no
   * downtime.
   *
   * When setting `TransitEncryptionEnabled` to `true` , you can set your `TransitEncryptionMode` to
   * `preferred` in the same request, to allow both encrypted and unencrypted connections at the same
   * time. Once you migrate all your Redis clients to use encrypted connections you can modify the
   * value to `required` to allow encrypted connections only.
   *
   * Setting `TransitEncryptionMode` to `required` is a two-step process that requires you to first
   * set the `TransitEncryptionMode` to `preferred` , after that you can set `TransitEncryptionMode` to
   * `required` .
   *
   * This process will not trigger the replacement of the replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-transitencryptionmode)
   * @param transitEncryptionMode A setting that allows you to migrate your clients to use
   * in-transit encryption, with no downtime. 
   */
  public fun transitEncryptionMode(transitEncryptionMode: String) {
    cdkBuilder.transitEncryptionMode(transitEncryptionMode)
  }

  /**
   * The ID of user group to associate with the replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
   * @param userGroupIds The ID of user group to associate with the replication group. 
   */
  public fun userGroupIds(vararg userGroupIds: String) {
    _userGroupIds.addAll(listOf(*userGroupIds))
  }

  /**
   * The ID of user group to associate with the replication group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html#cfn-elasticache-replicationgroup-usergroupids)
   * @param userGroupIds The ID of user group to associate with the replication group. 
   */
  public fun userGroupIds(userGroupIds: Collection<String>) {
    _userGroupIds.addAll(userGroupIds)
  }

  public fun build(): CfnReplicationGroup {
    if(_cacheSecurityGroupNames.isNotEmpty())
        cdkBuilder.cacheSecurityGroupNames(_cacheSecurityGroupNames)
    if(_logDeliveryConfigurations.isNotEmpty())
        cdkBuilder.logDeliveryConfigurations(_logDeliveryConfigurations)
    if(_nodeGroupConfiguration.isNotEmpty())
        cdkBuilder.nodeGroupConfiguration(_nodeGroupConfiguration)
    if(_preferredCacheClusterAZs.isNotEmpty())
        cdkBuilder.preferredCacheClusterAZs(_preferredCacheClusterAZs)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_userGroupIds.isNotEmpty()) cdkBuilder.userGroupIds(_userGroupIds)
    return cdkBuilder.build()
  }
}
