@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

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

public open class CfnInstanceProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun excludeAppPackagesFromCleanup(): List<String> =
      unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

  public open fun excludeAppPackagesFromCleanup(`value`: List<String>) {
    unwrap(this).setExcludeAppPackagesFromCleanup(`value`)
  }

  public open fun excludeAppPackagesFromCleanup(vararg `value`: String): Unit =
      excludeAppPackagesFromCleanup(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

  public open fun packageCleanup(`value`: Boolean) {
    unwrap(this).setPackageCleanup(`value`)
  }

  public open fun packageCleanup(`value`: IResolvable) {
    unwrap(this).setPackageCleanup(`value`.let(IResolvable::unwrap))
  }

  public open fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

  public open fun rebootAfterUse(`value`: Boolean) {
    unwrap(this).setRebootAfterUse(`value`)
  }

  public open fun rebootAfterUse(`value`: IResolvable) {
    unwrap(this).setRebootAfterUse(`value`.let(IResolvable::unwrap))
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
    public fun description(description: String)

    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>)

    public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String)

    public fun name(name: String)

    public fun packageCleanup(packageCleanup: Boolean)

    public fun packageCleanup(packageCleanup: IResolvable)

    public fun rebootAfterUse(rebootAfterUse: Boolean)

    public fun rebootAfterUse(rebootAfterUse: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
      cdkBuilder.excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup)
    }

    override fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String): Unit =
        excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun packageCleanup(packageCleanup: Boolean) {
      cdkBuilder.packageCleanup(packageCleanup)
    }

    override fun packageCleanup(packageCleanup: IResolvable) {
      cdkBuilder.packageCleanup(packageCleanup.let(IResolvable::unwrap))
    }

    override fun rebootAfterUse(rebootAfterUse: Boolean) {
      cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    override fun rebootAfterUse(rebootAfterUse: IResolvable) {
      cdkBuilder.rebootAfterUse(rebootAfterUse.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnInstanceProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile):
        CfnInstanceProfile = CfnInstanceProfile(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfile):
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile = wrapped.cdkObject
  }
}
