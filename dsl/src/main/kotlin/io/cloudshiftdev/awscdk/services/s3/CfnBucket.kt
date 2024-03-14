package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Configures the transfer acceleration state for an Amazon S3 bucket.
   */
  public open fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

  /**
   * Configures the transfer acceleration state for an Amazon S3 bucket.
   */
  public open fun accelerateConfiguration(`value`: IResolvable) {
    unwrap(this).setAccelerateConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures the transfer acceleration state for an Amazon S3 bucket.
   */
  public open fun accelerateConfiguration(`value`: AccelerateConfigurationProperty) {
    unwrap(this).setAccelerateConfiguration(`value`.let(AccelerateConfigurationProperty::unwrap))
  }

  /**
   * Configures the transfer acceleration state for an Amazon S3 bucket.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7a73f48ce5baa3308868832e061fb6ed212fafdb3343da976a3c24291b3a435")
  public open
      fun accelerateConfiguration(`value`: AccelerateConfigurationProperty.Builder.() -> Unit): Unit
      = accelerateConfiguration(AccelerateConfigurationProperty(`value`))

  /**
   * This is a legacy property, and it is not recommended for most use cases.
   */
  public open fun accessControl(): String? = unwrap(this).getAccessControl()

  /**
   * This is a legacy property, and it is not recommended for most use cases.
   */
  public open fun accessControl(`value`: String) {
    unwrap(this).setAccessControl(`value`)
  }

  /**
   * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
   */
  public open fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

  /**
   * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
   */
  public open fun analyticsConfigurations(`value`: IResolvable) {
    unwrap(this).setAnalyticsConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
   */
  public open fun analyticsConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnalyticsConfigurations(__idx_ac66f0)
  }

  /**
   * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
   */
  public open fun analyticsConfigurations(vararg __idx_ac66f0: Any): Unit =
      analyticsConfigurations(__idx_ac66f0.toList())

  /**
   * Returns the Amazon Resource Name (ARN) of the specified bucket.
   *
   * Example: `arn:aws:s3:::DOC-EXAMPLE-BUCKET`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the IPv4 DNS name of the specified bucket.
   *
   * Example: `DOC-EXAMPLE-BUCKET.s3.amazonaws.com`
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * Returns the IPv6 DNS name of the specified bucket.
   *
   * Example: `DOC-EXAMPLE-BUCKET.s3.dualstack.us-east-2.amazonaws.com`
   *
   * For more information about dual-stack endpoints, see [Using Amazon S3 Dual-Stack
   * Endpoints](https://docs.aws.amazon.com/AmazonS3/latest/dev/dual-stack-endpoints.html) .
   */
  public open fun attrDualStackDomainName(): String = unwrap(this).getAttrDualStackDomainName()

  /**
   * Returns the regional domain name of the specified bucket.
   *
   * Example: `DOC-EXAMPLE-BUCKET.s3.us-east-2.amazonaws.com`
   */
  public open fun attrRegionalDomainName(): String = unwrap(this).getAttrRegionalDomainName()

  /**
   * Returns the Amazon S3 website endpoint for the specified bucket.
   *
   * Example (IPv4): `http://DOC-EXAMPLE-BUCKET.s3-website.us-east-2.amazonaws.com`
   *
   * Example (IPv6): `http://DOC-EXAMPLE-BUCKET.s3.dualstack.us-east-2.amazonaws.com`
   */
  public open fun attrWebsiteUrl(): String = unwrap(this).getAttrWebsiteUrl()

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
   * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
   * KMS-managed keys (DSSE-KMS).
   */
  public open fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
   * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
   * KMS-managed keys (DSSE-KMS).
   */
  public open fun bucketEncryption(`value`: IResolvable) {
    unwrap(this).setBucketEncryption(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
   * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
   * KMS-managed keys (DSSE-KMS).
   */
  public open fun bucketEncryption(`value`: BucketEncryptionProperty) {
    unwrap(this).setBucketEncryption(`value`.let(BucketEncryptionProperty::unwrap))
  }

  /**
   * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
   * keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer server-side encryption with
   * KMS-managed keys (DSSE-KMS).
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cab07ffd4ef2f5c3f3a3a96f2ec1f20a4babd0a7a5b71bf95c45715f262aa9e4")
  public open fun bucketEncryption(`value`: BucketEncryptionProperty.Builder.() -> Unit): Unit =
      bucketEncryption(BucketEncryptionProperty(`value`))

  /**
   * A name for the bucket.
   */
  public open fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * A name for the bucket.
   */
  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  /**
   * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
   */
  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  /**
   * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
   */
  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
   */
  public open fun corsConfiguration(`value`: CorsConfigurationProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsConfigurationProperty::unwrap))
  }

  /**
   * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71d099e546d2586c68742c5bc9dd19e3633ae279b97b0405a372e629b831d65d")
  public open fun corsConfiguration(`value`: CorsConfigurationProperty.Builder.() -> Unit): Unit =
      corsConfiguration(CorsConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Defines how Amazon S3 handles Intelligent-Tiering storage.
   */
  public open fun intelligentTieringConfigurations(): Any? =
      unwrap(this).getIntelligentTieringConfigurations()

  /**
   * Defines how Amazon S3 handles Intelligent-Tiering storage.
   */
  public open fun intelligentTieringConfigurations(`value`: IResolvable) {
    unwrap(this).setIntelligentTieringConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Defines how Amazon S3 handles Intelligent-Tiering storage.
   */
  public open fun intelligentTieringConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setIntelligentTieringConfigurations(__idx_ac66f0)
  }

  /**
   * Defines how Amazon S3 handles Intelligent-Tiering storage.
   */
  public open fun intelligentTieringConfigurations(vararg __idx_ac66f0: Any): Unit =
      intelligentTieringConfigurations(__idx_ac66f0.toList())

  /**
   * Specifies the inventory configuration for an Amazon S3 bucket.
   */
  public open fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

  /**
   * Specifies the inventory configuration for an Amazon S3 bucket.
   */
  public open fun inventoryConfigurations(`value`: IResolvable) {
    unwrap(this).setInventoryConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the inventory configuration for an Amazon S3 bucket.
   */
  public open fun inventoryConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setInventoryConfigurations(__idx_ac66f0)
  }

  /**
   * Specifies the inventory configuration for an Amazon S3 bucket.
   */
  public open fun inventoryConfigurations(vararg __idx_ac66f0: Any): Unit =
      inventoryConfigurations(__idx_ac66f0.toList())

  /**
   * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
   */
  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  /**
   * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
   */
  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
   */
  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty::unwrap))
  }

  /**
   * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97dadd7ae868062705450c20268b14e24ff3d191c50d4daec7530b9d952fa94f")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  /**
   * Settings that define where logs are stored.
   */
  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  /**
   * Settings that define where logs are stored.
   */
  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Settings that define where logs are stored.
   */
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  /**
   * Settings that define where logs are stored.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9326b8150b42b4ed6e8c7a63f01a53d21bbe4f4bd488a22508df622e6020266")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  /**
   * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
   * configuration ID) from an Amazon S3 bucket.
   */
  public open fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

  /**
   * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
   * configuration ID) from an Amazon S3 bucket.
   */
  public open fun metricsConfigurations(`value`: IResolvable) {
    unwrap(this).setMetricsConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
   * configuration ID) from an Amazon S3 bucket.
   */
  public open fun metricsConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricsConfigurations(__idx_ac66f0)
  }

  /**
   * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
   * configuration ID) from an Amazon S3 bucket.
   */
  public open fun metricsConfigurations(vararg __idx_ac66f0: Any): Unit =
      metricsConfigurations(__idx_ac66f0.toList())

  /**
   * Configuration that defines how Amazon S3 handles bucket notifications.
   */
  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * Configuration that defines how Amazon S3 handles bucket notifications.
   */
  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles bucket notifications.
   */
  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles bucket notifications.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90a714e8628416ff24fec60901cca5af7ecd51a60a4d61cb230b053815f39e82")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  /**
   * This operation is not supported by directory buckets.
   */
  public open fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

  /**
   * This operation is not supported by directory buckets.
   */
  public open fun objectLockConfiguration(`value`: IResolvable) {
    unwrap(this).setObjectLockConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * This operation is not supported by directory buckets.
   */
  public open fun objectLockConfiguration(`value`: ObjectLockConfigurationProperty) {
    unwrap(this).setObjectLockConfiguration(`value`.let(ObjectLockConfigurationProperty::unwrap))
  }

  /**
   * This operation is not supported by directory buckets.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7498771a97b1a83de040af21d9c576e5798ec802e19ec979ffe682e0f124cedf")
  public open
      fun objectLockConfiguration(`value`: ObjectLockConfigurationProperty.Builder.() -> Unit): Unit
      = objectLockConfiguration(ObjectLockConfigurationProperty(`value`))

  /**
   * Indicates whether this bucket has an Object Lock configuration enabled.
   */
  public open fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

  /**
   * Indicates whether this bucket has an Object Lock configuration enabled.
   */
  public open fun objectLockEnabled(`value`: Boolean) {
    unwrap(this).setObjectLockEnabled(`value`)
  }

  /**
   * Indicates whether this bucket has an Object Lock configuration enabled.
   */
  public open fun objectLockEnabled(`value`: IResolvable) {
    unwrap(this).setObjectLockEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles Object Ownership rules.
   */
  public open fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

  /**
   * Configuration that defines how Amazon S3 handles Object Ownership rules.
   */
  public open fun ownershipControls(`value`: IResolvable) {
    unwrap(this).setOwnershipControls(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles Object Ownership rules.
   */
  public open fun ownershipControls(`value`: OwnershipControlsProperty) {
    unwrap(this).setOwnershipControls(`value`.let(OwnershipControlsProperty::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles Object Ownership rules.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82cb9d28b7a0f1ca3cd7f2bbc0b6fc6dd31b07f9052b458dd4756a47b9ead4e7")
  public open fun ownershipControls(`value`: OwnershipControlsProperty.Builder.() -> Unit): Unit =
      ownershipControls(OwnershipControlsProperty(`value`))

  /**
   * Configuration that defines how Amazon S3 handles public access.
   */
  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  /**
   * Configuration that defines how Amazon S3 handles public access.
   */
  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles public access.
   */
  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty::unwrap))
  }

  /**
   * Configuration that defines how Amazon S3 handles public access.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c49a87fb524ead2c15621d3c133ca97098205108d6b274b7f36dd9be34a9da63")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  /**
   * Configuration for replicating objects in an S3 bucket.
   */
  public open fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  /**
   * Configuration for replicating objects in an S3 bucket.
   */
  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration for replicating objects in an S3 bucket.
   */
  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  /**
   * Configuration for replicating objects in an S3 bucket.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35b8dd2248b9d2fc61177f47518a630899f3cf4610068cd9bea56000889b6b4b")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key-value pairs) for this S3 bucket.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key-value pairs) for this S3 bucket.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An arbitrary set of tags (key-value pairs) for this S3 bucket.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Enables multiple versions of all objects in this bucket.
   */
  public open fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  /**
   * Enables multiple versions of all objects in this bucket.
   */
  public open fun versioningConfiguration(`value`: IResolvable) {
    unwrap(this).setVersioningConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Enables multiple versions of all objects in this bucket.
   */
  public open fun versioningConfiguration(`value`: VersioningConfigurationProperty) {
    unwrap(this).setVersioningConfiguration(`value`.let(VersioningConfigurationProperty::unwrap))
  }

  /**
   * Enables multiple versions of all objects in this bucket.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ae147c1d499f529b5489f48654735e0f9109a0e07db6c8387dd35b0a3e759e2")
  public open
      fun versioningConfiguration(`value`: VersioningConfigurationProperty.Builder.() -> Unit): Unit
      = versioningConfiguration(VersioningConfigurationProperty(`value`))

  /**
   * Information used to configure the bucket as a static website.
   */
  public open fun websiteConfiguration(): Any? = unwrap(this).getWebsiteConfiguration()

  /**
   * Information used to configure the bucket as a static website.
   */
  public open fun websiteConfiguration(`value`: IResolvable) {
    unwrap(this).setWebsiteConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information used to configure the bucket as a static website.
   */
  public open fun websiteConfiguration(`value`: WebsiteConfigurationProperty) {
    unwrap(this).setWebsiteConfiguration(`value`.let(WebsiteConfigurationProperty::unwrap))
  }

  /**
   * Information used to configure the bucket as a static website.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec54d68491c7c4e814b278ffa7800c0d0e03d43e094554dbf6a4167446b094c2")
  public open fun websiteConfiguration(`value`: WebsiteConfigurationProperty.Builder.() -> Unit):
      Unit = websiteConfiguration(WebsiteConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.CfnBucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable)

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    public fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty)

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d00eae5db0dcb40ec3b29301ef5657d71ea073cb12bbfe73105c1cc3b834aaf")
    public
        fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty.Builder.() -> Unit)

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
     * @param accessControl This is a legacy property, and it is not recommended for most use cases.
     * 
     */
    public fun accessControl(accessControl: String)

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    public fun analyticsConfigurations(analyticsConfigurations: IResolvable)

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    public fun analyticsConfigurations(analyticsConfigurations: List<Any>)

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    public fun analyticsConfigurations(vararg analyticsConfigurations: Any)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    public fun bucketEncryption(bucketEncryption: IResolvable)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty)

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebcb7c17d411750b2f75f4e938ef6700a42e1c90624324aa83db87013d5ed712")
    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit)

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
     * @param bucketName A name for the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    public fun corsConfiguration(corsConfiguration: IResolvable)

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    public fun corsConfiguration(corsConfiguration: CorsConfigurationProperty)

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5e9ba14372cccffc4e7871c656864cbbcc7cb9d0216cc850276da4e6a873e2c")
    public fun corsConfiguration(corsConfiguration: CorsConfigurationProperty.Builder.() -> Unit)

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable)

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>)

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any)

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    public fun inventoryConfigurations(inventoryConfigurations: IResolvable)

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    public fun inventoryConfigurations(inventoryConfigurations: List<Any>)

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    public fun inventoryConfigurations(vararg inventoryConfigurations: Any)

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dbbaa2b2597aab1aaf9ce400dcd366ad67e6916825cc9590bdbf90cfc7ede89")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d26fd90a1e29625730bec9f94c832ce940d1445ab8f90af03bce65f699e92002")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    public fun metricsConfigurations(metricsConfigurations: IResolvable)

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    public fun metricsConfigurations(metricsConfigurations: List<Any>)

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    public fun metricsConfigurations(vararg metricsConfigurations: Any)

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1941b41ecd0c5b8d822f40c57f36e8ed016fb000fe7d63b0d2b7c1889eed1b5")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    public fun objectLockConfiguration(objectLockConfiguration: IResolvable)

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    public fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty)

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b10c12177b91999519c590896e250f7e7bb33cdecfc33d927a11aa64f4d7fcb8")
    public
        fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty.Builder.() -> Unit)

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled. 
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean)

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled. 
     */
    public fun objectLockEnabled(objectLockEnabled: IResolvable)

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    public fun ownershipControls(ownershipControls: IResolvable)

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    public fun ownershipControls(ownershipControls: OwnershipControlsProperty)

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cc9ca38ed9e286cb88cdaa5e6a6b8efac68c748ae62bba4f9a1fea0a5eb54cb")
    public fun ownershipControls(ownershipControls: OwnershipControlsProperty.Builder.() -> Unit)

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f71c1cdc7a7e8211928dd8456b0c06dbf20f87536904b772db197823e87bf02")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab88a85173a0862c0c9f1f4e3f278ce766ae64c7a53238676ea31fd7556cba11")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    public fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty)

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d492ca26a7ac967006901d0b4a1909c75a10eb9c474f96f53d132a3ba20183")
    public
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit)

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    public fun websiteConfiguration(websiteConfiguration: IResolvable)

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    public fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty)

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775a82b8977721915020e905125f48facfbc26bb5b9fb858cae884e552a2cc2a")
    public
        fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.Builder =
        software.amazon.awscdk.services.s3.CfnBucket.Builder.create(scope, id)

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    override fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    override fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(AccelerateConfigurationProperty::unwrap))
    }

    /**
     * Configures the transfer acceleration state for an Amazon S3 bucket.
     *
     * For more information, see [Amazon S3 Transfer
     * Acceleration](https://docs.aws.amazon.com/AmazonS3/latest/dev/transfer-acceleration.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-accelerateconfiguration)
     * @param accelerateConfiguration Configures the transfer acceleration state for an Amazon S3
     * bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d00eae5db0dcb40ec3b29301ef5657d71ea073cb12bbfe73105c1cc3b834aaf")
    override
        fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty.Builder.() -> Unit):
        Unit = accelerateConfiguration(AccelerateConfigurationProperty(accelerateConfiguration))

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
     * @param accessControl This is a legacy property, and it is not recommended for most use cases.
     * 
     */
    override fun accessControl(accessControl: String) {
      cdkBuilder.accessControl(accessControl)
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    override fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    override fun analyticsConfigurations(analyticsConfigurations: List<Any>) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations)
    }

    /**
     * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-analyticsconfigurations)
     * @param analyticsConfigurations Specifies the configuration and any analyses for the analytics
     * filter of an Amazon S3 bucket. 
     */
    override fun analyticsConfigurations(vararg analyticsConfigurations: Any): Unit =
        analyticsConfigurations(analyticsConfigurations.toList())

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    override fun bucketEncryption(bucketEncryption: IResolvable) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(IResolvable::unwrap))
    }

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(BucketEncryptionProperty::unwrap))
    }

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
     * @param bucketEncryption Specifies default encryption for a bucket using server-side
     * encryption with Amazon S3-managed keys (SSE-S3), AWS KMS-managed keys (SSE-KMS), or dual-layer
     * server-side encryption with KMS-managed keys (DSSE-KMS). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebcb7c17d411750b2f75f4e938ef6700a42e1c90624324aa83db87013d5ed712")
    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(BucketEncryptionProperty(bucketEncryption))

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
     * @param bucketName A name for the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    override fun corsConfiguration(corsConfiguration: CorsConfigurationProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsConfigurationProperty::unwrap))
    }

    /**
     * Describes the cross-origin access configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Enabling Cross-Origin Resource
     * Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-corsconfiguration)
     * @param corsConfiguration Describes the cross-origin access configuration for objects in an
     * Amazon S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5e9ba14372cccffc4e7871c656864cbbcc7cb9d0216cc850276da4e6a873e2c")
    override fun corsConfiguration(corsConfiguration: CorsConfigurationProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CorsConfigurationProperty(corsConfiguration))

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
    }

    /**
     * Defines how Amazon S3 handles Intelligent-Tiering storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-intelligenttieringconfigurations)
     * @param intelligentTieringConfigurations Defines how Amazon S3 handles Intelligent-Tiering
     * storage. 
     */
    override fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any):
        Unit = intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    override fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations.let(IResolvable::unwrap))
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    override fun inventoryConfigurations(inventoryConfigurations: List<Any>) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations)
    }

    /**
     * Specifies the inventory configuration for an Amazon S3 bucket.
     *
     * For more information, see [GET Bucket
     * inventory](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketGETInventoryConfig.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-inventoryconfigurations)
     * @param inventoryConfigurations Specifies the inventory configuration for an Amazon S3 bucket.
     * 
     */
    override fun inventoryConfigurations(vararg inventoryConfigurations: Any): Unit =
        inventoryConfigurations(inventoryConfigurations.toList())

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty::unwrap))
    }

    /**
     * Specifies the lifecycle configuration for objects in an Amazon S3 bucket.
     *
     * For more information, see [Object Lifecycle
     * Management](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-lifecycleconfiguration)
     * @param lifecycleConfiguration Specifies the lifecycle configuration for objects in an Amazon
     * S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dbbaa2b2597aab1aaf9ce400dcd366ad67e6916825cc9590bdbf90cfc7ede89")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    /**
     * Settings that define where logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-loggingconfiguration)
     * @param loggingConfiguration Settings that define where logs are stored. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d26fd90a1e29625730bec9f94c832ce940d1445ab8f90af03bce65f699e92002")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    override fun metricsConfigurations(metricsConfigurations: IResolvable) {
      cdkBuilder.metricsConfigurations(metricsConfigurations.let(IResolvable::unwrap))
    }

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    override fun metricsConfigurations(metricsConfigurations: List<Any>) {
      cdkBuilder.metricsConfigurations(metricsConfigurations)
    }

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
     * @param metricsConfigurations Specifies a metrics configuration for the CloudWatch request
     * metrics (specified by the metrics configuration ID) from an Amazon S3 bucket. 
     */
    override fun metricsConfigurations(vararg metricsConfigurations: Any): Unit =
        metricsConfigurations(metricsConfigurations.toList())

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles bucket notifications.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-notificationconfiguration)
     * @param notificationConfiguration Configuration that defines how Amazon S3 handles bucket
     * notifications. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1941b41ecd0c5b8d822f40c57f36e8ed016fb000fe7d63b0d2b7c1889eed1b5")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    override fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(IResolvable::unwrap))
    }

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    override fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(ObjectLockConfigurationProperty::unwrap))
    }

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
     * @param objectLockConfiguration This operation is not supported by directory buckets. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b10c12177b91999519c590896e250f7e7bb33cdecfc33d927a11aa64f4d7fcb8")
    override
        fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty.Builder.() -> Unit):
        Unit = objectLockConfiguration(ObjectLockConfigurationProperty(objectLockConfiguration))

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled. 
     */
    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-objectlockenabled)
     * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
     * enabled. 
     */
    override fun objectLockEnabled(objectLockEnabled: IResolvable) {
      cdkBuilder.objectLockEnabled(objectLockEnabled.let(IResolvable::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    override fun ownershipControls(ownershipControls: IResolvable) {
      cdkBuilder.ownershipControls(ownershipControls.let(IResolvable::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    override fun ownershipControls(ownershipControls: OwnershipControlsProperty) {
      cdkBuilder.ownershipControls(ownershipControls.let(OwnershipControlsProperty::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-ownershipcontrols)
     * @param ownershipControls Configuration that defines how Amazon S3 handles Object Ownership
     * rules. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cc9ca38ed9e286cb88cdaa5e6a6b8efac68c748ae62bba4f9a1fea0a5eb54cb")
    override fun ownershipControls(ownershipControls: OwnershipControlsProperty.Builder.() -> Unit):
        Unit = ownershipControls(OwnershipControlsProperty(ownershipControls))

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    /**
     * Configuration that defines how Amazon S3 handles public access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-publicaccessblockconfiguration)
     * @param publicAccessBlockConfiguration Configuration that defines how Amazon S3 handles public
     * access. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f71c1cdc7a7e8211928dd8456b0c06dbf20f87536904b772db197823e87bf02")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

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
     * @param replicationConfiguration Configuration for replicating objects in an S3 bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab88a85173a0862c0c9f1f4e3f278ce766ae64c7a53238676ea31fd7556cba11")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An arbitrary set of tags (key-value pairs) for this S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-tags)
     * @param tags An arbitrary set of tags (key-value pairs) for this S3 bucket. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    override fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(VersioningConfigurationProperty::unwrap))
    }

    /**
     * Enables multiple versions of all objects in this bucket.
     *
     * You might enable versioning to prevent objects from being deleted or overwritten by mistake
     * or to archive objects so that you can retrieve previous versions of them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-versioningconfiguration)
     * @param versioningConfiguration Enables multiple versions of all objects in this bucket. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d492ca26a7ac967006901d0b4a1909c75a10eb9c474f96f53d132a3ba20183")
    override
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit):
        Unit = versioningConfiguration(VersioningConfigurationProperty(versioningConfiguration))

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    override fun websiteConfiguration(websiteConfiguration: IResolvable) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    override fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(WebsiteConfigurationProperty::unwrap))
    }

    /**
     * Information used to configure the bucket as a static website.
     *
     * For more information, see [Hosting Websites on Amazon
     * S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-bucket.html#cfn-s3-bucket-websiteconfiguration)
     * @param websiteConfiguration Information used to configure the bucket as a static website. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("775a82b8977721915020e905125f48facfbc26bb5b9fb858cae884e552a2cc2a")
    override
        fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty.Builder.() -> Unit):
        Unit = websiteConfiguration(WebsiteConfigurationProperty(websiteConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.s3.CfnBucket.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket): CfnBucket =
        CfnBucket(cdkObject)

    internal fun unwrap(wrapped: CfnBucket): software.amazon.awscdk.services.s3.CfnBucket =
        wrapped.cdkObject
  }

  public interface NotificationFilterProperty {
    /**
     * A container for object key name prefix and suffix filtering rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationfilter.html#cfn-s3-bucket-notificationfilter-s3key)
     */
    public fun s3Key(): Any

    /**
     * A builder for [NotificationFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      public fun s3Key(s3Key: IResolvable)

      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      public fun s3Key(s3Key: S3KeyFilterProperty)

      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48a6cafe7910b07fe72bf6c7f1255486ddf8a354b44c38cb9ab8f0e484617160")
      public fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.builder()

      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      override fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key.let(IResolvable::unwrap))
      }

      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      override fun s3Key(s3Key: S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key.let(S3KeyFilterProperty::unwrap))
      }

      /**
       * @param s3Key A container for object key name prefix and suffix filtering rules. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48a6cafe7910b07fe72bf6c7f1255486ddf8a354b44c38cb9ab8f0e484617160")
      override fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit): Unit =
          s3Key(S3KeyFilterProperty(s3Key))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty,
    ) : CdkObject(cdkObject), NotificationFilterProperty {
      /**
       * A container for object key name prefix and suffix filtering rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationfilter.html#cfn-s3-bucket-notificationfilter-s3key)
       */
      override fun s3Key(): Any = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty):
          NotificationFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationFilterProperty):
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty
    }
  }

  public interface ReplicationRuleProperty {
    /**
     * Specifies whether Amazon S3 replicates delete markers.
     *
     * If you specify a `Filter` in your replication configuration, you must also include a
     * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
     * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
     * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
     * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
     * .
     *
     * For more information about delete marker replication, see [Basic Rule
     * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html) .
     *
     *
     * If you are using an earlier version of the replication configuration, Amazon S3 handles
     * replication of delete markers differently. For more information, see [Backward
     * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-deletemarkerreplication)
     */
    public fun deleteMarkerReplication(): Any? = unwrap(this).getDeleteMarkerReplication()

    /**
     * A container for information about the replication destination and its configurations
     * including enabling the S3 Replication Time Control (S3 RTC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-destination)
     */
    public fun destination(): Any

    /**
     * A filter that identifies the subset of objects to which the replication rule applies.
     *
     * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
     * use of the filter field indicates that this is a V2 replication configuration. This field isn't
     * supported in a V1 replication configuration.
     *
     *
     * V1 replication configuration only supports filtering by key prefix. To filter using a V1
     * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * A unique identifier for the rule.
     *
     * The maximum value is 255 characters. If you don't specify a value, AWS CloudFormation
     * generates a random ID. When using a V2 replication configuration this property is capitalized as
     * "ID".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * An object key name prefix that identifies the object or objects to which the rule applies.
     *
     * The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify an
     * empty string. To filter using a V1 replication configuration, add the `Prefix` directly as a
     * child element of the `Rule` element.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The priority indicates which rule has precedence whenever two or more replication rules
     * conflict.
     *
     * Amazon S3 will attempt to replicate objects according to all replication rules. However, if
     * there are two or more rules with the same destination bucket, then objects will be replicated
     * according to the rule with the highest priority. The higher the number, the higher the priority.
     *
     * For more information, see
     * [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html) in the *Amazon
     * S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * A container that describes additional filters for identifying the source objects that you
     * want to replicate.
     *
     * You can choose to enable or disable the replication of these objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
     */
    public fun sourceSelectionCriteria(): Any? = unwrap(this).getSourceSelectionCriteria()

    /**
     * Specifies whether the rule is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-status)
     */
    public fun status(): String

    /**
     * A builder for [ReplicationRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      public fun deleteMarkerReplication(deleteMarkerReplication: IResolvable)

      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      public fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty)

      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d15bab5321c0bef0cfe965ea5a0872cd8622fc295e5149a7488ceb7737cd7e20")
      public
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty.Builder.() -> Unit)

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      public fun destination(destination: ReplicationDestinationProperty)

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3adb6b349839374139267b1c0049291843ae0d2decc8b4b32b2d851d4c53b671")
      public fun destination(destination: ReplicationDestinationProperty.Builder.() -> Unit)

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      public fun filter(filter: ReplicationRuleFilterProperty)

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f377482cbc671d62a43d033a11505d197f68ac7ff05289024569199962f44ef")
      public fun filter(filter: ReplicationRuleFilterProperty.Builder.() -> Unit)

      /**
       * @param id A unique identifier for the rule.
       * The maximum value is 255 characters. If you don't specify a value, AWS CloudFormation
       * generates a random ID. When using a V2 replication configuration this property is capitalized
       * as "ID".
       */
      public fun id(id: String)

      /**
       * @param prefix An object key name prefix that identifies the object or objects to which the
       * rule applies.
       * The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify
       * an empty string. To filter using a V1 replication configuration, add the `Prefix` directly as
       * a child element of the `Rule` element.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun prefix(prefix: String)

      /**
       * @param priority The priority indicates which rule has precedence whenever two or more
       * replication rules conflict.
       * Amazon S3 will attempt to replicate objects according to all replication rules. However, if
       * there are two or more rules with the same destination bucket, then objects will be replicated
       * according to the rule with the highest priority. The higher the number, the higher the
       * priority.
       *
       * For more information, see
       * [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html) in the *Amazon
       * S3 User Guide* .
       */
      public fun priority(priority: Number)

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      public fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable)

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      public fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty)

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9706dd73a6a63e34a861632a397f4d06ad4e45f578bdc147163eab6309f9fb19")
      public
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty.Builder.() -> Unit)

      /**
       * @param status Specifies whether the rule is enabled. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.builder()

      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      override fun deleteMarkerReplication(deleteMarkerReplication: IResolvable) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication.let(IResolvable::unwrap))
      }

      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      override
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication.let(DeleteMarkerReplicationProperty::unwrap))
      }

      /**
       * @param deleteMarkerReplication Specifies whether Amazon S3 replicates delete markers.
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d15bab5321c0bef0cfe965ea5a0872cd8622fc295e5149a7488ceb7737cd7e20")
      override
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty.Builder.() -> Unit):
          Unit = deleteMarkerReplication(DeleteMarkerReplicationProperty(deleteMarkerReplication))

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      override fun destination(destination: ReplicationDestinationProperty) {
        cdkBuilder.destination(destination.let(ReplicationDestinationProperty::unwrap))
      }

      /**
       * @param destination A container for information about the replication destination and its
       * configurations including enabling the S3 Replication Time Control (S3 RTC). 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3adb6b349839374139267b1c0049291843ae0d2decc8b4b32b2d851d4c53b671")
      override fun destination(destination: ReplicationDestinationProperty.Builder.() -> Unit): Unit
          = destination(ReplicationDestinationProperty(destination))

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      override fun filter(filter: ReplicationRuleFilterProperty) {
        cdkBuilder.filter(filter.let(ReplicationRuleFilterProperty::unwrap))
      }

      /**
       * @param filter A filter that identifies the subset of objects to which the replication rule
       * applies.
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f377482cbc671d62a43d033a11505d197f68ac7ff05289024569199962f44ef")
      override fun filter(filter: ReplicationRuleFilterProperty.Builder.() -> Unit): Unit =
          filter(ReplicationRuleFilterProperty(filter))

      /**
       * @param id A unique identifier for the rule.
       * The maximum value is 255 characters. If you don't specify a value, AWS CloudFormation
       * generates a random ID. When using a V2 replication configuration this property is capitalized
       * as "ID".
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param prefix An object key name prefix that identifies the object or objects to which the
       * rule applies.
       * The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify
       * an empty string. To filter using a V1 replication configuration, add the `Prefix` directly as
       * a child element of the `Rule` element.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param priority The priority indicates which rule has precedence whenever two or more
       * replication rules conflict.
       * Amazon S3 will attempt to replicate objects according to all replication rules. However, if
       * there are two or more rules with the same destination bucket, then objects will be replicated
       * according to the rule with the highest priority. The higher the number, the higher the
       * priority.
       *
       * For more information, see
       * [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html) in the *Amazon
       * S3 User Guide* .
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      override fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria.let(IResolvable::unwrap))
      }

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      override
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria.let(SourceSelectionCriteriaProperty::unwrap))
      }

      /**
       * @param sourceSelectionCriteria A container that describes additional filters for
       * identifying the source objects that you want to replicate.
       * You can choose to enable or disable the replication of these objects.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9706dd73a6a63e34a861632a397f4d06ad4e45f578bdc147163eab6309f9fb19")
      override
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty.Builder.() -> Unit):
          Unit = sourceSelectionCriteria(SourceSelectionCriteriaProperty(sourceSelectionCriteria))

      /**
       * @param status Specifies whether the rule is enabled. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty,
    ) : CdkObject(cdkObject), ReplicationRuleProperty {
      /**
       * Specifies whether Amazon S3 replicates delete markers.
       *
       * If you specify a `Filter` in your replication configuration, you must also include a
       * `DeleteMarkerReplication` element. If your `Filter` includes a `Tag` element, the
       * `DeleteMarkerReplication` `Status` must be set to Disabled, because Amazon S3 does not support
       * replicating delete markers for tag-based rules. For an example configuration, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-config-min-rule-config)
       * .
       *
       * For more information about delete marker replication, see [Basic Rule
       * Configuration](https://docs.aws.amazon.com/AmazonS3/latest/dev/delete-marker-replication.html)
       * .
       *
       *
       * If you are using an earlier version of the replication configuration, Amazon S3 handles
       * replication of delete markers differently. For more information, see [Backward
       * Compatibility](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-add-config.html#replication-backward-compat-considerations)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-deletemarkerreplication)
       */
      override fun deleteMarkerReplication(): Any? = unwrap(this).getDeleteMarkerReplication()

      /**
       * A container for information about the replication destination and its configurations
       * including enabling the S3 Replication Time Control (S3 RTC).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * A filter that identifies the subset of objects to which the replication rule applies.
       *
       * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element. The
       * use of the filter field indicates that this is a V2 replication configuration. This field
       * isn't supported in a V1 replication configuration.
       *
       *
       * V1 replication configuration only supports filtering by key prefix. To filter using a V1
       * replication configuration, add the `Prefix` directly as a child element of the `Rule` element.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * A unique identifier for the rule.
       *
       * The maximum value is 255 characters. If you don't specify a value, AWS CloudFormation
       * generates a random ID. When using a V2 replication configuration this property is capitalized
       * as "ID".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * An object key name prefix that identifies the object or objects to which the rule applies.
       *
       * The maximum prefix length is 1,024 characters. To include all objects in a bucket, specify
       * an empty string. To filter using a V1 replication configuration, add the `Prefix` directly as
       * a child element of the `Rule` element.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The priority indicates which rule has precedence whenever two or more replication rules
       * conflict.
       *
       * Amazon S3 will attempt to replicate objects according to all replication rules. However, if
       * there are two or more rules with the same destination bucket, then objects will be replicated
       * according to the rule with the highest priority. The higher the number, the higher the
       * priority.
       *
       * For more information, see
       * [Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication.html) in the *Amazon
       * S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * A container that describes additional filters for identifying the source objects that you
       * want to replicate.
       *
       * You can choose to enable or disable the replication of these objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-sourceselectioncriteria)
       */
      override fun sourceSelectionCriteria(): Any? = unwrap(this).getSourceSelectionCriteria()

      /**
       * Specifies whether the rule is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrule.html#cfn-s3-bucket-replicationrule-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty):
          ReplicationRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty
    }
  }

  public interface AccessControlTranslationProperty {
    /**
     * Specifies the replica ownership.
     *
     * For default and valid values, see [PUT bucket
     * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in
     * the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
     */
    public fun owner(): String

    /**
     * A builder for [AccessControlTranslationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param owner Specifies the replica ownership. 
       * For default and valid values, see [PUT bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in
       * the *Amazon S3 API Reference* .
       */
      public fun owner(owner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.builder()

      /**
       * @param owner Specifies the replica ownership. 
       * For default and valid values, see [PUT bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in
       * the *Amazon S3 API Reference* .
       */
      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty,
    ) : CdkObject(cdkObject), AccessControlTranslationProperty {
      /**
       * Specifies the replica ownership.
       *
       * For default and valid values, see [PUT bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in
       * the *Amazon S3 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner)
       */
      override fun owner(): String = unwrap(this).getOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessControlTranslationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty):
          AccessControlTranslationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlTranslationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty
    }
  }

  public interface LifecycleConfigurationProperty {
    /**
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfiguration.html#cfn-s3-bucket-lifecycleconfiguration-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [LifecycleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.builder()

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules A lifecycle rule for individual objects in an Amazon S3 bucket. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleConfigurationProperty {
      /**
       * A lifecycle rule for individual objects in an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfiguration.html#cfn-s3-bucket-lifecycleconfiguration-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty):
          LifecycleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty
    }
  }

  public interface ReplicationRuleAndOperatorProperty {
    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html#cfn-s3-bucket-replicationruleandoperator-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * An array of tags containing key and value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html#cfn-s3-bucket-replicationruleandoperator-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * A builder for [ReplicationRuleAndOperatorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       */
      public fun prefix(prefix: String)

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty.builder()

      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters An array of tags containing key and value pairs.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty,
    ) : CdkObject(cdkObject), ReplicationRuleAndOperatorProperty {
      /**
       * An object key name prefix that identifies the subset of objects to which the rule applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html#cfn-s3-bucket-replicationruleandoperator-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * An array of tags containing key and value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html#cfn-s3-bucket-replicationruleandoperator-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplicationRuleAndOperatorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty):
          ReplicationRuleAndOperatorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRuleAndOperatorProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty
    }
  }

  public interface MetricsProperty {
    /**
     * A container specifying the time threshold for emitting the
     * `s3:Replication:OperationMissedThreshold` event.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html#cfn-s3-bucket-metrics-eventthreshold)
     */
    public fun eventThreshold(): Any? = unwrap(this).getEventThreshold()

    /**
     * Specifies whether the replication metrics are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html#cfn-s3-bucket-metrics-status)
     */
    public fun status(): String

    /**
     * A builder for [MetricsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      public fun eventThreshold(eventThreshold: IResolvable)

      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      public fun eventThreshold(eventThreshold: ReplicationTimeValueProperty)

      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd2ea3b96f208a250712f59c1cf61c385be277cce73470e2508e0ac47ce1b1b6")
      public fun eventThreshold(eventThreshold: ReplicationTimeValueProperty.Builder.() -> Unit)

      /**
       * @param status Specifies whether the replication metrics are enabled. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty.builder()

      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      override fun eventThreshold(eventThreshold: IResolvable) {
        cdkBuilder.eventThreshold(eventThreshold.let(IResolvable::unwrap))
      }

      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      override fun eventThreshold(eventThreshold: ReplicationTimeValueProperty) {
        cdkBuilder.eventThreshold(eventThreshold.let(ReplicationTimeValueProperty::unwrap))
      }

      /**
       * @param eventThreshold A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd2ea3b96f208a250712f59c1cf61c385be277cce73470e2508e0ac47ce1b1b6")
      override fun eventThreshold(eventThreshold: ReplicationTimeValueProperty.Builder.() -> Unit):
          Unit = eventThreshold(ReplicationTimeValueProperty(eventThreshold))

      /**
       * @param status Specifies whether the replication metrics are enabled. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty,
    ) : CdkObject(cdkObject), MetricsProperty {
      /**
       * A container specifying the time threshold for emitting the
       * `s3:Replication:OperationMissedThreshold` event.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html#cfn-s3-bucket-metrics-eventthreshold)
       */
      override fun eventThreshold(): Any? = unwrap(this).getEventThreshold()

      /**
       * Specifies whether the replication metrics are enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html#cfn-s3-bucket-metrics-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty):
          MetricsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsProperty):
          software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty
    }
  }

  public interface TransitionProperty {
    /**
     * The storage class to which you want the object to transition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-storageclass)
     */
    public fun storageClass(): String

    /**
     * Indicates when objects are transitioned to the specified storage class.
     *
     * The date value must be in ISO 8601 format. The time is always midnight UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-transitiondate)
     */
    public fun transitionDate(): Any? = unwrap(this).getTransitionDate()

    /**
     * Indicates the number of days after creation when objects are transitioned to the specified
     * storage class.
     *
     * The value must be a positive integer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-transitionindays)
     */
    public fun transitionInDays(): Number? = unwrap(this).getTransitionInDays()

    /**
     * A builder for [TransitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param storageClass The storage class to which you want the object to transition. 
       */
      public fun storageClass(storageClass: String)

      /**
       * @param transitionDate Indicates when objects are transitioned to the specified storage
       * class.
       * The date value must be in ISO 8601 format. The time is always midnight UTC.
       */
      public fun transitionDate(transitionDate: IResolvable)

      /**
       * @param transitionDate Indicates when objects are transitioned to the specified storage
       * class.
       * The date value must be in ISO 8601 format. The time is always midnight UTC.
       */
      public fun transitionDate(transitionDate: Instant)

      /**
       * @param transitionInDays Indicates the number of days after creation when objects are
       * transitioned to the specified storage class.
       * The value must be a positive integer.
       */
      public fun transitionInDays(transitionInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.builder()

      /**
       * @param storageClass The storage class to which you want the object to transition. 
       */
      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

      /**
       * @param transitionDate Indicates when objects are transitioned to the specified storage
       * class.
       * The date value must be in ISO 8601 format. The time is always midnight UTC.
       */
      override fun transitionDate(transitionDate: IResolvable) {
        cdkBuilder.transitionDate(transitionDate.let(IResolvable::unwrap))
      }

      /**
       * @param transitionDate Indicates when objects are transitioned to the specified storage
       * class.
       * The date value must be in ISO 8601 format. The time is always midnight UTC.
       */
      override fun transitionDate(transitionDate: Instant) {
        cdkBuilder.transitionDate(transitionDate)
      }

      /**
       * @param transitionInDays Indicates the number of days after creation when objects are
       * transitioned to the specified storage class.
       * The value must be a positive integer.
       */
      override fun transitionInDays(transitionInDays: Number) {
        cdkBuilder.transitionInDays(transitionInDays)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty,
    ) : CdkObject(cdkObject), TransitionProperty {
      /**
       * The storage class to which you want the object to transition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-storageclass)
       */
      override fun storageClass(): String = unwrap(this).getStorageClass()

      /**
       * Indicates when objects are transitioned to the specified storage class.
       *
       * The date value must be in ISO 8601 format. The time is always midnight UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-transitiondate)
       */
      override fun transitionDate(): Any? = unwrap(this).getTransitionDate()

      /**
       * Indicates the number of days after creation when objects are transitioned to the specified
       * storage class.
       *
       * The value must be a positive integer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html#cfn-s3-bucket-transition-transitionindays)
       */
      override fun transitionInDays(): Number? = unwrap(this).getTransitionInDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TransitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty):
          TransitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitionProperty):
          software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty
    }
  }

  public interface AccelerateConfigurationProperty {
    /**
     * Specifies the transfer acceleration status of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
     */
    public fun accelerationStatus(): String

    /**
     * A builder for [AccelerateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accelerationStatus Specifies the transfer acceleration status of the bucket. 
       */
      public fun accelerationStatus(accelerationStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.builder()

      /**
       * @param accelerationStatus Specifies the transfer acceleration status of the bucket. 
       */
      override fun accelerationStatus(accelerationStatus: String) {
        cdkBuilder.accelerationStatus(accelerationStatus)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty,
    ) : CdkObject(cdkObject), AccelerateConfigurationProperty {
      /**
       * Specifies the transfer acceleration status of the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accelerateconfiguration.html#cfn-s3-bucket-accelerateconfiguration-accelerationstatus)
       */
      override fun accelerationStatus(): String = unwrap(this).getAccelerationStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccelerateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty):
          AccelerateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccelerateConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty
    }
  }

  public interface SourceSelectionCriteriaProperty {
    /**
     * A filter that you can specify for selection for modifications on replicas.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-replicamodifications)
     */
    public fun replicaModifications(): Any? = unwrap(this).getReplicaModifications()

    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with AWS
     * KMS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
     */
    public fun sseKmsEncryptedObjects(): Any? = unwrap(this).getSseKmsEncryptedObjects()

    /**
     * A builder for [SourceSelectionCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      public fun replicaModifications(replicaModifications: IResolvable)

      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      public fun replicaModifications(replicaModifications: ReplicaModificationsProperty)

      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde846bad4ae445ce8130cf4d4c828d42edf0194358d05fa4865412dc67103ce")
      public
          fun replicaModifications(replicaModifications: ReplicaModificationsProperty.Builder.() -> Unit)

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable)

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty)

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("accd20bbaabf248446f3975a75e607e78fcd5060e57b8a883c8977638ec0ac3e")
      public
          fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.builder()

      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      override fun replicaModifications(replicaModifications: IResolvable) {
        cdkBuilder.replicaModifications(replicaModifications.let(IResolvable::unwrap))
      }

      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      override fun replicaModifications(replicaModifications: ReplicaModificationsProperty) {
        cdkBuilder.replicaModifications(replicaModifications.let(ReplicaModificationsProperty::unwrap))
      }

      /**
       * @param replicaModifications A filter that you can specify for selection for modifications
       * on replicas.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde846bad4ae445ce8130cf4d4c828d42edf0194358d05fa4865412dc67103ce")
      override
          fun replicaModifications(replicaModifications: ReplicaModificationsProperty.Builder.() -> Unit):
          Unit = replicaModifications(ReplicaModificationsProperty(replicaModifications))

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      override fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects.let(IResolvable::unwrap))
      }

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      override fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects.let(SseKmsEncryptedObjectsProperty::unwrap))
      }

      /**
       * @param sseKmsEncryptedObjects A container for filter information for the selection of
       * Amazon S3 objects encrypted with AWS KMS.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("accd20bbaabf248446f3975a75e607e78fcd5060e57b8a883c8977638ec0ac3e")
      override
          fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty.Builder.() -> Unit):
          Unit = sseKmsEncryptedObjects(SseKmsEncryptedObjectsProperty(sseKmsEncryptedObjects))

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty,
    ) : CdkObject(cdkObject), SourceSelectionCriteriaProperty {
      /**
       * A filter that you can specify for selection for modifications on replicas.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-replicamodifications)
       */
      override fun replicaModifications(): Any? = unwrap(this).getReplicaModifications()

      /**
       * A container for filter information for the selection of Amazon S3 objects encrypted with
       * AWS KMS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html#cfn-s3-bucket-sourceselectioncriteria-ssekmsencryptedobjects)
       */
      override fun sseKmsEncryptedObjects(): Any? = unwrap(this).getSseKmsEncryptedObjects()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceSelectionCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty):
          SourceSelectionCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceSelectionCriteriaProperty):
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty
    }
  }

  public interface InventoryConfigurationProperty {
    /**
     * Contains information about where to publish the inventory results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
     */
    public fun destination(): Any

    /**
     * Specifies whether the inventory is enabled or disabled.
     *
     * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
     * generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
     */
    public fun enabled(): Any

    /**
     * The ID used to identify the inventory configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
     */
    public fun id(): String

    /**
     * Object versions to include in the inventory list.
     *
     * If set to `All` , the list includes all the object versions, which adds the version-related
     * fields `VersionId` , `IsLatest` , and `DeleteMarker` to the list. If set to `Current` , the list
     * does not contain these version-related fields.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
     */
    public fun includedObjectVersions(): String

    /**
     * Contains the optional fields that are included in the inventory results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
     */
    public fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

    /**
     * Specifies the inventory filter prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Specifies the schedule for generating inventory results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
     */
    public fun scheduleFrequency(): String

    /**
     * A builder for [InventoryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      public fun destination(destination: DestinationProperty)

      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("486f3cdaa85acca0232cb1aed8c563cc6128e0faffd70e96fd67d16e8e9c4f62")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      /**
       * @param enabled Specifies whether the inventory is enabled or disabled. 
       * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
       * generated.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether the inventory is enabled or disabled. 
       * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
       * generated.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param id The ID used to identify the inventory configuration. 
       */
      public fun id(id: String)

      /**
       * @param includedObjectVersions Object versions to include in the inventory list. 
       * If set to `All` , the list includes all the object versions, which adds the version-related
       * fields `VersionId` , `IsLatest` , and `DeleteMarker` to the list. If set to `Current` , the
       * list does not contain these version-related fields.
       */
      public fun includedObjectVersions(includedObjectVersions: String)

      /**
       * @param optionalFields Contains the optional fields that are included in the inventory
       * results.
       */
      public fun optionalFields(optionalFields: List<String>)

      /**
       * @param optionalFields Contains the optional fields that are included in the inventory
       * results.
       */
      public fun optionalFields(vararg optionalFields: String)

      /**
       * @param prefix Specifies the inventory filter prefix.
       */
      public fun prefix(prefix: String)

      /**
       * @param scheduleFrequency Specifies the schedule for generating inventory results. 
       */
      public fun scheduleFrequency(scheduleFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.builder()

      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty::unwrap))
      }

      /**
       * @param destination Contains information about where to publish the inventory results. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("486f3cdaa85acca0232cb1aed8c563cc6128e0faffd70e96fd67d16e8e9c4f62")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      /**
       * @param enabled Specifies whether the inventory is enabled or disabled. 
       * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
       * generated.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether the inventory is enabled or disabled. 
       * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
       * generated.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param id The ID used to identify the inventory configuration. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param includedObjectVersions Object versions to include in the inventory list. 
       * If set to `All` , the list includes all the object versions, which adds the version-related
       * fields `VersionId` , `IsLatest` , and `DeleteMarker` to the list. If set to `Current` , the
       * list does not contain these version-related fields.
       */
      override fun includedObjectVersions(includedObjectVersions: String) {
        cdkBuilder.includedObjectVersions(includedObjectVersions)
      }

      /**
       * @param optionalFields Contains the optional fields that are included in the inventory
       * results.
       */
      override fun optionalFields(optionalFields: List<String>) {
        cdkBuilder.optionalFields(optionalFields)
      }

      /**
       * @param optionalFields Contains the optional fields that are included in the inventory
       * results.
       */
      override fun optionalFields(vararg optionalFields: String): Unit =
          optionalFields(optionalFields.toList())

      /**
       * @param prefix Specifies the inventory filter prefix.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param scheduleFrequency Specifies the schedule for generating inventory results. 
       */
      override fun scheduleFrequency(scheduleFrequency: String) {
        cdkBuilder.scheduleFrequency(scheduleFrequency)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty,
    ) : CdkObject(cdkObject), InventoryConfigurationProperty {
      /**
       * Contains information about where to publish the inventory results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * Specifies whether the inventory is enabled or disabled.
       *
       * If set to `True` , an inventory list is generated. If set to `False` , no inventory list is
       * generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The ID used to identify the inventory configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Object versions to include in the inventory list.
       *
       * If set to `All` , the list includes all the object versions, which adds the version-related
       * fields `VersionId` , `IsLatest` , and `DeleteMarker` to the list. If set to `Current` , the
       * list does not contain these version-related fields.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-includedobjectversions)
       */
      override fun includedObjectVersions(): String = unwrap(this).getIncludedObjectVersions()

      /**
       * Contains the optional fields that are included in the inventory results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-optionalfields)
       */
      override fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

      /**
       * Specifies the inventory filter prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * Specifies the schedule for generating inventory results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-inventoryconfiguration.html#cfn-s3-bucket-inventoryconfiguration-schedulefrequency)
       */
      override fun scheduleFrequency(): String = unwrap(this).getScheduleFrequency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InventoryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty):
          InventoryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InventoryConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty
    }
  }

  public interface CorsRuleProperty {
    /**
     * Headers that are specified in the `Access-Control-Request-Headers` header.
     *
     * These headers are allowed in a preflight OPTIONS request. In response to any preflight
     * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedheaders)
     */
    public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    /**
     * An HTTP method that you allow the origin to run.
     *
     * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedmethods)
     */
    public fun allowedMethods(): List<String>

    /**
     * One or more origins you want customers to be able to access the bucket from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedorigins)
     */
    public fun allowedOrigins(): List<String>

    /**
     * One or more headers in the response that you want customers to be able to access from their
     * applications (for example, from a JavaScript `XMLHttpRequest` object).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-exposedheaders)
     */
    public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

    /**
     * A unique identifier for this rule.
     *
     * The value must be no more than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * The time in seconds that your browser is to cache the preflight response for the specified
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-maxage)
     */
    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
       * header.
       * These headers are allowed in a preflight OPTIONS request. In response to any preflight
       * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
       */
      public fun allowedHeaders(allowedHeaders: List<String>)

      /**
       * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
       * header.
       * These headers are allowed in a preflight OPTIONS request. In response to any preflight
       * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
       */
      public fun allowedHeaders(vararg allowedHeaders: String)

      /**
       * @param allowedMethods An HTTP method that you allow the origin to run. 
       * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
       */
      public fun allowedMethods(allowedMethods: List<String>)

      /**
       * @param allowedMethods An HTTP method that you allow the origin to run. 
       * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
       */
      public fun allowedMethods(vararg allowedMethods: String)

      /**
       * @param allowedOrigins One or more origins you want customers to be able to access the
       * bucket from. 
       */
      public fun allowedOrigins(allowedOrigins: List<String>)

      /**
       * @param allowedOrigins One or more origins you want customers to be able to access the
       * bucket from. 
       */
      public fun allowedOrigins(vararg allowedOrigins: String)

      /**
       * @param exposedHeaders One or more headers in the response that you want customers to be
       * able to access from their applications (for example, from a JavaScript `XMLHttpRequest`
       * object).
       */
      public fun exposedHeaders(exposedHeaders: List<String>)

      /**
       * @param exposedHeaders One or more headers in the response that you want customers to be
       * able to access from their applications (for example, from a JavaScript `XMLHttpRequest`
       * object).
       */
      public fun exposedHeaders(vararg exposedHeaders: String)

      /**
       * @param id A unique identifier for this rule.
       * The value must be no more than 255 characters.
       */
      public fun id(id: String)

      /**
       * @param maxAge The time in seconds that your browser is to cache the preflight response for
       * the specified resource.
       */
      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder
          = software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.builder()

      /**
       * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
       * header.
       * These headers are allowed in a preflight OPTIONS request. In response to any preflight
       * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
       */
      override fun allowedHeaders(allowedHeaders: List<String>) {
        cdkBuilder.allowedHeaders(allowedHeaders)
      }

      /**
       * @param allowedHeaders Headers that are specified in the `Access-Control-Request-Headers`
       * header.
       * These headers are allowed in a preflight OPTIONS request. In response to any preflight
       * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
       */
      override fun allowedHeaders(vararg allowedHeaders: String): Unit =
          allowedHeaders(allowedHeaders.toList())

      /**
       * @param allowedMethods An HTTP method that you allow the origin to run. 
       * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
       */
      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      /**
       * @param allowedMethods An HTTP method that you allow the origin to run. 
       * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
       */
      override fun allowedMethods(vararg allowedMethods: String): Unit =
          allowedMethods(allowedMethods.toList())

      /**
       * @param allowedOrigins One or more origins you want customers to be able to access the
       * bucket from. 
       */
      override fun allowedOrigins(allowedOrigins: List<String>) {
        cdkBuilder.allowedOrigins(allowedOrigins)
      }

      /**
       * @param allowedOrigins One or more origins you want customers to be able to access the
       * bucket from. 
       */
      override fun allowedOrigins(vararg allowedOrigins: String): Unit =
          allowedOrigins(allowedOrigins.toList())

      /**
       * @param exposedHeaders One or more headers in the response that you want customers to be
       * able to access from their applications (for example, from a JavaScript `XMLHttpRequest`
       * object).
       */
      override fun exposedHeaders(exposedHeaders: List<String>) {
        cdkBuilder.exposedHeaders(exposedHeaders)
      }

      /**
       * @param exposedHeaders One or more headers in the response that you want customers to be
       * able to access from their applications (for example, from a JavaScript `XMLHttpRequest`
       * object).
       */
      override fun exposedHeaders(vararg exposedHeaders: String): Unit =
          exposedHeaders(exposedHeaders.toList())

      /**
       * @param id A unique identifier for this rule.
       * The value must be no more than 255 characters.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param maxAge The time in seconds that your browser is to cache the preflight response for
       * the specified resource.
       */
      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty,
    ) : CdkObject(cdkObject), CorsRuleProperty {
      /**
       * Headers that are specified in the `Access-Control-Request-Headers` header.
       *
       * These headers are allowed in a preflight OPTIONS request. In response to any preflight
       * OPTIONS request, Amazon S3 returns any requested headers that are allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedheaders)
       */
      override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

      /**
       * An HTTP method that you allow the origin to run.
       *
       * *Allowed values* : `GET` | `PUT` | `HEAD` | `POST` | `DELETE`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedmethods)
       */
      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods()

      /**
       * One or more origins you want customers to be able to access the bucket from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-allowedorigins)
       */
      override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

      /**
       * One or more headers in the response that you want customers to be able to access from their
       * applications (for example, from a JavaScript `XMLHttpRequest` object).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-exposedheaders)
       */
      override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

      /**
       * A unique identifier for this rule.
       *
       * The value must be no more than 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * The time in seconds that your browser is to cache the preflight response for the specified
       * resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsrule.html#cfn-s3-bucket-corsrule-maxage)
       */
      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty):
          CorsRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty
    }
  }

  public interface EventBridgeConfigurationProperty {
    /**
     * Enables delivery of events to Amazon EventBridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-eventbridgeconfiguration.html#cfn-s3-bucket-eventbridgeconfiguration-eventbridgeenabled)
     */
    public fun eventBridgeEnabled(): Any

    /**
     * A builder for [EventBridgeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. 
       */
      public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

      /**
       * @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. 
       */
      public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty.builder()

      /**
       * @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. 
       */
      override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
      }

      /**
       * @param eventBridgeEnabled Enables delivery of events to Amazon EventBridge. 
       */
      override fun eventBridgeEnabled(eventBridgeEnabled: IResolvable) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty,
    ) : CdkObject(cdkObject), EventBridgeConfigurationProperty {
      /**
       * Enables delivery of events to Amazon EventBridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-eventbridgeconfiguration.html#cfn-s3-bucket-eventbridgeconfiguration-eventbridgeenabled)
       */
      override fun eventBridgeEnabled(): Any = unwrap(this).getEventBridgeEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty):
          EventBridgeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty
    }
  }

  public interface VersioningConfigurationProperty {
    /**
     * The versioning state of the bucket.
     *
     * Default: - "Suspended"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfiguration.html#cfn-s3-bucket-versioningconfiguration-status)
     */
    public fun status(): String

    /**
     * A builder for [VersioningConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The versioning state of the bucket. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.builder()

      /**
       * @param status The versioning state of the bucket. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty,
    ) : CdkObject(cdkObject), VersioningConfigurationProperty {
      /**
       * The versioning state of the bucket.
       *
       * Default: - "Suspended"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-versioningconfiguration.html#cfn-s3-bucket-versioningconfiguration-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VersioningConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty):
          VersioningConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VersioningConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty
    }
  }

  public interface IntelligentTieringConfigurationProperty {
    /**
     * The ID used to identify the S3 Intelligent-Tiering configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-id)
     */
    public fun id(): String

    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Specifies the status of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-status)
     */
    public fun status(): String

    /**
     * A container for a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration.
     *
     * At least one tier must be defined in the list. At most, you can specify two tiers in the
     * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
     *
     *
     * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
     * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access or
     * Deep Archive Access tiers.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-tierings)
     */
    public fun tierings(): Any

    /**
     * A builder for [IntelligentTieringConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID used to identify the S3 Intelligent-Tiering configuration. 
       */
      public fun id(id: String)

      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       */
      public fun prefix(prefix: String)

      /**
       * @param status Specifies the status of the configuration. 
       */
      public fun status(status: String)

      /**
       * @param tagFilters A container for a key-value pair.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters A container for a key-value pair.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters A container for a key-value pair.
       */
      public fun tagFilters(vararg tagFilters: Any)

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      public fun tierings(tierings: IResolvable)

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      public fun tierings(tierings: List<Any>)

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      public fun tierings(vararg tierings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.builder()

      /**
       * @param id The ID used to identify the S3 Intelligent-Tiering configuration. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param status Specifies the status of the configuration. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param tagFilters A container for a key-value pair.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters A container for a key-value pair.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters A container for a key-value pair.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      override fun tierings(tierings: IResolvable) {
        cdkBuilder.tierings(tierings.let(IResolvable::unwrap))
      }

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      override fun tierings(tierings: List<Any>) {
        cdkBuilder.tierings(tierings)
      }

      /**
       * @param tierings Specifies a list of S3 Intelligent-Tiering storage class tiers in the
       * configuration. 
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       */
      override fun tierings(vararg tierings: Any): Unit = tierings(tierings.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty,
    ) : CdkObject(cdkObject), IntelligentTieringConfigurationProperty {
      /**
       * The ID used to identify the S3 Intelligent-Tiering configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * An object key name prefix that identifies the subset of objects to which the rule applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * Specifies the status of the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * A container for a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()

      /**
       * Specifies a list of S3 Intelligent-Tiering storage class tiers in the configuration.
       *
       * At least one tier must be defined in the list. At most, you can specify two tiers in the
       * list, one for each available AccessTier: `ARCHIVE_ACCESS` and `DEEP_ARCHIVE_ACCESS` .
       *
       *
       * You only need Intelligent Tiering Configuration enabled on a bucket if you want to
       * automatically move objects stored in the Intelligent-Tiering storage class to Archive Access
       * or Deep Archive Access tiers.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-intelligenttieringconfiguration.html#cfn-s3-bucket-intelligenttieringconfiguration-tierings)
       */
      override fun tierings(): Any = unwrap(this).getTierings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntelligentTieringConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty):
          IntelligentTieringConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntelligentTieringConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty
    }
  }

  public interface DestinationProperty {
    /**
     * The account ID that owns the destination S3 bucket.
     *
     * If no account ID is provided, the owner is not validated before exporting data.
     *
     *
     * Although this value is optional, we strongly recommend that you set it to help prevent
     * problems if the destination bucket ownership changes.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
     */
    public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    /**
     * The Amazon Resource Name (ARN) of the bucket to which data is exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * Specifies the file format used when exporting data to Amazon S3.
     *
     * *Allowed values* : `CSV` | `ORC` | `Parquet`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
     */
    public fun format(): String

    /**
     * The prefix to use when exporting data.
     *
     * The prefix is prepended to all results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketAccountId The account ID that owns the destination S3 bucket.
       * If no account ID is provided, the owner is not validated before exporting data.
       *
       *
       * Although this value is optional, we strongly recommend that you set it to help prevent
       * problems if the destination bucket ownership changes.
       */
      public fun bucketAccountId(bucketAccountId: String)

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the bucket to which data is exported. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param format Specifies the file format used when exporting data to Amazon S3. 
       * *Allowed values* : `CSV` | `ORC` | `Parquet`
       */
      public fun format(format: String)

      /**
       * @param prefix The prefix to use when exporting data.
       * The prefix is prepended to all results.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.builder()

      /**
       * @param bucketAccountId The account ID that owns the destination S3 bucket.
       * If no account ID is provided, the owner is not validated before exporting data.
       *
       *
       * Although this value is optional, we strongly recommend that you set it to help prevent
       * problems if the destination bucket ownership changes.
       */
      override fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
      }

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the bucket to which data is exported. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param format Specifies the file format used when exporting data to Amazon S3. 
       * *Allowed values* : `CSV` | `ORC` | `Parquet`
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param prefix The prefix to use when exporting data.
       * The prefix is prepended to all results.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      /**
       * The account ID that owns the destination S3 bucket.
       *
       * If no account ID is provided, the owner is not validated before exporting data.
       *
       *
       * Although this value is optional, we strongly recommend that you set it to help prevent
       * problems if the destination bucket ownership changes.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketaccountid)
       */
      override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

      /**
       * The Amazon Resource Name (ARN) of the bucket to which data is exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * Specifies the file format used when exporting data to Amazon S3.
       *
       * *Allowed values* : `CSV` | `ORC` | `Parquet`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-format)
       */
      override fun format(): String = unwrap(this).getFormat()

      /**
       * The prefix to use when exporting data.
       *
       * The prefix is prepended to all results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html#cfn-s3-bucket-destination-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty
    }
  }

  public interface OwnershipControlsProperty {
    /**
     * Specifies the container element for Object Ownership rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html#cfn-s3-bucket-ownershipcontrols-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [OwnershipControlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty.builder()

      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules Specifies the container element for Object Ownership rules. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty,
    ) : CdkObject(cdkObject), OwnershipControlsProperty {
      /**
       * Specifies the container element for Object Ownership rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrols.html#cfn-s3-bucket-ownershipcontrols-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnershipControlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty):
          OwnershipControlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnershipControlsProperty):
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty
    }
  }

  public interface NotificationConfigurationProperty {
    /**
     * Enables delivery of events to Amazon EventBridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-eventbridgeconfiguration)
     */
    public fun eventBridgeConfiguration(): Any? = unwrap(this).getEventBridgeConfiguration()

    /**
     * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-lambdaconfigurations)
     */
    public fun lambdaConfigurations(): Any? = unwrap(this).getLambdaConfigurations()

    /**
     * The Amazon Simple Queue Service queues to publish messages to and the events for which to
     * publish messages.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-queueconfigurations)
     */
    public fun queueConfigurations(): Any? = unwrap(this).getQueueConfigurations()

    /**
     * The topic to which notifications are sent and the events for which notifications are
     * generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-topicconfigurations)
     */
    public fun topicConfigurations(): Any? = unwrap(this).getTopicConfigurations()

    /**
     * A builder for [NotificationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      public fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable)

      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      public
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty)

      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b87f2c732256e93c0de8c1e342109ba7764e2cab8995f4d1034b9bcb767ca8fe")
      public
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty.Builder.() -> Unit)

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      public fun lambdaConfigurations(lambdaConfigurations: IResolvable)

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      public fun lambdaConfigurations(lambdaConfigurations: List<Any>)

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      public fun lambdaConfigurations(vararg lambdaConfigurations: Any)

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      public fun queueConfigurations(queueConfigurations: IResolvable)

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      public fun queueConfigurations(queueConfigurations: List<Any>)

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      public fun queueConfigurations(vararg queueConfigurations: Any)

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      public fun topicConfigurations(topicConfigurations: IResolvable)

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      public fun topicConfigurations(topicConfigurations: List<Any>)

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      public fun topicConfigurations(vararg topicConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.builder()

      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      override fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      override
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration.let(EventBridgeConfigurationProperty::unwrap))
      }

      /**
       * @param eventBridgeConfiguration Enables delivery of events to Amazon EventBridge.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b87f2c732256e93c0de8c1e342109ba7764e2cab8995f4d1034b9bcb767ca8fe")
      override
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty.Builder.() -> Unit):
          Unit =
          eventBridgeConfiguration(EventBridgeConfigurationProperty(eventBridgeConfiguration))

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      override fun lambdaConfigurations(lambdaConfigurations: IResolvable) {
        cdkBuilder.lambdaConfigurations(lambdaConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      override fun lambdaConfigurations(lambdaConfigurations: List<Any>) {
        cdkBuilder.lambdaConfigurations(lambdaConfigurations)
      }

      /**
       * @param lambdaConfigurations Describes the AWS Lambda functions to invoke and the events for
       * which to invoke them.
       */
      override fun lambdaConfigurations(vararg lambdaConfigurations: Any): Unit =
          lambdaConfigurations(lambdaConfigurations.toList())

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      override fun queueConfigurations(queueConfigurations: IResolvable) {
        cdkBuilder.queueConfigurations(queueConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      override fun queueConfigurations(queueConfigurations: List<Any>) {
        cdkBuilder.queueConfigurations(queueConfigurations)
      }

      /**
       * @param queueConfigurations The Amazon Simple Queue Service queues to publish messages to
       * and the events for which to publish messages.
       */
      override fun queueConfigurations(vararg queueConfigurations: Any): Unit =
          queueConfigurations(queueConfigurations.toList())

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      override fun topicConfigurations(topicConfigurations: IResolvable) {
        cdkBuilder.topicConfigurations(topicConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      override fun topicConfigurations(topicConfigurations: List<Any>) {
        cdkBuilder.topicConfigurations(topicConfigurations)
      }

      /**
       * @param topicConfigurations The topic to which notifications are sent and the events for
       * which notifications are generated.
       */
      override fun topicConfigurations(vararg topicConfigurations: Any): Unit =
          topicConfigurations(topicConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty,
    ) : CdkObject(cdkObject), NotificationConfigurationProperty {
      /**
       * Enables delivery of events to Amazon EventBridge.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-eventbridgeconfiguration)
       */
      override fun eventBridgeConfiguration(): Any? = unwrap(this).getEventBridgeConfiguration()

      /**
       * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-lambdaconfigurations)
       */
      override fun lambdaConfigurations(): Any? = unwrap(this).getLambdaConfigurations()

      /**
       * The Amazon Simple Queue Service queues to publish messages to and the events for which to
       * publish messages.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-queueconfigurations)
       */
      override fun queueConfigurations(): Any? = unwrap(this).getQueueConfigurations()

      /**
       * The topic to which notifications are sent and the events for which notifications are
       * generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration.html#cfn-s3-bucket-notificationconfiguration-topicconfigurations)
       */
      override fun topicConfigurations(): Any? = unwrap(this).getTopicConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty):
          NotificationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty
    }
  }

  public interface WebsiteConfigurationProperty {
    /**
     * The name of the error document for the website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-errordocument)
     */
    public fun errorDocument(): String? = unwrap(this).getErrorDocument()

    /**
     * The name of the index document for the website.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-indexdocument)
     */
    public fun indexDocument(): String? = unwrap(this).getIndexDocument()

    /**
     * The redirect behavior for every request to this bucket's website endpoint.
     *
     *
     * If you specify this property, you can't specify any other property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-redirectallrequeststo)
     */
    public fun redirectAllRequestsTo(): Any? = unwrap(this).getRedirectAllRequestsTo()

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-routingrules)
     */
    public fun routingRules(): Any? = unwrap(this).getRoutingRules()

    /**
     * A builder for [WebsiteConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorDocument The name of the error document for the website.
       */
      public fun errorDocument(errorDocument: String)

      /**
       * @param indexDocument The name of the index document for the website.
       */
      public fun indexDocument(indexDocument: String)

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      public fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable)

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      public fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty)

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5e4ba853961da74edbf50bd3874794dcd2e10dce7358e3cbd0debe8fa79ad99")
      public
          fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty.Builder.() -> Unit)

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      public fun routingRules(routingRules: IResolvable)

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      public fun routingRules(routingRules: List<Any>)

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      public fun routingRules(vararg routingRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.builder()

      /**
       * @param errorDocument The name of the error document for the website.
       */
      override fun errorDocument(errorDocument: String) {
        cdkBuilder.errorDocument(errorDocument)
      }

      /**
       * @param indexDocument The name of the index document for the website.
       */
      override fun indexDocument(indexDocument: String) {
        cdkBuilder.indexDocument(indexDocument)
      }

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      override fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable) {
        cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo.let(IResolvable::unwrap))
      }

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      override fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty) {
        cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo.let(RedirectAllRequestsToProperty::unwrap))
      }

      /**
       * @param redirectAllRequestsTo The redirect behavior for every request to this bucket's
       * website endpoint.
       *
       * If you specify this property, you can't specify any other property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5e4ba853961da74edbf50bd3874794dcd2e10dce7358e3cbd0debe8fa79ad99")
      override
          fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty.Builder.() -> Unit):
          Unit = redirectAllRequestsTo(RedirectAllRequestsToProperty(redirectAllRequestsTo))

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      override fun routingRules(routingRules: IResolvable) {
        cdkBuilder.routingRules(routingRules.let(IResolvable::unwrap))
      }

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      override fun routingRules(routingRules: List<Any>) {
        cdkBuilder.routingRules(routingRules)
      }

      /**
       * @param routingRules Rules that define when a redirect is applied and the redirect behavior.
       */
      override fun routingRules(vararg routingRules: Any): Unit =
          routingRules(routingRules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty,
    ) : CdkObject(cdkObject), WebsiteConfigurationProperty {
      /**
       * The name of the error document for the website.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-errordocument)
       */
      override fun errorDocument(): String? = unwrap(this).getErrorDocument()

      /**
       * The name of the index document for the website.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-indexdocument)
       */
      override fun indexDocument(): String? = unwrap(this).getIndexDocument()

      /**
       * The redirect behavior for every request to this bucket's website endpoint.
       *
       *
       * If you specify this property, you can't specify any other property.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-redirectallrequeststo)
       */
      override fun redirectAllRequestsTo(): Any? = unwrap(this).getRedirectAllRequestsTo()

      /**
       * Rules that define when a redirect is applied and the redirect behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-websiteconfiguration.html#cfn-s3-bucket-websiteconfiguration-routingrules)
       */
      override fun routingRules(): Any? = unwrap(this).getRoutingRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WebsiteConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty):
          WebsiteConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebsiteConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty
    }
  }

  public interface TagFilterProperty {
    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
     */
    public fun key(): String

    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag key. 
       */
      public fun key(key: String)

      /**
       * @param value The tag value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder
          = software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.builder()

      /**
       * @param key The tag key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty,
    ) : CdkObject(cdkObject), TagFilterProperty {
      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html#cfn-s3-bucket-tagfilter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty):
          TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty
    }
  }

  public interface QueueConfigurationProperty {
    /**
     * The Amazon S3 bucket event about which you want to publish messages to Amazon SQS.
     *
     * For more information, see [Supported Event
     * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon S3
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-event)
     */
    public fun event(): String

    /**
     * The filtering rules that determine which objects trigger notifications.
     *
     * For example, you can create a filter so that Amazon S3 sends notifications only when image
     * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
     * event notifications using object key name
     * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message
     * when it detects events of the specified type.
     *
     * FIFO queues are not allowed when enabling an SQS queue as the event notification destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-queue)
     */
    public fun queue(): String

    /**
     * A builder for [QueueConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param event The Amazon S3 bucket event about which you want to publish messages to Amazon
       * SQS. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      public fun event(event: String)

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      public fun filter(filter: NotificationFilterProperty)

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c5c6c62bf6023767ca2ae77dde13140bed1861753444da5357cbb4aa3f0b35c")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      /**
       * @param queue The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3
       * publishes a message when it detects events of the specified type. 
       * FIFO queues are not allowed when enabling an SQS queue as the event notification
       * destination.
       */
      public fun queue(queue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.builder()

      /**
       * @param event The Amazon S3 bucket event about which you want to publish messages to Amazon
       * SQS. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      /**
       * @param filter The filtering rules that determine which objects trigger notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c5c6c62bf6023767ca2ae77dde13140bed1861753444da5357cbb4aa3f0b35c")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

      /**
       * @param queue The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3
       * publishes a message when it detects events of the specified type. 
       * FIFO queues are not allowed when enabling an SQS queue as the event notification
       * destination.
       */
      override fun queue(queue: String) {
        cdkBuilder.queue(queue)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty,
    ) : CdkObject(cdkObject), QueueConfigurationProperty {
      /**
       * The Amazon S3 bucket event about which you want to publish messages to Amazon SQS.
       *
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-event)
       */
      override fun event(): String = unwrap(this).getEvent()

      /**
       * The filtering rules that determine which objects trigger notifications.
       *
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket. For more information, see [Configuring
       * event notifications using object key name
       * filtering](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/notification-how-to-filtering.html)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a
       * message when it detects events of the specified type.
       *
       * FIFO queues are not allowed when enabling an SQS queue as the event notification
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-queueconfiguration.html#cfn-s3-bucket-queueconfiguration-queue)
       */
      override fun queue(): String = unwrap(this).getQueue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueueConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty):
          QueueConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueueConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty
    }
  }

  public interface ReplicationConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
     * Amazon S3 assumes when replicating objects.
     *
     * For more information, see [How to Set Up
     * Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
     */
    public fun role(): String

    /**
     * A container for one or more replication rules.
     *
     * A replication configuration must have at least one rule and can contain a maximum of 1,000
     * rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [ReplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
       * role that Amazon S3 assumes when replicating objects. 
       * For more information, see [How to Set Up
       * Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html) in
       * the *Amazon S3 User Guide* .
       */
      public fun role(role: String)

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.builder()

      /**
       * @param role The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM)
       * role that Amazon S3 assumes when replicating objects. 
       * For more information, see [How to Set Up
       * Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html) in
       * the *Amazon S3 User Guide* .
       */
      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules A container for one or more replication rules. 
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty,
    ) : CdkObject(cdkObject), ReplicationConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that
       * Amazon S3 assumes when replicating objects.
       *
       * For more information, see [How to Set Up
       * Replication](https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-how-setup.html) in
       * the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-role)
       */
      override fun role(): String = unwrap(this).getRole()

      /**
       * A container for one or more replication rules.
       *
       * A replication configuration must have at least one rule and can contain a maximum of 1,000
       * rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration.html#cfn-s3-bucket-replicationconfiguration-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty
    }
  }

  public interface ReplicationRuleFilterProperty {
    /**
     * A container for specifying rule filters.
     *
     * The filters determine the subset of objects to which the rule applies. This element is
     * required only if you specify more than one filter. For example:
     *
     * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
     * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
     * tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-and)
     */
    public fun and(): Any? = unwrap(this).getAnd()

    /**
     * An object key name prefix that identifies the subset of objects to which the rule applies.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A container for specifying a tag key and value.
     *
     * The rule applies only to objects that have the tag in their tag set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-tagfilter)
     */
    public fun tagFilter(): Any? = unwrap(this).getTagFilter()

    /**
     * A builder for [ReplicationRuleFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      public fun and(and: IResolvable)

      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      public fun and(and: ReplicationRuleAndOperatorProperty)

      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23333c1d41219a2e3a0d3a2a54bb20e58c5c010c6293acc49d54c43a56f51fab")
      public fun and(and: ReplicationRuleAndOperatorProperty.Builder.() -> Unit)

      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun prefix(prefix: String)

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      public fun tagFilter(tagFilter: IResolvable)

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      public fun tagFilter(tagFilter: TagFilterProperty)

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ed144bd4f5a914fd492228186e08003e64e4f07438cdaec2935711660b54765")
      public fun tagFilter(tagFilter: TagFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty.builder()

      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      override fun and(and: ReplicationRuleAndOperatorProperty) {
        cdkBuilder.and(and.let(ReplicationRuleAndOperatorProperty::unwrap))
      }

      /**
       * @param and A container for specifying rule filters.
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23333c1d41219a2e3a0d3a2a54bb20e58c5c010c6293acc49d54c43a56f51fab")
      override fun and(and: ReplicationRuleAndOperatorProperty.Builder.() -> Unit): Unit =
          and(ReplicationRuleAndOperatorProperty(and))

      /**
       * @param prefix An object key name prefix that identifies the subset of objects to which the
       * rule applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      override fun tagFilter(tagFilter: IResolvable) {
        cdkBuilder.tagFilter(tagFilter.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      override fun tagFilter(tagFilter: TagFilterProperty) {
        cdkBuilder.tagFilter(tagFilter.let(TagFilterProperty::unwrap))
      }

      /**
       * @param tagFilter A container for specifying a tag key and value.
       * The rule applies only to objects that have the tag in their tag set.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ed144bd4f5a914fd492228186e08003e64e4f07438cdaec2935711660b54765")
      override fun tagFilter(tagFilter: TagFilterProperty.Builder.() -> Unit): Unit =
          tagFilter(TagFilterProperty(tagFilter))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty,
    ) : CdkObject(cdkObject), ReplicationRuleFilterProperty {
      /**
       * A container for specifying rule filters.
       *
       * The filters determine the subset of objects to which the rule applies. This element is
       * required only if you specify more than one filter. For example:
       *
       * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
       * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
       * tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-and)
       */
      override fun and(): Any? = unwrap(this).getAnd()

      /**
       * An object key name prefix that identifies the subset of objects to which the rule applies.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * A container for specifying a tag key and value.
       *
       * The rule applies only to objects that have the tag in their tag set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html#cfn-s3-bucket-replicationrulefilter-tagfilter)
       */
      override fun tagFilter(): Any? = unwrap(this).getTagFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRuleFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty):
          ReplicationRuleFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRuleFilterProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty
    }
  }

  public interface TargetObjectKeyFormatProperty {
    /**
     * Partitioned S3 key for log objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html#cfn-s3-bucket-targetobjectkeyformat-partitionedprefix)
     */
    public fun partitionedPrefix(): Any? = unwrap(this).getPartitionedPrefix()

    /**
     * To use the simple format for S3 keys for log objects.
     *
     * To specify SimplePrefix format, set SimplePrefix to {}.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html#cfn-s3-bucket-targetobjectkeyformat-simpleprefix)
     */
    public fun simplePrefix(): Any? = unwrap(this).getSimplePrefix()

    /**
     * A builder for [TargetObjectKeyFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      public fun partitionedPrefix(partitionedPrefix: IResolvable)

      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      public fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty)

      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1425d6dbc5168c43516b04bd30bd23cb0541c92f7ada1ba13ab65a618fa89a2a")
      public fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty.Builder.() -> Unit)

      /**
       * @param simplePrefix To use the simple format for S3 keys for log objects.
       * To specify SimplePrefix format, set SimplePrefix to {}.
       */
      public fun simplePrefix(simplePrefix: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty.builder()

      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      override fun partitionedPrefix(partitionedPrefix: IResolvable) {
        cdkBuilder.partitionedPrefix(partitionedPrefix.let(IResolvable::unwrap))
      }

      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      override fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty) {
        cdkBuilder.partitionedPrefix(partitionedPrefix.let(PartitionedPrefixProperty::unwrap))
      }

      /**
       * @param partitionedPrefix Partitioned S3 key for log objects.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1425d6dbc5168c43516b04bd30bd23cb0541c92f7ada1ba13ab65a618fa89a2a")
      override
          fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty.Builder.() -> Unit):
          Unit = partitionedPrefix(PartitionedPrefixProperty(partitionedPrefix))

      /**
       * @param simplePrefix To use the simple format for S3 keys for log objects.
       * To specify SimplePrefix format, set SimplePrefix to {}.
       */
      override fun simplePrefix(simplePrefix: Any) {
        cdkBuilder.simplePrefix(simplePrefix)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty,
    ) : CdkObject(cdkObject), TargetObjectKeyFormatProperty {
      /**
       * Partitioned S3 key for log objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html#cfn-s3-bucket-targetobjectkeyformat-partitionedprefix)
       */
      override fun partitionedPrefix(): Any? = unwrap(this).getPartitionedPrefix()

      /**
       * To use the simple format for S3 keys for log objects.
       *
       * To specify SimplePrefix format, set SimplePrefix to {}.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-targetobjectkeyformat.html#cfn-s3-bucket-targetobjectkeyformat-simpleprefix)
       */
      override fun simplePrefix(): Any? = unwrap(this).getSimplePrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetObjectKeyFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty):
          TargetObjectKeyFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetObjectKeyFormatProperty):
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty
    }
  }

  public interface MetricsConfigurationProperty {
    /**
     * The access point that was used while performing operations on the object.
     *
     * The metrics configuration only includes objects that meet the filter's criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-accesspointarn)
     */
    public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    /**
     * The ID used to identify the metrics configuration.
     *
     * This can be any value you choose that helps you identify your metrics configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
     */
    public fun id(): String

    /**
     * The prefix that an object must have to be included in the metrics results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Specifies a list of tag filters to use as a metrics configuration filter.
     *
     * The metrics configuration includes only objects that meet the filter's criteria.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * A builder for [MetricsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessPointArn The access point that was used while performing operations on the
       * object.
       * The metrics configuration only includes objects that meet the filter's criteria.
       */
      public fun accessPointArn(accessPointArn: String)

      /**
       * @param id The ID used to identify the metrics configuration. 
       * This can be any value you choose that helps you identify your metrics configuration.
       */
      public fun id(id: String)

      /**
       * @param prefix The prefix that an object must have to be included in the metrics results.
       */
      public fun prefix(prefix: String)

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.builder()

      /**
       * @param accessPointArn The access point that was used while performing operations on the
       * object.
       * The metrics configuration only includes objects that meet the filter's criteria.
       */
      override fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
      }

      /**
       * @param id The ID used to identify the metrics configuration. 
       * This can be any value you choose that helps you identify your metrics configuration.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param prefix The prefix that an object must have to be included in the metrics results.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
       * The metrics configuration includes only objects that meet the filter's criteria.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty,
    ) : CdkObject(cdkObject), MetricsConfigurationProperty {
      /**
       * The access point that was used while performing operations on the object.
       *
       * The metrics configuration only includes objects that meet the filter's criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-accesspointarn)
       */
      override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

      /**
       * The ID used to identify the metrics configuration.
       *
       * This can be any value you choose that helps you identify your metrics configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The prefix that an object must have to be included in the metrics results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * Specifies a list of tag filters to use as a metrics configuration filter.
       *
       * The metrics configuration includes only objects that meet the filter's criteria.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html#cfn-s3-bucket-metricsconfiguration-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty):
          MetricsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty
    }
  }

  public interface NoncurrentVersionExpirationProperty {
    /**
     * Specifies how many noncurrent versions Amazon S3 will retain.
     *
     * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
     * action. For more information about noncurrent versions, see [Lifecycle configuration
     * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
     * the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html#cfn-s3-bucket-noncurrentversionexpiration-newernoncurrentversions)
     */
    public fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

    /**
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
     * associated action.
     *
     * For information about the noncurrent days calculations, see [How Amazon S3 Calculates When an
     * Object Became
     * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html#cfn-s3-bucket-noncurrentversionexpiration-noncurrentdays)
     */
    public fun noncurrentDays(): Number

    /**
     * A builder for [NoncurrentVersionExpirationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will
       * retain.
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       */
      public fun newerNoncurrentVersions(newerNoncurrentVersions: Number)

      /**
       * @param noncurrentDays Specifies the number of days an object is noncurrent before Amazon S3
       * can perform the associated action. 
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates When
       * an Object Became
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       */
      public fun noncurrentDays(noncurrentDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty.builder()

      /**
       * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will
       * retain.
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       */
      override fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
      }

      /**
       * @param noncurrentDays Specifies the number of days an object is noncurrent before Amazon S3
       * can perform the associated action. 
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates When
       * an Object Became
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       */
      override fun noncurrentDays(noncurrentDays: Number) {
        cdkBuilder.noncurrentDays(noncurrentDays)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty,
    ) : CdkObject(cdkObject), NoncurrentVersionExpirationProperty {
      /**
       * Specifies how many noncurrent versions Amazon S3 will retain.
       *
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html#cfn-s3-bucket-noncurrentversionexpiration-newernoncurrentversions)
       */
      override fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

      /**
       * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
       * associated action.
       *
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates When
       * an Object Became
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html#cfn-s3-bucket-noncurrentversionexpiration-noncurrentdays)
       */
      override fun noncurrentDays(): Number = unwrap(this).getNoncurrentDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NoncurrentVersionExpirationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty):
          NoncurrentVersionExpirationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoncurrentVersionExpirationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty
    }
  }

  public interface DataExportProperty {
    /**
     * The place to store the data for an analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
     */
    public fun destination(): Any

    /**
     * The version of the output schema to use when exporting data.
     *
     * Must be `V_1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
     */
    public fun outputSchemaVersion(): String

    /**
     * A builder for [DataExportProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The place to store the data for an analysis. 
       */
      public fun destination(destination: IResolvable)

      /**
       * @param destination The place to store the data for an analysis. 
       */
      public fun destination(destination: DestinationProperty)

      /**
       * @param destination The place to store the data for an analysis. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("086b3a0be4874adb40dc8fdc6496d9d22884abb5c60f23094a66b3088c09bf70")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      /**
       * @param outputSchemaVersion The version of the output schema to use when exporting data. 
       * Must be `V_1` .
       */
      public fun outputSchemaVersion(outputSchemaVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.builder()

      /**
       * @param destination The place to store the data for an analysis. 
       */
      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      /**
       * @param destination The place to store the data for an analysis. 
       */
      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty::unwrap))
      }

      /**
       * @param destination The place to store the data for an analysis. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("086b3a0be4874adb40dc8fdc6496d9d22884abb5c60f23094a66b3088c09bf70")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      /**
       * @param outputSchemaVersion The version of the output schema to use when exporting data. 
       * Must be `V_1` .
       */
      override fun outputSchemaVersion(outputSchemaVersion: String) {
        cdkBuilder.outputSchemaVersion(outputSchemaVersion)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty,
    ) : CdkObject(cdkObject), DataExportProperty {
      /**
       * The place to store the data for an analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-destination)
       */
      override fun destination(): Any = unwrap(this).getDestination()

      /**
       * The version of the output schema to use when exporting data.
       *
       * Must be `V_1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion)
       */
      override fun outputSchemaVersion(): String = unwrap(this).getOutputSchemaVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataExportProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty):
          DataExportProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataExportProperty):
          software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty
    }
  }

  public interface LambdaConfigurationProperty {
    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     *
     * For more information, see [Supported Event
     * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon S3
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-event)
     */
    public fun event(): String

    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     *
     * For example, you can create a filter so that only image files with a `.jpg` extension invoke
     * the function when they are added to the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the
     * specified event type occurs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-function)
     */
    public fun function(): String

    /**
     * A builder for [LambdaConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param event The Amazon S3 bucket event for which to invoke the AWS Lambda function. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      public fun event(event: String)

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      public fun filter(filter: NotificationFilterProperty)

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcfaefe530d33ecf072876883af958608b5d3dbdf15393cd2865a0db8217c599")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      /**
       * @param function The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
       * invokes when the specified event type occurs. 
       */
      public fun function(function: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.builder()

      /**
       * @param event The Amazon S3 bucket event for which to invoke the AWS Lambda function. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      /**
       * @param filter The filtering rules that determine which objects invoke the AWS Lambda
       * function.
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcfaefe530d33ecf072876883af958608b5d3dbdf15393cd2865a0db8217c599")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

      /**
       * @param function The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3
       * invokes when the specified event type occurs. 
       */
      override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty,
    ) : CdkObject(cdkObject), LambdaConfigurationProperty {
      /**
       * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
       *
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-event)
       */
      override fun event(): String = unwrap(this).getEvent()

      /**
       * The filtering rules that determine which objects invoke the AWS Lambda function.
       *
       * For example, you can create a filter so that only image files with a `.jpg` extension
       * invoke the function when they are added to the Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the
       * specified event type occurs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lambdaconfiguration.html#cfn-s3-bucket-lambdaconfiguration-function)
       */
      override fun function(): String = unwrap(this).getFunction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty):
          LambdaConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty
    }
  }

  public interface S3KeyFilterProperty {
    /**
     * A list of containers for the key-value pair that defines the criteria for the filter rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-s3keyfilter.html#cfn-s3-bucket-s3keyfilter-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [S3KeyFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.builder()

      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules A list of containers for the key-value pair that defines the criteria for the
       * filter rule. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty,
    ) : CdkObject(cdkObject), S3KeyFilterProperty {
      /**
       * A list of containers for the key-value pair that defines the criteria for the filter rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-s3keyfilter.html#cfn-s3-bucket-s3keyfilter-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3KeyFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty):
          S3KeyFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3KeyFilterProperty):
          software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty
    }
  }

  public interface NoncurrentVersionTransitionProperty {
    /**
     * Specifies how many noncurrent versions Amazon S3 will retain.
     *
     * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
     * action. For more information about noncurrent versions, see [Lifecycle configuration
     * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
     * the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-newernoncurrentversions)
     */
    public fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

    /**
     * The class of storage used to store the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-storageclass)
     */
    public fun storageClass(): String

    /**
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
     * associated action.
     *
     * For information about the noncurrent days calculations, see [How Amazon S3 Calculates How
     * Long an Object Has Been
     * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-transitionindays)
     */
    public fun transitionInDays(): Number

    /**
     * A builder for [NoncurrentVersionTransitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will
       * retain.
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       */
      public fun newerNoncurrentVersions(newerNoncurrentVersions: Number)

      /**
       * @param storageClass The class of storage used to store the object. 
       */
      public fun storageClass(storageClass: String)

      /**
       * @param transitionInDays Specifies the number of days an object is noncurrent before Amazon
       * S3 can perform the associated action. 
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates How
       * Long an Object Has Been
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       */
      public fun transitionInDays(transitionInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.builder()

      /**
       * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will
       * retain.
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       */
      override fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
      }

      /**
       * @param storageClass The class of storage used to store the object. 
       */
      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

      /**
       * @param transitionInDays Specifies the number of days an object is noncurrent before Amazon
       * S3 can perform the associated action. 
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates How
       * Long an Object Has Been
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       */
      override fun transitionInDays(transitionInDays: Number) {
        cdkBuilder.transitionInDays(transitionInDays)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty,
    ) : CdkObject(cdkObject), NoncurrentVersionTransitionProperty {
      /**
       * Specifies how many noncurrent versions Amazon S3 will retain.
       *
       * If there are this many more recent noncurrent versions, Amazon S3 will take the associated
       * action. For more information about noncurrent versions, see [Lifecycle configuration
       * elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html) in
       * the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-newernoncurrentversions)
       */
      override fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

      /**
       * The class of storage used to store the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-storageclass)
       */
      override fun storageClass(): String = unwrap(this).getStorageClass()

      /**
       * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
       * associated action.
       *
       * For information about the noncurrent days calculations, see [How Amazon S3 Calculates How
       * Long an Object Has Been
       * Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversiontransition.html#cfn-s3-bucket-noncurrentversiontransition-transitionindays)
       */
      override fun transitionInDays(): Number = unwrap(this).getTransitionInDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NoncurrentVersionTransitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty):
          NoncurrentVersionTransitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NoncurrentVersionTransitionProperty):
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty
    }
  }

  public interface RuleProperty {
    /**
     * Specifies a lifecycle rule that stops incomplete multipart uploads to an Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
     */
    public fun abortIncompleteMultipartUpload(): Any? =
        unwrap(this).getAbortIncompleteMultipartUpload()

    /**
     * Indicates when objects are deleted from Amazon S3 and Amazon S3 Glacier.
     *
     * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify an
     * expiration and transition time, you must use the same time unit for both properties (either in
     * days or by date). The expiration time must also be later than the transition time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expirationdate)
     */
    public fun expirationDate(): Any? = unwrap(this).getExpirationDate()

    /**
     * Indicates the number of days after creation when objects are deleted from Amazon S3 and
     * Amazon S3 Glacier.
     *
     * If you specify an expiration and transition time, you must use the same time unit for both
     * properties (either in days or by date). The expiration time must also be later than the
     * transition time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expirationindays)
     */
    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    /**
     * Indicates whether Amazon S3 will remove a delete marker without any noncurrent versions.
     *
     * If set to true, the delete marker will be removed if there are no noncurrent versions. This
     * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expiredobjectdeletemarker)
     */
    public fun expiredObjectDeleteMarker(): Any? = unwrap(this).getExpiredObjectDeleteMarker()

    /**
     * Unique identifier for the rule.
     *
     * The value can't be longer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * Specifies when noncurrent object versions expire.
     *
     * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request
     * that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversionexpiration)
     */
    public fun noncurrentVersionExpiration(): Any? = unwrap(this).getNoncurrentVersionExpiration()

    /**
     * (Deprecated.) For buckets with versioning enabled (or suspended), specifies the time, in
     * days, between when a new version of the object is uploaded to the bucket and when old versions
     * of the object expire. When object versions expire, Amazon S3 permanently deletes them. If you
     * specify a transition and expiration time, the expiration time must be later than the transition
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversionexpirationindays)
     */
    public fun noncurrentVersionExpirationInDays(): Number? =
        unwrap(this).getNoncurrentVersionExpirationInDays()

    /**
     * (Deprecated.) For buckets with versioning enabled (or suspended), specifies when non-current
     * objects transition to a specified storage class. If you specify a transition and expiration
     * time, the expiration time must be later than the transition time. If you specify this property,
     * don't specify the `NoncurrentVersionTransitions` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversiontransition)
     */
    public fun noncurrentVersionTransition(): Any? = unwrap(this).getNoncurrentVersionTransition()

    /**
     * For buckets with versioning enabled (or suspended), one or more transition rules that specify
     * when non-current objects transition to a specified storage class.
     *
     * If you specify a transition and expiration time, the expiration time must be later than the
     * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversiontransitions)
     */
    public fun noncurrentVersionTransitions(): Any? = unwrap(this).getNoncurrentVersionTransitions()

    /**
     * Specifies the minimum object size in bytes for this rule to apply to.
     *
     * Objects must be larger than this value in bytes. For more information about size based rules,
     * see [Lifecycle configuration using size-based
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-objectsizegreaterthan)
     */
    public fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

    /**
     * Specifies the maximum object size in bytes for this rule to apply to.
     *
     * Objects must be smaller than this value in bytes. For more information about sized based
     * rules, see [Lifecycle configuration using size-based
     * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
     * in the *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-objectsizelessthan)
     */
    public fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * If `Enabled` , the rule is currently being applied.
     *
     * If `Disabled` , the rule is not currently being applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-status)
     */
    public fun status(): String

    /**
     * Tags to use to identify a subset of objects to which the lifecycle rule applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * (Deprecated.) Specifies when an object transitions to a specified storage class. If you
     * specify an expiration and transition time, you must use the same time unit for both properties
     * (either in days or by date). The expiration time must also be later than the transition time. If
     * you specify this property, don't specify the `Transitions` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-transition)
     */
    public fun transition(): Any? = unwrap(this).getTransition()

    /**
     * One or more transition rules that specify when an object transitions to a specified storage
     * class.
     *
     * If you specify an expiration and transition time, you must use the same time unit for both
     * properties (either in days or by date). The expiration time must also be later than the
     * transition time. If you specify this property, don't specify the `Transition` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-transitions)
     */
    public fun transitions(): Any? = unwrap(this).getTransitions()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable)

      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty)

      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("373ac1027961dae8584522f37894a363546ed96a3bf7c73fa39f5c307fdcf17e")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit)

      /**
       * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3
       * Glacier.
       * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify
       * an expiration and transition time, you must use the same time unit for both properties (either
       * in days or by date). The expiration time must also be later than the transition time.
       */
      public fun expirationDate(expirationDate: IResolvable)

      /**
       * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3
       * Glacier.
       * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify
       * an expiration and transition time, you must use the same time unit for both properties (either
       * in days or by date). The expiration time must also be later than the transition time.
       */
      public fun expirationDate(expirationDate: Instant)

      /**
       * @param expirationInDays Indicates the number of days after creation when objects are
       * deleted from Amazon S3 and Amazon S3 Glacier.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       */
      public fun expirationInDays(expirationInDays: Number)

      /**
       * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
       * without any noncurrent versions.
       * If set to true, the delete marker will be removed if there are no noncurrent versions. This
       * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
       */
      public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean)

      /**
       * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
       * without any noncurrent versions.
       * If set to true, the delete marker will be removed if there are no noncurrent versions. This
       * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
       */
      public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable)

      /**
       * @param id Unique identifier for the rule.
       * The value can't be longer than 255 characters.
       */
      public fun id(id: String)

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      public fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable)

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      public
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty)

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd32ac9594dbb96c48901e44f3aa55497c8801896078f2dae95aa3ad376a003")
      public
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty.Builder.() -> Unit)

      /**
       * @param noncurrentVersionExpirationInDays (Deprecated.) For buckets with versioning enabled
       * (or suspended), specifies the time, in days, between when a new version of the object is
       * uploaded to the bucket and when old versions of the object expire. When object versions
       * expire, Amazon S3 permanently deletes them. If you specify a transition and expiration time,
       * the expiration time must be later than the transition time.
       */
      public fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number)

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      public fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable)

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      public
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty)

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("118da244dc40bb1e95131331021544ab13ea7b99488e4515c88e7198028c002d")
      public
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty.Builder.() -> Unit)

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      public fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable)

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      public fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<Any>)

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      public fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any)

      /**
       * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
       * apply to.
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      public fun objectSizeGreaterThan(objectSizeGreaterThan: Number)

      /**
       * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
       * to.
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      public fun objectSizeLessThan(objectSizeLessThan: Number)

      /**
       * @param prefix Object key prefix that identifies one or more objects to which this rule
       * applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun prefix(prefix: String)

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      public fun status(status: String)

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      public fun tagFilters(vararg tagFilters: Any)

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      public fun transition(transition: IResolvable)

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      public fun transition(transition: TransitionProperty)

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbb4accfd7ce57a9f8ecb817fc3d364b1fe559511dbe07c1bac4ffab1f425f72")
      public fun transition(transition: TransitionProperty.Builder.() -> Unit)

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      public fun transitions(transitions: IResolvable)

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      public fun transitions(transitions: List<Any>)

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      public fun transitions(vararg transitions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.builder()

      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      override fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty::unwrap))
      }

      /**
       * @param abortIncompleteMultipartUpload Specifies a lifecycle rule that stops incomplete
       * multipart uploads to an Amazon S3 bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("373ac1027961dae8584522f37894a363546ed96a3bf7c73fa39f5c307fdcf17e")
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      /**
       * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3
       * Glacier.
       * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify
       * an expiration and transition time, you must use the same time unit for both properties (either
       * in days or by date). The expiration time must also be later than the transition time.
       */
      override fun expirationDate(expirationDate: IResolvable) {
        cdkBuilder.expirationDate(expirationDate.let(IResolvable::unwrap))
      }

      /**
       * @param expirationDate Indicates when objects are deleted from Amazon S3 and Amazon S3
       * Glacier.
       * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify
       * an expiration and transition time, you must use the same time unit for both properties (either
       * in days or by date). The expiration time must also be later than the transition time.
       */
      override fun expirationDate(expirationDate: Instant) {
        cdkBuilder.expirationDate(expirationDate)
      }

      /**
       * @param expirationInDays Indicates the number of days after creation when objects are
       * deleted from Amazon S3 and Amazon S3 Glacier.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       */
      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      /**
       * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
       * without any noncurrent versions.
       * If set to true, the delete marker will be removed if there are no noncurrent versions. This
       * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
       */
      override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
        cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
      }

      /**
       * @param expiredObjectDeleteMarker Indicates whether Amazon S3 will remove a delete marker
       * without any noncurrent versions.
       * If set to true, the delete marker will be removed if there are no noncurrent versions. This
       * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
       */
      override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable) {
        cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker.let(IResolvable::unwrap))
      }

      /**
       * @param id Unique identifier for the rule.
       * The value can't be longer than 255 characters.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      override fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable) {
        cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(IResolvable::unwrap))
      }

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      override
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty) {
        cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(NoncurrentVersionExpirationProperty::unwrap))
      }

      /**
       * @param noncurrentVersionExpiration Specifies when noncurrent object versions expire.
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd32ac9594dbb96c48901e44f3aa55497c8801896078f2dae95aa3ad376a003")
      override
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty.Builder.() -> Unit):
          Unit =
          noncurrentVersionExpiration(NoncurrentVersionExpirationProperty(noncurrentVersionExpiration))

      /**
       * @param noncurrentVersionExpirationInDays (Deprecated.) For buckets with versioning enabled
       * (or suspended), specifies the time, in days, between when a new version of the object is
       * uploaded to the bucket and when old versions of the object expire. When object versions
       * expire, Amazon S3 permanently deletes them. If you specify a transition and expiration time,
       * the expiration time must be later than the transition time.
       */
      override fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number) {
        cdkBuilder.noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays)
      }

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      override fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable) {
        cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition.let(IResolvable::unwrap))
      }

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      override
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty) {
        cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition.let(NoncurrentVersionTransitionProperty::unwrap))
      }

      /**
       * @param noncurrentVersionTransition (Deprecated.) For buckets with versioning enabled (or
       * suspended), specifies when non-current objects transition to a specified storage class. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the
       * `NoncurrentVersionTransitions` property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("118da244dc40bb1e95131331021544ab13ea7b99488e4515c88e7198028c002d")
      override
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty.Builder.() -> Unit):
          Unit =
          noncurrentVersionTransition(NoncurrentVersionTransitionProperty(noncurrentVersionTransition))

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      override fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable) {
        cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions.let(IResolvable::unwrap))
      }

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      override fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<Any>) {
        cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions)
      }

      /**
       * @param noncurrentVersionTransitions For buckets with versioning enabled (or suspended), one
       * or more transition rules that specify when non-current objects transition to a specified
       * storage class.
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       */
      override fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any): Unit =
          noncurrentVersionTransitions(noncurrentVersionTransitions.toList())

      /**
       * @param objectSizeGreaterThan Specifies the minimum object size in bytes for this rule to
       * apply to.
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      override fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
        cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
      }

      /**
       * @param objectSizeLessThan Specifies the maximum object size in bytes for this rule to apply
       * to.
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       */
      override fun objectSizeLessThan(objectSizeLessThan: Number) {
        cdkBuilder.objectSizeLessThan(objectSizeLessThan)
      }

      /**
       * @param prefix Object key prefix that identifies one or more objects to which this rule
       * applies.
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param status If `Enabled` , the rule is currently being applied. 
       * If `Disabled` , the rule is not currently being applied.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters Tags to use to identify a subset of objects to which the lifecycle rule
       * applies.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      override fun transition(transition: IResolvable) {
        cdkBuilder.transition(transition.let(IResolvable::unwrap))
      }

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      override fun transition(transition: TransitionProperty) {
        cdkBuilder.transition(transition.let(TransitionProperty::unwrap))
      }

      /**
       * @param transition (Deprecated.) Specifies when an object transitions to a specified storage
       * class. If you specify an expiration and transition time, you must use the same time unit for
       * both properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transitions` property.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbb4accfd7ce57a9f8ecb817fc3d364b1fe559511dbe07c1bac4ffab1f425f72")
      override fun transition(transition: TransitionProperty.Builder.() -> Unit): Unit =
          transition(TransitionProperty(transition))

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      override fun transitions(transitions: IResolvable) {
        cdkBuilder.transitions(transitions.let(IResolvable::unwrap))
      }

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      override fun transitions(transitions: List<Any>) {
        cdkBuilder.transitions(transitions)
      }

      /**
       * @param transitions One or more transition rules that specify when an object transitions to
       * a specified storage class.
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       */
      override fun transitions(vararg transitions: Any): Unit = transitions(transitions.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * Specifies a lifecycle rule that stops incomplete multipart uploads to an Amazon S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-abortincompletemultipartupload)
       */
      override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      /**
       * Indicates when objects are deleted from Amazon S3 and Amazon S3 Glacier.
       *
       * The date value must be in ISO 8601 format. The time is always midnight UTC. If you specify
       * an expiration and transition time, you must use the same time unit for both properties (either
       * in days or by date). The expiration time must also be later than the transition time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expirationdate)
       */
      override fun expirationDate(): Any? = unwrap(this).getExpirationDate()

      /**
       * Indicates the number of days after creation when objects are deleted from Amazon S3 and
       * Amazon S3 Glacier.
       *
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expirationindays)
       */
      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      /**
       * Indicates whether Amazon S3 will remove a delete marker without any noncurrent versions.
       *
       * If set to true, the delete marker will be removed if there are no noncurrent versions. This
       * cannot be specified with `ExpirationInDays` , `ExpirationDate` , or `TagFilters` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-expiredobjectdeletemarker)
       */
      override fun expiredObjectDeleteMarker(): Any? = unwrap(this).getExpiredObjectDeleteMarker()

      /**
       * Unique identifier for the rule.
       *
       * The value can't be longer than 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * Specifies when noncurrent object versions expire.
       *
       * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
       * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to
       * request that Amazon S3 delete noncurrent object versions at a specific period in the object's
       * lifetime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversionexpiration)
       */
      override fun noncurrentVersionExpiration(): Any? =
          unwrap(this).getNoncurrentVersionExpiration()

      /**
       * (Deprecated.) For buckets with versioning enabled (or suspended), specifies the time, in
       * days, between when a new version of the object is uploaded to the bucket and when old versions
       * of the object expire. When object versions expire, Amazon S3 permanently deletes them. If you
       * specify a transition and expiration time, the expiration time must be later than the
       * transition time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversionexpirationindays)
       */
      override fun noncurrentVersionExpirationInDays(): Number? =
          unwrap(this).getNoncurrentVersionExpirationInDays()

      /**
       * (Deprecated.) For buckets with versioning enabled (or suspended), specifies when
       * non-current objects transition to a specified storage class. If you specify a transition and
       * expiration time, the expiration time must be later than the transition time. If you specify
       * this property, don't specify the `NoncurrentVersionTransitions` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversiontransition)
       */
      override fun noncurrentVersionTransition(): Any? =
          unwrap(this).getNoncurrentVersionTransition()

      /**
       * For buckets with versioning enabled (or suspended), one or more transition rules that
       * specify when non-current objects transition to a specified storage class.
       *
       * If you specify a transition and expiration time, the expiration time must be later than the
       * transition time. If you specify this property, don't specify the `NoncurrentVersionTransition`
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-noncurrentversiontransitions)
       */
      override fun noncurrentVersionTransitions(): Any? =
          unwrap(this).getNoncurrentVersionTransitions()

      /**
       * Specifies the minimum object size in bytes for this rule to apply to.
       *
       * Objects must be larger than this value in bytes. For more information about size based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-objectsizegreaterthan)
       */
      override fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

      /**
       * Specifies the maximum object size in bytes for this rule to apply to.
       *
       * Objects must be smaller than this value in bytes. For more information about sized based
       * rules, see [Lifecycle configuration using size-based
       * rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/lifecycle-configuration-examples.html#lc-size-rules)
       * in the *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-objectsizelessthan)
       */
      override fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

      /**
       * Object key prefix that identifies one or more objects to which this rule applies.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * If `Enabled` , the rule is currently being applied.
       *
       * If `Disabled` , the rule is not currently being applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * Tags to use to identify a subset of objects to which the lifecycle rule applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()

      /**
       * (Deprecated.) Specifies when an object transitions to a specified storage class. If you
       * specify an expiration and transition time, you must use the same time unit for both properties
       * (either in days or by date). The expiration time must also be later than the transition time.
       * If you specify this property, don't specify the `Transitions` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-transition)
       */
      override fun transition(): Any? = unwrap(this).getTransition()

      /**
       * One or more transition rules that specify when an object transitions to a specified storage
       * class.
       *
       * If you specify an expiration and transition time, you must use the same time unit for both
       * properties (either in days or by date). The expiration time must also be later than the
       * transition time. If you specify this property, don't specify the `Transition` property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-rule.html#cfn-s3-bucket-rule-transitions)
       */
      override fun transitions(): Any? = unwrap(this).getTransitions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.RuleProperty
    }
  }

  public interface PartitionedPrefixProperty {
    /**
     * Specifies the partition date source for the partitioned prefix.
     *
     * PartitionDateSource can be EventTime or DeliveryTime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-partitionedprefix.html#cfn-s3-bucket-partitionedprefix-partitiondatesource)
     */
    public fun partitionDateSource(): String? = unwrap(this).getPartitionDateSource()

    /**
     * A builder for [PartitionedPrefixProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionDateSource Specifies the partition date source for the partitioned prefix.
       * PartitionDateSource can be EventTime or DeliveryTime.
       */
      public fun partitionDateSource(partitionDateSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty.builder()

      /**
       * @param partitionDateSource Specifies the partition date source for the partitioned prefix.
       * PartitionDateSource can be EventTime or DeliveryTime.
       */
      override fun partitionDateSource(partitionDateSource: String) {
        cdkBuilder.partitionDateSource(partitionDateSource)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty,
    ) : CdkObject(cdkObject), PartitionedPrefixProperty {
      /**
       * Specifies the partition date source for the partitioned prefix.
       *
       * PartitionDateSource can be EventTime or DeliveryTime.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-partitionedprefix.html#cfn-s3-bucket-partitionedprefix-partitiondatesource)
       */
      override fun partitionDateSource(): String? = unwrap(this).getPartitionDateSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionedPrefixProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty):
          PartitionedPrefixProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionedPrefixProperty):
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty
    }
  }

  public interface AbortIncompleteMultipartUploadProperty {
    /**
     * Specifies the number of days after which Amazon S3 stops an incomplete multipart upload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
     */
    public fun daysAfterInitiation(): Number

    /**
     * A builder for [AbortIncompleteMultipartUploadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param daysAfterInitiation Specifies the number of days after which Amazon S3 stops an
       * incomplete multipart upload. 
       */
      public fun daysAfterInitiation(daysAfterInitiation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

      /**
       * @param daysAfterInitiation Specifies the number of days after which Amazon S3 stops an
       * incomplete multipart upload. 
       */
      override fun daysAfterInitiation(daysAfterInitiation: Number) {
        cdkBuilder.daysAfterInitiation(daysAfterInitiation)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty,
    ) : CdkObject(cdkObject), AbortIncompleteMultipartUploadProperty {
      /**
       * Specifies the number of days after which Amazon S3 stops an incomplete multipart upload.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-abortincompletemultipartupload.html#cfn-s3-bucket-abortincompletemultipartupload-daysafterinitiation)
       */
      override fun daysAfterInitiation(): Number = unwrap(this).getDaysAfterInitiation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AbortIncompleteMultipartUploadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty):
          AbortIncompleteMultipartUploadProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AbortIncompleteMultipartUploadProperty):
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty
    }
  }

  public interface ObjectLockRuleProperty {
    /**
     * The default Object Lock retention mode and period that you want to apply to new objects
     * placed in the specified bucket.
     *
     * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
     * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more information
     * about allowable values for mode and period, see
     * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html#cfn-s3-bucket-objectlockrule-defaultretention)
     */
    public fun defaultRetention(): Any? = unwrap(this).getDefaultRetention()

    /**
     * A builder for [ObjectLockRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      public fun defaultRetention(defaultRetention: IResolvable)

      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      public fun defaultRetention(defaultRetention: DefaultRetentionProperty)

      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e6406f9e899a15d6bba8fdc59e36592ddd109e83a0b19952d00295a89ed2a31")
      public fun defaultRetention(defaultRetention: DefaultRetentionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty.builder()

      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      override fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention.let(IResolvable::unwrap))
      }

      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      override fun defaultRetention(defaultRetention: DefaultRetentionProperty) {
        cdkBuilder.defaultRetention(defaultRetention.let(DefaultRetentionProperty::unwrap))
      }

      /**
       * @param defaultRetention The default Object Lock retention mode and period that you want to
       * apply to new objects placed in the specified bucket.
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e6406f9e899a15d6bba8fdc59e36592ddd109e83a0b19952d00295a89ed2a31")
      override fun defaultRetention(defaultRetention: DefaultRetentionProperty.Builder.() -> Unit):
          Unit = defaultRetention(DefaultRetentionProperty(defaultRetention))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty,
    ) : CdkObject(cdkObject), ObjectLockRuleProperty {
      /**
       * The default Object Lock retention mode and period that you want to apply to new objects
       * placed in the specified bucket.
       *
       * If Object Lock is turned on, bucket settings require both `Mode` and a period of either
       * `Days` or `Years` . You cannot specify `Days` and `Years` at the same time. For more
       * information about allowable values for mode and period, see
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html#cfn-s3-bucket-objectlockrule-defaultretention)
       */
      override fun defaultRetention(): Any? = unwrap(this).getDefaultRetention()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectLockRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty):
          ObjectLockRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectLockRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty
    }
  }

  public interface DeleteMarkerReplicationProperty {
    /**
     * Indicates whether to replicate delete markers.
     *
     * Disabled by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html#cfn-s3-bucket-deletemarkerreplication-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [DeleteMarkerReplicationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Indicates whether to replicate delete markers.
       * Disabled by default.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty.builder()

      /**
       * @param status Indicates whether to replicate delete markers.
       * Disabled by default.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty,
    ) : CdkObject(cdkObject), DeleteMarkerReplicationProperty {
      /**
       * Indicates whether to replicate delete markers.
       *
       * Disabled by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-deletemarkerreplication.html#cfn-s3-bucket-deletemarkerreplication-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeleteMarkerReplicationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty):
          DeleteMarkerReplicationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeleteMarkerReplicationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty
    }
  }

  public interface LoggingConfigurationProperty {
    /**
     * The name of the bucket where Amazon S3 should store server access log files.
     *
     * You can store log files in any bucket that you own. By default, logs are stored in the bucket
     * where the `LoggingConfiguration` property is defined.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-destinationbucketname)
     */
    public fun destinationBucketName(): String? = unwrap(this).getDestinationBucketName()

    /**
     * A prefix for all log object keys.
     *
     * If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a
     * prefix to distinguish which log files came from which bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-logfileprefix)
     */
    public fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

    /**
     * Amazon S3 key format for log objects.
     *
     * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-targetobjectkeyformat)
     */
    public fun targetObjectKeyFormat(): Any? = unwrap(this).getTargetObjectKeyFormat()

    /**
     * A builder for [LoggingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationBucketName The name of the bucket where Amazon S3 should store server
       * access log files.
       * You can store log files in any bucket that you own. By default, logs are stored in the
       * bucket where the `LoggingConfiguration` property is defined.
       */
      public fun destinationBucketName(destinationBucketName: String)

      /**
       * @param logFilePrefix A prefix for all log object keys.
       * If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a
       * prefix to distinguish which log files came from which bucket.
       */
      public fun logFilePrefix(logFilePrefix: String)

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      public fun targetObjectKeyFormat(targetObjectKeyFormat: IResolvable)

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      public fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty)

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0fa8c9ab2c1f7bd1230ee3794703e37b2cdb1ba89cff1942796b03c95f491bc")
      public
          fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.builder()

      /**
       * @param destinationBucketName The name of the bucket where Amazon S3 should store server
       * access log files.
       * You can store log files in any bucket that you own. By default, logs are stored in the
       * bucket where the `LoggingConfiguration` property is defined.
       */
      override fun destinationBucketName(destinationBucketName: String) {
        cdkBuilder.destinationBucketName(destinationBucketName)
      }

      /**
       * @param logFilePrefix A prefix for all log object keys.
       * If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a
       * prefix to distinguish which log files came from which bucket.
       */
      override fun logFilePrefix(logFilePrefix: String) {
        cdkBuilder.logFilePrefix(logFilePrefix)
      }

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      override fun targetObjectKeyFormat(targetObjectKeyFormat: IResolvable) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(IResolvable::unwrap))
      }

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      override fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(TargetObjectKeyFormatProperty::unwrap))
      }

      /**
       * @param targetObjectKeyFormat Amazon S3 key format for log objects.
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0fa8c9ab2c1f7bd1230ee3794703e37b2cdb1ba89cff1942796b03c95f491bc")
      override
          fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty.Builder.() -> Unit):
          Unit = targetObjectKeyFormat(TargetObjectKeyFormatProperty(targetObjectKeyFormat))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty,
    ) : CdkObject(cdkObject), LoggingConfigurationProperty {
      /**
       * The name of the bucket where Amazon S3 should store server access log files.
       *
       * You can store log files in any bucket that you own. By default, logs are stored in the
       * bucket where the `LoggingConfiguration` property is defined.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-destinationbucketname)
       */
      override fun destinationBucketName(): String? = unwrap(this).getDestinationBucketName()

      /**
       * A prefix for all log object keys.
       *
       * If you store log files from multiple Amazon S3 buckets in a single bucket, you can use a
       * prefix to distinguish which log files came from which bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-logfileprefix)
       */
      override fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

      /**
       * Amazon S3 key format for log objects.
       *
       * Only one format, either PartitionedPrefix or SimplePrefix, is allowed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-loggingconfiguration.html#cfn-s3-bucket-loggingconfiguration-targetobjectkeyformat)
       */
      override fun targetObjectKeyFormat(): Any? = unwrap(this).getTargetObjectKeyFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty):
          LoggingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty
    }
  }

  public interface SseKmsEncryptedObjectsProperty {
    /**
     * Specifies whether Amazon S3 replicates objects created with server-side encryption using an
     * AWS KMS key stored in AWS Key Management Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
     */
    public fun status(): String

    /**
     * A builder for [SseKmsEncryptedObjectsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Specifies whether Amazon S3 replicates objects created with server-side
       * encryption using an AWS KMS key stored in AWS Key Management Service. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.builder()

      /**
       * @param status Specifies whether Amazon S3 replicates objects created with server-side
       * encryption using an AWS KMS key stored in AWS Key Management Service. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty,
    ) : CdkObject(cdkObject), SseKmsEncryptedObjectsProperty {
      /**
       * Specifies whether Amazon S3 replicates objects created with server-side encryption using an
       * AWS KMS key stored in AWS Key Management Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html#cfn-s3-bucket-ssekmsencryptedobjects-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseKmsEncryptedObjectsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty):
          SseKmsEncryptedObjectsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseKmsEncryptedObjectsProperty):
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty
    }
  }

  public interface TieringProperty {
    /**
     * S3 Intelligent-Tiering access tier.
     *
     * See [Storage class for automatically optimizing frequently and infrequently accessed
     * objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
     * for a list of access tiers in the S3 Intelligent-Tiering storage class.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html#cfn-s3-bucket-tiering-accesstier)
     */
    public fun accessTier(): String

    /**
     * The number of consecutive days of no access after which an object will be eligible to be
     * transitioned to the corresponding tier.
     *
     * The minimum number of days specified for Archive Access tier must be at least 90 days and
     * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730 days).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html#cfn-s3-bucket-tiering-days)
     */
    public fun days(): Number

    /**
     * A builder for [TieringProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessTier S3 Intelligent-Tiering access tier. 
       * See [Storage class for automatically optimizing frequently and infrequently accessed
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
       * for a list of access tiers in the S3 Intelligent-Tiering storage class.
       */
      public fun accessTier(accessTier: String)

      /**
       * @param days The number of consecutive days of no access after which an object will be
       * eligible to be transitioned to the corresponding tier. 
       * The minimum number of days specified for Archive Access tier must be at least 90 days and
       * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730
       * days).
       */
      public fun days(days: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.TieringProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TieringProperty.builder()

      /**
       * @param accessTier S3 Intelligent-Tiering access tier. 
       * See [Storage class for automatically optimizing frequently and infrequently accessed
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
       * for a list of access tiers in the S3 Intelligent-Tiering storage class.
       */
      override fun accessTier(accessTier: String) {
        cdkBuilder.accessTier(accessTier)
      }

      /**
       * @param days The number of consecutive days of no access after which an object will be
       * eligible to be transitioned to the corresponding tier. 
       * The minimum number of days specified for Archive Access tier must be at least 90 days and
       * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730
       * days).
       */
      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TieringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TieringProperty,
    ) : CdkObject(cdkObject), TieringProperty {
      /**
       * S3 Intelligent-Tiering access tier.
       *
       * See [Storage class for automatically optimizing frequently and infrequently accessed
       * objects](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html#sc-dynamic-data-access)
       * for a list of access tiers in the S3 Intelligent-Tiering storage class.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html#cfn-s3-bucket-tiering-accesstier)
       */
      override fun accessTier(): String = unwrap(this).getAccessTier()

      /**
       * The number of consecutive days of no access after which an object will be eligible to be
       * transitioned to the corresponding tier.
       *
       * The minimum number of days specified for Archive Access tier must be at least 90 days and
       * Deep Archive Access tier must be at least 180 days. The maximum can be up to 2 years (730
       * days).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tiering.html#cfn-s3-bucket-tiering-days)
       */
      override fun days(): Number = unwrap(this).getDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TieringProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TieringProperty):
          TieringProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TieringProperty):
          software.amazon.awscdk.services.s3.CfnBucket.TieringProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.TieringProperty
    }
  }

  public interface ReplicationDestinationProperty {
    /**
     * Specify this only in a cross-account scenario (where source and destination bucket owners are
     * not the same), and you want to change replica ownership to the AWS account that owns the
     * destination bucket.
     *
     * If this is not specified in the replication configuration, the replicas are owned by same AWS
     * account that owns the source object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
     */
    public fun accessControlTranslation(): Any? = unwrap(this).getAccessControlTranslation()

    /**
     * Destination bucket owner account ID.
     *
     * In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS
     * account that owns the destination bucket by specifying the `AccessControlTranslation` property,
     * this is the account ID of the destination bucket owner. For more information, see [Cross-Region
     * Replication Additional Configuration: Change Replica
     * Owner](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr-change-owner.html) in the *Amazon S3
     * User Guide* .
     *
     * If you specify the `AccessControlTranslation` property, the `Account` property is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-account)
     */
    public fun account(): String? = unwrap(this).getAccount()

    /**
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-bucket)
     */
    public fun bucket(): String

    /**
     * Specifies encryption-related information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
     */
    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    /**
     * A container specifying replication metrics-related settings enabling replication metrics and
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-metrics)
     */
    public fun metrics(): Any? = unwrap(this).getMetrics()

    /**
     * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is
     * enabled and the time when all objects and operations on objects must be replicated.
     *
     * Must be specified together with a `Metrics` block.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-replicationtime)
     */
    public fun replicationTime(): Any? = unwrap(this).getReplicationTime()

    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     *
     * By default, Amazon S3 uses the storage class of the source object to create the object
     * replica.
     *
     * For valid values, see the `StorageClass` element of the [PUT Bucket
     * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html)
     * action in the *Amazon S3 API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-storageclass)
     */
    public fun storageClass(): String? = unwrap(this).getStorageClass()

    /**
     * A builder for [ReplicationDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      public fun accessControlTranslation(accessControlTranslation: IResolvable)

      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      public
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty)

      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f0fd1e6c656b4a291b22dd0837f285d6431d1e15f2bdd609d52114189ef58f2")
      public
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty.Builder.() -> Unit)

      /**
       * @param account Destination bucket owner account ID.
       * In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS
       * account that owns the destination bucket by specifying the `AccessControlTranslation`
       * property, this is the account ID of the destination bucket owner. For more information, see
       * [Cross-Region Replication Additional Configuration: Change Replica
       * Owner](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr-change-owner.html) in the *Amazon
       * S3 User Guide* .
       *
       * If you specify the `AccessControlTranslation` property, the `Account` property is required.
       */
      public fun account(account: String)

      /**
       * @param bucket The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
       * store the results. 
       */
      public fun bucket(bucket: String)

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdd64b31e7f3128e2d80fa01588673ecec97f66415bd872221e47f7e6930a1f7")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      public fun metrics(metrics: IResolvable)

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      public fun metrics(metrics: MetricsProperty)

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb9cb17ca4c73c9502b93aed2e3308521f5f2dd5cc66c2444139dc01f188f707")
      public fun metrics(metrics: MetricsProperty.Builder.() -> Unit)

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      public fun replicationTime(replicationTime: IResolvable)

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      public fun replicationTime(replicationTime: ReplicationTimeProperty)

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("786746b2c99329552cf2d7f244783967be8d7f83931cb236bdba5c6b08173e32")
      public fun replicationTime(replicationTime: ReplicationTimeProperty.Builder.() -> Unit)

      /**
       * @param storageClass The storage class to use when replicating objects, such as S3 Standard
       * or reduced redundancy.
       * By default, Amazon S3 uses the storage class of the source object to create the object
       * replica.
       *
       * For valid values, see the `StorageClass` element of the [PUT Bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html)
       * action in the *Amazon S3 API Reference* .
       */
      public fun storageClass(storageClass: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.builder()

      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      override fun accessControlTranslation(accessControlTranslation: IResolvable) {
        cdkBuilder.accessControlTranslation(accessControlTranslation.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      override
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty) {
        cdkBuilder.accessControlTranslation(accessControlTranslation.let(AccessControlTranslationProperty::unwrap))
      }

      /**
       * @param accessControlTranslation Specify this only in a cross-account scenario (where source
       * and destination bucket owners are not the same), and you want to change replica ownership to
       * the AWS account that owns the destination bucket.
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f0fd1e6c656b4a291b22dd0837f285d6431d1e15f2bdd609d52114189ef58f2")
      override
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty.Builder.() -> Unit):
          Unit =
          accessControlTranslation(AccessControlTranslationProperty(accessControlTranslation))

      /**
       * @param account Destination bucket owner account ID.
       * In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS
       * account that owns the destination bucket by specifying the `AccessControlTranslation`
       * property, this is the account ID of the destination bucket owner. For more information, see
       * [Cross-Region Replication Additional Configuration: Change Replica
       * Owner](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr-change-owner.html) in the *Amazon
       * S3 User Guide* .
       *
       * If you specify the `AccessControlTranslation` property, the `Account` property is required.
       */
      override fun account(account: String) {
        cdkBuilder.account(account)
      }

      /**
       * @param bucket The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to
       * store the results. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionConfiguration Specifies encryption-related information.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdd64b31e7f3128e2d80fa01588673ecec97f66415bd872221e47f7e6930a1f7")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      override fun metrics(metrics: IResolvable) {
        cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
      }

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      override fun metrics(metrics: MetricsProperty) {
        cdkBuilder.metrics(metrics.let(MetricsProperty::unwrap))
      }

      /**
       * @param metrics A container specifying replication metrics-related settings enabling
       * replication metrics and events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb9cb17ca4c73c9502b93aed2e3308521f5f2dd5cc66c2444139dc01f188f707")
      override fun metrics(metrics: MetricsProperty.Builder.() -> Unit): Unit =
          metrics(MetricsProperty(metrics))

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      override fun replicationTime(replicationTime: IResolvable) {
        cdkBuilder.replicationTime(replicationTime.let(IResolvable::unwrap))
      }

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      override fun replicationTime(replicationTime: ReplicationTimeProperty) {
        cdkBuilder.replicationTime(replicationTime.let(ReplicationTimeProperty::unwrap))
      }

      /**
       * @param replicationTime A container specifying S3 Replication Time Control (S3 RTC),
       * including whether S3 RTC is enabled and the time when all objects and operations on objects
       * must be replicated.
       * Must be specified together with a `Metrics` block.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("786746b2c99329552cf2d7f244783967be8d7f83931cb236bdba5c6b08173e32")
      override fun replicationTime(replicationTime: ReplicationTimeProperty.Builder.() -> Unit):
          Unit = replicationTime(ReplicationTimeProperty(replicationTime))

      /**
       * @param storageClass The storage class to use when replicating objects, such as S3 Standard
       * or reduced redundancy.
       * By default, Amazon S3 uses the storage class of the source object to create the object
       * replica.
       *
       * For valid values, see the `StorageClass` element of the [PUT Bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html)
       * action in the *Amazon S3 API Reference* .
       */
      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty,
    ) : CdkObject(cdkObject), ReplicationDestinationProperty {
      /**
       * Specify this only in a cross-account scenario (where source and destination bucket owners
       * are not the same), and you want to change replica ownership to the AWS account that owns the
       * destination bucket.
       *
       * If this is not specified in the replication configuration, the replicas are owned by same
       * AWS account that owns the source object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-accesscontroltranslation)
       */
      override fun accessControlTranslation(): Any? = unwrap(this).getAccessControlTranslation()

      /**
       * Destination bucket owner account ID.
       *
       * In a cross-account scenario, if you direct Amazon S3 to change replica ownership to the AWS
       * account that owns the destination bucket by specifying the `AccessControlTranslation`
       * property, this is the account ID of the destination bucket owner. For more information, see
       * [Cross-Region Replication Additional Configuration: Change Replica
       * Owner](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr-change-owner.html) in the *Amazon
       * S3 User Guide* .
       *
       * If you specify the `AccessControlTranslation` property, the `Account` property is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-account)
       */
      override fun account(): String? = unwrap(this).getAccount()

      /**
       * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * Specifies encryption-related information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-encryptionconfiguration)
       */
      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      /**
       * A container specifying replication metrics-related settings enabling replication metrics
       * and events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-metrics)
       */
      override fun metrics(): Any? = unwrap(this).getMetrics()

      /**
       * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is
       * enabled and the time when all objects and operations on objects must be replicated.
       *
       * Must be specified together with a `Metrics` block.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-replicationtime)
       */
      override fun replicationTime(): Any? = unwrap(this).getReplicationTime()

      /**
       * The storage class to use when replicating objects, such as S3 Standard or reduced
       * redundancy.
       *
       * By default, Amazon S3 uses the storage class of the source object to create the object
       * replica.
       *
       * For valid values, see the `StorageClass` element of the [PUT Bucket
       * replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html)
       * action in the *Amazon S3 API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationdestination.html#cfn-s3-bucket-replicationdestination-storageclass)
       */
      override fun storageClass(): String? = unwrap(this).getStorageClass()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty):
          ReplicationDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationDestinationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty
    }
  }

  public interface ReplicationTimeValueProperty {
    /**
     * Contains an integer specifying time in minutes.
     *
     * Valid value: 15
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes)
     */
    public fun minutes(): Number

    /**
     * A builder for [ReplicationTimeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param minutes Contains an integer specifying time in minutes. 
       * Valid value: 15
       */
      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.builder()

      /**
       * @param minutes Contains an integer specifying time in minutes. 
       * Valid value: 15
       */
      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty,
    ) : CdkObject(cdkObject), ReplicationTimeValueProperty {
      /**
       * Contains an integer specifying time in minutes.
       *
       * Valid value: 15
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtimevalue.html#cfn-s3-bucket-replicationtimevalue-minutes)
       */
      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationTimeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty):
          ReplicationTimeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationTimeValueProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty
    }
  }

  public interface ObjectLockConfigurationProperty {
    /**
     * Indicates whether this bucket has an Object Lock configuration enabled.
     *
     * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled)
     */
    public fun objectLockEnabled(): String? = unwrap(this).getObjectLockEnabled()

    /**
     * Specifies the Object Lock rule for the specified object.
     *
     * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
     * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
     * cannot specify `Days` and `Years` at the same time. For more information, see
     * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
     * and
     * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-rule)
     */
    public fun rule(): Any? = unwrap(this).getRule()

    /**
     * A builder for [ObjectLockConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
       * enabled.
       * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
       */
      public fun objectLockEnabled(objectLockEnabled: String)

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      public fun rule(rule: IResolvable)

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      public fun rule(rule: ObjectLockRuleProperty)

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21b25c7b6011ade18eab7d83ff83ce907d18fd4eeb1c69b910bacf43f6f2753f")
      public fun rule(rule: ObjectLockRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty.builder()

      /**
       * @param objectLockEnabled Indicates whether this bucket has an Object Lock configuration
       * enabled.
       * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
       */
      override fun objectLockEnabled(objectLockEnabled: String) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
      }

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      override fun rule(rule: IResolvable) {
        cdkBuilder.rule(rule.let(IResolvable::unwrap))
      }

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      override fun rule(rule: ObjectLockRuleProperty) {
        cdkBuilder.rule(rule.let(ObjectLockRuleProperty::unwrap))
      }

      /**
       * @param rule Specifies the Object Lock rule for the specified object.
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21b25c7b6011ade18eab7d83ff83ce907d18fd4eeb1c69b910bacf43f6f2753f")
      override fun rule(rule: ObjectLockRuleProperty.Builder.() -> Unit): Unit =
          rule(ObjectLockRuleProperty(rule))

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty,
    ) : CdkObject(cdkObject), ObjectLockConfigurationProperty {
      /**
       * Indicates whether this bucket has an Object Lock configuration enabled.
       *
       * Enable `ObjectLockEnabled` when you apply `ObjectLockConfiguration` to a bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-objectlockenabled)
       */
      override fun objectLockEnabled(): String? = unwrap(this).getObjectLockEnabled()

      /**
       * Specifies the Object Lock rule for the specified object.
       *
       * Enable this rule when you apply `ObjectLockConfiguration` to a bucket. If Object Lock is
       * turned on, bucket settings require both `Mode` and a period of either `Days` or `Years` . You
       * cannot specify `Days` and `Years` at the same time. For more information, see
       * [ObjectLockRule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html)
       * and
       * [DefaultRetention](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockconfiguration.html#cfn-s3-bucket-objectlockconfiguration-rule)
       */
      override fun rule(): Any? = unwrap(this).getRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ObjectLockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty):
          ObjectLockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectLockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty
    }
  }

  public interface RedirectAllRequestsToProperty {
    /**
     * Name of the host where requests are redirected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html#cfn-s3-bucket-redirectallrequeststo-hostname)
     */
    public fun hostName(): String

    /**
     * Protocol to use when redirecting requests.
     *
     * The default is the protocol that is used in the original request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html#cfn-s3-bucket-redirectallrequeststo-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * A builder for [RedirectAllRequestsToProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostName Name of the host where requests are redirected. 
       */
      public fun hostName(hostName: String)

      /**
       * @param protocol Protocol to use when redirecting requests.
       * The default is the protocol that is used in the original request.
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.builder()

      /**
       * @param hostName Name of the host where requests are redirected. 
       */
      override fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
      }

      /**
       * @param protocol Protocol to use when redirecting requests.
       * The default is the protocol that is used in the original request.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty,
    ) : CdkObject(cdkObject), RedirectAllRequestsToProperty {
      /**
       * Name of the host where requests are redirected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html#cfn-s3-bucket-redirectallrequeststo-hostname)
       */
      override fun hostName(): String = unwrap(this).getHostName()

      /**
       * Protocol to use when redirecting requests.
       *
       * The default is the protocol that is used in the original request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectallrequeststo.html#cfn-s3-bucket-redirectallrequeststo-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedirectAllRequestsToProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty):
          RedirectAllRequestsToProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedirectAllRequestsToProperty):
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty
    }
  }

  public interface RoutingRuleConditionProperty {
    /**
     * The HTTP error code when the redirect is applied.
     *
     * In the event of an error, if the error code equals this value, then the specified redirect is
     * applied.
     *
     * Required when parent element `Condition` is specified and sibling `KeyPrefixEquals` is not
     * specified. If both are specified, then both must be true for the redirect to be applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrulecondition.html#cfn-s3-bucket-routingrulecondition-httperrorcodereturnedequals)
     */
    public fun httpErrorCodeReturnedEquals(): String? =
        unwrap(this).getHttpErrorCodeReturnedEquals()

    /**
     * The object key name prefix when the redirect is applied.
     *
     * For example, to redirect requests for `ExamplePage.html` , the key prefix will be
     * `ExamplePage.html` . To redirect request for all pages with the prefix `docs/` , the key prefix
     * will be `/docs` , which identifies all objects in the docs/ folder.
     *
     * Required when the parent element `Condition` is specified and sibling
     * `HttpErrorCodeReturnedEquals` is not specified. If both conditions are specified, both must be
     * true for the redirect to be applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrulecondition.html#cfn-s3-bucket-routingrulecondition-keyprefixequals)
     */
    public fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()

    /**
     * A builder for [RoutingRuleConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
       * In the event of an error, if the error code equals this value, then the specified redirect
       * is applied.
       *
       * Required when parent element `Condition` is specified and sibling `KeyPrefixEquals` is not
       * specified. If both are specified, then both must be true for the redirect to be applied.
       */
      public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String)

      /**
       * @param keyPrefixEquals The object key name prefix when the redirect is applied.
       * For example, to redirect requests for `ExamplePage.html` , the key prefix will be
       * `ExamplePage.html` . To redirect request for all pages with the prefix `docs/` , the key
       * prefix will be `/docs` , which identifies all objects in the docs/ folder.
       *
       * Required when the parent element `Condition` is specified and sibling
       * `HttpErrorCodeReturnedEquals` is not specified. If both conditions are specified, both must be
       * true for the redirect to be applied.
       */
      public fun keyPrefixEquals(keyPrefixEquals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.builder()

      /**
       * @param httpErrorCodeReturnedEquals The HTTP error code when the redirect is applied.
       * In the event of an error, if the error code equals this value, then the specified redirect
       * is applied.
       *
       * Required when parent element `Condition` is specified and sibling `KeyPrefixEquals` is not
       * specified. If both are specified, then both must be true for the redirect to be applied.
       */
      override fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
        cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
      }

      /**
       * @param keyPrefixEquals The object key name prefix when the redirect is applied.
       * For example, to redirect requests for `ExamplePage.html` , the key prefix will be
       * `ExamplePage.html` . To redirect request for all pages with the prefix `docs/` , the key
       * prefix will be `/docs` , which identifies all objects in the docs/ folder.
       *
       * Required when the parent element `Condition` is specified and sibling
       * `HttpErrorCodeReturnedEquals` is not specified. If both conditions are specified, both must be
       * true for the redirect to be applied.
       */
      override fun keyPrefixEquals(keyPrefixEquals: String) {
        cdkBuilder.keyPrefixEquals(keyPrefixEquals)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty,
    ) : CdkObject(cdkObject), RoutingRuleConditionProperty {
      /**
       * The HTTP error code when the redirect is applied.
       *
       * In the event of an error, if the error code equals this value, then the specified redirect
       * is applied.
       *
       * Required when parent element `Condition` is specified and sibling `KeyPrefixEquals` is not
       * specified. If both are specified, then both must be true for the redirect to be applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrulecondition.html#cfn-s3-bucket-routingrulecondition-httperrorcodereturnedequals)
       */
      override fun httpErrorCodeReturnedEquals(): String? =
          unwrap(this).getHttpErrorCodeReturnedEquals()

      /**
       * The object key name prefix when the redirect is applied.
       *
       * For example, to redirect requests for `ExamplePage.html` , the key prefix will be
       * `ExamplePage.html` . To redirect request for all pages with the prefix `docs/` , the key
       * prefix will be `/docs` , which identifies all objects in the docs/ folder.
       *
       * Required when the parent element `Condition` is specified and sibling
       * `HttpErrorCodeReturnedEquals` is not specified. If both conditions are specified, both must be
       * true for the redirect to be applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrulecondition.html#cfn-s3-bucket-routingrulecondition-keyprefixequals)
       */
      override fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRuleConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty):
          RoutingRuleConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingRuleConditionProperty):
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty
    }
  }

  public interface ReplicaModificationsProperty {
    /**
     * Specifies whether Amazon S3 replicates modifications on replicas.
     *
     * *Allowed values* : `Enabled` | `Disabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicamodifications.html#cfn-s3-bucket-replicamodifications-status)
     */
    public fun status(): String

    /**
     * A builder for [ReplicaModificationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Specifies whether Amazon S3 replicates modifications on replicas. 
       * *Allowed values* : `Enabled` | `Disabled`
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.builder()

      /**
       * @param status Specifies whether Amazon S3 replicates modifications on replicas. 
       * *Allowed values* : `Enabled` | `Disabled`
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty,
    ) : CdkObject(cdkObject), ReplicaModificationsProperty {
      /**
       * Specifies whether Amazon S3 replicates modifications on replicas.
       *
       * *Allowed values* : `Enabled` | `Disabled`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicamodifications.html#cfn-s3-bucket-replicamodifications-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaModificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty):
          ReplicaModificationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaModificationsProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty
    }
  }

  public interface BucketEncryptionProperty {
    /**
     * Specifies the default server-side-encryption configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
     */
    public fun serverSideEncryptionConfiguration(): Any

    /**
     * A builder for [BucketEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>)

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.builder()

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override
          fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
      }

      /**
       * @param serverSideEncryptionConfiguration Specifies the default server-side-encryption
       * configuration. 
       */
      override fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any):
          Unit = serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty,
    ) : CdkObject(cdkObject), BucketEncryptionProperty {
      /**
       * Specifies the default server-side-encryption configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration)
       */
      override fun serverSideEncryptionConfiguration(): Any =
          unwrap(this).getServerSideEncryptionConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BucketEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty):
          BucketEncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketEncryptionProperty):
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty
    }
  }

  public interface RoutingRuleProperty {
    /**
     * Container for redirect information.
     *
     * You can redirect requests to another host, to another page, or with another protocol. In the
     * event of an error, you can specify a different error code to return.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrule.html#cfn-s3-bucket-routingrule-redirectrule)
     */
    public fun redirectRule(): Any

    /**
     * A container for describing a condition that must be met for the specified redirect to apply.
     *
     * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
     * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
     * might process the error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrule.html#cfn-s3-bucket-routingrule-routingrulecondition)
     */
    public fun routingRuleCondition(): Any? = unwrap(this).getRoutingRuleCondition()

    /**
     * A builder for [RoutingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      public fun redirectRule(redirectRule: IResolvable)

      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      public fun redirectRule(redirectRule: RedirectRuleProperty)

      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b20fa399030f82be653532e47bf2933cb20d980a22e9b33eda18a0219c3f5355")
      public fun redirectRule(redirectRule: RedirectRuleProperty.Builder.() -> Unit)

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      public fun routingRuleCondition(routingRuleCondition: IResolvable)

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      public fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty)

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adc3832cde4e8c41ab9275613006ea5d986364af5c6047e7ae72a4312de08179")
      public
          fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.builder()

      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      override fun redirectRule(redirectRule: IResolvable) {
        cdkBuilder.redirectRule(redirectRule.let(IResolvable::unwrap))
      }

      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      override fun redirectRule(redirectRule: RedirectRuleProperty) {
        cdkBuilder.redirectRule(redirectRule.let(RedirectRuleProperty::unwrap))
      }

      /**
       * @param redirectRule Container for redirect information. 
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b20fa399030f82be653532e47bf2933cb20d980a22e9b33eda18a0219c3f5355")
      override fun redirectRule(redirectRule: RedirectRuleProperty.Builder.() -> Unit): Unit =
          redirectRule(RedirectRuleProperty(redirectRule))

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      override fun routingRuleCondition(routingRuleCondition: IResolvable) {
        cdkBuilder.routingRuleCondition(routingRuleCondition.let(IResolvable::unwrap))
      }

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      override fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty) {
        cdkBuilder.routingRuleCondition(routingRuleCondition.let(RoutingRuleConditionProperty::unwrap))
      }

      /**
       * @param routingRuleCondition A container for describing a condition that must be met for the
       * specified redirect to apply.
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adc3832cde4e8c41ab9275613006ea5d986364af5c6047e7ae72a4312de08179")
      override
          fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty.Builder.() -> Unit):
          Unit = routingRuleCondition(RoutingRuleConditionProperty(routingRuleCondition))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty,
    ) : CdkObject(cdkObject), RoutingRuleProperty {
      /**
       * Container for redirect information.
       *
       * You can redirect requests to another host, to another page, or with another protocol. In
       * the event of an error, you can specify a different error code to return.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrule.html#cfn-s3-bucket-routingrule-redirectrule)
       */
      override fun redirectRule(): Any = unwrap(this).getRedirectRule()

      /**
       * A container for describing a condition that must be met for the specified redirect to
       * apply.
       *
       * For example, 1. If request is for pages in the `/docs` folder, redirect to the `/documents`
       * folder. 2. If request results in HTTP error 4xx, redirect request to another host where you
       * might process the error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-routingrule.html#cfn-s3-bucket-routingrule-routingrulecondition)
       */
      override fun routingRuleCondition(): Any? = unwrap(this).getRoutingRuleCondition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty):
          RoutingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty
    }
  }

  public interface TopicConfigurationProperty {
    /**
     * The Amazon S3 bucket event about which to send notifications.
     *
     * For more information, see [Supported Event
     * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon S3
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-event)
     */
    public fun event(): String

    /**
     * The filtering rules that determine for which objects to send notifications.
     *
     * For example, you can create a filter so that Amazon S3 sends notifications only when image
     * files with a `.jpg` extension are added to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message
     * when it detects events of the specified type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-topic)
     */
    public fun topic(): String

    /**
     * A builder for [TopicConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param event The Amazon S3 bucket event about which to send notifications. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      public fun event(event: String)

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      public fun filter(filter: NotificationFilterProperty)

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ca033737da5c4ac822f9882a1f39a52b425121d6a5a01e536c0bff49bbfb2")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      /**
       * @param topic The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3
       * publishes a message when it detects events of the specified type. 
       */
      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.builder()

      /**
       * @param event The Amazon S3 bucket event about which to send notifications. 
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       */
      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      /**
       * @param filter The filtering rules that determine for which objects to send notifications.
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ca033737da5c4ac822f9882a1f39a52b425121d6a5a01e536c0bff49bbfb2")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

      /**
       * @param topic The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3
       * publishes a message when it detects events of the specified type. 
       */
      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty,
    ) : CdkObject(cdkObject), TopicConfigurationProperty {
      /**
       * The Amazon S3 bucket event about which to send notifications.
       *
       * For more information, see [Supported Event
       * Types](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the *Amazon
       * S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-event)
       */
      override fun event(): String = unwrap(this).getEvent()

      /**
       * The filtering rules that determine for which objects to send notifications.
       *
       * For example, you can create a filter so that Amazon S3 sends notifications only when image
       * files with a `.jpg` extension are added to the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a
       * message when it detects events of the specified type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-topicconfiguration.html#cfn-s3-bucket-topicconfiguration-topic)
       */
      override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty):
          TopicConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty
    }
  }

  public interface EncryptionConfigurationProperty {
    /**
     * Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS Key
     * Management Service (KMS) for the destination bucket.
     *
     * Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric
     * encryption KMS keys. For more information, see [Asymmetric keys in AWS
     * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
     * *AWS Key Management Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
     */
    public fun replicaKmsKeyId(): String

    /**
     * A builder for [EncryptionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replicaKmsKeyId Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS
       * KMS key stored in AWS Key Management Service (KMS) for the destination bucket. 
       * Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric
       * encryption KMS keys. For more information, see [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       */
      public fun replicaKmsKeyId(replicaKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.builder()

      /**
       * @param replicaKmsKeyId Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS
       * KMS key stored in AWS Key Management Service (KMS) for the destination bucket. 
       * Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric
       * encryption KMS keys. For more information, see [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       */
      override fun replicaKmsKeyId(replicaKmsKeyId: String) {
        cdkBuilder.replicaKmsKeyId(replicaKmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      /**
       * Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS KMS key stored in AWS
       * Key Management Service (KMS) for the destination bucket.
       *
       * Amazon S3 uses this key to encrypt replica objects. Amazon S3 only supports symmetric
       * encryption KMS keys. For more information, see [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html#cfn-s3-bucket-encryptionconfiguration-replicakmskeyid)
       */
      override fun replicaKmsKeyId(): String = unwrap(this).getReplicaKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty
    }
  }

  public interface RedirectRuleProperty {
    /**
     * The host name to use in the redirect request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-hostname)
     */
    public fun hostName(): String? = unwrap(this).getHostName()

    /**
     * The HTTP redirect code to use on the response.
     *
     * Not required if one of the siblings is present.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-httpredirectcode)
     */
    public fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

    /**
     * Protocol to use when redirecting requests.
     *
     * The default is the protocol that is used in the original request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The object key prefix to use in the redirect request.
     *
     * For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/`
     * folder) to `documents/` , you can set a condition block with `KeyPrefixEquals` set to `docs/`
     * and in the Redirect set `ReplaceKeyPrefixWith` to `/documents` . Not required if one of the
     * siblings is present. Can be present only if `ReplaceKeyWith` is not provided.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-replacekeyprefixwith)
     */
    public fun replaceKeyPrefixWith(): String? = unwrap(this).getReplaceKeyPrefixWith()

    /**
     * The specific object key to use in the redirect request.
     *
     * For example, redirect request to `error.html` . Not required if one of the siblings is
     * present. Can be present only if `ReplaceKeyPrefixWith` is not provided.
     *
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see [XML related object key
     * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-replacekeywith)
     */
    public fun replaceKeyWith(): String? = unwrap(this).getReplaceKeyWith()

    /**
     * A builder for [RedirectRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hostName The host name to use in the redirect request.
       */
      public fun hostName(hostName: String)

      /**
       * @param httpRedirectCode The HTTP redirect code to use on the response.
       * Not required if one of the siblings is present.
       */
      public fun httpRedirectCode(httpRedirectCode: String)

      /**
       * @param protocol Protocol to use when redirecting requests.
       * The default is the protocol that is used in the original request.
       */
      public fun protocol(protocol: String)

      /**
       * @param replaceKeyPrefixWith The object key prefix to use in the redirect request.
       * For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/`
       * folder) to `documents/` , you can set a condition block with `KeyPrefixEquals` set to `docs/`
       * and in the Redirect set `ReplaceKeyPrefixWith` to `/documents` . Not required if one of the
       * siblings is present. Can be present only if `ReplaceKeyWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun replaceKeyPrefixWith(replaceKeyPrefixWith: String)

      /**
       * @param replaceKeyWith The specific object key to use in the redirect request.
       * For example, redirect request to `error.html` . Not required if one of the siblings is
       * present. Can be present only if `ReplaceKeyPrefixWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      public fun replaceKeyWith(replaceKeyWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.builder()

      /**
       * @param hostName The host name to use in the redirect request.
       */
      override fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
      }

      /**
       * @param httpRedirectCode The HTTP redirect code to use on the response.
       * Not required if one of the siblings is present.
       */
      override fun httpRedirectCode(httpRedirectCode: String) {
        cdkBuilder.httpRedirectCode(httpRedirectCode)
      }

      /**
       * @param protocol Protocol to use when redirecting requests.
       * The default is the protocol that is used in the original request.
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param replaceKeyPrefixWith The object key prefix to use in the redirect request.
       * For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/`
       * folder) to `documents/` , you can set a condition block with `KeyPrefixEquals` set to `docs/`
       * and in the Redirect set `ReplaceKeyPrefixWith` to `/documents` . Not required if one of the
       * siblings is present. Can be present only if `ReplaceKeyWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun replaceKeyPrefixWith(replaceKeyPrefixWith: String) {
        cdkBuilder.replaceKeyPrefixWith(replaceKeyPrefixWith)
      }

      /**
       * @param replaceKeyWith The specific object key to use in the redirect request.
       * For example, redirect request to `error.html` . Not required if one of the siblings is
       * present. Can be present only if `ReplaceKeyPrefixWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       */
      override fun replaceKeyWith(replaceKeyWith: String) {
        cdkBuilder.replaceKeyWith(replaceKeyWith)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty,
    ) : CdkObject(cdkObject), RedirectRuleProperty {
      /**
       * The host name to use in the redirect request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-hostname)
       */
      override fun hostName(): String? = unwrap(this).getHostName()

      /**
       * The HTTP redirect code to use on the response.
       *
       * Not required if one of the siblings is present.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-httpredirectcode)
       */
      override fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

      /**
       * Protocol to use when redirecting requests.
       *
       * The default is the protocol that is used in the original request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The object key prefix to use in the redirect request.
       *
       * For example, to redirect requests for all pages with prefix `docs/` (objects in the `docs/`
       * folder) to `documents/` , you can set a condition block with `KeyPrefixEquals` set to `docs/`
       * and in the Redirect set `ReplaceKeyPrefixWith` to `/documents` . Not required if one of the
       * siblings is present. Can be present only if `ReplaceKeyWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-replacekeyprefixwith)
       */
      override fun replaceKeyPrefixWith(): String? = unwrap(this).getReplaceKeyPrefixWith()

      /**
       * The specific object key to use in the redirect request.
       *
       * For example, redirect request to `error.html` . Not required if one of the siblings is
       * present. Can be present only if `ReplaceKeyPrefixWith` is not provided.
       *
       *
       * Replacement must be made for object keys containing special characters (such as carriage
       * returns) when using XML requests. For more information, see [XML related object key
       * constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-redirectrule.html#cfn-s3-bucket-redirectrule-replacekeywith)
       */
      override fun replaceKeyWith(): String? = unwrap(this).getReplaceKeyWith()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedirectRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty):
          RedirectRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedirectRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty
    }
  }

  public interface AnalyticsConfigurationProperty {
    /**
     * The ID that identifies the analytics configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
     */
    public fun id(): String

    /**
     * The prefix that an object must have to be included in the analytics results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Contains data related to access patterns to be collected and made available to analyze the
     * tradeoffs between different storage classes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
     */
    public fun storageClassAnalysis(): Any

    /**
     * The tags to use when evaluating an analytics filter.
     *
     * The analytics only includes objects that meet the filter's criteria. If no filter is
     * specified, all of the contents of the bucket are included in the analysis.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
     */
    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    /**
     * A builder for [AnalyticsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID that identifies the analytics configuration. 
       */
      public fun id(id: String)

      /**
       * @param prefix The prefix that an object must have to be included in the analytics results.
       */
      public fun prefix(prefix: String)

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      public fun storageClassAnalysis(storageClassAnalysis: IResolvable)

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      public fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty)

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4392adb244bd5d9c51e9ceed83e47fb610720fbfb0accbff6826dcab1c2a1d93")
      public
          fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty.Builder.() -> Unit)

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      public fun tagFilters(tagFilters: IResolvable)

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      public fun tagFilters(tagFilters: List<Any>)

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.builder()

      /**
       * @param id The ID that identifies the analytics configuration. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param prefix The prefix that an object must have to be included in the analytics results.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      override fun storageClassAnalysis(storageClassAnalysis: IResolvable) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis.let(IResolvable::unwrap))
      }

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      override fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis.let(StorageClassAnalysisProperty::unwrap))
      }

      /**
       * @param storageClassAnalysis Contains data related to access patterns to be collected and
       * made available to analyze the tradeoffs between different storage classes. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4392adb244bd5d9c51e9ceed83e47fb610720fbfb0accbff6826dcab1c2a1d93")
      override
          fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty.Builder.() -> Unit):
          Unit = storageClassAnalysis(StorageClassAnalysisProperty(storageClassAnalysis))

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      /**
       * @param tagFilters The tags to use when evaluating an analytics filter.
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       */
      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty,
    ) : CdkObject(cdkObject), AnalyticsConfigurationProperty {
      /**
       * The ID that identifies the analytics configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The prefix that an object must have to be included in the analytics results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * Contains data related to access patterns to be collected and made available to analyze the
       * tradeoffs between different storage classes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-storageclassanalysis)
       */
      override fun storageClassAnalysis(): Any = unwrap(this).getStorageClassAnalysis()

      /**
       * The tags to use when evaluating an analytics filter.
       *
       * The analytics only includes objects that meet the filter's criteria. If no filter is
       * specified, all of the contents of the bucket are included in the analysis.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html#cfn-s3-bucket-analyticsconfiguration-tagfilters)
       */
      override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalyticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty):
          AnalyticsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalyticsConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty
    }
  }

  public interface StorageClassAnalysisProperty {
    /**
     * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be
     * exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
     */
    public fun dataExport(): Any? = unwrap(this).getDataExport()

    /**
     * A builder for [StorageClassAnalysisProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      public fun dataExport(dataExport: IResolvable)

      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      public fun dataExport(dataExport: DataExportProperty)

      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f331577f07d7810827fd428792c5b312b3a1c12158deb71bd460ca54357bc7f")
      public fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.builder()

      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      override fun dataExport(dataExport: IResolvable) {
        cdkBuilder.dataExport(dataExport.let(IResolvable::unwrap))
      }

      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      override fun dataExport(dataExport: DataExportProperty) {
        cdkBuilder.dataExport(dataExport.let(DataExportProperty::unwrap))
      }

      /**
       * @param dataExport Specifies how data related to the storage class analysis for an Amazon S3
       * bucket should be exported.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f331577f07d7810827fd428792c5b312b3a1c12158deb71bd460ca54357bc7f")
      override fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit): Unit =
          dataExport(DataExportProperty(dataExport))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty,
    ) : CdkObject(cdkObject), StorageClassAnalysisProperty {
      /**
       * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be
       * exported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html#cfn-s3-bucket-storageclassanalysis-dataexport)
       */
      override fun dataExport(): Any? = unwrap(this).getDataExport()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageClassAnalysisProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty):
          StorageClassAnalysisProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageClassAnalysisProperty):
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty
    }
  }

  public interface ReplicationTimeProperty {
    /**
     * Specifies whether the replication time is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html#cfn-s3-bucket-replicationtime-status)
     */
    public fun status(): String

    /**
     * A container specifying the time by which replication should be complete for all objects and
     * operations on objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html#cfn-s3-bucket-replicationtime-time)
     */
    public fun time(): Any

    /**
     * A builder for [ReplicationTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status Specifies whether the replication time is enabled. 
       */
      public fun status(status: String)

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      public fun time(time: IResolvable)

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      public fun time(time: ReplicationTimeValueProperty)

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fda56a0e2edcbab43a51001a03760cca5375f6f5aeaa83ddb6f9f5db9e0f1c5")
      public fun time(time: ReplicationTimeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.builder()

      /**
       * @param status Specifies whether the replication time is enabled. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      override fun time(time: IResolvable) {
        cdkBuilder.time(time.let(IResolvable::unwrap))
      }

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      override fun time(time: ReplicationTimeValueProperty) {
        cdkBuilder.time(time.let(ReplicationTimeValueProperty::unwrap))
      }

      /**
       * @param time A container specifying the time by which replication should be complete for all
       * objects and operations on objects. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fda56a0e2edcbab43a51001a03760cca5375f6f5aeaa83ddb6f9f5db9e0f1c5")
      override fun time(time: ReplicationTimeValueProperty.Builder.() -> Unit): Unit =
          time(ReplicationTimeValueProperty(time))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty,
    ) : CdkObject(cdkObject), ReplicationTimeProperty {
      /**
       * Specifies whether the replication time is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html#cfn-s3-bucket-replicationtime-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * A container specifying the time by which replication should be complete for all objects and
       * operations on objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html#cfn-s3-bucket-replicationtime-time)
       */
      override fun time(): Any = unwrap(this).getTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty):
          ReplicationTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationTimeProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty
    }
  }

  public interface FilterRuleProperty {
    /**
     * The object key name prefix or suffix identifying one or more objects to which the filtering
     * rule applies.
     *
     * The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not supported.
     * For more information, see [Configuring Event
     * Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the
     * *Amazon S3 User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html#cfn-s3-bucket-filterrule-name)
     */
    public fun name(): String

    /**
     * The value that the filter searches for in object key names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html#cfn-s3-bucket-filterrule-value)
     */
    public fun `value`(): String

    /**
     * A builder for [FilterRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The object key name prefix or suffix identifying one or more objects to which
       * the filtering rule applies. 
       * The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not
       * supported. For more information, see [Configuring Event
       * Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the
       * *Amazon S3 User Guide* .
       */
      public fun name(name: String)

      /**
       * @param value The value that the filter searches for in object key names. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.builder()

      /**
       * @param name The object key name prefix or suffix identifying one or more objects to which
       * the filtering rule applies. 
       * The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not
       * supported. For more information, see [Configuring Event
       * Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the
       * *Amazon S3 User Guide* .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value that the filter searches for in object key names. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty,
    ) : CdkObject(cdkObject), FilterRuleProperty {
      /**
       * The object key name prefix or suffix identifying one or more objects to which the filtering
       * rule applies.
       *
       * The maximum length is 1,024 characters. Overlapping prefixes and suffixes are not
       * supported. For more information, see [Configuring Event
       * Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html) in the
       * *Amazon S3 User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html#cfn-s3-bucket-filterrule-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value that the filter searches for in object key names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html#cfn-s3-bucket-filterrule-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty):
          FilterRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty
    }
  }

  public interface CorsConfigurationProperty {
    /**
     * A set of origins and methods (cross-origin access that you want to allow).
     *
     * You can add up to 100 rules to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsconfiguration.html#cfn-s3-bucket-corsconfiguration-corsrules)
     */
    public fun corsRules(): Any

    /**
     * A builder for [CorsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      public fun corsRules(corsRules: IResolvable)

      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      public fun corsRules(corsRules: List<Any>)

      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      public fun corsRules(vararg corsRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.builder()

      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      override fun corsRules(corsRules: IResolvable) {
        cdkBuilder.corsRules(corsRules.let(IResolvable::unwrap))
      }

      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      override fun corsRules(corsRules: List<Any>) {
        cdkBuilder.corsRules(corsRules)
      }

      /**
       * @param corsRules A set of origins and methods (cross-origin access that you want to allow).
       * 
       * You can add up to 100 rules to the configuration.
       */
      override fun corsRules(vararg corsRules: Any): Unit = corsRules(corsRules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty,
    ) : CdkObject(cdkObject), CorsConfigurationProperty {
      /**
       * A set of origins and methods (cross-origin access that you want to allow).
       *
       * You can add up to 100 rules to the configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-corsconfiguration.html#cfn-s3-bucket-corsconfiguration-corsrules)
       */
      override fun corsRules(): Any = unwrap(this).getCorsRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty):
          CorsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty
    }
  }

  public interface DefaultRetentionProperty {
    /**
     * The number of days that you want to specify for the default retention period.
     *
     * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-days)
     */
    public fun days(): Number? = unwrap(this).getDays()

    /**
     * The default Object Lock retention mode you want to apply to new objects placed in the
     * specified bucket.
     *
     * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * The number of years that you want to specify for the default retention period.
     *
     * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-years)
     */
    public fun years(): Number? = unwrap(this).getYears()

    /**
     * A builder for [DefaultRetentionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param days The number of days that you want to specify for the default retention period.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      public fun days(days: Number)

      /**
       * @param mode The default Object Lock retention mode you want to apply to new objects placed
       * in the specified bucket.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      public fun mode(mode: String)

      /**
       * @param years The number of years that you want to specify for the default retention period.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      public fun years(years: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty.builder()

      /**
       * @param days The number of days that you want to specify for the default retention period.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      /**
       * @param mode The default Object Lock retention mode you want to apply to new objects placed
       * in the specified bucket.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param years The number of years that you want to specify for the default retention period.
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       */
      override fun years(years: Number) {
        cdkBuilder.years(years)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty,
    ) : CdkObject(cdkObject), DefaultRetentionProperty {
      /**
       * The number of days that you want to specify for the default retention period.
       *
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-days)
       */
      override fun days(): Number? = unwrap(this).getDays()

      /**
       * The default Object Lock retention mode you want to apply to new objects placed in the
       * specified bucket.
       *
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * The number of years that you want to specify for the default retention period.
       *
       * If Object Lock is turned on, you must specify `Mode` and specify either `Days` or `Years` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html#cfn-s3-bucket-defaultretention-years)
       */
      override fun years(): Number? = unwrap(this).getYears()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultRetentionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty):
          DefaultRetentionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultRetentionProperty):
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty
    }
  }

  public interface PublicAccessBlockConfigurationProperty {
    /**
     * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket
     * and objects in this bucket.
     *
     * Setting this element to `TRUE` causes the following behavior:
     *
     * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     *
     * Enabling this setting doesn't affect existing policies or ACLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls)
     */
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    /**
     * Specifies whether Amazon S3 should block public bucket policies for this bucket.
     *
     * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
     * specified bucket policy allows public access.
     *
     * Enabling this setting doesn't affect existing bucket policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy)
     */
    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    /**
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this
     * bucket.
     *
     * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket and
     * objects in this bucket.
     *
     * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent
     * new public ACLs from being set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls)
     */
    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    /**
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     *
     * Setting this element to `TRUE` restricts access to this bucket to only AWS service principals
     * and authorized users within this account if the bucket has a public policy.
     *
     * Enabling this setting doesn't affect previously stored bucket policies, except that public
     * and cross-account access within any public bucket policy, including non-public delegation to
     * specific accounts, is blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets)
     */
    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    /**
     * A builder for [PublicAccessBlockConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.builder()

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      /**
       * @param blockPublicAcls Specifies whether Amazon S3 should block public access control lists
       * (ACLs) for this bucket and objects in this bucket.
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       */
      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      /**
       * @param blockPublicPolicy Specifies whether Amazon S3 should block public bucket policies
       * for this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       */
      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      /**
       * @param ignorePublicAcls Specifies whether Amazon S3 should ignore public ACLs for this
       * bucket and objects in this bucket.
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       */
      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      /**
       * @param restrictPublicBuckets Specifies whether Amazon S3 should restrict public bucket
       * policies for this bucket.
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       */
      override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty,
    ) : CdkObject(cdkObject), PublicAccessBlockConfigurationProperty {
      /**
       * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket
       * and objects in this bucket.
       *
       * Setting this element to `TRUE` causes the following behavior:
       *
       * * PUT Bucket ACL and PUT Object ACL calls fail if the specified ACL is public.
       * * PUT Object calls fail if the request includes a public ACL.
       * * PUT Bucket calls fail if the request includes a public ACL.
       *
       * Enabling this setting doesn't affect existing policies or ACLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicacls)
       */
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      /**
       * Specifies whether Amazon S3 should block public bucket policies for this bucket.
       *
       * Setting this element to `TRUE` causes Amazon S3 to reject calls to PUT Bucket policy if the
       * specified bucket policy allows public access.
       *
       * Enabling this setting doesn't affect existing bucket policies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-blockpublicpolicy)
       */
      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      /**
       * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this
       * bucket.
       *
       * Setting this element to `TRUE` causes Amazon S3 to ignore all public ACLs on this bucket
       * and objects in this bucket.
       *
       * Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't
       * prevent new public ACLs from being set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-ignorepublicacls)
       */
      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      /**
       * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
       *
       * Setting this element to `TRUE` restricts access to this bucket to only AWS service
       * principals and authorized users within this account if the bucket has a public policy.
       *
       * Enabling this setting doesn't affect previously stored bucket policies, except that public
       * and cross-account access within any public bucket policy, including non-public delegation to
       * specific accounts, is blocked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html#cfn-s3-bucket-publicaccessblockconfiguration-restrictpublicbuckets)
       */
      override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicAccessBlockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty
    }
  }

  public interface ServerSideEncryptionRuleProperty {
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using KMS
     * (SSE-KMS) for new objects in the bucket.
     *
     * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
     * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
     *
     * For more information, see [Amazon S3 Bucket
     * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-bucketkeyenabled)
     */
    public fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

    /**
     * Specifies the default server-side encryption to apply to new objects in the bucket.
     *
     * If a PUT Object request doesn't specify any server-side encryption, this default encryption
     * will be applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
     */
    public fun serverSideEncryptionByDefault(): Any? =
        unwrap(this).getServerSideEncryptionByDefault()

    /**
     * A builder for [ServerSideEncryptionRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
       * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
       * Guide* .
       */
      public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
       * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
       * Guide* .
       */
      public fun bucketKeyEnabled(bucketKeyEnabled: IResolvable)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty)

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1cc3a3985bc5ef3c27b6a476bc09f94be774da6009a8f583a2aff83a95d926d")
      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.builder()

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
       * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
       * Guide* .
       */
      override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
      }

      /**
       * @param bucketKeyEnabled Specifies whether Amazon S3 should use an S3 Bucket Key with
       * server-side encryption using KMS (SSE-KMS) for new objects in the bucket.
       * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
       * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
       * Guide* .
       */
      override fun bucketKeyEnabled(bucketKeyEnabled: IResolvable) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      override fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(IResolvable::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      override
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(ServerSideEncryptionByDefaultProperty::unwrap))
      }

      /**
       * @param serverSideEncryptionByDefault Specifies the default server-side encryption to apply
       * to new objects in the bucket.
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1cc3a3985bc5ef3c27b6a476bc09f94be774da6009a8f583a2aff83a95d926d")
      override
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty.Builder.() -> Unit):
          Unit =
          serverSideEncryptionByDefault(ServerSideEncryptionByDefaultProperty(serverSideEncryptionByDefault))

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionRuleProperty {
      /**
       * Specifies whether Amazon S3 should use an S3 Bucket Key with server-side encryption using
       * KMS (SSE-KMS) for new objects in the bucket.
       *
       * Existing objects are not affected. Setting the `BucketKeyEnabled` element to `true` causes
       * Amazon S3 to use an S3 Bucket Key. By default, S3 Bucket Key is not enabled.
       *
       * For more information, see [Amazon S3 Bucket
       * Keys](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-key.html) in the *Amazon S3 User
       * Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-bucketkeyenabled)
       */
      override fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

      /**
       * Specifies the default server-side encryption to apply to new objects in the bucket.
       *
       * If a PUT Object request doesn't specify any server-side encryption, this default encryption
       * will be applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html#cfn-s3-bucket-serversideencryptionrule-serversideencryptionbydefault)
       */
      override fun serverSideEncryptionByDefault(): Any? =
          unwrap(this).getServerSideEncryptionByDefault()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerSideEncryptionRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty):
          ServerSideEncryptionRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty
    }
  }

  public interface OwnershipControlsRuleProperty {
    /**
     * Specifies an object ownership rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrolsrule.html#cfn-s3-bucket-ownershipcontrolsrule-objectownership)
     */
    public fun objectOwnership(): String? = unwrap(this).getObjectOwnership()

    /**
     * A builder for [OwnershipControlsRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param objectOwnership Specifies an object ownership rule.
       */
      public fun objectOwnership(objectOwnership: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty.builder()

      /**
       * @param objectOwnership Specifies an object ownership rule.
       */
      override fun objectOwnership(objectOwnership: String) {
        cdkBuilder.objectOwnership(objectOwnership)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty,
    ) : CdkObject(cdkObject), OwnershipControlsRuleProperty {
      /**
       * Specifies an object ownership rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ownershipcontrolsrule.html#cfn-s3-bucket-ownershipcontrolsrule-objectownership)
       */
      override fun objectOwnership(): String? = unwrap(this).getObjectOwnership()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OwnershipControlsRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty):
          OwnershipControlsRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OwnershipControlsRuleProperty):
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty
    }
  }

  public interface ServerSideEncryptionByDefaultProperty {
    /**
     * AWS Key Management Service (KMS) customer AWS KMS key ID to use for the default encryption.
     *
     * This parameter is allowed if and only if `SSEAlgorithm` is set to `aws:kms` or `aws:kms:dsse`
     * .
     *
     * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the KMS key.
     *
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key Alias: `alias/alias-name`
     *
     * If you use a key ID, you can run into a LogDestination undeliverable error when creating a
     * VPC flow log.
     *
     * If you are using encryption with cross-account or AWS service operations you must use a fully
     * qualified KMS key ARN. For more information, see [Using encryption for cross-account
     * operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
     * .
     *
     *
     * Amazon S3 only supports symmetric encryption KMS keys. For more information, see [Asymmetric
     * keys in AWS
     * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
     * *AWS Key Management Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
     */
    public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    /**
     * Server-side encryption algorithm to use for the default encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
     */
    public fun sseAlgorithm(): String

    /**
     * A builder for [ServerSideEncryptionByDefaultProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsMasterKeyId AWS Key Management Service (KMS) customer AWS KMS key ID to use for
       * the default encryption.
       * This parameter is allowed if and only if `SSEAlgorithm` is set to `aws:kms` or
       * `aws:kms:dsse` .
       *
       * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key Alias: `alias/alias-name`
       *
       * If you use a key ID, you can run into a LogDestination undeliverable error when creating a
       * VPC flow log.
       *
       * If you are using encryption with cross-account or AWS service operations you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Amazon S3 only supports symmetric encryption KMS keys. For more information, see
       * [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       */
      public fun kmsMasterKeyId(kmsMasterKeyId: String)

      /**
       * @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. 
       */
      public fun sseAlgorithm(sseAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.builder()

      /**
       * @param kmsMasterKeyId AWS Key Management Service (KMS) customer AWS KMS key ID to use for
       * the default encryption.
       * This parameter is allowed if and only if `SSEAlgorithm` is set to `aws:kms` or
       * `aws:kms:dsse` .
       *
       * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key Alias: `alias/alias-name`
       *
       * If you use a key ID, you can run into a LogDestination undeliverable error when creating a
       * VPC flow log.
       *
       * If you are using encryption with cross-account or AWS service operations you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Amazon S3 only supports symmetric encryption KMS keys. For more information, see
       * [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       */
      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

      /**
       * @param sseAlgorithm Server-side encryption algorithm to use for the default encryption. 
       */
      override fun sseAlgorithm(sseAlgorithm: String) {
        cdkBuilder.sseAlgorithm(sseAlgorithm)
      }

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionByDefaultProperty {
      /**
       * AWS Key Management Service (KMS) customer AWS KMS key ID to use for the default encryption.
       *
       * This parameter is allowed if and only if `SSEAlgorithm` is set to `aws:kms` or
       * `aws:kms:dsse` .
       *
       * You can specify the key ID, key alias, or the Amazon Resource Name (ARN) of the KMS key.
       *
       * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key ARN: `arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
       * * Key Alias: `alias/alias-name`
       *
       * If you use a key ID, you can run into a LogDestination undeliverable error when creating a
       * VPC flow log.
       *
       * If you are using encryption with cross-account or AWS service operations you must use a
       * fully qualified KMS key ARN. For more information, see [Using encryption for cross-account
       * operations](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy)
       * .
       *
       *
       * Amazon S3 only supports symmetric encryption KMS keys. For more information, see
       * [Asymmetric keys in AWS
       * KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html) in the
       * *AWS Key Management Service Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-kmsmasterkeyid)
       */
      override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

      /**
       * Server-side encryption algorithm to use for the default encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html#cfn-s3-bucket-serversideencryptionbydefault-ssealgorithm)
       */
      override fun sseAlgorithm(): String = unwrap(this).getSseAlgorithm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionByDefaultProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty):
          ServerSideEncryptionByDefaultProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionByDefaultProperty):
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty
    }
  }
}
