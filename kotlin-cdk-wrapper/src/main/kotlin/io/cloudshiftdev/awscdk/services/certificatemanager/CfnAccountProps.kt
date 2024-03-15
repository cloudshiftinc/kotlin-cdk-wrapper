@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAccountProps {
  public fun expiryEventsConfiguration(): Any

  @CdkDslMarker
  public interface Builder {
    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable)

    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c334ce57706c50333654102ee39ddd67179959ff51452eb7b2cdb325dffdfa2")
    public
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnAccountProps.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnAccountProps.builder()

    override fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
      cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration.let(CfnAccount.ExpiryEventsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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