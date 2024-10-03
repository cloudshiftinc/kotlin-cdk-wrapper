@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * DeployCommand deployCommand = DeployCommand.builder()
 * .args(DeployOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .changeSetName("changeSetName")
 * .ci(false)
 * .color(false)
 * .concurrency(123)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .exclusively(false)
 * .execute(false)
 * .force(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .notificationArns(List.of("notificationArns"))
 * .output("output")
 * .outputsFile("outputsFile")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .requireApproval(RequireApproval.NEVER)
 * .reuseAssets(List.of("reuseAssets"))
 * .roleArn("roleArn")
 * .rollback(false)
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .toolkitStackName("toolkitStackName")
 * .trace(false)
 * .usePreviousParameters(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build())
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
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
    @JvmName("3a5c8c4f949fd774f4cac39dcb787632d4141f7d76f68e6244f75e85488329f2")
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
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.DeployCommand.Builder =
        software.amazon.awscdk.cloud_assembly_schema.DeployCommand.builder()

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    override fun args(args: DeployOptions) {
      cdkBuilder.args(args.let(DeployOptions.Companion::unwrap))
    }

    /**
     * @param args Additional arguments to pass to the command This can be used to test specific CLI
     * functionality.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a5c8c4f949fd774f4cac39dcb787632d4141f7d76f68e6244f75e85488329f2")
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

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.DeployCommand =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.DeployCommand,
  ) : CdkObject(cdkObject),
      DeployCommand {
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

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.DeployCommand):
        DeployCommand = CdkObjectWrappers.wrap(cdkObject) as? DeployCommand ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeployCommand):
        software.amazon.awscdk.cloud_assembly_schema.DeployCommand = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.DeployCommand
  }
}
