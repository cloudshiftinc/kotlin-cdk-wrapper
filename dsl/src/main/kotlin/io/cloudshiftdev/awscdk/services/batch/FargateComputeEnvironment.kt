package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateComputeEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.FargateComputeEnvironment,
) : Resource(cdkObject), IFargateComputeEnvironment, IManagedComputeEnvironment, IComputeEnvironment
    {
  public override fun computeEnvironmentArn(): String = unwrap(this).getComputeEnvironmentArn()

  public override fun computeEnvironmentName(): String = unwrap(this).getComputeEnvironmentName()

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun enabled(): Boolean = unwrap(this).getEnabled()

  public override fun maxvCpus(): Number = unwrap(this).getMaxvCpus()

  public override fun replaceComputeEnvironment(): Boolean? =
      unwrap(this).getReplaceComputeEnvironment()

  public override fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)

  public override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)

  public override fun spot(): Boolean? = unwrap(this).getSpot()

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public override fun terminateOnUpdate(): Boolean? = unwrap(this).getTerminateOnUpdate()

  public override fun updateTimeout(): Duration? =
      unwrap(this).getUpdateTimeout()?.let(Duration::wrap)

  public override fun updateToLatestImageVersion(): Boolean? =
      unwrap(this).getUpdateToLatestImageVersion()

  public interface Builder {
    public fun computeEnvironmentName(computeEnvironmentName: String)

    public fun enabled(enabled: Boolean)

    public fun maxvCpus(maxvCpus: Number)

    public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun serviceRole(serviceRole: IRole)

    public fun spot(spot: Boolean)

    public fun terminateOnUpdate(terminateOnUpdate: Boolean)

    public fun updateTimeout(updateTimeout: Duration)

    public fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94c272473fb16c36eda9db12bc80246d124b20b018b8bca84d7c02eaa75f53fa")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.FargateComputeEnvironment.Builder
        = software.amazon.awscdk.services.batch.FargateComputeEnvironment.Builder.create(scope, id)

    override fun computeEnvironmentName(computeEnvironmentName: String) {
      cdkBuilder.computeEnvironmentName(computeEnvironmentName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun maxvCpus(maxvCpus: Number) {
      cdkBuilder.maxvCpus(maxvCpus)
    }

    override fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
      cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    override fun spot(spot: Boolean) {
      cdkBuilder.spot(spot)
    }

    override fun terminateOnUpdate(terminateOnUpdate: Boolean) {
      cdkBuilder.terminateOnUpdate(terminateOnUpdate)
    }

    override fun updateTimeout(updateTimeout: Duration) {
      cdkBuilder.updateTimeout(updateTimeout.let(Duration::unwrap))
    }

    override fun updateToLatestImageVersion(updateToLatestImageVersion: Boolean) {
      cdkBuilder.updateToLatestImageVersion(updateToLatestImageVersion)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94c272473fb16c36eda9db12bc80246d124b20b018b8bca84d7c02eaa75f53fa")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.batch.FargateComputeEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromFargateComputeEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      fargateComputeEnvironmentArn: String,
    ): IFargateComputeEnvironment =
        software.amazon.awscdk.services.batch.FargateComputeEnvironment.fromFargateComputeEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, fargateComputeEnvironmentArn).let(IFargateComputeEnvironment::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateComputeEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateComputeEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.FargateComputeEnvironment):
        FargateComputeEnvironment = FargateComputeEnvironment(cdkObject)

    internal fun unwrap(wrapped: FargateComputeEnvironment):
        software.amazon.awscdk.services.batch.FargateComputeEnvironment = wrapped.cdkObject
  }
}
