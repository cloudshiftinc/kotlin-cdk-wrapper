@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Use a self hosted Kafka installation as a streaming source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.secretsmanager.Secret;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource;
 * // The secret that allows access to your self hosted Kafka cluster
 * Secret secret;
 * Function myFunction;
 * // The list of Kafka brokers
 * String[] bootstrapServers = List.of("kafka-broker:9092");
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * // (Optional) The consumer group id to use when connecting to the Kafka broker. If omitted the
 * UUID of the event source mapping will be used.
 * String consumerGroupId = "my-consumer-group-id";
 * myFunction.addEventSource(SelfManagedKafkaEventSource.Builder.create()
 * .bootstrapServers(bootstrapServers)
 * .topic(topic)
 * .consumerGroupId(consumerGroupId)
 * .secret(secret)
 * .batchSize(100) // default
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .build());
 * ```
 */
public open class SelfManagedKafkaEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource,
) : StreamEventSource(cdkObject) {
  public constructor(props: SelfManagedKafkaEventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource(props.let(SelfManagedKafkaEventSourceProps::unwrap))
  )

  public constructor(props: SelfManagedKafkaEventSourceProps.Builder.() -> Unit) :
      this(SelfManagedKafkaEventSourceProps(props)
  )

  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The authentication method for your Kafka cluster.
     *
     * Default: AuthenticationMethod.SASL_SCRAM_512_AUTH
     *
     * @param authenticationMethod The authentication method for your Kafka cluster. 
     */
    public fun authenticationMethod(authenticationMethod: AuthenticationMethod)

    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     *
     *
     * Default: 100
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    public fun batchSize(batchSize: Number)

    /**
     * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
     * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.xyz.com:xxxx`.
     *
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     */
    public fun bootstrapServers(bootstrapServers: List<String>)

    /**
     * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
     * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.xyz.com:xxxx`.
     *
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     */
    public fun bootstrapServers(vararg bootstrapServers: String)

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
     * @param consumerGroupId The identifier for the Kafka consumer group to join. 
     */
    public fun consumerGroupId(consumerGroupId: String)

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the stream event source mapping should be enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * Add an on Failure Destination for this Kafka event.
     *
     * SNS/SQS/S3 are supported
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure Add an on Failure Destination for this Kafka event. 
     */
    public fun onFailure(onFailure: IEventSourceDlq)

    /**
     * The secret with the root CA certificate used by your Kafka brokers for TLS encryption This
     * field is required if your Kafka brokers use certificates signed by a private CA.
     *
     * Default: - none
     *
     * @param rootCaCertificate The secret with the root CA certificate used by your Kafka brokers
     * for TLS encryption This field is required if your Kafka brokers use certificates signed by a
     * private CA. 
     */
    public fun rootCaCertificate(rootCaCertificate: ISecret)

    /**
     * The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     *
     * Default: none
     *
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet. 
     */
    public fun secret(secret: ISecret)

    /**
     * If your Kafka brokers are only reachable via VPC, provide the security group here.
     *
     * Default: - none, required if setting vpc
     *
     * @param securityGroup If your Kafka brokers are only reachable via VPC, provide the security
     * group here. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * Where to begin consuming the stream.
     *
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * The Kafka topic to subscribe to.
     *
     * @param topic The Kafka topic to subscribe to. 
     */
    public fun topic(topic: String)

    /**
     * If your Kafka brokers are only reachable via VPC provide the VPC here.
     *
     * Default: none
     *
     * @param vpc If your Kafka brokers are only reachable via VPC provide the VPC here. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
     *
     * Default: - none, required if setting vpc
     *
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
     *
     * Default: - none, required if setting vpc
     *
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3245fb08d872aaa6e2be2e7d819e00e3e61239959a38050791406e9c4389f09f")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource.Builder.create()

    /**
     * The authentication method for your Kafka cluster.
     *
     * Default: AuthenticationMethod.SASL_SCRAM_512_AUTH
     *
     * @param authenticationMethod The authentication method for your Kafka cluster. 
     */
    override fun authenticationMethod(authenticationMethod: AuthenticationMethod) {
      cdkBuilder.authenticationMethod(authenticationMethod.let(AuthenticationMethod::unwrap))
    }

    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     *
     *
     * Default: 100
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
     * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.xyz.com:xxxx`.
     *
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     */
    override fun bootstrapServers(bootstrapServers: List<String>) {
      cdkBuilder.bootstrapServers(bootstrapServers)
    }

    /**
     * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
     * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.xyz.com:xxxx`.
     *
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     */
    override fun bootstrapServers(vararg bootstrapServers: String): Unit =
        bootstrapServers(bootstrapServers.toList())

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
     * @param consumerGroupId The identifier for the Kafka consumer group to join. 
     */
    override fun consumerGroupId(consumerGroupId: String) {
      cdkBuilder.consumerGroupId(consumerGroupId)
    }

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the stream event source mapping should be enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    /**
     * Add an on Failure Destination for this Kafka event.
     *
     * SNS/SQS/S3 are supported
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure Add an on Failure Destination for this Kafka event. 
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    /**
     * The secret with the root CA certificate used by your Kafka brokers for TLS encryption This
     * field is required if your Kafka brokers use certificates signed by a private CA.
     *
     * Default: - none
     *
     * @param rootCaCertificate The secret with the root CA certificate used by your Kafka brokers
     * for TLS encryption This field is required if your Kafka brokers use certificates signed by a
     * private CA. 
     */
    override fun rootCaCertificate(rootCaCertificate: ISecret) {
      cdkBuilder.rootCaCertificate(rootCaCertificate.let(ISecret::unwrap))
    }

    /**
     * The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     *
     * Default: none
     *
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet. 
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * If your Kafka brokers are only reachable via VPC, provide the security group here.
     *
     * Default: - none, required if setting vpc
     *
     * @param securityGroup If your Kafka brokers are only reachable via VPC, provide the security
     * group here. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * Where to begin consuming the stream.
     *
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    /**
     * The Kafka topic to subscribe to.
     *
     * @param topic The Kafka topic to subscribe to. 
     */
    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    /**
     * If your Kafka brokers are only reachable via VPC provide the VPC here.
     *
     * Default: none
     *
     * @param vpc If your Kafka brokers are only reachable via VPC provide the VPC here. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
     *
     * Default: - none, required if setting vpc
     *
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
     *
     * Default: - none, required if setting vpc
     *
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3245fb08d872aaa6e2be2e7d819e00e3e61239959a38050791406e9c4389f09f")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedKafkaEventSource {
      val builderImpl = BuilderImpl()
      return SelfManagedKafkaEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource):
        SelfManagedKafkaEventSource = SelfManagedKafkaEventSource(cdkObject)

    internal fun unwrap(wrapped: SelfManagedKafkaEventSource):
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource
  }
}
