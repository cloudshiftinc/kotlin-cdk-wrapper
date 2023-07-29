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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketBase
import software.amazon.awscdk.services.s3.CfnAccessPoint
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnStorageLens
import software.amazon.awscdk.services.s3.EventType
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.IBucketNotificationDestination

/**
 * Adds a cross-origin access configuration for objects in an Amazon S3 bucket.
 *
 * @param rule The CORS configuration rule to add.
 */
public inline fun Bucket.addCorsRule(block: CorsRuleDsl.() -> Unit = {}) {
    val builder = CorsRuleDsl()
    builder.apply(block)
    return addCorsRule(builder.build())
}

/**
 * Add an inventory configuration.
 *
 * @param inventory configuration to add.
 */
public inline fun Bucket.addInventory(block: InventoryDsl.() -> Unit = {}) {
    val builder = InventoryDsl()
    builder.apply(block)
    return addInventory(builder.build())
}

/**
 * Add a lifecycle rule to the bucket.
 *
 * @param rule The rule to add.
 */
public inline fun Bucket.addLifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}) {
    val builder = LifecycleRuleDsl()
    builder.apply(block)
    return addLifecycleRule(builder.build())
}

/**
 * Adds a metrics configuration for the CloudWatch request metrics from the bucket.
 *
 * @param metric The metric configuration to add.
 */
public inline fun Bucket.addMetric(block: BucketMetricsDsl.() -> Unit = {}) {
    val builder = BucketMetricsDsl()
    builder.apply(block)
    return addMetric(builder.build())
}

/** The PublicAccessBlock configuration that you want to apply to this Multi-Region Access Point. */
public inline fun CfnMultiRegionAccessPoint.setPublicAccessBlockConfiguration(
    block: CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMultiRegionAccessPointPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return setPublicAccessBlockConfiguration(builder.build())
}

/** Configures the transfer acceleration state for an Amazon S3 bucket. */
public inline fun CfnBucket.setAccelerateConfiguration(
    block: CfnBucketAccelerateConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketAccelerateConfigurationPropertyDsl()
    builder.apply(block)
    return setAccelerateConfiguration(builder.build())
}

/**
 * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
 * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
 * KMS-managed keys (DSSE-KMS).
 */
public inline fun CfnBucket.setBucketEncryption(
    block: CfnBucketBucketEncryptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketBucketEncryptionPropertyDsl()
    builder.apply(block)
    return setBucketEncryption(builder.build())
}

/** Describes the cross-origin access configuration for objects in an Amazon S3 bucket. */
public inline fun CfnBucket.setCorsConfiguration(
    block: CfnBucketCorsConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketCorsConfigurationPropertyDsl()
    builder.apply(block)
    return setCorsConfiguration(builder.build())
}

/** Specifies the lifecycle configuration for objects in an Amazon S3 bucket. */
public inline fun CfnBucket.setLifecycleConfiguration(
    block: CfnBucketLifecycleConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketLifecycleConfigurationPropertyDsl()
    builder.apply(block)
    return setLifecycleConfiguration(builder.build())
}

/** Settings that define where logs are stored. */
public inline fun CfnBucket.setLoggingConfiguration(
    block: CfnBucketLoggingConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketLoggingConfigurationPropertyDsl()
    builder.apply(block)
    return setLoggingConfiguration(builder.build())
}

/** Configuration that defines how Amazon S3 handles bucket notifications. */
public inline fun CfnBucket.setNotificationConfiguration(
    block: CfnBucketNotificationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketNotificationConfigurationPropertyDsl()
    builder.apply(block)
    return setNotificationConfiguration(builder.build())
}

/** Places an Object Lock configuration on the specified bucket. */
public inline fun CfnBucket.setObjectLockConfiguration(
    block: CfnBucketObjectLockConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketObjectLockConfigurationPropertyDsl()
    builder.apply(block)
    return setObjectLockConfiguration(builder.build())
}

