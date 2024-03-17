@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Options for specific cdk commands that are run as part of the integration test workflow.
 *
 * Example:
 *
 * ```
 * App app = new App();
 * Stack stackUnderTest = new Stack(app, "StackUnderTest");
 * Stack stack = new Stack(app, "stack");
 * IntegTest testCase = IntegTest.Builder.create(app, "CustomizedDeploymentWorkflow")
 * .testCases(List.of(stackUnderTest))
 * .diffAssets(true)
 * .stackUpdateWorkflow(true)
 * .cdkCommandOptions(CdkCommands.builder()
 * .deploy(DeployCommand.builder()
 * .args(DeployOptions.builder()
 * .requireApproval(RequireApproval.NEVER)
 * .json(true)
 * .build())
 * .build())
 * .destroy(DestroyCommand.builder()
 * .args(DestroyOptions.builder()
 * .force(true)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface CdkCommands {
  /**
   * Options to for the cdk deploy command.
   *
   * Default: - default deploy options
   */
  public fun deploy(): DeployCommand? = unwrap(this).getDeploy()?.let(DeployCommand::wrap)

  /**
   * Options to for the cdk destroy command.
   *
   * Default: - default destroy options
   */
  public fun destroy(): DestroyCommand? = unwrap(this).getDestroy()?.let(DestroyCommand::wrap)

  /**
   * A builder for [CdkCommands]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploy Options to for the cdk deploy command.
     */
    public fun deploy(deploy: DeployCommand)

    /**
     * @param deploy Options to for the cdk deploy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b935ef39068b6f10b7dce2573cd5b75c591e12922f229a59f18bfaa88b423ce")
    public fun deploy(deploy: DeployCommand.Builder.() -> Unit)

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    public fun destroy(destroy: DestroyCommand)

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0399fe3e9eb59fa37191a75cc7eae2c72d3d577da6e528a9c1fe1b650562d4")
    public fun destroy(destroy: DestroyCommand.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.CdkCommands.Builder =
        software.amazon.awscdk.cloudassembly.schema.CdkCommands.builder()

    /**
     * @param deploy Options to for the cdk deploy command.
     */
    override fun deploy(deploy: DeployCommand) {
      cdkBuilder.deploy(deploy.let(DeployCommand::unwrap))
    }

    /**
     * @param deploy Options to for the cdk deploy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b935ef39068b6f10b7dce2573cd5b75c591e12922f229a59f18bfaa88b423ce")
    override fun deploy(deploy: DeployCommand.Builder.() -> Unit): Unit =
        deploy(DeployCommand(deploy))

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    override fun destroy(destroy: DestroyCommand) {
      cdkBuilder.destroy(destroy.let(DestroyCommand::unwrap))
    }

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f0399fe3e9eb59fa37191a75cc7eae2c72d3d577da6e528a9c1fe1b650562d4")
    override fun destroy(destroy: DestroyCommand.Builder.() -> Unit): Unit =
        destroy(DestroyCommand(destroy))

    public fun build(): software.amazon.awscdk.cloudassembly.schema.CdkCommands = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.CdkCommands,
  ) : CdkObject(cdkObject), CdkCommands {
    /**
     * Options to for the cdk deploy command.
     *
     * Default: - default deploy options
     */
    override fun deploy(): DeployCommand? = unwrap(this).getDeploy()?.let(DeployCommand::wrap)

    /**
     * Options to for the cdk destroy command.
     *
     * Default: - default destroy options
     */
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
