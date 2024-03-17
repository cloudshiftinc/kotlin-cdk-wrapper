@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a State Machine.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Artifact inputArtifact = new Artifact();
 * Pass startState = new Pass(this, "StartState");
 * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
 * .definition(startState)
 * .build();
 * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
 * .actionName("Invoke")
 * .stateMachine(simpleStateMachine)
 * .stateMachineInput(StateMachineInput.filePath(inputArtifact.atPath("assets/input.json")))
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("StepFunctions")
 * .actions(List.of(stepFunctionAction))
 * .build());
 * ```
 */
public interface StateMachineProps {
  /**
   * Comment that describes this state machine.
   *
   * Default: - No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * (deprecated) Definition for this state machine.
   *
   * @deprecated use definitionBody: DefinitionBody.fromChainable()
   */
  @Deprecated(message = "deprecated in CDK")
  public fun definition(): IChainable? = unwrap(this).getDefinition()?.let(IChainable::wrap)

  /**
   * Definition for this state machine.
   */
  public fun definitionBody(): DefinitionBody? =
      unwrap(this).getDefinitionBody()?.let(DefinitionBody::wrap)

  /**
   * substitutions for the definition body as a key-value map.
   */
  public fun definitionSubstitutions(): Map<String, String> =
      unwrap(this).getDefinitionSubstitutions() ?: emptyMap()

  /**
   * Defines what execution history events are logged and where they are logged.
   *
   * Default: No logging
   */
  public fun logs(): LogOptions? = unwrap(this).getLogs()?.let(LogOptions::wrap)

  /**
   * The removal policy to apply to state machine.
   *
   * Default: RemovalPolicy.DESTROY
   */
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * The execution role for the state machine service.
   *
   * Default: A role is automatically created
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A name for the state machine.
   *
   * Default: A name is automatically generated
   */
  public fun stateMachineName(): String? = unwrap(this).getStateMachineName()

  /**
   * Type of the state machine.
   *
   * Default: StateMachineType.STANDARD
   */
  public fun stateMachineType(): StateMachineType? =
      unwrap(this).getStateMachineType()?.let(StateMachineType::wrap)

  /**
   * Maximum run time for this state machine.
   *
   * Default: No timeout
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * Specifies whether Amazon X-Ray tracing is enabled for this state machine.
   *
   * Default: false
   */
  public fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()

  /**
   * A builder for [StateMachineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment Comment that describes this state machine.
     */
    public fun comment(comment: String)

    /**
     * @param definition Definition for this state machine.
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     */
    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable)

    /**
     * @param definitionBody Definition for this state machine.
     */
    public fun definitionBody(definitionBody: DefinitionBody)

    /**
     * @param definitionSubstitutions substitutions for the definition body as a key-value map.
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    /**
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    public fun logs(logs: LogOptions)

    /**
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be5c6b273531147f59a129d65f6503e2caff68ad31ba091bf199e00a8be55b36")
    public fun logs(logs: LogOptions.Builder.() -> Unit)

    /**
     * @param removalPolicy The removal policy to apply to state machine.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param role The execution role for the state machine service.
     */
    public fun role(role: IRole)

    /**
     * @param stateMachineName A name for the state machine.
     */
    public fun stateMachineName(stateMachineName: String)

    /**
     * @param stateMachineType Type of the state machine.
     */
    public fun stateMachineType(stateMachineType: StateMachineType)

    /**
     * @param timeout Maximum run time for this state machine.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     * machine.
     */
    public fun tracingEnabled(tracingEnabled: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.StateMachineProps.Builder
        = software.amazon.awscdk.services.stepfunctions.StateMachineProps.builder()

    /**
     * @param comment Comment that describes this state machine.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param definition Definition for this state machine.
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     */
    @Deprecated(message = "deprecated in CDK")
    override fun definition(definition: IChainable) {
      cdkBuilder.definition(definition.let(IChainable::unwrap))
    }

    /**
     * @param definitionBody Definition for this state machine.
     */
    override fun definitionBody(definitionBody: DefinitionBody) {
      cdkBuilder.definitionBody(definitionBody.let(DefinitionBody::unwrap))
    }

    /**
     * @param definitionSubstitutions substitutions for the definition body as a key-value map.
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    override fun logs(logs: LogOptions) {
      cdkBuilder.logs(logs.let(LogOptions::unwrap))
    }

    /**
     * @param logs Defines what execution history events are logged and where they are logged.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be5c6b273531147f59a129d65f6503e2caff68ad31ba091bf199e00a8be55b36")
    override fun logs(logs: LogOptions.Builder.() -> Unit): Unit = logs(LogOptions(logs))

    /**
     * @param removalPolicy The removal policy to apply to state machine.
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param role The execution role for the state machine service.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param stateMachineName A name for the state machine.
     */
    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    /**
     * @param stateMachineType Type of the state machine.
     */
    override fun stateMachineType(stateMachineType: StateMachineType) {
      cdkBuilder.stateMachineType(stateMachineType.let(StateMachineType::unwrap))
    }

    /**
     * @param timeout Maximum run time for this state machine.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     * machine.
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.StateMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineProps,
  ) : CdkObject(cdkObject), StateMachineProps {
    /**
     * Comment that describes this state machine.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * (deprecated) Definition for this state machine.
     *
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     */
    @Deprecated(message = "deprecated in CDK")
    override fun definition(): IChainable? = unwrap(this).getDefinition()?.let(IChainable::wrap)

    /**
     * Definition for this state machine.
     */
    override fun definitionBody(): DefinitionBody? =
        unwrap(this).getDefinitionBody()?.let(DefinitionBody::wrap)

    /**
     * substitutions for the definition body as a key-value map.
     */
    override fun definitionSubstitutions(): Map<String, String> =
        unwrap(this).getDefinitionSubstitutions() ?: emptyMap()

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     */
    override fun logs(): LogOptions? = unwrap(this).getLogs()?.let(LogOptions::wrap)

    /**
     * The removal policy to apply to state machine.
     *
     * Default: RemovalPolicy.DESTROY
     */
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * The execution role for the state machine service.
     *
     * Default: A role is automatically created
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * A name for the state machine.
     *
     * Default: A name is automatically generated
     */
    override fun stateMachineName(): String? = unwrap(this).getStateMachineName()

    /**
     * Type of the state machine.
     *
     * Default: StateMachineType.STANDARD
     */
    override fun stateMachineType(): StateMachineType? =
        unwrap(this).getStateMachineType()?.let(StateMachineType::wrap)

    /**
     * Maximum run time for this state machine.
     *
     * Default: No timeout
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this state machine.
     *
     * Default: false
     */
    override fun tracingEnabled(): Boolean? = unwrap(this).getTracingEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineProps):
        StateMachineProps = CdkObjectWrappers.wrap(cdkObject) as? StateMachineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StateMachineProps):
        software.amazon.awscdk.services.stepfunctions.StateMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.StateMachineProps
  }
}
