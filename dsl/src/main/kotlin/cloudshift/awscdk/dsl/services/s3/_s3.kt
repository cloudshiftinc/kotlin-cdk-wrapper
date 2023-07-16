@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.BlockPublicAccess
import software.amazon.awscdk.services.s3.BlockPublicAccessOptions
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketAttributes
import software.amazon.awscdk.services.s3.BucketMetrics
import software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig
import software.amazon.awscdk.services.s3.BucketPolicy
import software.amazon.awscdk.services.s3.BucketPolicyProps
import software.amazon.awscdk.services.s3.BucketProps
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnAccessPointProps
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.amazon.awscdk.services.s3.CfnBucketPolicyProps
import software.amazon.awscdk.services.s3.CfnBucketProps
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicyProps
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.CfnStorageLensProps
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.InventoryDestination
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.s3.Location
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition
import software.amazon.awscdk.services.s3.NotificationKeyFilter
import software.amazon.awscdk.services.s3.OnCloudTrailBucketEventOptions
import software.amazon.awscdk.services.s3.RedirectTarget
import software.amazon.awscdk.services.s3.RoutingRule
import software.amazon.awscdk.services.s3.RoutingRuleCondition
import software.amazon.awscdk.services.s3.Tag
import software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions
import software.amazon.awscdk.services.s3.Transition
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions
import software.constructs.Construct

