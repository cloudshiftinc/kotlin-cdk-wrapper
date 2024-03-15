@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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

public open class StateMachine internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachine,
) : Resource(cdkObject), IStateMachine {
  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun grant(identity: IGrantable, actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantExecution(identity: IGrantable, actions: String): Grant =
      unwrap(this).grantExecution(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantStartExecution(identity: IGrantable): Grant =
      unwrap(this).grantStartExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantStartSyncExecution(identity: IGrantable): Grant =
      unwrap(this).grantStartSyncExecution(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantTaskResponse(identity: IGrantable): Grant =
      unwrap(this).grantTaskResponse(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricAborted(): Metric = unwrap(this).metricAborted().let(Metric::wrap)

  public override fun metricAborted(props: MetricOptions): Metric =
      unwrap(this).metricAborted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
  public override fun metricAborted(props: MetricOptions.Builder.() -> Unit): Metric =
      metricAborted(MetricOptions(props))

  public override fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

  public override fun metricFailed(props: MetricOptions): Metric =
      unwrap(this).metricFailed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public override fun metricFailed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFailed(MetricOptions(props))

  public override fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

  public override fun metricStarted(props: MetricOptions): Metric =
      unwrap(this).metricStarted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
  public override fun metricStarted(props: MetricOptions.Builder.() -> Unit): Metric =
      metricStarted(MetricOptions(props))

  public override fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

  public override fun metricSucceeded(props: MetricOptions): Metric =
      unwrap(this).metricSucceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
  public override fun metricSucceeded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSucceeded(MetricOptions(props))

  public override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

  public override fun metricThrottled(props: MetricOptions): Metric =
      unwrap(this).metricThrottled(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
  public override fun metricThrottled(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottled(MetricOptions(props))

  public override fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

  public override fun metricTime(props: MetricOptions): Metric =
      unwrap(this).metricTime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
  public override fun metricTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTime(MetricOptions(props))

  public override fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

  public override fun metricTimedOut(props: MetricOptions): Metric =
      unwrap(this).metricTimedOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public override fun metricTimedOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTimedOut(MetricOptions(props))

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()

  public open fun stateMachineName(): String = unwrap(this).getStateMachineName()

  public open fun stateMachineRevisionId(): String = unwrap(this).getStateMachineRevisionId()

  public open fun stateMachineType(): StateMachineType =
      unwrap(this).getStateMachineType().let(StateMachineType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    @Deprecated(message = "deprecated in CDK")
    public fun definition(definition: IChainable)

    public fun definitionBody(definitionBody: DefinitionBody)

    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>)

    public fun logs(logs: LogOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cf9b118a37d2e328e6dc08efec907bf9a3a25fbc8a16192944d752c34c758d1")
    public fun logs(logs: LogOptions.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun role(role: IRole)

    public fun stateMachineName(stateMachineName: String)

    public fun stateMachineType(stateMachineType: StateMachineType)

    public fun timeout(timeout: Duration)

    public fun tracingEnabled(tracingEnabled: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.StateMachine.Builder =
        software.amazon.awscdk.services.stepfunctions.StateMachine.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun definition(definition: IChainable) {
      cdkBuilder.definition(definition.let(IChainable::unwrap))
    }

    override fun definitionBody(definitionBody: DefinitionBody) {
      cdkBuilder.definitionBody(definitionBody.let(DefinitionBody::unwrap))
    }

    override fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
      cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    override fun logs(logs: LogOptions) {
      cdkBuilder.logs(logs.let(LogOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1cf9b118a37d2e328e6dc08efec907bf9a3a25fbc8a16192944d752c34c758d1")
    override fun logs(logs: LogOptions.Builder.() -> Unit): Unit = logs(LogOptions(logs))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun stateMachineName(stateMachineName: String) {
      cdkBuilder.stateMachineName(stateMachineName)
    }

    override fun stateMachineType(stateMachineType: StateMachineType) {
      cdkBuilder.stateMachineType(stateMachineType.let(StateMachineType::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

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
        software.amazon.awscdk.services.stepfunctions.StateMachine = wrapped.cdkObject
  }
}
