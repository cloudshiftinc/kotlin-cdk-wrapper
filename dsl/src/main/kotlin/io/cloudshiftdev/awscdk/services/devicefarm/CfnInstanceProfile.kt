package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile,
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

  public interface Builder {
    public fun description(description: String) {
    }

    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun packageCleanup(packageCleanup: Boolean) {
    }

    public fun packageCleanup(packageCleanup: IResolvable) {
    }

    public fun rebootAfterUse(rebootAfterUse: Boolean) {
    }

    public fun rebootAfterUse(rebootAfterUse: IResolvable) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfile.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
      cdkBuilder.excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun packageCleanup(packageCleanup: Boolean) {
      cdkBuilder.packageCleanup(packageCleanup)
    }

    public override fun packageCleanup(packageCleanup: IResolvable) {
      cdkBuilder.packageCleanup(packageCleanup.let(IResolvable::unwrap))
    }

    public override fun rebootAfterUse(rebootAfterUse: Boolean) {
      cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    public override fun rebootAfterUse(rebootAfterUse: IResolvable) {
      cdkBuilder.rebootAfterUse(rebootAfterUse.let(IResolvable::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnInstanceProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
