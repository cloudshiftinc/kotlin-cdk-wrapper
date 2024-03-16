@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

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
public interface MessageAttribute {
  /**
   * The data type for the attribute.
   *
   * Default: determined by type inspection if possible, fallback is String
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html#SNSMessageAttributes.DataTypes)
   */
  public fun dataType(): MessageAttributeDataType? =
      unwrap(this).getDataType()?.let(MessageAttributeDataType::wrap)

  /**
   * The value of the attribute.
   */
  public fun `value`(): Any

  /**
   * A builder for [MessageAttribute]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataType The data type for the attribute.
     */
    public fun dataType(dataType: MessageAttributeDataType)

    /**
     * @param value The value of the attribute. 
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.builder()

    /**
     * @param dataType The data type for the attribute.
     */
    override fun dataType(dataType: MessageAttributeDataType) {
      cdkBuilder.dataType(dataType.let(MessageAttributeDataType::unwrap))
    }

    /**
     * @param value The value of the attribute. 
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute,
  ) : CdkObject(cdkObject), MessageAttribute {
    /**
     * The data type for the attribute.
     *
     * Default: determined by type inspection if possible, fallback is String
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-message-attributes.html#SNSMessageAttributes.DataTypes)
     */
    override fun dataType(): MessageAttributeDataType? =
        unwrap(this).getDataType()?.let(MessageAttributeDataType::wrap)

    /**
     * The value of the attribute.
     */
    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MessageAttribute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute):
        MessageAttribute = CdkObjectWrappers.wrap(cdkObject) as MessageAttribute

    internal fun unwrap(wrapped: MessageAttribute):
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
  }
}
