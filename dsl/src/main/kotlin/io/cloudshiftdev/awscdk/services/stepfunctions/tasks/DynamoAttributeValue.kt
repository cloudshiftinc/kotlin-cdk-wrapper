package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class DynamoAttributeValue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue,
) {
  public open fun attributeValue(): Any = unwrap(this).getAttributeValue()

  public open fun toObject(): Any = unwrap(this).toObject()

  public companion object {
    public open fun booleanFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.booleanFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromBinary(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBinary(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromBinarySet(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBinarySet(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromBoolean(`value`: Boolean): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBoolean(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromList(`value`: List<DynamoAttributeValue>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromList(`value`.map(DynamoAttributeValue::unwrap)).let(DynamoAttributeValue::wrap)

    public open fun fromMap(`value`: Map<String, DynamoAttributeValue>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromMap(`value`.mapValues{DynamoAttributeValue.unwrap(it.value)}).let(DynamoAttributeValue::wrap)

    public open fun fromNull(`value`: Boolean): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNull(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromNumber(`value`: Number): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNumber(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromNumberSet(`value`: List<Number>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNumberSet(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromString(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromString(`value`).let(DynamoAttributeValue::wrap)

    public open fun fromStringSet(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromStringSet(`value`).let(DynamoAttributeValue::wrap)

    public open fun listFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.listFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public open fun mapFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.mapFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public open fun numberFromString(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.numberFromString(`value`).let(DynamoAttributeValue::wrap)

    public open fun numberSetFromStrings(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.numberSetFromStrings(`value`).let(DynamoAttributeValue::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue):
        DynamoAttributeValue = DynamoAttributeValue(cdkObject)

    internal fun unwrap(wrapped: DynamoAttributeValue):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue = wrapped.cdkObject
  }
}
