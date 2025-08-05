@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an Amazon Data Firehose delivery stream.
 */
public interface IDeliveryStream : IResource, IGrantable, IConnectable {
  /**
   * The ARN of the delivery stream.
   */
  public fun deliveryStreamArn(): String

  /**
   * The name of the delivery stream.
   */
  public fun deliveryStreamName(): String

  /**
   * Grant the `grantee` identity permissions to perform `actions`.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Grant the `grantee` identity permissions to perform `firehose:PutRecord` and
   * `firehose:PutRecordBatch` actions on this delivery stream.
   *
   * @param grantee 
   */
  public fun grantPutRecords(grantee: IGrantable): Grant

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3Bytes(): Metric

  /**
   * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3Bytes(props: MetricOptions): Metric

  /**
   * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6de4410928b3b1de871799274affa6ec3fa9ed84f5e343fab20c5b7c7ae9cebe")
  public fun metricBackupToS3Bytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
   * Amazon Data Firehose.
   *
   * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3DataFreshness(): Metric

  /**
   * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
   * Amazon Data Firehose.
   *
   * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3DataFreshness(props: MetricOptions): Metric

  /**
   * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
   * Amazon Data Firehose.
   *
   * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("819679e027d74e2b436e4efe5a22a17d81fb3c3d2fdcf62a299b8b06d8b56547")
  public fun metricBackupToS3DataFreshness(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of records delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3Records(): Metric

  /**
   * Metric for the number of records delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricBackupToS3Records(props: MetricOptions): Metric

  /**
   * Metric for the number of records delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("710f7fdb5f508a4a96df2e2d7e4106662b138e4b619569fa239578f7e9cdc4e8")
  public fun metricBackupToS3Records(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of bytes ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricIncomingBytes(): Metric

  /**
   * Metric for the number of bytes ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricIncomingBytes(props: MetricOptions): Metric

  /**
   * Metric for the number of bytes ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
  public fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of records ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricIncomingRecords(): Metric

  /**
   * Metric for the number of records ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public fun metricIncomingRecords(props: MetricOptions): Metric

  /**
   * Metric for the number of records ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
  public fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream,
  ) : CdkObject(cdkObject),
      IDeliveryStream {
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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The ARN of the delivery stream.
     */
    override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

    /**
     * The name of the delivery stream.
     */
    override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

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
     * Grant the `grantee` identity permissions to perform `actions`.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * The principal to grant permissions to.
     */
    override fun grantPrincipal(): IPrincipal =
        unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

    /**
     * Grant the `grantee` identity permissions to perform `firehose:PutRecord` and
     * `firehose:PutRecordBatch` actions on this delivery stream.
     *
     * @param grantee 
     */
    override fun grantPutRecords(grantee: IGrantable): Grant =
        unwrap(this).grantPutRecords(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Return the given named metric for this delivery stream.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this delivery stream.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this delivery stream.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3Bytes(): Metric =
        unwrap(this).metricBackupToS3Bytes().let(Metric::wrap)

    /**
     * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3Bytes(props: MetricOptions): Metric =
        unwrap(this).metricBackupToS3Bytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6de4410928b3b1de871799274affa6ec3fa9ed84f5e343fab20c5b7c7ae9cebe")
    override fun metricBackupToS3Bytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricBackupToS3Bytes(MetricOptions(props))

    /**
     * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
     * Amazon Data Firehose.
     *
     * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3DataFreshness(): Metric =
        unwrap(this).metricBackupToS3DataFreshness().let(Metric::wrap)

    /**
     * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
     * Amazon Data Firehose.
     *
     * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3DataFreshness(props: MetricOptions): Metric =
        unwrap(this).metricBackupToS3DataFreshness(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the age (from getting into Amazon Data Firehose to now) of the oldest record in
     * Amazon Data Firehose.
     *
     * Any record older than this age has been delivered to the Amazon S3 bucket for backup.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819679e027d74e2b436e4efe5a22a17d81fb3c3d2fdcf62a299b8b06d8b56547")
    override fun metricBackupToS3DataFreshness(props: MetricOptions.Builder.() -> Unit): Metric =
        metricBackupToS3DataFreshness(MetricOptions(props))

    /**
     * Metric for the number of records delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3Records(): Metric =
        unwrap(this).metricBackupToS3Records().let(Metric::wrap)

    /**
     * Metric for the number of records delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricBackupToS3Records(props: MetricOptions): Metric =
        unwrap(this).metricBackupToS3Records(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of records delivered to Amazon S3 for backup over the specified time
     * period.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("710f7fdb5f508a4a96df2e2d7e4106662b138e4b619569fa239578f7e9cdc4e8")
    override fun metricBackupToS3Records(props: MetricOptions.Builder.() -> Unit): Metric =
        metricBackupToS3Records(MetricOptions(props))

    /**
     * Metric for the number of bytes ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricIncomingBytes(): Metric =
        unwrap(this).metricIncomingBytes().let(Metric::wrap)

    /**
     * Metric for the number of bytes ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricIncomingBytes(props: MetricOptions): Metric =
        unwrap(this).metricIncomingBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of bytes ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
    override fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingBytes(MetricOptions(props))

    /**
     * Metric for the number of records ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricIncomingRecords(): Metric =
        unwrap(this).metricIncomingRecords().let(Metric::wrap)

    /**
     * Metric for the number of records ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    override fun metricIncomingRecords(props: MetricOptions): Metric =
        unwrap(this).metricIncomingRecords(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of records ingested successfully into the delivery stream over the
     * specified time period after throttling.
     *
     * By default, this metric will be calculated as an average over a period of 5 minutes.
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
    override fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingRecords(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream):
        IDeliveryStream = CdkObjectWrappers.wrap(cdkObject) as? IDeliveryStream ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDeliveryStream):
        software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.IDeliveryStream
  }
}
