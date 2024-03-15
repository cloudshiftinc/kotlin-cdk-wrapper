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

public interface CfnAccessEntryProps {
  public fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  public fun clusterName(): String

  public fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?: emptyList()

  public fun principalArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  public fun username(): String? = unwrap(this).getUsername()

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicies(accessPolicies: IResolvable)

    public fun accessPolicies(accessPolicies: List<Any>)

    public fun accessPolicies(vararg accessPolicies: Any)

    public fun clusterName(clusterName: String)

    public fun kubernetesGroups(kubernetesGroups: List<String>)

    public fun kubernetesGroups(vararg kubernetesGroups: String)

    public fun principalArn(principalArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAccessEntryProps.Builder =
        software.amazon.awscdk.services.eks.CfnAccessEntryProps.builder()

    override fun accessPolicies(accessPolicies: IResolvable) {
      cdkBuilder.accessPolicies(accessPolicies.let(IResolvable::unwrap))
    }

    override fun accessPolicies(accessPolicies: List<Any>) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    override fun accessPolicies(vararg accessPolicies: Any): Unit =
        accessPolicies(accessPolicies.toList())

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun kubernetesGroups(kubernetesGroups: List<String>) {
      cdkBuilder.kubernetesGroups(kubernetesGroups)
    }

    override fun kubernetesGroups(vararg kubernetesGroups: String): Unit =
        kubernetesGroups(kubernetesGroups.toList())

    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntryProps,
  ) : CdkObject(cdkObject), CfnAccessEntryProps {
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?:
        emptyList()

    override fun principalArn(): String = unwrap(this).getPrincipalArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()

    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntryProps):
        CfnAccessEntryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessEntryProps):
        software.amazon.awscdk.services.eks.CfnAccessEntryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.CfnAccessEntryProps
  }
}
