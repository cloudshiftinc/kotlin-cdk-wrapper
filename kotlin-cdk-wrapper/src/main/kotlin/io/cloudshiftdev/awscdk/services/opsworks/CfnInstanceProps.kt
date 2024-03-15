@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceProps {
  public fun agentVersion(): String? = unwrap(this).getAgentVersion()

  public fun amiId(): String? = unwrap(this).getAmiId()

  public fun architecture(): String? = unwrap(this).getArchitecture()

  public fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

  public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

  public fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

  public fun hostname(): String? = unwrap(this).getHostname()

  public fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

  public fun instanceType(): String

  public fun layerIds(): List<String>

  public fun os(): String? = unwrap(this).getOs()

  public fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

  public fun sshKeyName(): String? = unwrap(this).getSshKeyName()

  public fun stackId(): String

  public fun subnetId(): String? = unwrap(this).getSubnetId()

  public fun tenancy(): String? = unwrap(this).getTenancy()

  public fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

  public fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

  public fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun agentVersion(agentVersion: String)

    public fun amiId(amiId: String)

    public fun architecture(architecture: String)

    public fun autoScalingType(autoScalingType: String)

    public fun availabilityZone(availabilityZone: String)

    public fun blockDeviceMappings(blockDeviceMappings: IResolvable)

    public fun blockDeviceMappings(blockDeviceMappings: List<Any>)

    public fun blockDeviceMappings(vararg blockDeviceMappings: Any)

    public fun ebsOptimized(ebsOptimized: Boolean)

    public fun ebsOptimized(ebsOptimized: IResolvable)

    public fun elasticIps(elasticIps: List<String>)

    public fun elasticIps(vararg elasticIps: String)

    public fun hostname(hostname: String)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean)

    public fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable)

    public fun instanceType(instanceType: String)

    public fun layerIds(layerIds: List<String>)

    public fun layerIds(vararg layerIds: String)

    public fun os(os: String)

    public fun rootDeviceType(rootDeviceType: String)

    public fun sshKeyName(sshKeyName: String)

    public fun stackId(stackId: String)

    public fun subnetId(subnetId: String)

    public fun tenancy(tenancy: String)

    public fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable)

    public fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78908fc3d57a2e5b331db7422ac4c6ad1a3ef857a2616c89131eb06385e3790d")
    public
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit)

    public fun virtualizationType(virtualizationType: String)

    public fun volumes(volumes: List<String>)

    public fun volumes(vararg volumes: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.opsworks.CfnInstanceProps.builder()

    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    override fun amiId(amiId: String) {
      cdkBuilder.amiId(amiId)
    }

    override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    override fun autoScalingType(autoScalingType: String) {
      cdkBuilder.autoScalingType(autoScalingType)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
    }

    override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      cdkBuilder.blockDeviceMappings(blockDeviceMappings)
    }

    override fun blockDeviceMappings(vararg blockDeviceMappings: Any): Unit =
        blockDeviceMappings(blockDeviceMappings.toList())

    override fun ebsOptimized(ebsOptimized: Boolean) {
      cdkBuilder.ebsOptimized(ebsOptimized)
    }

    override fun ebsOptimized(ebsOptimized: IResolvable) {
      cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
    }

    override fun elasticIps(elasticIps: List<String>) {
      cdkBuilder.elasticIps(elasticIps)
    }

    override fun elasticIps(vararg elasticIps: String): Unit = elasticIps(elasticIps.toList())

    override fun hostname(hostname: String) {
      cdkBuilder.hostname(hostname)
    }

    override fun installUpdatesOnBoot(installUpdatesOnBoot: Boolean) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot)
    }

    override fun installUpdatesOnBoot(installUpdatesOnBoot: IResolvable) {
      cdkBuilder.installUpdatesOnBoot(installUpdatesOnBoot.let(IResolvable::unwrap))
    }

    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    override fun layerIds(layerIds: List<String>) {
      cdkBuilder.layerIds(layerIds)
    }

    override fun layerIds(vararg layerIds: String): Unit = layerIds(layerIds.toList())

    override fun os(os: String) {
      cdkBuilder.os(os)
    }

    override fun rootDeviceType(rootDeviceType: String) {
      cdkBuilder.rootDeviceType(rootDeviceType)
    }

    override fun sshKeyName(sshKeyName: String) {
      cdkBuilder.sshKeyName(sshKeyName)
    }

    override fun stackId(stackId: String) {
      cdkBuilder.stackId(stackId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tenancy(tenancy: String) {
      cdkBuilder.tenancy(tenancy)
    }

    override fun timeBasedAutoScaling(timeBasedAutoScaling: IResolvable) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(IResolvable::unwrap))
    }

    override
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty) {
      cdkBuilder.timeBasedAutoScaling(timeBasedAutoScaling.let(CfnInstance.TimeBasedAutoScalingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("78908fc3d57a2e5b331db7422ac4c6ad1a3ef857a2616c89131eb06385e3790d")
    override
        fun timeBasedAutoScaling(timeBasedAutoScaling: CfnInstance.TimeBasedAutoScalingProperty.Builder.() -> Unit):
        Unit = timeBasedAutoScaling(CfnInstance.TimeBasedAutoScalingProperty(timeBasedAutoScaling))

    override fun virtualizationType(virtualizationType: String) {
      cdkBuilder.virtualizationType(virtualizationType)
    }

    override fun volumes(volumes: List<String>) {
      cdkBuilder.volumes(volumes)
    }

    override fun volumes(vararg volumes: String): Unit = volumes(volumes.toList())

    public fun build(): software.amazon.awscdk.services.opsworks.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opsworks.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    override fun agentVersion(): String? = unwrap(this).getAgentVersion()

    override fun amiId(): String? = unwrap(this).getAmiId()

    override fun architecture(): String? = unwrap(this).getArchitecture()

    override fun autoScalingType(): String? = unwrap(this).getAutoScalingType()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    override fun elasticIps(): List<String> = unwrap(this).getElasticIps() ?: emptyList()

    override fun hostname(): String? = unwrap(this).getHostname()

    override fun installUpdatesOnBoot(): Any? = unwrap(this).getInstallUpdatesOnBoot()

    override fun instanceType(): String = unwrap(this).getInstanceType()

    override fun layerIds(): List<String> = unwrap(this).getLayerIds()

    override fun os(): String? = unwrap(this).getOs()

    override fun rootDeviceType(): String? = unwrap(this).getRootDeviceType()

    override fun sshKeyName(): String? = unwrap(this).getSshKeyName()

    override fun stackId(): String = unwrap(this).getStackId()

    override fun subnetId(): String? = unwrap(this).getSubnetId()

    override fun tenancy(): String? = unwrap(this).getTenancy()

    override fun timeBasedAutoScaling(): Any? = unwrap(this).getTimeBasedAutoScaling()

    override fun virtualizationType(): String? = unwrap(this).getVirtualizationType()

    override fun volumes(): List<String> = unwrap(this).getVolumes() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.opsworks.CfnInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.opsworks.CfnInstanceProps
  }
}
