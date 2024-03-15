@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucket internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

  public open fun accelerateConfiguration(`value`: IResolvable) {
    unwrap(this).setAccelerateConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun accelerateConfiguration(`value`: AccelerateConfigurationProperty) {
    unwrap(this).setAccelerateConfiguration(`value`.let(AccelerateConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7a73f48ce5baa3308868832e061fb6ed212fafdb3343da976a3c24291b3a435")
  public open
      fun accelerateConfiguration(`value`: AccelerateConfigurationProperty.Builder.() -> Unit): Unit
      = accelerateConfiguration(AccelerateConfigurationProperty(`value`))

  public open fun accessControl(): String? = unwrap(this).getAccessControl()

  public open fun accessControl(`value`: String) {
    unwrap(this).setAccessControl(`value`)
  }

  public open fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

  public open fun analyticsConfigurations(`value`: IResolvable) {
    unwrap(this).setAnalyticsConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun analyticsConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setAnalyticsConfigurations(__idx_ac66f0)
  }

  public open fun analyticsConfigurations(vararg __idx_ac66f0: Any): Unit =
      analyticsConfigurations(__idx_ac66f0.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  public open fun attrDualStackDomainName(): String = unwrap(this).getAttrDualStackDomainName()

  public open fun attrRegionalDomainName(): String = unwrap(this).getAttrRegionalDomainName()

  public open fun attrWebsiteUrl(): String = unwrap(this).getAttrWebsiteUrl()

  public open fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  public open fun bucketEncryption(`value`: IResolvable) {
    unwrap(this).setBucketEncryption(`value`.let(IResolvable::unwrap))
  }

  public open fun bucketEncryption(`value`: BucketEncryptionProperty) {
    unwrap(this).setBucketEncryption(`value`.let(BucketEncryptionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cab07ffd4ef2f5c3f3a3a96f2ec1f20a4babd0a7a5b71bf95c45715f262aa9e4")
  public open fun bucketEncryption(`value`: BucketEncryptionProperty.Builder.() -> Unit): Unit =
      bucketEncryption(BucketEncryptionProperty(`value`))

  public open fun bucketName(): String? = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public open fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public open fun corsConfiguration(`value`: IResolvable) {
    unwrap(this).setCorsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun corsConfiguration(`value`: CorsConfigurationProperty) {
    unwrap(this).setCorsConfiguration(`value`.let(CorsConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("71d099e546d2586c68742c5bc9dd19e3633ae279b97b0405a372e629b831d65d")
  public open fun corsConfiguration(`value`: CorsConfigurationProperty.Builder.() -> Unit): Unit =
      corsConfiguration(CorsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun intelligentTieringConfigurations(): Any? =
      unwrap(this).getIntelligentTieringConfigurations()

  public open fun intelligentTieringConfigurations(`value`: IResolvable) {
    unwrap(this).setIntelligentTieringConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun intelligentTieringConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setIntelligentTieringConfigurations(__idx_ac66f0)
  }

  public open fun intelligentTieringConfigurations(vararg __idx_ac66f0: Any): Unit =
      intelligentTieringConfigurations(__idx_ac66f0.toList())

  public open fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

  public open fun inventoryConfigurations(`value`: IResolvable) {
    unwrap(this).setInventoryConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun inventoryConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setInventoryConfigurations(__idx_ac66f0)
  }

  public open fun inventoryConfigurations(vararg __idx_ac66f0: Any): Unit =
      inventoryConfigurations(__idx_ac66f0.toList())

  public open fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  public open fun lifecycleConfiguration(`value`: IResolvable) {
    unwrap(this).setLifecycleConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty) {
    unwrap(this).setLifecycleConfiguration(`value`.let(LifecycleConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97dadd7ae868062705450c20268b14e24ff3d191c50d4daec7530b9d952fa94f")
  public open
      fun lifecycleConfiguration(`value`: LifecycleConfigurationProperty.Builder.() -> Unit): Unit =
      lifecycleConfiguration(LifecycleConfigurationProperty(`value`))

  public open fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public open fun loggingConfiguration(`value`: IResolvable) {
    unwrap(this).setLoggingConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty) {
    unwrap(this).setLoggingConfiguration(`value`.let(LoggingConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d9326b8150b42b4ed6e8c7a63f01a53d21bbe4f4bd488a22508df622e6020266")
  public open fun loggingConfiguration(`value`: LoggingConfigurationProperty.Builder.() -> Unit):
      Unit = loggingConfiguration(LoggingConfigurationProperty(`value`))

  public open fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

  public open fun metricsConfigurations(`value`: IResolvable) {
    unwrap(this).setMetricsConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun metricsConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricsConfigurations(__idx_ac66f0)
  }

  public open fun metricsConfigurations(vararg __idx_ac66f0: Any): Unit =
      metricsConfigurations(__idx_ac66f0.toList())

  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90a714e8628416ff24fec60901cca5af7ecd51a60a4d61cb230b053815f39e82")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  public open fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

  public open fun objectLockConfiguration(`value`: IResolvable) {
    unwrap(this).setObjectLockConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun objectLockConfiguration(`value`: ObjectLockConfigurationProperty) {
    unwrap(this).setObjectLockConfiguration(`value`.let(ObjectLockConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7498771a97b1a83de040af21d9c576e5798ec802e19ec979ffe682e0f124cedf")
  public open
      fun objectLockConfiguration(`value`: ObjectLockConfigurationProperty.Builder.() -> Unit): Unit
      = objectLockConfiguration(ObjectLockConfigurationProperty(`value`))

  public open fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

  public open fun objectLockEnabled(`value`: Boolean) {
    unwrap(this).setObjectLockEnabled(`value`)
  }

  public open fun objectLockEnabled(`value`: IResolvable) {
    unwrap(this).setObjectLockEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

  public open fun ownershipControls(`value`: IResolvable) {
    unwrap(this).setOwnershipControls(`value`.let(IResolvable::unwrap))
  }

  public open fun ownershipControls(`value`: OwnershipControlsProperty) {
    unwrap(this).setOwnershipControls(`value`.let(OwnershipControlsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("82cb9d28b7a0f1ca3cd7f2bbc0b6fc6dd31b07f9052b458dd4756a47b9ead4e7")
  public open fun ownershipControls(`value`: OwnershipControlsProperty.Builder.() -> Unit): Unit =
      ownershipControls(OwnershipControlsProperty(`value`))

  public open fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  public open fun publicAccessBlockConfiguration(`value`: IResolvable) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty) {
    unwrap(this).setPublicAccessBlockConfiguration(`value`.let(PublicAccessBlockConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c49a87fb524ead2c15621d3c133ca97098205108d6b274b7f36dd9be34a9da63")
  public open
      fun publicAccessBlockConfiguration(`value`: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
      Unit = publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(`value`))

  public open fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35b8dd2248b9d2fc61177f47518a630899f3cf4610068cd9bea56000889b6b4b")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  public open fun versioningConfiguration(`value`: IResolvable) {
    unwrap(this).setVersioningConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun versioningConfiguration(`value`: VersioningConfigurationProperty) {
    unwrap(this).setVersioningConfiguration(`value`.let(VersioningConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ae147c1d499f529b5489f48654735e0f9109a0e07db6c8387dd35b0a3e759e2")
  public open
      fun versioningConfiguration(`value`: VersioningConfigurationProperty.Builder.() -> Unit): Unit
      = versioningConfiguration(VersioningConfigurationProperty(`value`))

  public open fun websiteConfiguration(): Any? = unwrap(this).getWebsiteConfiguration()

  public open fun websiteConfiguration(`value`: IResolvable) {
    unwrap(this).setWebsiteConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun websiteConfiguration(`value`: WebsiteConfigurationProperty) {
    unwrap(this).setWebsiteConfiguration(`value`.let(WebsiteConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec54d68491c7c4e814b278ffa7800c0d0e03d43e094554dbf6a4167446b094c2")
  public open fun websiteConfiguration(`value`: WebsiteConfigurationProperty.Builder.() -> Unit):
      Unit = websiteConfiguration(WebsiteConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable)

    public fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d00eae5db0dcb40ec3b29301ef5657d71ea073cb12bbfe73105c1cc3b834aaf")
    public
        fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty.Builder.() -> Unit)

    public fun accessControl(accessControl: String)

    public fun analyticsConfigurations(analyticsConfigurations: IResolvable)

    public fun analyticsConfigurations(analyticsConfigurations: List<Any>)

    public fun analyticsConfigurations(vararg analyticsConfigurations: Any)

    public fun bucketEncryption(bucketEncryption: IResolvable)

    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebcb7c17d411750b2f75f4e938ef6700a42e1c90624324aa83db87013d5ed712")
    public fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit)

    public fun bucketName(bucketName: String)

    public fun corsConfiguration(corsConfiguration: IResolvable)

    public fun corsConfiguration(corsConfiguration: CorsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5e9ba14372cccffc4e7871c656864cbbcc7cb9d0216cc850276da4e6a873e2c")
    public fun corsConfiguration(corsConfiguration: CorsConfigurationProperty.Builder.() -> Unit)

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable)

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>)

    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any)

    public fun inventoryConfigurations(inventoryConfigurations: IResolvable)

    public fun inventoryConfigurations(inventoryConfigurations: List<Any>)

    public fun inventoryConfigurations(vararg inventoryConfigurations: Any)

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    public fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dbbaa2b2597aab1aaf9ce400dcd366ad67e6916825cc9590bdbf90cfc7ede89")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d26fd90a1e29625730bec9f94c832ce940d1445ab8f90af03bce65f699e92002")
    public
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit)

    public fun metricsConfigurations(metricsConfigurations: IResolvable)

    public fun metricsConfigurations(metricsConfigurations: List<Any>)

    public fun metricsConfigurations(vararg metricsConfigurations: Any)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1941b41ecd0c5b8d822f40c57f36e8ed016fb000fe7d63b0d2b7c1889eed1b5")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    public fun objectLockConfiguration(objectLockConfiguration: IResolvable)

    public fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b10c12177b91999519c590896e250f7e7bb33cdecfc33d927a11aa64f4d7fcb8")
    public
        fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty.Builder.() -> Unit)

    public fun objectLockEnabled(objectLockEnabled: Boolean)

    public fun objectLockEnabled(objectLockEnabled: IResolvable)

    public fun ownershipControls(ownershipControls: IResolvable)

    public fun ownershipControls(ownershipControls: OwnershipControlsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cc9ca38ed9e286cb88cdaa5e6a6b8efac68c748ae62bba4f9a1fea0a5eb54cb")
    public fun ownershipControls(ownershipControls: OwnershipControlsProperty.Builder.() -> Unit)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f71c1cdc7a7e8211928dd8456b0c06dbf20f87536904b772db197823e87bf02")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab88a85173a0862c0c9f1f4e3f278ce766ae64c7a53238676ea31fd7556cba11")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    public fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d492ca26a7ac967006901d0b4a1909c75a10eb9c474f96f53d132a3ba20183")
    public
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit)

    public fun websiteConfiguration(websiteConfiguration: IResolvable)

    public fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    override fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(IResolvable::unwrap))
    }

    override fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(AccelerateConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0d00eae5db0dcb40ec3b29301ef5657d71ea073cb12bbfe73105c1cc3b834aaf")
    override
        fun accelerateConfiguration(accelerateConfiguration: AccelerateConfigurationProperty.Builder.() -> Unit):
        Unit = accelerateConfiguration(AccelerateConfigurationProperty(accelerateConfiguration))

    override fun accessControl(accessControl: String) {
      cdkBuilder.accessControl(accessControl)
    }

    override fun analyticsConfigurations(analyticsConfigurations: IResolvable) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations.let(IResolvable::unwrap))
    }

    override fun analyticsConfigurations(analyticsConfigurations: List<Any>) {
      cdkBuilder.analyticsConfigurations(analyticsConfigurations)
    }

    override fun analyticsConfigurations(vararg analyticsConfigurations: Any): Unit =
        analyticsConfigurations(analyticsConfigurations.toList())

    override fun bucketEncryption(bucketEncryption: IResolvable) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(IResolvable::unwrap))
    }

    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(BucketEncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ebcb7c17d411750b2f75f4e938ef6700a42e1c90624324aa83db87013d5ed712")
    override fun bucketEncryption(bucketEncryption: BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(BucketEncryptionProperty(bucketEncryption))

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    override fun corsConfiguration(corsConfiguration: CorsConfigurationProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CorsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5e9ba14372cccffc4e7871c656864cbbcc7cb9d0216cc850276da4e6a873e2c")
    override fun corsConfiguration(corsConfiguration: CorsConfigurationProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CorsConfigurationProperty(corsConfiguration))

    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations.let(IResolvable::unwrap))
    }

    override fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>) {
      cdkBuilder.intelligentTieringConfigurations(intelligentTieringConfigurations)
    }

    override fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any):
        Unit = intelligentTieringConfigurations(intelligentTieringConfigurations.toList())

    override fun inventoryConfigurations(inventoryConfigurations: IResolvable) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations.let(IResolvable::unwrap))
    }

    override fun inventoryConfigurations(inventoryConfigurations: List<Any>) {
      cdkBuilder.inventoryConfigurations(inventoryConfigurations)
    }

    override fun inventoryConfigurations(vararg inventoryConfigurations: Any): Unit =
        inventoryConfigurations(inventoryConfigurations.toList())

    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    override fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(LifecycleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dbbaa2b2597aab1aaf9ce400dcd366ad67e6916825cc9590bdbf90cfc7ede89")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit = lifecycleConfiguration(LifecycleConfigurationProperty(lifecycleConfiguration))

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d26fd90a1e29625730bec9f94c832ce940d1445ab8f90af03bce65f699e92002")
    override
        fun loggingConfiguration(loggingConfiguration: LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(LoggingConfigurationProperty(loggingConfiguration))

    override fun metricsConfigurations(metricsConfigurations: IResolvable) {
      cdkBuilder.metricsConfigurations(metricsConfigurations.let(IResolvable::unwrap))
    }

    override fun metricsConfigurations(metricsConfigurations: List<Any>) {
      cdkBuilder.metricsConfigurations(metricsConfigurations)
    }

    override fun metricsConfigurations(vararg metricsConfigurations: Any): Unit =
        metricsConfigurations(metricsConfigurations.toList())

    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f1941b41ecd0c5b8d822f40c57f36e8ed016fb000fe7d63b0d2b7c1889eed1b5")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    override fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(IResolvable::unwrap))
    }

    override fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(ObjectLockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b10c12177b91999519c590896e250f7e7bb33cdecfc33d927a11aa64f4d7fcb8")
    override
        fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfigurationProperty.Builder.() -> Unit):
        Unit = objectLockConfiguration(ObjectLockConfigurationProperty(objectLockConfiguration))

    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    override fun objectLockEnabled(objectLockEnabled: IResolvable) {
      cdkBuilder.objectLockEnabled(objectLockEnabled.let(IResolvable::unwrap))
    }

    override fun ownershipControls(ownershipControls: IResolvable) {
      cdkBuilder.ownershipControls(ownershipControls.let(IResolvable::unwrap))
    }

    override fun ownershipControls(ownershipControls: OwnershipControlsProperty) {
      cdkBuilder.ownershipControls(ownershipControls.let(OwnershipControlsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cc9ca38ed9e286cb88cdaa5e6a6b8efac68c748ae62bba4f9a1fea0a5eb54cb")
    override fun ownershipControls(ownershipControls: OwnershipControlsProperty.Builder.() -> Unit):
        Unit = ownershipControls(OwnershipControlsProperty(ownershipControls))

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f71c1cdc7a7e8211928dd8456b0c06dbf20f87536904b772db197823e87bf02")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab88a85173a0862c0c9f1f4e3f278ce766ae64c7a53238676ea31fd7556cba11")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    override fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(VersioningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d492ca26a7ac967006901d0b4a1909c75a10eb9c474f96f53d132a3ba20183")
    override
        fun versioningConfiguration(versioningConfiguration: VersioningConfigurationProperty.Builder.() -> Unit):
        Unit = versioningConfiguration(VersioningConfigurationProperty(versioningConfiguration))

    override fun websiteConfiguration(websiteConfiguration: IResolvable) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(IResolvable::unwrap))
    }

    override fun websiteConfiguration(websiteConfiguration: WebsiteConfigurationProperty) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(WebsiteConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    public fun s3Key(): Any

    @CdkDslMarker
    public interface Builder {
      public fun s3Key(s3Key: IResolvable)

      public fun s3Key(s3Key: S3KeyFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48a6cafe7910b07fe72bf6c7f1255486ddf8a354b44c38cb9ab8f0e484617160")
      public fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty.builder()

      override fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key.let(IResolvable::unwrap))
      }

      override fun s3Key(s3Key: S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key.let(S3KeyFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    public fun deleteMarkerReplication(): Any? = unwrap(this).getDeleteMarkerReplication()

    public fun destination(): Any

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun id(): String? = unwrap(this).getId()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun sourceSelectionCriteria(): Any? = unwrap(this).getSourceSelectionCriteria()

    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun deleteMarkerReplication(deleteMarkerReplication: IResolvable)

      public fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d15bab5321c0bef0cfe965ea5a0872cd8622fc295e5149a7488ceb7737cd7e20")
      public
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty.Builder.() -> Unit)

      public fun destination(destination: IResolvable)

      public fun destination(destination: ReplicationDestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3adb6b349839374139267b1c0049291843ae0d2decc8b4b32b2d851d4c53b671")
      public fun destination(destination: ReplicationDestinationProperty.Builder.() -> Unit)

      public fun filter(filter: IResolvable)

      public fun filter(filter: ReplicationRuleFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f377482cbc671d62a43d033a11505d197f68ac7ff05289024569199962f44ef")
      public fun filter(filter: ReplicationRuleFilterProperty.Builder.() -> Unit)

      public fun id(id: String)

      public fun prefix(prefix: String)

      public fun priority(priority: Number)

      public fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable)

      public fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9706dd73a6a63e34a861632a397f4d06ad4e45f578bdc147163eab6309f9fb19")
      public
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty.Builder.() -> Unit)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty.builder()

      override fun deleteMarkerReplication(deleteMarkerReplication: IResolvable) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication.let(IResolvable::unwrap))
      }

      override
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty) {
        cdkBuilder.deleteMarkerReplication(deleteMarkerReplication.let(DeleteMarkerReplicationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d15bab5321c0bef0cfe965ea5a0872cd8622fc295e5149a7488ceb7737cd7e20")
      override
          fun deleteMarkerReplication(deleteMarkerReplication: DeleteMarkerReplicationProperty.Builder.() -> Unit):
          Unit = deleteMarkerReplication(DeleteMarkerReplicationProperty(deleteMarkerReplication))

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: ReplicationDestinationProperty) {
        cdkBuilder.destination(destination.let(ReplicationDestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3adb6b349839374139267b1c0049291843ae0d2decc8b4b32b2d851d4c53b671")
      override fun destination(destination: ReplicationDestinationProperty.Builder.() -> Unit): Unit
          = destination(ReplicationDestinationProperty(destination))

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: ReplicationRuleFilterProperty) {
        cdkBuilder.filter(filter.let(ReplicationRuleFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3f377482cbc671d62a43d033a11505d197f68ac7ff05289024569199962f44ef")
      override fun filter(filter: ReplicationRuleFilterProperty.Builder.() -> Unit): Unit =
          filter(ReplicationRuleFilterProperty(filter))

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun sourceSelectionCriteria(sourceSelectionCriteria: IResolvable) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria.let(IResolvable::unwrap))
      }

      override
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty) {
        cdkBuilder.sourceSelectionCriteria(sourceSelectionCriteria.let(SourceSelectionCriteriaProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9706dd73a6a63e34a861632a397f4d06ad4e45f578bdc147163eab6309f9fb19")
      override
          fun sourceSelectionCriteria(sourceSelectionCriteria: SourceSelectionCriteriaProperty.Builder.() -> Unit):
          Unit = sourceSelectionCriteria(SourceSelectionCriteriaProperty(sourceSelectionCriteria))

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleProperty,
    ) : CdkObject(cdkObject), ReplicationRuleProperty {
      override fun deleteMarkerReplication(): Any? = unwrap(this).getDeleteMarkerReplication()

      override fun destination(): Any = unwrap(this).getDestination()

      override fun filter(): Any? = unwrap(this).getFilter()

      override fun id(): String? = unwrap(this).getId()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun priority(): Number? = unwrap(this).getPriority()

      override fun sourceSelectionCriteria(): Any? = unwrap(this).getSourceSelectionCriteria()

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
    public fun owner(): String

    @CdkDslMarker
    public interface Builder {
      public fun owner(owner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AccessControlTranslationProperty.builder()

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
    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.builder()

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty,
    ) : CdkObject(cdkObject), LifecycleConfigurationProperty {
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
    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    @CdkDslMarker
    public interface Builder {
      public fun prefix(prefix: String)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty.builder()

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty,
    ) : CdkObject(cdkObject), ReplicationRuleAndOperatorProperty {
      override fun prefix(): String? = unwrap(this).getPrefix()

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
    public fun eventThreshold(): Any? = unwrap(this).getEventThreshold()

    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun eventThreshold(eventThreshold: IResolvable)

      public fun eventThreshold(eventThreshold: ReplicationTimeValueProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd2ea3b96f208a250712f59c1cf61c385be277cce73470e2508e0ac47ce1b1b6")
      public fun eventThreshold(eventThreshold: ReplicationTimeValueProperty.Builder.() -> Unit)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty.builder()

      override fun eventThreshold(eventThreshold: IResolvable) {
        cdkBuilder.eventThreshold(eventThreshold.let(IResolvable::unwrap))
      }

      override fun eventThreshold(eventThreshold: ReplicationTimeValueProperty) {
        cdkBuilder.eventThreshold(eventThreshold.let(ReplicationTimeValueProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd2ea3b96f208a250712f59c1cf61c385be277cce73470e2508e0ac47ce1b1b6")
      override fun eventThreshold(eventThreshold: ReplicationTimeValueProperty.Builder.() -> Unit):
          Unit = eventThreshold(ReplicationTimeValueProperty(eventThreshold))

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.MetricsProperty,
    ) : CdkObject(cdkObject), MetricsProperty {
      override fun eventThreshold(): Any? = unwrap(this).getEventThreshold()

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
    public fun storageClass(): String

    public fun transitionDate(): Any? = unwrap(this).getTransitionDate()

    public fun transitionInDays(): Number? = unwrap(this).getTransitionInDays()

    @CdkDslMarker
    public interface Builder {
      public fun storageClass(storageClass: String)

      public fun transitionDate(transitionDate: IResolvable)

      public fun transitionDate(transitionDate: Instant)

      public fun transitionInDays(transitionInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty.builder()

      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

      override fun transitionDate(transitionDate: IResolvable) {
        cdkBuilder.transitionDate(transitionDate.let(IResolvable::unwrap))
      }

      override fun transitionDate(transitionDate: Instant) {
        cdkBuilder.transitionDate(transitionDate)
      }

      override fun transitionInDays(transitionInDays: Number) {
        cdkBuilder.transitionInDays(transitionInDays)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TransitionProperty,
    ) : CdkObject(cdkObject), TransitionProperty {
      override fun storageClass(): String = unwrap(this).getStorageClass()

      override fun transitionDate(): Any? = unwrap(this).getTransitionDate()

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
    public fun accelerationStatus(): String

    @CdkDslMarker
    public interface Builder {
      public fun accelerationStatus(accelerationStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AccelerateConfigurationProperty.builder()

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
    public fun replicaModifications(): Any? = unwrap(this).getReplicaModifications()

    public fun sseKmsEncryptedObjects(): Any? = unwrap(this).getSseKmsEncryptedObjects()

    @CdkDslMarker
    public interface Builder {
      public fun replicaModifications(replicaModifications: IResolvable)

      public fun replicaModifications(replicaModifications: ReplicaModificationsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde846bad4ae445ce8130cf4d4c828d42edf0194358d05fa4865412dc67103ce")
      public
          fun replicaModifications(replicaModifications: ReplicaModificationsProperty.Builder.() -> Unit)

      public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable)

      public fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("accd20bbaabf248446f3975a75e607e78fcd5060e57b8a883c8977638ec0ac3e")
      public
          fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.SourceSelectionCriteriaProperty.builder()

      override fun replicaModifications(replicaModifications: IResolvable) {
        cdkBuilder.replicaModifications(replicaModifications.let(IResolvable::unwrap))
      }

      override fun replicaModifications(replicaModifications: ReplicaModificationsProperty) {
        cdkBuilder.replicaModifications(replicaModifications.let(ReplicaModificationsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde846bad4ae445ce8130cf4d4c828d42edf0194358d05fa4865412dc67103ce")
      override
          fun replicaModifications(replicaModifications: ReplicaModificationsProperty.Builder.() -> Unit):
          Unit = replicaModifications(ReplicaModificationsProperty(replicaModifications))

      override fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: IResolvable) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects.let(IResolvable::unwrap))
      }

      override fun sseKmsEncryptedObjects(sseKmsEncryptedObjects: SseKmsEncryptedObjectsProperty) {
        cdkBuilder.sseKmsEncryptedObjects(sseKmsEncryptedObjects.let(SseKmsEncryptedObjectsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun replicaModifications(): Any? = unwrap(this).getReplicaModifications()

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
    public fun destination(): Any

    public fun enabled(): Any

    public fun id(): String

    public fun includedObjectVersions(): String

    public fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun scheduleFrequency(): String

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: DestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("486f3cdaa85acca0232cb1aed8c563cc6128e0faffd70e96fd67d16e8e9c4f62")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun id(id: String)

      public fun includedObjectVersions(includedObjectVersions: String)

      public fun optionalFields(optionalFields: List<String>)

      public fun optionalFields(vararg optionalFields: String)

      public fun prefix(prefix: String)

      public fun scheduleFrequency(scheduleFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.InventoryConfigurationProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("486f3cdaa85acca0232cb1aed8c563cc6128e0faffd70e96fd67d16e8e9c4f62")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun includedObjectVersions(includedObjectVersions: String) {
        cdkBuilder.includedObjectVersions(includedObjectVersions)
      }

      override fun optionalFields(optionalFields: List<String>) {
        cdkBuilder.optionalFields(optionalFields)
      }

      override fun optionalFields(vararg optionalFields: String): Unit =
          optionalFields(optionalFields.toList())

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

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
      override fun destination(): Any = unwrap(this).getDestination()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun id(): String = unwrap(this).getId()

      override fun includedObjectVersions(): String = unwrap(this).getIncludedObjectVersions()

      override fun optionalFields(): List<String> = unwrap(this).getOptionalFields() ?: emptyList()

      override fun prefix(): String? = unwrap(this).getPrefix()

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
    public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

    public fun allowedMethods(): List<String>

    public fun allowedOrigins(): List<String>

    public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

    public fun id(): String? = unwrap(this).getId()

    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    @CdkDslMarker
    public interface Builder {
      public fun allowedHeaders(allowedHeaders: List<String>)

      public fun allowedHeaders(vararg allowedHeaders: String)

      public fun allowedMethods(allowedMethods: List<String>)

      public fun allowedMethods(vararg allowedMethods: String)

      public fun allowedOrigins(allowedOrigins: List<String>)

      public fun allowedOrigins(vararg allowedOrigins: String)

      public fun exposedHeaders(exposedHeaders: List<String>)

      public fun exposedHeaders(vararg exposedHeaders: String)

      public fun id(id: String)

      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.Builder
          = software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty.builder()

      override fun allowedHeaders(allowedHeaders: List<String>) {
        cdkBuilder.allowedHeaders(allowedHeaders)
      }

      override fun allowedHeaders(vararg allowedHeaders: String): Unit =
          allowedHeaders(allowedHeaders.toList())

      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      override fun allowedMethods(vararg allowedMethods: String): Unit =
          allowedMethods(allowedMethods.toList())

      override fun allowedOrigins(allowedOrigins: List<String>) {
        cdkBuilder.allowedOrigins(allowedOrigins)
      }

      override fun allowedOrigins(vararg allowedOrigins: String): Unit =
          allowedOrigins(allowedOrigins.toList())

      override fun exposedHeaders(exposedHeaders: List<String>) {
        cdkBuilder.exposedHeaders(exposedHeaders)
      }

      override fun exposedHeaders(vararg exposedHeaders: String): Unit =
          exposedHeaders(exposedHeaders.toList())

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.CorsRuleProperty,
    ) : CdkObject(cdkObject), CorsRuleProperty {
      override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods()

      override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins()

      override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

      override fun id(): String? = unwrap(this).getId()

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
    public fun eventBridgeEnabled(): Any

    @CdkDslMarker
    public interface Builder {
      public fun eventBridgeEnabled(eventBridgeEnabled: Boolean)

      public fun eventBridgeEnabled(eventBridgeEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.EventBridgeConfigurationProperty.builder()

      override fun eventBridgeEnabled(eventBridgeEnabled: Boolean) {
        cdkBuilder.eventBridgeEnabled(eventBridgeEnabled)
      }

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
    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.VersioningConfigurationProperty.builder()

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
    public fun id(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun status(): String

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    public fun tierings(): Any

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun prefix(prefix: String)

      public fun status(status: String)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)

      public fun tierings(tierings: IResolvable)

      public fun tierings(tierings: List<Any>)

      public fun tierings(vararg tierings: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      override fun tierings(tierings: IResolvable) {
        cdkBuilder.tierings(tierings.let(IResolvable::unwrap))
      }

      override fun tierings(tierings: List<Any>) {
        cdkBuilder.tierings(tierings)
      }

      override fun tierings(vararg tierings: Any): Unit = tierings(tierings.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty,
    ) : CdkObject(cdkObject), IntelligentTieringConfigurationProperty {
      override fun id(): String = unwrap(this).getId()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun status(): String = unwrap(this).getStatus()

      override fun tagFilters(): Any? = unwrap(this).getTagFilters()

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
    public fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

    public fun bucketArn(): String

    public fun format(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun bucketAccountId(bucketAccountId: String)

      public fun bucketArn(bucketArn: String)

      public fun format(format: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty.builder()

      override fun bucketAccountId(bucketAccountId: String) {
        cdkBuilder.bucketAccountId(bucketAccountId)
      }

      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DestinationProperty,
    ) : CdkObject(cdkObject), DestinationProperty {
      override fun bucketAccountId(): String? = unwrap(this).getBucketAccountId()

      override fun bucketArn(): String = unwrap(this).getBucketArn()

      override fun format(): String = unwrap(this).getFormat()

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
    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty.builder()

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsProperty,
    ) : CdkObject(cdkObject), OwnershipControlsProperty {
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
    public fun eventBridgeConfiguration(): Any? = unwrap(this).getEventBridgeConfiguration()

    public fun lambdaConfigurations(): Any? = unwrap(this).getLambdaConfigurations()

    public fun queueConfigurations(): Any? = unwrap(this).getQueueConfigurations()

    public fun topicConfigurations(): Any? = unwrap(this).getTopicConfigurations()

    @CdkDslMarker
    public interface Builder {
      public fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable)

      public
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b87f2c732256e93c0de8c1e342109ba7764e2cab8995f4d1034b9bcb767ca8fe")
      public
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty.Builder.() -> Unit)

      public fun lambdaConfigurations(lambdaConfigurations: IResolvable)

      public fun lambdaConfigurations(lambdaConfigurations: List<Any>)

      public fun lambdaConfigurations(vararg lambdaConfigurations: Any)

      public fun queueConfigurations(queueConfigurations: IResolvable)

      public fun queueConfigurations(queueConfigurations: List<Any>)

      public fun queueConfigurations(vararg queueConfigurations: Any)

      public fun topicConfigurations(topicConfigurations: IResolvable)

      public fun topicConfigurations(topicConfigurations: List<Any>)

      public fun topicConfigurations(vararg topicConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.builder()

      override fun eventBridgeConfiguration(eventBridgeConfiguration: IResolvable) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty) {
        cdkBuilder.eventBridgeConfiguration(eventBridgeConfiguration.let(EventBridgeConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b87f2c732256e93c0de8c1e342109ba7764e2cab8995f4d1034b9bcb767ca8fe")
      override
          fun eventBridgeConfiguration(eventBridgeConfiguration: EventBridgeConfigurationProperty.Builder.() -> Unit):
          Unit =
          eventBridgeConfiguration(EventBridgeConfigurationProperty(eventBridgeConfiguration))

      override fun lambdaConfigurations(lambdaConfigurations: IResolvable) {
        cdkBuilder.lambdaConfigurations(lambdaConfigurations.let(IResolvable::unwrap))
      }

      override fun lambdaConfigurations(lambdaConfigurations: List<Any>) {
        cdkBuilder.lambdaConfigurations(lambdaConfigurations)
      }

      override fun lambdaConfigurations(vararg lambdaConfigurations: Any): Unit =
          lambdaConfigurations(lambdaConfigurations.toList())

      override fun queueConfigurations(queueConfigurations: IResolvable) {
        cdkBuilder.queueConfigurations(queueConfigurations.let(IResolvable::unwrap))
      }

      override fun queueConfigurations(queueConfigurations: List<Any>) {
        cdkBuilder.queueConfigurations(queueConfigurations)
      }

      override fun queueConfigurations(vararg queueConfigurations: Any): Unit =
          queueConfigurations(queueConfigurations.toList())

      override fun topicConfigurations(topicConfigurations: IResolvable) {
        cdkBuilder.topicConfigurations(topicConfigurations.let(IResolvable::unwrap))
      }

      override fun topicConfigurations(topicConfigurations: List<Any>) {
        cdkBuilder.topicConfigurations(topicConfigurations)
      }

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
      override fun eventBridgeConfiguration(): Any? = unwrap(this).getEventBridgeConfiguration()

      override fun lambdaConfigurations(): Any? = unwrap(this).getLambdaConfigurations()

      override fun queueConfigurations(): Any? = unwrap(this).getQueueConfigurations()

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
    public fun errorDocument(): String? = unwrap(this).getErrorDocument()

    public fun indexDocument(): String? = unwrap(this).getIndexDocument()

    public fun redirectAllRequestsTo(): Any? = unwrap(this).getRedirectAllRequestsTo()

    public fun routingRules(): Any? = unwrap(this).getRoutingRules()

    @CdkDslMarker
    public interface Builder {
      public fun errorDocument(errorDocument: String)

      public fun indexDocument(indexDocument: String)

      public fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable)

      public fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5e4ba853961da74edbf50bd3874794dcd2e10dce7358e3cbd0debe8fa79ad99")
      public
          fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty.Builder.() -> Unit)

      public fun routingRules(routingRules: IResolvable)

      public fun routingRules(routingRules: List<Any>)

      public fun routingRules(vararg routingRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty.builder()

      override fun errorDocument(errorDocument: String) {
        cdkBuilder.errorDocument(errorDocument)
      }

      override fun indexDocument(indexDocument: String) {
        cdkBuilder.indexDocument(indexDocument)
      }

      override fun redirectAllRequestsTo(redirectAllRequestsTo: IResolvable) {
        cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo.let(IResolvable::unwrap))
      }

      override fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty) {
        cdkBuilder.redirectAllRequestsTo(redirectAllRequestsTo.let(RedirectAllRequestsToProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5e4ba853961da74edbf50bd3874794dcd2e10dce7358e3cbd0debe8fa79ad99")
      override
          fun redirectAllRequestsTo(redirectAllRequestsTo: RedirectAllRequestsToProperty.Builder.() -> Unit):
          Unit = redirectAllRequestsTo(RedirectAllRequestsToProperty(redirectAllRequestsTo))

      override fun routingRules(routingRules: IResolvable) {
        cdkBuilder.routingRules(routingRules.let(IResolvable::unwrap))
      }

      override fun routingRules(routingRules: List<Any>) {
        cdkBuilder.routingRules(routingRules)
      }

      override fun routingRules(vararg routingRules: Any): Unit =
          routingRules(routingRules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.WebsiteConfigurationProperty,
    ) : CdkObject(cdkObject), WebsiteConfigurationProperty {
      override fun errorDocument(): String? = unwrap(this).getErrorDocument()

      override fun indexDocument(): String? = unwrap(this).getIndexDocument()

      override fun redirectAllRequestsTo(): Any? = unwrap(this).getRedirectAllRequestsTo()

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
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.Builder
          = software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TagFilterProperty,
    ) : CdkObject(cdkObject), TagFilterProperty {
      override fun key(): String = unwrap(this).getKey()

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
    public fun event(): String

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun queue(): String

    @CdkDslMarker
    public interface Builder {
      public fun event(event: String)

      public fun filter(filter: IResolvable)

      public fun filter(filter: NotificationFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c5c6c62bf6023767ca2ae77dde13140bed1861753444da5357cbb4aa3f0b35c")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      public fun queue(queue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.builder()

      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c5c6c62bf6023767ca2ae77dde13140bed1861753444da5357cbb4aa3f0b35c")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

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
      override fun event(): String = unwrap(this).getEvent()

      override fun filter(): Any? = unwrap(this).getFilter()

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
    public fun role(): String

    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun role(role: String)

      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty.builder()

      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationConfigurationProperty,
    ) : CdkObject(cdkObject), ReplicationConfigurationProperty {
      override fun role(): String = unwrap(this).getRole()

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
    public fun and(): Any? = unwrap(this).getAnd()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tagFilter(): Any? = unwrap(this).getTagFilter()

    @CdkDslMarker
    public interface Builder {
      public fun and(and: IResolvable)

      public fun and(and: ReplicationRuleAndOperatorProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23333c1d41219a2e3a0d3a2a54bb20e58c5c010c6293acc49d54c43a56f51fab")
      public fun and(and: ReplicationRuleAndOperatorProperty.Builder.() -> Unit)

      public fun prefix(prefix: String)

      public fun tagFilter(tagFilter: IResolvable)

      public fun tagFilter(tagFilter: TagFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1ed144bd4f5a914fd492228186e08003e64e4f07438cdaec2935711660b54765")
      public fun tagFilter(tagFilter: TagFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleFilterProperty.builder()

      override fun and(and: IResolvable) {
        cdkBuilder.and(and.let(IResolvable::unwrap))
      }

      override fun and(and: ReplicationRuleAndOperatorProperty) {
        cdkBuilder.and(and.let(ReplicationRuleAndOperatorProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("23333c1d41219a2e3a0d3a2a54bb20e58c5c010c6293acc49d54c43a56f51fab")
      override fun and(and: ReplicationRuleAndOperatorProperty.Builder.() -> Unit): Unit =
          and(ReplicationRuleAndOperatorProperty(and))

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun tagFilter(tagFilter: IResolvable) {
        cdkBuilder.tagFilter(tagFilter.let(IResolvable::unwrap))
      }

      override fun tagFilter(tagFilter: TagFilterProperty) {
        cdkBuilder.tagFilter(tagFilter.let(TagFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun and(): Any? = unwrap(this).getAnd()

      override fun prefix(): String? = unwrap(this).getPrefix()

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
    public fun partitionedPrefix(): Any? = unwrap(this).getPartitionedPrefix()

    public fun simplePrefix(): Any? = unwrap(this).getSimplePrefix()

    @CdkDslMarker
    public interface Builder {
      public fun partitionedPrefix(partitionedPrefix: IResolvable)

      public fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1425d6dbc5168c43516b04bd30bd23cb0541c92f7ada1ba13ab65a618fa89a2a")
      public fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty.Builder.() -> Unit)

      public fun simplePrefix(simplePrefix: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TargetObjectKeyFormatProperty.builder()

      override fun partitionedPrefix(partitionedPrefix: IResolvable) {
        cdkBuilder.partitionedPrefix(partitionedPrefix.let(IResolvable::unwrap))
      }

      override fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty) {
        cdkBuilder.partitionedPrefix(partitionedPrefix.let(PartitionedPrefixProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1425d6dbc5168c43516b04bd30bd23cb0541c92f7ada1ba13ab65a618fa89a2a")
      override
          fun partitionedPrefix(partitionedPrefix: PartitionedPrefixProperty.Builder.() -> Unit):
          Unit = partitionedPrefix(PartitionedPrefixProperty(partitionedPrefix))

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
      override fun partitionedPrefix(): Any? = unwrap(this).getPartitionedPrefix()

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
    public fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

    public fun id(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    @CdkDslMarker
    public interface Builder {
      public fun accessPointArn(accessPointArn: String)

      public fun id(id: String)

      public fun prefix(prefix: String)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty.builder()

      override fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.MetricsConfigurationProperty,
    ) : CdkObject(cdkObject), MetricsConfigurationProperty {
      override fun accessPointArn(): String? = unwrap(this).getAccessPointArn()

      override fun id(): String = unwrap(this).getId()

      override fun prefix(): String? = unwrap(this).getPrefix()

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
    public fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

    public fun noncurrentDays(): Number

    @CdkDslMarker
    public interface Builder {
      public fun newerNoncurrentVersions(newerNoncurrentVersions: Number)

      public fun noncurrentDays(noncurrentDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionExpirationProperty.builder()

      override fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
      }

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
      override fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

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
    public fun destination(): Any

    public fun outputSchemaVersion(): String

    @CdkDslMarker
    public interface Builder {
      public fun destination(destination: IResolvable)

      public fun destination(destination: DestinationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("086b3a0be4874adb40dc8fdc6496d9d22884abb5c60f23094a66b3088c09bf70")
      public fun destination(destination: DestinationProperty.Builder.() -> Unit)

      public fun outputSchemaVersion(outputSchemaVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty.builder()

      override fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination.let(IResolvable::unwrap))
      }

      override fun destination(destination: DestinationProperty) {
        cdkBuilder.destination(destination.let(DestinationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("086b3a0be4874adb40dc8fdc6496d9d22884abb5c60f23094a66b3088c09bf70")
      override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
          destination(DestinationProperty(destination))

      override fun outputSchemaVersion(outputSchemaVersion: String) {
        cdkBuilder.outputSchemaVersion(outputSchemaVersion)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DataExportProperty,
    ) : CdkObject(cdkObject), DataExportProperty {
      override fun destination(): Any = unwrap(this).getDestination()

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
    public fun event(): String

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun function(): String

    @CdkDslMarker
    public interface Builder {
      public fun event(event: String)

      public fun filter(filter: IResolvable)

      public fun filter(filter: NotificationFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcfaefe530d33ecf072876883af958608b5d3dbdf15393cd2865a0db8217c599")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      public fun function(function: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.builder()

      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fcfaefe530d33ecf072876883af958608b5d3dbdf15393cd2865a0db8217c599")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

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
      override fun event(): String = unwrap(this).getEvent()

      override fun filter(): Any? = unwrap(this).getFilter()

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
    public fun rules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty.builder()

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.S3KeyFilterProperty,
    ) : CdkObject(cdkObject), S3KeyFilterProperty {
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
    public fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

    public fun storageClass(): String

    public fun transitionInDays(): Number

    @CdkDslMarker
    public interface Builder {
      public fun newerNoncurrentVersions(newerNoncurrentVersions: Number)

      public fun storageClass(storageClass: String)

      public fun transitionInDays(transitionInDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.NoncurrentVersionTransitionProperty.builder()

      override fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
      }

      override fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
      }

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
      override fun newerNoncurrentVersions(): Number? = unwrap(this).getNewerNoncurrentVersions()

      override fun storageClass(): String = unwrap(this).getStorageClass()

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
    public fun abortIncompleteMultipartUpload(): Any? =
        unwrap(this).getAbortIncompleteMultipartUpload()

    public fun expirationDate(): Any? = unwrap(this).getExpirationDate()

    public fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

    public fun expiredObjectDeleteMarker(): Any? = unwrap(this).getExpiredObjectDeleteMarker()

    public fun id(): String? = unwrap(this).getId()

    public fun noncurrentVersionExpiration(): Any? = unwrap(this).getNoncurrentVersionExpiration()

    public fun noncurrentVersionExpirationInDays(): Number? =
        unwrap(this).getNoncurrentVersionExpirationInDays()

    public fun noncurrentVersionTransition(): Any? = unwrap(this).getNoncurrentVersionTransition()

    public fun noncurrentVersionTransitions(): Any? = unwrap(this).getNoncurrentVersionTransitions()

    public fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

    public fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun status(): String

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    public fun transition(): Any? = unwrap(this).getTransition()

    public fun transitions(): Any? = unwrap(this).getTransitions()

    @CdkDslMarker
    public interface Builder {
      public fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable)

      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("373ac1027961dae8584522f37894a363546ed96a3bf7c73fa39f5c307fdcf17e")
      public
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit)

      public fun expirationDate(expirationDate: IResolvable)

      public fun expirationDate(expirationDate: Instant)

      public fun expirationInDays(expirationInDays: Number)

      public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean)

      public fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable)

      public fun id(id: String)

      public fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable)

      public
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd32ac9594dbb96c48901e44f3aa55497c8801896078f2dae95aa3ad376a003")
      public
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty.Builder.() -> Unit)

      public fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number)

      public fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable)

      public
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("118da244dc40bb1e95131331021544ab13ea7b99488e4515c88e7198028c002d")
      public
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty.Builder.() -> Unit)

      public fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable)

      public fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<Any>)

      public fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any)

      public fun objectSizeGreaterThan(objectSizeGreaterThan: Number)

      public fun objectSizeLessThan(objectSizeLessThan: Number)

      public fun prefix(prefix: String)

      public fun status(status: String)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)

      public fun transition(transition: IResolvable)

      public fun transition(transition: TransitionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbb4accfd7ce57a9f8ecb817fc3d364b1fe559511dbe07c1bac4ffab1f425f72")
      public fun transition(transition: TransitionProperty.Builder.() -> Unit)

      public fun transitions(transitions: IResolvable)

      public fun transitions(transitions: List<Any>)

      public fun transitions(vararg transitions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RuleProperty.builder()

      override fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: IResolvable) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(IResolvable::unwrap))
      }

      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty) {
        cdkBuilder.abortIncompleteMultipartUpload(abortIncompleteMultipartUpload.let(AbortIncompleteMultipartUploadProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("373ac1027961dae8584522f37894a363546ed96a3bf7c73fa39f5c307fdcf17e")
      override
          fun abortIncompleteMultipartUpload(abortIncompleteMultipartUpload: AbortIncompleteMultipartUploadProperty.Builder.() -> Unit):
          Unit =
          abortIncompleteMultipartUpload(AbortIncompleteMultipartUploadProperty(abortIncompleteMultipartUpload))

      override fun expirationDate(expirationDate: IResolvable) {
        cdkBuilder.expirationDate(expirationDate.let(IResolvable::unwrap))
      }

      override fun expirationDate(expirationDate: Instant) {
        cdkBuilder.expirationDate(expirationDate)
      }

      override fun expirationInDays(expirationInDays: Number) {
        cdkBuilder.expirationInDays(expirationInDays)
      }

      override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: Boolean) {
        cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker)
      }

      override fun expiredObjectDeleteMarker(expiredObjectDeleteMarker: IResolvable) {
        cdkBuilder.expiredObjectDeleteMarker(expiredObjectDeleteMarker.let(IResolvable::unwrap))
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun noncurrentVersionExpiration(noncurrentVersionExpiration: IResolvable) {
        cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(IResolvable::unwrap))
      }

      override
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty) {
        cdkBuilder.noncurrentVersionExpiration(noncurrentVersionExpiration.let(NoncurrentVersionExpirationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afd32ac9594dbb96c48901e44f3aa55497c8801896078f2dae95aa3ad376a003")
      override
          fun noncurrentVersionExpiration(noncurrentVersionExpiration: NoncurrentVersionExpirationProperty.Builder.() -> Unit):
          Unit =
          noncurrentVersionExpiration(NoncurrentVersionExpirationProperty(noncurrentVersionExpiration))

      override fun noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays: Number) {
        cdkBuilder.noncurrentVersionExpirationInDays(noncurrentVersionExpirationInDays)
      }

      override fun noncurrentVersionTransition(noncurrentVersionTransition: IResolvable) {
        cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition.let(IResolvable::unwrap))
      }

      override
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty) {
        cdkBuilder.noncurrentVersionTransition(noncurrentVersionTransition.let(NoncurrentVersionTransitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("118da244dc40bb1e95131331021544ab13ea7b99488e4515c88e7198028c002d")
      override
          fun noncurrentVersionTransition(noncurrentVersionTransition: NoncurrentVersionTransitionProperty.Builder.() -> Unit):
          Unit =
          noncurrentVersionTransition(NoncurrentVersionTransitionProperty(noncurrentVersionTransition))

      override fun noncurrentVersionTransitions(noncurrentVersionTransitions: IResolvable) {
        cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions.let(IResolvable::unwrap))
      }

      override fun noncurrentVersionTransitions(noncurrentVersionTransitions: List<Any>) {
        cdkBuilder.noncurrentVersionTransitions(noncurrentVersionTransitions)
      }

      override fun noncurrentVersionTransitions(vararg noncurrentVersionTransitions: Any): Unit =
          noncurrentVersionTransitions(noncurrentVersionTransitions.toList())

      override fun objectSizeGreaterThan(objectSizeGreaterThan: Number) {
        cdkBuilder.objectSizeGreaterThan(objectSizeGreaterThan)
      }

      override fun objectSizeLessThan(objectSizeLessThan: Number) {
        cdkBuilder.objectSizeLessThan(objectSizeLessThan)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      override fun transition(transition: IResolvable) {
        cdkBuilder.transition(transition.let(IResolvable::unwrap))
      }

      override fun transition(transition: TransitionProperty) {
        cdkBuilder.transition(transition.let(TransitionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dbb4accfd7ce57a9f8ecb817fc3d364b1fe559511dbe07c1bac4ffab1f425f72")
      override fun transition(transition: TransitionProperty.Builder.() -> Unit): Unit =
          transition(TransitionProperty(transition))

      override fun transitions(transitions: IResolvable) {
        cdkBuilder.transitions(transitions.let(IResolvable::unwrap))
      }

      override fun transitions(transitions: List<Any>) {
        cdkBuilder.transitions(transitions)
      }

      override fun transitions(vararg transitions: Any): Unit = transitions(transitions.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      override fun abortIncompleteMultipartUpload(): Any? =
          unwrap(this).getAbortIncompleteMultipartUpload()

      override fun expirationDate(): Any? = unwrap(this).getExpirationDate()

      override fun expirationInDays(): Number? = unwrap(this).getExpirationInDays()

      override fun expiredObjectDeleteMarker(): Any? = unwrap(this).getExpiredObjectDeleteMarker()

      override fun id(): String? = unwrap(this).getId()

      override fun noncurrentVersionExpiration(): Any? =
          unwrap(this).getNoncurrentVersionExpiration()

      override fun noncurrentVersionExpirationInDays(): Number? =
          unwrap(this).getNoncurrentVersionExpirationInDays()

      override fun noncurrentVersionTransition(): Any? =
          unwrap(this).getNoncurrentVersionTransition()

      override fun noncurrentVersionTransitions(): Any? =
          unwrap(this).getNoncurrentVersionTransitions()

      override fun objectSizeGreaterThan(): Number? = unwrap(this).getObjectSizeGreaterThan()

      override fun objectSizeLessThan(): Number? = unwrap(this).getObjectSizeLessThan()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun status(): String = unwrap(this).getStatus()

      override fun tagFilters(): Any? = unwrap(this).getTagFilters()

      override fun transition(): Any? = unwrap(this).getTransition()

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
    public fun partitionDateSource(): String? = unwrap(this).getPartitionDateSource()

    @CdkDslMarker
    public interface Builder {
      public fun partitionDateSource(partitionDateSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.PartitionedPrefixProperty.builder()

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
    public fun daysAfterInitiation(): Number

    @CdkDslMarker
    public interface Builder {
      public fun daysAfterInitiation(daysAfterInitiation: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.AbortIncompleteMultipartUploadProperty.builder()

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
    public fun defaultRetention(): Any? = unwrap(this).getDefaultRetention()

    @CdkDslMarker
    public interface Builder {
      public fun defaultRetention(defaultRetention: IResolvable)

      public fun defaultRetention(defaultRetention: DefaultRetentionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e6406f9e899a15d6bba8fdc59e36592ddd109e83a0b19952d00295a89ed2a31")
      public fun defaultRetention(defaultRetention: DefaultRetentionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty.builder()

      override fun defaultRetention(defaultRetention: IResolvable) {
        cdkBuilder.defaultRetention(defaultRetention.let(IResolvable::unwrap))
      }

      override fun defaultRetention(defaultRetention: DefaultRetentionProperty) {
        cdkBuilder.defaultRetention(defaultRetention.let(DefaultRetentionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e6406f9e899a15d6bba8fdc59e36592ddd109e83a0b19952d00295a89ed2a31")
      override fun defaultRetention(defaultRetention: DefaultRetentionProperty.Builder.() -> Unit):
          Unit = defaultRetention(DefaultRetentionProperty(defaultRetention))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ObjectLockRuleProperty,
    ) : CdkObject(cdkObject), ObjectLockRuleProperty {
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
    public fun status(): String? = unwrap(this).getStatus()

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DeleteMarkerReplicationProperty.builder()

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
    public fun destinationBucketName(): String? = unwrap(this).getDestinationBucketName()

    public fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

    public fun targetObjectKeyFormat(): Any? = unwrap(this).getTargetObjectKeyFormat()

    @CdkDslMarker
    public interface Builder {
      public fun destinationBucketName(destinationBucketName: String)

      public fun logFilePrefix(logFilePrefix: String)

      public fun targetObjectKeyFormat(targetObjectKeyFormat: IResolvable)

      public fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0fa8c9ab2c1f7bd1230ee3794703e37b2cdb1ba89cff1942796b03c95f491bc")
      public
          fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.LoggingConfigurationProperty.builder()

      override fun destinationBucketName(destinationBucketName: String) {
        cdkBuilder.destinationBucketName(destinationBucketName)
      }

      override fun logFilePrefix(logFilePrefix: String) {
        cdkBuilder.logFilePrefix(logFilePrefix)
      }

      override fun targetObjectKeyFormat(targetObjectKeyFormat: IResolvable) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(IResolvable::unwrap))
      }

      override fun targetObjectKeyFormat(targetObjectKeyFormat: TargetObjectKeyFormatProperty) {
        cdkBuilder.targetObjectKeyFormat(targetObjectKeyFormat.let(TargetObjectKeyFormatProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun destinationBucketName(): String? = unwrap(this).getDestinationBucketName()

      override fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

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
    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.SseKmsEncryptedObjectsProperty.builder()

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
    public fun accessTier(): String

    public fun days(): Number

    @CdkDslMarker
    public interface Builder {
      public fun accessTier(accessTier: String)

      public fun days(days: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucket.TieringProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TieringProperty.builder()

      override fun accessTier(accessTier: String) {
        cdkBuilder.accessTier(accessTier)
      }

      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.TieringProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.TieringProperty,
    ) : CdkObject(cdkObject), TieringProperty {
      override fun accessTier(): String = unwrap(this).getAccessTier()

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
    public fun accessControlTranslation(): Any? = unwrap(this).getAccessControlTranslation()

    public fun account(): String? = unwrap(this).getAccount()

    public fun bucket(): String

    public fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

    public fun metrics(): Any? = unwrap(this).getMetrics()

    public fun replicationTime(): Any? = unwrap(this).getReplicationTime()

    public fun storageClass(): String? = unwrap(this).getStorageClass()

    @CdkDslMarker
    public interface Builder {
      public fun accessControlTranslation(accessControlTranslation: IResolvable)

      public
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f0fd1e6c656b4a291b22dd0837f285d6431d1e15f2bdd609d52114189ef58f2")
      public
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty.Builder.() -> Unit)

      public fun account(account: String)

      public fun bucket(bucket: String)

      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdd64b31e7f3128e2d80fa01588673ecec97f66415bd872221e47f7e6930a1f7")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      public fun metrics(metrics: IResolvable)

      public fun metrics(metrics: MetricsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb9cb17ca4c73c9502b93aed2e3308521f5f2dd5cc66c2444139dc01f188f707")
      public fun metrics(metrics: MetricsProperty.Builder.() -> Unit)

      public fun replicationTime(replicationTime: IResolvable)

      public fun replicationTime(replicationTime: ReplicationTimeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("786746b2c99329552cf2d7f244783967be8d7f83931cb236bdba5c6b08173e32")
      public fun replicationTime(replicationTime: ReplicationTimeProperty.Builder.() -> Unit)

      public fun storageClass(storageClass: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationDestinationProperty.builder()

      override fun accessControlTranslation(accessControlTranslation: IResolvable) {
        cdkBuilder.accessControlTranslation(accessControlTranslation.let(IResolvable::unwrap))
      }

      override
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty) {
        cdkBuilder.accessControlTranslation(accessControlTranslation.let(AccessControlTranslationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f0fd1e6c656b4a291b22dd0837f285d6431d1e15f2bdd609d52114189ef58f2")
      override
          fun accessControlTranslation(accessControlTranslation: AccessControlTranslationProperty.Builder.() -> Unit):
          Unit =
          accessControlTranslation(AccessControlTranslationProperty(accessControlTranslation))

      override fun account(account: String) {
        cdkBuilder.account(account)
      }

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fdd64b31e7f3128e2d80fa01588673ecec97f66415bd872221e47f7e6930a1f7")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      override fun metrics(metrics: IResolvable) {
        cdkBuilder.metrics(metrics.let(IResolvable::unwrap))
      }

      override fun metrics(metrics: MetricsProperty) {
        cdkBuilder.metrics(metrics.let(MetricsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb9cb17ca4c73c9502b93aed2e3308521f5f2dd5cc66c2444139dc01f188f707")
      override fun metrics(metrics: MetricsProperty.Builder.() -> Unit): Unit =
          metrics(MetricsProperty(metrics))

      override fun replicationTime(replicationTime: IResolvable) {
        cdkBuilder.replicationTime(replicationTime.let(IResolvable::unwrap))
      }

      override fun replicationTime(replicationTime: ReplicationTimeProperty) {
        cdkBuilder.replicationTime(replicationTime.let(ReplicationTimeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("786746b2c99329552cf2d7f244783967be8d7f83931cb236bdba5c6b08173e32")
      override fun replicationTime(replicationTime: ReplicationTimeProperty.Builder.() -> Unit):
          Unit = replicationTime(ReplicationTimeProperty(replicationTime))

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
      override fun accessControlTranslation(): Any? = unwrap(this).getAccessControlTranslation()

      override fun account(): String? = unwrap(this).getAccount()

      override fun bucket(): String = unwrap(this).getBucket()

      override fun encryptionConfiguration(): Any? = unwrap(this).getEncryptionConfiguration()

      override fun metrics(): Any? = unwrap(this).getMetrics()

      override fun replicationTime(): Any? = unwrap(this).getReplicationTime()

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
    public fun minutes(): Number

    @CdkDslMarker
    public interface Builder {
      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeValueProperty.builder()

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
    public fun objectLockEnabled(): String? = unwrap(this).getObjectLockEnabled()

    public fun rule(): Any? = unwrap(this).getRule()

    @CdkDslMarker
    public interface Builder {
      public fun objectLockEnabled(objectLockEnabled: String)

      public fun rule(rule: IResolvable)

      public fun rule(rule: ObjectLockRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21b25c7b6011ade18eab7d83ff83ce907d18fd4eeb1c69b910bacf43f6f2753f")
      public fun rule(rule: ObjectLockRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ObjectLockConfigurationProperty.builder()

      override fun objectLockEnabled(objectLockEnabled: String) {
        cdkBuilder.objectLockEnabled(objectLockEnabled)
      }

      override fun rule(rule: IResolvable) {
        cdkBuilder.rule(rule.let(IResolvable::unwrap))
      }

      override fun rule(rule: ObjectLockRuleProperty) {
        cdkBuilder.rule(rule.let(ObjectLockRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun objectLockEnabled(): String? = unwrap(this).getObjectLockEnabled()

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
    public fun hostName(): String

    public fun protocol(): String? = unwrap(this).getProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun hostName(hostName: String)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RedirectAllRequestsToProperty.builder()

      override fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
      }

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
      override fun hostName(): String = unwrap(this).getHostName()

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
    public fun httpErrorCodeReturnedEquals(): String? =
        unwrap(this).getHttpErrorCodeReturnedEquals()

    public fun keyPrefixEquals(): String? = unwrap(this).getKeyPrefixEquals()

    @CdkDslMarker
    public interface Builder {
      public fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String)

      public fun keyPrefixEquals(keyPrefixEquals: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty.builder()

      override fun httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals: String) {
        cdkBuilder.httpErrorCodeReturnedEquals(httpErrorCodeReturnedEquals)
      }

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
      override fun httpErrorCodeReturnedEquals(): String? =
          unwrap(this).getHttpErrorCodeReturnedEquals()

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
    public fun status(): String

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicaModificationsProperty.builder()

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
    public fun serverSideEncryptionConfiguration(): Any

    @CdkDslMarker
    public interface Builder {
      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

      public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>)

      public fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty.builder()

      override
          fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
      }

      override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: List<Any>) {
        cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration)
      }

      override fun serverSideEncryptionConfiguration(vararg serverSideEncryptionConfiguration: Any):
          Unit = serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.BucketEncryptionProperty,
    ) : CdkObject(cdkObject), BucketEncryptionProperty {
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
    public fun redirectRule(): Any

    public fun routingRuleCondition(): Any? = unwrap(this).getRoutingRuleCondition()

    @CdkDslMarker
    public interface Builder {
      public fun redirectRule(redirectRule: IResolvable)

      public fun redirectRule(redirectRule: RedirectRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b20fa399030f82be653532e47bf2933cb20d980a22e9b33eda18a0219c3f5355")
      public fun redirectRule(redirectRule: RedirectRuleProperty.Builder.() -> Unit)

      public fun routingRuleCondition(routingRuleCondition: IResolvable)

      public fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adc3832cde4e8c41ab9275613006ea5d986364af5c6047e7ae72a4312de08179")
      public
          fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.builder()

      override fun redirectRule(redirectRule: IResolvable) {
        cdkBuilder.redirectRule(redirectRule.let(IResolvable::unwrap))
      }

      override fun redirectRule(redirectRule: RedirectRuleProperty) {
        cdkBuilder.redirectRule(redirectRule.let(RedirectRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b20fa399030f82be653532e47bf2933cb20d980a22e9b33eda18a0219c3f5355")
      override fun redirectRule(redirectRule: RedirectRuleProperty.Builder.() -> Unit): Unit =
          redirectRule(RedirectRuleProperty(redirectRule))

      override fun routingRuleCondition(routingRuleCondition: IResolvable) {
        cdkBuilder.routingRuleCondition(routingRuleCondition.let(IResolvable::unwrap))
      }

      override fun routingRuleCondition(routingRuleCondition: RoutingRuleConditionProperty) {
        cdkBuilder.routingRuleCondition(routingRuleCondition.let(RoutingRuleConditionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun redirectRule(): Any = unwrap(this).getRedirectRule()

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
    public fun event(): String

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun topic(): String

    @CdkDslMarker
    public interface Builder {
      public fun event(event: String)

      public fun filter(filter: IResolvable)

      public fun filter(filter: NotificationFilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ca033737da5c4ac822f9882a1f39a52b425121d6a5a01e536c0bff49bbfb2")
      public fun filter(filter: NotificationFilterProperty.Builder.() -> Unit)

      public fun topic(topic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.builder()

      override fun event(event: String) {
        cdkBuilder.event(event)
      }

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(NotificationFilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89ca033737da5c4ac822f9882a1f39a52b425121d6a5a01e536c0bff49bbfb2")
      override fun filter(filter: NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(NotificationFilterProperty(filter))

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
      override fun event(): String = unwrap(this).getEvent()

      override fun filter(): Any? = unwrap(this).getFilter()

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
    public fun replicaKmsKeyId(): String

    @CdkDslMarker
    public interface Builder {
      public fun replicaKmsKeyId(replicaKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.EncryptionConfigurationProperty.builder()

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
    public fun hostName(): String? = unwrap(this).getHostName()

    public fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun replaceKeyPrefixWith(): String? = unwrap(this).getReplaceKeyPrefixWith()

    public fun replaceKeyWith(): String? = unwrap(this).getReplaceKeyWith()

    @CdkDslMarker
    public interface Builder {
      public fun hostName(hostName: String)

      public fun httpRedirectCode(httpRedirectCode: String)

      public fun protocol(protocol: String)

      public fun replaceKeyPrefixWith(replaceKeyPrefixWith: String)

      public fun replaceKeyWith(replaceKeyWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty.builder()

      override fun hostName(hostName: String) {
        cdkBuilder.hostName(hostName)
      }

      override fun httpRedirectCode(httpRedirectCode: String) {
        cdkBuilder.httpRedirectCode(httpRedirectCode)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun replaceKeyPrefixWith(replaceKeyPrefixWith: String) {
        cdkBuilder.replaceKeyPrefixWith(replaceKeyPrefixWith)
      }

      override fun replaceKeyWith(replaceKeyWith: String) {
        cdkBuilder.replaceKeyWith(replaceKeyWith)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty,
    ) : CdkObject(cdkObject), RedirectRuleProperty {
      override fun hostName(): String? = unwrap(this).getHostName()

      override fun httpRedirectCode(): String? = unwrap(this).getHttpRedirectCode()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun replaceKeyPrefixWith(): String? = unwrap(this).getReplaceKeyPrefixWith()

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
    public fun id(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun storageClassAnalysis(): Any

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    @CdkDslMarker
    public interface Builder {
      public fun id(id: String)

      public fun prefix(prefix: String)

      public fun storageClassAnalysis(storageClassAnalysis: IResolvable)

      public fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4392adb244bd5d9c51e9ceed83e47fb610720fbfb0accbff6826dcab1c2a1d93")
      public
          fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty.Builder.() -> Unit)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun storageClassAnalysis(storageClassAnalysis: IResolvable) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis.let(IResolvable::unwrap))
      }

      override fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis.let(StorageClassAnalysisProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4392adb244bd5d9c51e9ceed83e47fb610720fbfb0accbff6826dcab1c2a1d93")
      override
          fun storageClassAnalysis(storageClassAnalysis: StorageClassAnalysisProperty.Builder.() -> Unit):
          Unit = storageClassAnalysis(StorageClassAnalysisProperty(storageClassAnalysis))

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build():
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.AnalyticsConfigurationProperty,
    ) : CdkObject(cdkObject), AnalyticsConfigurationProperty {
      override fun id(): String = unwrap(this).getId()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun storageClassAnalysis(): Any = unwrap(this).getStorageClassAnalysis()

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
    public fun dataExport(): Any? = unwrap(this).getDataExport()

    @CdkDslMarker
    public interface Builder {
      public fun dataExport(dataExport: IResolvable)

      public fun dataExport(dataExport: DataExportProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6f331577f07d7810827fd428792c5b312b3a1c12158deb71bd460ca54357bc7f")
      public fun dataExport(dataExport: DataExportProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.StorageClassAnalysisProperty.builder()

      override fun dataExport(dataExport: IResolvable) {
        cdkBuilder.dataExport(dataExport.let(IResolvable::unwrap))
      }

      override fun dataExport(dataExport: DataExportProperty) {
        cdkBuilder.dataExport(dataExport.let(DataExportProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    public fun status(): String

    public fun time(): Any

    @CdkDslMarker
    public interface Builder {
      public fun status(status: String)

      public fun time(time: IResolvable)

      public fun time(time: ReplicationTimeValueProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fda56a0e2edcbab43a51001a03760cca5375f6f5aeaa83ddb6f9f5db9e0f1c5")
      public fun time(time: ReplicationTimeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun time(time: IResolvable) {
        cdkBuilder.time(time.let(IResolvable::unwrap))
      }

      override fun time(time: ReplicationTimeValueProperty) {
        cdkBuilder.time(time.let(ReplicationTimeValueProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8fda56a0e2edcbab43a51001a03760cca5375f6f5aeaa83ddb6f9f5db9e0f1c5")
      override fun time(time: ReplicationTimeValueProperty.Builder.() -> Unit): Unit =
          time(ReplicationTimeValueProperty(time))

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.ReplicationTimeProperty,
    ) : CdkObject(cdkObject), ReplicationTimeProperty {
      override fun status(): String = unwrap(this).getStatus()

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
    public fun name(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.FilterRuleProperty,
    ) : CdkObject(cdkObject), FilterRuleProperty {
      override fun name(): String = unwrap(this).getName()

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
    public fun corsRules(): Any

    @CdkDslMarker
    public interface Builder {
      public fun corsRules(corsRules: IResolvable)

      public fun corsRules(corsRules: List<Any>)

      public fun corsRules(vararg corsRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.builder()

      override fun corsRules(corsRules: IResolvable) {
        cdkBuilder.corsRules(corsRules.let(IResolvable::unwrap))
      }

      override fun corsRules(corsRules: List<Any>) {
        cdkBuilder.corsRules(corsRules)
      }

      override fun corsRules(vararg corsRules: Any): Unit = corsRules(corsRules.toList())

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty,
    ) : CdkObject(cdkObject), CorsConfigurationProperty {
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
    public fun days(): Number? = unwrap(this).getDays()

    public fun mode(): String? = unwrap(this).getMode()

    public fun years(): Number? = unwrap(this).getYears()

    @CdkDslMarker
    public interface Builder {
      public fun days(days: Number)

      public fun mode(mode: String)

      public fun years(years: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty.builder()

      override fun days(days: Number) {
        cdkBuilder.days(days)
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun years(years: Number) {
        cdkBuilder.years(years)
      }

      public fun build(): software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.s3.CfnBucket.DefaultRetentionProperty,
    ) : CdkObject(cdkObject), DefaultRetentionProperty {
      override fun days(): Number? = unwrap(this).getDays()

      override fun mode(): String? = unwrap(this).getMode()

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
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    @CdkDslMarker
    public interface Builder {
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.PublicAccessBlockConfigurationProperty.builder()

      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

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
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

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
    public fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

    public fun serverSideEncryptionByDefault(): Any? =
        unwrap(this).getServerSideEncryptionByDefault()

    @CdkDslMarker
    public interface Builder {
      public fun bucketKeyEnabled(bucketKeyEnabled: Boolean)

      public fun bucketKeyEnabled(bucketKeyEnabled: IResolvable)

      public fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable)

      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1cc3a3985bc5ef3c27b6a476bc09f94be774da6009a8f583a2aff83a95d926d")
      public
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionRuleProperty.builder()

      override fun bucketKeyEnabled(bucketKeyEnabled: Boolean) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled)
      }

      override fun bucketKeyEnabled(bucketKeyEnabled: IResolvable) {
        cdkBuilder.bucketKeyEnabled(bucketKeyEnabled.let(IResolvable::unwrap))
      }

      override fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: IResolvable) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(IResolvable::unwrap))
      }

      override
          fun serverSideEncryptionByDefault(serverSideEncryptionByDefault: ServerSideEncryptionByDefaultProperty) {
        cdkBuilder.serverSideEncryptionByDefault(serverSideEncryptionByDefault.let(ServerSideEncryptionByDefaultProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      override fun bucketKeyEnabled(): Any? = unwrap(this).getBucketKeyEnabled()

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
    public fun objectOwnership(): String? = unwrap(this).getObjectOwnership()

    @CdkDslMarker
    public interface Builder {
      public fun objectOwnership(objectOwnership: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty.Builder =
          software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty.builder()

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
    public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    public fun sseAlgorithm(): String

    @CdkDslMarker
    public interface Builder {
      public fun kmsMasterKeyId(kmsMasterKeyId: String)

      public fun sseAlgorithm(sseAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.Builder
          =
          software.amazon.awscdk.services.s3.CfnBucket.ServerSideEncryptionByDefaultProperty.builder()

      override fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
      }

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
      override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

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
