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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import software.amazon.awscdk.services.s3.CfnBucketProps

/**
 * Properties for defining a `CfnBucket`.
 *
 * Example:
 * ```
 * CfnBucket rawBucket = CfnBucket.Builder.create(this, "Bucket").build();
 * // -or-
 * CfnBucket rawBucketAlt = (CfnBucket)myBucket.getNode().getDefaultChild();
 * // then
 * rawBucket.getCfnOptions().getCondition() = CfnCondition.Builder.create(this,
 * "EnableBucket").build();
 * rawBucket.getCfnOptions().getMetadata() = Map.of(
 * "metadataKey", "MetadataValue");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html)
 */
@CdkDslMarker
public class CfnBucketPropsDsl {
    private val cdkBuilder: CfnBucketProps.Builder = CfnBucketProps.builder()

    private val _analyticsConfigurations: MutableList<Any> = mutableListOf()

    private val _intelligentTieringConfigurations: MutableList<Any> = mutableListOf()

    private val _inventoryConfigurations: MutableList<Any> = mutableListOf()

    private val _metricsConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     *   bucket. For more information, see
     *   [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
        cdkBuilder.accelerateConfiguration(accelerateConfiguration)
    }

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     *   bucket. For more information, see
     *   [Amazon S3 Transfer Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun accelerateConfiguration(
        accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty
    ) {
        cdkBuilder.accelerateConfiguration(accelerateConfiguration)
    }

    /**
     * @param accessControl This is a legacy property, and it is not recommended for most use cases.
     *   A majority of modern use cases in Amazon S3 no longer require the use of ACLs, and we
     *   recommend that you keep ACLs disabled. For more information, see
     *   [Controlling object ownership](https://docs.aws.amazon.com//AmazonS3/latest/userguide/about-object-ownership.html)
     *   in the *Amazon S3 User Guide* .
     *
     * A canned access control list (ACL) that grants predefined permissions to the bucket. For more
     * information about canned ACLs, see
     * [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in
     * the *Amazon S3 User Guide* .
     *
     * S3 buckets are created with ACLs disabled by default. Therefore, unless you explicitly set
     * the
     * [AWS::S3::OwnershipControls](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html)
     * property to enable ACLs, your resource will fail to deploy with any value other than Private.
     * Use cases requiring ACLs are uncommon.
     *
     * The majority of access control configurations can be successfully and more easily achieved
     * with bucket policies. For more information, see
     * [AWS::S3::BucketPolicy](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html)
     * . For examples of common policy configurations, including S3 Server Access Logs buckets and
     * more, see
     * [Bucket policy examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html)
     * in the *Amazon S3 User Guide* .
     */
    public fun accessControl(accessControl: String) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(vararg analyticsConfigurations: Any) {
        _analyticsConfigurations.addAll(listOf(*analyticsConfigurations))
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: Collection<Any>) {
        _analyticsConfigurations.addAll(analyticsConfigurations)
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     *   filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
        cdkBuilder.analyticsConfigurations(analyticsConfigurations)
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     *   encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or
     *   dual-layer server-side encryption with KMS-managed keys (DSSE-KMS). For information about
     *   the Amazon S3 default encryption feature, see
     *   [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: IResolvable) {
        cdkBuilder.bucketEncryption(bucketEncryption)
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     *   encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or
     *   dual-layer server-side encryption with KMS-managed keys (DSSE-KMS). For information about
     *   the Amazon S3 default encryption feature, see
     *   [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty) {
        cdkBuilder.bucketEncryption(bucketEncryption)
    }

    /**
     * @param bucketName A name for the bucket. If you don't specify a name, AWS CloudFormation
     *   generates a unique ID and uses that ID for the bucket name. The bucket name must contain
     *   only lowercase letters, numbers, periods (.), and dashes (-) and must follow
     *   [Amazon S3 bucket restrictions and limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html)
     *   . For more information, see
     *   [Rules for naming Amazon S3 buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
     *   in the *Amazon S3 User Guide* .
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     *   Amazon S3 bucket. For more information, see
     *   [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun corsConfiguration(corsConfiguration: IResolvable) {
        cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     *   Amazon S3 bucket. For more information, see
     *   [Enabling Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty) {
        cdkBuilder.corsConfiguration(corsConfiguration)
    }

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any) {
        _intelligentTieringConfigurations.addAll(listOf(*intelligentTieringConfigurations))
    }

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: Collection<Any>) {
        _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
    }

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     *   storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
        cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
    }

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     *   For more information, see
     *   [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     *   in the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(vararg inventoryConfigurations: Any) {
        _inventoryConfigurations.addAll(listOf(*inventoryConfigurations))
    }

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     *   For more information, see
     *   [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     *   in the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(inventoryConfigurations: Collection<Any>) {
        _inventoryConfigurations.addAll(inventoryConfigurations)
    }

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     *   For more information, see
     *   [GET Bucket inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html)
     *   in the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
        cdkBuilder.inventoryConfigurations(inventoryConfigurations)
    }

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     *   S3 bucket. For more information, see
     *   [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     *   S3 bucket. For more information, see
     *   [Object Lifecycle Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun lifecycleConfiguration(
        lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty
    ) {
        cdkBuilder.lifecycleConfiguration(lifecycleConfiguration)
    }

    /** @param loggingConfiguration Settings that define where logs are stored. */
    public fun loggingConfiguration(loggingConfiguration: IResolvable) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /** @param loggingConfiguration Settings that define where logs are stored. */
    public fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty) {
        cdkBuilder.loggingConfiguration(loggingConfiguration)
    }

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. If you're
     *   updating an existing metrics configuration, note that this is a full replacement of the
     *   existing metrics configuration. If you don't include the elements you want to keep, they
     *   are erased. For more information, see
     *   [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     *   .
     */
    public fun metricsConfigurations(vararg metricsConfigurations: Any) {
        _metricsConfigurations.addAll(listOf(*metricsConfigurations))
    }

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. If you're
     *   updating an existing metrics configuration, note that this is a full replacement of the
     *   existing metrics configuration. If you don't include the elements you want to keep, they
     *   are erased. For more information, see
     *   [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     *   .
     */
    public fun metricsConfigurations(metricsConfigurations: Collection<Any>) {
        _metricsConfigurations.addAll(metricsConfigurations)
    }

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     *   metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. If you're
     *   updating an existing metrics configuration, note that this is a full replacement of the
     *   existing metrics configuration. If you don't include the elements you want to keep, they
     *   are erased. For more information, see
     *   [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     *   .
     */
    public fun metricsConfigurations(metricsConfigurations: IResolvable) {
        cdkBuilder.metricsConfigurations(metricsConfigurations)
    }

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     *   notifications.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     *   notifications.
     */
    public fun notificationConfiguration(
        notificationConfiguration: CfnBucket.NotificationConfigurationProperty
    ) {
        cdkBuilder.notificationConfiguration(notificationConfiguration)
    }

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets. Places
     *   an Object Lock configuration on the specified bucket. The rule specified in the Object Lock
     *   configuration will be applied by default to every new object placed in the specified
     *   bucket. For more information, see
     *   [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     *   cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     *   [Configuring Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html)
     *   .
     */
    public fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
        cdkBuilder.objectLockConfiguration(objectLockConfiguration)
    }

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets. Places
     *   an Object Lock configuration on the specified bucket. The rule specified in the Object Lock
     *   configuration will be applied by default to every new object placed in the specified
     *   bucket. For more information, see
     *   [Locking Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     *   cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     *   [Configuring Object Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html)
     *   .
     */
    public fun objectLockConfiguration(
        objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty
    ) {
        cdkBuilder.objectLockConfiguration(objectLockConfiguration)
    }

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     *   enabled. Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     *   enabled. Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: IResolvable) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     *   rules.
     */
    public fun ownershipControls(ownershipControls: IResolvable) {
        cdkBuilder.ownershipControls(ownershipControls)
    }

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     *   rules.
     */
    public fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty) {
        cdkBuilder.ownershipControls(ownershipControls)
    }

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     *   access.
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     *   access.
     */
    public fun publicAccessBlockConfiguration(
        publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty
    ) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. To
     *   enable replication, you must also enable versioning by using the `VersioningConfiguration`
     *   property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. To
     *   enable replication, you must also enable versioning by using the `VersioningConfiguration`
     *   property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    public fun replicationConfiguration(
        replicationConfiguration: CfnBucket.ReplicationConfigurationProperty
    ) {
        cdkBuilder.replicationConfiguration(replicationConfiguration)
    }

    /** @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. You
     *   might enable versioning to prevent objects from being deleted or overwritten by mistake or
     *   to archive objects so that you can retrieve previous versions of them.
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable) {
        cdkBuilder.versioningConfiguration(versioningConfiguration)
    }

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. You
     *   might enable versioning to prevent objects from being deleted or overwritten by mistake or
     *   to archive objects so that you can retrieve previous versions of them.
     */
    public fun versioningConfiguration(
        versioningConfiguration: CfnBucket.VersioningConfigurationProperty
    ) {
        cdkBuilder.versioningConfiguration(versioningConfiguration)
    }

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website. For
     *   more information, see
     *   [Hosting Websites on Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
     *   .
     */
    public fun websiteConfiguration(websiteConfiguration: IResolvable) {
        cdkBuilder.websiteConfiguration(websiteConfiguration)
    }

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website. For
     *   more information, see
     *   [Hosting Websites on Amazon S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
     *   .
     */
    public fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty) {
        cdkBuilder.websiteConfiguration(websiteConfiguration)
    }

    public fun build(): CfnBucketProps {
        if (_analyticsConfigurations.isNotEmpty())
            cdkBuilder.analyticsConfigurations(_analyticsConfigurations)
        if (_intelligentTieringConfigurations.isNotEmpty())
            cdkBuilder.intelligentTieringConfigurations(_intelligentTieringConfigurations)
        if (_inventoryConfigurations.isNotEmpty())
            cdkBuilder.inventoryConfigurations(_inventoryConfigurations)
        if (_metricsConfigurations.isNotEmpty())
            cdkBuilder.metricsConfigurations(_metricsConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
