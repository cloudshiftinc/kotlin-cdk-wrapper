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

public interface FargateProfileOptions {
  public fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  public fun podExecutionRole(): IRole? = unwrap(this).getPodExecutionRole()?.let(IRole::wrap)

  public fun selectors(): List<Selector>

  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun fargateProfileName(fargateProfileName: String)

    public fun podExecutionRole(podExecutionRole: IRole)

    public fun selectors(selectors: List<Selector>)

    public fun selectors(vararg selectors: Selector)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db16441754435e26f78724e7bd2f2f0fd32b678b39e2d709a60c4eaba05aa400")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfileOptions.Builder =
        software.amazon.awscdk.services.eks.FargateProfileOptions.builder()

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
    @JvmName("db16441754435e26f78724e7bd2f2f0fd32b678b39e2d709a60c4eaba05aa400")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateProfileOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.FargateProfileOptions,
  ) : CdkObject(cdkObject), FargateProfileOptions {
    override fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

    override fun podExecutionRole(): IRole? = unwrap(this).getPodExecutionRole()?.let(IRole::wrap)

    override fun selectors(): List<Selector> = unwrap(this).getSelectors().map(Selector::wrap)

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FargateProfileOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfileOptions):
        FargateProfileOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FargateProfileOptions):
        software.amazon.awscdk.services.eks.FargateProfileOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.FargateProfileOptions
  }
}
