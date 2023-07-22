@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThing
import software.amazon.awscdk.services.iot.CfnThingProps

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
