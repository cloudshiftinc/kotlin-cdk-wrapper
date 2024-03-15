@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface FargateProfileProps : FargateProfileOptions {
  public fun cluster(): Cluster

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: Cluster)

    public fun fargateProfileName(fargateProfileName: String)

    public fun podExecutionRole(podExecutionRole: IRole)

    public fun selectors(selectors: List<Selector>)

    public fun selectors(vararg selectors: Selector)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a997a48a3638c6ff919a08dcc1c5b303d38fa9a7324399264409bcfc62ce5ac")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfileProps.Builder =
        software.amazon.awscdk.services.eks.FargateProfileProps.builder()

    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    override fun podExecutionRole(podExecutionRole: IRole) {
      cdkBuilder.podExecutionRole(podExecutionRole.let(IRole::unwrap))
    }

    override fun selectors(selectors: List<Selector>) {
      cdkBuilder.selectors(selectors.map(Selector::unwrap))
    }

    override fun selectors(vararg selectors: Selector): Unit = selectors(selectors.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a997a48a3638c6ff919a08dcc1c5b303d38fa9a7324399264409bcfc62ce5ac")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateProfileProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.FargateProfileProps,
  ) : CdkObject(cdkObject), FargateProfileProps {
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)

    override fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

    override fun podExecutionRole(): IRole? = unwrap(this).getPodExecutionRole()?.let(IRole::wrap)

    override fun selectors(): List<Selector> = unwrap(this).getSelectors().map(Selector::wrap)

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfileProps):
        FargateProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateProfileProps):
        software.amazon.awscdk.services.eks.FargateProfileProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.FargateProfileProps
  }
}
