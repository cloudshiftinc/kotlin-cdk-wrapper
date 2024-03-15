@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

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

public interface CfnDistributionProps {
  public fun bundleId(): String

  public fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

  public fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

  public fun certificateName(): String? = unwrap(this).getCertificateName()

  public fun defaultCacheBehavior(): Any

  public fun distributionName(): String

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

  public fun origin(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun bundleId(bundleId: String)

    public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable)

    public fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("766be6ec1d5f5ad3551b369ac31a740f862c60762e279a16f11f880c8c57cb31")
    public
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit)

    public fun cacheBehaviors(cacheBehaviors: IResolvable)

    public fun cacheBehaviors(cacheBehaviors: List<Any>)

    public fun cacheBehaviors(vararg cacheBehaviors: Any)

    public fun certificateName(certificateName: String)

    public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

    public fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee52aa6fc3058ca0975a851e209a1d97d285c55c682f0ddf421215d02c79cd7b")
    public
        fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit)

    public fun distributionName(distributionName: String)

    public fun ipAddressType(ipAddressType: String)

    public fun isEnabled(isEnabled: Boolean)

    public fun isEnabled(isEnabled: IResolvable)

    public fun origin(origin: IResolvable)

    public fun origin(origin: CfnDistribution.InputOriginProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1499567289ac781984465c8da8eae6032a63c11bfdbd4dd141a70f4c2ed0c459")
    public fun origin(origin: CfnDistribution.InputOriginProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDistributionProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDistributionProps.builder()

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(IResolvable::unwrap))
    }

    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(CfnDistribution.CacheSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("766be6ec1d5f5ad3551b369ac31a740f862c60762e279a16f11f880c8c57cb31")
    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit):
        Unit = cacheBehaviorSettings(CfnDistribution.CacheSettingsProperty(cacheBehaviorSettings))

    override fun cacheBehaviors(cacheBehaviors: IResolvable) {
      cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
    }

    override fun cacheBehaviors(cacheBehaviors: List<Any>) {
      cdkBuilder.cacheBehaviors(cacheBehaviors)
    }

    override fun cacheBehaviors(vararg cacheBehaviors: Any): Unit =
        cacheBehaviors(cacheBehaviors.toList())

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
    }

    override fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(CfnDistribution.CacheBehaviorProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee52aa6fc3058ca0975a851e209a1d97d285c55c682f0ddf421215d02c79cd7b")
    override
        fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit):
        Unit = defaultCacheBehavior(CfnDistribution.CacheBehaviorProperty(defaultCacheBehavior))

    override fun distributionName(distributionName: String) {
      cdkBuilder.distributionName(distributionName)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun isEnabled(isEnabled: Boolean) {
      cdkBuilder.isEnabled(isEnabled)
    }

    override fun isEnabled(isEnabled: IResolvable) {
      cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
    }

    override fun origin(origin: IResolvable) {
      cdkBuilder.origin(origin.let(IResolvable::unwrap))
    }

    override fun origin(origin: CfnDistribution.InputOriginProperty) {
      cdkBuilder.origin(origin.let(CfnDistribution.InputOriginProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1499567289ac781984465c8da8eae6032a63c11bfdbd4dd141a70f4c2ed0c459")
    override fun origin(origin: CfnDistribution.InputOriginProperty.Builder.() -> Unit): Unit =
        origin(CfnDistribution.InputOriginProperty(origin))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDistributionProps,
  ) : CdkObject(cdkObject), CfnDistributionProps {
    override fun bundleId(): String = unwrap(this).getBundleId()

    override fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

    override fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

    override fun certificateName(): String? = unwrap(this).getCertificateName()

    override fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

    override fun distributionName(): String = unwrap(this).getDistributionName()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    override fun origin(): Any = unwrap(this).getOrigin()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistributionProps):
        CfnDistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionProps):
        software.amazon.awscdk.services.lightsail.CfnDistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDistributionProps
  }
}
