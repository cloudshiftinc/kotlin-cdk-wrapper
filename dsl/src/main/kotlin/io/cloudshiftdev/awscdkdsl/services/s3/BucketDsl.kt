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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BlockPublicAccess
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.BucketEncryption
import software.amazon.awscdk.services.s3.BucketMetrics
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.s3.ObjectLockRetention
import software.amazon.awscdk.services.s3.ObjectOwnership
import software.amazon.awscdk.services.s3.RedirectTarget
import software.amazon.awscdk.services.s3.RoutingRule
import software.constructs.Construct

/**
 * An S3 bucket with associated policy objects.
 *
 * This bucket does not yet have all features that exposed by the underlying BucketResource.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.RemovalPolicy;
 * Bucket.Builder.create(scope, "Bucket")
 * .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
 * .encryption(BucketEncryption.S3_MANAGED)
 * .enforceSSL(true)
 * .versioned(true)
 * .removalPolicy(RemovalPolicy.RETAIN)
 * .build();
 * ```
 */
@CdkDslMarker
public class BucketDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Bucket.Builder = Bucket.Builder.create(scope, id)

    private val _cors: MutableList<CorsRule> = mutableListOf()

    private val _intelligentTieringConfigurations: MutableList<IntelligentTieringConfiguration> =
        mutableListOf()

    private val _inventories: MutableList<Inventory> = mutableListOf()

    private val _lifecycleRules: MutableList<LifecycleRule> = mutableListOf()

    private val _metrics: MutableList<BucketMetrics> = mutableListOf()

    private val _websiteRoutingRules: MutableList<RoutingRule> = mutableListOf()

    /**
     * Specifies a canned ACL that grants predefined permissions to the bucket.
     *
     * Default: BucketAccessControl.PRIVATE
     *
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     */
    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * Whether all objects should be automatically deleted when the bucket is removed from the stack
     * or when the stack is deleted.
     *
     * Requires the `removalPolicy` to be set to `RemovalPolicy.DESTROY`.
     *
     * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`, switching this to
     * `false` in a CDK version *before* `1.126.0` will lead to all objects in the bucket being
     * deleted. Be sure to update your bucket resources by deploying with CDK version `1.126.0` or
     * later **before** switching this value to `false`.
     *
     * Default: false
     *
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     *   is removed from the stack or when the stack is deleted.
     */
    public fun autoDeleteObjects(autoDeleteObjects: Boolean) {
        cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     *
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccessDsl.() -> Unit = {}) {
        val builder = BlockPublicAccessDsl()
        builder.apply(blockPublicAccess)
        cdkBuilder.blockPublicAccess(builder.build())
    }

    /**
     * The block public access configuration of this bucket.
     *
     * Default: - CloudFormation defaults will apply. New buckets and objects don't allow public
     * access, but users can modify bucket policies or object permissions to allow public access
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html)
     *
     * @param blockPublicAccess The block public access configuration of this bucket.
     */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
        cdkBuilder.blockPublicAccess(blockPublicAccess)
    }

    /**
     * Whether Amazon S3 should use its own intermediary key to generate data keys.
     *
     * Only relevant when using KMS for encryption.
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the attendant
     *   cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is set to `BucketEncryption.KMS` or
     * `BucketEncryption.KMS_MANAGED`.
     *
     * Default: - false
     *
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     *   data keys.
     */
    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    /**
     * Physical name of this bucket.
     *
     * Default: - Assigned by CloudFormation (recommended).
     *
     * @param bucketName Physical name of this bucket.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     *
     * @param cors The CORS configuration of this bucket.
     */
    public fun cors(cors: CorsRuleDsl.() -> Unit) {
        _cors.add(CorsRuleDsl().apply(cors).build())
    }

    /**
     * The CORS configuration of this bucket.
     *
     * Default: - No CORS configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-cors.html)
     *
     * @param cors The CORS configuration of this bucket.
     */
    public fun cors(cors: Collection<CorsRule>) {
        _cors.addAll(cors)
    }

    /**
     * The kind of server-side encryption to apply to this bucket.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If encryption key is not
     * specified, a key will automatically be created.
     *
     * Default: - `KMS` if `encryptionKey` is specified, or `UNENCRYPTED` otherwise. But if
     * `UNENCRYPTED` is specified, the bucket will be encrypted as `S3_MANAGED` automatically.
     *
     * @param encryption The kind of server-side encryption to apply to this bucket.
     */
    public fun encryption(encryption: BucketEncryption) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * External KMS key to use for bucket encryption.
     *
     * The `encryption` property must be either not specified or set to `KMS` or `DSSE`. An error
     * will be emitted if `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     *
     * Default: - If `encryption` is set to `KMS` and this property is undefined, a new KMS key will
     * be created and associated with this bucket.
     *
     * @param encryptionKey External KMS key to use for bucket encryption.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * Enforces SSL for requests.
     *
     * S3.5 of the AWS Foundational Security Best Practices Regarding S3.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-ssl-requests-only.html)
     *
     * @param enforceSsl Enforces SSL for requests.
     */
    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * Whether this bucket should send notifications to Amazon EventBridge or not.
     *
     * Default: false
     *
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     *   or not.
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     *
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    public fun intelligentTieringConfigurations(
        intelligentTieringConfigurations: IntelligentTieringConfigurationDsl.() -> Unit
    ) {
        _intelligentTieringConfigurations.add(
            IntelligentTieringConfigurationDsl().apply(intelligentTieringConfigurations).build()
        )
    }

    /**
     * Inteligent Tiering Configurations.
     *
     * Default: No Intelligent Tiiering Configurations.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html)
     *
     * @param intelligentTieringConfigurations Inteligent Tiering Configurations.
     */
    public fun intelligentTieringConfigurations(
        intelligentTieringConfigurations: Collection<IntelligentTieringConfiguration>
    ) {
        _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
    }

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     *
     * @param inventories The inventory configuration of the bucket.
     */
    public fun inventories(inventories: InventoryDsl.() -> Unit) {
        _inventories.add(InventoryDsl().apply(inventories).build())
    }

    /**
     * The inventory configuration of the bucket.
     *
     * Default: - No inventory configuration
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
     *
     * @param inventories The inventory configuration of the bucket.
     */
    public fun inventories(inventories: Collection<Inventory>) {
        _inventories.addAll(inventories)
    }

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
        _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
    }

    /**
     * Rules that define how Amazon S3 manages objects during their lifetime.
     *
     * Default: - No lifecycle rules.
     *
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
        _lifecycleRules.addAll(lifecycleRules)
    }

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     *
     * @param metrics The metrics configuration of this bucket.
     */
    public fun metrics(metrics: BucketMetricsDsl.() -> Unit) {
        _metrics.add(BucketMetricsDsl().apply(metrics).build())
    }

    /**
     * The metrics configuration of this bucket.
     *
     * Default: - No metrics configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
     *
     * @param metrics The metrics configuration of this bucket.
     */
    public fun metrics(metrics: Collection<BucketMetrics>) {
        _metrics.addAll(metrics)
    }

    /**
     * The role to be used by the notifications handler.
     *
     * Default: - a new role will be created.
     *
     * @param notificationsHandlerRole The role to be used by the notifications handler.
     */
    public fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
        cdkBuilder.notificationsHandlerRole(notificationsHandlerRole)
    }

    /**
     * The default retention mode and rules for S3 Object Lock.
     *
     * Default retention can be configured after a bucket is created if the bucket already has
     * object lock enabled. Enabling object lock for existing buckets is not supported.
     *
     * Default: no default retention period
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     *
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock.
     */
    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
        cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention)
    }

    /**
     * Enable object lock on the bucket.
     *
     * Enabling object lock for existing buckets is not supported. Object lock must be enabled when
     * the bucket is created.
     *
     * Default: false, unless objectLockDefaultRetention is set (then, true)
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-bucket-config-enable)
     *
     * @param objectLockEnabled Enable object lock on the bucket.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /**
     * The objectOwnership of the bucket.
     *
     * Default: - No ObjectOwnership configuration, uploading account will own the object.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html)
     *
     * @param objectOwnership The objectOwnership of the bucket.
     */
    public fun objectOwnership(objectOwnership: ObjectOwnership) {
        cdkBuilder.objectOwnership(objectOwnership)
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
    public fun publicReadAccess(publicReadAccess: Boolean) {
        cdkBuilder.publicReadAccess(publicReadAccess)
    }

    /**
     * Policy to apply when the bucket is removed from this stack.
     *
     * Default: - The bucket will be orphaned.
     *
     * @param removalPolicy Policy to apply when the bucket is removed from this stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * Destination bucket for the server access logs.
     *
     * Default: - If "serverAccessLogsPrefix" undefined - access logs disabled, otherwise - log to
     * current bucket.
     *
     * @param serverAccessLogsBucket Destination bucket for the server access logs.
     */
    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
        cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket)
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
    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
        cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    /**
     * Whether this bucket should have transfer acceleration turned on or not.
     *
     * Default: false
     *
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     *   or not.
     */
    public fun transferAcceleration(transferAcceleration: Boolean) {
        cdkBuilder.transferAcceleration(transferAcceleration)
    }

    /**
     * Whether this bucket should have versioning turned on or not.
     *
     * Default: false (unless object lock is enabled, then true)
     *
     * @param versioned Whether this bucket should have versioning turned on or not.
     */
    public fun versioned(versioned: Boolean) {
        cdkBuilder.versioned(versioned)
    }

    /**
     * The name of the error document (e.g. "404.html") for the website. `websiteIndexDocument` must
     * also be set if this is set.
     *
     * Default: - No error document.
     *
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     *   `websiteIndexDocument` must also be set if this is set.
     */
    public fun websiteErrorDocument(websiteErrorDocument: String) {
        cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    /**
     * The name of the index document (e.g. "index.html") for the website. Enables static website
     * hosting for this bucket.
     *
     * Default: - No index document.
     *
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     *   website. Enables static website hosting for this bucket.
     */
    public fun websiteIndexDocument(websiteIndexDocument: String) {
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
     *   of a bucket.
     */
    public fun websiteRedirect(websiteRedirect: RedirectTargetDsl.() -> Unit = {}) {
        val builder = RedirectTargetDsl()
        builder.apply(websiteRedirect)
        cdkBuilder.websiteRedirect(builder.build())
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
     *   of a bucket.
     */
    public fun websiteRedirect(websiteRedirect: RedirectTarget) {
        cdkBuilder.websiteRedirect(websiteRedirect)
    }

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     *   behavior.
     */
    public fun websiteRoutingRules(websiteRoutingRules: RoutingRuleDsl.() -> Unit) {
        _websiteRoutingRules.add(RoutingRuleDsl().apply(websiteRoutingRules).build())
    }

    /**
     * Rules that define when a redirect is applied and the redirect behavior.
     *
     * Default: - No redirection rules.
     *
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     *   behavior.
     */
    public fun websiteRoutingRules(websiteRoutingRules: Collection<RoutingRule>) {
        _websiteRoutingRules.addAll(websiteRoutingRules)
    }

    public fun build(): Bucket {
        if (_cors.isNotEmpty()) cdkBuilder.cors(_cors)
        if (_intelligentTieringConfigurations.isNotEmpty())
            cdkBuilder.intelligentTieringConfigurations(_intelligentTieringConfigurations)
        if (_inventories.isNotEmpty()) cdkBuilder.inventories(_inventories)
        if (_lifecycleRules.isNotEmpty()) cdkBuilder.lifecycleRules(_lifecycleRules)
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        if (_websiteRoutingRules.isNotEmpty()) cdkBuilder.websiteRoutingRules(_websiteRoutingRules)
        return cdkBuilder.build()
    }
}
