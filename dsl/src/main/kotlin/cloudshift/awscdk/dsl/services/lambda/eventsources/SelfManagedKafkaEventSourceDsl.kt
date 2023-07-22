@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * Use a self hosted Kafka installation as a streaming source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.secretsmanager.Secret;
 * import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource;
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
@CdkDslMarker
public class SelfManagedKafkaEventSourceDsl {
  private val cdkBuilder: SelfManagedKafkaEventSource.Builder =
      SelfManagedKafkaEventSource.Builder.create()

  private val _bootstrapServers: MutableList<String> = mutableListOf()

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  /**
   * The authentication method for your Kafka cluster.
   *
   * Default: AuthenticationMethod.SASL_SCRAM_512_AUTH
   *
   * @param authenticationMethod The authentication method for your Kafka cluster. 
   */
  public fun authenticationMethod(authenticationMethod: AuthenticationMethod) {
    cdkBuilder.authenticationMethod(authenticationMethod)
  }

  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
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
  public fun batchSize(batchSize: Number) {
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
  public fun bootstrapServers(vararg bootstrapServers: String) {
    _bootstrapServers.addAll(listOf(*bootstrapServers))
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
  public fun bootstrapServers(bootstrapServers: Collection<String>) {
    _bootstrapServers.addAll(bootstrapServers)
  }

  /**
   * The identifier for the Kafka consumer group to join.
   *
   * The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka
   * event source mapping with the consumer group ID specified, you cannot update this value.  The
   * value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/ *:_+=.&#64;-]*'.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
   * @param consumerGroupId The identifier for the Kafka consumer group to join. 
   */
  public fun consumerGroupId(consumerGroupId: String) {
    cdkBuilder.consumerGroupId(consumerGroupId)
  }

  /**
   * If the stream event source mapping should be enabled.
   *
   * Default: true
   *
   * @param enabled If the stream event source mapping should be enabled. 
   */
  public fun enabled(enabled: Boolean) {
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
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   * @param filters Add filter criteria to Event Source. 
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

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
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  /**
   * The secret with the root CA certificate used by your Kafka brokers for TLS encryption This
   * field is required if your Kafka brokers use certificates signed by a private CA.
   *
   * Default: - none
   *
   * @param rootCaCertificate The secret with the root CA certificate used by your Kafka brokers for
   * TLS encryption This field is required if your Kafka brokers use certificates signed by a private
   * CA. 
   */
  public fun rootCaCertificate(rootCaCertificate: ISecret) {
    cdkBuilder.rootCaCertificate(rootCaCertificate)
  }

  /**
   * The secret with the Kafka credentials, see
   * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field is
   * required if your Kafka brokers are accessed over the Internet.
   *
   * Default: none
   *
   * @param secret The secret with the Kafka credentials, see
   * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field is
   * required if your Kafka brokers are accessed over the Internet. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  /**
   * If your Kafka brokers are only reachable via VPC, provide the security group here.
   *
   * Default: - none, required if setting vpc
   *
   * @param securityGroup If your Kafka brokers are only reachable via VPC, provide the security
   * group here. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * Where to begin consuming the stream.
   *
   * @param startingPosition Where to begin consuming the stream. 
   */
  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  /**
   * The Kafka topic to subscribe to.
   *
   * @param topic The Kafka topic to subscribe to. 
   */
  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  /**
   * If your Kafka brokers are only reachable via VPC provide the VPC here.
   *
   * Default: none
   *
   * @param vpc If your Kafka brokers are only reachable via VPC provide the VPC here. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  /**
   * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
   *
   * Default: - none, required if setting vpc
   *
   * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
   * selection here. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(vpcSubnets)
    cdkBuilder.vpcSubnets(builder.build())
  }

  /**
   * If your Kafka brokers are only reachable via VPC, provide the subnets selection here.
   *
   * Default: - none, required if setting vpc
   *
   * @param vpcSubnets If your Kafka brokers are only reachable via VPC, provide the subnets
   * selection here. 
   */
  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): SelfManagedKafkaEventSource {
    if(_bootstrapServers.isNotEmpty()) cdkBuilder.bootstrapServers(_bootstrapServers)
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
