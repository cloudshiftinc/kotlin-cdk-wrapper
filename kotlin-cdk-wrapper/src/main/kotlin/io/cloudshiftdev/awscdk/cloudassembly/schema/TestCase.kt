@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TestCase : TestOptions {
  public fun assertionStack(): String? = unwrap(this).getAssertionStack()

  public fun assertionStackName(): String? = unwrap(this).getAssertionStackName()

  public fun stacks(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun allowDestroy(allowDestroy: List<String>)

    public fun allowDestroy(vararg allowDestroy: String)

    public fun assertionStack(assertionStack: String)

    public fun assertionStackName(assertionStackName: String)

    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78c54b6490decdbe945db9fe2af6dceb91d6a44102b44cc0417752d78fac1daa")
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit)

    public fun diffAssets(diffAssets: Boolean)

    public fun hooks(hooks: Hooks)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09638aa4be6b2b37d5e6eaca666f23376062bcc34cc8068feae02b6887c984a")
    public fun hooks(hooks: Hooks.Builder.() -> Unit)

    public fun regions(regions: List<String>)

    public fun regions(vararg regions: String)

    public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean)

    public fun stacks(stacks: List<String>)

    public fun stacks(vararg stacks: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.TestCase.Builder =
        software.amazon.awscdk.cloudassembly.schema.TestCase.builder()

    override fun allowDestroy(allowDestroy: List<String>) {
      cdkBuilder.allowDestroy(allowDestroy)
    }

    override fun allowDestroy(vararg allowDestroy: String): Unit =
        allowDestroy(allowDestroy.toList())

    override fun assertionStack(assertionStack: String) {
      cdkBuilder.assertionStack(assertionStack)
    }

    override fun assertionStackName(assertionStackName: String) {
      cdkBuilder.assertionStackName(assertionStackName)
    }

    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
      cdkBuilder.cdkCommandOptions(cdkCommandOptions.let(CdkCommands::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78c54b6490decdbe945db9fe2af6dceb91d6a44102b44cc0417752d78fac1daa")
    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit): Unit =
        cdkCommandOptions(CdkCommands(cdkCommandOptions))

    override fun diffAssets(diffAssets: Boolean) {
      cdkBuilder.diffAssets(diffAssets)
    }

    override fun hooks(hooks: Hooks) {
      cdkBuilder.hooks(hooks.let(Hooks::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09638aa4be6b2b37d5e6eaca666f23376062bcc34cc8068feae02b6887c984a")
    override fun hooks(hooks: Hooks.Builder.() -> Unit): Unit = hooks(Hooks(hooks))

    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    override fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
      cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
    }

    override fun stacks(stacks: List<String>) {
      cdkBuilder.stacks(stacks)
    }

    override fun stacks(vararg stacks: String): Unit = stacks(stacks.toList())

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TestCase = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.TestCase,
  ) : CdkObject(cdkObject), TestCase {
    override fun allowDestroy(): List<String> = unwrap(this).getAllowDestroy() ?: emptyList()

    override fun assertionStack(): String? = unwrap(this).getAssertionStack()

    override fun assertionStackName(): String? = unwrap(this).getAssertionStackName()

    override fun cdkCommandOptions(): CdkCommands? =
        unwrap(this).getCdkCommandOptions()?.let(CdkCommands::wrap)

    override fun diffAssets(): Boolean? = unwrap(this).getDiffAssets()

    override fun hooks(): Hooks? = unwrap(this).getHooks()?.let(Hooks::wrap)

    override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    override fun stackUpdateWorkflow(): Boolean? = unwrap(this).getStackUpdateWorkflow()

    override fun stacks(): List<String> = unwrap(this).getStacks()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TestCase {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.TestCase): TestCase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TestCase): software.amazon.awscdk.cloudassembly.schema.TestCase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.TestCase
  }
}
