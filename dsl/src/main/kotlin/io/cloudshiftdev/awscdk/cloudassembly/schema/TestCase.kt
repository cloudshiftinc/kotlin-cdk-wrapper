package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface TestCase : TestOptions {
  /**
   * The node id of the stack that contains assertions.
   *
   * This is the value that can be used to deploy the stack with the CDK CLI
   *
   * Default: - no assertion stack
   */
  public fun assertionStack(): String? = unwrap(this).getAssertionStack()

  /**
   * The name of the stack that contains assertions.
   *
   * Default: - no assertion stack
   */
  public fun assertionStackName(): String? = unwrap(this).getAssertionStackName()

  /**
   * Stacks that should be tested as part of this test case The stackNames will be passed as args to
   * the cdk commands so dependent stacks will be automatically deployed unless `exclusively` is
   * passed.
   */
  public fun stacks(): List<String>

  /**
   * A builder for [TestCase]
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
     * @param assertionStack The node id of the stack that contains assertions.
     * This is the value that can be used to deploy the stack with the CDK CLI
     */
    public fun assertionStack(assertionStack: String)

    /**
     * @param assertionStackName The name of the stack that contains assertions.
     */
    public fun assertionStackName(assertionStackName: String)

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    public fun cdkCommandOptions(cdkCommandOptions: CdkCommands)

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78c54b6490decdbe945db9fe2af6dceb91d6a44102b44cc0417752d78fac1daa")
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
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09638aa4be6b2b37d5e6eaca666f23376062bcc34cc8068feae02b6887c984a")
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

    /**
     * @param stacks Stacks that should be tested as part of this test case The stackNames will be
     * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
     * `exclusively` is passed. 
     */
    public fun stacks(stacks: List<String>)

    /**
     * @param stacks Stacks that should be tested as part of this test case The stackNames will be
     * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
     * `exclusively` is passed. 
     */
    public fun stacks(vararg stacks: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.TestCase.Builder =
        software.amazon.awscdk.cloudassembly.schema.TestCase.builder()

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
     * @param assertionStack The node id of the stack that contains assertions.
     * This is the value that can be used to deploy the stack with the CDK CLI
     */
    override fun assertionStack(assertionStack: String) {
      cdkBuilder.assertionStack(assertionStack)
    }

    /**
     * @param assertionStackName The name of the stack that contains assertions.
     */
    override fun assertionStackName(assertionStackName: String) {
      cdkBuilder.assertionStackName(assertionStackName)
    }

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    override fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
      cdkBuilder.cdkCommandOptions(cdkCommandOptions.let(CdkCommands::unwrap))
    }

    /**
     * @param cdkCommandOptions Additional options to use for each CDK command.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78c54b6490decdbe945db9fe2af6dceb91d6a44102b44cc0417752d78fac1daa")
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
      cdkBuilder.hooks(hooks.let(Hooks::unwrap))
    }

    /**
     * @param hooks Additional commands to run at predefined points in the test workflow.
     * e.g. { postDeploy: ['yarn', 'test'] }
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b09638aa4be6b2b37d5e6eaca666f23376062bcc34cc8068feae02b6887c984a")
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

    /**
     * @param stacks Stacks that should be tested as part of this test case The stackNames will be
     * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
     * `exclusively` is passed. 
     */
    override fun stacks(stacks: List<String>) {
      cdkBuilder.stacks(stacks)
    }

    /**
     * @param stacks Stacks that should be tested as part of this test case The stackNames will be
     * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
     * `exclusively` is passed. 
     */
    override fun stacks(vararg stacks: String): Unit = stacks(stacks.toList())

    public fun build(): software.amazon.awscdk.cloudassembly.schema.TestCase = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.TestCase,
  ) : CdkObject(cdkObject), TestCase {
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
     * The node id of the stack that contains assertions.
     *
     * This is the value that can be used to deploy the stack with the CDK CLI
     *
     * Default: - no assertion stack
     */
    override fun assertionStack(): String? = unwrap(this).getAssertionStack()

    /**
     * The name of the stack that contains assertions.
     *
     * Default: - no assertion stack
     */
    override fun assertionStackName(): String? = unwrap(this).getAssertionStackName()

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

    /**
     * Stacks that should be tested as part of this test case The stackNames will be passed as args
     * to the cdk commands so dependent stacks will be automatically deployed unless `exclusively` is
     * passed.
     */
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
