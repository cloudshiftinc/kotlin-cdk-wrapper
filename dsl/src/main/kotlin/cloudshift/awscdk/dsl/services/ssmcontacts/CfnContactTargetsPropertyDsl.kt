@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

@CdkDslMarker
public class CfnContactTargetsPropertyDsl {
  private val cdkBuilder: CfnContact.TargetsProperty.Builder = CfnContact.TargetsProperty.builder()

  /**
   * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
   */
  public fun channelTargetInfo(channelTargetInfo: IResolvable) {
    cdkBuilder.channelTargetInfo(channelTargetInfo)
  }

  /**
   * @param channelTargetInfo Information about the contact channel that Incident Manager engages.
   */
  public fun channelTargetInfo(channelTargetInfo: CfnContact.ChannelTargetInfoProperty) {
    cdkBuilder.channelTargetInfo(channelTargetInfo)
  }

  /**
   * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
   */
  public fun contactTargetInfo(contactTargetInfo: IResolvable) {
    cdkBuilder.contactTargetInfo(contactTargetInfo)
  }

  /**
   * @param contactTargetInfo The contact that Incident Manager is engaging during an incident.
   */
  public fun contactTargetInfo(contactTargetInfo: CfnContact.ContactTargetInfoProperty) {
    cdkBuilder.contactTargetInfo(contactTargetInfo)
  }

  public fun build(): CfnContact.TargetsProperty = cdkBuilder.build()
}
