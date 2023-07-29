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

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.BlockPublicAccess
import software.amazon.awscdk.services.s3.BucketAccessControl
import software.amazon.awscdk.services.s3.BucketEncryption
import software.amazon.awscdk.services.s3.BucketMetrics
import software.amazon.awscdk.services.s3.BucketProps
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration
import software.amazon.awscdk.services.s3.Inventory
import software.amazon.awscdk.services.s3.LifecycleRule
import software.amazon.awscdk.services.s3.ObjectLockRetention
import software.amazon.awscdk.services.s3.ObjectOwnership
import software.amazon.awscdk.services.s3.RedirectTarget
import software.amazon.awscdk.services.s3.RoutingRule

/**
 * Example:
 * ```
 * Bucket sourceBucket = Bucket.Builder.create(this, "MyBucket")
 * .versioned(true)
 * .build();
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact sourceOutput = new Artifact();
 * S3SourceAction sourceAction = S3SourceAction.Builder.create()
 * .actionName("S3Source")
 * .bucket(sourceBucket)
 * .bucketKey("path/to/file.zip")
 * .output(sourceOutput)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class BucketPropsDsl {
    private val cdkBuilder: BucketProps.Builder = BucketProps.builder()

    private val _cors: MutableList<CorsRule> = mutableListOf()

    private val _intelligentTieringConfigurations: MutableList<IntelligentTieringConfiguration> =
        mutableListOf()

    private val _inventories: MutableList<Inventory> = mutableListOf()

    private val _lifecycleRules: MutableList<LifecycleRule> = mutableListOf()

    private val _metrics: MutableList<BucketMetrics> = mutableListOf()

    private val _websiteRoutingRules: MutableList<RoutingRule> = mutableListOf()

    /**
     * @param accessControl Specifies a canned ACL that grants predefined permissions to the bucket.
     */
    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    /**
     * @param autoDeleteObjects Whether all objects should be automatically deleted when the bucket
     *   is removed from the stack or when the stack is deleted. Requires the `removalPolicy` to be
     *   set to `RemovalPolicy.DESTROY`.
     *
     * **Warning** if you have deployed a bucket with `autoDeleteObjects: true`, switching this to
     * `false` in a CDK version *before* `1.126.0` will lead to all objects in the bucket being
     * deleted. Be sure to update your bucket resources by deploying with CDK version `1.126.0` or
     * later **before** switching this value to `false`.
     */
    public fun autoDeleteObjects(autoDeleteObjects: Boolean) {
        cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    /** @param blockPublicAccess The block public access configuration of this bucket. */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccessDsl.() -> Unit = {}) {
        val builder = BlockPublicAccessDsl()
        builder.apply(blockPublicAccess)
        cdkBuilder.blockPublicAccess(builder.build())
    }

    /** @param blockPublicAccess The block public access configuration of this bucket. */
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
        cdkBuilder.blockPublicAccess(blockPublicAccess)
    }

    /**
     * @param bucketKeyEnabled Whether Amazon S3 should use its own intermediary key to generate
     *   data keys. Only relevant when using KMS for encryption.
     * * If not enabled, every object GET and PUT will cause an API call to KMS (with the attendant
     *   cost implications of that).
     * * If enabled, S3 will use its own time-limited key instead.
     *
     * Only relevant, when Encryption is set to `BucketEncryption.KMS` or
     * `BucketEncryption.KMS_MANAGED`.
     */
    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    /** @param bucketName Physical name of this bucket. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /** @param cors The CORS configuration of this bucket. */
    public fun cors(cors: CorsRuleDsl.() -> Unit) {
        _cors.add(CorsRuleDsl().apply(cors).build())
    }

    /** @param cors The CORS configuration of this bucket. */
    public fun cors(cors: Collection<CorsRule>) {
        _cors.addAll(cors)
    }

    /**
     * @param encryption The kind of server-side encryption to apply to this bucket. If you choose
     *   KMS, you can specify a KMS key via `encryptionKey`. If encryption key is not specified, a
     *   key will automatically be created.
     */
    public fun encryption(encryption: BucketEncryption) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param encryptionKey External KMS key to use for bucket encryption. The `encryption` property
     *   must be either not specified or set to `KMS` or `DSSE`. An error will be emitted if
     *   `encryption` is set to `UNENCRYPTED` or `S3_MANAGED`.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param enforceSsl Enforces SSL for requests. S3.5 of the AWS Foundational Security Best
     *   Practices Regarding S3.
     */
    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * @param eventBridgeEnabled Whether this bucket should send notifications to Amazon EventBridge
     *   or not.
     */
    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    /** @param intelligentTieringConfigurations Inteligent Tiering Configurations. */
    public fun intelligentTieringConfigurations(
        intelligentTieringConfigurations: IntelligentTieringConfigurationDsl.() -> Unit
    ) {
        _intelligentTieringConfigurations.add(
            IntelligentTieringConfigurationDsl().apply(intelligentTieringConfigurations).build()
        )
    }

    /** @param intelligentTieringConfigurations Inteligent Tiering Configurations. */
    public fun intelligentTieringConfigurations(
        intelligentTieringConfigurations: Collection<IntelligentTieringConfiguration>
    ) {
        _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
    }

    /** @param inventories The inventory configuration of the bucket. */
    public fun inventories(inventories: InventoryDsl.() -> Unit) {
        _inventories.add(InventoryDsl().apply(inventories).build())
    }

    /** @param inventories The inventory configuration of the bucket. */
    public fun inventories(inventories: Collection<Inventory>) {
        _inventories.addAll(inventories)
    }

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
        _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
    }

    /**
     * @param lifecycleRules Rules that define how Amazon S3 manages objects during their lifetime.
     */
    public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
        _lifecycleRules.addAll(lifecycleRules)
    }

    /** @param metrics The metrics configuration of this bucket. */
    public fun metrics(metrics: BucketMetricsDsl.() -> Unit) {
        _metrics.add(BucketMetricsDsl().apply(metrics).build())
    }

    /** @param metrics The metrics configuration of this bucket. */
    public fun metrics(metrics: Collection<BucketMetrics>) {
        _metrics.addAll(metrics)
    }

    /** @param notificationsHandlerRole The role to be used by the notifications handler. */
    public fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
        cdkBuilder.notificationsHandlerRole(notificationsHandlerRole)
    }

    /**
     * @param objectLockDefaultRetention The default retention mode and rules for S3 Object Lock.
     *   Default retention can be configured after a bucket is created if the bucket already has
     *   object lock enabled. Enabling object lock for existing buckets is not supported.
     */
    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
        cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention)
    }

    /**
     * @param objectLockEnabled Enable object lock on the bucket. Enabling object lock for existing
     *   buckets is not supported. Object lock must be enabled when the bucket is created.
     */
    public fun objectLockEnabled(objectLockEnabled: Boolean) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    /** @param objectOwnership The objectOwnership of the bucket. */
    public fun objectOwnership(objectOwnership: ObjectOwnership) {
        cdkBuilder.objectOwnership(objectOwnership)
    }

    /**
     * @param publicReadAccess Grants public read access to all objects in the bucket. Similar to
     *   calling `bucket.grantPublicAccess()`
     */
    public fun publicReadAccess(publicReadAccess: Boolean) {
        cdkBuilder.publicReadAccess(publicReadAccess)
    }

    /** @param removalPolicy Policy to apply when the bucket is removed from this stack. */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /** @param serverAccessLogsBucket Destination bucket for the server access logs. */
    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
        cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket)
    }

    /**
     * @param serverAccessLogsPrefix Optional log file prefix to use for the bucket's access logs.
     *   If defined without "serverAccessLogsBucket", enables access logs to current bucket with
     *   this prefix.
     */
    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
        cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    /**
     * @param transferAcceleration Whether this bucket should have transfer acceleration turned on
     *   or not.
     */
    public fun transferAcceleration(transferAcceleration: Boolean) {
        cdkBuilder.transferAcceleration(transferAcceleration)
    }

    /** @param versioned Whether this bucket should have versioning turned on or not. */
    public fun versioned(versioned: Boolean) {
        cdkBuilder.versioned(versioned)
    }

    /**
     * @param websiteErrorDocument The name of the error document (e.g. "404.html") for the website.
     *   `websiteIndexDocument` must also be set if this is set.
     */
    public fun websiteErrorDocument(websiteErrorDocument: String) {
        cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    /**
     * @param websiteIndexDocument The name of the index document (e.g. "index.html") for the
     *   website. Enables static website hosting for this bucket.
     */
    public fun websiteIndexDocument(websiteIndexDocument: String) {
        cdkBuilder.websiteIndexDocument(websiteIndexDocument)
    }

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     *   of a bucket. If you specify this property, you can't specify "websiteIndexDocument",
     *   "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    public fun websiteRedirect(websiteRedirect: RedirectTargetDsl.() -> Unit = {}) {
        val builder = RedirectTargetDsl()
        builder.apply(websiteRedirect)
        cdkBuilder.websiteRedirect(builder.build())
    }

    /**
     * @param websiteRedirect Specifies the redirect behavior of all requests to a website endpoint
     *   of a bucket. If you specify this property, you can't specify "websiteIndexDocument",
     *   "websiteErrorDocument" nor , "websiteRoutingRules".
     */
    public fun websiteRedirect(websiteRedirect: RedirectTarget) {
        cdkBuilder.websiteRedirect(websiteRedirect)
    }

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     *   behavior.
     */
    public fun websiteRoutingRules(websiteRoutingRules: RoutingRuleDsl.() -> Unit) {
        _websiteRoutingRules.add(RoutingRuleDsl().apply(websiteRoutingRules).build())
    }

    /**
     * @param websiteRoutingRules Rules that define when a redirect is applied and the redirect
     *   behavior.
     */
    public fun websiteRoutingRules(websiteRoutingRules: Collection<RoutingRule>) {
        _websiteRoutingRules.addAll(websiteRoutingRules)
    }

    public fun build(): BucketProps {
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
