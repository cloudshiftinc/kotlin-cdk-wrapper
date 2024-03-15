@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

public interface ConfigureNatOptions {
  public fun natSubnets(): List<PublicSubnet>

  public fun privateSubnets(): List<PrivateSubnet>

  public fun vpc(): Vpc

  @CdkDslMarker
  public interface Builder {
    public fun natSubnets(natSubnets: List<PublicSubnet>)

    public fun natSubnets(vararg natSubnets: PublicSubnet)

    public fun privateSubnets(privateSubnets: List<PrivateSubnet>)

    public fun privateSubnets(vararg privateSubnets: PrivateSubnet)

    public fun vpc(vpc: Vpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConfigureNatOptions.Builder =
        software.amazon.awscdk.services.ec2.ConfigureNatOptions.builder()

    override fun natSubnets(natSubnets: List<PublicSubnet>) {
      cdkBuilder.natSubnets(natSubnets.map(PublicSubnet::unwrap))
    }

    override fun natSubnets(vararg natSubnets: PublicSubnet): Unit = natSubnets(natSubnets.toList())

    override fun privateSubnets(privateSubnets: List<PrivateSubnet>) {
      cdkBuilder.privateSubnets(privateSubnets.map(PrivateSubnet::unwrap))
    }

    override fun privateSubnets(vararg privateSubnets: PrivateSubnet): Unit =
        privateSubnets(privateSubnets.toList())

    override fun vpc(vpc: Vpc) {
      cdkBuilder.vpc(vpc.let(Vpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConfigureNatOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConfigureNatOptions,
  ) : CdkObject(cdkObject), ConfigureNatOptions {
    override fun natSubnets(): List<PublicSubnet> =
        unwrap(this).getNatSubnets().map(PublicSubnet::wrap)

    override fun privateSubnets(): List<PrivateSubnet> =
        unwrap(this).getPrivateSubnets().map(PrivateSubnet::wrap)

    override fun vpc(): Vpc = unwrap(this).getVpc().let(Vpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigureNatOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConfigureNatOptions):
        ConfigureNatOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigureNatOptions):
        software.amazon.awscdk.services.ec2.ConfigureNatOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ConfigureNatOptions
  }
}
