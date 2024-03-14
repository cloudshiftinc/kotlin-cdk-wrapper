package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ICertificate : IResource {
  public fun certificateArn(): String

  public fun metricDaysToExpiry(): Metric

  public fun metricDaysToExpiry(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public fun metricDaysToExpiry(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.certificatemanager.ICertificate,
  ) : ICertificate {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun metricDaysToExpiry(): Metric = unwrap(this).metricDaysToExpiry().let(Metric::wrap)

    override fun metricDaysToExpiry(arg0: MetricOptions): Metric =
        unwrap(this).metricDaysToExpiry(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
    override fun metricDaysToExpiry(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDaysToExpiry(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.ICertificate):
        ICertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICertificate):
        software.amazon.awscdk.services.certificatemanager.ICertificate = (wrapped as
        Wrapper).cdkObject
  }
}
