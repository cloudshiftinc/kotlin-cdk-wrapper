@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnFargateProfileProps {
  public fun clusterName(): String

  public fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  public fun podExecutionRoleArn(): String

  public fun selectors(): Any

  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clusterName(clusterName: String)

    public fun fargateProfileName(fargateProfileName: String)

    public fun podExecutionRoleArn(podExecutionRoleArn: String)

    public fun selectors(selectors: IResolvable)

    public fun selectors(selectors: List<Any>)

    public fun selectors(vararg selectors: Any)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnFargateProfileProps.Builder =
        software.amazon.awscdk.services.eks.CfnFargateProfileProps.builder()

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    override fun podExecutionRoleArn(podExecutionRoleArn: String) {
      cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
    }

    override fun selectors(selectors: IResolvable) {
      cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
    }

    override fun selectors(selectors: List<Any>) {
      cdkBuilder.selectors(selectors)
    }

    override fun selectors(vararg selectors: Any): Unit = selectors(selectors.toList())

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfileProps,
  ) : CdkObject(cdkObject), CfnFargateProfileProps {
    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

    override fun podExecutionRoleArn(): String = unwrap(this).getPodExecutionRoleArn()

    override fun selectors(): Any = unwrap(this).getSelectors()

    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFargateProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfileProps):
        CfnFargateProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFargateProfileProps):
        software.amazon.awscdk.services.eks.CfnFargateProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnFargateProfileProps
  }
}