public object s3 {
  public inline fun blockPublicAccess(block: BlockPublicAccessDsl.() -> Unit = {}):
      BlockPublicAccess {
    val builder = BlockPublicAccessDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun blockPublicAccessOptions(block: BlockPublicAccessOptionsDsl.() -> Unit = {}):
      BlockPublicAccessOptions {
    val builder = BlockPublicAccessOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucket(
    scope: Construct,
    id: String,
    block: BucketDsl.() -> Unit = {},
  ): Bucket {
    val builder = BucketDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketAttributes(block: BucketAttributesDsl.() -> Unit = {}): BucketAttributes {
    val builder = BucketAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketMetrics(block: BucketMetricsDsl.() -> Unit = {}): BucketMetrics {
    val builder = BucketMetricsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun bucketNotificationDestinationConfig(block: BucketNotificationDestinationConfigDsl.() -> Unit
      = {}): BucketNotificationDestinationConfig {
    val builder = BucketNotificationDestinationConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketPolicy(
    scope: Construct,
    id: String,
    block: BucketPolicyDsl.() -> Unit = {},
  ): BucketPolicy {
    val builder = BucketPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketPolicyProps(block: BucketPolicyPropsDsl.() -> Unit = {}):
      BucketPolicyProps {
    val builder = BucketPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun bucketProps(block: BucketPropsDsl.() -> Unit = {}): BucketProps {
    val builder = BucketPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPoint(
    scope: Construct,
    id: String,
    block: CfnAccessPointDsl.() -> Unit = {},
  ): CfnAccessPoint {
    val builder = CfnAccessPointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessPointProps(block: CfnAccessPointPropsDsl.() -> Unit = {}):
      CfnAccessPointProps {
    val builder = CfnAccessPointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPointPublicAccessBlockConfigurationProperty(block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.PublicAccessBlockConfigurationProperty {
    val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAccessPointVpcConfigurationProperty(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
      = {}): CfnAccessPoint.VpcConfigurationProperty {
    val builder = CfnAccessPointVpcConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucket(
    scope: Construct,
    id: String,
    block: CfnBucketDsl.() -> Unit = {},
  ): CfnBucket {
    val builder = CfnBucketDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketAbortIncompleteMultipartUploadProperty(block: CfnBucketAbortIncompleteMultipartUploadPropertyDsl.() -> Unit
      = {}): CfnBucket.AbortIncompleteMultipartUploadProperty {
    val builder = CfnBucketAbortIncompleteMultipartUploadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketAccelerateConfigurationProperty(block: CfnBucketAccelerateConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.AccelerateConfigurationProperty {
    val builder = CfnBucketAccelerateConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketAccessControlTranslationProperty(block: CfnBucketAccessControlTranslationPropertyDsl.() -> Unit
      = {}): CfnBucket.AccessControlTranslationProperty {
    val builder = CfnBucketAccessControlTranslationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketAnalyticsConfigurationProperty(block: CfnBucketAnalyticsConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.AnalyticsConfigurationProperty {
    val builder = CfnBucketAnalyticsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketBucketEncryptionProperty(block: CfnBucketBucketEncryptionPropertyDsl.() -> Unit =
      {}): CfnBucket.BucketEncryptionProperty {
    val builder = CfnBucketBucketEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketCorsConfigurationProperty(block: CfnBucketCorsConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.CorsConfigurationProperty {
    val builder = CfnBucketCorsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketCorsRuleProperty(block: CfnBucketCorsRulePropertyDsl.() -> Unit = {}):
      CfnBucket.CorsRuleProperty {
    val builder = CfnBucketCorsRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketDataExportProperty(block: CfnBucketDataExportPropertyDsl.() -> Unit =
      {}): CfnBucket.DataExportProperty {
    val builder = CfnBucketDataExportPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketDefaultRetentionProperty(block: CfnBucketDefaultRetentionPropertyDsl.() -> Unit =
      {}): CfnBucket.DefaultRetentionProperty {
    val builder = CfnBucketDefaultRetentionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketDeleteMarkerReplicationProperty(block: CfnBucketDeleteMarkerReplicationPropertyDsl.() -> Unit
      = {}): CfnBucket.DeleteMarkerReplicationProperty {
    val builder = CfnBucketDeleteMarkerReplicationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketDestinationProperty(block: CfnBucketDestinationPropertyDsl.() -> Unit =
      {}): CfnBucket.DestinationProperty {
    val builder = CfnBucketDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketEncryptionConfigurationProperty(block: CfnBucketEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.EncryptionConfigurationProperty {
    val builder = CfnBucketEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketEventBridgeConfigurationProperty(block: CfnBucketEventBridgeConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.EventBridgeConfigurationProperty {
    val builder = CfnBucketEventBridgeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketFilterRuleProperty(block: CfnBucketFilterRulePropertyDsl.() -> Unit =
      {}): CfnBucket.FilterRuleProperty {
    val builder = CfnBucketFilterRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketIntelligentTieringConfigurationProperty(block: CfnBucketIntelligentTieringConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.IntelligentTieringConfigurationProperty {
    val builder = CfnBucketIntelligentTieringConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketInventoryConfigurationProperty(block: CfnBucketInventoryConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.InventoryConfigurationProperty {
    val builder = CfnBucketInventoryConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketLambdaConfigurationProperty(block: CfnBucketLambdaConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.LambdaConfigurationProperty {
    val builder = CfnBucketLambdaConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketLifecycleConfigurationProperty(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.LifecycleConfigurationProperty {
    val builder = CfnBucketLifecycleConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketLoggingConfigurationProperty(block: CfnBucketLoggingConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.LoggingConfigurationProperty {
    val builder = CfnBucketLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketMetricsConfigurationProperty(block: CfnBucketMetricsConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.MetricsConfigurationProperty {
    val builder = CfnBucketMetricsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketMetricsProperty(block: CfnBucketMetricsPropertyDsl.() -> Unit = {}):
      CfnBucket.MetricsProperty {
    val builder = CfnBucketMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketNoncurrentVersionExpirationProperty(block: CfnBucketNoncurrentVersionExpirationPropertyDsl.() -> Unit
      = {}): CfnBucket.NoncurrentVersionExpirationProperty {
    val builder = CfnBucketNoncurrentVersionExpirationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketNoncurrentVersionTransitionProperty(block: CfnBucketNoncurrentVersionTransitionPropertyDsl.() -> Unit
      = {}): CfnBucket.NoncurrentVersionTransitionProperty {
    val builder = CfnBucketNoncurrentVersionTransitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketNotificationConfigurationProperty(block: CfnBucketNotificationConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.NotificationConfigurationProperty {
    val builder = CfnBucketNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketNotificationFilterProperty(block: CfnBucketNotificationFilterPropertyDsl.() -> Unit
      = {}): CfnBucket.NotificationFilterProperty {
    val builder = CfnBucketNotificationFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketObjectLockConfigurationProperty(block: CfnBucketObjectLockConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.ObjectLockConfigurationProperty {
    val builder = CfnBucketObjectLockConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketObjectLockRuleProperty(block: CfnBucketObjectLockRulePropertyDsl.() -> Unit =
      {}): CfnBucket.ObjectLockRuleProperty {
    val builder = CfnBucketObjectLockRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketOwnershipControlsProperty(block: CfnBucketOwnershipControlsPropertyDsl.() -> Unit
      = {}): CfnBucket.OwnershipControlsProperty {
    val builder = CfnBucketOwnershipControlsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketOwnershipControlsRuleProperty(block: CfnBucketOwnershipControlsRulePropertyDsl.() -> Unit
      = {}): CfnBucket.OwnershipControlsRuleProperty {
    val builder = CfnBucketOwnershipControlsRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketPolicy(
    scope: Construct,
    id: String,
    block: CfnBucketPolicyDsl.() -> Unit = {},
  ): CfnBucketPolicy {
    val builder = CfnBucketPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketPolicyProps(block: CfnBucketPolicyPropsDsl.() -> Unit = {}):
      CfnBucketPolicyProps {
    val builder = CfnBucketPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketProps(block: CfnBucketPropsDsl.() -> Unit = {}): CfnBucketProps {
    val builder = CfnBucketPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketPublicAccessBlockConfigurationProperty(block: CfnBucketPublicAccessBlockConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.PublicAccessBlockConfigurationProperty {
    val builder = CfnBucketPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketQueueConfigurationProperty(block: CfnBucketQueueConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.QueueConfigurationProperty {
    val builder = CfnBucketQueueConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketRedirectAllRequestsToProperty(block: CfnBucketRedirectAllRequestsToPropertyDsl.() -> Unit
      = {}): CfnBucket.RedirectAllRequestsToProperty {
    val builder = CfnBucketRedirectAllRequestsToPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketRedirectRuleProperty(block: CfnBucketRedirectRulePropertyDsl.() -> Unit
      = {}): CfnBucket.RedirectRuleProperty {
    val builder = CfnBucketRedirectRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicaModificationsProperty(block: CfnBucketReplicaModificationsPropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicaModificationsProperty {
    val builder = CfnBucketReplicaModificationsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationConfigurationProperty(block: CfnBucketReplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicationConfigurationProperty {
    val builder = CfnBucketReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationDestinationProperty(block: CfnBucketReplicationDestinationPropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicationDestinationProperty {
    val builder = CfnBucketReplicationDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationRuleAndOperatorProperty(block: CfnBucketReplicationRuleAndOperatorPropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicationRuleAndOperatorProperty {
    val builder = CfnBucketReplicationRuleAndOperatorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationRuleFilterProperty(block: CfnBucketReplicationRuleFilterPropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicationRuleFilterProperty {
    val builder = CfnBucketReplicationRuleFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationRuleProperty(block: CfnBucketReplicationRulePropertyDsl.() -> Unit =
      {}): CfnBucket.ReplicationRuleProperty {
    val builder = CfnBucketReplicationRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationTimeProperty(block: CfnBucketReplicationTimePropertyDsl.() -> Unit =
      {}): CfnBucket.ReplicationTimeProperty {
    val builder = CfnBucketReplicationTimePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketReplicationTimeValueProperty(block: CfnBucketReplicationTimeValuePropertyDsl.() -> Unit
      = {}): CfnBucket.ReplicationTimeValueProperty {
    val builder = CfnBucketReplicationTimeValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketRoutingRuleConditionProperty(block: CfnBucketRoutingRuleConditionPropertyDsl.() -> Unit
      = {}): CfnBucket.RoutingRuleConditionProperty {
    val builder = CfnBucketRoutingRuleConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketRoutingRuleProperty(block: CfnBucketRoutingRulePropertyDsl.() -> Unit =
      {}): CfnBucket.RoutingRuleProperty {
    val builder = CfnBucketRoutingRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketRuleProperty(block: CfnBucketRulePropertyDsl.() -> Unit = {}):
      CfnBucket.RuleProperty {
    val builder = CfnBucketRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketS3KeyFilterProperty(block: CfnBucketS3KeyFilterPropertyDsl.() -> Unit =
      {}): CfnBucket.S3KeyFilterProperty {
    val builder = CfnBucketS3KeyFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketServerSideEncryptionByDefaultProperty(block: CfnBucketServerSideEncryptionByDefaultPropertyDsl.() -> Unit
      = {}): CfnBucket.ServerSideEncryptionByDefaultProperty {
    val builder = CfnBucketServerSideEncryptionByDefaultPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketServerSideEncryptionRuleProperty(block: CfnBucketServerSideEncryptionRulePropertyDsl.() -> Unit
      = {}): CfnBucket.ServerSideEncryptionRuleProperty {
    val builder = CfnBucketServerSideEncryptionRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketSourceSelectionCriteriaProperty(block: CfnBucketSourceSelectionCriteriaPropertyDsl.() -> Unit
      = {}): CfnBucket.SourceSelectionCriteriaProperty {
    val builder = CfnBucketSourceSelectionCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketSseKmsEncryptedObjectsProperty(block: CfnBucketSseKmsEncryptedObjectsPropertyDsl.() -> Unit
      = {}): CfnBucket.SseKmsEncryptedObjectsProperty {
    val builder = CfnBucketSseKmsEncryptedObjectsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketStorageClassAnalysisProperty(block: CfnBucketStorageClassAnalysisPropertyDsl.() -> Unit
      = {}): CfnBucket.StorageClassAnalysisProperty {
    val builder = CfnBucketStorageClassAnalysisPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketTagFilterProperty(block: CfnBucketTagFilterPropertyDsl.() -> Unit =
      {}): CfnBucket.TagFilterProperty {
    val builder = CfnBucketTagFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketTieringProperty(block: CfnBucketTieringPropertyDsl.() -> Unit = {}):
      CfnBucket.TieringProperty {
    val builder = CfnBucketTieringPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketTopicConfigurationProperty(block: CfnBucketTopicConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.TopicConfigurationProperty {
    val builder = CfnBucketTopicConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnBucketTransitionProperty(block: CfnBucketTransitionPropertyDsl.() -> Unit =
      {}): CfnBucket.TransitionProperty {
    val builder = CfnBucketTransitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketVersioningConfigurationProperty(block: CfnBucketVersioningConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.VersioningConfigurationProperty {
    val builder = CfnBucketVersioningConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnBucketWebsiteConfigurationProperty(block: CfnBucketWebsiteConfigurationPropertyDsl.() -> Unit
      = {}): CfnBucket.WebsiteConfigurationProperty {
    val builder = CfnBucketWebsiteConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMultiRegionAccessPoint(
    scope: Construct,
    id: String,
    block: CfnMultiRegionAccessPointDsl.() -> Unit = {},
  ): CfnMultiRegionAccessPoint {
    val builder = CfnMultiRegionAccessPointDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMultiRegionAccessPointPolicy(
    scope: Construct,
    id: String,
    block: CfnMultiRegionAccessPointPolicyDsl.() -> Unit = {},
  ): CfnMultiRegionAccessPointPolicy {
    val builder = CfnMultiRegionAccessPointPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMultiRegionAccessPointPolicyPolicyStatusProperty(block: CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl.() -> Unit
      = {}): CfnMultiRegionAccessPointPolicy.PolicyStatusProperty {
    val builder = CfnMultiRegionAccessPointPolicyPolicyStatusPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMultiRegionAccessPointPolicyProps(block: CfnMultiRegionAccessPointPolicyPropsDsl.() -> Unit
      = {}): CfnMultiRegionAccessPointPolicyProps {
    val builder = CfnMultiRegionAccessPointPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMultiRegionAccessPointProps(block: CfnMultiRegionAccessPointPropsDsl.() -> Unit = {}):
      CfnMultiRegionAccessPointProps {
    val builder = CfnMultiRegionAccessPointPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMultiRegionAccessPointPublicAccessBlockConfigurationProperty(block: CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit
      = {}): CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty {
    val builder = CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMultiRegionAccessPointRegionProperty(block: CfnMultiRegionAccessPointRegionPropertyDsl.() -> Unit
      = {}): CfnMultiRegionAccessPoint.RegionProperty {
    val builder = CfnMultiRegionAccessPointRegionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStorageLens(
    scope: Construct,
    id: String,
    block: CfnStorageLensDsl.() -> Unit = {},
  ): CfnStorageLens {
    val builder = CfnStorageLensDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensAccountLevelProperty(block: CfnStorageLensAccountLevelPropertyDsl.() -> Unit
      = {}): CfnStorageLens.AccountLevelProperty {
    val builder = CfnStorageLensAccountLevelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensActivityMetricsProperty(block: CfnStorageLensActivityMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.ActivityMetricsProperty {
    val builder = CfnStorageLensActivityMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensAdvancedCostOptimizationMetricsProperty(block: CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.AdvancedCostOptimizationMetricsProperty {
    val builder = CfnStorageLensAdvancedCostOptimizationMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensAdvancedDataProtectionMetricsProperty(block: CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.AdvancedDataProtectionMetricsProperty {
    val builder = CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStorageLensAwsOrgProperty(block: CfnStorageLensAwsOrgPropertyDsl.() -> Unit =
      {}): CfnStorageLens.AwsOrgProperty {
    val builder = CfnStorageLensAwsOrgPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensBucketLevelProperty(block: CfnStorageLensBucketLevelPropertyDsl.() -> Unit =
      {}): CfnStorageLens.BucketLevelProperty {
    val builder = CfnStorageLensBucketLevelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensBucketsAndRegionsProperty(block: CfnStorageLensBucketsAndRegionsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.BucketsAndRegionsProperty {
    val builder = CfnStorageLensBucketsAndRegionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensCloudWatchMetricsProperty(block: CfnStorageLensCloudWatchMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.CloudWatchMetricsProperty {
    val builder = CfnStorageLensCloudWatchMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensDataExportProperty(block: CfnStorageLensDataExportPropertyDsl.() -> Unit =
      {}): CfnStorageLens.DataExportProperty {
    val builder = CfnStorageLensDataExportPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensDetailedStatusCodesMetricsProperty(block: CfnStorageLensDetailedStatusCodesMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.DetailedStatusCodesMetricsProperty {
    val builder = CfnStorageLensDetailedStatusCodesMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensEncryptionProperty(block: CfnStorageLensEncryptionPropertyDsl.() -> Unit =
      {}): CfnStorageLens.EncryptionProperty {
    val builder = CfnStorageLensEncryptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensPrefixLevelProperty(block: CfnStorageLensPrefixLevelPropertyDsl.() -> Unit =
      {}): CfnStorageLens.PrefixLevelProperty {
    val builder = CfnStorageLensPrefixLevelPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensPrefixLevelStorageMetricsProperty(block: CfnStorageLensPrefixLevelStorageMetricsPropertyDsl.() -> Unit
      = {}): CfnStorageLens.PrefixLevelStorageMetricsProperty {
    val builder = CfnStorageLensPrefixLevelStorageMetricsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStorageLensProps(block: CfnStorageLensPropsDsl.() -> Unit = {}):
      CfnStorageLensProps {
    val builder = CfnStorageLensPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensS3BucketDestinationProperty(block: CfnStorageLensS3BucketDestinationPropertyDsl.() -> Unit
      = {}): CfnStorageLens.S3BucketDestinationProperty {
    val builder = CfnStorageLensS3BucketDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStorageLensSSEKMSProperty(block: CfnStorageLensSSEKMSPropertyDsl.() -> Unit =
      {}): CfnStorageLens.SSEKMSProperty {
    val builder = CfnStorageLensSSEKMSPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensSelectionCriteriaProperty(block: CfnStorageLensSelectionCriteriaPropertyDsl.() -> Unit
      = {}): CfnStorageLens.SelectionCriteriaProperty {
    val builder = CfnStorageLensSelectionCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStorageLensStorageLensConfigurationProperty(block: CfnStorageLensStorageLensConfigurationPropertyDsl.() -> Unit
      = {}): CfnStorageLens.StorageLensConfigurationProperty {
    val builder = CfnStorageLensStorageLensConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun corsRule(block: CorsRuleDsl.() -> Unit = {}): CorsRule {
    val builder = CorsRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun intelligentTieringConfiguration(block: IntelligentTieringConfigurationDsl.() -> Unit =
      {}): IntelligentTieringConfiguration {
    val builder = IntelligentTieringConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun inventory(block: InventoryDsl.() -> Unit = {}): Inventory {
    val builder = InventoryDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun inventoryDestination(block: InventoryDestinationDsl.() -> Unit = {}):
      InventoryDestination {
    val builder = InventoryDestinationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}): LifecycleRule {
    val builder = LifecycleRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun location(block: LocationDsl.() -> Unit = {}): Location {
    val builder = LocationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun noncurrentVersionTransition(block: NoncurrentVersionTransitionDsl.() -> Unit =
      {}): NoncurrentVersionTransition {
    val builder = NoncurrentVersionTransitionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun notificationKeyFilter(block: NotificationKeyFilterDsl.() -> Unit = {}):
      NotificationKeyFilter {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun onCloudTrailBucketEventOptions(block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}):
      OnCloudTrailBucketEventOptions {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun redirectTarget(block: RedirectTargetDsl.() -> Unit = {}): RedirectTarget {
    val builder = RedirectTargetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun routingRule(block: RoutingRuleDsl.() -> Unit = {}): RoutingRule {
    val builder = RoutingRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun routingRuleCondition(block: RoutingRuleConditionDsl.() -> Unit = {}):
      RoutingRuleCondition {
    val builder = RoutingRuleConditionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun tag(block: TagDsl.() -> Unit = {}): Tag {
    val builder = TagDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun transferAccelerationUrlOptions(block: TransferAccelerationUrlOptionsDsl.() -> Unit = {}):
      TransferAccelerationUrlOptions {
    val builder = TransferAccelerationUrlOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun transition(block: TransitionDsl.() -> Unit = {}): Transition {
    val builder = TransitionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun virtualHostedStyleUrlOptions(block: VirtualHostedStyleUrlOptionsDsl.() -> Unit =
      {}): VirtualHostedStyleUrlOptions {
    val builder = VirtualHostedStyleUrlOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
