package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPermission internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ram.CfnPermission,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrIsResourceTypeDefault(): IResolvable =
      unwrap(this).getAttrIsResourceTypeDefault().let(IResolvable::wrap)

  public open fun attrPermissionType(): String = unwrap(this).getAttrPermissionType()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policyTemplate(): Any = unwrap(this).getPolicyTemplate()

  public open fun policyTemplate(`value`: Any) {
    unwrap(this).setPolicyTemplate(`value`)
  }

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun name(name: String) {
    }

    public fun policyTemplate(policyTemplate: Any) {
    }

    public fun resourceType(resourceType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnPermission.Builder =
        software.amazon.awscdk.services.ram.CfnPermission.Builder.create(scope, id)

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun policyTemplate(policyTemplate: Any) {
      cdkBuilder.policyTemplate(policyTemplate)
    }

    public override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ram.CfnPermission = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnPermission): CfnPermission =
        CfnPermission(cdkObject)

    internal fun unwrap(wrapped: CfnPermission): software.amazon.awscdk.services.ram.CfnPermission =
        wrapped.cdkObject
  }
}
