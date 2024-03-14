package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FargateProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.FargateProfile,
) : CloudshiftdevConstructsConstruct(cdkObject), ITaggable {
  public open fun fargateProfileArn(): String = unwrap(this).getFargateProfileArn()

  public open fun fargateProfileName(): String = unwrap(this).getFargateProfileName()

  public open fun podExecutionRole(): IRole = unwrap(this).getPodExecutionRole().let(IRole::wrap)

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public interface Builder {
    public fun cluster(cluster: Cluster) {
    }

    public fun fargateProfileName(fargateProfileName: String) {
    }

    public fun podExecutionRole(podExecutionRole: IRole) {
    }

    public fun selectors(selectors: List<Selector>) {
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("964b86d8391ae05d92196e9d2077e0c2bc9560ddb541e530f5cf186af05d4cae")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.FargateProfile.Builder =
        software.amazon.awscdk.services.eks.FargateProfile.Builder.create(scope, id)

    public override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    public override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    public override fun podExecutionRole(podExecutionRole: IRole) {
      cdkBuilder.podExecutionRole(podExecutionRole.let(IRole::unwrap))
    }

    public override fun selectors(selectors: List<Selector>) {
      cdkBuilder.selectors(selectors.map(Selector::unwrap))
    }

    public override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("964b86d8391ae05d92196e9d2077e0c2bc9560ddb541e530f5cf186af05d4cae")
    public override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.FargateProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FargateProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FargateProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.FargateProfile): FargateProfile
        = FargateProfile(cdkObject)

    internal fun unwrap(wrapped: FargateProfile): software.amazon.awscdk.services.eks.FargateProfile
        = wrapped.cdkObject
  }
}
