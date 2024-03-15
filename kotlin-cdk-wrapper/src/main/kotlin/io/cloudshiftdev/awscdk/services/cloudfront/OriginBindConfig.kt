@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface OriginBindConfig {
  public fun failoverConfig(): OriginFailoverConfig? =
      unwrap(this).getFailoverConfig()?.let(OriginFailoverConfig::wrap)

  public fun originProperty(): CfnDistribution.OriginProperty? =
      unwrap(this).getOriginProperty()?.let(CfnDistribution.OriginProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun failoverConfig(failoverConfig: OriginFailoverConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae315b8281a79a4bc381de8614be42096b2d585c260939331ae386e5b96c2c76")
    public fun failoverConfig(failoverConfig: OriginFailoverConfig.Builder.() -> Unit)

    public fun originProperty(originProperty: CfnDistribution.OriginProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f7c474fb3a60fea18965bccda8e808015483f54b24fbafb80d5ece2e8b035e")
    public fun originProperty(originProperty: CfnDistribution.OriginProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.OriginBindConfig.Builder =
        software.amazon.awscdk.services.cloudfront.OriginBindConfig.builder()

    override fun failoverConfig(failoverConfig: OriginFailoverConfig) {
      cdkBuilder.failoverConfig(failoverConfig.let(OriginFailoverConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae315b8281a79a4bc381de8614be42096b2d585c260939331ae386e5b96c2c76")
    override fun failoverConfig(failoverConfig: OriginFailoverConfig.Builder.() -> Unit): Unit =
        failoverConfig(OriginFailoverConfig(failoverConfig))

    override fun originProperty(originProperty: CfnDistribution.OriginProperty) {
      cdkBuilder.originProperty(originProperty.let(CfnDistribution.OriginProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f7c474fb3a60fea18965bccda8e808015483f54b24fbafb80d5ece2e8b035e")
    override fun originProperty(originProperty: CfnDistribution.OriginProperty.Builder.() -> Unit):
        Unit = originProperty(CfnDistribution.OriginProperty(originProperty))

    public fun build(): software.amazon.awscdk.services.cloudfront.OriginBindConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindConfig,
  ) : CdkObject(cdkObject), OriginBindConfig {
    override fun failoverConfig(): OriginFailoverConfig? =
        unwrap(this).getFailoverConfig()?.let(OriginFailoverConfig::wrap)

    override fun originProperty(): CfnDistribution.OriginProperty? =
        unwrap(this).getOriginProperty()?.let(CfnDistribution.OriginProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginBindConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginBindConfig):
        OriginBindConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OriginBindConfig):
        software.amazon.awscdk.services.cloudfront.OriginBindConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.OriginBindConfig
  }
}
