@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ElastiCache::CacheCluster` type creates an Amazon ElastiCache cache cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnCacheCluster cfnCacheCluster = CfnCacheCluster.Builder.create(this, "MyCfnCacheCluster")
 * .cacheNodeType("cacheNodeType")
 * .engine("engine")
 * .numCacheNodes(123)
 * // the properties below are optional
 * .autoMinorVersionUpgrade(false)
 * .azMode("azMode")
 * .cacheParameterGroupName("cacheParameterGroupName")
 * .cacheSecurityGroupNames(List.of("cacheSecurityGroupNames"))
 * .cacheSubnetGroupName("cacheSubnetGroupName")
 * .clusterName("clusterName")
 * .engineVersion("engineVersion")
 * .ipDiscovery("ipDiscovery")
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
 * .networkType("networkType")
 * .notificationTopicArn("notificationTopicArn")
 * .port(123)
 * .preferredAvailabilityZone("preferredAvailabilityZone")
 * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .snapshotArns(List.of("snapshotArns"))
 * .snapshotName("snapshotName")
 * .snapshotRetentionLimit(123)
 * .snapshotWindow("snapshotWindow")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitEncryptionEnabled(false)
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html)
 */
public open class CfnCacheCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The DNS hostname of the cache node.
   *
   *
   * Redis (cluster mode disabled) replication groups don't have this attribute. Therefore,
   * `Fn::GetAtt` returns a value for this attribute only if the replication group is clustered.
   * Otherwise, `Fn::GetAtt` fails.
   */
  public open fun attrConfigurationEndpointAddress(): String =
      unwrap(this).getAttrConfigurationEndpointAddress()

  /**
   * The port number of the configuration endpoint for the Memcached cache cluster.
   *
   *
   * Redis (cluster mode disabled) replication groups don't have this attribute. Therefore,
   * `Fn::GetAtt` returns a value for this attribute only if the replication group is clustered.
   * Otherwise, `Fn::GetAtt` fails.
   */
  public open fun attrConfigurationEndpointPort(): String =
      unwrap(this).getAttrConfigurationEndpointPort()

  /**
   * The resource name.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The DNS address of the configuration endpoint for the Redis cache cluster.
   */
  public open fun attrRedisEndpointAddress(): String = unwrap(this).getAttrRedisEndpointAddress()

  /**
   * The port number of the configuration endpoint for the Redis cache cluster.
   */
  public open fun attrRedisEndpointPort(): String = unwrap(this).getAttrRedisEndpointPort()

  /**
   * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to
   * opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   */
  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  /**
   * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to
   * opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   */
  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  /**
   * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want to
   * opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
   * versions.
   */
  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone
   * or created across multiple Availability Zones in the cluster's region.
   */
  public open fun azMode(): String? = unwrap(this).getAzMode()

  /**
   * Specifies whether the nodes in this Memcached cluster are created in a single Availability Zone
   * or created across multiple Availability Zones in the cluster's region.
   */
  public open fun azMode(`value`: String) {
    unwrap(this).setAzMode(`value`)
  }

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   */
  public open fun cacheNodeType(): String = unwrap(this).getCacheNodeType()

  /**
   * The compute and memory capacity of the nodes in the node group (shard).
   */
  public open fun cacheNodeType(`value`: String) {
    unwrap(this).setCacheNodeType(`value`)
  }

  /**
   * The name of the parameter group to associate with this cluster.
   */
  public open fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  /**
   * The name of the parameter group to associate with this cluster.
   */
  public open fun cacheParameterGroupName(`value`: String) {
    unwrap(this).setCacheParameterGroupName(`value`)
  }

  /**
   * A list of security group names to associate with this cluster.
   */
  public open fun cacheSecurityGroupNames(): List<String> =
      unwrap(this).getCacheSecurityGroupNames() ?: emptyList()

  /**
   * A list of security group names to associate with this cluster.
   */
  public open fun cacheSecurityGroupNames(`value`: List<String>) {
    unwrap(this).setCacheSecurityGroupNames(`value`)
  }

  /**
   * A list of security group names to associate with this cluster.
   */
  public open fun cacheSecurityGroupNames(vararg `value`: String): Unit =
      cacheSecurityGroupNames(`value`.toList())

  /**
   * The name of the subnet group to be used for the cluster.
   */
  public open fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  /**
   * The name of the subnet group to be used for the cluster.
   */
  public open fun cacheSubnetGroupName(`value`: String) {
    unwrap(this).setCacheSubnetGroupName(`value`)
  }

  /**
   * A name for the cache cluster.
   */
  public open fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * A name for the cache cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The name of the cache engine to be used for this cluster.
   */
  public open fun engine(): String = unwrap(this).getEngine()

  /**
   * The name of the cache engine to be used for this cluster.
   */
  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  /**
   * The version number of the cache engine to be used for this cluster.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version number of the cache engine to be used for this cluster.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
   */
  public open fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  /**
   * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
   */
  public open fun ipDiscovery(`value`: String) {
    unwrap(this).setIpDiscovery(`value`)
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setLogDeliveryConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(`value`: List<Any>) {
    unwrap(this).setLogDeliveryConfigurations(`value`)
  }

  /**
   * Specifies the destination, format and type of the logs.
   */
  public open fun logDeliveryConfigurations(vararg `value`: Any): Unit =
      logDeliveryConfigurations(`value`.toList())

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   */
  public open fun networkType(): String? = unwrap(this).getNetworkType()

  /**
   * Must be either `ipv4` | `ipv6` | `dual_stack` .
   */
  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   */
  public open fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
   * notifications are sent.
   */
  public open fun notificationTopicArn(`value`: String) {
    unwrap(this).setNotificationTopicArn(`value`)
  }

  /**
   * The number of cache nodes that the cache cluster should have.
   */
  public open fun numCacheNodes(): Number = unwrap(this).getNumCacheNodes()

  /**
   * The number of cache nodes that the cache cluster should have.
   */
  public open fun numCacheNodes(`value`: Number) {
    unwrap(this).setNumCacheNodes(`value`)
  }

  /**
   * The port number on which each of the cache nodes accepts connections.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The port number on which each of the cache nodes accepts connections.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * The EC2 Availability Zone in which the cluster is created.
   */
  public open fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

  /**
   * The EC2 Availability Zone in which the cluster is created.
   */
  public open fun preferredAvailabilityZone(`value`: String) {
    unwrap(this).setPreferredAvailabilityZone(`value`)
  }

  /**
   * A list of the Availability Zones in which cache nodes are created.
   */
  public open fun preferredAvailabilityZones(): List<String> =
      unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

  /**
   * A list of the Availability Zones in which cache nodes are created.
   */
  public open fun preferredAvailabilityZones(`value`: List<String>) {
    unwrap(this).setPreferredAvailabilityZones(`value`)
  }

  /**
   * A list of the Availability Zones in which cache nodes are created.
   */
  public open fun preferredAvailabilityZones(vararg `value`: String): Unit =
      preferredAvailabilityZones(`value`.toList())

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * Specifies the weekly time range during which maintenance on the cluster is performed.
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies
   * a Redis RDB snapshot file stored in Amazon S3.
   */
  public open fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  /**
   * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies
   * a Redis RDB snapshot file stored in Amazon S3.
   */
  public open fun snapshotArns(`value`: List<String>) {
    unwrap(this).setSnapshotArns(`value`)
  }

  /**
   * A single-element string list containing an Amazon Resource Name (ARN) that uniquely identifies
   * a Redis RDB snapshot file stored in Amazon S3.
   */
  public open fun snapshotArns(vararg `value`: String): Unit = snapshotArns(`value`.toList())

  /**
   * The name of a Redis snapshot from which to restore data into the new node group (shard).
   */
  public open fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The name of a Redis snapshot from which to restore data into the new node group (shard).
   */
  public open fun snapshotName(`value`: String) {
    unwrap(this).setSnapshotName(`value`)
  }

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  /**
   * The number of days for which ElastiCache retains automatic snapshots before deleting them.
   */
  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   */
  public open fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  /**
   * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
   * node group (shard).
   */
  public open fun snapshotWindow(`value`: String) {
    unwrap(this).setSnapshotWindow(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A list of tags to be added to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A flag that enables in-transit encryption when set to true.
   */
  public open fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  /**
   * A flag that enables in-transit encryption when set to true.
   */
  public open fun transitEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setTransitEncryptionEnabled(`value`)
  }

  /**
   * A flag that enables in-transit encryption when set to true.
   */
  public open fun transitEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setTransitEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * One or more VPC security groups associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * One or more VPC security groups associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * One or more VPC security groups associated with the cluster.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnCacheCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want
     * to opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
     * versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    /**
     * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want
     * to opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
     * versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions. 
     */
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    /**
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability
     * Zone or created across multiple Availability Zones in the cluster's region.
     *
     * This parameter is only supported for Memcached clusters.
     *
     * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
     * `single-az` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-azmode)
     * @param azMode Specifies whether the nodes in this Memcached cluster are created in a single
     * Availability Zone or created across multiple Availability Zones in the cluster's region. 
     */
    public fun azMode(azMode: String)

    /**
     * The compute and memory capacity of the nodes in the node group (shard).
     *
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached
     * instance is currently not supported. If you need to scale using Memcached, we recommend forcing
     * a replacement update by changing the `LogicalResourceId` of the resource.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
     * `cache.m6g.24xlarge`
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
     *
     * * Previous generation: (not recommended)
     *
     * *T1 node types:* `cache.t1.micro`
     *
     * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
     *
     * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` ,
     * `cache.m3.2xlarge`
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
     * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
     * `cache.r6g.24xlarge`
     *
     * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` ,
     * `cache.r5.4xlarge` , `cache.r5.12xlarge` , `cache.r5.24xlarge`
     *
     * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` ,
     * `cache.r4.4xlarge` , `cache.r4.8xlarge` , `cache.r4.16xlarge`
     *
     * * Previous generation: (not recommended)
     *
     * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
     *
     * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` ,
     * `cache.r3.4xlarge` , `cache.r3.8xlarge`
     *
     * For region availability, see [Supported Node Types by
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * *Additional node type info*
     *
     * * All current generation instance types are created in Amazon VPC by default.
     * * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * * Redis configuration variables `appendonly` and `appendfsync` are not supported on Redis
     * version 2.8.22 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachenodetype)
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     */
    public fun cacheNodeType(cacheNodeType: String)

    /**
     * The name of the parameter group to associate with this cluster.
     *
     * If this argument is omitted, the default parameter group for the specified engine is used.
     * You cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * cluster. 
     */
    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    /**
     * A list of security group names to associate with this cluster.
     *
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * 
     */
    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    /**
     * A list of security group names to associate with this cluster.
     *
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * 
     */
    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String)

    /**
     * The name of the subnet group to be used for the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cluster. 
     */
    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    /**
     * A name for the cache cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the cache cluster. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
     * letter and cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-clustername)
     * @param clusterName A name for the cache cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The name of the cache engine to be used for this cluster.
     *
     * Valid values for this parameter are: `memcached` | `redis`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engine)
     * @param engine The name of the cache engine to be used for this cluster. 
     */
    public fun engine(engine: String)

    /**
     * The version number of the cache engine to be used for this cluster.
     *
     * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
     * version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engineversion)
     * @param engineVersion The version number of the cache engine to be used for this cluster. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
     *
     * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-ipdiscovery)
     * @param ipDiscovery The network type you choose when modifying a cluster, either `ipv4` |
     * `ipv6` . 
     */
    public fun ipDiscovery(ipDiscovery: String)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any)

    /**
     * Must be either `ipv4` | `ipv6` | `dual_stack` .
     *
     * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-networktype)
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . 
     */
    public fun networkType(networkType: String)

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     * notifications are sent.
     *
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent. 
     */
    public fun notificationTopicArn(notificationTopicArn: String)

    /**
     * The number of cache nodes that the cache cluster should have.
     *
     *
     * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
     * not previously specified and you don't specify any new values, an update requires
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-numcachenodes)
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. 
     */
    public fun numCacheNodes(numCacheNodes: Number)

    /**
     * The port number on which each of the cache nodes accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-port)
     * @param port The port number on which each of the cache nodes accepts connections. 
     */
    public fun port(port: Number)

    /**
     * The EC2 Availability Zone in which the cluster is created.
     *
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you
     * want to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
     *
     * Default: System chosen Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cluster is created. 
     */
    public fun preferredAvailabilityZone(preferredAvailabilityZone: String)

    /**
     * A list of the Availability Zones in which cache nodes are created.
     *
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created. 
     */
    public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

    /**
     * A list of the Availability Zones in which cache nodes are created.
     *
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created. 
     */
    public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed. 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely
     * identifies a Redis RDB snapshot file stored in Amazon S3.
     *
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. 
     */
    public fun snapshotArns(snapshotArns: List<String>)

    /**
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely
     * identifies a Redis RDB snapshot file stored in Amazon S3.
     *
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. 
     */
    public fun snapshotArns(vararg snapshotArns: String)

    /**
     * The name of a Redis snapshot from which to restore data into the new node group (shard).
     *
     * The snapshot status changes to `restoring` while the new node group (shard) is being created.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotname)
     * @param snapshotName The name of a Redis snapshot from which to restore data into the new node
     * group (shard). 
     */
    public fun snapshotName(snapshotName: String)

    /**
     * The number of days for which ElastiCache retains automatic snapshots before deleting them.
     *
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for
     * 5 days before being deleted.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them. 
     */
    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your
     * node group (shard).
     *
     * Example: `05:00-09:00`
     *
     * If you do not specify this parameter, ElastiCache automatically chooses an appropriate time
     * range.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard). 
     */
    public fun snapshotWindow(snapshotWindow: String)

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A flag that enables in-transit encryption when set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true. 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    /**
     * A flag that enables in-transit encryption when set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true. 
     */
    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    /**
     * One or more VPC security groups associated with the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * One or more VPC security groups associated with the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnCacheCluster.Builder =
        software.amazon.awscdk.services.elasticache.CfnCacheCluster.Builder.create(scope, id)

    /**
     * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want
     * to opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
     * versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    /**
     * If you are running Redis engine version 6.0 or later, set this parameter to yes if you want
     * to opt-in to the next minor version upgrade campaign. This parameter is disabled for previous
     * versions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-autominorversionupgrade)
     * @param autoMinorVersionUpgrade If you are running Redis engine version 6.0 or later, set this
     * parameter to yes if you want to opt-in to the next minor version upgrade campaign. This
     * parameter is disabled for previous versions. 
     */
    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    /**
     * Specifies whether the nodes in this Memcached cluster are created in a single Availability
     * Zone or created across multiple Availability Zones in the cluster's region.
     *
     * This parameter is only supported for Memcached clusters.
     *
     * If the `AZMode` and `PreferredAvailabilityZones` are not specified, ElastiCache assumes
     * `single-az` mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-azmode)
     * @param azMode Specifies whether the nodes in this Memcached cluster are created in a single
     * Availability Zone or created across multiple Availability Zones in the cluster's region. 
     */
    override fun azMode(azMode: String) {
      cdkBuilder.azMode(azMode)
    }

    /**
     * The compute and memory capacity of the nodes in the node group (shard).
     *
     * The following node types are supported by ElastiCache. Generally speaking, the current
     * generation types provide more memory and computational power at lower cost when compared to
     * their equivalent previous generation counterparts. Changing the CacheNodeType of a Memcached
     * instance is currently not supported. If you need to scale using Memcached, we recommend forcing
     * a replacement update by changing the `LogicalResourceId` of the resource.
     *
     * * General purpose:
     * * Current generation:
     *
     * *M6g node types:* `cache.m6g.large` , `cache.m6g.xlarge` , `cache.m6g.2xlarge` ,
     * `cache.m6g.4xlarge` , `cache.m6g.8xlarge` , `cache.m6g.12xlarge` , `cache.m6g.16xlarge` ,
     * `cache.m6g.24xlarge`
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
     *
     * * Previous generation: (not recommended)
     *
     * *T1 node types:* `cache.t1.micro`
     *
     * *M1 node types:* `cache.m1.small` , `cache.m1.medium` , `cache.m1.large` , `cache.m1.xlarge`
     *
     * *M3 node types:* `cache.m3.medium` , `cache.m3.large` , `cache.m3.xlarge` ,
     * `cache.m3.2xlarge`
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
     * `cache.r6g.4xlarge` , `cache.r6g.8xlarge` , `cache.r6g.12xlarge` , `cache.r6g.16xlarge` ,
     * `cache.r6g.24xlarge`
     *
     * *R5 node types:* `cache.r5.large` , `cache.r5.xlarge` , `cache.r5.2xlarge` ,
     * `cache.r5.4xlarge` , `cache.r5.12xlarge` , `cache.r5.24xlarge`
     *
     * *R4 node types:* `cache.r4.large` , `cache.r4.xlarge` , `cache.r4.2xlarge` ,
     * `cache.r4.4xlarge` , `cache.r4.8xlarge` , `cache.r4.16xlarge`
     *
     * * Previous generation: (not recommended)
     *
     * *M2 node types:* `cache.m2.xlarge` , `cache.m2.2xlarge` , `cache.m2.4xlarge`
     *
     * *R3 node types:* `cache.r3.large` , `cache.r3.xlarge` , `cache.r3.2xlarge` ,
     * `cache.r3.4xlarge` , `cache.r3.8xlarge`
     *
     * For region availability, see [Supported Node Types by
     * Region](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html#CacheNodes.SupportedTypesByRegion)
     *
     * *Additional node type info*
     *
     * * All current generation instance types are created in Amazon VPC by default.
     * * Redis append-only files (AOF) are not supported for T1 or T2 instances.
     * * Redis Multi-AZ with automatic failover is not supported on T1 instances.
     * * Redis configuration variables `appendonly` and `appendfsync` are not supported on Redis
     * version 2.8.22 and later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachenodetype)
     * @param cacheNodeType The compute and memory capacity of the nodes in the node group (shard). 
     */
    override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    /**
     * The name of the parameter group to associate with this cluster.
     *
     * If this argument is omitted, the default parameter group for the specified engine is used.
     * You cannot use any parameter group which has `cluster-enabled='yes'` when creating a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cacheparametergroupname)
     * @param cacheParameterGroupName The name of the parameter group to associate with this
     * cluster. 
     */
    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    /**
     * A list of security group names to associate with this cluster.
     *
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * 
     */
    override fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
      cdkBuilder.cacheSecurityGroupNames(cacheSecurityGroupNames)
    }

    /**
     * A list of security group names to associate with this cluster.
     *
     * Use this parameter only when you are creating a cluster outside of an Amazon Virtual Private
     * Cloud (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesecuritygroupnames)
     * @param cacheSecurityGroupNames A list of security group names to associate with this cluster.
     * 
     */
    override fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String): Unit =
        cacheSecurityGroupNames(cacheSecurityGroupNames.toList())

    /**
     * The name of the subnet group to be used for the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     *
     * If you're going to launch your cluster in an Amazon VPC, you need to create a subnet group
     * before you start creating a cluster. For more information, see
     * `[AWS::ElastiCache::SubnetGroup](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html)
     * .`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-cachesubnetgroupname)
     * @param cacheSubnetGroupName The name of the subnet group to be used for the cluster. 
     */
    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    /**
     * A name for the cache cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the cache cluster. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * The name must contain 1 to 50 alphanumeric characters or hyphens. The name must start with a
     * letter and cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-clustername)
     * @param clusterName A name for the cache cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The name of the cache engine to be used for this cluster.
     *
     * Valid values for this parameter are: `memcached` | `redis`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engine)
     * @param engine The name of the cache engine to be used for this cluster. 
     */
    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    /**
     * The version number of the cache engine to be used for this cluster.
     *
     * To view the supported cache engine versions, use the DescribeCacheEngineVersions operation.
     *
     * *Important:* You can upgrade to a newer engine version (see [Selecting a Cache Engine and
     * Version](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/SelectEngine.html#VersionManagement)
     * ), but you cannot downgrade to an earlier engine version. If you want to use an earlier engine
     * version, you must delete the existing cluster or replication group and create it anew with the
     * earlier engine version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-engineversion)
     * @param engineVersion The version number of the cache engine to be used for this cluster. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The network type you choose when modifying a cluster, either `ipv4` | `ipv6` .
     *
     * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-ipdiscovery)
     * @param ipDiscovery The network type you choose when modifying a cluster, either `ipv4` |
     * `ipv6` . 
     */
    override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    /**
     * Specifies the destination, format and type of the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-logdeliveryconfigurations)
     * @param logDeliveryConfigurations Specifies the destination, format and type of the logs. 
     */
    override fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any): Unit =
        logDeliveryConfigurations(logDeliveryConfigurations.toList())

    /**
     * Must be either `ipv4` | `ipv6` | `dual_stack` .
     *
     * IPv6 is supported for workloads using Redis engine version 6.2 onward or Memcached engine
     * version 1.6.6 on all instances built on the [Nitro
     * system](https://docs.aws.amazon.com/ec2/nitro/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-networktype)
     * @param networkType Must be either `ipv4` | `ipv6` | `dual_stack` . 
     */
    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) topic to which
     * notifications are sent.
     *
     *
     * The Amazon SNS topic owner must be the same as the cluster owner.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-notificationtopicarn)
     * @param notificationTopicArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
     * Service (SNS) topic to which notifications are sent. 
     */
    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    /**
     * The number of cache nodes that the cache cluster should have.
     *
     *
     * However, if the `PreferredAvailabilityZone` and `PreferredAvailabilityZones` properties were
     * not previously specified and you don't specify any new values, an update requires
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-numcachenodes)
     * @param numCacheNodes The number of cache nodes that the cache cluster should have. 
     */
    override fun numCacheNodes(numCacheNodes: Number) {
      cdkBuilder.numCacheNodes(numCacheNodes)
    }

    /**
     * The port number on which each of the cache nodes accepts connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-port)
     * @param port The port number on which each of the cache nodes accepts connections. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The EC2 Availability Zone in which the cluster is created.
     *
     * All nodes belonging to this cluster are placed in the preferred Availability Zone. If you
     * want to create your nodes across multiple Availability Zones, use `PreferredAvailabilityZones` .
     *
     * Default: System chosen Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzone)
     * @param preferredAvailabilityZone The EC2 Availability Zone in which the cluster is created. 
     */
    override fun preferredAvailabilityZone(preferredAvailabilityZone: String) {
      cdkBuilder.preferredAvailabilityZone(preferredAvailabilityZone)
    }

    /**
     * A list of the Availability Zones in which cache nodes are created.
     *
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created. 
     */
    override fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>) {
      cdkBuilder.preferredAvailabilityZones(preferredAvailabilityZones)
    }

    /**
     * A list of the Availability Zones in which cache nodes are created.
     *
     * The order of the zones in the list is not important.
     *
     * This option is only supported on Memcached.
     *
     *
     * If you are creating your cluster in an Amazon VPC (recommended) you can only locate nodes in
     * Availability Zones that are associated with the subnets in the selected subnet group.
     *
     * The number of Availability Zones listed must equal the value of `NumCacheNodes` .
     *
     *
     * If you want all the nodes in the same Availability Zone, use `PreferredAvailabilityZone`
     * instead, or repeat the Availability Zone multiple times in the list.
     *
     * Default: System chosen Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredavailabilityzones)
     * @param preferredAvailabilityZones A list of the Availability Zones in which cache nodes are
     * created. 
     */
    override fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String): Unit =
        preferredAvailabilityZones(preferredAvailabilityZones.toList())

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow Specifies the weekly time range during which maintenance on
     * the cluster is performed. 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely
     * identifies a Redis RDB snapshot file stored in Amazon S3.
     *
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. 
     */
    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    /**
     * A single-element string list containing an Amazon Resource Name (ARN) that uniquely
     * identifies a Redis RDB snapshot file stored in Amazon S3.
     *
     * The snapshot file is used to populate the node group (shard). The Amazon S3 object name in
     * the ARN cannot contain any commas.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Example of an Amazon S3 ARN: `arn:aws:s3:::my_bucket/snapshot1.rdb`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotarns)
     * @param snapshotArns A single-element string list containing an Amazon Resource Name (ARN)
     * that uniquely identifies a Redis RDB snapshot file stored in Amazon S3. 
     */
    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    /**
     * The name of a Redis snapshot from which to restore data into the new node group (shard).
     *
     * The snapshot status changes to `restoring` while the new node group (shard) is being created.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotname)
     * @param snapshotName The name of a Redis snapshot from which to restore data into the new node
     * group (shard). 
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * The number of days for which ElastiCache retains automatic snapshots before deleting them.
     *
     * For example, if you set `SnapshotRetentionLimit` to 5, a snapshot taken today is retained for
     * 5 days before being deleted.
     *
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * Default: 0 (i.e., automatic backups are disabled for this cache cluster).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotretentionlimit)
     * @param snapshotRetentionLimit The number of days for which ElastiCache retains automatic
     * snapshots before deleting them. 
     */
    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
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
     *
     * This parameter is only valid if the `Engine` parameter is `redis` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-snapshotwindow)
     * @param snapshotWindow The daily time range (in UTC) during which ElastiCache begins taking a
     * daily snapshot of your node group (shard). 
     */
    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A list of tags to be added to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-tags)
     * @param tags A list of tags to be added to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A flag that enables in-transit encryption when set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true. 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    /**
     * A flag that enables in-transit encryption when set to true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-transitencryptionenabled)
     * @param transitEncryptionEnabled A flag that enables in-transit encryption when set to true. 
     */
    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    /**
     * One or more VPC security groups associated with the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * One or more VPC security groups associated with the cluster.
     *
     * Use this parameter only when you are creating a cluster in an Amazon Virtual Private Cloud
     * (Amazon VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-cachecluster.html#cfn-elasticache-cachecluster-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds One or more VPC security groups associated with the cluster. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnCacheCluster =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnCacheCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCacheCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCacheCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster):
        CfnCacheCluster = CfnCacheCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCacheCluster):
        software.amazon.awscdk.services.elasticache.CfnCacheCluster = wrapped.cdkObject
  }

  /**
   * Specifies the destination, format and type of the logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * LogDeliveryConfigurationRequestProperty logDeliveryConfigurationRequestProperty =
   * LogDeliveryConfigurationRequestProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html)
   */
  public interface LogDeliveryConfigurationRequestProperty {
    /**
     * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-destinationdetails)
     */
    public fun destinationDetails(): Any

    /**
     * Specify either CloudWatch Logs or Kinesis Data Firehose as the destination type.
     *
     * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-destinationtype)
     */
    public fun destinationType(): String

    /**
     * Valid values are either `json` or `text` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-logformat)
     */
    public fun logFormat(): String

    /**
     * Valid value is either `slow-log` , which refers to
     * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-logtype)
     */
    public fun logType(): String

    /**
     * A builder for [LogDeliveryConfigurationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      public fun destinationDetails(destinationDetails: IResolvable)

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      public fun destinationDetails(destinationDetails: DestinationDetailsProperty)

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e44261fa165e257bb303fce9896fc508c3a435e77b44009681d09f1efef725b")
      public
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit)

      /**
       * @param destinationType Specify either CloudWatch Logs or Kinesis Data Firehose as the
       * destination type. 
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       */
      public fun destinationType(destinationType: String)

      /**
       * @param logFormat Valid values are either `json` or `text` . 
       */
      public fun logFormat(logFormat: String)

      /**
       * @param logType Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` . 
       */
      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty.builder()

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      override fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails.let(IResolvable::unwrap))
      }

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      override fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails.let(DestinationDetailsProperty::unwrap))
      }

      /**
       * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
       * Kinesis Data Firehose destination. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e44261fa165e257bb303fce9896fc508c3a435e77b44009681d09f1efef725b")
      override
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit):
          Unit = destinationDetails(DestinationDetailsProperty(destinationDetails))

      /**
       * @param destinationType Specify either CloudWatch Logs or Kinesis Data Firehose as the
       * destination type. 
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       */
      override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      /**
       * @param logFormat Valid values are either `json` or `text` . 
       */
      override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      /**
       * @param logType Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` . 
       */
      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty,
    ) : CdkObject(cdkObject), LogDeliveryConfigurationRequestProperty {
      /**
       * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-destinationdetails)
       */
      override fun destinationDetails(): Any = unwrap(this).getDestinationDetails()

      /**
       * Specify either CloudWatch Logs or Kinesis Data Firehose as the destination type.
       *
       * Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-destinationtype)
       */
      override fun destinationType(): String = unwrap(this).getDestinationType()

      /**
       * Valid values are either `json` or `text` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-logformat)
       */
      override fun logFormat(): String = unwrap(this).getLogFormat()

      /**
       * Valid value is either `slow-log` , which refers to
       * [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html#cfn-elasticache-cachecluster-logdeliveryconfigurationrequest-logtype)
       */
      override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LogDeliveryConfigurationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty):
          LogDeliveryConfigurationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogDeliveryConfigurationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryConfigurationRequestProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty
    }
  }

  /**
   * The configuration details of the Kinesis Data Firehose destination.
   *
   * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as the
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * KinesisFirehoseDestinationDetailsProperty kinesisFirehoseDestinationDetailsProperty =
   * KinesisFirehoseDestinationDetailsProperty.builder()
   * .deliveryStream("deliveryStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-kinesisfirehosedestinationdetails.html)
   */
  public interface KinesisFirehoseDestinationDetailsProperty {
    /**
     * The name of the Kinesis Data Firehose delivery stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-kinesisfirehosedestinationdetails.html#cfn-elasticache-cachecluster-kinesisfirehosedestinationdetails-deliverystream)
     */
    public fun deliveryStream(): String

    /**
     * A builder for [KinesisFirehoseDestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream. 
       */
      public fun deliveryStream(deliveryStream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.builder()

      /**
       * @param deliveryStream The name of the Kinesis Data Firehose delivery stream. 
       */
      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty,
    ) : CdkObject(cdkObject), KinesisFirehoseDestinationDetailsProperty {
      /**
       * The name of the Kinesis Data Firehose delivery stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-kinesisfirehosedestinationdetails.html#cfn-elasticache-cachecluster-kinesisfirehosedestinationdetails-deliverystream)
       */
      override fun deliveryStream(): String = unwrap(this).getDeliveryStream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty):
          KinesisFirehoseDestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KinesisFirehoseDestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
    }
  }

  /**
   * Configuration details of a CloudWatch Logs destination.
   *
   * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * CloudWatchLogsDestinationDetailsProperty cloudWatchLogsDestinationDetailsProperty =
   * CloudWatchLogsDestinationDetailsProperty.builder()
   * .logGroup("logGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-cloudwatchlogsdestinationdetails.html)
   */
  public interface CloudWatchLogsDestinationDetailsProperty {
    /**
     * The name of the CloudWatch Logs log group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-cloudwatchlogsdestinationdetails.html#cfn-elasticache-cachecluster-cloudwatchlogsdestinationdetails-loggroup)
     */
    public fun logGroup(): String

    /**
     * A builder for [CloudWatchLogsDestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroup The name of the CloudWatch Logs log group. 
       */
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.builder()

      /**
       * @param logGroup The name of the CloudWatch Logs log group. 
       */
      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsDestinationDetailsProperty {
      /**
       * The name of the CloudWatch Logs log group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-cloudwatchlogsdestinationdetails.html#cfn-elasticache-cachecluster-cloudwatchlogsdestinationdetails-loggroup)
       */
      override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty):
          CloudWatchLogsDestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudWatchLogsDestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
    }
  }

  /**
   * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose
   * destination.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticache.*;
   * DestinationDetailsProperty destinationDetailsProperty = DestinationDetailsProperty.builder()
   * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
   * .logGroup("logGroup")
   * .build())
   * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
   * .deliveryStream("deliveryStream")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html)
   */
  public interface DestinationDetailsProperty {
    /**
     * The configuration details of the CloudWatch Logs destination.
     *
     * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html#cfn-elasticache-cachecluster-destinationdetails-cloudwatchlogsdetails)
     */
    public fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

    /**
     * The configuration details of the Kinesis Data Firehose destination.
     *
     * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
     * the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html#cfn-elasticache-cachecluster-destinationdetails-kinesisfirehosedetails)
     */
    public fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()

    /**
     * A builder for [DestinationDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable)

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty)

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f88bd5e3396556e7095ec41d5b9595bb216092508a08a2e27fe30e13e1b061")
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty)

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40b60a3f98ef9f2133846abea7bbfa7d345958b8dc9667f62706d40859df30c")
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty.builder()

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      override fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(CloudWatchLogsDestinationDetailsProperty::unwrap))
      }

      /**
       * @param cloudWatchLogsDetails The configuration details of the CloudWatch Logs destination.
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f88bd5e3396556e7095ec41d5b9595bb216092508a08a2e27fe30e13e1b061")
      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty(cloudWatchLogsDetails))

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      override fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(KinesisFirehoseDestinationDetailsProperty::unwrap))
      }

      /**
       * @param kinesisFirehoseDetails The configuration details of the Kinesis Data Firehose
       * destination.
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40b60a3f98ef9f2133846abea7bbfa7d345958b8dc9667f62706d40859df30c")
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty(kinesisFirehoseDetails))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty,
    ) : CdkObject(cdkObject), DestinationDetailsProperty {
      /**
       * The configuration details of the CloudWatch Logs destination.
       *
       * Note that this field is marked as required but only if CloudWatch Logs was chosen as the
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html#cfn-elasticache-cachecluster-destinationdetails-cloudwatchlogsdetails)
       */
      override fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

      /**
       * The configuration details of the Kinesis Data Firehose destination.
       *
       * Note that this field is marked as required but only if Kinesis Data Firehose was chosen as
       * the destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-destinationdetails.html#cfn-elasticache-cachecluster-destinationdetails-kinesisfirehosedetails)
       */
      override fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty):
          DestinationDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty
    }
  }
}
