@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CdkCommands {
  public fun deploy(): DeployCommand? = unwrap(this).getDeploy()?.let(DeployCommand::wrap)

  public fun destroy(): DestroyCommand? = unwrap(this).getDestroy()?.let(DestroyCommand::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deploy(deploy: DeployCommand)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b935ef39068b6f10b7dce2573cd5b75c591e12922f229a59f18bfaa88b423ce")
    public fun deploy(deploy: DeployCommand.Builder.() -> Unit)

    public fun destroy(destroy: DestroyCommand)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0399fe3e9eb59fa37191a75cc7eae2c72d3d577da6e528a9c1fe1b650562d4")
    public fun destroy(destroy: DestroyCommand.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.CdkCommands.Builder =
        software.amazon.awscdk.cloudassembly.schema.CdkCommands.builder()

    override fun deploy(deploy: DeployCommand) {
      cdkBuilder.deploy(deploy.let(DeployCommand.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b935ef39068b6f10b7dce2573cd5b75c591e12922f229a59f18bfaa88b423ce")
    override fun deploy(deploy: DeployCommand.Builder.() -> Unit): Unit =
        deploy(DeployCommand(deploy))

    override fun destroy(destroy: DestroyCommand) {
      cdkBuilder.destroy(destroy.let(DestroyCommand.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0399fe3e9eb59fa37191a75cc7eae2c72d3d577da6e528a9c1fe1b650562d4")
    override fun destroy(destroy: DestroyCommand.Builder.() -> Unit): Unit =
        destroy(DestroyCommand(destroy))

    public fun build(): software.amazon.awscdk.cloudassembly.schema.CdkCommands = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommands,
  ) : CdkObject(cdkObject),
      CdkCommands {
    override fun deploy(): DeployCommand? = unwrap(this).getDeploy()?.let(DeployCommand::wrap)

    override fun destroy(): DestroyCommand? = unwrap(this).getDestroy()?.let(DestroyCommand::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CdkCommands {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommands):
        CdkCommands = CdkObjectWrappers.wrap(cdkObject) as? CdkCommands ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CdkCommands):
        software.amazon.awscdk.cloudassembly.schema.CdkCommands = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.CdkCommands
  }
}
