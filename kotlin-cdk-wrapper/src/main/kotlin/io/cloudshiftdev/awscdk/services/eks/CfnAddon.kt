@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAddon internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.CfnAddon,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addonName(): String = unwrap(this).getAddonName()

  public open fun addonName(`value`: String) {
    unwrap(this).setAddonName(`value`)
  }

  public open fun addonVersion(): String? = unwrap(this).getAddonVersion()

  public open fun addonVersion(`value`: String) {
    unwrap(this).setAddonVersion(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun configurationValues(): String? = unwrap(this).getConfigurationValues()

  public open fun configurationValues(`value`: String) {
    unwrap(this).setConfigurationValues(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

  public open fun preserveOnDelete(`value`: Boolean) {
    unwrap(this).setPreserveOnDelete(`value`)
  }

  public open fun preserveOnDelete(`value`: IResolvable) {
    unwrap(this).setPreserveOnDelete(`value`.let(IResolvable::unwrap))
  }

  public open fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

  public open fun resolveConflicts(`value`: String) {
    unwrap(this).setResolveConflicts(`value`)
  }

  public open fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

  public open fun serviceAccountRoleArn(`value`: String) {
    unwrap(this).setServiceAccountRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAddon.Builder =
        software.amazon.awscdk.services.eks.CfnAddon.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.eks.CfnAddon = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnAddon.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAddon {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAddon(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAddon): CfnAddon =
        CfnAddon(cdkObject)

    internal fun unwrap(wrapped: CfnAddon): software.amazon.awscdk.services.eks.CfnAddon =
        wrapped.cdkObject
  }
}
