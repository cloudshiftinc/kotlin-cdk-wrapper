@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps

/**
 * Properties for defining a `CfnThing`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThingProps cfnThingProps = CfnThingProps.builder()
 * .attributePayload(AttributePayloadProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .build())
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thing.html)
 */
@CdkDslMarker
public class CfnThingPropsDsl {
  private val cdkBuilder: CfnThingProps.Builder = CfnThingProps.builder()

  /**
   * @param attributePayload A string that contains up to three key value pairs.
   * Maximum length of 800. Duplicates not allowed.
   */
  public fun attributePayload(attributePayload: IResolvable) {
    cdkBuilder.attributePayload(attributePayload)
  }

  /**
   * @param attributePayload A string that contains up to three key value pairs.
   * Maximum length of 800. Duplicates not allowed.
   */
  public fun attributePayload(attributePayload: CfnThing.AttributePayloadProperty) {
    cdkBuilder.attributePayload(attributePayload)
  }

  /**
   * @param thingName The name of the thing to update.
   * You can't change a thing's name. To change a thing's name, you must create a new thing, give it
   * the new name, and then delete the old thing.
   */
  public fun thingName(thingName: String) {
    cdkBuilder.thingName(thingName)
  }

  public fun build(): CfnThingProps = cdkBuilder.build()
}
