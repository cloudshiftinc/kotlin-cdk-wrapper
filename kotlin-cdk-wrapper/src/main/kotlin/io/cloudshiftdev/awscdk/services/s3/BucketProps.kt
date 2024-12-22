@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * Key myKmsKey = new Key(this, "myKMSKey");
 * Bucket myBucket = Bucket.Builder.create(this, "mySSEKMSEncryptedBucket")
 * .encryption(BucketEncryption.KMS)
 * .encryptionKey(myKmsKey)
 * .objectOwnership(ObjectOwnership.BUCKET_OWNER_ENFORCED)
 * .build();
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(S3BucketOrigin.withOriginAccessControl(myBucket))
 * .build())
 * .build();
 * ```
 */
public interface BucketProps {
  /**
   * Specifies a canned ACL that grants predefined permissions to the bucket.
   *
   * Default: BucketAccessControl.PRIVATE
   */
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  /**
   * Whether all objects should be automatically deleted when the bucket is removed from the stack
   * or when the stack is deleted.
   *
   * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
   *
   * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`,
   * switching this to `false` in a CDK version *before* `1.126.0` will lead to
   * all objects in the bucket being deleted. Be sure to update your bucket resources
   * by deploying with CDK version `1.126.0` or later **before** switching this value to `false`.
   *
   * Setting `autoDeleteObjects` to true on a bucket will add `s3:PutBucketPolicy` to the
   * bucket policy. This is because during bucket deletion, the custom resource provider
   * needs to update the bucket policy by adding a deny policy for `s3:PutObject` to
   * prevent race conditions with external bucket writers.
   *
   * Default: false
   */
  public fun autoDeleteObjects(): Boolean? = unwrap(this).getAutoDeleteObjects()

  /**
   * The block public access configuration of this bucket.
   *
   * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
   * access, but users can modify bucket policies or object permissions to allow public access
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
   */
  public fun blockPublicAccess(): BlockPublicAccess? =
      unwrap(this).getBlockPublicAccess()?.let(BlockPublicAccess::wrap)

  /**
   * Whether Amazon S3 should use its own intermediary key to generate data keys.
   *
   * Only relevant when using KMS for encryption.
   *
   * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
   * attendant cost implications of that).
   * * If enabled, S3 will use its own time-limited key instead.
   *
   * Only relevant, when Encryption is not set to `BucketEncryption.UNENCRYPTED`.
   *
   * Default: - false
   */
  public fun bucketKeyEnabled(): Boolean? = unwrap(this).getBucketKeyEnabled()

  /**
   * Physical name of this bucket.
   *
   * Default: - Assigned by CloudFormation (recommended).
   */
  public fun bucketName(): String? = unwrap(this).getBucketName()

  /**
   * The CORS configuration of this bucket.
   *
   * Default: - No CORS configuration.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
   */
  public fun cors(): List<CorsRule> = unwrap(this).getCors()?.map(CorsRule::wrap) ?: emptyList()

  /**
   * The kind of server-side encryption to apply to this bucket.
   *
   * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
   * encryption key is not specified, a key will automatically be created.
   *
   * Default: - `KMS` if `encryptionKey` is specified, or `UNENCRYPTED` otherwise.
   * But if `UNENCRYPTED` is specified, the bucket will be encrypted as `S3_MANAGED` automatically.
   */
  public fun encryption(): BucketEncryption? =
      unwrap(this).getEncryption()?.let(BucketEncryption::wrap)

  /**
   * External KMS key to use for bucket encryption.
   *
   * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
   * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
   *
   * Default: - If `encryption` is set to `KMS` and this property is undefined,
   * a new KMS key will be created and associated with this bucket.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Enforces SSL for requests.
   *
   * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-ssl-requests-only.html)
   */
  public fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

  /**
   * Whether this bucket should send notifications to Amazon EventBridge or not.
   *
   * Default: false
   */
  public fun eventBridgeEnabled(): Boolean? = unwrap(this).getEventBridgeEnabled()

  /**
   * Inteligent Tiering Configurations.
   *
   * Default: No Intelligent Tiiering Configurations.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
   */
  public fun intelligentTieringConfigurations(): List<IntelligentTieringConfiguration> =
      unwrap(this).getIntelligentTieringConfigurations()?.map(IntelligentTieringConfiguration::wrap)
      ?: emptyList()

  /**
   * The inventory configuration of the bucket.
   *
   * Default: - No inventory configuration
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
   */
  public fun inventories(): List<Inventory> = unwrap(this).getInventories()?.map(Inventory::wrap) ?:
      emptyList()

  /**
   * Rules that define how Amazon S3 manages objects during their lifetime.
   *
   * Default: - No lifecycle rules.
   */
  public fun lifecycleRules(): List<LifecycleRule> =
      unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  /**
   * The metrics configuration of this bucket.
   *
   * Default: - No metrics configuration.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
   */
  public fun metrics(): List<BucketMetrics> = unwrap(this).getMetrics()?.map(BucketMetrics::wrap) ?:
      emptyList()

  /**
   * Enforces minimum TLS version for requests.
   *
   * Requires `enforceSSL` to be enabled.
   *
   * Default: No minimum TLS version is enforced.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/amazon-s3-policy-keys.html#example-object-tls-version)
   */
  public fun minimumTLSVersion(): Number? = unwrap(this).getMinimumTLSVersion()

  /**
   * The role to be used by the notifications handler.
   *
   * Default: - a new role will be created.
   */
  public fun notificationsHandlerRole(): IRole? =
      unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

  /**
   * Skips notification validation of Amazon SQS, Amazon SNS, and Lambda destinations.
   *
   * Default: false
   */
  public fun notificationsSkipDestinationValidation(): Boolean? =
      unwrap(this).getNotificationsSkipDestinationValidation()

  /**
   * The default retention mode and rules for S3 Object Lock.
   *
   * Default retention can be configured after a bucket is created if the bucket already
   * has object lock enabled. Enabling object lock for existing buckets is not supported.
   *
   * Default: no default retention period
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
   */
  public fun objectLockDefaultRetention(): ObjectLockRetention? =
      unwrap(this).getObjectLockDefaultRetention()?.let(ObjectLockRetention::wrap)

  /**
   * Enable object lock on the bucket.
   *
   * Enabling object lock for existing buckets is not supported. Object lock must be
   * enabled when the bucket is created.
   *
   * Default: false, unless objectLockDefaultRetention is set (then, true)
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
   */
  public fun objectLockEnabled(): Boolean? = unwrap(this).getObjectLockEnabled()

  /**
   * The objectOwnership of the bucket.
   *
   * Default: - No ObjectOwnership configuration. By default, Amazon S3 sets Object Ownership to
   * `Bucket owner enforced`.
   * This means ACLs are disabled and the bucket owner will own every object.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html)
   */
  public fun objectOwnership(): ObjectOwnership? =
      unwrap(this).getObjectOwnership()?.let(ObjectOwnership::wrap)

  /**
   * Grants public read access to all objects in the bucket.
   *
   * Similar to calling `bucket.grantPublicAccess()`
   *
   * Default: false
   */
  public fun publicReadAccess(): Boolean? = unwrap(this).getPublicReadAccess()

  /**
   * Policy to apply when the bucket is removed from this stack.
   *
   * Default: - The bucket will be orphaned.
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * Destination bucket for the server access logs.
   *
   * Default: - If "serverAccessLogsPrefix" undefined - access logs disabled, otherwise - log to
   * current bucket.
   */
  public fun serverAccessLogsBucket(): IBucket? =
      unwrap(this).getServerAccessLogsBucket()?.let(IBucket::wrap)

  /**
   * Optional log file prefix to use for the bucket's access logs.
   *
   * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
   * prefix.
   *
   * Default: - No log file prefix
   */
  public fun serverAccessLogsPrefix(): String? = unwrap(this).getServerAccessLogsPrefix()

  /**
   * Optional key format for log objects.
   *
   * Default: - the default key format is:
   * [DestinationPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]
   */
  public fun targetObjectKeyFormat(): TargetObjectKeyFormat? =
      unwrap(this).getTargetObjectKeyFormat()?.let(TargetObjectKeyFormat::wrap)

  /**
   * Whether this bucket should have transfer acceleration turned on or not.
   *
   * Default: false
   */
  public fun transferAcceleration(): Boolean? = unwrap(this).getTransferAcceleration()

  /**
   * Indicates which default minimum object size behavior is applied to the lifecycle configuration.
   *
   * To customize the minimum object size for any transition you can add a filter that specifies a
   * custom
   * `objectSizeGreaterThan` or `objectSizeLessThan` for `lifecycleRules` property. Custom filters
   * always
   * take precedence over the default transition behavior.
   *
   * Default: - TransitionDefaultMinimumObjectSize.VARIES_BY_STORAGE_CLASS before September 2024,
   * otherwise TransitionDefaultMinimumObjectSize.ALL_STORAGE_CLASSES_128_K.
   */
  public fun transitionDefaultMinimumObjectSize(): TransitionDefaultMinimumObjectSize? =
      unwrap(this).getTransitionDefaultMinimumObjectSize()?.let(TransitionDefaultMinimumObjectSize::wrap)

  /**
   * Whether this bucket should have versioning turned on or not.
   *
   * Default: false (unless object lock is enabled, then true)
   */
  public fun versioned(): Boolean? = unwrap(this).getVersioned()

  /**
   * The name of the error document (e.g. "404.html") for the website. `websiteIndexDocument` must
   * also be set if this is set.
   *
   * Default: - No error document.
   */
  public fun websiteErrorDocument(): String? = unwrap(this).getWebsiteErrorDocument()

  /**
   * The name of the index document (e.g. "index.html") for the website. Enables static website
   * hosting for this bucket.
   *
   * Default: - No index document.
   */
  public fun websiteIndexDocument(): String? = unwrap(this).getWebsiteIndexDocument()

  /**
   * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
   *
   * If you specify this property, you can't specify "websiteIndexDocument", "websiteErrorDocument"
   * nor , "websiteRoutingRules".
   *
   * Default: - No redirection.
   */
  public fun websiteRedirect(): RedirectTarget? =
      unwrap(this).getWebsiteRedirect()?.let(RedirectTarget::wrap)

  /**
   * Rules that define when a redirect is applied and the redirect behavior.
   *
   * Default: - No redirection rules.
   */
  public fun websiteRoutingRules(): List<RoutingRule> =
      unwrap(this).getWebsiteRoutingRules()?.map(RoutingRule::wrap) ?: emptyList()

  /**
   * A builder for [BucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     */
    public fun accessControl(accessControl: BucketAccessControl)

    /**
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     * is removed from the stack or when the stack is deleted.
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`,
     * switching this to `false` in a CDK version *before* `1.126.0` will lead to
     * all objects in the bucket being deleted. Be sure to update your bucket resources
     * by deploying with CDK version `1.126.0` or later **before** switching this value to `false`.
     *
     * Setting `autoDeleteObjects` to true on a bucket will add `s3:PutBucketPolicy` to the
     * bucket policy. This is because during bucket deletion, the custom resource provider
     * needs to update the bucket policy by adding a deny policy for `s3:PutObject` to
     * prevent race conditions with external bucket writers.
     */
    public fun autoDeleteObjects(autoDeleteObjects: Boolean)

    /**
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess)

    /**
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb69d9132809f1e47dfffab558fb74be50e3cfdab2cd08fe8db89967fc9239c")
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit)

    /**
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     * data keys.
     * Only relevant when using KMS for encryption.
     *
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
     * attendant cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is not set to `BucketEncryption.UNENCRYPTED`.
     */
    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

    /**
     * @param bucketName Physical name of this bucket.
     */
    public fun bucketName(bucketName: String)

    /**
     * @param cors The CORS configuration of this bucket.
     */
    public fun cors(cors: List<CorsRule>)

    /**
     * @param cors The CORS configuration of this bucket.
     */
    public fun cors(vararg cors: CorsRule)

    /**
     * @param encryption The kind of server-side encryption to apply to this bucket.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     */
    public fun encryption(encryption: BucketEncryption)

    /**
     * @param encryptionKey External KMS key to use for bucket encryption.
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
     * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * @param enforceSsl Enforces SSL for requests.
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     * or not.
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    /**
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    public
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>)

    /**
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    public fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration)

    /**
     * @param inventories The inventory configuration of the bucket.
     */
    public fun inventories(inventories: List<Inventory>)

    /**
     * @param inventories The inventory configuration of the bucket.
     */
    public fun inventories(vararg inventories: Inventory)

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    /**
     * @param metrics The metrics configuration of this bucket.
     */
    public fun metrics(metrics: List<BucketMetrics>)

    /**
     * @param metrics The metrics configuration of this bucket.
     */
    public fun metrics(vararg metrics: BucketMetrics)

    /**
     * @param minimumTlsVersion Enforces minimum TLS version for requests.
     * Requires `enforceSSL` to be enabled.
     */
    public fun minimumTlsVersion(minimumTlsVersion: Number)

    /**
     * @param notificationsHandlerRole The role to be used by the notifications handler.
     */
    public fun notificationsHandlerRole(notificationsHandlerRole: IRole)

    /**
     * @param notificationsSkipDestinationValidation Skips notification validation of Amazon SQS,
     * Amazon SNS, and Lambda destinations.
     */
    public
        fun notificationsSkipDestinationValidation(notificationsSkipDestinationValidation: Boolean)

    /**
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock.
     * Default retention can be configured after a bucket is created if the bucket already
     * has object lock enabled. Enabling object lock for existing buckets is not supported.
     */
    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention)

    /**
     * @param objectLockEnabled Enable object lock on the bucket.
     * Enabling object lock for existing buckets is not supported. Object lock must be
     * enabled when the bucket is created.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean)

    /**
     * @param objectOwnership The objectOwnership of the bucket.
     */
    public fun objectOwnership(objectOwnership: ObjectOwnership)

    /**
     * @param publicReadAccess Grants public read access to all objects in the bucket.
     * Similar to calling `bucket.grantPublicAccess()`
     */
    public fun publicReadAccess(publicReadAccess: Boolean)

    /**
     * @param removalPolicy Policy to apply when the bucket is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param serverAccessLogsBucket Destination bucket for the server access logs.
     */
    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket)

    /**
     * @param serverAccessLogsPrefix Optional log file prefix to use for the bucket's access logs.
     * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
     * prefix.
     */
    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String)

    /**
     * @param targetObjectKeyFormat Optional key format for log objects.
     */
    public fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat)

    /**
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     * or not.
     */
    public fun transferAcceleration(transferAcceleration: Boolean)

    /**
     * @param transitionDefaultMinimumObjectSize Indicates which default minimum object size
     * behavior is applied to the lifecycle configuration.
     * To customize the minimum object size for any transition you can add a filter that specifies a
     * custom
     * `objectSizeGreaterThan` or `objectSizeLessThan` for `lifecycleRules` property. Custom filters
     * always
     * take precedence over the default transition behavior.
     */
    public
        fun transitionDefaultMinimumObjectSize(transitionDefaultMinimumObjectSize: TransitionDefaultMinimumObjectSize)

    /**
     * @param versioned Whether this bucket should have versioning turned on or not.
     */
    public fun versioned(versioned: Boolean)

    /**
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     * `websiteIndexDocument` must also be set if this is set.
     */
    public fun websiteErrorDocument(websiteErrorDocument: String)

    /**
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     * website. Enables static website hosting for this bucket.
     */
    public fun websiteIndexDocument(websiteIndexDocument: String)

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket.
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    public fun websiteRedirect(websiteRedirect: RedirectTarget)

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket.
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("731db56a93d98ee1f678fdfde7317760df5d9d8a99f364dbc7959cca7b0bf980")
    public fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit)

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior.
     */
    public fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>)

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior.
     */
    public fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketProps.Builder =
        software.amazon.awscdk.services.s3.BucketProps.builder()

    /**
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl.Companion::unwrap))
    }

    /**
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     * is removed from the stack or when the stack is deleted.
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`,
     * switching this to `false` in a CDK version *before* `1.126.0` will lead to
     * all objects in the bucket being deleted. Be sure to update your bucket resources
     * by deploying with CDK version `1.126.0` or later **before** switching this value to `false`.
     *
     * Setting `autoDeleteObjects` to true on a bucket will add `s3:PutBucketPolicy` to the
     * bucket policy. This is because during bucket deletion, the custom resource provider
     * needs to update the bucket policy by adding a deny policy for `s3:PutObject` to
     * prevent race conditions with external bucket writers.
     */
    override fun autoDeleteObjects(autoDeleteObjects: Boolean) {
      cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    /**
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
      cdkBuilder.blockPublicAccess(blockPublicAccess.let(BlockPublicAccess.Companion::unwrap))
    }

    /**
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb69d9132809f1e47dfffab558fb74be50e3cfdab2cd08fe8db89967fc9239c")
    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit): Unit =
        blockPublicAccess(BlockPublicAccess(blockPublicAccess))

    /**
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     * data keys.
     * Only relevant when using KMS for encryption.
     *
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
     * attendant cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is not set to `BucketEncryption.UNENCRYPTED`.
     */
    override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
      cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    /**
     * @param bucketName Physical name of this bucket.
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param cors The CORS configuration of this bucket.
     */
    override fun cors(cors: List<CorsRule>) {
      cdkBuilder.cors(cors.map(CorsRule.Companion::unwrap))
    }

    /**
     * @param cors The CORS configuration of this bucket.
     */
    override fun cors(vararg cors: CorsRule): Unit = cors(cors.toList())

    /**
     * @param encryption The kind of server-side encryption to apply to this bucket.
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     */
    override fun encryption(encryption: BucketEncryption) {
      cdkBuilder.encryption(encryption.let(BucketEncryption.Companion::unwrap))
    }

    /**
     * @param encryptionKey External KMS key to use for bucket encryption.
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
     * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param enforceSsl Enforces SSL for requests.
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     * or not.
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /**
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    override
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.map(IntelligentTieringConfiguration.Companion::unwrap))
    }

    /**
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    override fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration): Unit =
        intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    /**
     * @param inventories The inventory configuration of the bucket.
     */
    override fun inventories(inventories: List<Inventory>) {
      cdkBuilder.inventories(inventories.map(Inventory.Companion::unwrap))
    }

    /**
     * @param inventories The inventory configuration of the bucket.
     */
    override fun inventories(vararg inventories: Inventory): Unit =
        inventories(inventories.toList())

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule.Companion::unwrap))
    }

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    /**
     * @param metrics The metrics configuration of this bucket.
     */
    override fun metrics(metrics: List<BucketMetrics>) {
      cdkBuilder.metrics(metrics.map(BucketMetrics.Companion::unwrap))
    }

    /**
     * @param metrics The metrics configuration of this bucket.
     */
    override fun metrics(vararg metrics: BucketMetrics): Unit = metrics(metrics.toList())

    /**
     * @param minimumTlsVersion Enforces minimum TLS version for requests.
     * Requires `enforceSSL` to be enabled.
     */
    override fun minimumTlsVersion(minimumTlsVersion: Number) {
      cdkBuilder.minimumTlsVersion(minimumTlsVersion)
    }

    /**
     * @param notificationsHandlerRole The role to be used by the notifications handler.
     */
    override fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
      cdkBuilder.notificationsHandlerRole(notificationsHandlerRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param notificationsSkipDestinationValidation Skips notification validation of Amazon SQS,
     * Amazon SNS, and Lambda destinations.
     */
    override
        fun notificationsSkipDestinationValidation(notificationsSkipDestinationValidation: Boolean) {
      cdkBuilder.notificationsSkipDestinationValidation(notificationsSkipDestinationValidation)
    }

    /**
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock.
     * Default retention can be configured after a bucket is created if the bucket already
     * has object lock enabled. Enabling object lock for existing buckets is not supported.
     */
    override fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
      cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention.let(ObjectLockRetention.Companion::unwrap))
    }

    /**
     * @param objectLockEnabled Enable object lock on the bucket.
     * Enabling object lock for existing buckets is not supported. Object lock must be
     * enabled when the bucket is created.
     */
    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * @param objectOwnership The objectOwnership of the bucket.
     */
    override fun objectOwnership(objectOwnership: ObjectOwnership) {
      cdkBuilder.objectOwnership(objectOwnership.let(ObjectOwnership.Companion::unwrap))
    }

    /**
     * @param publicReadAccess Grants public read access to all objects in the bucket.
     * Similar to calling `bucket.grantPublicAccess()`
     */
    override fun publicReadAccess(publicReadAccess: Boolean) {
      cdkBuilder.publicReadAccess(publicReadAccess)
    }

    /**
     * @param removalPolicy Policy to apply when the bucket is removed from this stack.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * @param serverAccessLogsBucket Destination bucket for the server access logs.
     */
    override fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
      cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket.let(IBucket.Companion::unwrap))
    }

    /**
     * @param serverAccessLogsPrefix Optional log file prefix to use for the bucket's access logs.
     * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
     * prefix.
     */
    override fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
      cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    /**
     * @param targetObjectKeyFormat Optional key format for log objects.
     */
    override fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat) {
      cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(TargetObjectKeyFormat.Companion::unwrap))
    }

    /**
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     * or not.
     */
    override fun transferAcceleration(transferAcceleration: Boolean) {
      cdkBuilder.transferAcceleration(transferAcceleration)
    }

    /**
     * @param transitionDefaultMinimumObjectSize Indicates which default minimum object size
     * behavior is applied to the lifecycle configuration.
     * To customize the minimum object size for any transition you can add a filter that specifies a
     * custom
     * `objectSizeGreaterThan` or `objectSizeLessThan` for `lifecycleRules` property. Custom filters
     * always
     * take precedence over the default transition behavior.
     */
    override
        fun transitionDefaultMinimumObjectSize(transitionDefaultMinimumObjectSize: TransitionDefaultMinimumObjectSize) {
      cdkBuilder.transitionDefaultMinimumObjectSize(transitionDefaultMinimumObjectSize.let(TransitionDefaultMinimumObjectSize.Companion::unwrap))
    }

    /**
     * @param versioned Whether this bucket should have versioning turned on or not.
     */
    override fun versioned(versioned: Boolean) {
      cdkBuilder.versioned(versioned)
    }

    /**
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     * `websiteIndexDocument` must also be set if this is set.
     */
    override fun websiteErrorDocument(websiteErrorDocument: String) {
      cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    /**
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     * website. Enables static website hosting for this bucket.
     */
    override fun websiteIndexDocument(websiteIndexDocument: String) {
      cdkBuilder.websiteIndexDocument(websiteIndexDocument)
    }

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket.
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    override fun websiteRedirect(websiteRedirect: RedirectTarget) {
      cdkBuilder.websiteRedirect(websiteRedirect.let(RedirectTarget.Companion::unwrap))
    }

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket.
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("731db56a93d98ee1f678fdfde7317760df5d9d8a99f364dbc7959cca7b0bf980")
    override fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit): Unit =
        websiteRedirect(RedirectTarget(websiteRedirect))

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior.
     */
    override fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>) {
      cdkBuilder.websiteRoutingRules(websiteRoutingRules.map(RoutingRule.Companion::unwrap))
    }

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior.
     */
    override fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule): Unit =
        websiteRoutingRules(websiteRoutingRules.toList())

    public fun build(): software.amazon.awscdk.services.s3.BucketProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.s3.BucketProps,
  ) : CdkObject(cdkObject),
      BucketProps {
    /**
     * Specifies a canned ACL that grants predefined permissions to the bucket.
     *
     * Default: BucketAccessControl.PRIVATE
     */
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    /**
     * Whether all objects should be automatically deleted when the bucket is removed from the stack
     * or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`,
     * switching this to `false` in a CDK version *before* `1.126.0` will lead to
     * all objects in the bucket being deleted. Be sure to update your bucket resources
     * by deploying with CDK version `1.126.0` or later **before** switching this value to `false`.
     *
     * Setting `autoDeleteObjects` to true on a bucket will add `s3:PutBucketPolicy` to the
     * bucket policy. This is because during bucket deletion, the custom resource provider
     * needs to update the bucket policy by adding a deny policy for `s3:PutObject` to
     * prevent race conditions with external bucket writers.
     *
     * Default: false
     */
    override fun autoDeleteObjects(): Boolean? = unwrap(this).getAutoDeleteObjects()

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     */
    override fun blockPublicAccess(): BlockPublicAccess? =
        unwrap(this).getBlockPublicAccess()?.let(BlockPublicAccess::wrap)

    /**
     * Whether Amazon S3 should use its own intermediary key to generate data keys.
     *
     * Only relevant when using KMS for encryption.
     *
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
     * attendant cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is not set to `BucketEncryption.UNENCRYPTED`.
     *
     * Default: - false
     */
    override fun bucketKeyEnabled(): Boolean? = unwrap(this).getBucketKeyEnabled()

    /**
     * Physical name of this bucket.
     *
     * Default: - Assigned by CloudFormation (recommended).
     */
    override fun bucketName(): String? = unwrap(this).getBucketName()

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     */
    override fun cors(): List<CorsRule> = unwrap(this).getCors()?.map(CorsRule::wrap) ?: emptyList()

    /**
     * The kind of server-side encryption to apply to this bucket.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `UNENCRYPTED` otherwise.
     * But if `UNENCRYPTED` is specified, the bucket will be encrypted as `S3_MANAGED`
     * automatically.
     */
    override fun encryption(): BucketEncryption? =
        unwrap(this).getEncryption()?.let(BucketEncryption::wrap)

    /**
     * External KMS key to use for bucket encryption.
     *
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
     * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     *
     * Default: - If `encryption` is set to `KMS` and this property is undefined,
     * a new KMS key will be created and associated with this bucket.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * Enforces SSL for requests.
     *
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-ssl-requests-only.html)
     */
    override fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

    /**
     * Whether this bucket should send notifications to Amazon EventBridge or not.
     *
     * Default: false
     */
    override fun eventBridgeEnabled(): Boolean? = unwrap(this).getEventBridgeEnabled()

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     */
    override fun intelligentTieringConfigurations(): List<IntelligentTieringConfiguration> =
        unwrap(this).getIntelligentTieringConfigurations()?.map(IntelligentTieringConfiguration::wrap)
        ?: emptyList()

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     */
    override fun inventories(): List<Inventory> =
        unwrap(this).getInventories()?.map(Inventory::wrap) ?: emptyList()

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     */
    override fun lifecycleRules(): List<LifecycleRule> =
        unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     */
    override fun metrics(): List<BucketMetrics> =
        unwrap(this).getMetrics()?.map(BucketMetrics::wrap) ?: emptyList()

    /**
     * Enforces minimum TLS version for requests.
     *
     * Requires `enforceSSL` to be enabled.
     *
     * Default: No minimum TLS version is enforced.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/amazon-s3-policy-keys.html#example-object-tls-version)
     */
    override fun minimumTLSVersion(): Number? = unwrap(this).getMinimumTLSVersion()

    /**
     * The role to be used by the notifications handler.
     *
     * Default: - a new role will be created.
     */
    override fun notificationsHandlerRole(): IRole? =
        unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

    /**
     * Skips notification validation of Amazon SQS, Amazon SNS, and Lambda destinations.
     *
     * Default: false
     */
    override fun notificationsSkipDestinationValidation(): Boolean? =
        unwrap(this).getNotificationsSkipDestinationValidation()

    /**
     * The default retention mode and rules for S3 Object Lock.
     *
     * Default retention can be configured after a bucket is created if the bucket already
     * has object lock enabled. Enabling object lock for existing buckets is not supported.
     *
     * Default: no default retention period
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     */
    override fun objectLockDefaultRetention(): ObjectLockRetention? =
        unwrap(this).getObjectLockDefaultRetention()?.let(ObjectLockRetention::wrap)

    /**
     * Enable object lock on the bucket.
     *
     * Enabling object lock for existing buckets is not supported. Object lock must be
     * enabled when the bucket is created.
     *
     * Default: false, unless objectLockDefaultRetention is set (then, true)
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     */
    override fun objectLockEnabled(): Boolean? = unwrap(this).getObjectLockEnabled()

    /**
     * The objectOwnership of the bucket.
     *
     * Default: - No ObjectOwnership configuration. By default, Amazon S3 sets Object Ownership to
     * `Bucket owner enforced`.
     * This means ACLs are disabled and the bucket owner will own every object.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html)
     */
    override fun objectOwnership(): ObjectOwnership? =
        unwrap(this).getObjectOwnership()?.let(ObjectOwnership::wrap)

    /**
     * Grants public read access to all objects in the bucket.
     *
     * Similar to calling `bucket.grantPublicAccess()`
     *
     * Default: false
     */
    override fun publicReadAccess(): Boolean? = unwrap(this).getPublicReadAccess()

    /**
     * Policy to apply when the bucket is removed from this stack.
     *
     * Default: - The bucket will be orphaned.
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * Destination bucket for the server access logs.
     *
     * Default: - If "serverAccessLogsPrefix" undefined - access logs disabled, otherwise - log to
     * current bucket.
     */
    override fun serverAccessLogsBucket(): IBucket? =
        unwrap(this).getServerAccessLogsBucket()?.let(IBucket::wrap)

    /**
     * Optional log file prefix to use for the bucket's access logs.
     *
     * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
     * prefix.
     *
     * Default: - No log file prefix
     */
    override fun serverAccessLogsPrefix(): String? = unwrap(this).getServerAccessLogsPrefix()

    /**
     * Optional key format for log objects.
     *
     * Default: - the default key format is:
     * [DestinationPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]
     */
    override fun targetObjectKeyFormat(): TargetObjectKeyFormat? =
        unwrap(this).getTargetObjectKeyFormat()?.let(TargetObjectKeyFormat::wrap)

    /**
     * Whether this bucket should have transfer acceleration turned on or not.
     *
     * Default: false
     */
    override fun transferAcceleration(): Boolean? = unwrap(this).getTransferAcceleration()

    /**
     * Indicates which default minimum object size behavior is applied to the lifecycle
     * configuration.
     *
     * To customize the minimum object size for any transition you can add a filter that specifies a
     * custom
     * `objectSizeGreaterThan` or `objectSizeLessThan` for `lifecycleRules` property. Custom filters
     * always
     * take precedence over the default transition behavior.
     *
     * Default: - TransitionDefaultMinimumObjectSize.VARIES_BY_STORAGE_CLASS before September 2024,
     * otherwise TransitionDefaultMinimumObjectSize.ALL_STORAGE_CLASSES_128_K.
     */
    override fun transitionDefaultMinimumObjectSize(): TransitionDefaultMinimumObjectSize? =
        unwrap(this).getTransitionDefaultMinimumObjectSize()?.let(TransitionDefaultMinimumObjectSize::wrap)

    /**
     * Whether this bucket should have versioning turned on or not.
     *
     * Default: false (unless object lock is enabled, then true)
     */
    override fun versioned(): Boolean? = unwrap(this).getVersioned()

    /**
     * The name of the error document (e.g. "404.html") for the website. `websiteIndexDocument` must
     * also be set if this is set.
     *
     * Default: - No error document.
     */
    override fun websiteErrorDocument(): String? = unwrap(this).getWebsiteErrorDocument()

    /**
     * The name of the index document (e.g. "index.html") for the website. Enables static website
     * hosting for this bucket.
     *
     * Default: - No index document.
     */
    override fun websiteIndexDocument(): String? = unwrap(this).getWebsiteIndexDocument()

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
     *
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     *
     * Default: - No redirection.
     */
    override fun websiteRedirect(): RedirectTarget? =
        unwrap(this).getWebsiteRedirect()?.let(RedirectTarget::wrap)

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     */
    override fun websiteRoutingRules(): List<RoutingRule> =
        unwrap(this).getWebsiteRoutingRules()?.map(RoutingRule::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketProps): BucketProps =
        CdkObjectWrappers.wrap(cdkObject) as? BucketProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketProps): software.amazon.awscdk.services.s3.BucketProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.BucketProps
  }
}