/** Configuration that defines how Amazon S3 handles Object Ownership rules. */
public inline fun CfnBucket.setOwnershipControls(
    block: CfnBucketOwnershipControlsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketOwnershipControlsPropertyDsl()
    builder.apply(block)
    return setOwnershipControls(builder.build())
}

/** Configuration that defines how Amazon S3 handles public access. */
public inline fun CfnBucket.setPublicAccessBlockConfiguration(
    block: CfnBucketPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return setPublicAccessBlockConfiguration(builder.build())
}

/** Configuration for replicating objects in an S3 bucket. */
public inline fun CfnBucket.setReplicationConfiguration(
    block: CfnBucketReplicationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setReplicationConfiguration(builder.build())
}

/** Enables multiple versions of all objects in this bucket. */
public inline fun CfnBucket.setVersioningConfiguration(
    block: CfnBucketVersioningConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketVersioningConfigurationPropertyDsl()
    builder.apply(block)
    return setVersioningConfiguration(builder.build())
}

/** Information used to configure the bucket as a static website. */
public inline fun CfnBucket.setWebsiteConfiguration(
    block: CfnBucketWebsiteConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnBucketWebsiteConfigurationPropertyDsl()
    builder.apply(block)
    return setWebsiteConfiguration(builder.build())
}

/**
 * Adds a bucket notification event destination.
 *
 * Example:
 * ```
 * Function myLambda;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
 * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
 *
 * @param event The event to trigger the notification.
 * @param dest The notification destination (Lambda, SNS Topic or SQS Queue).
 * @param filters S3 object key filter rules to determine which objects trigger this event.
 */
public inline fun IBucket.addEventNotification(
    arg0: EventType,
    arg1: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {},
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addEventNotification(arg0, arg1, builder.build())
}

/**
 * Subscribes a destination to receive notifications when an object is created in the bucket.
 *
 * This is identical to calling `onEvent(s3.EventType.OBJECT_CREATED)`.
 *
 * @param dest The notification destination (see onEvent).
 * @param filters Filters (see onEvent).
 */
public inline fun IBucket.addObjectCreatedNotification(
    arg0: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {}
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addObjectCreatedNotification(arg0, builder.build())
}

/**
 * Subscribes a destination to receive notifications when an object is removed from the bucket.
 *
 * This is identical to calling `onEvent(EventType.OBJECT_REMOVED)`.
 *
 * @param dest The notification destination (see onEvent).
 * @param filters Filters (see onEvent).
 */
public inline fun IBucket.addObjectRemovedNotification(
    arg0: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {}
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addObjectRemovedNotification(arg0, builder.build())
}

/**
 * Adds a statement to the resource policy for a principal (i.e. account/role/service) to perform
 * actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to obtain
 * ARNs for this bucket or objects.
 *
 * Note that the policy statement may or may not be added to the policy. For example, when an
 * `IBucket` is created from an existing bucket, it's not possible to tell whether the bucket
 * already has a policy attached, let alone to re-use that policy to add more statements to it. So
 * it's safest to do nothing in these cases.
 *
 * @param permission the policy statement to be added to the bucket's policy.
 * @return metadata about the execution of this method. If the policy was not added, the value of
 *   `statementAdded` will be `false`. You should always check this value to make sure that the
 *   operation was actually carried out. Otherwise, synthesis and deploy will terminate silently,
 *   which may be confusing.
 */
public inline fun IBucket.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Defines a CloudWatch event that triggers when something happens to this bucket.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IBucket.onCloudTrailEvent(
    arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(arg0, builder.build())
}

