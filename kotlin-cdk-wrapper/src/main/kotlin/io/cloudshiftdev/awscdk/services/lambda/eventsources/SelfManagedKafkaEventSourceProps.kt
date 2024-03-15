@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface SelfManagedKafkaEventSourceProps : KafkaEventSourceProps {
  public fun authenticationMethod(): AuthenticationMethod? =
      unwrap(this).getAuthenticationMethod()?.let(AuthenticationMethod::wrap)

  public fun bootstrapServers(): List<String>

  public fun rootCaCertificate(): ISecret? = unwrap(this).getRootCACertificate()?.let(ISecret::wrap)

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

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
    @JvmName("06045dd6e214d096d65956dc512ed1f31d34e206d5867d376ea3f8d48337ab1c")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps.Builder
        =
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps.builder()

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
    override fun authenticationMethod(): AuthenticationMethod? =
        unwrap(this).getAuthenticationMethod()?.let(AuthenticationMethod::wrap)

    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun bootstrapServers(): List<String> = unwrap(this).getBootstrapServers()

    override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    override fun rootCaCertificate(): ISecret? =
        unwrap(this).getRootCACertificate()?.let(ISecret::wrap)

    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    override fun topic(): String = unwrap(this).getTopic()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

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
        SelfManagedKafkaEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SelfManagedKafkaEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps
  }
}
