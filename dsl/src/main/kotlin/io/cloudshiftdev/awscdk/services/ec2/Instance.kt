package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Instance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.Instance,
) : Resource(cdkObject), IInstance {
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup::unwrap))
  }

  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public open fun addUserData(commands: String) {
    unwrap(this).addUserData(commands)
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public open fun instance(): CfnInstance = unwrap(this).getInstance().let(CfnInstance::wrap)

  public override fun instanceAvailabilityZone(): String =
      unwrap(this).getInstanceAvailabilityZone()

  public override fun instanceId(): String = unwrap(this).getInstanceId()

  public override fun instancePrivateDnsName(): String = unwrap(this).getInstancePrivateDnsName()

  public override fun instancePrivateIp(): String = unwrap(this).getInstancePrivateIp()

  public override fun instancePublicDnsName(): String = unwrap(this).getInstancePublicDnsName()

  public override fun instancePublicIp(): String = unwrap(this).getInstancePublicIp()

  public open fun osType(): OperatingSystemType =
      unwrap(this).getOsType().let(OperatingSystemType::wrap)

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public open fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)

  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun associatePublicIpAddress(associatePublicIpAddress: Boolean)

    public fun availabilityZone(availabilityZone: String)

    public fun blockDevices(blockDevices: List<BlockDevice>)

    public fun creditSpecification(creditSpecification: CpuCredits)

    public fun detailedMonitoring(detailedMonitoring: Boolean)

    public fun `init`(`init`: CloudFormationInit)

    public fun initOptions(initOptions: ApplyCloudFormationInitOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1255c73a191e21ad38f2985417965411599e1b4b9be46e0f44bce9e8798ce1a1")
    public fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit)

    public fun instanceName(instanceName: String)

    public fun instanceType(instanceType: InstanceType)

    @Deprecated(message = "deprecated in CDK")
    public fun keyName(keyName: String)

    public fun keyPair(keyPair: IKeyPair)

    public fun machineImage(machineImage: IMachineImage)

    public fun privateIpAddress(privateIpAddress: String)

    public fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean)

    public fun requireImdsv2(requireImdsv2: Boolean)

    public fun resourceSignalTimeout(resourceSignalTimeout: Duration)

    public fun role(role: IRole)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun sourceDestCheck(sourceDestCheck: Boolean)

    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean)

    public fun userData(userData: UserData)

    public fun userDataCausesReplacement(userDataCausesReplacement: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ebf73c6a85a04ee97a84a646dbed1afef0b5d139bc3ae031c9518f7941be4e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Instance.Builder =
        software.amazon.awscdk.services.ec2.Instance.Builder.create(scope, id)

    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun associatePublicIpAddress(associatePublicIpAddress: Boolean) {
      cdkBuilder.associatePublicIpAddress(associatePublicIpAddress)
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun blockDevices(blockDevices: List<BlockDevice>) {
      cdkBuilder.blockDevices(blockDevices.map(BlockDevice::unwrap))
    }

    override fun creditSpecification(creditSpecification: CpuCredits) {
      cdkBuilder.creditSpecification(creditSpecification.let(CpuCredits::unwrap))
    }

    override fun detailedMonitoring(detailedMonitoring: Boolean) {
      cdkBuilder.detailedMonitoring(detailedMonitoring)
    }

    override fun `init`(`init`: CloudFormationInit) {
      cdkBuilder.`init`(`init`.let(CloudFormationInit::unwrap))
    }

    override fun initOptions(initOptions: ApplyCloudFormationInitOptions) {
      cdkBuilder.initOptions(initOptions.let(ApplyCloudFormationInitOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1255c73a191e21ad38f2985417965411599e1b4b9be46e0f44bce9e8798ce1a1")
    override fun initOptions(initOptions: ApplyCloudFormationInitOptions.Builder.() -> Unit): Unit =
        initOptions(ApplyCloudFormationInitOptions(initOptions))

    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    override fun instanceType(instanceType: InstanceType) {
      cdkBuilder.instanceType(instanceType.let(InstanceType::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun keyPair(keyPair: IKeyPair) {
      cdkBuilder.keyPair(keyPair.let(IKeyPair::unwrap))
    }

    override fun machineImage(machineImage: IMachineImage) {
      cdkBuilder.machineImage(machineImage.let(IMachineImage::unwrap))
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation: Boolean) {
      cdkBuilder.propagateTagsToVolumeOnCreation(propagateTagsToVolumeOnCreation)
    }

    override fun requireImdsv2(requireImdsv2: Boolean) {
      cdkBuilder.requireImdsv2(requireImdsv2)
    }

    override fun resourceSignalTimeout(resourceSignalTimeout: Duration) {
      cdkBuilder.resourceSignalTimeout(resourceSignalTimeout.let(Duration::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun sourceDestCheck(sourceDestCheck: Boolean) {
      cdkBuilder.sourceDestCheck(sourceDestCheck)
    }

    override fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
      cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun userDataCausesReplacement(userDataCausesReplacement: Boolean) {
      cdkBuilder.userDataCausesReplacement(userDataCausesReplacement)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8ebf73c6a85a04ee97a84a646dbed1afef0b5d139bc3ae031c9518f7941be4e")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.Instance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Instance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Instance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Instance): Instance =
        Instance(cdkObject)

    internal fun unwrap(wrapped: Instance): software.amazon.awscdk.services.ec2.Instance =
        wrapped.cdkObject
  }
}