/**
 * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified paths
 * (keys) in this bucket using the PutObject API call.
 *
 * Note that some tools like `aws s3 cp` will automatically use either PutObject or the multipart
 * upload API depending on the file size, so using `onCloudTrailWriteObject` may be preferable.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IBucket.onCloudTrailPutObject(
    arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailPutObject(arg0, builder.build())
}

/**
 * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
 * this bucket are written to.
 *
 * This includes the events PutObject, CopyObject, and CompleteMultipartUpload.
 *
 * Note that some tools like `aws s3 cp` will automatically use either PutObject or the multipart
 * upload API depending on the file size, so using this method may be preferable to
 * `onCloudTrailPutObject`.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IBucket.onCloudTrailWriteObject(
    arg0: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailWriteObject(arg0, builder.build())
}

/**
 * The https Transfer Acceleration URL of an S3 object.
 *
 * Specify `dualStack: true` at the options for dual-stack endpoint (connect to the bucket over
 * IPv6). For example:
 * * `https://bucket.s3-accelerate.amazonaws.com`
 * * `https://bucket.s3-accelerate.amazonaws.com/key`
 *
 * @param key The S3 key of the object.
 * @param options Options for generating URL.
 * @return an TransferAccelerationUrl token
 */
public inline fun IBucket.transferAccelerationUrlForObject(
    arg0: String?,
    block: TransferAccelerationUrlOptionsDsl.() -> Unit = {}
): String {
    val builder = TransferAccelerationUrlOptionsDsl()
    builder.apply(block)
    return transferAccelerationUrlForObject(arg0, builder.build())
}

/**
 * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
 * non-regional URL. For example:.
 * * `https://only-bucket.s3.us-west-1.amazonaws.com`
 * * `https://bucket.s3.us-west-1.amazonaws.com/key`
 * * `https://bucket.s3.amazonaws.com/key`
 * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
 *
 * @param key The S3 key of the object.
 * @param options Options for generating URL.
 * @return an ObjectS3Url token
 */
public inline fun IBucket.virtualHostedUrlForObject(
    arg0: String?,
    block: VirtualHostedStyleUrlOptionsDsl.() -> Unit = {}
): String {
    val builder = VirtualHostedStyleUrlOptionsDsl()
    builder.apply(block)
    return virtualHostedUrlForObject(arg0, builder.build())
}

/** The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. */
public inline fun CfnAccessPoint.setPublicAccessBlockConfiguration(
    block: CfnAccessPointPublicAccessBlockConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointPublicAccessBlockConfigurationPropertyDsl()
    builder.apply(block)
    return setPublicAccessBlockConfiguration(builder.build())
}

/** The Virtual Private Cloud (VPC) configuration for this access point, if one exists. */
public inline fun CfnAccessPoint.setVpcConfiguration(
    block: CfnAccessPointVpcConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnAccessPointVpcConfigurationPropertyDsl()
    builder.apply(block)
    return setVpcConfiguration(builder.build())
}

/** This resource contains the details Amazon S3 Storage Lens configuration. */
public inline fun CfnStorageLens.setStorageLensConfiguration(
    block: CfnStorageLensStorageLensConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStorageLensStorageLensConfigurationPropertyDsl()
    builder.apply(block)
    return setStorageLensConfiguration(builder.build())
}

/**
 * Adds a bucket notification event destination.
 *
 * Example:
 * ```
 * Function myLambda;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.addEventNotification(EventType.OBJECT_CREATED, new LambdaDestination(myLambda),
 * NotificationKeyFilter.builder().prefix("home/myusername/ *").build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
 *
 * @param event The event to trigger the notification.
 * @param dest The notification destination (Lambda, SNS Topic or SQS Queue).
 * @param filters S3 object key filter rules to determine which objects trigger this event.
 */
public inline fun BucketBase.addEventNotification(
    event: EventType,
    dest: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {},
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addEventNotification(event, dest, builder.build())
}

/**
 * Subscribes a destination to receive notifications when an object is created in the bucket.
 *
 * This is identical to calling `onEvent(EventType.OBJECT_CREATED)`.
 *
 * @param dest The notification destination (see onEvent).
 * @param filters Filters (see onEvent).
 */
public inline fun BucketBase.addObjectCreatedNotification(
    dest: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {}
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addObjectCreatedNotification(dest, builder.build())
}

/**
 * Subscribes a destination to receive notifications when an object is removed from the bucket.
 *
 * This is identical to calling `onEvent(EventType.OBJECT_REMOVED)`.
 *
 * @param dest The notification destination (see onEvent).
 * @param filters Filters (see onEvent).
 */
