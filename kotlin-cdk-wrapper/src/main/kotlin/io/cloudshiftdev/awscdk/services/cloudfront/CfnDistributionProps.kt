@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDistributionProps {
  public fun distributionConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun distributionConfig(distributionConfig: IResolvable)

    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    public
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnDistributionProps.builder()

    override fun distributionConfig(distributionConfig: IResolvable) {
      cdkBuilder.distributionConfig(distributionConfig.let(IResolvable::unwrap))
    }

    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
      cdkBuilder.distributionConfig(distributionConfig.let(CfnDistribution.DistributionConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit):
        Unit = distributionConfig(CfnDistribution.DistributionConfigProperty(distributionConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionProps,
  ) : CdkObject(cdkObject), CfnDistributionProps {
    override fun distributionConfig(): Any = unwrap(this).getDistributionConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionProps):
        CfnDistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionProps):
        software.amazon.awscdk.services.cloudfront.CfnDistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnDistributionProps
  }
}
