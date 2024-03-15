@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnContactChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnContactChannelProps cfnContactChannelProps = CfnContactChannelProps.builder()
 * .channelAddress("channelAddress")
 * .channelName("channelName")
 * .channelType("channelType")
 * .contactId("contactId")
 * // the properties below are optional
 * .deferActivation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html)
 */
public interface CfnContactChannelProps {
  /**
   * The details that Incident Manager uses when trying to engage the contact channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeladdress)
   */
  public fun channelAddress(): String

  /**
   * The name of the contact channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channelname)
   */
  public fun channelName(): String

  /**
   * The type of the contact channel. Incident Manager supports three contact methods:.
   *
   * * SMS
   * * VOICE
   * * EMAIL
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeltype)
   */
  public fun channelType(): String

  /**
   * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-contactid)
   */
  public fun contactId(): String

  /**
   * If you want to activate the channel at a later time, you can choose to defer activation.
   *
   * Incident Manager can't engage your contact channel until it has been activated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
   */
  public fun deferActivation(): Any? = unwrap(this).getDeferActivation()

  /**
   * A builder for [CfnContactChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelAddress The details that Incident Manager uses when trying to engage the
     * contact channel. 
     */
    public fun channelAddress(channelAddress: String)

    /**
     * @param channelName The name of the contact channel. 
     */
    public fun channelName(channelName: String)

    /**
     * @param channelType The type of the contact channel. Incident Manager supports three contact
     * methods:. 
     * * SMS
     * * VOICE
     * * EMAIL
     */
    public fun channelType(channelType: String)

    /**
     * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
     * channel to. 
     */
    public fun contactId(contactId: String)

    /**
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation.
     * Incident Manager can't engage your contact channel until it has been activated.
     */
    public fun deferActivation(deferActivation: Boolean)

    /**
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation.
     * Incident Manager can't engage your contact channel until it has been activated.
     */
    public fun deferActivation(deferActivation: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps.builder()

    /**
     * @param channelAddress The details that Incident Manager uses when trying to engage the
     * contact channel. 
     */
    override fun channelAddress(channelAddress: String) {
      cdkBuilder.channelAddress(channelAddress)
    }

    /**
     * @param channelName The name of the contact channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param channelType The type of the contact channel. Incident Manager supports three contact
     * methods:. 
     * * SMS
     * * VOICE
     * * EMAIL
     */
    override fun channelType(channelType: String) {
      cdkBuilder.channelType(channelType)
    }

    /**
     * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
     * channel to. 
     */
    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    /**
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation.
     * Incident Manager can't engage your contact channel until it has been activated.
     */
    override fun deferActivation(deferActivation: Boolean) {
      cdkBuilder.deferActivation(deferActivation)
    }

    /**
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation.
     * Incident Manager can't engage your contact channel until it has been activated.
     */
    override fun deferActivation(deferActivation: IResolvable) {
      cdkBuilder.deferActivation(deferActivation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps,
  ) : CdkObject(cdkObject), CfnContactChannelProps {
    /**
     * The details that Incident Manager uses when trying to engage the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeladdress)
     */
    override fun channelAddress(): String = unwrap(this).getChannelAddress()

    /**
     * The name of the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The type of the contact channel. Incident Manager supports three contact methods:.
     *
     * * SMS
     * * VOICE
     * * EMAIL
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeltype)
     */
    override fun channelType(): String = unwrap(this).getChannelType()

    /**
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-contactid)
     */
    override fun contactId(): String = unwrap(this).getContactId()

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation.
     *
     * Incident Manager can't engage your contact channel until it has been activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
     */
    override fun deferActivation(): Any? = unwrap(this).getDeferActivation()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnContactChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps):
        CfnContactChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnContactChannelProps):
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps
  }
}
