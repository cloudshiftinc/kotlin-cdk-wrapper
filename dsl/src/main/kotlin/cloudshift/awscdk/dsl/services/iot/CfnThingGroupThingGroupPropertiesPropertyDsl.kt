@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingGroup

@CdkDslMarker
public class CfnThingGroupThingGroupPropertiesPropertyDsl {
  private val cdkBuilder: CfnThingGroup.ThingGroupPropertiesProperty.Builder =
      CfnThingGroup.ThingGroupPropertiesProperty.builder()

  public fun attributePayload(attributePayload: IResolvable) {
    cdkBuilder.attributePayload(attributePayload)
  }

  public fun attributePayload(attributePayload: CfnThingGroup.AttributePayloadProperty) {
    cdkBuilder.attributePayload(attributePayload)
  }

  public fun thingGroupDescription(thingGroupDescription: String) {
    cdkBuilder.thingGroupDescription(thingGroupDescription)
  }

  public fun build(): CfnThingGroup.ThingGroupPropertiesProperty = cdkBuilder.build()
}
