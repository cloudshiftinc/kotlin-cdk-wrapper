@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThing

/**
 * The AttributePayload property specifies up to three attributes for an AWS IoT as key-value pairs.
 *
 * AttributePayload is a property of the
 * [AWS::IoT::Thing](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AttributePayloadProperty attributePayloadProperty = AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thing-attributepayload.html)
 */
@CdkDslMarker
public class CfnThingAttributePayloadPropertyDsl {
  private val cdkBuilder: CfnThing.AttributePayloadProperty.Builder =
      CfnThing.AttributePayloadProperty.builder()

  /**
   * @param attributes A JSON string containing up to three key-value pair in JSON format. For
   * example:.
   * `{\"attributes\":{\"string1\":\"string2\"}}`
   */
  public fun attributes(attributes: Map<String, String>) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param attributes A JSON string containing up to three key-value pair in JSON format. For
   * example:.
   * `{\"attributes\":{\"string1\":\"string2\"}}`
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun build(): CfnThing.AttributePayloadProperty = cdkBuilder.build()
}
