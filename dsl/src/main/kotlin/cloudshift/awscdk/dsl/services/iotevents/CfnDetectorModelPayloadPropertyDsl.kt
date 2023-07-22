@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Information needed to configure the payload.
 *
 * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
 * payload contains all attribute-value pairs that have the information about the detector model
 * instance and the event triggered the action. To configure the action payload, you can use
 * `contentExpression` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * PayloadProperty payloadProperty = PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html)
 */
@CdkDslMarker
public class CfnDetectorModelPayloadPropertyDsl {
  private val cdkBuilder: CfnDetectorModel.PayloadProperty.Builder =
      CfnDetectorModel.PayloadProperty.builder()

  /**
   * @param contentExpression The content of the payload. 
   * You can use a string expression that includes quoted strings ( `'&lt;string&gt;'` ), variables
   * ( `$variable.&lt;variable-name&gt;` ), input values (
   * `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ), string concatenations, and quoted strings
   * that contain `${}` as the content. The recommended maximum size of a content expression is 1 KB.
   */
  public fun contentExpression(contentExpression: String) {
    cdkBuilder.contentExpression(contentExpression)
  }

  /**
   * @param type The value of the payload type can be either `STRING` or `JSON` . 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDetectorModel.PayloadProperty = cdkBuilder.build()
}
