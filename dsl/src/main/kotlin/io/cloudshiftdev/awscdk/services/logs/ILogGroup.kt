package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IResourceWithPolicy
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ILogGroup : IResourceWithPolicy {
  public fun addMetricFilter(arg0: String, arg1: MetricFilterOptions): MetricFilter

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
  public fun addMetricFilter(arg0: String, arg1: MetricFilterOptions.Builder.() -> Unit):
      MetricFilter

  public fun addStream(arg0: String): LogStream

  public fun addStream(arg0: String, arg1: StreamOptions): LogStream

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
  public fun addStream(arg0: String, arg1: StreamOptions.Builder.() -> Unit): LogStream

  public fun addSubscriptionFilter(arg0: String, arg1: SubscriptionFilterOptions):
      SubscriptionFilter

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
  public fun addSubscriptionFilter(arg0: String,
      arg1: SubscriptionFilterOptions.Builder.() -> Unit): SubscriptionFilter

  public fun extractMetric(
    arg0: String,
    arg1: String,
    arg2: String,
  ): Metric

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun logGroupArn(): String

  public fun logGroupName(): String

  public fun logGroupPhysicalName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.ILogGroup,
  ) : ILogGroup {
    override fun addMetricFilter(arg0: String, arg1: MetricFilterOptions): MetricFilter =
        unwrap(this).addMetricFilter(arg0,
        arg1.let(MetricFilterOptions::unwrap)).let(MetricFilter::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
    override fun addMetricFilter(arg0: String, arg1: MetricFilterOptions.Builder.() -> Unit):
        MetricFilter = addMetricFilter(arg0, MetricFilterOptions(arg1))

    override fun addStream(arg0: String): LogStream =
        unwrap(this).addStream(arg0).let(LogStream::wrap)

    override fun addStream(arg0: String, arg1: StreamOptions): LogStream =
        unwrap(this).addStream(arg0, arg1.let(StreamOptions::unwrap)).let(LogStream::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
    override fun addStream(arg0: String, arg1: StreamOptions.Builder.() -> Unit): LogStream =
        addStream(arg0, StreamOptions(arg1))

    override fun addSubscriptionFilter(arg0: String, arg1: SubscriptionFilterOptions):
        SubscriptionFilter = unwrap(this).addSubscriptionFilter(arg0,
        arg1.let(SubscriptionFilterOptions::unwrap)).let(SubscriptionFilter::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
    override fun addSubscriptionFilter(arg0: String,
        arg1: SubscriptionFilterOptions.Builder.() -> Unit): SubscriptionFilter =
        addSubscriptionFilter(arg0, SubscriptionFilterOptions(arg1))

    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun extractMetric(
      arg0: String,
      arg1: String,
      arg2: String,
    ): Metric = unwrap(this).extractMetric(arg0, arg1, arg2).let(Metric::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun logGroupArn(): String = unwrap(this).getLogGroupArn()

    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    override fun logGroupPhysicalName(): String = unwrap(this).logGroupPhysicalName()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogGroup): ILogGroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogGroup): software.amazon.awscdk.services.logs.ILogGroup =
        (wrapped as Wrapper).cdkObject
  }
}
