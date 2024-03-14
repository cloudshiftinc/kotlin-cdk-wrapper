package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Bucket internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3.Bucket,
) : BucketBase(cdkObject) {
  public open fun addCorsRule(rule: CorsRule) {
    unwrap(this).addCorsRule(rule.let(CorsRule::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c39a6daf2fce73cbe5cdcda55c988569d082067a227f6637635733848d5cc6f")
  public open fun addCorsRule(rule: CorsRule.Builder.() -> Unit): Unit = addCorsRule(CorsRule(rule))

  public open fun addInventory(inventory: Inventory) {
    unwrap(this).addInventory(inventory.let(Inventory::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74dbc5c60a3fd9a56d374f483b0a1ee149bd0b0667023283257bbc05716366eb")
  public open fun addInventory(inventory: Inventory.Builder.() -> Unit): Unit =
      addInventory(Inventory(inventory))

  public open fun addLifecycleRule(rule: LifecycleRule) {
    unwrap(this).addLifecycleRule(rule.let(LifecycleRule::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a2bc44a656cdbd26f8dbffb63e56bc9726b72a74d5d58052bb3fa5c22b6869f")
  public open fun addLifecycleRule(rule: LifecycleRule.Builder.() -> Unit): Unit =
      addLifecycleRule(LifecycleRule(rule))

  public open fun addMetric(metric: BucketMetrics) {
    unwrap(this).addMetric(metric.let(BucketMetrics::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("782290c8eee5cfc954c1c2babc14ae29c6624de205b47fa981b32f274a323181")
  public open fun addMetric(metric: BucketMetrics.Builder.() -> Unit): Unit =
      addMetric(BucketMetrics(metric))

  public override fun bucketArn(): String = unwrap(this).getBucketArn()

  public override fun bucketDomainName(): String = unwrap(this).getBucketDomainName()

  public override fun bucketDualStackDomainName(): String =
      unwrap(this).getBucketDualStackDomainName()

  public override fun bucketName(): String = unwrap(this).getBucketName()

  public override fun bucketRegionalDomainName(): String =
      unwrap(this).getBucketRegionalDomainName()

  public override fun bucketWebsiteDomainName(): String = unwrap(this).getBucketWebsiteDomainName()

  public override fun bucketWebsiteUrl(): String = unwrap(this).getBucketWebsiteUrl()

  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public override fun isWebsite(): Boolean? = unwrap(this).getIsWebsite()

  public override fun policy(): BucketPolicy? = unwrap(this).getPolicy()?.let(BucketPolicy::wrap)

  public override fun policy(`value`: BucketPolicy) {
    unwrap(this).setPolicy(`value`.let(BucketPolicy::unwrap))
  }

  public interface Builder {
    public fun accessControl(accessControl: BucketAccessControl)

    public fun autoDeleteObjects(autoDeleteObjects: Boolean)

    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae01d0ba0bb2c5f41b4b7400230c6ab9304113667d092e5c1ca903318f6b380")
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit)

    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

    public fun bucketName(bucketName: String)

    public fun cors(cors: List<CorsRule>)

    public fun encryption(encryption: BucketEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun enforceSsl(enforceSsl: Boolean)

    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    public
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>)

    public fun inventories(inventories: List<Inventory>)

    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    public fun metrics(metrics: List<BucketMetrics>)

    public fun minimumTlsVersion(minimumTlsVersion: Number)

    public fun notificationsHandlerRole(notificationsHandlerRole: IRole)

    public fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention)

    public fun objectLockEnabled(objectLockEnabled: Boolean)

    public fun objectOwnership(objectOwnership: ObjectOwnership)

    public fun publicReadAccess(publicReadAccess: Boolean)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket)

    public fun serverAccessLogsPrefix(serverAccessLogsPrefix: String)

    public fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat)

    public fun transferAcceleration(transferAcceleration: Boolean)

    public fun versioned(versioned: Boolean)

    public fun websiteErrorDocument(websiteErrorDocument: String)

    public fun websiteIndexDocument(websiteIndexDocument: String)

    public fun websiteRedirect(websiteRedirect: RedirectTarget)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75654fb117b3f72fb4efe559681713ee385de3941b95db8b75d27341a1e36ecd")
    public fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit)

    public fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Bucket.Builder =
        software.amazon.awscdk.services.s3.Bucket.Builder.create(scope, id)

    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    override fun autoDeleteObjects(autoDeleteObjects: Boolean) {
      cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
      cdkBuilder.blockPublicAccess(blockPublicAccess.let(BlockPublicAccess::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ae01d0ba0bb2c5f41b4b7400230c6ab9304113667d092e5c1ca903318f6b380")
    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit): Unit =
        blockPublicAccess(BlockPublicAccess(blockPublicAccess))

    override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
      cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
    }

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun cors(cors: List<CorsRule>) {
      cdkBuilder.cors(cors.map(CorsRule::unwrap))
    }

    override fun encryption(encryption: BucketEncryption) {
      cdkBuilder.encryption(encryption.let(BucketEncryption::unwrap))
    }

    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
      cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
    }

    override
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.map(IntelligentTieringConfiguration::unwrap))
    }

    override fun inventories(inventories: List<Inventory>) {
      cdkBuilder.inventories(inventories.map(Inventory::unwrap))
    }

    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    override fun metrics(metrics: List<BucketMetrics>) {
      cdkBuilder.metrics(metrics.map(BucketMetrics::unwrap))
    }

    override fun minimumTlsVersion(minimumTlsVersion: Number) {
      cdkBuilder.minimumTlsVersion(minimumTlsVersion)
    }

    override fun notificationsHandlerRole(notificationsHandlerRole: IRole) {
      cdkBuilder.notificationsHandlerRole(notificationsHandlerRole.let(IRole::unwrap))
    }

    override fun objectLockDefaultRetention(objectLockDefaultRetention: ObjectLockRetention) {
      cdkBuilder.objectLockDefaultRetention(objectLockDefaultRetention.let(ObjectLockRetention::unwrap))
    }

    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    override fun objectOwnership(objectOwnership: ObjectOwnership) {
      cdkBuilder.objectOwnership(objectOwnership.let(ObjectOwnership::unwrap))
    }

    override fun publicReadAccess(publicReadAccess: Boolean) {
      cdkBuilder.publicReadAccess(publicReadAccess)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun serverAccessLogsBucket(serverAccessLogsBucket: IBucket) {
      cdkBuilder.serverAccessLogsBucket(serverAccessLogsBucket.let(IBucket::unwrap))
    }

    override fun serverAccessLogsPrefix(serverAccessLogsPrefix: String) {
      cdkBuilder.serverAccessLogsPrefix(serverAccessLogsPrefix)
    }

    override fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormat) {
      cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(TargetObjectKeyFormat::unwrap))
    }

    override fun transferAcceleration(transferAcceleration: Boolean) {
      cdkBuilder.transferAcceleration(transferAcceleration)
    }

    override fun versioned(versioned: Boolean) {
      cdkBuilder.versioned(versioned)
    }

    override fun websiteErrorDocument(websiteErrorDocument: String) {
      cdkBuilder.websiteErrorDocument(websiteErrorDocument)
    }

    override fun websiteIndexDocument(websiteIndexDocument: String) {
      cdkBuilder.websiteIndexDocument(websiteIndexDocument)
    }

    override fun websiteRedirect(websiteRedirect: RedirectTarget) {
      cdkBuilder.websiteRedirect(websiteRedirect.let(RedirectTarget::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75654fb117b3f72fb4efe559681713ee385de3941b95db8b75d27341a1e36ecd")
    override fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit): Unit =
        websiteRedirect(RedirectTarget(websiteRedirect))

    override fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>) {
      cdkBuilder.websiteRoutingRules(websiteRoutingRules.map(RoutingRule::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.Bucket = cdkBuilder.build()
  }

  public companion object {
    public open fun fromBucketArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      bucketArn: String,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, bucketArn).let(IBucket::wrap)

    public open fun fromBucketAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: BucketAttributes,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(BucketAttributes::unwrap)).let(IBucket::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96286ce29bc8d60c796534f12d61ae60bbe0c84544eedd51a7ea87dce6b107b8")
    public open fun fromBucketAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: BucketAttributes.Builder.() -> Unit,
    ): IBucket = fromBucketAttributes(scope, id, BucketAttributes(attrs))

    public open fun fromBucketName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      bucketName: String,
    ): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromBucketName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, bucketName).let(IBucket::wrap)

    public open fun fromCfnBucket(cfnBucket: CfnBucket): IBucket =
        software.amazon.awscdk.services.s3.Bucket.fromCfnBucket(cfnBucket.let(CfnBucket::unwrap)).let(IBucket::wrap)

    public open fun validateBucketName(physicalName: String) {
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
