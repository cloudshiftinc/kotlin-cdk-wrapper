@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputAttachmentPropertyDsl {
  private val cdkBuilder: CfnChannel.InputAttachmentProperty.Builder =
      CfnChannel.InputAttachmentProperty.builder()

  /**
   * @param automaticInputFailoverSettings Settings to implement automatic input failover in this
   * input.
   */
  public fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
    cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
  }

  /**
   * @param automaticInputFailoverSettings Settings to implement automatic input failover in this
   * input.
   */
  public
      fun automaticInputFailoverSettings(automaticInputFailoverSettings: CfnChannel.AutomaticInputFailoverSettingsProperty) {
    cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
  }

  /**
   * @param inputAttachmentName A name for the attachment.
   * This is required if you want to use this input in an input switch action.
   */
  public fun inputAttachmentName(inputAttachmentName: String) {
    cdkBuilder.inputAttachmentName(inputAttachmentName)
  }

  /**
   * @param inputId The ID of the input to attach.
   */
  public fun inputId(inputId: String) {
    cdkBuilder.inputId(inputId)
  }

  /**
   * @param inputSettings Information about the content to extract from the input and about the
   * general handling of the content.
   */
  public fun inputSettings(inputSettings: IResolvable) {
    cdkBuilder.inputSettings(inputSettings)
  }

  /**
   * @param inputSettings Information about the content to extract from the input and about the
   * general handling of the content.
   */
  public fun inputSettings(inputSettings: CfnChannel.InputSettingsProperty) {
    cdkBuilder.inputSettings(inputSettings)
  }

  public fun build(): CfnChannel.InputAttachmentProperty = cdkBuilder.build()
}
