package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IStateMachine : IResource, IGrantable {
  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantExecution(arg0: IGrantable, arg1: String): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantStartExecution(arg0: IGrantable): Grant

  public fun grantStartSyncExecution(arg0: IGrantable): Grant

  public fun grantTaskResponse(arg0: IGrantable): Grant

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricAborted(): Metric

  public fun metricAborted(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
  public fun metricAborted(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFailed(): Metric

  public fun metricFailed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
  public fun metricFailed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricStarted(): Metric

  public fun metricStarted(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
  public fun metricStarted(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSucceeded(): Metric

  public fun metricSucceeded(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
  public fun metricSucceeded(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricThrottled(): Metric

  public fun metricThrottled(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
  public fun metricThrottled(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTime(): Metric

  public fun metricTime(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
  public fun metricTime(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTimedOut(): Metric

  public fun metricTimedOut(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
  public fun metricTimedOut(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun stateMachineArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.IStateMachine,
  ) : IStateMachine {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantExecution(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantExecution(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantStartExecution(arg0: IGrantable): Grant =
        unwrap(this).grantStartExecution(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantStartSyncExecution(arg0: IGrantable): Grant =
        unwrap(this).grantStartSyncExecution(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantTaskResponse(arg0: IGrantable): Grant =
        unwrap(this).grantTaskResponse(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricAborted(): Metric = unwrap(this).metricAborted().let(Metric::wrap)

    override fun metricAborted(arg0: MetricOptions): Metric =
        unwrap(this).metricAborted(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5691ff27197238df39362c2b0c7fcda013220a77fbd28083b3eb441003bad3ad")
    override fun metricAborted(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricAborted(MetricOptions(arg0))

    override fun metricFailed(): Metric = unwrap(this).metricFailed().let(Metric::wrap)

    override fun metricFailed(arg0: MetricOptions): Metric =
        unwrap(this).metricFailed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77b08980238672e6993c3f66793561b32ef5e0bc06ae223d9b428a4d61de3ce0")
    override fun metricFailed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFailed(MetricOptions(arg0))

    override fun metricStarted(): Metric = unwrap(this).metricStarted().let(Metric::wrap)

    override fun metricStarted(arg0: MetricOptions): Metric =
        unwrap(this).metricStarted(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1ebc99af7cef84c169ce01dd77e3ccc212ac8f545ac9fd06b542ea6846664d6")
    override fun metricStarted(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricStarted(MetricOptions(arg0))

    override fun metricSucceeded(): Metric = unwrap(this).metricSucceeded().let(Metric::wrap)

    override fun metricSucceeded(arg0: MetricOptions): Metric =
        unwrap(this).metricSucceeded(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bdb5db9e6445d6f95a595109612453c12c26d01ea7b090464e7e3dc89616ec56")
    override fun metricSucceeded(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSucceeded(MetricOptions(arg0))

    override fun metricThrottled(): Metric = unwrap(this).metricThrottled().let(Metric::wrap)

    override fun metricThrottled(arg0: MetricOptions): Metric =
        unwrap(this).metricThrottled(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dc5007387bd1ba5d6a1dfdabfca1dd0b5a1b0aa5f64579f63cfdd20c4ba29ca")
    override fun metricThrottled(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottled(MetricOptions(arg0))

    override fun metricTime(): Metric = unwrap(this).metricTime().let(Metric::wrap)

    override fun metricTime(arg0: MetricOptions): Metric =
        unwrap(this).metricTime(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5df675ca191cf25c705e41cbbe4a5bb82c59b7b2cea749f3081d5accbcbde5b2")
    override fun metricTime(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTime(MetricOptions(arg0))

    override fun metricTimedOut(): Metric = unwrap(this).metricTimedOut().let(Metric::wrap)

    override fun metricTimedOut(arg0: MetricOptions): Metric =
        unwrap(this).metricTimedOut(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d95fc9b8d64b0d9c0b67a1b010670a63ced883a6bf5b9a5d36c3474119fb181")
    override fun metricTimedOut(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTimedOut(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun stateMachineArn(): String = unwrap(this).getStateMachineArn()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IStateMachine):
        IStateMachine = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStateMachine):
        software.amazon.awscdk.services.stepfunctions.IStateMachine = (wrapped as Wrapper).cdkObject
  }
}
