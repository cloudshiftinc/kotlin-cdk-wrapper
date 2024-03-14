package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.services.ec2.InstanceType
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
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

  public interface Builder {
    public fun amiType(amiType: NodegroupAmiType) {
    }

    public fun capacityType(capacityType: CapacityType) {
    }

    public fun desiredSize(desiredSize: Number) {
    }

    public fun diskSize(diskSize: Number) {
    }

    public fun forceUpdate(forceUpdate: Boolean) {
    }

    public fun instanceTypes(instanceTypes: List<InstanceType>) {
    }

    public fun labels(labels: Map<String, String>) {
    }

    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit) {
    }

    public fun maxSize(maxSize: Number) {
    }

    public fun maxUnavailable(maxUnavailable: Number) {
    }

    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
    }

    public fun minSize(minSize: Number) {
    }

    public fun nodeRole(nodeRole: IRole) {
    }

    public fun nodegroupName(nodegroupName: String) {
    }

    public fun releaseVersion(releaseVersion: String) {
    }

    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit) {
    }

    public fun subnets(subnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun taints(taints: List<TaintSpec>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.NodegroupOptions.Builder =
        software.amazon.awscdk.services.eks.NodegroupOptions.builder()

    public override fun amiType(amiType: NodegroupAmiType) {
      cdkBuilder.amiType(amiType.let(NodegroupAmiType::unwrap))
    }

    public override fun capacityType(capacityType: CapacityType) {
      cdkBuilder.capacityType(capacityType.let(CapacityType::unwrap))
    }

    public override fun desiredSize(desiredSize: Number) {
      cdkBuilder.desiredSize(desiredSize)
    }

    public override fun diskSize(diskSize: Number) {
      cdkBuilder.diskSize(diskSize)
    }

    public override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    public override fun instanceTypes(instanceTypes: List<InstanceType>) {
      cdkBuilder.instanceTypes(instanceTypes.map(InstanceType::unwrap))
    }

    public override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    public override fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec) {
      cdkBuilder.launchTemplateSpec(launchTemplateSpec.let(LaunchTemplateSpec::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0e8b2f2dc3405f67a3cd7b21e4833e4e2c73a9564c2179aeab53d1807472b1f")
    public override
        fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit): Unit =
        launchTemplateSpec(LaunchTemplateSpec(launchTemplateSpec))

    public override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    public override fun maxUnavailable(maxUnavailable: Number) {
      cdkBuilder.maxUnavailable(maxUnavailable)
    }

    public override fun maxUnavailablePercentage(maxUnavailablePercentage: Number) {
      cdkBuilder.maxUnavailablePercentage(maxUnavailablePercentage)
    }

    public override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    public override fun nodeRole(nodeRole: IRole) {
      cdkBuilder.nodeRole(nodeRole.let(IRole::unwrap))
    }

    public override fun nodegroupName(nodegroupName: String) {
      cdkBuilder.nodegroupName(nodegroupName)
    }

    public override fun releaseVersion(releaseVersion: String) {
      cdkBuilder.releaseVersion(releaseVersion)
    }

    public override fun remoteAccess(remoteAccess: NodegroupRemoteAccess) {
      cdkBuilder.remoteAccess(remoteAccess.let(NodegroupRemoteAccess::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aab14c8127f28641dca0351541b634eaa4cefe76d2a52b4211aee6cf249310f0")
    public override fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit): Unit =
        remoteAccess(NodegroupRemoteAccess(remoteAccess))

    public override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad32f602f50066d331d71a96a83719c01828628afe15012a768997ca8fc9f6ae")
    public override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun taints(taints: List<TaintSpec>) {
      cdkBuilder.taints(taints.map(TaintSpec::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.NodegroupOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions,
  ) : NodegroupOptions {
    public override fun amiType(): NodegroupAmiType? =
        unwrap(this).getAmiType()?.let(NodegroupAmiType::wrap)

    public override fun capacityType(): CapacityType? =
        unwrap(this).getCapacityType()?.let(CapacityType::wrap)

    public override fun desiredSize(): Number? = unwrap(this).getDesiredSize()

    public override fun diskSize(): Number? = unwrap(this).getDiskSize()

    public override fun forceUpdate(): Boolean? = unwrap(this).getForceUpdate()

    public override fun instanceTypes(): List<InstanceType> =
        unwrap(this).getInstanceTypes()?.map(InstanceType::wrap) ?: emptyList()

    public override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    public override fun launchTemplateSpec(): LaunchTemplateSpec? =
        unwrap(this).getLaunchTemplateSpec()?.let(LaunchTemplateSpec::wrap)

    public override fun maxSize(): Number? = unwrap(this).getMaxSize()

    public override fun maxUnavailable(): Number? = unwrap(this).getMaxUnavailable()

    public override fun maxUnavailablePercentage(): Number? =
        unwrap(this).getMaxUnavailablePercentage()

    public override fun minSize(): Number? = unwrap(this).getMinSize()

    public override fun nodeRole(): IRole? = unwrap(this).getNodeRole()?.let(IRole::wrap)

    public override fun nodegroupName(): String? = unwrap(this).getNodegroupName()

    public override fun releaseVersion(): String? = unwrap(this).getReleaseVersion()

    public override fun remoteAccess(): NodegroupRemoteAccess? =
        unwrap(this).getRemoteAccess()?.let(NodegroupRemoteAccess::wrap)

    public override fun subnets(): SubnetSelection? =
        unwrap(this).getSubnets()?.let(SubnetSelection::wrap)

    public override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    public override fun taints(): List<TaintSpec> = unwrap(this).getTaints()?.map(TaintSpec::wrap)
        ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NodegroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.NodegroupOptions):
        NodegroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NodegroupOptions):
        software.amazon.awscdk.services.eks.NodegroupOptions = (wrapped as Wrapper).cdkObject
  }
}
