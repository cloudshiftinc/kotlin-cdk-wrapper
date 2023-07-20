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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.Hooks
import software.amazon.awscdk.cloudassembly.schema.TestCase
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TestCaseDsl {
    private val cdkBuilder: TestCase.Builder = TestCase.builder()

    private val _allowDestroy: MutableList<String> = mutableListOf()

    private val _regions: MutableList<String> = mutableListOf()

    private val _stacks: MutableList<String> = mutableListOf()

    public fun allowDestroy(vararg allowDestroy: String) {
        _allowDestroy.addAll(listOf(*allowDestroy))
    }

    public fun allowDestroy(allowDestroy: Collection<String>) {
        _allowDestroy.addAll(allowDestroy)
    }

    public fun assertionStack(assertionStack: String) {
        cdkBuilder.assertionStack(assertionStack)
    }

    public fun assertionStackName(assertionStackName: String) {
        cdkBuilder.assertionStackName(assertionStackName)
    }

    public fun cdkCommandOptions(block: CdkCommandsDsl.() -> Unit = {}) {
        val builder = CdkCommandsDsl()
        builder.apply(block)
        cdkBuilder.cdkCommandOptions(builder.build())
    }

    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
        cdkBuilder.cdkCommandOptions(cdkCommandOptions)
    }

    public fun diffAssets(diffAssets: Boolean) {
        cdkBuilder.diffAssets(diffAssets)
    }

    public fun hooks(block: HooksDsl.() -> Unit = {}) {
        val builder = HooksDsl()
        builder.apply(block)
        cdkBuilder.hooks(builder.build())
    }

    public fun hooks(hooks: Hooks) {
        cdkBuilder.hooks(hooks)
    }

    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
        cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
    }

    public fun stacks(vararg stacks: String) {
        _stacks.addAll(listOf(*stacks))
    }

    public fun stacks(stacks: Collection<String>) {
        _stacks.addAll(stacks)
    }

    public fun build(): TestCase {
        if (_allowDestroy.isNotEmpty()) cdkBuilder.allowDestroy(_allowDestroy)
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        if (_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
        return cdkBuilder.build()
    }
}
