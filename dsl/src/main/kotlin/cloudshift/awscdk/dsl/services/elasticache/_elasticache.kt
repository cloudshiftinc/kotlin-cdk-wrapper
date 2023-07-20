@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
import software.amazon.awscdk.services.elasticache.CfnParameterGroup
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
import software.amazon.awscdk.services.elasticache.CfnSecurityGroup
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
import software.amazon.awscdk.services.elasticache.CfnSubnetGroup
import software.amazon.awscdk.services.elasticache.CfnSubnetGroupProps
import software.amazon.awscdk.services.elasticache.CfnUser
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.amazon.awscdk.services.elasticache.CfnUserGroupProps
import software.amazon.awscdk.services.elasticache.CfnUserProps
import software.constructs.Construct

public object elasticache {
  public inline fun cfnCacheCluster(
    scope: Construct,
    id: String,
    block: CfnCacheClusterDsl.() -> Unit = {},
  ): CfnCacheCluster {
    val builder = CfnCacheClusterDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCacheClusterCloudWatchLogsDestinationDetailsProperty(block: CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty {
    val builder = CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCacheClusterDestinationDetailsProperty(block: CfnCacheClusterDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnCacheCluster.DestinationDetailsProperty {
    val builder = CfnCacheClusterDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCacheClusterKinesisFirehoseDestinationDetailsProperty(block: CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty {
    val builder = CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCacheClusterLogDeliveryConfigurationRequestProperty(block: CfnCacheClusterLogDeliveryConfigurationRequestPropertyDsl.() -> Unit
      = {}): CfnCacheCluster.LogDeliveryConfigurationRequestProperty {
    val builder = CfnCacheClusterLogDeliveryConfigurationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCacheClusterProps(block: CfnCacheClusterPropsDsl.() -> Unit = {}):
      CfnCacheClusterProps {
    val builder = CfnCacheClusterPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnGlobalReplicationGroup(
    scope: Construct,
    id: String,
    block: CfnGlobalReplicationGroupDsl.() -> Unit = {},
  ): CfnGlobalReplicationGroup {
    val builder = CfnGlobalReplicationGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalReplicationGroupGlobalReplicationGroupMemberProperty(block: CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl.() -> Unit
      = {}): CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty {
    val builder = CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalReplicationGroupProps(block: CfnGlobalReplicationGroupPropsDsl.() -> Unit = {}):
      CfnGlobalReplicationGroupProps {
    val builder = CfnGlobalReplicationGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalReplicationGroupRegionalConfigurationProperty(block: CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl.() -> Unit
      = {}): CfnGlobalReplicationGroup.RegionalConfigurationProperty {
    val builder = CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnGlobalReplicationGroupReshardingConfigurationProperty(block: CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl.() -> Unit
      = {}): CfnGlobalReplicationGroup.ReshardingConfigurationProperty {
    val builder = CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterGroup(
    scope: Construct,
    id: String,
    block: CfnParameterGroupDsl.() -> Unit = {},
  ): CfnParameterGroup {
    val builder = CfnParameterGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnParameterGroupProps(block: CfnParameterGroupPropsDsl.() -> Unit = {}):
      CfnParameterGroupProps {
    val builder = CfnParameterGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationGroup(
    scope: Construct,
    id: String,
    block: CfnReplicationGroupDsl.() -> Unit = {},
  ): CfnReplicationGroup {
    val builder = CfnReplicationGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationGroupCloudWatchLogsDestinationDetailsProperty(block: CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty {
    val builder = CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationGroupDestinationDetailsProperty(block: CfnReplicationGroupDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnReplicationGroup.DestinationDetailsProperty {
    val builder = CfnReplicationGroupDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationGroupKinesisFirehoseDestinationDetailsProperty(block: CfnReplicationGroupKinesisFirehoseDestinationDetailsPropertyDsl.() -> Unit
      = {}): CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty {
    val builder = CfnReplicationGroupKinesisFirehoseDestinationDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationGroupLogDeliveryConfigurationRequestProperty(block: CfnReplicationGroupLogDeliveryConfigurationRequestPropertyDsl.() -> Unit
      = {}): CfnReplicationGroup.LogDeliveryConfigurationRequestProperty {
    val builder = CfnReplicationGroupLogDeliveryConfigurationRequestPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReplicationGroupNodeGroupConfigurationProperty(block: CfnReplicationGroupNodeGroupConfigurationPropertyDsl.() -> Unit
      = {}): CfnReplicationGroup.NodeGroupConfigurationProperty {
    val builder = CfnReplicationGroupNodeGroupConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReplicationGroupProps(block: CfnReplicationGroupPropsDsl.() -> Unit = {}):
      CfnReplicationGroupProps {
    val builder = CfnReplicationGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroup(
    scope: Construct,
    id: String,
    block: CfnSecurityGroupDsl.() -> Unit = {},
  ): CfnSecurityGroup {
    val builder = CfnSecurityGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupIngress(
    scope: Construct,
    id: String,
    block: CfnSecurityGroupIngressDsl.() -> Unit = {},
  ): CfnSecurityGroupIngress {
    val builder = CfnSecurityGroupIngressDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupIngressProps(block: CfnSecurityGroupIngressPropsDsl.() -> Unit =
      {}): CfnSecurityGroupIngressProps {
    val builder = CfnSecurityGroupIngressPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSecurityGroupProps(block: CfnSecurityGroupPropsDsl.() -> Unit = {}):
      CfnSecurityGroupProps {
    val builder = CfnSecurityGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetGroup(
    scope: Construct,
    id: String,
    block: CfnSubnetGroupDsl.() -> Unit = {},
  ): CfnSubnetGroup {
    val builder = CfnSubnetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubnetGroupProps(block: CfnSubnetGroupPropsDsl.() -> Unit = {}):
      CfnSubnetGroupProps {
    val builder = CfnSubnetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUser(
    scope: Construct,
    id: String,
    block: CfnUserDsl.() -> Unit = {},
  ): CfnUser {
    val builder = CfnUserDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnUserAuthenticationModeProperty(block: CfnUserAuthenticationModePropertyDsl.() -> Unit =
      {}): CfnUser.AuthenticationModeProperty {
    val builder = CfnUserAuthenticationModePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserGroup(
    scope: Construct,
    id: String,
    block: CfnUserGroupDsl.() -> Unit = {},
  ): CfnUserGroup {
    val builder = CfnUserGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserGroupProps(block: CfnUserGroupPropsDsl.() -> Unit = {}):
      CfnUserGroupProps {
    val builder = CfnUserGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnUserProps(block: CfnUserPropsDsl.() -> Unit = {}): CfnUserProps {
    val builder = CfnUserPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
