@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface MessageAttribute {
  public fun dataType(): MessageAttributeDataType? =
      unwrap(this).getDataType()?.let(MessageAttributeDataType::wrap)

  public fun `value`(): Any

  @CdkDslMarker
  public interface Builder {
    public fun dataType(dataType: MessageAttributeDataType)

    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.builder()

    override fun dataType(dataType: MessageAttributeDataType) {
      cdkBuilder.dataType(dataType.let(MessageAttributeDataType::unwrap))
    }

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute,
  ) : CdkObject(cdkObject), MessageAttribute {
    override fun dataType(): MessageAttributeDataType? =
        unwrap(this).getDataType()?.let(MessageAttributeDataType::wrap)

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
