package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Resource
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Nodegroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.Nodegroup,
) : Resource(cdkObject), INodegroup {
  public open fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

  public open fun nodegroupArn(): String = unwrap(this).getNodegroupArn()

  public override fun nodegroupName(): String = unwrap(this).getNodegroupName()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public interface Builder {
    public fun amiType(amiType: NodegroupAmiType)

    public fun capacityType(capacityType: CapacityType)

    public fun cluster(cluster: ICluster)

    public fun desiredSize(desiredSize: Number)

    public fun diskSize(diskSize: Number)

    public fun forceUpdate(forceUpdate: Boolean)

    public fun instanceTypes(instanceTypes: List<InstanceType>)

    public fun instanceTypes(vararg instanceTypes: InstanceType)

    public fun labels(labels: Map<String, String>)

    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0ec2cad0e3c6afad5c35a57c03ad8c913e1b9d45c4576f36573c8ebe96750c8")
    public fun launchTemplateSpec(launchTemplateSpec: LaunchTemplateSpec.Builder.() -> Unit)

    public fun maxSize(maxSize: Number)

    public fun maxUnavailable(maxUnavailable: Number)

    public fun maxUnavailablePercentage(maxUnavailablePercentage: Number)

    public fun minSize(minSize: Number)

    public fun nodeRole(nodeRole: IRole)

    public fun nodegroupName(nodegroupName: String)

    public fun releaseVersion(releaseVersion: String)

    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fb4f88e636c401edf3e068059f986ebb822a79750c7e3a8a8bb1459c8850cf6")
    public fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit)

    public fun subnets(subnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dd50ca0a4c271de17cdedae426d1298163fbde3c4bbfbaa5ac37016c336f894")
    public fun subnets(subnets: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)

    public fun taints(taints: List<TaintSpec>)

    public fun taints(vararg taints: TaintSpec)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.Nodegroup.Builder =
        software.amazon.awscdk.services.eks.Nodegroup.Builder.create(scope, id)

    override fun amiType(amiType: NodegroupAmiType) {
      cdkBuilder.amiType(amiType.let(NodegroupAmiType::unwrap))
    }

    override fun capacityType(capacityType: CapacityType) {
      cdkBuilder.capacityType(capacityType.let(CapacityType::unwrap))
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0ec2cad0e3c6afad5c35a57c03ad8c913e1b9d45c4576f36573c8ebe96750c8")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fb4f88e636c401edf3e068059f986ebb822a79750c7e3a8a8bb1459c8850cf6")
    override fun remoteAccess(remoteAccess: NodegroupRemoteAccess.Builder.() -> Unit): Unit =
        remoteAccess(NodegroupRemoteAccess(remoteAccess))

    override fun subnets(subnets: SubnetSelection) {
      cdkBuilder.subnets(subnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0dd50ca0a4c271de17cdedae426d1298163fbde3c4bbfbaa5ac37016c336f894")
    override fun subnets(subnets: SubnetSelection.Builder.() -> Unit): Unit =
        subnets(SubnetSelection(subnets))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun taints(taints: List<TaintSpec>) {
      cdkBuilder.taints(taints.map(TaintSpec::unwrap))
    }

    override fun taints(vararg taints: TaintSpec): Unit = taints(taints.toList())

    public fun build(): software.amazon.awscdk.services.eks.Nodegroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromNodegroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      nodegroupName: String,
    ): INodegroup =
        software.amazon.awscdk.services.eks.Nodegroup.fromNodegroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, nodegroupName).let(INodegroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Nodegroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Nodegroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.Nodegroup): Nodegroup =
        Nodegroup(cdkObject)

    internal fun unwrap(wrapped: Nodegroup): software.amazon.awscdk.services.eks.Nodegroup =
        wrapped.cdkObject
  }
}
