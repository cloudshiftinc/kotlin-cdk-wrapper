package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnConfigurationSetEventDestinationProps {
  /**
   * The name of the configuration set that contains the event destination that you want to modify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
   */
  public fun configurationSetName(): String

  /**
   * An object that defines the event destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
   */
  public fun eventDestination(): Any? = unwrap(this).getEventDestination()

  /**
   * The name of the event destination that you want to modify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
   */
  public fun eventDestinationName(): String

  /**
   * A builder for [CfnConfigurationSetEventDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSetName The name of the configuration set that contains the event
     * destination that you want to modify. 
     */
    public fun configurationSetName(configurationSetName: String)

    /**
     * @param eventDestination An object that defines the event destination.
     */
    public fun eventDestination(eventDestination: IResolvable)

    /**
     * @param eventDestination An object that defines the event destination.
     */
    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty)

    /**
     * @param eventDestination An object that defines the event destination.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629adcecbae177c0bffe47cfc00a5383468497cab92497368afac51a416e892f")
    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit)

    /**
     * @param eventDestinationName The name of the event destination that you want to modify. 
     */
    public fun eventDestinationName(eventDestinationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.Builder
        =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestinationProps.builder()

    /**
     * @param configurationSetName The name of the configuration set that contains the event
     * destination that you want to modify. 
     */
    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * @param eventDestination An object that defines the event destination.
     */
    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    /**
     * @param eventDestination An object that defines the event destination.
     */
    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(CfnConfigurationSetEventDestination.EventDestinationProperty::unwrap))
    }

    /**
     * @param eventDestination An object that defines the event destination.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629adcecbae177c0bffe47cfc00a5383468497cab92497368afac51a416e892f")
    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit):
        Unit =
        eventDestination(CfnConfigurationSetEventDestination.EventDestinationProperty(eventDestination))

    /**
     * @param eventDestinationName The name of the event destination that you want to modify. 
     */
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
    /**
     * The name of the configuration set that contains the event destination that you want to
     * modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
     */
    override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
     */
    override fun eventDestination(): Any? = unwrap(this).getEventDestination()

    /**
     * The name of the event destination that you want to modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
     */
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
