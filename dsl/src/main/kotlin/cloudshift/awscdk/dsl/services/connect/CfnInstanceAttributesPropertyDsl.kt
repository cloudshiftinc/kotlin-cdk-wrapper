@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance

@CdkDslMarker
public class CfnInstanceAttributesPropertyDsl {
  private val cdkBuilder: CfnInstance.AttributesProperty.Builder =
      CfnInstance.AttributesProperty.builder()

  public fun autoResolveBestVoices(autoResolveBestVoices: Boolean) {
    cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
  }

  public fun autoResolveBestVoices(autoResolveBestVoices: IResolvable) {
    cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
  }

  public fun contactLens(contactLens: Boolean) {
    cdkBuilder.contactLens(contactLens)
  }

  public fun contactLens(contactLens: IResolvable) {
    cdkBuilder.contactLens(contactLens)
  }

  public fun contactflowLogs(contactflowLogs: Boolean) {
    cdkBuilder.contactflowLogs(contactflowLogs)
  }

  public fun contactflowLogs(contactflowLogs: IResolvable) {
    cdkBuilder.contactflowLogs(contactflowLogs)
  }

  public fun earlyMedia(earlyMedia: Boolean) {
    cdkBuilder.earlyMedia(earlyMedia)
  }

  public fun earlyMedia(earlyMedia: IResolvable) {
    cdkBuilder.earlyMedia(earlyMedia)
  }

  public fun inboundCalls(inboundCalls: Boolean) {
    cdkBuilder.inboundCalls(inboundCalls)
  }

  public fun inboundCalls(inboundCalls: IResolvable) {
    cdkBuilder.inboundCalls(inboundCalls)
  }

  public fun outboundCalls(outboundCalls: Boolean) {
    cdkBuilder.outboundCalls(outboundCalls)
  }

  public fun outboundCalls(outboundCalls: IResolvable) {
    cdkBuilder.outboundCalls(outboundCalls)
  }

  public fun useCustomTtsVoices(useCustomTtsVoices: Boolean) {
    cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
  }

  public fun useCustomTtsVoices(useCustomTtsVoices: IResolvable) {
    cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
  }

  public fun build(): CfnInstance.AttributesProperty = cdkBuilder.build()
}
