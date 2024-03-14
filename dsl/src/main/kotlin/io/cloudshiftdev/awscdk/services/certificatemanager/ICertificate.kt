package io.cloudshiftdev.awscdk.services.certificatemanager

import io.cloudshiftdev.awscdk.CdkObject
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
  /**
   * The certificate's ARN.
   */
  public fun certificateArn(): String

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public fun metricDaysToExpiry(): Metric

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  public fun metricDaysToExpiry(props: MetricOptions): Metric

  /**
   * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
   * is the minimum value over 1 day.
   *
   * This metric is no longer emitted once the certificate has effectively
   * expired, so alarms configured on this metric should probably treat missing
   * data as "breaching".
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
  public fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.certificatemanager.ICertificate,
  ) : CdkObject(cdkObject), ICertificate {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The certificate's ARN.
     */
    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively
     * expired, so alarms configured on this metric should probably treat missing
     * data as "breaching".
     *
     * @param props
     */
    override fun metricDaysToExpiry(): Metric = unwrap(this).metricDaysToExpiry().let(Metric::wrap)

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively
     * expired, so alarms configured on this metric should probably treat missing
     * data as "breaching".
     *
     * @param props
     */
    override fun metricDaysToExpiry(props: MetricOptions): Metric =
        unwrap(this).metricDaysToExpiry(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the DaysToExpiry metric for this AWS Certificate Manager Certificate. By default, this
     * is the minimum value over 1 day.
     *
     * This metric is no longer emitted once the certificate has effectively
     * expired, so alarms configured on this metric should probably treat missing
     * data as "breaching".
     *
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ad895c8ac7bc6d03bba3058600c1021b398f352b3a3b16493165686a37bd590")
    override fun metricDaysToExpiry(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDaysToExpiry(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.ICertificate):
        ICertificate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICertificate):
        software.amazon.awscdk.services.certificatemanager.ICertificate = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.certificatemanager.ICertificate
  }
}
