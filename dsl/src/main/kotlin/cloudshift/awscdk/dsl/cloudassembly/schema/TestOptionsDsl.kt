@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.Hooks
import software.amazon.awscdk.cloudassembly.schema.TestOptions

@CdkDslMarker
public class TestOptionsDsl {
  private val cdkBuilder: TestOptions.Builder = TestOptions.builder()

  private val _allowDestroy: MutableList<String> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  public fun allowDestroy(vararg allowDestroy: String) {
    _allowDestroy.addAll(listOf(*allowDestroy))
  }

  public fun allowDestroy(allowDestroy: Collection<String>) {
    _allowDestroy.addAll(allowDestroy)
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

  public fun build(): TestOptions {
    if(_allowDestroy.isNotEmpty()) cdkBuilder.allowDestroy(_allowDestroy)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    return cdkBuilder.build()
  }
}
