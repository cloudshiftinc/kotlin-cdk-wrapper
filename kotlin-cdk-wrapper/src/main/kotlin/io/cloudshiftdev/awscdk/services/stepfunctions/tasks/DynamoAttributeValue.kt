@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Represents the data for an attribute.
 *
 * Each attribute value is described as a name-value pair.
 * The name is the data type, and the value is the data itself.
 *
 * Example:
 *
 * ```
 * Table myTable;
 * DynamoDeleteItem.Builder.create(this, "DeleteItem")
 * .key(Map.of("MessageId", DynamoAttributeValue.fromString("message-007")))
 * .table(myTable)
 * .resultPath(JsonPath.DISCARD)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html)
 */
public open class DynamoAttributeValue internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue,
) : CdkObject(cdkObject) {
  /**
   * Represents the data for the attribute.
   *
   * Data can be
   * i.e. "S": "Hello"
   */
  public open fun attributeValue(): Any = unwrap(this).getAttributeValue()

  /**
   * Returns the DynamoDB attribute value.
   */
  public open fun toObject(): Any = unwrap(this).toObject()

  public companion object {
    public fun booleanFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.booleanFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public fun fromBinary(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBinary(`value`).let(DynamoAttributeValue::wrap)

    public fun fromBinarySet(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBinarySet(`value`).let(DynamoAttributeValue::wrap)

    public fun fromBinarySet(vararg `value`: String): DynamoAttributeValue =
        fromBinarySet(`value`.toList())

    public fun fromBoolean(`value`: Boolean): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromBoolean(`value`).let(DynamoAttributeValue::wrap)

    public fun fromList(`value`: List<DynamoAttributeValue>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromList(`value`.map(DynamoAttributeValue::unwrap)).let(DynamoAttributeValue::wrap)

    public fun fromList(vararg `value`: DynamoAttributeValue): DynamoAttributeValue =
        fromList(`value`.toList())

    public fun fromMap(`value`: Map<String, DynamoAttributeValue>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromMap(`value`.mapValues{DynamoAttributeValue.unwrap(it.value)}).let(DynamoAttributeValue::wrap)

    public fun fromNull(`value`: Boolean): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNull(`value`).let(DynamoAttributeValue::wrap)

    public fun fromNumber(`value`: Number): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNumber(`value`).let(DynamoAttributeValue::wrap)

    public fun fromNumberSet(`value`: List<Number>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromNumberSet(`value`).let(DynamoAttributeValue::wrap)

    public fun fromNumberSet(vararg `value`: Number): DynamoAttributeValue =
        fromNumberSet(`value`.toList())

    public fun fromString(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromString(`value`).let(DynamoAttributeValue::wrap)

    public fun fromStringSet(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.fromStringSet(`value`).let(DynamoAttributeValue::wrap)

    public fun fromStringSet(vararg `value`: String): DynamoAttributeValue =
        fromStringSet(`value`.toList())

    public fun listFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.listFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public fun mapFromJsonPath(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.mapFromJsonPath(`value`).let(DynamoAttributeValue::wrap)

    public fun numberFromString(`value`: String): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.numberFromString(`value`).let(DynamoAttributeValue::wrap)

    public fun numberSetFromStrings(`value`: List<String>): DynamoAttributeValue =
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue.numberSetFromStrings(`value`).let(DynamoAttributeValue::wrap)

    public fun numberSetFromStrings(vararg `value`: String): DynamoAttributeValue =
        numberSetFromStrings(`value`.toList())

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue):
        DynamoAttributeValue = DynamoAttributeValue(cdkObject)

    internal fun unwrap(wrapped: DynamoAttributeValue):
        software.amazon.awscdk.services.stepfunctions.tasks.DynamoAttributeValue = wrapped.cdkObject
  }
}
