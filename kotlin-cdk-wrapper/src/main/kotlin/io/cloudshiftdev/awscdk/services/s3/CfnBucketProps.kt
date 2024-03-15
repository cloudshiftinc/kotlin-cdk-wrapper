@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBucketProps {
  public fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

  public fun accessControl(): String? = unwrap(this).getAccessControl()

  public fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

  public fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public fun intelligentTieringConfigurations(): Any? =
      unwrap(this).getIntelligentTieringConfigurations()

  public fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

  public fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  public fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

  public fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  public fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

  public fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

  public fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

  public fun publicAccessBlockConfiguration(): Any? =
      unwrap(this).getPublicAccessBlockConfiguration()

  public fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

  public fun websiteConfiguration(): Any? = unwrap(this).getWebsiteConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun accelerateConfiguration(accelerateConfiguration: IResolvable)

    public
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d879dedc2e18f20de3b43a7753712f95b8da71d85f9f1f794c1f9e59d1eec47b")
    public
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty.Builder.() -> Unit)

    public fun accessControl(accessControl: String)

    public fun analyticsConfigurations(analyticsConfigurations: IResolvable)

    public fun analyticsConfigurations(analyticsConfigurations: List<Any>)

    public fun analyticsConfigurations(vararg analyticsConfigurations: Any)

    public fun bucketEncryption(bucketEncryption: IResolvable)

    public fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7dda973024ffcd542628035f7d8fe73113f61e1c754f147db01bd9c31e40fc")
    public
        fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty.Builder.() -> Unit)

    public fun bucketName(bucketName: String)

    public fun corsConfiguration(corsConfiguration: IResolvable)

    public fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3609d8c61d992239f891f6019c95c2dabaf9d9e78038b46ff1c2fcb9564ed465")
    public
        fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty.Builder.() -> Unit)

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: IResolvable)

    public fun intelligentTieringConfigurations(intelligentTieringConfigurations: List<Any>)

    public fun intelligentTieringConfigurations(vararg intelligentTieringConfigurations: Any)

    public fun inventoryConfigurations(inventoryConfigurations: IResolvable)

    public fun inventoryConfigurations(inventoryConfigurations: List<Any>)

    public fun inventoryConfigurations(vararg inventoryConfigurations: Any)

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4cf2859f8177e4c539ee4b2105397e3ec997d92154f1e97156c36a044a06c5")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit)

    public fun loggingConfiguration(loggingConfiguration: IResolvable)

    public fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40da739fe76f56ffb817546c21a42c6694444a7ba3ad5b2248e09c9dadea0727")
    public
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit)

    public fun metricsConfigurations(metricsConfigurations: IResolvable)

    public fun metricsConfigurations(metricsConfigurations: List<Any>)

    public fun metricsConfigurations(vararg metricsConfigurations: Any)

    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    public
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b0b90f503589c9cb50119ce40919916863fc1c6fc64bf3195ea67c80853e4ad")
    public
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit)

    public fun objectLockConfiguration(objectLockConfiguration: IResolvable)

    public
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68d56fbddfa842e4ef7764fb09920a64a35a02dd1d0becba20f6a7b056306ad5")
    public
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty.Builder.() -> Unit)

    public fun objectLockEnabled(objectLockEnabled: Boolean)

    public fun objectLockEnabled(objectLockEnabled: IResolvable)

    public fun ownershipControls(ownershipControls: IResolvable)

    public fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b338c0dbbcbc434c0bc0730771700c79f0387b2db05dda556c540a396cd5868")
    public
        fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty.Builder.() -> Unit)

    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable)

    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349d5bd7475de337e9cbd29f750cdaf75c7dab583d264de236450629e82bab")
    public
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty.Builder.() -> Unit)

    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b857b94a46119b04b3d1b82506a9bc2043f4cd33fe0aba803cfc3774a0f1826")
    public
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun versioningConfiguration(versioningConfiguration: IResolvable)

    public
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3cfae8b56cb451301bf46541164cbe333641bf3807ee6df146c708f3aca7007")
    public
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit)

    public fun websiteConfiguration(websiteConfiguration: IResolvable)

    public fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("473e2757bba809ea76afc5b70a68eefe416883e93bf16b872bce3786228df6ef")
    public
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnBucketProps.Builder =
        software.amazon.awscdk.services.s3.CfnBucketProps.builder()

    override fun accelerateConfiguration(accelerateConfiguration: IResolvable) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(IResolvable::unwrap))
    }

    override
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty) {
      cdkBuilder.accelerateConfiguration(accelerateConfiguration.let(CfnBucket.AccelerateConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d879dedc2e18f20de3b43a7753712f95b8da71d85f9f1f794c1f9e59d1eec47b")
    override
        fun accelerateConfiguration(accelerateConfiguration: CfnBucket.AccelerateConfigurationProperty.Builder.() -> Unit):
        Unit =
        accelerateConfiguration(CfnBucket.AccelerateConfigurationProperty(accelerateConfiguration))

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

    override fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty) {
      cdkBuilder.bucketEncryption(bucketEncryption.let(CfnBucket.BucketEncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7dda973024ffcd542628035f7d8fe73113f61e1c754f147db01bd9c31e40fc")
    override
        fun bucketEncryption(bucketEncryption: CfnBucket.BucketEncryptionProperty.Builder.() -> Unit):
        Unit = bucketEncryption(CfnBucket.BucketEncryptionProperty(bucketEncryption))

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    override fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnBucket.CorsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3609d8c61d992239f891f6019c95c2dabaf9d9e78038b46ff1c2fcb9564ed465")
    override
        fun corsConfiguration(corsConfiguration: CfnBucket.CorsConfigurationProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CfnBucket.CorsConfigurationProperty(corsConfiguration))

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

    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(CfnBucket.LifecycleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce4cf2859f8177e4c539ee4b2105397e3ec997d92154f1e97156c36a044a06c5")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleConfiguration(CfnBucket.LifecycleConfigurationProperty(lifecycleConfiguration))

    override fun loggingConfiguration(loggingConfiguration: IResolvable) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty) {
      cdkBuilder.loggingConfiguration(loggingConfiguration.let(CfnBucket.LoggingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40da739fe76f56ffb817546c21a42c6694444a7ba3ad5b2248e09c9dadea0727")
    override
        fun loggingConfiguration(loggingConfiguration: CfnBucket.LoggingConfigurationProperty.Builder.() -> Unit):
        Unit = loggingConfiguration(CfnBucket.LoggingConfigurationProperty(loggingConfiguration))

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
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnBucket.NotificationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b0b90f503589c9cb50119ce40919916863fc1c6fc64bf3195ea67c80853e4ad")
    override
        fun notificationConfiguration(notificationConfiguration: CfnBucket.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnBucket.NotificationConfigurationProperty(notificationConfiguration))

    override fun objectLockConfiguration(objectLockConfiguration: IResolvable) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty) {
      cdkBuilder.objectLockConfiguration(objectLockConfiguration.let(CfnBucket.ObjectLockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("68d56fbddfa842e4ef7764fb09920a64a35a02dd1d0becba20f6a7b056306ad5")
    override
        fun objectLockConfiguration(objectLockConfiguration: CfnBucket.ObjectLockConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLockConfiguration(CfnBucket.ObjectLockConfigurationProperty(objectLockConfiguration))

    override fun objectLockEnabled(objectLockEnabled: Boolean) {
      cdkBuilder.objectLockEnabled(objectLockEnabled)
    }

    override fun objectLockEnabled(objectLockEnabled: IResolvable) {
      cdkBuilder.objectLockEnabled(objectLockEnabled.let(IResolvable::unwrap))
    }

    override fun ownershipControls(ownershipControls: IResolvable) {
      cdkBuilder.ownershipControls(ownershipControls.let(IResolvable::unwrap))
    }

    override fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty) {
      cdkBuilder.ownershipControls(ownershipControls.let(CfnBucket.OwnershipControlsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b338c0dbbcbc434c0bc0730771700c79f0387b2db05dda556c540a396cd5868")
    override
        fun ownershipControls(ownershipControls: CfnBucket.OwnershipControlsProperty.Builder.() -> Unit):
        Unit = ownershipControls(CfnBucket.OwnershipControlsProperty(ownershipControls))

    override fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(IResolvable::unwrap))
    }

    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty) {
      cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration.let(CfnBucket.PublicAccessBlockConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349d5bd7475de337e9cbd29f750cdaf75c7dab583d264de236450629e82bab")
    override
        fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: CfnBucket.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
        Unit =
        publicAccessBlockConfiguration(CfnBucket.PublicAccessBlockConfigurationProperty(publicAccessBlockConfiguration))

    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(CfnBucket.ReplicationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b857b94a46119b04b3d1b82506a9bc2043f4cd33fe0aba803cfc3774a0f1826")
    override
        fun replicationConfiguration(replicationConfiguration: CfnBucket.ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit =
        replicationConfiguration(CfnBucket.ReplicationConfigurationProperty(replicationConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun versioningConfiguration(versioningConfiguration: IResolvable) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(IResolvable::unwrap))
    }

    override
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty) {
      cdkBuilder.versioningConfiguration(versioningConfiguration.let(CfnBucket.VersioningConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3cfae8b56cb451301bf46541164cbe333641bf3807ee6df146c708f3aca7007")
    override
        fun versioningConfiguration(versioningConfiguration: CfnBucket.VersioningConfigurationProperty.Builder.() -> Unit):
        Unit =
        versioningConfiguration(CfnBucket.VersioningConfigurationProperty(versioningConfiguration))

    override fun websiteConfiguration(websiteConfiguration: IResolvable) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(IResolvable::unwrap))
    }

    override
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty) {
      cdkBuilder.websiteConfiguration(websiteConfiguration.let(CfnBucket.WebsiteConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("473e2757bba809ea76afc5b70a68eefe416883e93bf16b872bce3786228df6ef")
    override
        fun websiteConfiguration(websiteConfiguration: CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit):
        Unit = websiteConfiguration(CfnBucket.WebsiteConfigurationProperty(websiteConfiguration))

    public fun build(): software.amazon.awscdk.services.s3.CfnBucketProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
    override fun accelerateConfiguration(): Any? = unwrap(this).getAccelerateConfiguration()

    override fun accessControl(): String? = unwrap(this).getAccessControl()

    override fun analyticsConfigurations(): Any? = unwrap(this).getAnalyticsConfigurations()

    override fun bucketEncryption(): Any? = unwrap(this).getBucketEncryption()

    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

    override fun intelligentTieringConfigurations(): Any? =
        unwrap(this).getIntelligentTieringConfigurations()

    override fun inventoryConfigurations(): Any? = unwrap(this).getInventoryConfigurations()

    override fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

    override fun loggingConfiguration(): Any? = unwrap(this).getLoggingConfiguration()

    override fun metricsConfigurations(): Any? = unwrap(this).getMetricsConfigurations()

    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    override fun objectLockConfiguration(): Any? = unwrap(this).getObjectLockConfiguration()

    override fun objectLockEnabled(): Any? = unwrap(this).getObjectLockEnabled()

    override fun ownershipControls(): Any? = unwrap(this).getOwnershipControls()

    override fun publicAccessBlockConfiguration(): Any? =
        unwrap(this).getPublicAccessBlockConfiguration()

    override fun replicationConfiguration(): Any? = unwrap(this).getReplicationConfiguration()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun versioningConfiguration(): Any? = unwrap(this).getVersioningConfiguration()

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
