@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance

/**
 * *This is a preview release for Amazon Connect .
 *
 * It is subject to change.*
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * AttributesProperty attributesProperty = AttributesProperty.builder()
 * .inboundCalls(false)
 * .outboundCalls(false)
 * // the properties below are optional
 * .autoResolveBestVoices(false)
 * .contactflowLogs(false)
 * .contactLens(false)
 * .earlyMedia(false)
 * .useCustomTtsVoices(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html)
 */
@CdkDslMarker
public class CfnInstanceAttributesPropertyDsl {
  private val cdkBuilder: CfnInstance.AttributesProperty.Builder =
      CfnInstance.AttributesProperty.builder()

  /**
   * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
   * instance.
   */
  public fun autoResolveBestVoices(autoResolveBestVoices: Boolean) {
    cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
  }

  /**
   * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
   * instance.
   */
  public fun autoResolveBestVoices(autoResolveBestVoices: IResolvable) {
    cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
  }

  /**
   * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
   */
  public fun contactLens(contactLens: Boolean) {
    cdkBuilder.contactLens(contactLens)
  }

  /**
   * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
   */
  public fun contactLens(contactLens: IResolvable) {
    cdkBuilder.contactLens(contactLens)
  }

  /**
   * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
   */
  public fun contactflowLogs(contactflowLogs: Boolean) {
    cdkBuilder.contactflowLogs(contactflowLogs)
  }

  /**
   * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
   */
  public fun contactflowLogs(contactflowLogs: IResolvable) {
    cdkBuilder.contactflowLogs(contactflowLogs)
  }

  /**
   * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
   */
  public fun earlyMedia(earlyMedia: Boolean) {
    cdkBuilder.earlyMedia(earlyMedia)
  }

  /**
   * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
   */
  public fun earlyMedia(earlyMedia: IResolvable) {
    cdkBuilder.earlyMedia(earlyMedia)
  }

  /**
   * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
   */
  public fun inboundCalls(inboundCalls: Boolean) {
    cdkBuilder.inboundCalls(inboundCalls)
  }

  /**
   * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
   */
  public fun inboundCalls(inboundCalls: IResolvable) {
    cdkBuilder.inboundCalls(inboundCalls)
  }

  /**
   * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
   */
  public fun outboundCalls(outboundCalls: Boolean) {
    cdkBuilder.outboundCalls(outboundCalls)
  }

  /**
   * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
   */
  public fun outboundCalls(outboundCalls: IResolvable) {
    cdkBuilder.outboundCalls(outboundCalls)
  }

  /**
   * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
   */
  public fun useCustomTtsVoices(useCustomTtsVoices: Boolean) {
    cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
  }

  /**
   * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
   */
  public fun useCustomTtsVoices(useCustomTtsVoices: IResolvable) {
    cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
  }

  public fun build(): CfnInstance.AttributesProperty = cdkBuilder.build()
}
