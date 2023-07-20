@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

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

    public fun accessControl(accessControl: BucketAccessControl) {
        cdkBuilder.accessControl(accessControl)
    }

    public fun autoDeleteObjects(autoDeleteObjects: Boolean) {
        cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    public fun blockPublicAccess(block: BlockPublicAccessDsl.() -> Unit = {}) {
        val builder = BlockPublicAccessDsl()
        builder.apply(block)
        cdkBuilder.blockPublicAccess(builder.build())
    }

    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
        cdkBuilder.blockPublicAccess(blockPublicAccess)
    }

    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun cors(cors: CorsRuleDsl.() -> Unit) {
        _cors.add(CorsRuleDsl().apply(cors).build())
    }

    public fun cors(cors: Collection<CorsRule>) {
        _cors.addAll(cors)
    }

    public fun encryption(encryption: BucketEncryption) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IntelligentTieringConfigurationDsl.() -> Unit) {
        _intelligentTieringConfigurations.add(IntelligentTieringConfigurationDsl().apply(intelligentTieringConfigurations).build())
    }

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: Collection<IntelligentTieringConfiguration>) {
        _intelligentTieringConfigurations.addAll(intelligentTieringConfigurations)
    }

    public fun inventories(inventories: InventoryDsl.() -> Unit) {
        _inventories.add(InventoryDsl().apply(inventories).build())
    }

    public fun inventories(inventories: Collection<Inventory>) {
        _inventories.addAll(inventories)
    }

    public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
        _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
    }

    public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
        _lifecycleRules.addAll(lifecycleRules)
    }

    public fun metrics(metrics: BucketMetricsDsl.() -> Unit) {
        _metrics.add(BucketMetricsDsl().apply(metrics).build())
    }

    public fun metrics(metrics: Collection<BucketMetrics>) {
        _metrics.addAll(metrics)
    }

    public fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
        cdkBuilder.notificationsHandlerRole(notificationsHandlerRole)
    }

    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
        cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention)
    }

    public fun objectLockEnabled(objectLockEnabled: Boolean) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    public fun objectOwnership(objectOwnership: ObjectOwnership) {
        cdkBuilder.objectOwnership(objectOwnership)
    }

    public fun publicReadAccess(publicReadAccess: Boolean) {
        cdkBuilder.publicReadAccess(publicReadAccess)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
        cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket)
    }

    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
        cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    public fun transferAcceleration(transferAcceleration: Boolean) {
        cdkBuilder.transferAcceleration(transferAcceleration)
    }

    public fun versioned(versioned: Boolean) {
        cdkBuilder.versioned(versioned)
    }

    public fun websiteErrorDocument(websiteErrorDocument: String) {
        cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    public fun websiteIndexDocument(websiteIndexDocument: String) {
        cdkBuilder.websiteIndexDocument(websiteIndexDocument)
    }

    public fun websiteRedirect(block: RedirectTargetDsl.() -> Unit = {}) {
        val builder = RedirectTargetDsl()
        builder.apply(block)
        cdkBuilder.websiteRedirect(builder.build())
    }

    public fun websiteRedirect(websiteRedirect: RedirectTarget) {
        cdkBuilder.websiteRedirect(websiteRedirect)
    }

    public fun websiteRoutingRules(websiteRoutingRules: RoutingRuleDsl.() -> Unit) {
        _websiteRoutingRules.add(RoutingRuleDsl().apply(websiteRoutingRules).build())
    }

    public fun websiteRoutingRules(websiteRoutingRules: Collection<RoutingRule>) {
        _websiteRoutingRules.addAll(websiteRoutingRules)
    }

    public fun build(): Bucket {
        if (_cors.isNotEmpty()) cdkBuilder.cors(_cors)
        if (_intelligentTieringConfigurations.isNotEmpty()) {
            cdkBuilder.intelligentTieringConfigurations(_intelligentTieringConfigurations)
        }
        if (_inventories.isNotEmpty()) cdkBuilder.inventories(_inventories)
        if (_lifecycleRules.isNotEmpty()) cdkBuilder.lifecycleRules(_lifecycleRules)
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        if (_websiteRoutingRules.isNotEmpty()) cdkBuilder.websiteRoutingRules(_websiteRoutingRules)
        return cdkBuilder.build()
    }
}
