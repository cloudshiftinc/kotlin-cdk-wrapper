@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketPolicy
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointPolicy
import software.amazon.awscdk.services.s3.CfnStorageLens

public inline fun Bucket.addCorsRule(block: CorsRuleDsl.() -> Unit = {}) {
  val builder = CorsRuleDsl()
  builder.apply(block)
  return addCorsRule(builder.build())
}

public inline fun Bucket.addInventory(block: InventoryDsl.() -> Unit = {}) {
  val builder = InventoryDsl()
  builder.apply(block)
  return addInventory(builder.build())
}

public inline fun Bucket.addLifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}) {
  val builder = LifecycleRuleDsl()
  builder.apply(block)
  return addLifecycleRule(builder.build())
}

public inline fun Bucket.addMetric(block: BucketMetricsDsl.() -> Unit = {}) {
  val builder = BucketMetricsDsl()
  builder.apply(block)
  return addMetric(builder.build())
}

public inline fun Bucket.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun Bucket.onCloudTrailEvent(arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnCloudTrailBucketEventOptionsDsl()
  builder.apply(block)
  return onCloudTrailEvent(arg0,builder.build())
}

public inline fun Bucket.onCloudTrailPutObject(arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnCloudTrailBucketEventOptionsDsl()
  builder.apply(block)
  return onCloudTrailPutObject(arg0,builder.build())
}

public inline fun Bucket.onCloudTrailWriteObject(arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnCloudTrailBucketEventOptionsDsl()
  builder.apply(block)
  return onCloudTrailWriteObject(arg0,builder.build())
}

public inline fun Bucket.transferAccelerationUrlForObject(arg0: String,
    block: TransferAccelerationUrlOptionsDsl.() -> Unit = {}): String {
  val builder = TransferAccelerationUrlOptionsDsl()
  builder.apply(block)
  return transferAccelerationUrlForObject(arg0,builder.build())
}

public inline fun Bucket.virtualHostedUrlForObject(arg0: String,
    block: VirtualHostedStyleUrlOptionsDsl.() -> Unit = {}): String {
  val builder = VirtualHostedStyleUrlOptionsDsl()
  builder.apply(block)
  return virtualHostedUrlForObject(arg0,builder.build())
}

public inline fun CfnAccessPoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnAccessPoint.setPublicAccessBlockConfiguration(block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
  builder.apply(block)
  return setPublicAccessBlockConfiguration(builder.build())
}

public inline
    fun CfnAccessPoint.setVpcConfiguration(block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAccessPointVpcConfigurationPropertyDsl()
  builder.apply(block)
  return setVpcConfiguration(builder.build())
}

public inline fun CfnBucket.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnBucket.setAccelerateConfiguration(block: CfnBucketAccelerateConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketAccelerateConfigurationPropertyDsl()
  builder.apply(block)
  return setAccelerateConfiguration(builder.build())
}

public inline
    fun CfnBucket.setBucketEncryption(block: CfnBucketBucketEncryptionPropertyDsl.() -> Unit = {}) {
  val builder = CfnBucketBucketEncryptionPropertyDsl()
  builder.apply(block)
  return setBucketEncryption(builder.build())
}

public inline
    fun CfnBucket.setCorsConfiguration(block: CfnBucketCorsConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBucketCorsConfigurationPropertyDsl()
  builder.apply(block)
  return setCorsConfiguration(builder.build())
}

public inline
    fun CfnBucket.setLifecycleConfiguration(block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketLifecycleConfigurationPropertyDsl()
  builder.apply(block)
  return setLifecycleConfiguration(builder.build())
}

public inline
    fun CfnBucket.setLoggingConfiguration(block: CfnBucketLoggingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketLoggingConfigurationPropertyDsl()
  builder.apply(block)
  return setLoggingConfiguration(builder.build())
}

public inline
    fun CfnBucket.setNotificationConfiguration(block: CfnBucketNotificationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketNotificationConfigurationPropertyDsl()
  builder.apply(block)
  return setNotificationConfiguration(builder.build())
}

public inline
    fun CfnBucket.setObjectLockConfiguration(block: CfnBucketObjectLockConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketObjectLockConfigurationPropertyDsl()
  builder.apply(block)
  return setObjectLockConfiguration(builder.build())
}

public inline
    fun CfnBucket.setOwnershipControls(block: CfnBucketOwnershipControlsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnBucketOwnershipControlsPropertyDsl()
  builder.apply(block)
  return setOwnershipControls(builder.build())
}

public inline
    fun CfnBucket.setPublicAccessBlockConfiguration(block: CfnBucketPublicAccessBlockConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketPublicAccessBlockConfigurationPropertyDsl()
  builder.apply(block)
  return setPublicAccessBlockConfiguration(builder.build())
}

public inline
    fun CfnBucket.setReplicationConfiguration(block: CfnBucketReplicationConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketReplicationConfigurationPropertyDsl()
  builder.apply(block)
  return setReplicationConfiguration(builder.build())
}

public inline
    fun CfnBucket.setVersioningConfiguration(block: CfnBucketVersioningConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketVersioningConfigurationPropertyDsl()
  builder.apply(block)
  return setVersioningConfiguration(builder.build())
}

public inline
    fun CfnBucket.setWebsiteConfiguration(block: CfnBucketWebsiteConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnBucketWebsiteConfigurationPropertyDsl()
  builder.apply(block)
  return setWebsiteConfiguration(builder.build())
}

public inline fun CfnBucketPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMultiRegionAccessPoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMultiRegionAccessPoint.setPublicAccessBlockConfiguration(block: CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl()
  builder.apply(block)
  return setPublicAccessBlockConfiguration(builder.build())
}

public inline fun CfnMultiRegionAccessPointPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnStorageLens.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStorageLens.setStorageLensConfiguration(block: CfnStorageLensStorageLensConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStorageLensStorageLensConfigurationPropertyDsl()
  builder.apply(block)
  return setStorageLensConfiguration(builder.build())
}
