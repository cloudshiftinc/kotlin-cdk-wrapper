@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAddonProps {
  public fun addonName(): String

  public fun addonVersion(): String? = unwrap(this).getAddonVersion()

  public fun clusterName(): String

  public fun configurationValues(): String? = unwrap(this).getConfigurationValues()

  public fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

  public fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

  public fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun addonName(addonName: String)

    public fun addonVersion(addonVersion: String)

    public fun clusterName(clusterName: String)

    public fun configurationValues(configurationValues: String)

    public fun preserveOnDelete(preserveOnDelete: Boolean)

    public fun preserveOnDelete(preserveOnDelete: IResolvable)

    public fun resolveConflicts(resolveConflicts: String)

    public fun serviceAccountRoleArn(serviceAccountRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAddonProps.Builder =
        software.amazon.awscdk.services.eks.CfnAddonProps.builder()

    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    override fun addonVersion(addonVersion: String) {
      cdkBuilder.addonVersion(addonVersion)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun configurationValues(configurationValues: String) {
      cdkBuilder.configurationValues(configurationValues)
    }

    override fun preserveOnDelete(preserveOnDelete: Boolean) {
      cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    override fun preserveOnDelete(preserveOnDelete: IResolvable) {
      cdkBuilder.preserveOnDelete(preserveOnDelete.let(IResolvable::unwrap))
    }

    override fun resolveConflicts(resolveConflicts: String) {
      cdkBuilder.resolveConflicts(resolveConflicts)
    }

    override fun serviceAccountRoleArn(serviceAccountRoleArn: String) {
      cdkBuilder.serviceAccountRoleArn(serviceAccountRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnAddonProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnAddonProps,
  ) : CdkObject(cdkObject), CfnAddonProps {
    override fun addonName(): String = unwrap(this).getAddonName()

    override fun addonVersion(): String? = unwrap(this).getAddonVersion()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun configurationValues(): String? = unwrap(this).getConfigurationValues()

    override fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

    override fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

    override fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAddonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAddonProps): CfnAddonProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAddonProps): software.amazon.awscdk.services.eks.CfnAddonProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnAddonProps
  }
}
