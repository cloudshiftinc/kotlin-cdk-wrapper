package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface MultiUserHostedRotationOptions : SingleUserHostedRotationOptions {
  public fun masterSecret(): ISecret

  public interface Builder {
    public fun excludeCharacters(excludeCharacters: String)

    public fun functionName(functionName: String)

    public fun masterSecret(masterSecret: ISecret)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1ae1c621d04a797ccbfc70901feca6527ba9979bd33b8d8bb20582c0a3a3afa")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions.Builder =
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions.builder()

    override fun excludeCharacters(excludeCharacters: String) {
      cdkBuilder.excludeCharacters(excludeCharacters)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun masterSecret(masterSecret: ISecret) {
      cdkBuilder.masterSecret(masterSecret.let(ISecret::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1ae1c621d04a797ccbfc70901feca6527ba9979bd33b8d8bb20582c0a3a3afa")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build():
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions,
  ) : MultiUserHostedRotationOptions {
    override fun excludeCharacters(): String? = unwrap(this).getExcludeCharacters()

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun masterSecret(): ISecret = unwrap(this).getMasterSecret().let(ISecret::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MultiUserHostedRotationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions):
        MultiUserHostedRotationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultiUserHostedRotationOptions):
        software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions = (wrapped as
        Wrapper).cdkObject
  }
}
