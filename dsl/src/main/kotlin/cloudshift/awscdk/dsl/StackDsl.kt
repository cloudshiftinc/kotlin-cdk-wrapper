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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Environment
import software.amazon.awscdk.IStackSynthesizer
import software.amazon.awscdk.PermissionsBoundary
import software.amazon.awscdk.Stack
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class StackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Stack.Builder = Stack.Builder.create(scope, id)

    public fun analyticsReporting(analyticsReporting: Boolean) {
        cdkBuilder.analyticsReporting(analyticsReporting)
    }

    public fun crossRegionReferences(crossRegionReferences: Boolean) {
        cdkBuilder.crossRegionReferences(crossRegionReferences)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun env(block: EnvironmentDsl.() -> Unit = {}) {
        val builder = EnvironmentDsl()
        builder.apply(block)
        cdkBuilder.env(builder.build())
    }

    public fun env(env: Environment) {
        cdkBuilder.env(env)
    }

    public fun permissionsBoundary(permissionsBoundary: PermissionsBoundary) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun suppressTemplateIndentation(suppressTemplateIndentation: Boolean) {
        cdkBuilder.suppressTemplateIndentation(suppressTemplateIndentation)
    }

    public fun synthesizer(synthesizer: IStackSynthesizer) {
        cdkBuilder.synthesizer(synthesizer)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun terminationProtection(terminationProtection: Boolean) {
        cdkBuilder.terminationProtection(terminationProtection)
    }

    public fun build(): Stack = cdkBuilder.build()
}
