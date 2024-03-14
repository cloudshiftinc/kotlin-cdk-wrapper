package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnKeyGroupProps {
  /**
   * The key group configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
   */
  public fun keyGroupConfig(): Any

  /**
   * A builder for [CfnKeyGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param keyGroupConfig The key group configuration. 
     */
    public fun keyGroupConfig(keyGroupConfig: IResolvable)

    /**
     * @param keyGroupConfig The key group configuration. 
     */
    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty)

    /**
     * @param keyGroupConfig The key group configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88705bd949bfebfa3739633b4175fed570a4c214b425cc4a01ff6089be932712")
    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.builder()

    /**
     * @param keyGroupConfig The key group configuration. 
     */
    override fun keyGroupConfig(keyGroupConfig: IResolvable) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(IResolvable::unwrap))
    }

    /**
     * @param keyGroupConfig The key group configuration. 
     */
    override fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(CfnKeyGroup.KeyGroupConfigProperty::unwrap))
    }

    /**
     * @param keyGroupConfig The key group configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88705bd949bfebfa3739633b4175fed570a4c214b425cc4a01ff6089be932712")
    override
        fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit):
        Unit = keyGroupConfig(CfnKeyGroup.KeyGroupConfigProperty(keyGroupConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps,
  ) : CdkObject(cdkObject), CfnKeyGroupProps {
    /**
     * The key group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html#cfn-cloudfront-keygroup-keygroupconfig)
     */
    override fun keyGroupConfig(): Any = unwrap(this).getKeyGroupConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps):
        CfnKeyGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyGroupProps):
        software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps
  }
}
