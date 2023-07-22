@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThing

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
