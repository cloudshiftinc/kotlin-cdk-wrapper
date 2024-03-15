@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnNotificationChannelProps {
  public fun config(): Any

  @CdkDslMarker
  public interface Builder {
    public fun config(config: IResolvable)

    public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1852829fd8f53980d0685f78e14253379f8c85928cc008e34f48b671cbd2cf20")
    public
        fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.Builder =
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.builder()

    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    override fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
      cdkBuilder.config(config.let(CfnNotificationChannel.NotificationChannelConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1852829fd8f53980d0685f78e14253379f8c85928cc008e34f48b671cbd2cf20")
    override
        fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty.Builder.() -> Unit):
        Unit = config(CfnNotificationChannel.NotificationChannelConfigProperty(config))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps,
  ) : CdkObject(cdkObject), CfnNotificationChannelProps {
    override fun config(): Any = unwrap(this).getConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps):
        CfnNotificationChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationChannelProps):
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
  }
}
