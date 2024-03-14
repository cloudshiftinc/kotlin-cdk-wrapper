package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CommonAutoScalingGroupProps {
  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun associatePublicIpAddress(): Boolean? = unwrap(this).getAssociatePublicIpAddress()

  public fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

  public fun blockDevices(): List<BlockDevice> =
      unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

  public fun capacityRebalance(): Boolean? = unwrap(this).getCapacityRebalance()

  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  public fun defaultInstanceWarmup(): Duration? =
      unwrap(this).getDefaultInstanceWarmup()?.let(Duration::wrap)

  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  public fun groupMetrics(): List<GroupMetrics> =
      unwrap(this).getGroupMetrics()?.map(GroupMetrics::wrap) ?: emptyList()

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun ignoreUnmodifiedSizeProperties(): Boolean? =
      unwrap(this).getIgnoreUnmodifiedSizeProperties()

  public fun instanceMonitoring(): Monitoring? =
      unwrap(this).getInstanceMonitoring()?.let(Monitoring::wrap)

  public fun keyName(): String? = unwrap(this).getKeyName()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun maxInstanceLifetime(): Duration? =
      unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public fun newInstancesProtectedFromScaleIn(): Boolean? =
      unwrap(this).getNewInstancesProtectedFromScaleIn()

  public fun notifications(): List<NotificationConfiguration> =
      unwrap(this).getNotifications()?.map(NotificationConfiguration::wrap) ?: emptyList()

  public fun signals(): Signals? = unwrap(this).getSignals()?.let(Signals::wrap)

  public fun spotPrice(): String? = unwrap(this).getSpotPrice()

  public fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

  public fun terminationPolicies(): List<TerminationPolicy> =
      unwrap(this).getTerminationPolicies()?.map(TerminationPolicy::wrap) ?: emptyList()

  public fun terminationPolicyCustomLambdaFunctionArn(): String? =
      unwrap(this).getTerminationPolicyCustomLambdaFunctionArn()

  public fun updatePolicy(): UpdatePolicy? = unwrap(this).getUpdatePolicy()?.let(UpdatePolicy::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
    }

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
    }

    public fun autoScalingGroupName(autoScalingGroupName: String) {
    }

    public fun blockDevices(blockDevices: List<BlockDevice>) {
    }

    public fun capacityRebalance(capacityRebalance: Boolean) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
    }

    public fun desiredCapacity(desiredCapacity: Number) {
    }

    public fun groupMetrics(groupMetrics: List<GroupMetrics>) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    public fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
    }

    public fun instanceMonitoring(instanceMonitoring: Monitoring) {
    }

    public fun keyName(keyName: String) {
    }

    public fun maxCapacity(maxCapacity: Number) {
    }

    public fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
    }

    public fun minCapacity(minCapacity: Number) {
    }

    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
    }

    public fun notifications(notifications: List<NotificationConfiguration>) {
    }

    public fun signals(signals: Signals) {
    }

    public fun spotPrice(spotPrice: String) {
    }

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
    }

    public fun terminationPolicies(terminationPolicies: List<TerminationPolicy>) {
    }

    public
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String) {
    }

    public fun updatePolicy(updatePolicy: UpdatePolicy) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3edae183ac0cbcae30c78b6cb2774cd1d50e0714fc1cc9b92e49f0b03e6d0aa7")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.Builder =
        software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps.builder()

    public override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    public override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    public override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    public override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    public override fun capacityRebalance(capacityRebalance: Boolean) {
      cdkBuilder.capacityRebalance(capacityRebalance)
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun defaultInstanceWarmup(defaultInstanceWarmup: Duration) {
      cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup.let(Duration::unwrap))
    }

    public override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public override fun groupMetrics(groupMetrics: List<GroupMetrics>) {
      cdkBuilder.groupMetrics(groupMetrics.map(GroupMetrics::unwrap))
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    public override fun ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties: Boolean) {
      cdkBuilder.ignoreUnmodifiedSizeProperties(ignoreUnmodifiedSizeProperties)
    }

    public override fun instanceMonitoring(instanceMonitoring: Monitoring) {
      cdkBuilder.instanceMonitoring(instanceMonitoring.let(Monitoring::unwrap))
    }

    public override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    public override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    public override fun maxInstanceLifetime(maxInstanceLifetime: Duration) {
      cdkBuilder.maxInstanceLifetime(maxInstanceLifetime.let(Duration::unwrap))
    }

    public override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public override
        fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
      cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    public override fun notifications(notifications: List<NotificationConfiguration>) {
      cdkBuilder.notifications(notifications.map(NotificationConfiguration::unwrap))
    }

    public override fun signals(signals: Signals) {
      cdkBuilder.signals(signals.let(Signals::unwrap))
    }

    public override fun spotPrice(spotPrice: String) {
      cdkBuilder.spotPrice(spotPrice)
    }

    public override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    public override fun terminationPolicies(terminationPolicies: List<TerminationPolicy>) {
      cdkBuilder.terminationPolicies(terminationPolicies.map(TerminationPolicy::unwrap))
    }

    public override
        fun terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn: String) {
      cdkBuilder.terminationPolicyCustomLambdaFunctionArn(terminationPolicyCustomLambdaFunctionArn)
    }

    public override fun updatePolicy(updatePolicy: UpdatePolicy) {
      cdkBuilder.updatePolicy(updatePolicy.let(UpdatePolicy::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3edae183ac0cbcae30c78b6cb2774cd1d50e0714fc1cc9b92e49f0b03e6d0aa7")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps,
  ) : CommonAutoScalingGroupProps {
    public override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    public override fun associatePublicIpAddress(): Boolean? =
        unwrap(this).getAssociatePublicIpAddress()

    public override fun autoScalingGroupName(): String? = unwrap(this).getAutoScalingGroupName()

    public override fun blockDevices(): List<BlockDevice> =
        unwrap(this).getBlockDevices()?.map(BlockDevice::wrap) ?: emptyList()

    public override fun capacityRebalance(): Boolean? = unwrap(this).getCapacityRebalance()

    public override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    public override fun defaultInstanceWarmup(): Duration? =
        unwrap(this).getDefaultInstanceWarmup()?.let(Duration::wrap)

    public override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    public override fun groupMetrics(): List<GroupMetrics> =
        unwrap(this).getGroupMetrics()?.map(GroupMetrics::wrap) ?: emptyList()

    public override fun healthCheck(): HealthCheck? =
        unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    public override fun ignoreUnmodifiedSizeProperties(): Boolean? =
        unwrap(this).getIgnoreUnmodifiedSizeProperties()

    public override fun instanceMonitoring(): Monitoring? =
        unwrap(this).getInstanceMonitoring()?.let(Monitoring::wrap)

    public override fun keyName(): String? = unwrap(this).getKeyName()

    public override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public override fun maxInstanceLifetime(): Duration? =
        unwrap(this).getMaxInstanceLifetime()?.let(Duration::wrap)

    public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public override fun newInstancesProtectedFromScaleIn(): Boolean? =
        unwrap(this).getNewInstancesProtectedFromScaleIn()

    public override fun notifications(): List<NotificationConfiguration> =
        unwrap(this).getNotifications()?.map(NotificationConfiguration::wrap) ?: emptyList()

    public override fun signals(): Signals? = unwrap(this).getSignals()?.let(Signals::wrap)

    public override fun spotPrice(): String? = unwrap(this).getSpotPrice()

    public override fun ssmSessionPermissions(): Boolean? = unwrap(this).getSsmSessionPermissions()

    public override fun terminationPolicies(): List<TerminationPolicy> =
        unwrap(this).getTerminationPolicies()?.map(TerminationPolicy::wrap) ?: emptyList()

    public override fun terminationPolicyCustomLambdaFunctionArn(): String? =
        unwrap(this).getTerminationPolicyCustomLambdaFunctionArn()

    public override fun updatePolicy(): UpdatePolicy? =
        unwrap(this).getUpdatePolicy()?.let(UpdatePolicy::wrap)

    public override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonAutoScalingGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps):
        CommonAutoScalingGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonAutoScalingGroupProps):
        software.amazon.awscdk.services.autoscaling.CommonAutoScalingGroupProps = (wrapped as
        Wrapper).cdkObject
  }
}
