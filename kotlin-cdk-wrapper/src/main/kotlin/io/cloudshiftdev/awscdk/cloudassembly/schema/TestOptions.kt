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

/**
 * The set of options to control the workflow of the test runner.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * TestOptions testOptions = TestOptions.builder()
 * .allowDestroy(List.of("allowDestroy"))
 * .cdkCommandOptions(CdkCommands.builder()
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
 * .build())
 * .diffAssets(false)
 * .hooks(Hooks.builder()
 * .postDeploy(List.of("postDeploy"))
 * .postDestroy(List.of("postDestroy"))
 * .preDeploy(List.of("preDeploy"))
 * .preDestroy(List.of("preDestroy"))
 * .build())
 * .regions(List.of("regions"))
 * .stackUpdateWorkflow(false)
 * .build();
 * ```
 */
public interface TestOptions {
  /**
   * List of CloudFormation resource types in this stack that can be destroyed as part of an update
   * without failing the test.
   *
   * This list should only include resources that for this specific
   * integration test we are sure will not cause errors or an outage if
   * destroyed. For example, maybe we know that a new resource will be created
   * first before the old resource is destroyed which prevents any outage.
   *
   * e.g. ['AWS::IAM::Role']
   *
   * Default: - do not allow destruction of any resources on update
   */
  public fun allowDestroy(): List<String> = unwrap(this).getAllowDestroy() ?: emptyList()

  /**
   * Additional options to use for each CDK command.
   *
   * Default: - runner default options
   */
  public fun cdkCommandOptions(): CdkCommands? =
      unwrap(this).getCdkCommandOptions()?.let(CdkCommands::wrap)

  /**
   * Whether or not to include asset hashes in the diff Asset hashes can introduces a lot of
   * unneccessary noise into tests, but there are some cases where asset hashes *should* be included.
   *
   * For example
   * any tests involving custom resources or bundling
   *
   * Default: false
   */
  public fun diffAssets(): Boolean? = unwrap(this).getDiffAssets()

  /**
   * Additional commands to run at predefined points in the test workflow.
   *
   * e.g. { postDeploy: ['yarn', 'test'] }
   *
   * Default: - no hooks
   */
  public fun hooks(): Hooks? = unwrap(this).getHooks()?.let(Hooks::wrap)

  /**
   * Limit deployment to these regions.
   *
   * Default: - can run in any region
   */
  public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

  /**
   * Run update workflow on this test case This should only be set to false to test scenarios that
   * are not possible to test as part of the update workflow.
   *
   * Default: true
   */
  public fun stackUpdateWorkflow(): Boolean? = unwrap(this).getStackUpdateWorkflow()

  /**
   * A builder for [TestOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     * as part of an update without failing the test.
     * This list should only include resources that for this specific
     * integration test we are sure will not cause errors or an outage if
     * destroyed. For example, maybe we know that a new resource will be created
     * first before the old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    public fun allowDestroy(allowDestroy: List<String>)

    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     * as part of an update without failing the test.
     * This list should only include resources that for this specific
     * integration test we are sure will not cause errors or an outage if
     * destroyed. For example, maybe we know that a new resource will be created
     * first before the old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    public fun allowDestroy(vararg allowDestroy: String)

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands)

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55d79223df1e5416fab541b8be9b62f1aec79e85f12e56ec41cbd6c1628828f7")
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit)

    /**
     * @param diffAssets Whether or not to include asset hashes in the diff Asset hashes can
     * introduces a lot of unneccessary noise into tests, but there are some cases where asset hashes
     * *should* be included.
     * For example
     * any tests involving custom resources or bundling
     */
    public fun diffAssets(diffAssets: Boolean)

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow.
     * e.g. { postDeploy: ['yarn', 'test'] }
     */
    public fun hooks(hooks: Hooks)

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow.
     * e.g. { postDeploy: ['yarn', 'test'] }
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c78c923bad27cd5e67dcb05c13043f91e75bc296b487f1688583d5fb620eeaa")
    public fun hooks(hooks: Hooks.Builder.() -> Unit)

    /**
     * @param regions Limit deployment to these regions.
     */
    public fun regions(regions: List<String>)

    /**
     * @param regions Limit deployment to these regions.
     */
    public fun regions(vararg regions: String)

