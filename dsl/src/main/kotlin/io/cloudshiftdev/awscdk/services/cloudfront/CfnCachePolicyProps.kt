package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnCachePolicyProps {
  /**
   * The cache policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
   */
  public fun cachePolicyConfig(): Any

  /**
   * A builder for [CfnCachePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    public fun cachePolicyConfig(cachePolicyConfig: IResolvable)

    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    public fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty)

    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a520886af99ac5f581dde39c8c7fcf4bdd14ae9b6199b6ea621b15687cb1c7")
    public
        fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps.builder()

    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    override fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    override fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(CfnCachePolicy.CachePolicyConfigProperty::unwrap))
    }

    /**
     * @param cachePolicyConfig The cache policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03a520886af99ac5f581dde39c8c7fcf4bdd14ae9b6199b6ea621b15687cb1c7")
    override
        fun cachePolicyConfig(cachePolicyConfig: CfnCachePolicy.CachePolicyConfigProperty.Builder.() -> Unit):
        Unit = cachePolicyConfig(CfnCachePolicy.CachePolicyConfigProperty(cachePolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps,
  ) : CdkObject(cdkObject), CfnCachePolicyProps {
    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     */
    override fun cachePolicyConfig(): Any = unwrap(this).getCachePolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCachePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps):
        CfnCachePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCachePolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps
  }
}
