package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

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
        MessageAttribute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MessageAttribute):
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute
  }
}
