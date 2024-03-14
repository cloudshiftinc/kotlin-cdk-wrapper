package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBucketProps {
  /**
   * Configures the transfer acceleration state for an Amazon S3 bucket.
   *
   * For more information, see [Amazon S3 Transfer
   * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
   * *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
   */
  public fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

  /**
   * This is a legacy property, and it is not recommended for most use cases.
   *
   * A majority of modern use cases in Amazon S3 no longer require the use of ACLs, and we recommend
   * that you keep ACLs disabled. For more information, see [Controlling object
   * ownership](https://docs.aws.amazon.com//AmazonS3/latest/userguide/about-object-ownership.html) in
   * the *Amazon S3 User Guide* .
   *
   * A canned access control list (ACL) that grants predefined permissions to the bucket. For more
   * information about canned ACLs, see [Canned
   * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the *Amazon
   * S3 User Guide* .
   *
   * S3 buckets are created with ACLs disabled by default. Therefore, unless you explicitly set the
   * [AWS::S3::OwnershipControls](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html)
   * property to enable ACLs, your resource will fail to deploy with any value other than Private. Use
   * cases requiring ACLs are uncommon.
   *
   * The majority of access control configurations can be successfully and more easily achieved with
   * bucket policies. For more information, see
   * [AWS::S3::BucketPolicy](https://docs.aws.amazon.com//AWSCloudFormation/latest/UserGuide/aws-properties-s3-policy.html)
   * . For examples of common policy configurations, including S3 Server Access Logs buckets and more,
   * see [Bucket policy
   * examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html) in
   * the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accesscontrol)
   */
  public fun accessControl(): String? = unwrap(this).getAccessControl()

  /**
   * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
   */
  public fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
   * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
   * KMS-managed keys (DSSE-KMS).
   *
   * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
   * Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
   * in the *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketencryption)
   */
  public fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  /**
   * A name for the bucket.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for the
   * bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and dashes
   * (-) and must follow [Amazon S3 bucket restrictions and
   * limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html) . For more
   * information, see [Rules for naming Amazon S3
   * buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
   * in the *Amazon S3 User Guide* .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you need to replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketname)
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
   *
   * For more information, see [Enabling Cross-Origin Resource
   * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
   */
  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  /**
   * Defines how Amazon S3 handles Intelligent-Tiering storage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
   */
  public fun intelligentTieringConfigurations(): Any? =
      unwrap(this).getIntelligentTieringConfigurations()

  /**
   * Specifies the inventory configuration for an Amazon S3 bucket.
   *
   * For more information, see [GET Bucket
   * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
   * the *Amazon S3 API Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
   */
  public fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

  /**
   * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
   *
   * For more information, see [Object Lifecycle
   * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
   * *Amazon S3 User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
   */
  public fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * Settings that define where logs are stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
   */
  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
   * configuration ID) from an Amazon S3 bucket.
   *
   * If you're updating an existing metrics configuration, note that this is a full replacement of
   * the existing metrics configuration. If you don't include the elements you want to keep, they are
   * erased. For more information, see
   * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
   */
  public fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

  /**
   * Configuration that defines how Amazon S3 handles bucket notifications.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
   */
  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * This operation is not supported by directory buckets.
   *
   * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
   * Lock configuration will be applied by default to every new object placed in the specified bucket.
   * For more information, see [Locking
   * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
   *
   *
   * * The `DefaultRetention` settings require both a mode and a period.
   * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
   * cannot specify `Days` and `Years` at the same time.
   * * You can enable Object Lock for new or existing buckets. For more information, see
   * [Configuring Object
   * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockconfiguration)
   */
  public fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

  /**
   * Indicates whether this bucket has an Object Lock configuration enabled.
   *
   * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
   */
  public fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

  /**
   * Configuration that defines how Amazon S3 handles Object Ownership rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
   */
  public fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

  /**
   * Configuration that defines how Amazon S3 handles public access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
   */
  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * Configuration for replicating objects in an S3 bucket.
   *
   * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
   * property.
   *
   * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
   * buckets. The destination bucket or buckets must already exist.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
   */
  public fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  /**
   * An arbitrary set of tags (key-value pairs) for this S3 bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Enables multiple versions of all objects in this bucket.
   *
   * You might enable versioning to prevent objects from being deleted or overwritten by mistake or
   * to archive objects so that you can retrieve previous versions of them.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
   */
  public fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  /**
   * Information used to configure the bucket as a static website.
   *
   * For more information, see [Hosting Websites on Amazon
   * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
   */
  public fun websiteConfiguration(): Any? = unwrap(this).getWebsiteConfiguration()

  /**
   * A builder for [CfnBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable)

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    public
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty)

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d879dedc2e18f20de3b43a7753712f95b8da71d85f9f1f794c1f9e59d1eec47b")
    public
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty.Builder.() -> Unit)

    /**
     * @param accessControl This is a legacy property, and it is not recommended for most use cases.
     * A majority of modern use cases in Amazon S3 no longer require the use of ACLs, and we
     * recommend that you keep ACLs disabled. For more information, see [Controlling object
     * ownership](https://docs.aws.amazon.com//AmazonS3/latest/userguide/about-object-ownership.html)
     * in the *Amazon S3 User Guide* .
     *
     * A canned access control list (ACL) that grants predefined permissions to the bucket. For more
     * information about canned ACLs, see [Canned
     * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
     * *Amazon S3 User Guide* .
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
     * more, see [Bucket policy
     * examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html) in
     * the *Amazon S3 User Guide* .
     */
    public fun accessControl(accessControl: String)

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: IResolvable)

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(analyticsConfigurations: List<Any>)

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    public fun analyticsConfigurations(vararg analyticsConfigurations: Any)

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: IResolvable)

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    public fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty)

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7dda973024ffcd542628035f7d8fe73113f61e1c754f147db01bd9c31e40fc")
    public
        fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty.Builder.() -> Unit)

    /**
     * @param bucketName A name for the bucket.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and
     * dashes (-) and must follow [Amazon S3 bucket restrictions and
     * limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html) . For more
     * information, see [Rules for naming Amazon S3
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    public fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty)

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3609d8c61d992239f891f6019c95c2dabaf9d9e78038b46ff1c2fcb9564ed465")
    public
        fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable)

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>)

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any)

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(inventoryConfigurations: IResolvable)

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(inventoryConfigurations: List<Any>)

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    public fun inventoryConfigurations(vararg inventoryConfigurations: Any)

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty)

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4cf2859f8177e4c539ee4b2105397e3ec997d92154f1e97156c36a044a06c5")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    public fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty)

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40da739fe76f56ffb817546c21a42c6694444a7ba3ad5b2248e09c9dadea0727")
    public
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit)

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    public fun metricsConfigurations(metricsConfigurations: IResolvable)

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    public fun metricsConfigurations(metricsConfigurations: List<Any>)

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    public fun metricsConfigurations(vararg metricsConfigurations: Any)

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    public
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty)

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b0b90f503589c9cb50119ce40919916863fc1c6fc64bf3195ea67c80853e4ad")
    public
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    public fun objectLockConfiguration(objectLockConfiguration: IResolvable)

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    public
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty)

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68d56fbddfa842e4ef7764fb09920a64a35a02dd1d0becba20f6a7b056306ad5")
    public
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty.Builder.() -> Unit)

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled.
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean)

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled.
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: IResolvable)

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    public fun ownershipControls(ownershipControls: IResolvable)

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    public fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty)

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b338c0dbbcbc434c0bc0730771700c79f0387b2db05dda556c540a396cd5868")
    public
        fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty.Builder.() -> Unit)

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty)

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349d5bd7475de337e9cbd29f750cdaf75c7dab583d264de236450629e82bab")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    public
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty)

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b857b94a46119b04b3d1b82506a9bc2043f4cd33fe0aba803cfc3774a0f1826")
    public
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    public
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty)

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3cfae8b56cb451301bf46541164cbe333641bf3807ee6df146c708f3aca7007")
    public
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit)

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    public fun websiteConfiguration(websiteConfiguration: IResolvable)

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    public fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty)

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("473e2757bba809ea76afc5b70a68eefe416883e93bf16b872bce3786228df6ef")
    public
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucketProps.Builder =
        software.amazon.awscdk.services.s3.CfnBucketProps.builder()

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    override fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    override
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(CfnBucket.AccelerateConfigurationProperty::unwrap))
    }

    /**
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket.
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d879dedc2e18f20de3b43a7753712f95b8da71d85f9f1f794c1f9e59d1eec47b")
    override
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty.Builder.() -> Unit):
        Unit =
        accelerateConfiguration(CfnBucket.AccelerateConfigurationProperty(accelerateConfiguration))

    /**
     * @param accessControl This is a legacy property, and it is not recommended for most use cases.
     * A majority of modern use cases in Amazon S3 no longer require the use of ACLs, and we
     * recommend that you keep ACLs disabled. For more information, see [Controlling object
     * ownership](https://docs.aws.amazon.com//AmazonS3/latest/userguide/about-object-ownership.html)
     * in the *Amazon S3 User Guide* .
     *
     * A canned access control list (ACL) that grants predefined permissions to the bucket. For more
     * information about canned ACLs, see [Canned
     * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
     * *Amazon S3 User Guide* .
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
     * more, see [Bucket policy
     * examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html) in
     * the *Amazon S3 User Guide* .
     */
    override fun accessControl(accessControl: String) {
      cdkBuilder.accessControl(accessControl)
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    override fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    override fun analyticsConfigurations(analyticsConfigurations: List<Any>) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations)
    }

    /**
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket.
     */
    override fun analyticsConfigurations(vararg analyticsConfigurations: Any): Unit =
        analyticsConfigurations(analyticsConfigurations.toList())

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    override fun bucketEncryption(bucketEncryption: IResolvable) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(IResolvable::unwrap))
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    override fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(CfnBucket.BucketEncryptionProperty::unwrap))
    }

    /**
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS).
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7dda973024ffcd542628035f7d8fe73113f61e1c754f147db01bd9c31e40fc")
    override
        fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(CfnBucket.BucketEncryptionProperty(bucketEncryption))

    /**
     * @param bucketName A name for the bucket.
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and
     * dashes (-) and must follow [Amazon S3 bucket restrictions and
     * limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html) . For more
     * information, see [Rules for naming Amazon S3
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    override fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnBucket.CorsConfigurationProperty::unwrap))
    }

    /**
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket.
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3609d8c61d992239f891f6019c95c2dabaf9d9e78038b46ff1c2fcb9564ed465")
    override
        fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CfnBucket.CorsConfigurationProperty(corsConfiguration))

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
    }

    /**
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage.
     */
    override fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any):
        Unit = intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    override fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    override fun inventoryConfigurations(inventoryConfigurations: List<Any>) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations)
    }

    /**
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     */
    override fun inventoryConfigurations(vararg inventoryConfigurations: Any): Unit =
        inventoryConfigurations(inventoryConfigurations.toList())

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(CfnBucket.LifecycleConfigurationProperty::unwrap))
    }

    /**
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket.
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4cf2859f8177e4c539ee4b2105397e3ec997d92154f1e97156c36a044a06c5")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleConfiguration(CfnBucket.LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    override
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnBucket.LoggingConfigurationProperty::unwrap))
    }

    /**
     * @param loggingConfiguration Settings that define where logs are stored.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40da739fe76f56ffb817546c21a42c6694444a7ba3ad5b2248e09c9dadea0727")
    override
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(CfnBucket.LoggingConfigurationProperty(loggingConfiguration))

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    override fun metricsConfigurations(metricsConfigurations: IResolvable) {
      cdkBuilder.metricsConfigurations(metricsConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    override fun metricsConfigurations(metricsConfigurations: List<Any>) {
      cdkBuilder.metricsConfigurations(metricsConfigurations)
    }

    /**
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket.
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     */
    override fun metricsConfigurations(vararg metricsConfigurations: Any): Unit =
        metricsConfigurations(metricsConfigurations.toList())

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    override
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnBucket.NotificationConfigurationProperty::unwrap))
    }

    /**
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b0b90f503589c9cb50119ce40919916863fc1c6fc64bf3195ea67c80853e4ad")
    override
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnBucket.NotificationConfigurationProperty(notificationConfiguration))

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    override fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    override
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(CfnBucket.ObjectLockConfigurationProperty::unwrap))
    }

    /**
     * @param objectLockConfiguration This operation is not supported by directory buckets.
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68d56fbddfa842e4ef7764fb09920a64a35a02dd1d0becba20f6a7b056306ad5")
    override
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLockConfiguration(CfnBucket.ObjectLockConfigurationProperty(objectLockConfiguration))

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled.
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled.
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     */
    override fun objectLockEnabled(objectLockEnabled: IResolvable) {
      cdkBuilder.objectLockEnabled(objectLockEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    override fun ownershipControls(ownershipControls: IResolvable) {
      cdkBuilder.ownershipControls(ownershipControls.let(IResolvable::unwrap))
    }

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    override fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty) {
      cdkBuilder.ownershipControls(ownershipControls.let(CfnBucket.OwnershipControlsProperty::unwrap))
    }

    /**
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b338c0dbbcbc434c0bc0730771700c79f0387b2db05dda556c540a396cd5868")
    override
        fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty.Builder.() -> Unit):
        Unit = ownershipControls(CfnBucket.OwnershipControlsProperty(ownershipControls))

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnBucket.PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349d5bd7475de337e9cbd29f750cdaf75c7dab583d264de236450629e82bab")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnBucket.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    override
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnBucket.ReplicationConfigurationProperty::unwrap))
    }

    /**
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket.
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b857b94a46119b04b3d1b82506a9bc2043f4cd33fe0aba803cfc3774a0f1826")
    override
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnBucket.ReplicationConfigurationProperty(replicationConfiguration))

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    override
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(CfnBucket.VersioningConfigurationProperty::unwrap))
    }

    /**
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket.
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3cfae8b56cb451301bf46541164cbe333641bf3807ee6df146c708f3aca7007")
    override
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit):
        Unit =
        versioningConfiguration(CfnBucket.VersioningConfigurationProperty(versioningConfiguration))

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    override fun websiteConfiguration(websiteConfiguration: IResolvable) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    override
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(CfnBucket.WebsiteConfigurationProperty::unwrap))
    }

    /**
     * @param websiteConfiguration Information used to configure the bucket as a static website.
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("473e2757bba809ea76afc5b70a68eefe416883e93bf16b872bce3786228df6ef")
    override
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit):
        Unit = websiteConfiguration(CfnBucket.WebsiteConfigurationProperty(websiteConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnBucketProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     */
    override fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

    /**
     * This is a legacy property, and it is not recommended for most use cases.
     *
     * A majority of modern use cases in Amazon S3 no longer require the use of ACLs, and we
     * recommend that you keep ACLs disabled. For more information, see [Controlling object
     * ownership](https://docs.aws.amazon.com//AmazonS3/latest/userguide/about-object-ownership.html)
     * in the *Amazon S3 User Guide* .
     *
     * A canned access control list (ACL) that grants predefined permissions to the bucket. For more
     * information about canned ACLs, see [Canned
     * ACL](https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl) in the
     * *Amazon S3 User Guide* .
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
     * more, see [Bucket policy
     * examples](https://docs.aws.amazon.com/AmazonS3/latest/userguide/example-bucket-policies.html) in
     * the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accesscontrol)
     */
    override fun accessControl(): String? = unwrap(this).getAccessControl()

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     */
    override fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
     * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
     * KMS-managed keys (DSSE-KMS).
     *
     * For information about the Amazon S3 default encryption feature, see [Amazon S3 Default
     * Encryption for S3
     * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html) in the *Amazon
     * S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketencryption)
     */
    override fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

    /**
     * A name for the bucket.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique ID and uses that ID for
     * the bucket name. The bucket name must contain only lowercase letters, numbers, periods (.), and
     * dashes (-) and must follow [Amazon S3 bucket restrictions and
     * limitations](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html) . For more
     * information, see [Rules for naming Amazon S3
     * buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/BucketRestrictions.html#bucketnamingrules)
     * in the *Amazon S3 User Guide* .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-bucketname)
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     */
    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     */
    override fun intelligentTieringConfigurations(): Any? =
        unwrap(this).getIntelligentTieringConfigurations()

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     */
    override fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     */
    override fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     */
    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    /**
     * Specifies a metrics configuration for the CloudWatch request metrics (specified by the
     * metrics configuration ID) from an Amazon S3 bucket.
     *
     * If you're updating an existing metrics configuration, note that this is a full replacement of
     * the existing metrics configuration. If you don't include the elements you want to keep, they are
     * erased. For more information, see
     * [PutBucketMetricsConfiguration](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-metricsconfigurations)
     */
    override fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     */
    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    /**
     * This operation is not supported by directory buckets.
     *
     * Places an Object Lock configuration on the specified bucket. The rule specified in the Object
     * Lock configuration will be applied by default to every new object placed in the specified
     * bucket. For more information, see [Locking
     * Objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html) .
     *
     *
     * * The `DefaultRetention` settings require both a mode and a period.
     * * The `DefaultRetention` period can be either `Days` or `Years` but you must select one. You
     * cannot specify `Days` and `Years` at the same time.
     * * You can enable Object Lock for new or existing buckets. For more information, see
     * [Configuring Object
     * Lock](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-configure.html) .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockconfiguration)
     */
    override fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     */
    override fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     */
    override fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     */
    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    /**
     * Configuration for replicating objects in an S3 bucket.
     *
     * To enable replication, you must also enable versioning by using the `VersioningConfiguration`
     * property.
     *
     * Amazon S3 can store replicated objects in a single destination bucket or multiple destination
     * buckets. The destination bucket or buckets must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-replicationconfiguration)
     */
    override fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     */
    override fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     */
    override fun websiteConfiguration(): Any? = unwrap(this).getWebsiteConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucketProps): CfnBucketProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketProps): software.amazon.awscdk.services.s3.CfnBucketProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucketProps
  }
}
