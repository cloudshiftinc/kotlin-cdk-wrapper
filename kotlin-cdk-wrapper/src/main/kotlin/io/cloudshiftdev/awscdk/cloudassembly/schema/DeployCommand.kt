@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a cdk deploy command.
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
public interface DeployCommand : CdkCommand {
  /**
   * Additional arguments to pass to the command This can be used to test specific CLI
   * functionality.
   *
   * Default: - only default args are used
   */
  public fun args(): DeployOptions? = unwrap(this).getArgs()?.let(DeployOptions::wrap)

  /**
   * A builder for [DeployCommand]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    public fun args(args: DeployOptions)

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8f9b2cbe8868946722f2598a0cf02dea231caa7b9e25e519c97fb88051665f4")
    public fun args(args: DeployOptions.Builder.() -> Unit)

    /**
     * @param enabled Whether or not to run this command as part of the workflow This can be used if
     * you only want to test some of the workflow for example enable `synth` and disable `deploy` &amp;
     * `destroy` in order to limit the test to synthesis.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param expectError If the runner should expect this command to fail.
     */
    public fun expectError(expectError: Boolean)

    /**
     * @param expectedMessage This can be used in combination with `expectedError` to validate that
     * a specific message is returned.
     */
    public fun expectedMessage(expectedMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DeployCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.DeployCommand.builder()

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    override fun args(args: DeployOptions) {
      cdkBuilder.args(args.let(DeployOptions::unwrap))
    }

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8f9b2cbe8868946722f2598a0cf02dea231caa7b9e25e519c97fb88051665f4")
    override fun args(args: DeployOptions.Builder.() -> Unit): Unit = args(DeployOptions(args))

    /**
     * @param enabled Whether or not to run this command as part of the workflow This can be used if
     * you only want to test some of the workflow for example enable `synth` and disable `deploy` &amp;
     * `destroy` in order to limit the test to synthesis.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param expectError If the runner should expect this command to fail.
     */
    override fun expectError(expectError: Boolean) {
      cdkBuilder.expectError(expectError)
    }

    /**
     * @param expectedMessage This can be used in combination with `expectedError` to validate that
     * a specific message is returned.
     */
    override fun expectedMessage(expectedMessage: String) {
      cdkBuilder.expectedMessage(expectedMessage)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DeployCommand =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployCommand,
  ) : CdkObject(cdkObject), DeployCommand {
    /**
     * Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     *
     * Default: - only default args are used
     */
    override fun args(): DeployOptions? = unwrap(this).getArgs()?.let(DeployOptions::wrap)

    /**
     * Whether or not to run this command as part of the workflow This can be used if you only want
     * to test some of the workflow for example enable `synth` and disable `deploy` &amp; `destroy` in
     * order to limit the test to synthesis.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * If the runner should expect this command to fail.
     *
     * Default: false
     */
    override fun expectError(): Boolean? = unwrap(this).getExpectError()

    /**
     * This can be used in combination with `expectedError` to validate that a specific message is
     * returned.
     *
     * Default: - do not validate message
     */
    override fun expectedMessage(): String? = unwrap(this).getExpectedMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeployCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DeployCommand):
        DeployCommand = CdkObjectWrappers.wrap(cdkObject) as DeployCommand

    internal fun unwrap(wrapped: DeployCommand):
        software.amazon.awscdk.cloudassembly.schema.DeployCommand = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloudassembly.schema.DeployCommand
  }
}
