@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface BucketProps {
  public fun accessControl(): BucketAccessControl? =
      unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

  public fun autoDeleteObjects(): Boolean? = unwrap(this).getAutoDeleteObjects()

  public fun blockPublicAccess(): BlockPublicAccess? =
      unwrap(this).getBlockPublicAccess()?.let(BlockPublicAccess::wrap)

  public fun bucketKeyEnabled(): Boolean? = unwrap(this).getBucketKeyEnabled()

  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun cors(): List<CorsRule> = unwrap(this).getCors()?.map(CorsRule::wrap) ?: emptyList()

  public fun encryption(): BucketEncryption? =
      unwrap(this).getEncryption()?.let(BucketEncryption::wrap)

  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

  public fun eventBridgeEnabled(): Boolean? = unwrap(this).getEventBridgeEnabled()

  public fun intelligentTieringConfigurations(): List<IntelligentTieringConfiguration> =
      unwrap(this).getIntelligentTieringConfigurations()?.map(IntelligentTieringConfiguration::wrap)
      ?: emptyList()

  public fun inventories(): List<Inventory> = unwrap(this).getInventories()?.map(Inventory::wrap) ?:
      emptyList()

  public fun lifecycleRules(): List<LifecycleRule> =
      unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

  public fun metrics(): List<BucketMetrics> = unwrap(this).getMetrics()?.map(BucketMetrics::wrap) ?:
      emptyList()

  public fun minimumTlsVersion(): Number? = unwrap(this).getMinimumTLSVersion()

  public fun notificationsHandlerRole(): IRole? =
      unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

  public fun objectLockDefaultRetention(): ObjectLockRetention? =
      unwrap(this).getObjectLockDefaultRetention()?.let(ObjectLockRetention::wrap)

  public fun objectLockEnabled(): Boolean? = unwrap(this).getObjectLockEnabled()

  public fun objectOwnership(): ObjectOwnership? =
      unwrap(this).getObjectOwnership()?.let(ObjectOwnership::wrap)

  public fun publicReadAccess(): Boolean? = unwrap(this).getPublicReadAccess()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun serverAccessLogsBucket(): IBucket? =
      unwrap(this).getServerAccessLogsBucket()?.let(IBucket::wrap)

  public fun serverAccessLogsPrefix(): String? = unwrap(this).getServerAccessLogsPrefix()

  public fun targetObjectKeyFormat(): TargetObjectKeyFormat? =
      unwrap(this).getTargetObjectKeyFormat()?.let(TargetObjectKeyFormat::wrap)

  public fun transferAcceleration(): Boolean? = unwrap(this).getTransferAcceleration()

  public fun versioned(): Boolean? = unwrap(this).getVersioned()

  public fun websiteErrorDocument(): String? = unwrap(this).getWebsiteErrorDocument()

  public fun websiteIndexDocument(): String? = unwrap(this).getWebsiteIndexDocument()

  public fun websiteRedirect(): RedirectTarget? =
      unwrap(this).getWebsiteRedirect()?.let(RedirectTarget::wrap)

  public fun websiteRoutingRules(): List<RoutingRule> =
      unwrap(this).getWebsiteRoutingRules()?.map(RoutingRule::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessControl(accessControl: BucketAccessControl)

    public fun autoDeleteObjects(autoDeleteObjects: Boolean)

    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb69d9132809f1e47dfffab558fb74be50e3cfdab2cd08fe8db89967fc9239c")
    public fun blockPublicAccess(blockPublicAccess: BlockPublicAccess.Builder.() -> Unit)

    public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

    public fun bucketName(bucketName: String)

    public fun cors(cors: List<CorsRule>)

    public fun cors(vararg cors: CorsRule)

    public fun encryption(encryption: BucketEncryption)

    public fun encryptionKey(encryptionKey: IKey)

    public fun enforceSsl(enforceSsl: Boolean)

    public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

    public
        fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<IntelligentTieringConfiguration>)

    public fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration)

    public fun inventories(inventories: List<Inventory>)

    public fun inventories(vararg inventories: Inventory)

    public fun lifecycleRules(lifecycleRules: List<LifecycleRule>)

    public fun lifecycleRules(vararg lifecycleRules: LifecycleRule)

    public fun metrics(metrics: List<BucketMetrics>)

    public fun metrics(vararg metrics: BucketMetrics)

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("731db56a93d98ee1f678fdfde7317760df5d9d8a99f364dbc7959cca7b0bf980")
    public fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit)

    public fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>)

    public fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.BucketProps.Builder =
        software.amazon.awscdk.services.s3.BucketProps.builder()

    override fun accessControl(accessControl: BucketAccessControl) {
      cdkBuilder.accessControl(accessControl.let(BucketAccessControl::unwrap))
    }

    override fun autoDeleteObjects(autoDeleteObjects: Boolean) {
      cdkBuilder.autoDeleteObjects(autoDeleteObjects)
    }

    override fun blockPublicAccess(blockPublicAccess: BlockPublicAccess) {
      cdkBuilder.blockPublicAccess(blockPublicAccess.let(BlockPublicAccess::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb69d9132809f1e47dfffab558fb74be50e3cfdab2cd08fe8db89967fc9239c")
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

    override fun cors(vararg cors: CorsRule): Unit = cors(cors.toList())

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

    override fun intelligentTieringConfigurations(vararg
        intelligentTieringConfigurations: IntelligentTieringConfiguration): Unit =
        intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    override fun inventories(inventories: List<Inventory>) {
      cdkBuilder.inventories(inventories.map(Inventory::unwrap))
    }

    override fun inventories(vararg inventories: Inventory): Unit =
        inventories(inventories.toList())

    override fun lifecycleRules(lifecycleRules: List<LifecycleRule>) {
      cdkBuilder.lifecycleRules(lifecycleRules.map(LifecycleRule::unwrap))
    }

    override fun lifecycleRules(vararg lifecycleRules: LifecycleRule): Unit =
        lifecycleRules(lifecycleRules.toList())

    override fun metrics(metrics: List<BucketMetrics>) {
      cdkBuilder.metrics(metrics.map(BucketMetrics::unwrap))
    }

    override fun metrics(vararg metrics: BucketMetrics): Unit = metrics(metrics.toList())

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("731db56a93d98ee1f678fdfde7317760df5d9d8a99f364dbc7959cca7b0bf980")
    override fun websiteRedirect(websiteRedirect: RedirectTarget.Builder.() -> Unit): Unit =
        websiteRedirect(RedirectTarget(websiteRedirect))

    override fun websiteRoutingRules(websiteRoutingRules: List<RoutingRule>) {
      cdkBuilder.websiteRoutingRules(websiteRoutingRules.map(RoutingRule::unwrap))
    }

    override fun websiteRoutingRules(vararg websiteRoutingRules: RoutingRule): Unit =
        websiteRoutingRules(websiteRoutingRules.toList())

    public fun build(): software.amazon.awscdk.services.s3.BucketProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.BucketProps,
  ) : CdkObject(cdkObject), BucketProps {
    override fun accessControl(): BucketAccessControl? =
        unwrap(this).getAccessControl()?.let(BucketAccessControl::wrap)

    override fun autoDeleteObjects(): Boolean? = unwrap(this).getAutoDeleteObjects()

    override fun blockPublicAccess(): BlockPublicAccess? =
        unwrap(this).getBlockPublicAccess()?.let(BlockPublicAccess::wrap)

    override fun bucketKeyEnabled(): Boolean? = unwrap(this).getBucketKeyEnabled()

    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun cors(): List<CorsRule> = unwrap(this).getCors()?.map(CorsRule::wrap) ?: emptyList()

    override fun encryption(): BucketEncryption? =
        unwrap(this).getEncryption()?.let(BucketEncryption::wrap)

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

    override fun eventBridgeEnabled(): Boolean? = unwrap(this).getEventBridgeEnabled()

    override fun intelligentTieringConfigurations(): List<IntelligentTieringConfiguration> =
        unwrap(this).getIntelligentTieringConfigurations()?.map(IntelligentTieringConfiguration::wrap)
        ?: emptyList()

    override fun inventories(): List<Inventory> =
        unwrap(this).getInventories()?.map(Inventory::wrap) ?: emptyList()

    override fun lifecycleRules(): List<LifecycleRule> =
        unwrap(this).getLifecycleRules()?.map(LifecycleRule::wrap) ?: emptyList()

    override fun metrics(): List<BucketMetrics> =
        unwrap(this).getMetrics()?.map(BucketMetrics::wrap) ?: emptyList()

    override fun minimumTlsVersion(): Number? = unwrap(this).getMinimumTLSVersion()

    override fun notificationsHandlerRole(): IRole? =
        unwrap(this).getNotificationsHandlerRole()?.let(IRole::wrap)

    override fun objectLockDefaultRetention(): ObjectLockRetention? =
        unwrap(this).getObjectLockDefaultRetention()?.let(ObjectLockRetention::wrap)

    override fun objectLockEnabled(): Boolean? = unwrap(this).getObjectLockEnabled()

    override fun objectOwnership(): ObjectOwnership? =
        unwrap(this).getObjectOwnership()?.let(ObjectOwnership::wrap)

    override fun publicReadAccess(): Boolean? = unwrap(this).getPublicReadAccess()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun serverAccessLogsBucket(): IBucket? =
        unwrap(this).getServerAccessLogsBucket()?.let(IBucket::wrap)

    override fun serverAccessLogsPrefix(): String? = unwrap(this).getServerAccessLogsPrefix()

    override fun targetObjectKeyFormat(): TargetObjectKeyFormat? =
        unwrap(this).getTargetObjectKeyFormat()?.let(TargetObjectKeyFormat::wrap)

    override fun transferAcceleration(): Boolean? = unwrap(this).getTransferAcceleration()

    override fun versioned(): Boolean? = unwrap(this).getVersioned()

    override fun websiteErrorDocument(): String? = unwrap(this).getWebsiteErrorDocument()

    override fun websiteIndexDocument(): String? = unwrap(this).getWebsiteIndexDocument()

    override fun websiteRedirect(): RedirectTarget? =
        unwrap(this).getWebsiteRedirect()?.let(RedirectTarget::wrap)

    override fun websiteRoutingRules(): List<RoutingRule> =
        unwrap(this).getWebsiteRoutingRules()?.map(RoutingRule::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.BucketProps): BucketProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BucketProps): software.amazon.awscdk.services.s3.BucketProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.BucketProps
  }
}
