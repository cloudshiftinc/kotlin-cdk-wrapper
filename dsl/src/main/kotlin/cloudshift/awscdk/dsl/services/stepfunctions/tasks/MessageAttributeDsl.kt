@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType

@CdkDslMarker
public class MessageAttributeDsl {
  private val cdkBuilder: MessageAttribute.Builder = MessageAttribute.builder()

  /**
   * @param dataType The data type for the attribute.
   */
  public fun dataType(dataType: MessageAttributeDataType) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param value The value of the attribute. 
   */
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
  }

  /**
   * @param value The value of the attribute. 
   */
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): MessageAttribute = cdkBuilder.build()
}
