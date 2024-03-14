package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface SingleUserHostedRotationOptions {
  public fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

  public interface Builder {
    public fun excludeCharacters(excludeCharacters: String) {
    }

    public fun functionName(functionName: String) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8fc7793735ffad2acca3bfa30c4bf13619d228febd80f66d9d2a5c0c2b8232e")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions.builder()

    public override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8fc7793735ffad2acca3bfa30c4bf13619d228febd80f66d9d2a5c0c2b8232e")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions,
  ) : SingleUserHostedRotationOptions {
    public override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    public override fun functionName(): String? = unwrap(this).getFunctionName()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    public override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    public override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SingleUserHostedRotationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions):
        SingleUserHostedRotationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SingleUserHostedRotationOptions):
        software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
