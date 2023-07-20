@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.cloudformation.include

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.cloudformation.include.CfnInclude
import software.amazon.awscdk.cloudformation.include.IncludedNestedStack

@CdkDslMarker
public class IncludedNestedStackDsl {
    private val cdkBuilder: IncludedNestedStack.Builder = IncludedNestedStack.builder()

    public fun includedTemplate(includedTemplate: CfnInclude) {
        cdkBuilder.includedTemplate(includedTemplate)
    }

    public fun stack(stack: NestedStack) {
        cdkBuilder.stack(stack)
    }

    public fun build(): IncludedNestedStack = cdkBuilder.build()
}
