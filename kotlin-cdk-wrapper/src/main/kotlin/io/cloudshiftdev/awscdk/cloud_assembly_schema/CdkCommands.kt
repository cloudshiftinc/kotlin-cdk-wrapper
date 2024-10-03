@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

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
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * CdkCommands cdkCommands = CdkCommands.builder()
 * .deploy(DeployCommand.builder()
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
 * .build())
 * .destroy(DestroyCommand.builder()
 * .args(DestroyOptions.builder()
 * .all(false)
 * .app("app")
 * .assetMetadata(false)
 * .caBundlePath("caBundlePath")
 * .color(false)
 * .context(Map.of(
 * "contextKey", "context"))
 * .debug(false)
 * .ec2Creds(false)
 * .exclusively(false)
 * .force(false)
 * .ignoreErrors(false)
 * .json(false)
 * .lookups(false)
 * .notices(false)
 * .output("output")
 * .pathMetadata(false)
 * .profile("profile")
 * .proxy("proxy")
 * .roleArn("roleArn")
 * .stacks(List.of("stacks"))
 * .staging(false)
 * .strict(false)
 * .trace(false)
 * .verbose(false)
 * .versionReporting(false)
 * .build())
 * .enabled(false)
 * .expectedMessage("expectedMessage")
 * .expectError(false)
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
    @JvmName("180ae3907a1f08d2c06f966bcf9a6c2a6e7b14b3e8467689291e3db7bc337f63")
    public fun deploy(deploy: DeployCommand.Builder.() -> Unit)

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    public fun destroy(destroy: DestroyCommand)

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7444a05042e855d965d34dd63086370d1edd55f0c874ca797c775b4f657b9216")
    public fun destroy(destroy: DestroyCommand.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.CdkCommands.Builder =
        software.amazon.awscdk.cloud_assembly_schema.CdkCommands.builder()

    /**
     * @param deploy Options to for the cdk deploy command.
     */
    override fun deploy(deploy: DeployCommand) {
      cdkBuilder.deploy(deploy.let(DeployCommand.Companion::unwrap))
    }

    /**
     * @param deploy Options to for the cdk deploy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("180ae3907a1f08d2c06f966bcf9a6c2a6e7b14b3e8467689291e3db7bc337f63")
    override fun deploy(deploy: DeployCommand.Builder.() -> Unit): Unit =
        deploy(DeployCommand(deploy))

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    override fun destroy(destroy: DestroyCommand) {
      cdkBuilder.destroy(destroy.let(DestroyCommand.Companion::unwrap))
    }

    /**
     * @param destroy Options to for the cdk destroy command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7444a05042e855d965d34dd63086370d1edd55f0c874ca797c775b4f657b9216")
    override fun destroy(destroy: DestroyCommand.Builder.() -> Unit): Unit =
        destroy(DestroyCommand(destroy))

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.CdkCommands =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.CdkCommands,
  ) : CdkObject(cdkObject),
      CdkCommands {
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

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.CdkCommands):
        CdkCommands = CdkObjectWrappers.wrap(cdkObject) as? CdkCommands ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CdkCommands):
        software.amazon.awscdk.cloud_assembly_schema.CdkCommands = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cloud_assembly_schema.CdkCommands
  }
}