public inline fun BucketBase.addObjectRemovedNotification(
    dest: IBucketNotificationDestination,
    block: NotificationKeyFilterDsl.() -> Unit = {}
) {
    val builder = NotificationKeyFilterDsl()
    builder.apply(block)
    return addObjectRemovedNotification(dest, builder.build())
}

/**
 * Adds a statement to the resource policy for a principal (i.e. account/role/service) to perform
 * actions on this bucket and/or its contents. Use `bucketArn` and `arnForObjects(keys)` to obtain
 * ARNs for this bucket or objects.
 *
 * Note that the policy statement may or may not be added to the policy. For example, when an
 * `IBucket` is created from an existing bucket, it's not possible to tell whether the bucket
 * already has a policy attached, let alone to re-use that policy to add more statements to it. So
 * it's safest to do nothing in these cases.
 *
 * @param permission the policy statement to be added to the bucket's policy.
 * @return metadata about the execution of this method. If the policy was not added, the value of
 *   `statementAdded` will be `false`. You should always check this value to make sure that the
 *   operation was actually carried out. Otherwise, synthesis and deploy will terminate silently,
 *   which may be confusing.
 */
public inline fun BucketBase.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Define a CloudWatch event that triggers when something happens to this repository.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun BucketBase.onCloudTrailEvent(
    id: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(id, builder.build())
}

/**
 * Defines an AWS CloudWatch event that triggers when an object is uploaded to the specified paths
 * (keys) in this bucket using the PutObject API call.
 *
 * Note that some tools like `aws s3 cp` will automatically use either PutObject or the multipart
 * upload API depending on the file size, so using `onCloudTrailWriteObject` may be preferable.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun BucketBase.onCloudTrailPutObject(
    id: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailPutObject(id, builder.build())
}

/**
 * Defines an AWS CloudWatch event that triggers when an object at the specified paths (keys) in
 * this bucket are written to.
 *
 * This includes the events PutObject, CopyObject, and CompleteMultipartUpload.
 *
 * Note that some tools like `aws s3 cp` will automatically use either PutObject or the multipart
 * upload API depending on the file size, so using this method may be preferable to
 * `onCloudTrailPutObject`.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun BucketBase.onCloudTrailWriteObject(
    id: String,
    block: OnCloudTrailBucketEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailBucketEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailWriteObject(id, builder.build())
}

/**
 * The https Transfer Acceleration URL of an S3 object.
 *
 * Specify `dualStack: true` at the options for dual-stack endpoint (connect to the bucket over
 * IPv6). For example:
 * * `https://bucket.s3-accelerate.amazonaws.com`
 * * `https://bucket.s3-accelerate.amazonaws.com/key`
 *
 * @param key The S3 key of the object.
 * @param options Options for generating URL.
 * @return an TransferAccelerationUrl token
 */
public inline fun BucketBase.transferAccelerationUrlForObject(
    key: String?,
    block: TransferAccelerationUrlOptionsDsl.() -> Unit = {}
): String {
    val builder = TransferAccelerationUrlOptionsDsl()
    builder.apply(block)
    return transferAccelerationUrlForObject(key, builder.build())
}

/**
 * The virtual hosted-style URL of an S3 object. Specify `regional: false` at the options for
 * non-regional URL. For example:.
 * * `https://only-bucket.s3.us-west-1.amazonaws.com`
 * * `https://bucket.s3.us-west-1.amazonaws.com/key`
 * * `https://bucket.s3.amazonaws.com/key`
 * * `https://china-bucket.s3.cn-north-1.amazonaws.com.cn/mykey`
 *
 * @param key The S3 key of the object.
 * @param options Options for generating URL.
 * @return an ObjectS3Url token
 */
public inline fun BucketBase.virtualHostedUrlForObject(
    key: String?,
    block: VirtualHostedStyleUrlOptionsDsl.() -> Unit = {}
): String {
    val builder = VirtualHostedStyleUrlOptionsDsl()
    builder.apply(block)
    return virtualHostedUrlForObject(key, builder.build())
}
