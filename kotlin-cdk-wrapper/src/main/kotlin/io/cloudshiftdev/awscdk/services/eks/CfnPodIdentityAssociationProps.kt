@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPodIdentityAssociationProps {
  public fun clusterName(): String

  public fun namespace(): String

  public fun roleArn(): String

  public fun serviceAccount(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clusterName(clusterName: String)

    public fun namespace(namespace: String)

    public fun roleArn(roleArn: String)

    public fun serviceAccount(serviceAccount: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps.Builder =
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps.builder()

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps,
  ) : CdkObject(cdkObject), CfnPodIdentityAssociationProps {
    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun namespace(): String = unwrap(this).getNamespace()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun serviceAccount(): String = unwrap(this).getServiceAccount()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPodIdentityAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps):
        CfnPodIdentityAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPodIdentityAssociationProps):
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps
  }
}
