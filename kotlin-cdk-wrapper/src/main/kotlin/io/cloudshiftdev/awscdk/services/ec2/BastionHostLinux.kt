@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BastionHostLinux internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinux,
) : Resource(cdkObject), IInstance {
  public open fun allowSshAccessFrom(peer: IPeer) {
    unwrap(this).allowSshAccessFrom(peer.let(IPeer::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun instance(): Instance = unwrap(this).getInstance().let(Instance::wrap)

  public override fun instanceAvailabilityZone(): String =
      unwrap(this).getInstanceAvailabilityZone()

  public override fun instanceId(): String = unwrap(this).getInstanceId()

  public override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

  public override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

  public override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

  public override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun blockDevices(blockDevices: List<BlockDevice>)

    public fun blockDevices(vararg blockDevices: BlockDevice)

    public fun `init`(`init`: CloudFormationInit)

    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfaa4840168db92b778ecaf120f203401115dc4ca25675e0793d5ff81c02d457")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    public fun instanceName(instanceName: String)

    public fun instanceType(instanceType: InstanceType)

    public fun machineImage(machineImage: IMachineImage)

    public fun requireImdsv2(requireImdsv2: Boolean)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de651b213989ca3417ce5fee09a5e0ac582b2776767ef5cf9eb1f14f8e6656df")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.BastionHostLinux.Builder =
        software.amazon.awscdk.services.ec2.BastionHostLinux.Builder.create(scope, id)

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    override fun blockDevices(vararg blockDevices: BlockDevice): Unit =
        blockDevices(blockDevices.toList())

    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfaa4840168db92b778ecaf120f203401115dc4ca25675e0793d5ff81c02d457")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de651b213989ca3417ce5fee09a5e0ac582b2776767ef5cf9eb1f14f8e6656df")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.BastionHostLinux = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BastionHostLinux {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BastionHostLinux(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.BastionHostLinux):
        BastionHostLinux = BastionHostLinux(cdkObject)

    internal fun unwrap(wrapped: BastionHostLinux):
        software.amazon.awscdk.services.ec2.BastionHostLinux = wrapped.cdkObject
  }
}
