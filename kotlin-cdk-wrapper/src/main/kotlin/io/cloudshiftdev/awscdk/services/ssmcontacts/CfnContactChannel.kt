@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmcontacts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::SSMContacts::ContactChannel` resource specifies a contact channel as the method that
 * Incident Manager uses to engage your contact.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmcontacts.*;
 * CfnContactChannel cfnContactChannel = CfnContactChannel.Builder.create(this,
 * "MyCfnContactChannel")
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
public open class CfnContactChannel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactChannelProps,
  ) :
      this(software.amazon.awscdk.services.ssmcontacts.CfnContactChannel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnContactChannelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContactChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContactChannelProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `ContactChannel` resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The details that Incident Manager uses when trying to engage the contact channel.
   */
  public open fun channelAddress(): String = unwrap(this).getChannelAddress()

  /**
   * The details that Incident Manager uses when trying to engage the contact channel.
   */
  public open fun channelAddress(`value`: String) {
    unwrap(this).setChannelAddress(`value`)
  }

  /**
   * The name of the contact channel.
   */
  public open fun channelName(): String = unwrap(this).getChannelName()

  /**
   * The name of the contact channel.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * The type of the contact channel.
   *
   * Incident Manager supports three contact methods:.
   */
  public open fun channelType(): String = unwrap(this).getChannelType()

  /**
   * The type of the contact channel.
   *
   * Incident Manager supports three contact methods:.
   */
  public open fun channelType(`value`: String) {
    unwrap(this).setChannelType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
   */
  public open fun contactId(): String = unwrap(this).getContactId()

  /**
   * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
   */
  public open fun contactId(`value`: String) {
    unwrap(this).setContactId(`value`)
  }

  /**
   * If you want to activate the channel at a later time, you can choose to defer activation.
   */
  public open fun deferActivation(): Any? = unwrap(this).getDeferActivation()

  /**
   * If you want to activate the channel at a later time, you can choose to defer activation.
   */
  public open fun deferActivation(`value`: Boolean) {
    unwrap(this).setDeferActivation(`value`)
  }

  /**
   * If you want to activate the channel at a later time, you can choose to defer activation.
   */
  public open fun deferActivation(`value`: IResolvable) {
    unwrap(this).setDeferActivation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmcontacts.CfnContactChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The details that Incident Manager uses when trying to engage the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeladdress)
     * @param channelAddress The details that Incident Manager uses when trying to engage the
     * contact channel. 
     */
    public fun channelAddress(channelAddress: String)

    /**
     * The name of the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channelname)
     * @param channelName The name of the contact channel. 
     */
    public fun channelName(channelName: String)

    /**
     * The type of the contact channel. Incident Manager supports three contact methods:.
     *
     * * SMS
     * * VOICE
     * * EMAIL
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeltype)
     * @param channelType The type of the contact channel. Incident Manager supports three contact
     * methods:. 
     */
    public fun channelType(channelType: String)

    /**
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-contactid)
     * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
     * channel to. 
     */
    public fun contactId(contactId: String)

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation.
     *
     * Incident Manager can't engage your contact channel until it has been activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation. 
     */
    public fun deferActivation(deferActivation: Boolean)

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation.
     *
     * Incident Manager can't engage your contact channel until it has been activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation. 
     */
    public fun deferActivation(deferActivation: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder =
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.Builder.create(scope, id)

    /**
     * The details that Incident Manager uses when trying to engage the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeladdress)
     * @param channelAddress The details that Incident Manager uses when trying to engage the
     * contact channel. 
     */
    override fun channelAddress(channelAddress: String) {
      cdkBuilder.channelAddress(channelAddress)
    }

    /**
     * The name of the contact channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channelname)
     * @param channelName The name of the contact channel. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The type of the contact channel. Incident Manager supports three contact methods:.
     *
     * * SMS
     * * VOICE
     * * EMAIL
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeltype)
     * @param channelType The type of the contact channel. Incident Manager supports three contact
     * methods:. 
     */
    override fun channelType(channelType: String) {
      cdkBuilder.channelType(channelType)
    }

    /**
     * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-contactid)
     * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
     * channel to. 
     */
    override fun contactId(contactId: String) {
      cdkBuilder.contactId(contactId)
    }

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation.
     *
     * Incident Manager can't engage your contact channel until it has been activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation. 
     */
    override fun deferActivation(deferActivation: Boolean) {
      cdkBuilder.deferActivation(deferActivation)
    }

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation.
     *
     * Incident Manager can't engage your contact channel until it has been activated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-deferactivation)
     * @param deferActivation If you want to activate the channel at a later time, you can choose to
     * defer activation. 
     */
    override fun deferActivation(deferActivation: IResolvable) {
      cdkBuilder.deferActivation(deferActivation.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssmcontacts.CfnContactChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmcontacts.CfnContactChannel):
        CfnContactChannel = CfnContactChannel(cdkObject)

    internal fun unwrap(wrapped: CfnContactChannel):
        software.amazon.awscdk.services.ssmcontacts.CfnContactChannel = wrapped.cdkObject
  }
}
