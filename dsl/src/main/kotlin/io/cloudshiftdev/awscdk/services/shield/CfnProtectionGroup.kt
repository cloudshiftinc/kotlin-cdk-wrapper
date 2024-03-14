package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProtectionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun aggregation(): String = unwrap(this).getAggregation()

  public open fun aggregation(`value`: String) {
    unwrap(this).setAggregation(`value`)
  }

  public open fun attrProtectionGroupArn(): String = unwrap(this).getAttrProtectionGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

  public open fun members(`value`: List<String>) {
    unwrap(this).setMembers(`value`)
  }

  public open fun pattern(): String = unwrap(this).getPattern()

  public open fun pattern(`value`: String) {
    unwrap(this).setPattern(`value`)
  }

  public open fun protectionGroupId(): String = unwrap(this).getProtectionGroupId()

  public open fun protectionGroupId(`value`: String) {
    unwrap(this).setProtectionGroupId(`value`)
  }

  public open fun resourceType(): String? = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun aggregation(aggregation: String)

    public fun members(members: List<String>)

    public fun pattern(pattern: String)

    public fun protectionGroupId(protectionGroupId: String)

    public fun resourceType(resourceType: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionGroup.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionGroup.Builder.create(scope, id)

    override fun aggregation(aggregation: String) {
      cdkBuilder.aggregation(aggregation)
    }

    override fun members(members: List<String>) {
      cdkBuilder.members(members)
    }

    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    override fun protectionGroupId(protectionGroupId: String) {
      cdkBuilder.protectionGroupId(protectionGroupId)
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProtectionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProtectionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroup):
        CfnProtectionGroup = CfnProtectionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionGroup):
        software.amazon.awscdk.services.shield.CfnProtectionGroup = wrapped.cdkObject
  }
}
