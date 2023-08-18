@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.cloudformation.include

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack

/**
 * Includes a template for a child stack inside of this parent template.
 *
 * A child with this logical ID must exist in the template, and be of type
 * AWS::CloudFormation::Stack. This is equivalent to specifying the value in the
 * `CfnIncludeProps.loadNestedStacks` property on object construction.
 *
 * @param logicalId the ID of the stack to retrieve, as it appears in the template.
 * @param nestedStackProps the properties of the included child Stack.
 * @return the same `IncludedNestedStack` object that `getNestedStack` returns for this logical ID
 */
public inline fun CfnInclude.loadNestedStack(
    logicalId: String,
    block: CfnIncludePropsDsl.() -> Unit = {}
): IncludedNestedStack {
    val builder = CfnIncludePropsDsl()
    builder.apply(block)
    return loadNestedStack(logicalId, builder.build())
}
