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

  public fun channelAddress(channelAddress: String) {
    cdkBuilder.channelAddress(channelAddress)
  }

  public fun channelName(channelName: String) {
    cdkBuilder.channelName(channelName)
  }

  public fun channelType(channelType: String) {
    cdkBuilder.channelType(channelType)
  }

  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  public fun deferActivation(deferActivation: Boolean) {
    cdkBuilder.deferActivation(deferActivation)
  }

  public fun deferActivation(deferActivation: IResolvable) {
    cdkBuilder.deferActivation(deferActivation)
  }

  public fun build(): CfnContactChannel = cdkBuilder.build()
}
