@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TestOptions {
  public fun allowDestroy(): List<String> = unwrap(this).getAllowDestroy() ?: emptyList()

  public fun cdkCommandOptions(): CdkCommands? =
      unwrap(this).getCdkCommandOptions()?.let(CdkCommands::wrap)

  public fun diffAssets(): Boolean? = unwrap(this).getDiffAssets()

  public fun hooks(): Hooks? = unwrap(this).getHooks()?.let(Hooks::wrap)

  public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

  public fun stackUpdateWorkflow(): Boolean? = unwrap(this).getStackUpdateWorkflow()

  @CdkDslMarker
  public interface Builder {
    public fun allowDestroy(allowDestroy: List<String>)

    public fun allowDestroy(vararg allowDestroy: String)

    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55d79223df1e5416fab541b8be9b62f1aec79e85f12e56ec41cbd6c1628828f7")
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit)

    public fun diffAssets(diffAssets: Boolean)

    public fun hooks(hooks: Hooks)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c78c923bad27cd5e67dcb05c13043f91e75bc296b487f1688583d5fb620eeaa")
    public fun hooks(hooks: Hooks.Builder.() -> Unit)

    public fun regions(regions: List<String>)

    public fun regions(vararg regions: String)

    public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.TestOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.TestOptions.builder()

    override fun allowDestroy(allowDestroy: List<String>) {
      cdkBuilder.allowDestroy(allowDestroy)
    }

    override fun allowDestroy(vararg allowDestroy: String): Unit =
        allowDestroy(allowDestroy.toList())

    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
      cdkBuilder.cdkCommandOptions(cdkCommandOptions.let(CdkCommands.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55d79223df1e5416fab541b8be9b62f1aec79e85f12e56ec41cbd6c1628828f7")
    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit): Unit =
        cdkCommandOptions(CdkCommands(cdkCommandOptions))

    override fun diffAssets(diffAssets: Boolean) {
      cdkBuilder.diffAssets(diffAssets)
    }

    override fun hooks(hooks: Hooks) {
      cdkBuilder.hooks(hooks.let(Hooks.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c78c923bad27cd5e67dcb05c13043f91e75bc296b487f1688583d5fb620eeaa")
    override fun hooks(hooks: Hooks.Builder.() -> Unit): Unit = hooks(Hooks(hooks))

    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    override fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
      cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TestOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.TestOptions,
  ) : CdkObject(cdkObject),
      TestOptions {
    override fun allowDestroy(): List<String> = unwrap(this).getAllowDestroy() ?: emptyList()

    override fun cdkCommandOptions(): CdkCommands? =
        unwrap(this).getCdkCommandOptions()?.let(CdkCommands::wrap)

    override fun diffAssets(): Boolean? = unwrap(this).getDiffAssets()

    override fun hooks(): Hooks? = unwrap(this).getHooks()?.let(Hooks::wrap)

    override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    override fun stackUpdateWorkflow(): Boolean? = unwrap(this).getStackUpdateWorkflow()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TestOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.TestOptions):
        TestOptions = CdkObjectWrappers.wrap(cdkObject) as? TestOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TestOptions):
        software.amazon.awscdk.cloudassembly.schema.TestOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.TestOptions
  }
}
