@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cloudformation.include

import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.CfnIncludeProps
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object include {
    /**
     * Construct to import an existing CloudFormation template file into a CDK application.
     *
     * All resources defined in the template file can be retrieved by calling the `getResource`
     * method.
     * Any modifications made on the returned resource objects will be reflected in the resulting CDK
     * template.
     *
     * Example:
     *
     * ```
     * CfnInclude cfnTemplate = CfnInclude.Builder.create(this, "Template")
     * .templateFile("my-template.json")
     * .build();
     * ```
     */
    public inline fun cfnInclude(
        scope: Construct,
        id: String,
        block: CfnIncludeDsl.() -> Unit = {}
    ): CfnInclude {
        val builder = CfnIncludeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Construction properties of `CfnInclude`.
     *
     * Example:
     *
     * ```
     * CfnInclude parentTemplate = CfnInclude.Builder.create(this, "ParentStack")
     * .templateFile("path/to/my-parent-template.json")
     * .loadNestedStacks(Map.of(
     * "ChildStack", CfnIncludeProps.builder()
     * .templateFile("path/to/my-nested-template.json")
     * .build()))
     * .build();
     * ```
     */
    public inline fun cfnIncludeProps(block: CfnIncludePropsDsl.() -> Unit = {}): CfnIncludeProps {
        val builder = CfnIncludePropsDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun includedNestedStack(block: IncludedNestedStackDsl.() -> Unit = {}): IncludedNestedStack {
        val builder = IncludedNestedStackDsl()
        builder.apply(block)
        return builder.build()
    }
}
