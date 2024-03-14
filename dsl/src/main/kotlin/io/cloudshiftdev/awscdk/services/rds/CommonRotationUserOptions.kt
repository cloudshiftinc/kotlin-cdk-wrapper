package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IInterfaceVpcEndpoint
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CommonRotationUserOptions {
  public fun automaticallyAfter(): Duration? =
      unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

  public fun endpoint(): IInterfaceVpcEndpoint? =
      unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration)

    public fun endpoint(endpoint: IInterfaceVpcEndpoint)

    public fun excludeCharacters(excludeCharacters: String)

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b200c3d785e2d1316710b34f4ad38b694f599a3aadc2577bfeb61652e2e267b")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CommonRotationUserOptions.Builder =
        software.amazon.awscdk.services.rds.CommonRotationUserOptions.builder()

    override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b200c3d785e2d1316710b34f4ad38b694f599a3aadc2577bfeb61652e2e267b")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.CommonRotationUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.CommonRotationUserOptions,
  ) : CommonRotationUserOptions {
    override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    override fun endpoint(): IInterfaceVpcEndpoint? =
        unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun rotateImmediatelyOnUpdate(): Boolean? = unwrap(this).getRotateImmediatelyOnUpdate()

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CommonRotationUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CommonRotationUserOptions):
        CommonRotationUserOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonRotationUserOptions):
        software.amazon.awscdk.services.rds.CommonRotationUserOptions = (wrapped as
        Wrapper).cdkObject
  }
}