    /**
     * @param stackUpdateWorkflow Run update workflow on this test case This should only be set to
     * false to test scenarios that are not possible to test as part of the update workflow.
     */
    public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.TestOptions.Builder =
        software.amazon.awscdk.cloudassembly.schema.TestOptions.builder()

    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     * as part of an update without failing the test.
     * This list should only include resources that for this specific
     * integration test we are sure will not cause errors or an outage if
     * destroyed. For example, maybe we know that a new resource will be created
     * first before the old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    override fun allowDestroy(allowDestroy: List<String>) {
      cdkBuilder.allowDestroy(allowDestroy)
    }

    /**
     * @param allowDestroy List of CloudFormation resource types in this stack that can be destroyed
     * as part of an update without failing the test.
     * This list should only include resources that for this specific
     * integration test we are sure will not cause errors or an outage if
     * destroyed. For example, maybe we know that a new resource will be created
     * first before the old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     */
    override fun allowDestroy(vararg allowDestroy: String): Unit =
        allowDestroy(allowDestroy.toList())

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
      cdkBuilder.cdkCommandOptions(cdkCommandOptions.let(CdkCommands.Companion::unwrap))
    }

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55d79223df1e5416fab541b8be9b62f1aec79e85f12e56ec41cbd6c1628828f7")
    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands.Builder.() -> Unit): Unit =
        cdkCommandOptions(CdkCommands(cdkCommandOptions))

    /**
     * @param diffAssets Whether or not to include asset hashes in the diff Asset hashes can
     * introduces a lot of unneccessary noise into tests, but there are some cases where asset hashes
     * *should* be included.
     * For example
     * any tests involving custom resources or bundling
     */
    override fun diffAssets(diffAssets: Boolean) {
      cdkBuilder.diffAssets(diffAssets)
    }

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow.
     * e.g. { postDeploy: ['yarn', 'test'] }
     */
    override fun hooks(hooks: Hooks) {
      cdkBuilder.hooks(hooks.let(Hooks.Companion::unwrap))
    }

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow.
     * e.g. { postDeploy: ['yarn', 'test'] }
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c78c923bad27cd5e67dcb05c13043f91e75bc296b487f1688583d5fb620eeaa")
    override fun hooks(hooks: Hooks.Builder.() -> Unit): Unit = hooks(Hooks(hooks))

    /**
     * @param regions Limit deployment to these regions.
     */
    override fun regions(regions: List<String>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions Limit deployment to these regions.
     */
    override fun regions(vararg regions: String): Unit = regions(regions.toList())

    /**
     * @param stackUpdateWorkflow Run update workflow on this test case This should only be set to
     * false to test scenarios that are not possible to test as part of the update workflow.
     */
    override fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
      cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TestOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.TestOptions,
  ) : CdkObject(cdkObject), TestOptions {
    /**
     * List of CloudFormation resource types in this stack that can be destroyed as part of an
     * update without failing the test.
     *
     * This list should only include resources that for this specific
     * integration test we are sure will not cause errors or an outage if
     * destroyed. For example, maybe we know that a new resource will be created
     * first before the old resource is destroyed which prevents any outage.
     *
     * e.g. ['AWS::IAM::Role']
     *
     * Default: - do not allow destruction of any resources on update
     */
    override fun allowDestroy(): List<String> = unwrap(this).getAllowDestroy() ?: emptyList()

    /**
     * Additional options to use for each CDK command.
     *
     * Default: - runner default options
     */
    override fun cdkCommandOptions(): CdkCommands? =
        unwrap(this).getCdkCommandOptions()?.let(CdkCommands::wrap)

    /**
     * Whether or not to include asset hashes in the diff Asset hashes can introduces a lot of
     * unneccessary noise into tests, but there are some cases where asset hashes *should* be included.
     *
     * For example
     * any tests involving custom resources or bundling
     *
     * Default: false
     */
    override fun diffAssets(): Boolean? = unwrap(this).getDiffAssets()

    /**
     * Additional commands to run at predefined points in the test workflow.
     *
     * e.g. { postDeploy: ['yarn', 'test'] }
     *
     * Default: - no hooks
     */
    override fun hooks(): Hooks? = unwrap(this).getHooks()?.let(Hooks::wrap)

    /**
     * Limit deployment to these regions.
     *
     * Default: - can run in any region
     */
    override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    /**
     * Run update workflow on this test case This should only be set to false to test scenarios that
     * are not possible to test as part of the update workflow.
     *
     * Default: true
     */
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
