@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List

/**
 * Extract a field from the State Machine data or context that gets passed around between states.
 *
 * Example:
 *
 * ```
 * Activity submitJobActivity = new Activity(this, "SubmitJob");
 * StepFunctionsInvokeActivity.Builder.create(this, "Submit Job")
 * .activity(submitJobActivity)
 * .parameters(Map.of(
 * "comment", "Selecting what I care about.",
 * "MyDetails", Map.of(
 * "size", JsonPath.stringAt("$.product.details.size"),
 * "exists", JsonPath.stringAt("$.product.availability"),
 * "StaticValue", "foo")))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/step-functions/latest/dg/amazon-states-language-paths.html)
 */
public open class JsonPath internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.JsonPath,
) : CdkObject(cdkObject) {
  public companion object {
    public val DISCARD: String = software.amazon.awscdk.services.stepfunctions.JsonPath.DISCARD

    public fun array(values: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.array(values)

    public fun arrayContains(array: Any, `value`: Any): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.arrayContains(array, `value`)

    public fun arrayGetItem(array: Any, index: Number): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.arrayGetItem(array, index)

    public fun arrayLength(array: Any): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.arrayLength(array)

    public fun arrayPartition(array: Any, chunkSize: Number): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.arrayPartition(array, chunkSize)

    public fun arrayRange(
      start: Number,
      end: Number,
      step: Number,
    ): String = software.amazon.awscdk.services.stepfunctions.JsonPath.arrayRange(start, end, step)

    public fun arrayUnique(array: Any): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.arrayUnique(array)

    public fun base64Decode(base64: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.base64Decode(base64)

    public fun base64Encode(input: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.base64Encode(input)

    public fun entireContext(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getEntireContext()

    public fun entirePayload(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getEntirePayload()

    public fun executionId(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getExecutionId()

    public fun executionInput(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getExecutionInput()

    public fun executionName(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getExecutionName()

    public fun executionRoleArn(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getExecutionRoleArn()

    public fun executionStartTime(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getExecutionStartTime()

    public fun format(formatString: String, values: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.format(formatString, values)

    public fun hash(`data`: Any, algorithm: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.hash(`data`, algorithm)

    public fun isEncodedJsonPath(`value`: String): Boolean =
        software.amazon.awscdk.services.stepfunctions.JsonPath.isEncodedJsonPath(`value`)

    public fun jsonMerge(value1: Any, value2: Any): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.jsonMerge(value1, value2)

    public fun jsonToString(`value`: Any): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.jsonToString(`value`)

    public fun listAt(path: String): List<String> =
        software.amazon.awscdk.services.stepfunctions.JsonPath.listAt(path)

    public fun mathAdd(num1: Number, num2: Number): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.mathAdd(num1, num2)

    public fun mathRandom(start: Number, end: Number): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.mathRandom(start, end)

    public fun numberAt(path: String): Number =
        software.amazon.awscdk.services.stepfunctions.JsonPath.numberAt(path)

    public fun objectAt(path: String): IResolvable =
        software.amazon.awscdk.services.stepfunctions.JsonPath.objectAt(path).let(IResolvable::wrap)

    public fun stateEnteredTime(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getStateEnteredTime()

    public fun stateMachineId(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getStateMachineId()

    public fun stateMachineName(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getStateMachineName()

    public fun stateName(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getStateName()

    public fun stateRetryCount(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getStateRetryCount()

    public fun stringAt(path: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.stringAt(path)

    public fun stringSplit(inputString: String, splitter: String): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.stringSplit(inputString, splitter)

    public fun stringToJson(jsonString: String): IResolvable =
        software.amazon.awscdk.services.stepfunctions.JsonPath.stringToJson(jsonString).let(IResolvable::wrap)

    public fun taskToken(): String =
        software.amazon.awscdk.services.stepfunctions.JsonPath.getTaskToken()

    public fun uuid(): String = software.amazon.awscdk.services.stepfunctions.JsonPath.uuid()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.JsonPath): JsonPath =
        JsonPath(cdkObject)

    internal fun unwrap(wrapped: JsonPath): software.amazon.awscdk.services.stepfunctions.JsonPath =
        wrapped.cdkObject
  }
}
