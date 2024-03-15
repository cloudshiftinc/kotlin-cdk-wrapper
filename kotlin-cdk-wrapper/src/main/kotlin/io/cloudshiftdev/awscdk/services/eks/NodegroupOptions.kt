@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface NodegroupOptions {
  public fun amiType(): NodegroupAmiType? = unwrap(this).getAmiType()?.let(NodegroupAmiType::wrap)

  public fun capacityType(): CapacityType? = unwrap(this).getCapacityType()?.let(CapacityType::wrap)

  public fun desiredSize(): Number? = unwrap(this).getDesiredSize()

  public fun diskSize(): Number? = unwrap(this).getDiskSize()

  public fun forceUpdate(): Boolean? = unwrap(this).getForceUpdate()

  public fun instanceTypes(): List<InstanceType> =
      unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  public fun launchTemplateSpec(): LaunchTemplateSpec? =
      unwrap(this).getLaunchTemplateSpec()?.let(LaunchTemplateSpec::wrap)

  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  public fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

  public fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun nodeRole(): IRole? = unwrap(this).getNodeRole()?.let(IRole::wrap)

  public fun nodegroupName(): String? = unwrap(this).getNodegroupName()

  public fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

  public fun remoteAccess(): NodegroupRemoteAccess? =
      unwrap(this).getRemoteAccess()?.let(NodegroupRemoteAccess::wrap)

  public fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun taints(): List<TaintSpec> = unwrap(this).getTaints()?.map(TaintSpec::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun amiType(amiType: NodegroupAmiType)

    public fun capacityType(capacityType: CapacityType)

    public fun desiredSize(desiredSize: Number)

    public fun diskSize(diskSize: Number)

    public fun forceUpdate(forceUpdate: Boolean)

    public fun instanceTypes(instanceTypes: List<InstanceType>)

    public fun instanceTypes(vararg instanceTypes: InstanceType)

    public fun labels(labels: Map<String, String>)

    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit)

    public fun maxSize(maxSize: Number)

    public fun maxUnavailable(maxUnavailable: Number)

    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)

    public fun minSize(minSize: Number)

    public fun nodeRole(nodeRole: IRole)

    public fun nodegroupName(nodegroupName: String)

    public fun releaseVersion(releaseVersion: String)

    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit)

    public fun subnets(subnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)

    public fun taints(taints: List<TaintSpec>)

    public fun taints(vararg taints: TaintSpec)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupOptions.Builder =
        software.amazon.awscdk.services.eks.NodegroupOptions.builder()

    override fun amiType(amiType: NodegroupAmiType) {
      cdkBuilder.amiType(amiType.let(NodegroupAmiType::unwrap))
    }

    override fun capacityType(capacityType: CapacityType) {
      cdkBuilder.capacityType(capacityType.let(CapacityType::unwrap))
    }

    override fun desiredSize(desiredSize: Number) {
      cdkBuilder.desiredSize(desiredSize)
    }

    override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    override fun instanceTypes(vararg instanceTypes: InstanceType): Unit =
        instanceTypes(instanceTypes.toList())

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
      cdkBuilder.launchTemplateSpec(launchTemplateSpec.let(LaunchTemplateSpec::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit): Unit
        = launchTemplateSpec(LaunchTemplateSpec(launchTemplateSpec))

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun maxUnavailable(maxUnavailable: Number) {
      cdkBuilder.maxUnavailable(maxUnavailable)
    }

    override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
      cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun nodeRole(nodeRole: IRole) {
      cdkBuilder.nodeRole(nodeRole.let(IRole::unwrap))
    }

    override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
      cdkBuilder.remoteAccess(remoteAccess.let(NodegroupRemoteAccess::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit): Unit =
        remoteAccess(NodegroupRemoteAccess(remoteAccess))

    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taints(taints: List<TaintSpec>) {
      cdkBuilder.taints(taints.map(TaintSpec::unwrap))
    }

    override fun taints(vararg taints: TaintSpec): Unit = taints(taints.toList())

    public fun build(): software.amazon.awscdk.services.eks.NodegroupOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions,
  ) : CdkObject(cdkObject), NodegroupOptions {
    override fun amiType(): NodegroupAmiType? =
        unwrap(this).getAmiType()?.let(NodegroupAmiType::wrap)

    override fun capacityType(): CapacityType? =
        unwrap(this).getCapacityType()?.let(CapacityType::wrap)

    override fun desiredSize(): Number? = unwrap(this).getDesiredSize()

    override fun diskSize(): Number? = unwrap(this).getDiskSize()

    override fun forceUpdate(): Boolean? = unwrap(this).getForceUpdate()

    override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    override fun launchTemplateSpec(): LaunchTemplateSpec? =
        unwrap(this).getLaunchTemplateSpec()?.let(LaunchTemplateSpec::wrap)

    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    override fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

    override fun maxUnavailablePercentage(): Number? = unwrap(this).getMaxUnavailablePercentage()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun nodeRole(): IRole? = unwrap(this).getNodeRole()?.let(IRole::wrap)

    override fun nodegroupName(): String? = unwrap(this).getNodegroupName()

    override fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

    override fun remoteAccess(): NodegroupRemoteAccess? =
        unwrap(this).getRemoteAccess()?.let(NodegroupRemoteAccess::wrap)

    override fun subnets(): SubnetSelection? = unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun taints(): List<TaintSpec> = unwrap(this).getTaints()?.map(TaintSpec::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions):
        NodegroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupOptions):
        software.amazon.awscdk.services.eks.NodegroupOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.NodegroupOptions
  }
}
