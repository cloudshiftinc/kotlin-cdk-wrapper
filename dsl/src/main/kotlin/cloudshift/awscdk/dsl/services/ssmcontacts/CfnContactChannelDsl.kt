@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnContactChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnContactChannel.Builder = CfnContactChannel.Builder.create(scope, id)

  /**
   * The details that Incident Manager uses when trying to engage the contact channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channeladdress)
   * @param channelAddress The details that Incident Manager uses when trying to engage the contact
   * channel. 
   */
  public fun channelAddress(channelAddress: String) {
    cdkBuilder.channelAddress(channelAddress)
  }

  /**
   * The name of the contact channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-channelname)
   * @param channelName The name of the contact channel. 
   */
  public fun channelName(channelName: String) {
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
  public fun channelType(channelType: String) {
    cdkBuilder.channelType(channelType)
  }

  /**
   * The Amazon Resource Name (ARN) of the contact you are adding the contact channel to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmcontacts-contactchannel.html#cfn-ssmcontacts-contactchannel-contactid)
   * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
   * channel to. 
   */
  public fun contactId(contactId: String) {
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
  public fun deferActivation(deferActivation: Boolean) {
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
  public fun deferActivation(deferActivation: IResolvable) {
    cdkBuilder.deferActivation(deferActivation)
  }

  public fun build(): CfnContactChannel = cdkBuilder.build()
}
