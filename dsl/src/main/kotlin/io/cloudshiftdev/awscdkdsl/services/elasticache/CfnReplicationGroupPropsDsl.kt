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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps

/**
 * Properties for defining a `CfnReplicationGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * CfnReplicationGroupProps cfnReplicationGroupProps = CfnReplicationGroupProps.builder()
 * .replicationGroupDescription("replicationGroupDescription")
 * // the properties below are optional
 * .atRestEncryptionEnabled(false)
 * .authToken("authToken")
 * .automaticFailoverEnabled(false)
 * .autoMinorVersionUpgrade(false)
 * .cacheNodeType("cacheNodeType")
 * .cacheParameterGroupName("cacheParameterGroupName")
 * .cacheSecurityGroupNames(List.of("cacheSecurityGroupNames"))
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .clusterMode("clusterMode")
 * .dataTieringEnabled(false)
 * .engine("engine")
 * .engineVersion("engineVersion")
 * .globalReplicationGroupId("globalReplicationGroupId")
 * .ipDiscovery("ipDiscovery")
 * .kmsKeyId("kmsKeyId")
 * .logDeliveryConfigurations(List.of(LogDeliveryConfigurationRequestProperty.builder()
 * .destinationDetails(DestinationDetailsProperty.builder()
 * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
 * .deliveryStream("deliveryStream")
 * .build())
 * .build())
 * .destinationType("destinationType")
 * .logFormat("logFormat")
 * .logType("logType")
 * .build()))
 * .multiAzEnabled(false)
 * .networkType("networkType")
 * .nodeGroupConfiguration(List.of(NodeGroupConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .primaryAvailabilityZone("primaryAvailabilityZone")
 * .replicaAvailabilityZones(List.of("replicaAvailabilityZones"))
 * .replicaCount(123)
 * .slots("slots")
 * .build()))
 * .notificationTopicArn("notificationTopicArn")
 * .numCacheClusters(123)
 * .numNodeGroups(123)
 * .port(123)
 * .preferredCacheClusterAZs(List.of("preferredCacheClusterAZs"))
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .primaryClusterId("primaryClusterId")
 * .replicasPerNodeGroup(123)
 * .replicationGroupId("replicationGroupId")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snapshotArns(List.of("snapshotArns"))
 * .snapshotName("snapshotName")
 * .snapshotRetentionLimit(123)
 * .snapshottingClusterId("snapshottingClusterId")
 * .snapshotWindow("snapshotWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitEncryptionEnabled(false)
 * .transitEncryptionMode("transitEncryptionMode")
 * .userGroupIds(List.of("userGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-replicationgroup.html)
 */
@CdkDslMarker
public class CfnReplicationGroupPropsDsl {
    private val cdkBuilder: CfnReplicationGroupProps.Builder = CfnReplicationGroupProps.builder()

    private val _cacheSecurityGroupNames: MutableList<String> = mutableListOf()

    private val _logDeliveryConfigurations: MutableList<Any> = mutableListOf()

    private val _nodeGroupConfiguration: MutableList<Any> = mutableListOf()

    private val _preferredCacheClusterAZs: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _snapshotArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userGroupIds: MutableList<String> = mutableListOf()

    /**
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` .
     *   You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     *   created. To enable encryption at rest on a replication group you must set
     *   `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using redis
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
        cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    /**
     * @param atRestEncryptionEnabled A flag that enables encryption at rest when set to `true` .
     *   You cannot modify the value of `AtRestEncryptionEnabled` after the replication group is
     *   created. To enable encryption at rest on a replication group you must set
     *   `AtRestEncryptionEnabled` to `true` when you create the replication group.
     *
     * *Required:* Only available when creating a replication group in an Amazon VPC using redis
     * version `3.2.6` or `4.x` onward.
     *
     * Default: `false`
     */
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
        cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    /**
     * @param authToken *Reserved parameter.* The password used to access a password protected
     *   server. `AuthToken` can be specified only on replication groups where
     *   `TransitEncryptionEnabled` is `true` . For more information, see
     *   [Authenticating Users with the Redis AUTH Command](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/auth.html)
     *   .
     *
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     *
     * Password constraints:
     * * Must be only printable ASCII characters.
     * * Must be at least 16 characters and no more than 128 characters in length.
     * * Nonalphanumeric characters are restricted to (!, &amp;, #, $, ^, &lt;, &gt;, -, ).
     *
     * For more information, see
     * [AUTH password](https://docs.aws.amazon.com/http://redis.io/commands/AUTH) at
     * http://redis.io/commands/AUTH.
     *
     * If ADDING the AuthToken, update requires
     * [Replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     */
    public fun authToken(authToken: String) {
        cdkBuilder.authToken(authToken)
    }

