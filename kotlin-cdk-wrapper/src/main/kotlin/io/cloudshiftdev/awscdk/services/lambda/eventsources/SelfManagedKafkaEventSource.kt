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

public open class SelfManagedKafkaEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource,
) : StreamEventSource(cdkObject) {
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun authenticationMethod(authenticationMethod: AuthenticationMethod)

    public fun batchSize(batchSize: Number)

    public fun bootstrapServers(bootstrapServers: List<String>)

    public fun bootstrapServers(vararg bootstrapServers: String)

    public fun consumerGroupId(consumerGroupId: String)

    public fun enabled(enabled: Boolean)

    public fun filters(filters: List<Map<String, Any>>)

    public fun filters(vararg filters: Map<String, Any>)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun onFailure(onFailure: IEventSourceDlq)

    public fun rootCaCertificate(rootCaCertificate: ISecret)

    public fun secret(secret: ISecret)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun startingPosition(startingPosition: StartingPosition)

    public fun topic(topic: String)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3245fb08d872aaa6e2be2e7d819e00e3e61239959a38050791406e9c4389f09f")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource.Builder.create()

    override fun authenticationMethod(authenticationMethod: AuthenticationMethod) {
      cdkBuilder.authenticationMethod(authenticationMethod.let(AuthenticationMethod::unwrap))
    }

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun bootstrapServers(bootstrapServers: List<String>) {
      cdkBuilder.bootstrapServers(bootstrapServers)
    }

    override fun bootstrapServers(vararg bootstrapServers: String): Unit =
        bootstrapServers(bootstrapServers.toList())

    override fun consumerGroupId(consumerGroupId: String) {
      cdkBuilder.consumerGroupId(consumerGroupId)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq::unwrap))
    }

    override fun rootCaCertificate(rootCaCertificate: ISecret) {
      cdkBuilder.rootCaCertificate(rootCaCertificate.let(ISecret::unwrap))
    }

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

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
        wrapped.cdkObject
  }
}
