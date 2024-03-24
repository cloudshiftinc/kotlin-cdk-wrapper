@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a StepFunctions State Machine.
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
public open class StateMachine(
  cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachine,
) : Resource(cdkObject), IStateMachine {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StateMachineProps,
  ) :
      this(software.amazon.awscdk.services.stepfunctions.StateMachine(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(StateMachineProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StateMachineProps.Builder.() -> Unit,
  ) : this(scope, id, StateMachineProps(props)
  )

  /**
   * Add the given statement to the role's policy.
   *
   * @param statement 
   */
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Add the given statement to the role's policy.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * Grant the given identity custom permissions.
   *
   * @param identity 
   * @param actions 
   */
  public override fun grant(identity: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), *actions.map{CdkObjectWrappers.unwrap(it)
      as String}.toTypedArray()).let(Grant::wrap)

  /**
   * Grant the given identity permissions on all executions of the state machine.
   *
   * @param identity 
   * @param actions 
   */
  public override fun grantExecution(identity: IGrantable, vararg actions: String): Grant =
      unwrap(this).grantExecution(identity.let(IGrantable::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * The principal this state machine is running as.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Grant the given identity permissions to read results from state machine.
   *
   * @param identity 
   */
  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to start an execution of this state machine.
   *
   * @param identity 
   */
  public override fun grantStartExecution(identity: IGrantable): Grant =
      unwrap(this).grantStartExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity permissions to start a synchronous execution of this state machine.
   *
   * @param identity 
   */
  public override fun grantStartSyncExecution(identity: IGrantable): Grant =
      unwrap(this).grantStartSyncExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant the given identity task response permissions on a state machine.
   *
   * @param identity 
   */
  public override fun grantTaskResponse(identity: IGrantable): Grant =
      unwrap(this).grantTaskResponse(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this State Machine's executions.
   *
   * Default: - sum over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricAborted(): Metric = unwrap(this).metricAborted().let(Metric::wrap)

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricAborted(props: MetricOptions): Metric =
      unwrap(this).metricAborted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that were aborted.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
  public override fun metricAborted(props: MetricOptions.Builder.() -> Unit): Metric =
      metricAborted(MetricOptions(props))

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricFailed(props: MetricOptions): Metric =
      unwrap(this).metricFailed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that failed.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public override fun metricFailed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFailed(MetricOptions(props))

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricStarted(props: MetricOptions): Metric =
      unwrap(this).metricStarted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that were started.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
  public override fun metricStarted(props: MetricOptions.Builder.() -> Unit): Metric =
      metricStarted(MetricOptions(props))

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSucceeded(props: MetricOptions): Metric =
      unwrap(this).metricSucceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that succeeded.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
  public override fun metricSucceeded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSucceeded(MetricOptions(props))

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricThrottled(props: MetricOptions): Metric =
      unwrap(this).metricThrottled(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that were throttled.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
  public override fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottled(MetricOptions(props))

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public override fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public override fun metricTime(props: MetricOptions): Metric =
      unwrap(this).metricTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the interval, in milliseconds, between the time the execution starts and the time it
   * closes.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
  public override fun metricTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTime(MetricOptions(props))

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public override fun metricTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricTimedOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of executions that timed out.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public override fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTimedOut(MetricOptions(props))

  /**
   * Execution role of this state machine.
   */
  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  /**
   * The ARN of the state machine.
   */
  public override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

  /**
   * The name of the state machine.
   */
  public open fun stateMachineName(): String = unwrap(this).getStateMachineName()

  /**
   * Identifier for the state machine revision, which is an immutable, read-only snapshot of a state
   * machine’s definition and configuration.
   */
  public open fun stateMachineRevisionId(): String = unwrap(this).getStateMachineRevisionId()

  /**
   * Type of the state machine.
   */
  public open fun stateMachineType(): StateMachineType =
      unwrap(this).getStateMachineType().let(StateMachineType::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.stepfunctions.StateMachine].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Comment that describes this state machine.
     *
     * Default: - No comment
     *
     * @param comment Comment that describes this state machine. 
     */
    public fun comment(comment: String)

    /**
     * (deprecated) Definition for this state machine.
     *
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     * @param definition Definition for this state machine. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable)

    /**
     * Definition for this state machine.
     *
     * @param definitionBody Definition for this state machine. 
     */
    public fun definitionBody(definitionBody: DefinitionBody)

    /**
     * substitutions for the definition body as a key-value map.
     *
     * @param definitionSubstitutions substitutions for the definition body as a key-value map. 
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged. 
     */
    public fun logs(logs: LogOptions)

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cf9b118a37d2e328e6dc08efec907bf9a3a25fbc8a16192944d752c34c758d1")
    public fun logs(logs: LogOptions.Builder.() -> Unit)

    /**
     * The removal policy to apply to state machine.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply to state machine. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The execution role for the state machine service.
     *
     * Default: A role is automatically created
     *
     * @param role The execution role for the state machine service. 
     */
    public fun role(role: IRole)

    /**
     * A name for the state machine.
     *
     * Default: A name is automatically generated
     *
     * @param stateMachineName A name for the state machine. 
     */
    public fun stateMachineName(stateMachineName: String)

    /**
     * Type of the state machine.
     *
     * Default: StateMachineType.STANDARD
     *
     * @param stateMachineType Type of the state machine. 
     */
    public fun stateMachineType(stateMachineType: StateMachineType)

    /**
     * Maximum run time for this state machine.
     *
     * Default: No timeout
     *
     * @param timeout Maximum run time for this state machine. 
     */
    public fun timeout(timeout: Duration)

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this state machine.
     *
     * Default: false
     *
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     * machine. 
     */
    public fun tracingEnabled(tracingEnabled: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.StateMachine.Builder =
        software.amazon.awscdk.services.stepfunctions.StateMachine.Builder.create(scope, id)

    /**
     * Comment that describes this state machine.
     *
     * Default: - No comment
     *
     * @param comment Comment that describes this state machine. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * (deprecated) Definition for this state machine.
     *
     * @deprecated use definitionBody: DefinitionBody.fromChainable()
     * @param definition Definition for this state machine. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun definition(definition: IChainable) {
      cdkBuilder.definition(definition.let(IChainable::unwrap))
    }

    /**
     * Definition for this state machine.
     *
     * @param definitionBody Definition for this state machine. 
     */
    override fun definitionBody(definitionBody: DefinitionBody) {
      cdkBuilder.definitionBody(definitionBody.let(DefinitionBody::unwrap))
    }

    /**
     * substitutions for the definition body as a key-value map.
     *
     * @param definitionSubstitutions substitutions for the definition body as a key-value map. 
     */
    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged. 
     */
    override fun logs(logs: LogOptions) {
      cdkBuilder.logs(logs.let(LogOptions::unwrap))
    }

    /**
     * Defines what execution history events are logged and where they are logged.
     *
     * Default: No logging
     *
     * @param logs Defines what execution history events are logged and where they are logged. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cf9b118a37d2e328e6dc08efec907bf9a3a25fbc8a16192944d752c34c758d1")
    override fun logs(logs: LogOptions.Builder.() -> Unit): Unit = logs(LogOptions(logs))

    /**
     * The removal policy to apply to state machine.
     *
     * Default: RemovalPolicy.DESTROY
     *
     * @param removalPolicy The removal policy to apply to state machine. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The execution role for the state machine service.
     *
     * Default: A role is automatically created
     *
     * @param role The execution role for the state machine service. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * A name for the state machine.
     *
     * Default: A name is automatically generated
     *
     * @param stateMachineName A name for the state machine. 
     */
    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    /**
     * Type of the state machine.
     *
     * Default: StateMachineType.STANDARD
     *
     * @param stateMachineType Type of the state machine. 
     */
    override fun stateMachineType(stateMachineType: StateMachineType) {
      cdkBuilder.stateMachineType(stateMachineType.let(StateMachineType::unwrap))
    }

    /**
     * Maximum run time for this state machine.
     *
     * Default: No timeout
     *
     * @param timeout Maximum run time for this state machine. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * Specifies whether Amazon X-Ray tracing is enabled for this state machine.
     *
     * Default: false
     *
     * @param tracingEnabled Specifies whether Amazon X-Ray tracing is enabled for this state
     * machine. 
     */
    override fun tracingEnabled(tracingEnabled: Boolean) {
      cdkBuilder.tracingEnabled(tracingEnabled)
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.StateMachine =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromStateMachineArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      stateMachineArn: String,
    ): IStateMachine =
        software.amazon.awscdk.services.stepfunctions.StateMachine.fromStateMachineArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, stateMachineArn).let(IStateMachine::wrap)

    public fun fromStateMachineName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      stateMachineName: String,
    ): IStateMachine =
        software.amazon.awscdk.services.stepfunctions.StateMachine.fromStateMachineName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, stateMachineName).let(IStateMachine::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StateMachine {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StateMachine(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachine):
        StateMachine = StateMachine(cdkObject)

    internal fun unwrap(wrapped: StateMachine):
        software.amazon.awscdk.services.stepfunctions.StateMachine = wrapped.cdkObject as
        software.amazon.awscdk.services.stepfunctions.StateMachine
  }
}
