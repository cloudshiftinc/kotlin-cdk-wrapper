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

public interface RotationSingleUserOptions : CommonRotationUserOptions {
  public interface Builder {
    public fun automaticallyAfter(automaticallyAfter: Duration) {
    }

    public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
    }

    public fun excludeCharacters(excludeCharacters: String) {
    }

    public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd2def911b9aed93a1e59cd507f1e8114b8874c8959efdc3be508bd3cfd17b1")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.RotationSingleUserOptions.Builder =
        software.amazon.awscdk.services.rds.RotationSingleUserOptions.builder()

    public override fun automaticallyAfter(automaticallyAfter: Duration) {
      cdkBuilder.automaticallyAfter(automaticallyAfter.let(Duration::unwrap))
    }

    public override fun endpoint(endpoint: IInterfaceVpcEndpoint) {
      cdkBuilder.endpoint(endpoint.let(IInterfaceVpcEndpoint::unwrap))
    }

    public override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public override fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
      cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bd2def911b9aed93a1e59cd507f1e8114b8874c8959efdc3be508bd3cfd17b1")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.rds.RotationSingleUserOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.RotationSingleUserOptions,
  ) : RotationSingleUserOptions {
    public override fun automaticallyAfter(): Duration? =
        unwrap(this).getAutomaticallyAfter()?.let(Duration::wrap)

    public override fun endpoint(): IInterfaceVpcEndpoint? =
        unwrap(this).getEndpoint()?.let(IInterfaceVpcEndpoint::wrap)

    public override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public override fun rotateImmediatelyOnUpdate(): Boolean? =
        unwrap(this).getRotateImmediatelyOnUpdate()

    public override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    public override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RotationSingleUserOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.RotationSingleUserOptions):
        RotationSingleUserOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RotationSingleUserOptions):
        software.amazon.awscdk.services.rds.RotationSingleUserOptions = (wrapped as
        Wrapper).cdkObject
  }
}
