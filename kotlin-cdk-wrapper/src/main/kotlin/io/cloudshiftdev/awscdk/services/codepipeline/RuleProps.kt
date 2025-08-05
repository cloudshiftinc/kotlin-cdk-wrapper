@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a CodePipeline Rule.
 *
 * Example:
 *
 * ```
 * CodeStarConnectionsSourceAction sourceAction;
 * CodeBuildAction buildAction;
 * Pipeline.Builder.create(this, "Pipeline")
 * .pipelineType(PipelineType.V2)
 * .stages(List.of(StageProps.builder()
 * .stageName("Source")
 * .actions(List.of(sourceAction))
 * .build(), StageProps.builder()
 * .stageName("Build")
 * .actions(List.of(buildAction))
 * // BeforeEntry condition - checks before entering the stage
 * .beforeEntry(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .rules(List.of(Rule.Builder.create()
 * .name("LambdaCheck")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "FunctionName", "LambdaFunctionName"))
 * .build()))
 * .result(Result.FAIL)
 * .build()))
 * .build())
 * // OnSuccess condition - checks after successful stage completion
 * .onSuccess(Conditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.FAIL)
 * .rules(List.of(Rule.Builder.create()
 * .name("CloudWatchCheck")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "AlarmName", "AlarmName1",
 * "WaitTime", "300",  // 5 minutes
 * "FunctionName", "funcName2"))
 * .build()))
 * .build()))
 * .build())
 * // OnFailure condition - handles stage failure
 * .onFailure(FailureConditions.builder()
 * .conditions(List.of(Condition.builder()
 * .result(Result.ROLLBACK)
 * .rules(List.of(Rule.Builder.create()
 * .name("RollBackOnFailure")
 * .provider("LambdaInvoke")
 * .version("1")
 * .configuration(Map.of(
 * "AlarmName", "Alarm",
 * "WaitTime", "300",  // 5 minutes
 * "FunctionName", "funcName1"))
 * .build()))
 * .build()))
 * .build())
 * .build()))
 * .build();
 * ```
 */
public interface RuleProps {
  /**
   * The shell commands to run with your commands rule in CodePipeline.
   *
   * All commands are supported except multi-line formats. While CodeBuild logs and permissions are
   * used,
   * you do not need to create any resources in CodeBuild.
   *
   * Default: - No commands
   */
  public fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

  /**
   * The action configuration fields for the rule.
   *
   * This can include custom parameters specific to the rule type.
   *
   * Default: - No configuration
   */
  public fun configuration(): ObjectNode? = unwrap(this).getConfiguration()

  /**
   * The input artifacts fields for the rule, such as specifying an input file for the rule.
   *
   * Each string in the array represents an artifact name that this rule will use as input.
   *
   * Default: - No input artifacts
   */
  public fun inputArtifacts(): List<String> = unwrap(this).getInputArtifacts() ?: emptyList()

  /**
   * The name of the rule that is created for the condition.
   *
   * Must be unique within the pipeline.
   *
   * Default: - A unique name will be generated
   *
   * Example:
   *
   * ```
   * "VariableCheck";
   * ```
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The rule provider that implements the rule's functionality.
   *
   * Default: - No provider, must be specified if rule is used
   *
   * Example:
   *
   * ```
   * "DeploymentWindow";
   * ```
   *
   * [Documentation](AWS CodePipeline rule reference for available providers)
   */
  public fun provider(): String? = unwrap(this).getProvider()

  /**
   * The AWS Region for the condition associated with the rule.
   *
   * If not specified, uses the pipeline's region.
   *
   * Default: - Pipeline's region
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * The IAM role that the rule will use to execute its actions.
   *
   * The role must have sufficient permissions to perform the rule's tasks.
   *
   * Default: - A new role will be created
   */
  public fun role(): Role? = unwrap(this).getRole()?.let(Role::wrap)

  /**
   * The version of the rule to use.
   *
   * Different versions may have different features or behaviors.
   *
   * Default: '1'
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [RuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param commands The shell commands to run with your commands rule in CodePipeline.
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     */
    public fun commands(commands: List<String>)

    /**
     * @param commands The shell commands to run with your commands rule in CodePipeline.
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     */
    public fun commands(vararg commands: String)

    /**
     * @param configuration The action configuration fields for the rule.
     * This can include custom parameters specific to the rule type.
     */
    public fun configuration(configuration: ObjectNode)

