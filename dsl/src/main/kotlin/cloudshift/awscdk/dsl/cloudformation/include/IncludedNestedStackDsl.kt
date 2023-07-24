@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack

/**
 * The type returned from `CfnInclude.getNestedStack`. Contains both the NestedStack object and
 * CfnInclude representations of the child stack.
 *
 * Example:
 *
 * ```
 * CfnInclude parentTemplate;
 * IncludedNestedStack includedChildStack = parentTemplate.getNestedStack("ChildStack");
 * NestedStack childStack = includedChildStack.getStack();
 * CfnInclude childTemplate = includedChildStack.getIncludedTemplate();
 * ```
 */
@CdkDslMarker
public class IncludedNestedStackDsl {
    private val cdkBuilder: IncludedNestedStack.Builder = IncludedNestedStack.builder()

    /**
     * @param includedTemplate The CfnInclude that represents the template, which can be used to
     * access Resources and other template elements.
     */
    public fun includedTemplate(includedTemplate: CfnInclude) {
        cdkBuilder.includedTemplate(includedTemplate)
    }

    /**
     * @param stack The NestedStack object which represents the scope of the template.
     */
    public fun stack(stack: NestedStack) {
        cdkBuilder.stack(stack)
    }

    public fun build(): IncludedNestedStack = cdkBuilder.build()
}
