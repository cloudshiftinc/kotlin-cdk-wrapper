@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnInput

@CdkDslMarker
public class CfnInputAttributePropertyDsl {
  private val cdkBuilder: CfnInput.AttributeProperty.Builder = CfnInput.AttributeProperty.builder()

  /**
   * @param jsonPath An expression that specifies an attribute-value pair in a JSON structure. 
   * Use this to specify an attribute from the JSON payload that is made available by the input.
   * Inputs are derived from messages sent to AWS IoT Events ( `BatchPutMessage` ). Each such message
   * contains a JSON payload. The attribute (and its paired value) specified here are available for use
   * in the `condition` expressions used by detectors.
   *
   * Syntax: `&lt;field-name&gt;.&lt;field-name&gt;...`
   */
  public fun jsonPath(jsonPath: String) {
    cdkBuilder.jsonPath(jsonPath)
  }

  public fun build(): CfnInput.AttributeProperty = cdkBuilder.build()
}
