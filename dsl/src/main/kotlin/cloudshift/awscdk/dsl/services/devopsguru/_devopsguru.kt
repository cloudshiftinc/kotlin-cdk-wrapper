@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegration
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection
import software.amazon.awscdk.services.devopsguru.CfnResourceCollectionProps
import software.constructs.Construct

public object devopsguru {
  public inline fun cfnLogAnomalyDetectionIntegration(
    scope: Construct,
    id: String,
    block: CfnLogAnomalyDetectionIntegrationDsl.() -> Unit = {},
  ): CfnLogAnomalyDetectionIntegration {
    val builder = CfnLogAnomalyDetectionIntegrationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLogAnomalyDetectionIntegrationProps(block: CfnLogAnomalyDetectionIntegrationPropsDsl.() -> Unit
      = {}): CfnLogAnomalyDetectionIntegrationProps {
    val builder = CfnLogAnomalyDetectionIntegrationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNotificationChannel(
    scope: Construct,
    id: String,
    block: CfnNotificationChannelDsl.() -> Unit = {},
  ): CfnNotificationChannel {
    val builder = CfnNotificationChannelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotificationChannelNotificationChannelConfigProperty(block: CfnNotificationChannelNotificationChannelConfigPropertyDsl.() -> Unit
      = {}): CfnNotificationChannel.NotificationChannelConfigProperty {
    val builder = CfnNotificationChannelNotificationChannelConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotificationChannelNotificationFilterConfigProperty(block: CfnNotificationChannelNotificationFilterConfigPropertyDsl.() -> Unit
      = {}): CfnNotificationChannel.NotificationFilterConfigProperty {
    val builder = CfnNotificationChannelNotificationFilterConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNotificationChannelProps(block: CfnNotificationChannelPropsDsl.() -> Unit =
      {}): CfnNotificationChannelProps {
    val builder = CfnNotificationChannelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNotificationChannelSnsChannelConfigProperty(block: CfnNotificationChannelSnsChannelConfigPropertyDsl.() -> Unit
      = {}): CfnNotificationChannel.SnsChannelConfigProperty {
    val builder = CfnNotificationChannelSnsChannelConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceCollection(
    scope: Construct,
    id: String,
    block: CfnResourceCollectionDsl.() -> Unit = {},
  ): CfnResourceCollection {
    val builder = CfnResourceCollectionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceCollectionCloudFormationCollectionFilterProperty(block: CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl.() -> Unit
      = {}): CfnResourceCollection.CloudFormationCollectionFilterProperty {
    val builder = CfnResourceCollectionCloudFormationCollectionFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourceCollectionProps(block: CfnResourceCollectionPropsDsl.() -> Unit =
      {}): CfnResourceCollectionProps {
    val builder = CfnResourceCollectionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceCollectionResourceCollectionFilterProperty(block: CfnResourceCollectionResourceCollectionFilterPropertyDsl.() -> Unit
      = {}): CfnResourceCollection.ResourceCollectionFilterProperty {
    val builder = CfnResourceCollectionResourceCollectionFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResourceCollectionTagCollectionProperty(block: CfnResourceCollectionTagCollectionPropertyDsl.() -> Unit
      = {}): CfnResourceCollection.TagCollectionProperty {
    val builder = CfnResourceCollectionTagCollectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
