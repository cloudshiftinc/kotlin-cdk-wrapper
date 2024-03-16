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
 * Represents a cdk destroy command.
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
public interface DestroyCommand : CdkCommand {
  /**
   * Additional arguments to pass to the command This can be used to test specific CLI
   * functionality.
   *
   * Default: - only default args are used
   */
  public fun args(): DestroyOptions? = unwrap(this).getArgs()?.let(DestroyOptions::wrap)

  /**
   * A builder for [DestroyCommand]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    public fun args(args: DestroyOptions)

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2116604710cd77aa15306e9dffd03e1a94fd9ae11ce16ff5d7d859163960e26")
    public fun args(args: DestroyOptions.Builder.() -> Unit)

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
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.DestroyCommand.Builder =
        software.amazon.awscdk.cloudassembly.schema.DestroyCommand.builder()

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    override fun args(args: DestroyOptions) {
      cdkBuilder.args(args.let(DestroyOptions::unwrap))
    }

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2116604710cd77aa15306e9dffd03e1a94fd9ae11ce16ff5d7d859163960e26")
    override fun args(args: DestroyOptions.Builder.() -> Unit): Unit = args(DestroyOptions(args))

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

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DestroyCommand =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyCommand,
  ) : CdkObject(cdkObject), DestroyCommand {
    /**
     * Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     *
     * Default: - only default args are used
     */
    override fun args(): DestroyOptions? = unwrap(this).getArgs()?.let(DestroyOptions::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): DestroyCommand {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DestroyCommand):
        DestroyCommand = CdkObjectWrappers.wrap(cdkObject) as DestroyCommand

    internal fun unwrap(wrapped: DestroyCommand):
        software.amazon.awscdk.cloudassembly.schema.DestroyCommand = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DestroyCommand
  }
}
