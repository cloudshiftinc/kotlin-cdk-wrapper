@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
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
 * Properties for a self managed Kafka cluster event source.
 *
 * If your Kafka cluster is only reachable via VPC make sure to configure it.
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
public interface SelfManagedKafkaEventSourceProps : KafkaEventSourceProps {
  /**
   * The authentication method for your Kafka cluster.
   *
   * Default: AuthenticationMethod.SASL_SCRAM_512_AUTH
   */
  public fun authenticationMethod(): AuthenticationMethod? =
      unwrap(this).getAuthenticationMethod()?.let(AuthenticationMethod::wrap)

  /**
   * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
   * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
   *
   * They are in the format `abc.xyz.com:xxxx`.
   */
  public fun bootstrapServers(): List<String>

  /**
   * The secret with the root CA certificate used by your Kafka brokers for TLS encryption This
   * field is required if your Kafka brokers use certificates signed by a private CA.
   *
   * Default: - none
   */
  public fun rootCaCertificate(): ISecret? = unwrap(this).getRootCACertificate()?.let(ISecret::wrap)

  /**
   * If your Kafka brokers are only reachable via VPC, provide the security group here.
   *
   * Default: - none, required if setting vpc
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * If your Kafka brokers are only reachable via VPC provide the VPC here.
   *
   * Default: none
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
   *
   * Default: - none, required if setting vpc
   */
  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  /**
   * A builder for [SelfManagedKafkaEventSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationMethod The authentication method for your Kafka cluster.
     */
    public fun authenticationMethod(authenticationMethod: AuthenticationMethod)

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
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
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     * They are in the format `abc.xyz.com:xxxx`.
     */
    public fun bootstrapServers(bootstrapServers: List<String>)

    /**
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     * They are in the format `abc.xyz.com:xxxx`.
     */
    public fun bootstrapServers(vararg bootstrapServers: String)

    /**
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     */
    public fun consumerGroupId(consumerGroupId: String)

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param onFailure Add an on Failure Destination for this Kafka event.
     * SNS/SQS/S3 are supported
     */
    public fun onFailure(onFailure: IEventSourceDlq)

    /**
     * @param rootCaCertificate The secret with the root CA certificate used by your Kafka brokers
     * for TLS encryption This field is required if your Kafka brokers use certificates signed by a
     * private CA.
     */
    public fun rootCaCertificate(rootCaCertificate: ISecret)

    /**
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     */
    public fun secret(secret: ISecret)

    /**
     * @param securityGroup If your Kafka brokers are only reachable via VPC, provide the security
     * group here.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * @param topic The Kafka topic to subscribe to. 
     */
    public fun topic(topic: String)

    /**
     * @param vpc If your Kafka brokers are only reachable via VPC provide the VPC here.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06045dd6e214d096d65956dc512ed1f31d34e206d5867d376ea3f8d48337ab1c")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps.Builder
        =
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps.builder()

    /**
     * @param authenticationMethod The authentication method for your Kafka cluster.
     */
    override fun authenticationMethod(authenticationMethod: AuthenticationMethod) {
      cdkBuilder.authenticationMethod(authenticationMethod.let(AuthenticationMethod::unwrap))
    }

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
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
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     * They are in the format `abc.xyz.com:xxxx`.
     */
    override fun bootstrapServers(bootstrapServers: List<String>) {
      cdkBuilder.bootstrapServers(bootstrapServers)
    }

    /**
     * @param bootstrapServers The list of host and port pairs that are the addresses of the Kafka
     * brokers in a "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap
     * itself. 
     * They are in the format `abc.xyz.com:xxxx`.
     */
    override fun bootstrapServers(vararg bootstrapServers: String): Unit =
        bootstrapServers(bootstrapServers.toList())

    /**
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     */
    override fun consumerGroupId(consumerGroupId: String) {
      cdkBuilder.consumerGroupId(consumerGroupId)
    }

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param filters Add filter criteria to Event Source.
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters Add filter criteria to Event Source.
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    /**
     * @param onFailure Add an on Failure Destination for this Kafka event.
     * SNS/SQS/S3 are supported
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    /**
     * @param rootCaCertificate The secret with the root CA certificate used by your Kafka brokers
     * for TLS encryption This field is required if your Kafka brokers use certificates signed by a
     * private CA.
     */
    override fun rootCaCertificate(rootCaCertificate: ISecret) {
      cdkBuilder.rootCaCertificate(rootCaCertificate.let(ISecret::unwrap))
    }

    /**
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * @param securityGroup If your Kafka brokers are only reachable via VPC, provide the security
     * group here.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    /**
     * @param topic The Kafka topic to subscribe to. 
     */
    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    /**
     * @param vpc If your Kafka brokers are only reachable via VPC provide the VPC here.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here.
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
     * selection here.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06045dd6e214d096d65956dc512ed1f31d34e206d5867d376ea3f8d48337ab1c")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps,
  ) : CdkObject(cdkObject), SelfManagedKafkaEventSourceProps {
    /**
     * The authentication method for your Kafka cluster.
     *
     * Default: AuthenticationMethod.SASL_SCRAM_512_AUTH
     */
    override fun authenticationMethod(): AuthenticationMethod? =
        unwrap(this).getAuthenticationMethod()?.let(AuthenticationMethod::wrap)

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
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * The list of host and port pairs that are the addresses of the Kafka brokers in a "bootstrap"
     * Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.xyz.com:xxxx`.
     */
    override fun bootstrapServers(): List<String> = unwrap(this).getBootstrapServers()

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
     */
    override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     */
    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     */
    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    /**
     * Add an on Failure Destination for this Kafka event.
     *
     * SNS/SQS/S3 are supported
     *
     * Default: - discarded records are ignored
     */
    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    /**
     * The secret with the root CA certificate used by your Kafka brokers for TLS encryption This
     * field is required if your Kafka brokers use certificates signed by a private CA.
     *
     * Default: - none
     */
    override fun rootCaCertificate(): ISecret? =
        unwrap(this).getRootCACertificate()?.let(ISecret::wrap)

    /**
     * The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     *
     * Default: none
     */
    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    /**
     * If your Kafka brokers are only reachable via VPC, provide the security group here.
     *
     * Default: - none, required if setting vpc
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Where to begin consuming the stream.
     */
    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    /**
     * The Kafka topic to subscribe to.
     */
    override fun topic(): String = unwrap(this).getTopic()

    /**
     * If your Kafka brokers are only reachable via VPC provide the VPC here.
     *
     * Default: none
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
     *
     * Default: - none, required if setting vpc
     */
    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedKafkaEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps):
        SelfManagedKafkaEventSourceProps = CdkObjectWrappers.wrap(cdkObject) as
        SelfManagedKafkaEventSourceProps

    internal fun unwrap(wrapped: SelfManagedKafkaEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps
  }
}