    /**
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     *   parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     *   parameter is disabled for previous versions.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     *   parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     *   parameter is disabled for previous versions.
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     *   promoted to read/write primary if the existing primary fails. `AutomaticFailoverEnabled`
     *   must be enabled for Redis (cluster mode enabled) replication groups.
     *
     * Default: false
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
        cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    /**
     * @param automaticFailoverEnabled Specifies whether a read-only replica is automatically
     *   promoted to read/write primary if the existing primary fails. `AutomaticFailoverEnabled`
     *   must be enabled for Redis (cluster mode enabled) replication groups.
     *
     * Default: false
     */
    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
        cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    /**
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard).
     *   The following node types are supported by ElastiCache. Generally speaking, the current
     *   generation types provide more memory and computational power at lower cost when compared to
     *   their equivalent previous generation counterparts.
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.12xlarge` , `cache.m6g.24xlarge`
     *
     * *M5 node types:* `cache.m5.large` , `cache.m5.xlarge` , `cache.m5.2xlarge` ,
     * `cache.m5.4xlarge` , `cache.m5.12xlarge` , `cache.m5.24xlarge`
     *
     * *M4 node types:* `cache.m4.large` , `cache.m4.xlarge` , `cache.m4.2xlarge` ,
     * `cache.m4.4xlarge` , `cache.m4.10xlarge`
     *
     * *T4g node types:* `cache.t4g.micro` , `cache.t4g.small` , `cache.t4g.medium`
     *
     * *T3 node types:* `cache.t3.micro` , `cache.t3.small` , `cache.t3.medium`
     *
     * *T2 node types:* `cache.t2.micro` , `cache.t2.small` , `cache.t2.medium`
     * * Previous generation: (not recommended)
     *
     * *T1 node types:* `cache.t1.micro`
     *
     * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
     *
     * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` ,
     * `cache.m3.2xlarge`
     * * Compute optimized:
     * * Previous generation: (not recommended)
     *
     * *C1 node types:* `cache.c1.xlarge`
     * * Memory optimized:
     * * Current generation:
     *
     * *R6gd node types:* `cache.r6gd.xlarge` , `cache.r6gd.2xlarge` , `cache.r6gd.4xlarge` ,
     * `cache.r6gd.8xlarge` , `cache.r6gd.12xlarge` , `cache.r6gd.16xlarge`
     *
     * The `r6gd` family is available in the following regions: `us-east-2` , `us-east-1` ,
     * `us-west-2` , `us-west-1` , `eu-west-1` , `eu-central-1` , `ap-northeast-1` ,
     * `ap-southeast-1` , `ap-southeast-2` .
     *
     * *R6g node types:* `cache.r6g.large` , `cache.r6g.xlarge` , `cache.r6g.2xlarge` ,
     * `cache.r6g.4xlarge` , `cache.r6g.12xlarge` , `cache.r6g.24xlarge`
     *
     * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` ,
     * `cache.r5.4xlarge` , `cache.r5.12xlarge` , `cache.r5.24xlarge`
     *
     * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` ,
     * `cache.r4.4xlarge` , `cache.r4.8xlarge` , `cache.r4.16xlarge`
     * * Previous generation: (not recommended)
     *
     * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
     *
     * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` ,
     * `cache.r3.4xlarge` , `cache.r3.8xlarge`
     *
     * For region availability, see
     * [Supported Node Types by Amazon Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     */
    public fun cacheNodeType(cacheNodeType: String) {
        cdkBuilder.cacheNodeType(cacheNodeType)
    }

