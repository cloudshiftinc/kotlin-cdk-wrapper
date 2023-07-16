@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotAllowedInputTypesPropertyDsl {
  private val cdkBuilder: CfnBot.AllowedInputTypesProperty.Builder =
      CfnBot.AllowedInputTypesProperty.builder()

  public fun allowAudioInput(allowAudioInput: Boolean) {
    cdkBuilder.allowAudioInput(allowAudioInput)
  }

  public fun allowAudioInput(allowAudioInput: IResolvable) {
    cdkBuilder.allowAudioInput(allowAudioInput)
  }

  public fun allowDtmfInput(allowDtmfInput: Boolean) {
    cdkBuilder.allowDtmfInput(allowDtmfInput)
  }

  public fun allowDtmfInput(allowDtmfInput: IResolvable) {
    cdkBuilder.allowDtmfInput(allowDtmfInput)
  }

  public fun build(): CfnBot.AllowedInputTypesProperty = cdkBuilder.build()
}
