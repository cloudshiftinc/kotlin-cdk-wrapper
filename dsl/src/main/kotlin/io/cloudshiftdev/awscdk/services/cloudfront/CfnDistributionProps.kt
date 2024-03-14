package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDistributionProps {
  /**
   * The distribution's configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
   */
  public fun distributionConfig(): Any

  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: IResolvable)

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty)

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    public
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistributionProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnDistributionProps.builder()

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    override fun distributionConfig(distributionConfig: IResolvable) {
      cdkBuilder.distributionConfig(distributionConfig.let(IResolvable::unwrap))
    }

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty) {
      cdkBuilder.distributionConfig(distributionConfig.let(CfnDistribution.DistributionConfigProperty::unwrap))
    }

    /**
     * @param distributionConfig The distribution's configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20895a1df6d204e01e13674d067d676602a77b9e353c247d606ec9ca46750206")
    override
        fun distributionConfig(distributionConfig: CfnDistribution.DistributionConfigProperty.Builder.() -> Unit):
        Unit = distributionConfig(CfnDistribution.DistributionConfigProperty(distributionConfig))

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistributionProps,
  ) : CdkObject(cdkObject), CfnDistributionProps {
    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     */
    override fun distributionConfig(): Any = unwrap(this).getDistributionConfig()

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     */
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
