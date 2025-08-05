@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a Amazon Data Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * // Provide a Lambda function that will transform records before delivery, with custom
 * // buffering and retry configuration
 * Function lambdaFunction = Function.Builder.create(this, "Processor")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "process-records")))
 * .build();
 * LambdaFunctionProcessor lambdaProcessor = LambdaFunctionProcessor.Builder.create(lambdaFunction)
 * .bufferInterval(Duration.minutes(5))
 * .bufferSize(Size.mebibytes(5))
 * .retries(5)
 * .build();
 * S3Bucket s3Destination = S3Bucket.Builder.create(bucket)
 * .processor(lambdaProcessor)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * ```
 */
public open class DeliveryStream(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.DeliveryStream,
) : Resource(cdkObject),
    IDeliveryStream {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeliveryStreamProps,
  ) :
      this(software.amazon.awscdk.services.kinesisfirehose.DeliveryStream(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(DeliveryStreamProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DeliveryStreamProps.Builder.() -> Unit,
  ) : this(scope, id, DeliveryStreamProps(props)
  )

  /**
   * Network connections between Amazon Data Firehose and other resources, i.e. Redshift cluster.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The ARN of the delivery stream.
   */
  public override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

  /**
   * The name of the delivery stream.
   */
  public override fun deliveryStreamName(): String = unwrap(this).getDeliveryStreamName()

  /**
   * Grant the `grantee` identity permissions to perform `actions`.
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Grant the `grantee` identity permissions to perform `firehose:PutRecord` and
   * `firehose:PutRecordBatch` actions on this delivery stream.
   *
   * @param grantee 
   */
  public override fun grantPutRecords(grantee: IGrantable): Grant =
      unwrap(this).grantPutRecords(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this delivery stream.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricBackupToS3Bytes(): Metric =
      unwrap(this).metricBackupToS3Bytes().let(Metric::wrap)

  /**
   * Metric for the number of bytes delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricBackupToS3Bytes(props: MetricOptions): Metric =
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
  public override fun metricBackupToS3Bytes(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricBackupToS3DataFreshness(): Metric =
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
  public override fun metricBackupToS3DataFreshness(props: MetricOptions): Metric =
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
  public override fun metricBackupToS3DataFreshness(props: MetricOptions.Builder.() -> Unit): Metric
      = metricBackupToS3DataFreshness(MetricOptions(props))

  /**
   * Metric for the number of records delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricBackupToS3Records(): Metric =
      unwrap(this).metricBackupToS3Records().let(Metric::wrap)

  /**
   * Metric for the number of records delivered to Amazon S3 for backup over the specified time
   * period.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricBackupToS3Records(props: MetricOptions): Metric =
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
  public override fun metricBackupToS3Records(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBackupToS3Records(MetricOptions(props))

  /**
   * Metric for the number of bytes ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricIncomingBytes(): Metric =
      unwrap(this).metricIncomingBytes().let(Metric::wrap)

  /**
   * Metric for the number of bytes ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricIncomingBytes(props: MetricOptions): Metric =
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
  public override fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIncomingBytes(MetricOptions(props))

  /**
   * Metric for the number of records ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricIncomingRecords(): Metric =
      unwrap(this).metricIncomingRecords().let(Metric::wrap)

  /**
   * Metric for the number of records ingested successfully into the delivery stream over the
   * specified time period after throttling.
   *
   * By default, this metric will be calculated as an average over a period of 5 minutes.
   *
   * @param props
   */
  public override fun metricIncomingRecords(props: MetricOptions): Metric =
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
  public override fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIncomingRecords(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesisfirehose.DeliveryStream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the delivery stream.
     *
     * Default: - a name is generated by CloudFormation.
     *
     * @param deliveryStreamName A name for the delivery stream. 
     */
    public fun deliveryStreamName(deliveryStreamName: String)

    /**
     * The destination that this delivery stream will deliver data to.
     *
     * @param destination The destination that this delivery stream will deliver data to. 
     */
    public fun destination(destination: IDestination)

    /**
     * Indicates the type of customer master key (CMK) to use for server-side encryption, if any.
     *
     * Default: StreamEncryption.unencrypted()
     *
     * @param encryption Indicates the type of customer master key (CMK) to use for server-side
     * encryption, if any. 
     */
    public fun encryption(encryption: StreamEncryption)

    /**
     * The IAM role associated with this delivery stream.
     *
     * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
     *
     * Default: - a role will be created with default permissions.
     *
     * @param role The IAM role associated with this delivery stream. 
     */
    public fun role(role: IRole)

    /**
     * The Kinesis data stream to use as a source for this delivery stream.
     *
     * Default: - data must be written to the delivery stream via a direct put.
     *
     * @param source The Kinesis data stream to use as a source for this delivery stream. 
     */
    public fun source(source: ISource)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.Builder.create(scope, id)

    /**
     * A name for the delivery stream.
     *
     * Default: - a name is generated by CloudFormation.
     *
     * @param deliveryStreamName A name for the delivery stream. 
     */
    override fun deliveryStreamName(deliveryStreamName: String) {
      cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * The destination that this delivery stream will deliver data to.
     *
     * @param destination The destination that this delivery stream will deliver data to. 
     */
    override fun destination(destination: IDestination) {
      cdkBuilder.destination(destination.let(IDestination.Companion::unwrap))
    }

    /**
     * Indicates the type of customer master key (CMK) to use for server-side encryption, if any.
     *
     * Default: StreamEncryption.unencrypted()
     *
     * @param encryption Indicates the type of customer master key (CMK) to use for server-side
     * encryption, if any. 
     */
    override fun encryption(encryption: StreamEncryption) {
      cdkBuilder.encryption(encryption.let(StreamEncryption.Companion::unwrap))
    }

    /**
     * The IAM role associated with this delivery stream.
     *
     * Assumed by Amazon Data Firehose to read from sources and encrypt data server-side.
     *
     * Default: - a role will be created with default permissions.
     *
     * @param role The IAM role associated with this delivery stream. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The Kinesis data stream to use as a source for this delivery stream.
     *
     * Default: - data must be written to the delivery stream via a direct put.
     *
     * @param source The Kinesis data stream to use as a source for this delivery stream. 
     */
    override fun source(source: ISource) {
      cdkBuilder.source(source.let(ISource.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DeliveryStream =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.PROPERTY_INJECTION_ID

    public fun fromDeliveryStreamArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      deliveryStreamArn: String,
    ): IDeliveryStream =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.fromDeliveryStreamArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, deliveryStreamArn).let(IDeliveryStream::wrap)

    public fun fromDeliveryStreamAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DeliveryStreamAttributes,
    ): IDeliveryStream =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.fromDeliveryStreamAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(DeliveryStreamAttributes.Companion::unwrap)).let(IDeliveryStream::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dfcbfa63d6b506542f451b38fc2cd1b2767f49c87b82517cddd470482d3f6124")
    public fun fromDeliveryStreamAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DeliveryStreamAttributes.Builder.() -> Unit,
    ): IDeliveryStream = fromDeliveryStreamAttributes(scope, id, DeliveryStreamAttributes(attrs))

    public fun fromDeliveryStreamName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      deliveryStreamName: String,
    ): IDeliveryStream =
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream.fromDeliveryStreamName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, deliveryStreamName).let(IDeliveryStream::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DeliveryStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DeliveryStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DeliveryStream):
        DeliveryStream = DeliveryStream(cdkObject)

    internal fun unwrap(wrapped: DeliveryStream):
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream = wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisfirehose.DeliveryStream
  }
}
