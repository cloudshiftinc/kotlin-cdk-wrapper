@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.cloudassembly.schema.CdkCommands
import software.amazon.awscdk.cloudassembly.schema.Hooks
import software.amazon.awscdk.cloudassembly.schema.TestCase

@CdkDslMarker
public class TestCaseDsl {
  private val cdkBuilder: TestCase.Builder = TestCase.builder()

  private val _allowDestroy: MutableList<String> = mutableListOf()

  private val _regions: MutableList<String> = mutableListOf()

  private val _stacks: MutableList<String> = mutableListOf()

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
  public fun allowDestroy(vararg allowDestroy: String) {
    _allowDestroy.addAll(listOf(*allowDestroy))
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
  public fun allowDestroy(allowDestroy: Collection<String>) {
    _allowDestroy.addAll(allowDestroy)
  }

  /**
   * @param assertionStack The node id of the stack that contains assertions.
   * This is the value that can be used to deploy the stack with the CDK CLI
   */
  public fun assertionStack(assertionStack: String) {
    cdkBuilder.assertionStack(assertionStack)
  }

  /**
   * @param assertionStackName The name of the stack that contains assertions.
   */
  public fun assertionStackName(assertionStackName: String) {
    cdkBuilder.assertionStackName(assertionStackName)
  }

  /**
   * @param cdkCommandOptions Additional options to use for each CDK command.
   */
  public fun cdkCommandOptions(cdkCommandOptions: CdkCommandsDsl.() -> Unit = {}) {
    val builder = CdkCommandsDsl()
    builder.apply(cdkCommandOptions)
    cdkBuilder.cdkCommandOptions(builder.build())
  }

  /**
   * @param cdkCommandOptions Additional options to use for each CDK command.
   */
  public fun cdkCommandOptions(cdkCommandOptions: CdkCommands) {
    cdkBuilder.cdkCommandOptions(cdkCommandOptions)
  }

  /**
   * @param diffAssets Whether or not to include asset hashes in the diff Asset hashes can
   * introduces a lot of unneccessary noise into tests, but there are some cases where asset hashes
   * *should* be included.
   * For example
   * any tests involving custom resources or bundling
   */
  public fun diffAssets(diffAssets: Boolean) {
    cdkBuilder.diffAssets(diffAssets)
  }

  /**
   * @param hooks Additional commands to run at predefined points in the test workflow.
   * e.g. { postDeploy: ['yarn', 'test'] }
   */
  public fun hooks(hooks: HooksDsl.() -> Unit = {}) {
    val builder = HooksDsl()
    builder.apply(hooks)
    cdkBuilder.hooks(builder.build())
  }

  /**
   * @param hooks Additional commands to run at predefined points in the test workflow.
   * e.g. { postDeploy: ['yarn', 'test'] }
   */
  public fun hooks(hooks: Hooks) {
    cdkBuilder.hooks(hooks)
  }

  /**
   * @param regions Limit deployment to these regions.
   */
  public fun regions(vararg regions: String) {
    _regions.addAll(listOf(*regions))
  }

  /**
   * @param regions Limit deployment to these regions.
   */
  public fun regions(regions: Collection<String>) {
    _regions.addAll(regions)
  }

  /**
   * @param stackUpdateWorkflow Run update workflow on this test case This should only be set to
   * false to test scenarios that are not possible to test as part of the update workflow.
   */
  public fun stackUpdateWorkflow(stackUpdateWorkflow: Boolean) {
    cdkBuilder.stackUpdateWorkflow(stackUpdateWorkflow)
  }

  /**
   * @param stacks Stacks that should be tested as part of this test case The stackNames will be
   * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
   * `exclusively` is passed. 
   */
  public fun stacks(vararg stacks: String) {
    _stacks.addAll(listOf(*stacks))
  }

  /**
   * @param stacks Stacks that should be tested as part of this test case The stackNames will be
   * passed as args to the cdk commands so dependent stacks will be automatically deployed unless
   * `exclusively` is passed. 
   */
  public fun stacks(stacks: Collection<String>) {
    _stacks.addAll(stacks)
  }

  public fun build(): TestCase {
    if(_allowDestroy.isNotEmpty()) cdkBuilder.allowDestroy(_allowDestroy)
    if(_regions.isNotEmpty()) cdkBuilder.regions(_regions)
    if(_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
    return cdkBuilder.build()
  }
}
