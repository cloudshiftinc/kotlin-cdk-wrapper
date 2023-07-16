@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class SelfManagedKafkaEventSourcePropsDsl {
  private val cdkBuilder: SelfManagedKafkaEventSourceProps.Builder =
      SelfManagedKafkaEventSourceProps.builder()

  private val _bootstrapServers: MutableList<String> = mutableListOf()

  public fun authenticationMethod(authenticationMethod: AuthenticationMethod) {
    cdkBuilder.authenticationMethod(authenticationMethod)
  }

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun bootstrapServers(vararg bootstrapServers: String) {
    _bootstrapServers.addAll(listOf(*bootstrapServers))
  }

  public fun bootstrapServers(bootstrapServers: Collection<String>) {
    _bootstrapServers.addAll(bootstrapServers)
  }

  public fun consumerGroupId(consumerGroupId: String) {
    cdkBuilder.consumerGroupId(consumerGroupId)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  public fun rootCaCertificate(rootCaCertificate: ISecret) {
    cdkBuilder.rootCaCertificate(rootCaCertificate)
  }

  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): SelfManagedKafkaEventSourceProps {
    if(_bootstrapServers.isNotEmpty()) cdkBuilder.bootstrapServers(_bootstrapServers)
    return cdkBuilder.build()
  }
}
