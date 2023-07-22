@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
import software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType

/**
 * A message attribute to add to the SNS message.
 *
 * Example:
 *
 * ```
 * Topic topic = new Topic(this, "Topic");
 * // Use a field from the execution data as message.
 * SnsPublish task1 = SnsPublish.Builder.create(this, "Publish1")
 * .topic(topic)
 * .integrationPattern(IntegrationPattern.REQUEST_RESPONSE)
 * .message(TaskInput.fromDataAt("$.state.message"))
 * .messageAttributes(Map.of(
 * "place", MessageAttribute.builder()
 * .value(JsonPath.stringAt("$.place"))
 * .build(),
 * "pic", MessageAttribute.builder()
 * // BINARY must be explicitly set
 * .dataType(MessageAttributeDataType.BINARY)
 * .value(JsonPath.stringAt("$.pic"))
 * .build(),
 * "people", MessageAttribute.builder()
 * .value(4)
 * .build(),
 * "handles", MessageAttribute.builder()
 * .value(List.of("&#64;kslater", "&#64;jjf", null, "&#64;mfanning"))
 * .build()))
 * .build();
 * // Combine a field from the execution data with
 * // a literal object.
 * SnsPublish task2 = SnsPublish.Builder.create(this, "Publish2")
 * .topic(topic)
 * .message(TaskInput.fromObject(Map.of(
 * "field1", "somedata",
 * "field2", JsonPath.stringAt("$.field2"))))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html)
 */
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
