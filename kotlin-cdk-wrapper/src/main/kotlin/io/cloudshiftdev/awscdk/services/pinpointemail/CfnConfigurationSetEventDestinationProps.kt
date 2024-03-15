@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConfigurationSetEventDestinationProps {
  public fun configurationSetName(): String

  public fun eventDestination(): Any? = unwrap(this).getEventDestination()

  public fun eventDestinationName(): String

  @CdkDslMarker
  public interface Builder {
    public fun configurationSetName(configurationSetName: String)

    public fun eventDestination(eventDestination: IResolvable)

    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629adcecbae177c0bffe47cfc00a5383468497cab92497368afac51a416e892f")
    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit)

    public fun eventDestinationName(eventDestinationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.Builder
        =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.builder()

    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(CfnConfigurationSetEventDestination.EventDestinationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629adcecbae177c0bffe47cfc00a5383468497cab92497368afac51a416e892f")
    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit):
        Unit =
        eventDestination(CfnConfigurationSetEventDestination.EventDestinationProperty(eventDestination))

    override fun eventDestinationName(eventDestinationName: String) {
      cdkBuilder.eventDestinationName(eventDestinationName)
    }

    public fun build():
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetEventDestinationProps {
    override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

    override fun eventDestination(): Any? = unwrap(this).getEventDestination()

    override fun eventDestinationName(): String = unwrap(this).getEventDestinationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnConfigurationSetEventDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps):
        CfnConfigurationSetEventDestinationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetEventDestinationProps):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps
  }
}