    /**
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     *   replication group. If this argument is omitted, the default cache parameter group for the
     *   specified engine is used.
     *
     * If you are running Redis version 3.2.4 or later, only one node group (shard), and want to use
     * a default parameter group, we recommend that you specify the parameter group by name.
     * * To create a Redis (cluster mode disabled) replication group, use
     *   `CacheParameterGroupName=default.redis3.2` .
     * * To create a Redis (cluster mode enabled) replication group, use
     *   `CacheParameterGroupName=default.redis3.2.cluster.on` .
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String) {
        cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     *   replication group.
     */
    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String) {
        _cacheSecurityGroupNames.addAll(listOf(*cacheSecurityGroupNames))
    }

    /**
     * @param cacheSecurityGroupNames A list of cache security group names to associate with this
     *   replication group.
     */
    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: Collection<String>) {
        _cacheSecurityGroupNames.addAll(cacheSecurityGroupNames)
    }

    /**
     * @param cacheSubnetGroupName The name of the cache subnet group to be used for the replication
     *   group.
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * [AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
        cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * @param clusterMode Enabled or Disabled. To modify cluster mode from Disabled to Enabled, you
     *   must first set the cluster mode to Compatible. Compatible mode allows your Redis clients to
     *   connect using both cluster mode enabled and cluster mode disabled. After you migrate all
     *   Redis clients to use cluster mode enabled, you can then complete cluster mode configuration
     *   and set the cluster mode to Enabled. For more information, see
     *   [Modify cluster mode](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/modify-cluster-mode.html)
     *   .
     */
    public fun clusterMode(clusterMode: String) {
        cdkBuilder.clusterMode(clusterMode)
    }

    /**
     * @param dataTieringEnabled Enables data tiering. Data tiering is only supported for
     *   replication groups using the r6gd node type. This parameter must be set to true when using
     *   r6gd nodes. For more information, see
     *   [Data tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/data-tiering.html)
     *   .
     */
    public fun dataTieringEnabled(dataTieringEnabled: Boolean) {
        cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    /**
     * @param dataTieringEnabled Enables data tiering. Data tiering is only supported for
     *   replication groups using the r6gd node type. This parameter must be set to true when using
     *   r6gd nodes. For more information, see
     *   [Data tiering](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/data-tiering.html)
     *   .
     */
    public fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
        cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    /**
     * @param engine The name of the cache engine to be used for the clusters in this replication
     *   group. The value must be set to `Redis` .
     */
    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    /**
     * @param engineVersion The version number of the cache engine to be used for the clusters in
     *   this replication group. To view the supported cache engine versions, use the
     *   `DescribeCacheEngineVersions` operation.
     *
     * *Important:* You can upgrade to a newer engine version (see
     * [Selecting a Cache Engine and Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ) in the *ElastiCache User Guide* , but you cannot downgrade to an earlier engine version. If
     * you want to use an earlier engine version, you must delete the existing cluster or
     * replication group and create it anew with the earlier engine version.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /** @param globalReplicationGroupId The name of the Global datastore. */
    public fun globalReplicationGroupId(globalReplicationGroupId: String) {
        cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
    }

    /**
     * @param ipDiscovery The network type you choose when creating a replication group, either
     *   `ipv4` | `ipv6` . IPv6 is supported for workloads using Redis engine version 6.2 onward or
     *   Memcached engine version 1.6.6 on all instances built on the
     *   [Nitro system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    public fun ipDiscovery(ipDiscovery: String) {
        cdkBuilder.ipDiscovery(ipDiscovery)
    }

    /** @param kmsKeyId The ID of the KMS key used to encrypt the disk on the cluster. */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /** @param logDeliveryConfigurations Specifies the destination, format and type of the logs. */
    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any) {
        _logDeliveryConfigurations.addAll(listOf(*logDeliveryConfigurations))
    }

    /** @param logDeliveryConfigurations Specifies the destination, format and type of the logs. */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: Collection<Any>) {
        _logDeliveryConfigurations.addAll(logDeliveryConfigurations)
    }

    /** @param logDeliveryConfigurations Specifies the destination, format and type of the logs. */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
        cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    /**
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     *   tolerance. For more information, see
     *   [Minimizing Downtime: Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html)
     *   .
     */
    public fun multiAzEnabled(multiAzEnabled: Boolean) {
        cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    /**
     * @param multiAzEnabled A flag indicating if you have Multi-AZ enabled to enhance fault
     *   tolerance. For more information, see
     *   [Minimizing Downtime: Multi-AZ](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/AutoFailover.html)
     *   .
     */
    public fun multiAzEnabled(multiAzEnabled: IResolvable) {
        cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    /**
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . IPv6 is supported for
     *   workloads using Redis engine version 6.2 onward or Memcached engine version 1.6.6 on all
     *   instances built on the [Nitro system](https://docs.aws.amazon.com/ec2/nitro/) .
     */
    public fun networkType(networkType: String) {
        cdkBuilder.networkType(networkType)
    }

    /**
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     *   `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     *   (ElastiCache) Redis cluster node group. If you set
     *   [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     *   to `true` , you can update `NodeGroupConfiguration` without interruption. When
     *   `UseOnlineResharding` is set to `false` , or is not specified, updating
     *   `NodeGroupConfiguration` results in
     *   [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     *   .
     */
    public fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any) {
        _nodeGroupConfiguration.addAll(listOf(*nodeGroupConfiguration))
    }

    /**
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     *   `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     *   (ElastiCache) Redis cluster node group. If you set
     *   [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     *   to `true` , you can update `NodeGroupConfiguration` without interruption. When
     *   `UseOnlineResharding` is set to `false` , or is not specified, updating
     *   `NodeGroupConfiguration` results in
     *   [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     *   .
     */
    public fun nodeGroupConfiguration(nodeGroupConfiguration: Collection<Any>) {
        _nodeGroupConfiguration.addAll(nodeGroupConfiguration)
    }

    /**
     * @param nodeGroupConfiguration `NodeGroupConfiguration` is a property of the
     *   `AWS::ElastiCache::ReplicationGroup` resource that configures an Amazon ElastiCache
     *   (ElastiCache) Redis cluster node group. If you set
     *   [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     *   to `true` , you can update `NodeGroupConfiguration` without interruption. When
     *   `UseOnlineResharding` is set to `false` , or is not specified, updating
     *   `NodeGroupConfiguration` results in
     *   [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     *   .
     */
    public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
        cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration)
    }

    /**
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     *   Service (SNS) topic to which notifications are sent.
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     */
    public fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * @param numCacheClusters The number of clusters this replication group initially has. This
     *   parameter is not used if there is more than one node group (shard). You should use
     *   `ReplicasPerNodeGroup` instead.
     *
     * If `AutomaticFailoverEnabled` is `true` , the value of this parameter must be at least 2. If
     * `AutomaticFailoverEnabled` is `false` you can omit this parameter (it will default to 1), or
     * you can explicitly set it to a value between 2 and 6.
     *
     * The maximum permitted value for `NumCacheClusters` is 6 (1 primary plus 5 replicas).
     */
    public fun numCacheClusters(numCacheClusters: Number) {
        cdkBuilder.numCacheClusters(numCacheClusters)
    }

    /**
     * @param numNodeGroups An optional parameter that specifies the number of node groups (shards)
     *   for this Redis (cluster mode enabled) replication group. For Redis (cluster mode disabled)
     *   either omit this parameter or set it to 1.
     *
     * If you set
     * [UseOnlineResharding](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * to `true` , you can update `NumNodeGroups` without interruption. When `UseOnlineResharding`
     * is set to `false` , or is not specified, updating `NumNodeGroups` results in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * Default: 1
     */
    public fun numNodeGroups(numNodeGroups: Number) {
        cdkBuilder.numNodeGroups(numNodeGroups)
    }

    /**
     * @param port The port number on which each member of the replication group accepts
     *   connections.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     *   group's clusters are created. The order of the Availability Zones in the list is the order
     *   in which clusters are allocated. The primary cluster is created in the first AZ in the
     *   list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet
     * group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     * Default: system chosen Availability Zones.
     */
    public fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String) {
        _preferredCacheClusterAZs.addAll(listOf(*preferredCacheClusterAZs))
    }

    /**
     * @param preferredCacheClusterAZs A list of EC2 Availability Zones in which the replication
     *   group's clusters are created. The order of the Availability Zones in the list is the order
     *   in which clusters are allocated. The primary cluster is created in the first AZ in the
     *   list.
     *
     * This parameter is not used if there is more than one node group (shard). You should use
     * `NodeGroupConfiguration` instead.
     *
     * If you are creating your replication group in an Amazon VPC (recommended), you can only
     * locate clusters in Availability Zones associated with the subnets in the selected subnet
     * group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheClusters` .
     *
     * Default: system chosen Availability Zones.
     */
    public fun preferredCacheClusterAZs(preferredCacheClusterAZs: Collection<String>) {
        _preferredCacheClusterAZs.addAll(preferredCacheClusterAZs)
    }

    /**
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     *   the cluster is performed. It is specified as a range in the format ddd:hh24:mi-ddd:hh24:mi
     *   (24H Clock UTC). The minimum maintenance window is a 60 minute period.
     *
     * Valid values for `ddd` are:
     * * `sun`
     * * `mon`
     * * `tue`
     * * `wed`
     * * `thu`
     * * `fri`
     * * `sat`
     *
     * Example: `sun:23:00-mon:01:30`
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param primaryClusterId The identifier of the cluster that serves as the primary for this
     *   replication group. This cluster must already exist and have a status of `available` .
     *
     * This parameter is not required if `NumCacheClusters` , `NumNodeGroups` , or
     * `ReplicasPerNodeGroup` is specified.
     */
    public fun primaryClusterId(primaryClusterId: String) {
        cdkBuilder.primaryClusterId(primaryClusterId)
    }

    /**
     * @param replicasPerNodeGroup An optional parameter that specifies the number of replica nodes
     *   in each node group (shard). Valid values are 0 to 5.
     */
    public fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
        cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
    }

    /** @param replicationGroupDescription A user-created description for the replication group. */
    public fun replicationGroupDescription(replicationGroupDescription: String) {
        cdkBuilder.replicationGroupDescription(replicationGroupDescription)
    }

    /**
     * @param replicationGroupId The replication group identifier. This parameter is stored as a
     *   lowercase string. Constraints:
     * * A name must contain from 1 to 40 alphanumeric characters or hyphens.
     * * The first character must be a letter.
     * * A name cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
    }

    /**
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     *   replication group. Use this parameter only when you are creating a replication group in an
     *   Amazon Virtual Private Cloud (Amazon VPC).
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds One or more Amazon VPC security groups associated with this
     *   replication group. Use this parameter only when you are creating a replication group in an
     *   Amazon Virtual Private Cloud (Amazon VPC).
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     *   RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new
     *   replication group. The Amazon S3 object name in the ARN cannot contain any commas. The new
     *   replication group will have the number of node groups (console: shards) specified by the
     *   parameter *NumNodeGroups* or the number of node groups configured by
     *   *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    public fun snapshotArns(vararg snapshotArns: String) {
        _snapshotArns.addAll(listOf(*snapshotArns))
    }

    /**
     * @param snapshotArns A list of Amazon Resource Names (ARN) that uniquely identify the Redis
     *   RDB snapshot files stored in Amazon S3. The snapshot files are used to populate the new
     *   replication group. The Amazon S3 object name in the ARN cannot contain any commas. The new
     *   replication group will have the number of node groups (console: shards) specified by the
     *   parameter *NumNodeGroups* or the number of node groups configured by
     *   *NodeGroupConfiguration* regardless of the number of ARNs specified here.
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     */
    public fun snapshotArns(snapshotArns: Collection<String>) {
        _snapshotArns.addAll(snapshotArns)
    }

    /**
     * @param snapshotName The name of a snapshot from which to restore data into the new
     *   replication group. The snapshot status changes to `restoring` while the new replication
     *   group is being created.
     */
    public fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     *   snapshots before deleting them. For example, if you set `SnapshotRetentionLimit` to 5, a
     *   snapshot that was taken today is retained for 5 days before being deleted.
     *
     * Default: 0 (i.e., automatic backups are disabled for this cluster).
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
        cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    /**
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     *   daily snapshot of your node group (shard). Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     */
    public fun snapshotWindow(snapshotWindow: String) {
        cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * @param snapshottingClusterId The cluster ID that is used as the daily snapshot source for the
     *   replication group. This parameter cannot be set for Redis (cluster mode enabled)
     *   replication groups.
     */
    public fun snapshottingClusterId(snapshottingClusterId: String) {
        cdkBuilder.snapshottingClusterId(snapshottingClusterId)
    }

    /**
     * @param tags A list of tags to be added to this resource. Tags are comma-separated key,value
     *   pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can include multiple tags as shown
     *   following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey` , Value=
     *   `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags to be added to this resource. Tags are comma-separated key,value
     *   pairs (e.g. Key= `myKey` , Value= `myKeyValue` . You can include multiple tags as shown
     *   following: Key= `myKey` , Value= `myKeyValue` Key= `mySecondKey` , Value=
     *   `mySecondKeyValue` . Tags on replication groups will be replicated to all nodes.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     *   . You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created.
     *   To enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to
     *   `true` when you create a cluster.
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
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
        cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to `true`
     *   . You cannot modify the value of `TransitEncryptionEnabled` after the cluster is created.
     *   To enable in-transit encryption on a cluster you must set `TransitEncryptionEnabled` to
     *   `true` when you create a cluster.
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
     * For HIPAA compliance, you must specify `TransitEncryptionEnabled` as `true` , an `AuthToken`
     * , and a `CacheSubnetGroup` .
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
        cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * @param transitEncryptionMode A setting that allows you to migrate your clients to use
     *   in-transit encryption, with no downtime. When setting `TransitEncryptionEnabled` to `true`
     *   , you can set your `TransitEncryptionMode` to `preferred` in the same request, to allow
     *   both encrypted and unencrypted connections at the same time. Once you migrate all your
     *   Redis clients to use encrypted connections you can modify the value to `required` to allow
     *   encrypted connections only.
     *
     * Setting `TransitEncryptionMode` to `required` is a two-step process that requires you to
     * first set the `TransitEncryptionMode` to `preferred` , after that you can set
     * `TransitEncryptionMode` to `required` .
     *
     * This process will not trigger the replacement of the replication group.
     */
    public fun transitEncryptionMode(transitEncryptionMode: String) {
        cdkBuilder.transitEncryptionMode(transitEncryptionMode)
    }

    /** @param userGroupIds The ID of user group to associate with the replication group. */
    public fun userGroupIds(vararg userGroupIds: String) {
        _userGroupIds.addAll(listOf(*userGroupIds))
    }

    /** @param userGroupIds The ID of user group to associate with the replication group. */
    public fun userGroupIds(userGroupIds: Collection<String>) {
        _userGroupIds.addAll(userGroupIds)
    }

    public fun build(): CfnReplicationGroupProps {
        if (_cacheSecurityGroupNames.isNotEmpty())
            cdkBuilder.cacheSecurityGroupNames(_cacheSecurityGroupNames)
        if (_logDeliveryConfigurations.isNotEmpty())
            cdkBuilder.logDeliveryConfigurations(_logDeliveryConfigurations)
        if (_nodeGroupConfiguration.isNotEmpty())
            cdkBuilder.nodeGroupConfiguration(_nodeGroupConfiguration)
        if (_preferredCacheClusterAZs.isNotEmpty())
            cdkBuilder.preferredCacheClusterAZs(_preferredCacheClusterAZs)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userGroupIds.isNotEmpty()) cdkBuilder.userGroupIds(_userGroupIds)
        return cdkBuilder.build()
    }
}