    /**
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule.
     * Each string in the array represents an artifact name that this rule will use as input.
     */
    public fun inputArtifacts(inputArtifacts: List<String>)

    /**
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule.
     * Each string in the array represents an artifact name that this rule will use as input.
     */
    public fun inputArtifacts(vararg inputArtifacts: String)

    /**
     * @param name The name of the rule that is created for the condition.
     * Must be unique within the pipeline.
     */
    public fun name(name: String)

    /**
     * @param provider The rule provider that implements the rule's functionality.
     */
    public fun provider(provider: String)

    /**
     * @param region The AWS Region for the condition associated with the rule.
     * If not specified, uses the pipeline's region.
     */
    public fun region(region: String)

    /**
     * @param role The IAM role that the rule will use to execute its actions.
     * The role must have sufficient permissions to perform the rule's tasks.
     */
    public fun role(role: Role)

    /**
     * @param version The version of the rule to use.
     * Different versions may have different features or behaviors.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.RuleProps.Builder =
        software.amazon.awscdk.services.codepipeline.RuleProps.builder()

    /**
     * @param commands The shell commands to run with your commands rule in CodePipeline.
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * @param commands The shell commands to run with your commands rule in CodePipeline.
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * @param configuration The action configuration fields for the rule.
     * This can include custom parameters specific to the rule type.
     */
    override fun configuration(configuration: ObjectNode) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule.
     * Each string in the array represents an artifact name that this rule will use as input.
     */
    override fun inputArtifacts(inputArtifacts: List<String>) {
      cdkBuilder.inputArtifacts(inputArtifacts)
    }

    /**
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule.
     * Each string in the array represents an artifact name that this rule will use as input.
     */
    override fun inputArtifacts(vararg inputArtifacts: String): Unit =
        inputArtifacts(inputArtifacts.toList())

    /**
     * @param name The name of the rule that is created for the condition.
     * Must be unique within the pipeline.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param provider The rule provider that implements the rule's functionality.
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * @param region The AWS Region for the condition associated with the rule.
     * If not specified, uses the pipeline's region.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param role The IAM role that the rule will use to execute its actions.
     * The role must have sufficient permissions to perform the rule's tasks.
     */
    override fun role(role: Role) {
      cdkBuilder.role(role.let(Role.Companion::unwrap))
    }

    /**
     * @param version The version of the rule to use.
     * Different versions may have different features or behaviors.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.RuleProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.RuleProps,
  ) : CdkObject(cdkObject),
      RuleProps {
    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     *
     * Default: - No commands
     */
    override fun commands(): List<String> = unwrap(this).getCommands() ?: emptyList()

    /**
     * The action configuration fields for the rule.
     *
     * This can include custom parameters specific to the rule type.
     *
     * Default: - No configuration
     */
    override fun configuration(): ObjectNode? = unwrap(this).getConfiguration()

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * Each string in the array represents an artifact name that this rule will use as input.
     *
     * Default: - No input artifacts
     */
    override fun inputArtifacts(): List<String> = unwrap(this).getInputArtifacts() ?: emptyList()

    /**
     * The name of the rule that is created for the condition.
     *
     * Must be unique within the pipeline.
     *
     * Default: - A unique name will be generated
     *
     * Example:
     *
     * ```
     * "VariableCheck";
     * ```
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The rule provider that implements the rule's functionality.
     *
     * Default: - No provider, must be specified if rule is used
     *
     * Example:
     *
     * ```
     * "DeploymentWindow";
     * ```
     *
     * [Documentation](AWS CodePipeline rule reference for available providers)
     */
    override fun provider(): String? = unwrap(this).getProvider()

    /**
     * The AWS Region for the condition associated with the rule.
     *
     * If not specified, uses the pipeline's region.
     *
     * Default: - Pipeline's region
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The IAM role that the rule will use to execute its actions.
     *
     * The role must have sufficient permissions to perform the rule's tasks.
     *
     * Default: - A new role will be created
     */
    override fun role(): Role? = unwrap(this).getRole()?.let(Role::wrap)

    /**
     * The version of the rule to use.
     *
     * Different versions may have different features or behaviors.
     *
     * Default: '1'
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.RuleProps): RuleProps
        = CdkObjectWrappers.wrap(cdkObject) as? RuleProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.codepipeline.RuleProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.RuleProps
  }
}
