package io.cloudshiftdev.awscdk.services.connect

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

public open class CfnUserHierarchyGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrUserHierarchyGroupArn(): String = unwrap(this).getAttrUserHierarchyGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parentGroupArn(): String? = unwrap(this).getParentGroupArn()

  public open fun parentGroupArn(`value`: String) {
    unwrap(this).setParentGroupArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun name(name: String)

    public fun parentGroupArn(parentGroupArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnUserHierarchyGroup.Builder =
        software.amazon.awscdk.services.connect.CfnUserHierarchyGroup.Builder.create(scope, id)

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parentGroupArn(parentGroupArn: String) {
      cdkBuilder.parentGroupArn(parentGroupArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnUserHierarchyGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserHierarchyGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserHierarchyGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyGroup):
        CfnUserHierarchyGroup = CfnUserHierarchyGroup(cdkObject)

    internal fun unwrap(wrapped: CfnUserHierarchyGroup):
        software.amazon.awscdk.services.connect.CfnUserHierarchyGroup = wrapped.cdkObject
  }
}
