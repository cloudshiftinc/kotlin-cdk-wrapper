@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContactChannelProps

@CdkDslMarker
public class CfnContactChannelPropsDsl {
  private val cdkBuilder: CfnContactChannelProps.Builder = CfnContactChannelProps.builder()

  /**
   * @param channelAddress The details that Incident Manager uses when trying to engage the contact
   * channel. 
   */
  public fun channelAddress(channelAddress: String) {
    cdkBuilder.channelAddress(channelAddress)
  }

  /**
   * @param channelName The name of the contact channel. 
   */
  public fun channelName(channelName: String) {
    cdkBuilder.channelName(channelName)
  }

  /**
   * @param channelType The type of the contact channel. Incident Manager supports three contact
   * methods:. 
   * * SMS
   * * VOICE
   * * EMAIL
   */
  public fun channelType(channelType: String) {
    cdkBuilder.channelType(channelType)
  }

  /**
   * @param contactId The Amazon Resource Name (ARN) of the contact you are adding the contact
   * channel to. 
   */
  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  /**
   * @param deferActivation If you want to activate the channel at a later time, you can choose to
   * defer activation.
   * Incident Manager can't engage your contact channel until it has been activated.
   */
  public fun deferActivation(deferActivation: Boolean) {
    cdkBuilder.deferActivation(deferActivation)
  }

  /**
   * @param deferActivation If you want to activate the channel at a later time, you can choose to
   * defer activation.
   * Incident Manager can't engage your contact channel until it has been activated.
   */
  public fun deferActivation(deferActivation: IResolvable) {
    cdkBuilder.deferActivation(deferActivation)
  }

  public fun build(): CfnContactChannelProps = cdkBuilder.build()
}
