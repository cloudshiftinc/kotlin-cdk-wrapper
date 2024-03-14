package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPlacementGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrGroupName(): String = unwrap(this).getAttrGroupName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun partitionCount(): Number? = unwrap(this).getPartitionCount()

  public open fun partitionCount(`value`: Number) {
    unwrap(this).setPartitionCount(`value`)
  }

  public open fun spreadLevel(): String? = unwrap(this).getSpreadLevel()

  public open fun spreadLevel(`value`: String) {
    unwrap(this).setSpreadLevel(`value`)
  }

  public open fun strategy(): String? = unwrap(this).getStrategy()

  public open fun strategy(`value`: String) {
    unwrap(this).setStrategy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun partitionCount(partitionCount: Number)

    public fun spreadLevel(spreadLevel: String)

    public fun strategy(strategy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnPlacementGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnPlacementGroup.Builder.create(scope, id)

    override fun partitionCount(partitionCount: Number) {
      cdkBuilder.partitionCount(partitionCount)
    }

    override fun spreadLevel(spreadLevel: String) {
      cdkBuilder.spreadLevel(spreadLevel)
    }

    override fun strategy(strategy: String) {
      cdkBuilder.strategy(strategy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnPlacementGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlacementGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlacementGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnPlacementGroup):
        CfnPlacementGroup = CfnPlacementGroup(cdkObject)

    internal fun unwrap(wrapped: CfnPlacementGroup):
        software.amazon.awscdk.services.ec2.CfnPlacementGroup = wrapped.cdkObject
  }
}
