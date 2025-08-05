@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents a rule in AWS CodePipeline that can be used to add conditions and controls to pipeline
 * execution.
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
public open class Rule(
  cdkObject: software.amazon.awscdk.services.codepipeline.Rule,
) : CdkObject(cdkObject) {
  public constructor(props: RuleProps) :
      this(software.amazon.awscdk.services.codepipeline.Rule(props.let(RuleProps.Companion::unwrap))
  )

  public constructor(props: RuleProps.Builder.() -> Unit) : this(RuleProps(props)
  )

  /**
   * Returns a reference to the rule that can be used in pipeline stage conditions.
   *
   * @return A string in the format "#{rule.ruleName}" that can be used to reference this rule
   */
  public open fun reference(): String = unwrap(this).reference()

  /**
   * The name of the rule, if specified in the properties.
   */
  public open fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.Rule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     *
     * Default: - No commands
     *
     * @param commands The shell commands to run with your commands rule in CodePipeline. 
     */
    public fun commands(commands: List<String>)

    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     *
     * Default: - No commands
     *
     * @param commands The shell commands to run with your commands rule in CodePipeline. 
     */
    public fun commands(vararg commands: String)

    /**
     * The action configuration fields for the rule.
     *
     * This can include custom parameters specific to the rule type.
     *
     * Default: - No configuration
     *
     * @param configuration The action configuration fields for the rule. 
     */
    public fun configuration(configuration: ObjectNode)

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * Each string in the array represents an artifact name that this rule will use as input.
     *
     * Default: - No input artifacts
     *
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule. 
     */
    public fun inputArtifacts(inputArtifacts: List<String>)

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * Each string in the array represents an artifact name that this rule will use as input.
     *
     * Default: - No input artifacts
     *
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule. 
     */
    public fun inputArtifacts(vararg inputArtifacts: String)

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
     *
     * @param name The name of the rule that is created for the condition. 
     */
    public fun name(name: String)

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
     * @param provider The rule provider that implements the rule's functionality. 
     */
    public fun provider(provider: String)

    /**
     * The AWS Region for the condition associated with the rule.
     *
     * If not specified, uses the pipeline's region.
     *
     * Default: - Pipeline's region
     *
     * @param region The AWS Region for the condition associated with the rule. 
     */
    public fun region(region: String)

    /**
     * The IAM role that the rule will use to execute its actions.
     *
     * The role must have sufficient permissions to perform the rule's tasks.
     *
     * Default: - A new role will be created
     *
     * @param role The IAM role that the rule will use to execute its actions. 
     */
    public fun role(role: Role)

    /**
     * The version of the rule to use.
     *
     * Different versions may have different features or behaviors.
     *
     * Default: '1'
     *
     * @param version The version of the rule to use. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Rule.Builder =
        software.amazon.awscdk.services.codepipeline.Rule.Builder.create()

    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     *
     * Default: - No commands
     *
     * @param commands The shell commands to run with your commands rule in CodePipeline. 
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * The shell commands to run with your commands rule in CodePipeline.
     *
     * All commands are supported except multi-line formats. While CodeBuild logs and permissions
     * are used,
     * you do not need to create any resources in CodeBuild.
     *
     * Default: - No commands
     *
     * @param commands The shell commands to run with your commands rule in CodePipeline. 
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * The action configuration fields for the rule.
     *
     * This can include custom parameters specific to the rule type.
     *
     * Default: - No configuration
     *
     * @param configuration The action configuration fields for the rule. 
     */
    override fun configuration(configuration: ObjectNode) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * Each string in the array represents an artifact name that this rule will use as input.
     *
     * Default: - No input artifacts
     *
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule. 
     */
    override fun inputArtifacts(inputArtifacts: List<String>) {
      cdkBuilder.inputArtifacts(inputArtifacts)
    }

    /**
     * The input artifacts fields for the rule, such as specifying an input file for the rule.
     *
     * Each string in the array represents an artifact name that this rule will use as input.
     *
     * Default: - No input artifacts
     *
     * @param inputArtifacts The input artifacts fields for the rule, such as specifying an input
     * file for the rule. 
     */
    override fun inputArtifacts(vararg inputArtifacts: String): Unit =
        inputArtifacts(inputArtifacts.toList())

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
     *
     * @param name The name of the rule that is created for the condition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param provider The rule provider that implements the rule's functionality. 
     */
    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    /**
     * The AWS Region for the condition associated with the rule.
     *
     * If not specified, uses the pipeline's region.
     *
     * Default: - Pipeline's region
     *
     * @param region The AWS Region for the condition associated with the rule. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * The IAM role that the rule will use to execute its actions.
     *
     * The role must have sufficient permissions to perform the rule's tasks.
     *
     * Default: - A new role will be created
     *
     * @param role The IAM role that the rule will use to execute its actions. 
     */
    override fun role(role: Role) {
      cdkBuilder.role(role.let(Role.Companion::unwrap))
    }

    /**
     * The version of the rule to use.
     *
     * Different versions may have different features or behaviors.
     *
     * Default: '1'
     *
     * @param version The version of the rule to use. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Rule = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Rule {
      val builderImpl = BuilderImpl()
      return Rule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Rule): Rule =
        Rule(cdkObject)

    internal fun unwrap(wrapped: Rule): software.amazon.awscdk.services.codepipeline.Rule =
        wrapped.cdkObject as software.amazon.awscdk.services.codepipeline.Rule
  }
}
