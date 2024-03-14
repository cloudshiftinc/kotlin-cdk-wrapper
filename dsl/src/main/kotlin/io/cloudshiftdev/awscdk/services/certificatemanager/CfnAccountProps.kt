package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccountProps {
  /**
   * Object containing expiration events options associated with an AWS account .
   *
   * For more information, see
   * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
   * in the API reference.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
   */
  public fun expiryEventsConfiguration(): Any

  /**
   * A builder for [CfnAccountProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable)

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty)

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c334ce57706c50333654102ee39ddd67179959ff51452eb7b2cdb325dffdfa2")
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnAccountProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnAccountProps.builder()

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    override fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    override
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(CfnAccount.ExpiryEventsConfigurationProperty::unwrap))
    }

    /**
     * @param expiryEventsConfiguration Object containing expiration events options associated with
     * an AWS account . 
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c334ce57706c50333654102ee39ddd67179959ff51452eb7b2cdb325dffdfa2")
    override
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty.Builder.() -> Unit):
        Unit =
        expiryEventsConfiguration(CfnAccount.ExpiryEventsConfigurationProperty(expiryEventsConfiguration))

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccountProps,
  ) : CdkObject(cdkObject), CfnAccountProps {
    /**
     * Object containing expiration events options associated with an AWS account .
     *
     * For more information, see
     * [ExpiryEventsConfiguration](https://docs.aws.amazon.com/acm/latest/APIReference/API_ExpiryEventsConfiguration.html)
     * in the API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-certificatemanager-account.html#cfn-certificatemanager-account-expiryeventsconfiguration)
     */
    override fun expiryEventsConfiguration(): Any = unwrap(this).getExpiryEventsConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnAccountProps):
        CfnAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountProps):
        software.amazon.awscdk.services.certificatemanager.CfnAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.certificatemanager.CfnAccountProps
  }
}
