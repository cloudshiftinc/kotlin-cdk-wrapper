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

  public fun automaticInputFailoverSettings(automaticInputFailoverSettings: IResolvable) {
    cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
  }

  public
      fun automaticInputFailoverSettings(automaticInputFailoverSettings: CfnChannel.AutomaticInputFailoverSettingsProperty) {
    cdkBuilder.automaticInputFailoverSettings(automaticInputFailoverSettings)
  }

  public fun inputAttachmentName(inputAttachmentName: String) {
    cdkBuilder.inputAttachmentName(inputAttachmentName)
  }

  public fun inputId(inputId: String) {
    cdkBuilder.inputId(inputId)
  }

  public fun inputSettings(inputSettings: IResolvable) {
    cdkBuilder.inputSettings(inputSettings)
  }

  public fun inputSettings(inputSettings: CfnChannel.InputSettingsProperty) {
    cdkBuilder.inputSettings(inputSettings)
  }

  public fun build(): CfnChannel.InputAttachmentProperty = cdkBuilder.build()
}
