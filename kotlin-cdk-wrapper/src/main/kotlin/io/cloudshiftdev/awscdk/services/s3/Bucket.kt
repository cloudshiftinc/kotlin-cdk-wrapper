@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An S3 bucket with associated policy objects.
 *
 * This bucket does not yet have all features that exposed by the underlying
 * BucketResource.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.RemovalPolicy;
 * Bucket.Builder.create(scope, "Bucket")
 * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
 * .encryption(BucketEncryption.S3_MANAGED)
 * .enforceSSL(true)
 * .versioned(true)
 * .removalPolicy(RemovalPolicy.RETAIN)
 * .build();
 * ```
 */
public open class Bucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.Bucket,
) : BucketBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.s3.Bucket(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BucketProps,
  ) :
      this(software.amazon.awscdk.services.s3.Bucket(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(BucketProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: BucketProps.Builder.() -> Unit,
  ) : this(scope, id, BucketProps(props)
  )

  /**
   * Adds a cross-origin access configuration for objects in an Amazon S3 bucket.
   *
   * @param rule The CORS configuration rule to add. 
   */
  public open fun addCorsRule(rule: CorsRule) {
    unwrap(this).addCorsRule(rule.let(CorsRule::unwrap))
  }

  /**
   * Adds a cross-origin access configuration for objects in an Amazon S3 bucket.
   *
   * @param rule The CORS configuration rule to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c39a6daf2fce73cbe5cdcda55c988569d082067a227f6637635733848d5cc6f")
  public open fun addCorsRule(rule: CorsRule.Builder.() -> Unit): Unit = addCorsRule(CorsRule(rule))

  /**
   * Add an inventory configuration.
   *
   * @param inventory configuration to add. 
   */
  public open fun addInventory(inventory: Inventory) {
    unwrap(this).addInventory(inventory.let(Inventory::unwrap))
  }

  /**
   * Add an inventory configuration.
   *
   * @param inventory configuration to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74dbc5c60a3fd9a56d374f483b0a1ee149bd0b0667023283257bbc05716366eb")
  public open fun addInventory(inventory: Inventory.Builder.() -> Unit): Unit =
      addInventory(Inventory(inventory))

  /**
   * Add a lifecycle rule to the bucket.
   *
   * @param rule The rule to add. 
   */
  public open fun addLifecycleRule(rule: LifecycleRule) {
    unwrap(this).addLifecycleRule(rule.let(LifecycleRule::unwrap))
  }

  /**
   * Add a lifecycle rule to the bucket.
   *
   * @param rule The rule to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a2bc44a656cdbd26f8dbffb63e56bc9726b72a74d5d58052bb3fa5c22b6869f")
  public open fun addLifecycleRule(rule: LifecycleRule.Builder.() -> Unit): Unit =
      addLifecycleRule(LifecycleRule(rule))

  /**
   * Adds a metrics configuration for the CloudWatch request metrics from the bucket.
   *
   * @param metric The metric configuration to add. 
   */
  public open fun addMetric(metric: BucketMetrics) {
    unwrap(this).addMetric(metric.let(BucketMetrics::unwrap))
  }

  /**
   * Adds a metrics configuration for the CloudWatch request metrics from the bucket.
   *
   * @param metric The metric configuration to add. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("782290c8eee5cfc954c1c2babc14ae29c6624de205b47fa981b32f274a323181")
  public open fun addMetric(metric: BucketMetrics.Builder.() -> Unit): Unit =
      addMetric(BucketMetrics(metric))

  /**
   * The ARN of the bucket.
   */
  public override fun bucketArn(): String = unwrap(this).getBucketArn()

  /**
   * The IPv4 DNS name of the specified bucket.
   */
  public override fun bucketDomainName(): String = unwrap(this).getBucketDomainName()

  /**
   * The IPv6 DNS name of the specified bucket.
   */
  public override fun bucketDualStackDomainName(): String =
      unwrap(this).getBucketDualStackDomainName()

  /**
   * The name of the bucket.
   */
  public override fun bucketName(): String = unwrap(this).getBucketName()

  /**
   * The regional domain name of the specified bucket.
   */
  public override fun bucketRegionalDomainName(): String =
      unwrap(this).getBucketRegionalDomainName()

  /**
   * The Domain name of the static website.
   */
  public override fun bucketWebsiteDomainName(): String = unwrap(this).getBucketWebsiteDomainName()

  /**
   * The URL of the static website.
   */
  public override fun bucketWebsiteUrl(): String = unwrap(this).getBucketWebsiteUrl()

  /**
   * Optional KMS encryption key associated with this bucket.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * If this bucket has been configured for static website hosting.
   */
  public override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  /**
   * The resource policy associated with this bucket.
   *
   * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
   * first call to addToResourcePolicy(s).
   */
  public override fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

  /**
   * The resource policy associated with this bucket.
   *
   * If `autoCreatePolicy` is true, a `BucketPolicy` will be created upon the
   * first call to addToResourcePolicy(s).
   */
  public override fun policy(`value`: BucketPolicy) {
    unwrap(this).setPolicy(`value`.let(BucketPolicy::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3.Bucket].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies a canned ACL that grants predefined permissions to the bucket.
     *
     * Default: BucketAccessControl.PRIVATE
     *
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     * 
     */
    public fun accessControl(accessControl: BucketAccessControl)

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
     * Default: false
     *
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     * is removed from the stack or when the stack is deleted. 
     */
    public fun autoDeleteObjects(autoDeleteObjects: Boolean)

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     * @param blockPublicAccess The block public access configuration of this bucket. 
     */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess)

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     * @param blockPublicAccess The block public access configuration of this bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae01d0ba0bb2c5f41b4b7400230c6ab9304113667d092e5c1ca903318f6b380")
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit)

    /**
     * Whether Amazon S3 should use its own intermediary key to generate data keys.
     *
     * Only relevant when using KMS for encryption.
     *
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
     * attendant cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is set to `BucketEncryption.KMS` or
     * `BucketEncryption.KMS_MANAGED`.
     *
     * Default: - false
     *
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     * data keys. 
     */
    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

    /**
     * Physical name of this bucket.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param bucketName Physical name of this bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     * @param cors The CORS configuration of this bucket. 
     */
    public fun cors(cors: List<CorsRule>)

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     * @param cors The CORS configuration of this bucket. 
     */
    public fun cors(vararg cors: CorsRule)

    /**
     * The kind of server-side encryption to apply to this bucket.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `UNENCRYPTED` otherwise.
     * But if `UNENCRYPTED` is specified, the bucket will be encrypted as `S3_MANAGED`
     * automatically.
     *
     * @param encryption The kind of server-side encryption to apply to this bucket. 
     */
    public fun encryption(encryption: BucketEncryption)

    /**
     * External KMS key to use for bucket encryption.
     *
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
     * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     *
     * Default: - If `encryption` is set to `KMS` and this property is undefined,
     * a new KMS key will be created and associated with this bucket.
     *
     * @param encryptionKey External KMS key to use for bucket encryption. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * Enforces SSL for requests.
     *
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-ssl-requests-only.html)
     * @param enforceSsl Enforces SSL for requests. 
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * Whether this bucket should send notifications to Amazon EventBridge or not.
     *
     * Default: false
     *
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     * or not. 
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations. 
     */
    public
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>)

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations. 
     */
    public fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration)

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     * @param inventories The inventory configuration of the bucket. 
     */
    public fun inventories(inventories: List<Inventory>)

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     * @param inventories The inventory configuration of the bucket. 
     */
    public fun inventories(vararg inventories: Inventory)

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime. 
     */
    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime. 
     */
    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     * @param metrics The metrics configuration of this bucket. 
     */
    public fun metrics(metrics: List<BucketMetrics>)

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     * @param metrics The metrics configuration of this bucket. 
     */
    public fun metrics(vararg metrics: BucketMetrics)

    /**
     * Enforces minimum TLS version for requests.
     *
     * Requires `enforceSSL` to be enabled.
     *
     * Default: No minimum TLS version is enforced.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/amazon-s3-policy-keys.html#example-object-tls-version)
     * @param minimumTlsVersion Enforces minimum TLS version for requests. 
     */
    public fun minimumTlsVersion(minimumTlsVersion: Number)

    /**
     * The role to be used by the notifications handler.
     *
     * Default: - a new role will be created.
     *
     * @param notificationsHandlerRole The role to be used by the notifications handler. 
     */
    public fun notificationsHandlerRole(notificationsHandlerRole: IRole)

    /**
     * The default retention mode and rules for S3 Object Lock.
     *
     * Default retention can be configured after a bucket is created if the bucket already
     * has object lock enabled. Enabling object lock for existing buckets is not supported.
     *
     * Default: no default retention period
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock. 
     */
    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention)

    /**
     * Enable object lock on the bucket.
     *
     * Enabling object lock for existing buckets is not supported. Object lock must be
     * enabled when the bucket is created.
     *
     * Default: false, unless objectLockDefaultRetention is set (then, true)
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     * @param objectLockEnabled Enable object lock on the bucket. 
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean)

    /**
     * The objectOwnership of the bucket.
     *
     * Default: - No ObjectOwnership configuration, uploading account will own the object.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html)
     * @param objectOwnership The objectOwnership of the bucket. 
     */
    public fun objectOwnership(objectOwnership: ObjectOwnership)

    /**
     * Grants public read access to all objects in the bucket.
     *
     * Similar to calling `bucket.grantPublicAccess()`
     *
     * Default: false
     *
     * @param publicReadAccess Grants public read access to all objects in the bucket. 
     */
    public fun publicReadAccess(publicReadAccess: Boolean)

    /**
     * Policy to apply when the bucket is removed from this stack.
     *
     * Default: - The bucket will be orphaned.
     *
     * @param removalPolicy Policy to apply when the bucket is removed from this stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * Destination bucket for the server access logs.
     *
     * Default: - If "serverAccessLogsPrefix" undefined - access logs disabled, otherwise - log to
     * current bucket.
     *
     * @param serverAccessLogsBucket Destination bucket for the server access logs. 
     */
    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket)

    /**
     * Optional log file prefix to use for the bucket's access logs.
     *
     * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
     * prefix.
     *
     * Default: - No log file prefix
     *
     * @param serverAccessLogsPrefix Optional log file prefix to use for the bucket's access logs. 
     */
    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String)

    /**
     * Optional key format for log objects.
     *
     * Default: - the default key format is:
     * [DestinationPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]
     *
     * @param targetObjectKeyFormat Optional key format for log objects. 
     */
    public fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat)

    /**
     * Whether this bucket should have transfer acceleration turned on or not.
     *
     * Default: false
     *
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     * or not. 
     */
    public fun transferAcceleration(transferAcceleration: Boolean)

    /**
     * Whether this bucket should have versioning turned on or not.
     *
     * Default: false (unless object lock is enabled, then true)
     *
     * @param versioned Whether this bucket should have versioning turned on or not. 
     */
    public fun versioned(versioned: Boolean)

    /**
     * The name of the error document (e.g. "404.html") for the website. `websiteIndexDocument` must
     * also be set if this is set.
     *
     * Default: - No error document.
     *
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     * `websiteIndexDocument` must also be set if this is set. 
     */
    public fun websiteErrorDocument(websiteErrorDocument: String)

    /**
     * The name of the index document (e.g. "index.html") for the website. Enables static website
     * hosting for this bucket.
     *
     * Default: - No index document.
     *
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     * website. Enables static website hosting for this bucket. 
     */
    public fun websiteIndexDocument(websiteIndexDocument: String)

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
     *
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     *
     * Default: - No redirection.
     *
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket. 
     */
    public fun websiteRedirect(websiteRedirect: RedirectTarget)

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
     *
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     *
     * Default: - No redirection.
     *
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75654fb117b3f72fb4efe559681713ee385de3941b95db8b75d27341a1e36ecd")
    public fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit)

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior. 
     */
    public fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>)

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior. 
     */
    public fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Bucket.Builder =
        software.amazon.awscdk.services.s3.Bucket.Builder.create(scope, id)

    /**
     * Specifies a canned ACL that grants predefined permissions to the bucket.
     *
     * Default: BucketAccessControl.PRIVATE
     *
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     * 
     */
    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

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
     * Default: false
     *
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     * is removed from the stack or when the stack is deleted. 
     */
    override fun autoDeleteObjects(autoDeleteObjects: Boolean) {
      cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     * @param blockPublicAccess The block public access configuration of this bucket. 
     */
    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
      cdkBuilder.blockPublicAccess(blockPublicAccess.let(BlockPublicAccess::unwrap))
    }

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     * @param blockPublicAccess The block public access configuration of this bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae01d0ba0bb2c5f41b4b7400230c6ab9304113667d092e5c1ca903318f6b380")
    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit): Unit =
        blockPublicAccess(BlockPublicAccess(blockPublicAccess))

    /**
     * Whether Amazon S3 should use its own intermediary key to generate data keys.
     *
     * Only relevant when using KMS for encryption.
     *
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the
     * attendant cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is set to `BucketEncryption.KMS` or
     * `BucketEncryption.KMS_MANAGED`.
     *
     * Default: - false
     *
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     * data keys. 
     */
    override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
      cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    /**
     * Physical name of this bucket.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param bucketName Physical name of this bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     * @param cors The CORS configuration of this bucket. 
     */
    override fun cors(cors: List<CorsRule>) {
      cdkBuilder.cors(cors.map(CorsRule::unwrap))
    }

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     * @param cors The CORS configuration of this bucket. 
     */
    override fun cors(vararg cors: CorsRule): Unit = cors(cors.toList())

    /**
     * The kind of server-side encryption to apply to this bucket.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `UNENCRYPTED` otherwise.
     * But if `UNENCRYPTED` is specified, the bucket will be encrypted as `S3_MANAGED`
     * automatically.
     *
     * @param encryption The kind of server-side encryption to apply to this bucket. 
     */
    override fun encryption(encryption: BucketEncryption) {
      cdkBuilder.encryption(encryption.let(BucketEncryption::unwrap))
    }

    /**
     * External KMS key to use for bucket encryption.
     *
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`.
     * An error will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     *
     * Default: - If `encryption` is set to `KMS` and this property is undefined,
     * a new KMS key will be created and associated with this bucket.
     *
     * @param encryptionKey External KMS key to use for bucket encryption. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * Enforces SSL for requests.
     *
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-ssl-requests-only.html)
     * @param enforceSsl Enforces SSL for requests. 
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * Whether this bucket should send notifications to Amazon EventBridge or not.
     *
     * Default: false
     *
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     * or not. 
     */
    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations. 
     */
    override
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.map(IntelligentTieringConfiguration::unwrap))
    }

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations. 
     */
    override fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration): Unit =
        intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     * @param inventories The inventory configuration of the bucket. 
     */
    override fun inventories(inventories: List<Inventory>) {
      cdkBuilder.inventories(inventories.map(Inventory::unwrap))
    }

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     * @param inventories The inventory configuration of the bucket. 
     */
    override fun inventories(vararg inventories: Inventory): Unit =
        inventories(inventories.toList())

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime. 
     */
    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime. 
     */
    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     * @param metrics The metrics configuration of this bucket. 
     */
    override fun metrics(metrics: List<BucketMetrics>) {
      cdkBuilder.metrics(metrics.map(BucketMetrics::unwrap))
    }

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     * @param metrics The metrics configuration of this bucket. 
     */
    override fun metrics(vararg metrics: BucketMetrics): Unit = metrics(metrics.toList())

    /**
     * Enforces minimum TLS version for requests.
     *
     * Requires `enforceSSL` to be enabled.
     *
     * Default: No minimum TLS version is enforced.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/amazon-s3-policy-keys.html#example-object-tls-version)
     * @param minimumTlsVersion Enforces minimum TLS version for requests. 
     */
    override fun minimumTlsVersion(minimumTlsVersion: Number) {
      cdkBuilder.minimumTlsVersion(minimumTlsVersion)
    }

    /**
     * The role to be used by the notifications handler.
     *
     * Default: - a new role will be created.
     *
     * @param notificationsHandlerRole The role to be used by the notifications handler. 
     */
    override fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
      cdkBuilder.notificationsHandlerRole(notificationsHandlerRole.let(IRole::unwrap))
    }

    /**
     * The default retention mode and rules for S3 Object Lock.
     *
     * Default retention can be configured after a bucket is created if the bucket already
     * has object lock enabled. Enabling object lock for existing buckets is not supported.
     *
     * Default: no default retention period
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock. 
     */
    override fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
      cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention.let(ObjectLockRetention::unwrap))
    }

    /**
     * Enable object lock on the bucket.
     *
     * Enabling object lock for existing buckets is not supported. Object lock must be
     * enabled when the bucket is created.
     *
     * Default: false, unless objectLockDefaultRetention is set (then, true)
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     * @param objectLockEnabled Enable object lock on the bucket. 
     */
    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * The objectOwnership of the bucket.
     *
     * Default: - No ObjectOwnership configuration, uploading account will own the object.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html)
     * @param objectOwnership The objectOwnership of the bucket. 
     */
    override fun objectOwnership(objectOwnership: ObjectOwnership) {
      cdkBuilder.objectOwnership(objectOwnership.let(ObjectOwnership::unwrap))
    }

    /**
     * Grants public read access to all objects in the bucket.
     *
     * Similar to calling `bucket.grantPublicAccess()`
     *
     * Default: false
     *
     * @param publicReadAccess Grants public read access to all objects in the bucket. 
     */
    override fun publicReadAccess(publicReadAccess: Boolean) {
      cdkBuilder.publicReadAccess(publicReadAccess)
    }

    /**
     * Policy to apply when the bucket is removed from this stack.
     *
     * Default: - The bucket will be orphaned.
     *
     * @param removalPolicy Policy to apply when the bucket is removed from this stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * Destination bucket for the server access logs.
     *
     * Default: - If "serverAccessLogsPrefix" undefined - access logs disabled, otherwise - log to
     * current bucket.
     *
     * @param serverAccessLogsBucket Destination bucket for the server access logs. 
     */
    override fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
      cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket.let(IBucket::unwrap))
    }

    /**
     * Optional log file prefix to use for the bucket's access logs.
     *
     * If defined without "serverAccessLogsBucket", enables access logs to current bucket with this
     * prefix.
     *
     * Default: - No log file prefix
     *
     * @param serverAccessLogsPrefix Optional log file prefix to use for the bucket's access logs. 
     */
    override fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
      cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    /**
     * Optional key format for log objects.
     *
     * Default: - the default key format is:
     * [DestinationPrefix][YYYY]-[MM]-[DD]-[hh]-[mm]-[ss]-[UniqueString]
     *
     * @param targetObjectKeyFormat Optional key format for log objects. 
     */
    override fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat) {
      cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(TargetObjectKeyFormat::unwrap))
    }

    /**
     * Whether this bucket should have transfer acceleration turned on or not.
     *
     * Default: false
     *
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     * or not. 
     */
    override fun transferAcceleration(transferAcceleration: Boolean) {
      cdkBuilder.transferAcceleration(transferAcceleration)
    }

    /**
     * Whether this bucket should have versioning turned on or not.
     *
     * Default: false (unless object lock is enabled, then true)
     *
     * @param versioned Whether this bucket should have versioning turned on or not. 
     */
    override fun versioned(versioned: Boolean) {
      cdkBuilder.versioned(versioned)
    }

    /**
     * The name of the error document (e.g. "404.html") for the website. `websiteIndexDocument` must
     * also be set if this is set.
     *
     * Default: - No error document.
     *
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     * `websiteIndexDocument` must also be set if this is set. 
     */
    override fun websiteErrorDocument(websiteErrorDocument: String) {
      cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    /**
     * The name of the index document (e.g. "index.html") for the website. Enables static website
     * hosting for this bucket.
     *
     * Default: - No index document.
     *
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     * website. Enables static website hosting for this bucket. 
     */
    override fun websiteIndexDocument(websiteIndexDocument: String) {
      cdkBuilder.websiteIndexDocument(websiteIndexDocument)
    }

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
     *
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     *
     * Default: - No redirection.
     *
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket. 
     */
    override fun websiteRedirect(websiteRedirect: RedirectTarget) {
      cdkBuilder.websiteRedirect(websiteRedirect.let(RedirectTarget::unwrap))
    }

    /**
     * Specifies the redirect behavior of all requests to a website endpoint of a bucket.
     *
     * If you specify this property, you can't specify "websiteIndexDocument",
     * "websiteErrorDocument" nor , "websiteRoutingRules".
     *
     * Default: - No redirection.
     *
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     * of a bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75654fb117b3f72fb4efe559681713ee385de3941b95db8b75d27341a1e36ecd")
    override fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit): Unit =
        websiteRedirect(RedirectTarget(websiteRedirect))

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior. 
     */
    override fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>) {
      cdkBuilder.websiteRoutingRules(websiteRoutingRules.map(RoutingRule::unwrap))
    }

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     * behavior. 
     */
    override fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule): Unit =
        websiteRoutingRules(websiteRoutingRules.toList())

    public fun build(): software.amazon.awscdk.services.s3.Bucket = cdkBuilder.build()
  }

  public companion object {
    public fun fromBucketArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      bucketArn: String,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, bucketArn).let(IBucket::wrap)

    public fun fromBucketAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: BucketAttributes,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(BucketAttributes::unwrap)).let(IBucket::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96286ce29bc8d60c796534f12d61ae60bbe0c84544eedd51a7ea87dce6b107b8")
    public fun fromBucketAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: BucketAttributes.Builder.() -> Unit,
    ): IBucket = fromBucketAttributes(scope, id, BucketAttributes(attrs))

    public fun fromBucketName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      bucketName: String,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, bucketName).let(IBucket::wrap)

    public fun fromCfnBucket(cfnBucket: CfnBucket): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromCfnBucket(cfnBucket.let(CfnBucket::unwrap)).let(IBucket::wrap)

    public fun validateBucketName(physicalName: String) {
      software.amazon.awscdk.services.s3.Bucket.validateBucketName(physicalName)
    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Bucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Bucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Bucket): Bucket =
        Bucket(cdkObject)

    internal fun unwrap(wrapped: Bucket): software.amazon.awscdk.services.s3.Bucket =
        wrapped.cdkObject
  }
}
