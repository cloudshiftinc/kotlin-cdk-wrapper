@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * CloudFormation intrinsic functions.
 *
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference.html
 *
 * Example:
 *
 * ```
 * CfnInclude cfnTemplate;
 * // mutating the rule
 * CfnParameter myParameter;
 * CfnRule rule = cfnTemplate.getRule("MyRule");
 * rule.addAssertion(Fn.conditionContains(List.of("m1.small"), myParameter.getValueAsString()),
 * "MyParameter has to be m1.small");
 * ```
 */
public open class Fn(
  cdkObject: software.amazon.awscdk.Fn,
) : CdkObject(cdkObject) {
  public companion object {
    public fun att(logicalNameOfResource: String, attributeName: String): IResolvable =
        software.amazon.awscdk.Fn.getAtt(logicalNameOfResource,
        attributeName).let(IResolvable::wrap)

    public fun azs(): List<String> = software.amazon.awscdk.Fn.getAzs()

    public fun azs(region: String): List<String> = software.amazon.awscdk.Fn.getAzs(region)

    public fun base64(`data`: String): String = software.amazon.awscdk.Fn.base64(`data`)

    public fun cidr(ipBlock: String, count: Number): List<String> =
        software.amazon.awscdk.Fn.cidr(ipBlock, count)

    public fun cidr(
      ipBlock: String,
      count: Number,
      sizeMask: String,
    ): List<String> = software.amazon.awscdk.Fn.cidr(ipBlock, count, sizeMask)

    public fun conditionAnd(conditions: ICfnConditionExpression): ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionAnd(conditions.let(ICfnConditionExpression.Companion::unwrap)).let(ICfnRuleConditionExpression::wrap)

    public fun conditionContains(listOfStrings: List<String>, `value`: String):
        ICfnRuleConditionExpression = software.amazon.awscdk.Fn.conditionContains(listOfStrings,
        `value`).let(ICfnRuleConditionExpression::wrap)

    public fun conditionEachMemberEquals(listOfStrings: List<String>, `value`: String):
        ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionEachMemberEquals(listOfStrings,
        `value`).let(ICfnRuleConditionExpression::wrap)

    public fun conditionEachMemberIn(stringsToCheck: List<String>, stringsToMatch: List<String>):
        ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionEachMemberIn(stringsToCheck,
        stringsToMatch).let(ICfnRuleConditionExpression::wrap)

    public fun conditionEquals(lhs: Any, rhs: Any): ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionEquals(lhs, rhs).let(ICfnRuleConditionExpression::wrap)

    public fun conditionIf(
      conditionId: String,
      valueIfTrue: Any,
      valueIfFalse: Any,
    ): ICfnRuleConditionExpression = software.amazon.awscdk.Fn.conditionIf(conditionId, valueIfTrue,
        valueIfFalse).let(ICfnRuleConditionExpression::wrap)

    public fun conditionNot(condition: ICfnConditionExpression): ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionNot(condition.let(ICfnConditionExpression.Companion::unwrap)).let(ICfnRuleConditionExpression::wrap)

    public fun conditionOr(conditions: ICfnConditionExpression): ICfnRuleConditionExpression =
        software.amazon.awscdk.Fn.conditionOr(conditions.let(ICfnConditionExpression.Companion::unwrap)).let(ICfnRuleConditionExpression::wrap)

    public fun findInMap(
      mapName: String,
      topLevelKey: String,
      secondLevelKey: String,
    ): String = software.amazon.awscdk.Fn.findInMap(mapName, topLevelKey, secondLevelKey)

    public fun findInMap(
      mapName: String,
      topLevelKey: String,
      secondLevelKey: String,
      defaultValue: String,
    ): String = software.amazon.awscdk.Fn.findInMap(mapName, topLevelKey, secondLevelKey,
        defaultValue)

    public fun importListValue(sharedValueToImport: String, assumedLength: Number): List<String> =
        software.amazon.awscdk.Fn.importListValue(sharedValueToImport, assumedLength)

    public fun importListValue(
      sharedValueToImport: String,
      assumedLength: Number,
      delimiter: String,
    ): List<String> = software.amazon.awscdk.Fn.importListValue(sharedValueToImport, assumedLength,
        delimiter)

    public fun importValue(sharedValueToImport: String): String =
        software.amazon.awscdk.Fn.importValue(sharedValueToImport)

    public fun join(delimiter: String, listOfValues: List<String>): String =
        software.amazon.awscdk.Fn.join(delimiter, listOfValues)

    public fun len(array: Any): Number = software.amazon.awscdk.Fn.len(array)

    public fun parseDomainName(url: String): String = software.amazon.awscdk.Fn.parseDomainName(url)

    public fun ref(logicalName: String): String = software.amazon.awscdk.Fn.ref(logicalName)

    public fun refAll(parameterType: String): List<String> =
        software.amazon.awscdk.Fn.refAll(parameterType)

    public fun select(index: Number, array: List<String>): String =
        software.amazon.awscdk.Fn.select(index, array)

    public fun split(delimiter: String, source: String): List<String> =
        software.amazon.awscdk.Fn.split(delimiter, source)

    public fun split(
      delimiter: String,
      source: String,
      assumedLength: Number,
    ): List<String> = software.amazon.awscdk.Fn.split(delimiter, source, assumedLength)

    public fun sub(body: String): String = software.amazon.awscdk.Fn.sub(body)

    public fun sub(body: String, variables: Map<String, String>): String =
        software.amazon.awscdk.Fn.sub(body, variables)

    public fun toJsonString(`object`: Any): String =
        software.amazon.awscdk.Fn.toJsonString(`object`)

    public fun transform(macroName: String, parameters: Map<String, Any>): IResolvable =
        software.amazon.awscdk.Fn.transform(macroName,
        parameters.mapValues{CdkObjectWrappers.unwrap(it.value)}).let(IResolvable::wrap)

    public fun valueOf(parameterOrLogicalId: String, attribute: String): String =
        software.amazon.awscdk.Fn.valueOf(parameterOrLogicalId, attribute)

    public fun valueOfAll(parameterType: String, attribute: String): List<String> =
        software.amazon.awscdk.Fn.valueOfAll(parameterType, attribute)

    internal fun wrap(cdkObject: software.amazon.awscdk.Fn): Fn = Fn(cdkObject)

    internal fun unwrap(wrapped: Fn): software.amazon.awscdk.Fn = wrapped.cdkObject as
        software.amazon.awscdk.Fn
  }
}
