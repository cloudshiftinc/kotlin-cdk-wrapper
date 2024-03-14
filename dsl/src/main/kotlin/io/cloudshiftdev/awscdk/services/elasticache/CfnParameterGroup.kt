package io.cloudshiftdev.awscdk.services.elasticache

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
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cacheParameterGroupFamily(): String = unwrap(this).getCacheParameterGroupFamily()

  public open fun cacheParameterGroupFamily(`value`: String) {
    unwrap(this).setCacheParameterGroupFamily(`value`)
  }

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun properties(): Any? = unwrap(this).getProperties()

  public open fun properties(`value`: IResolvable) {
    unwrap(this).setProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun properties(`value`: Map<String, String>) {
    unwrap(this).setProperties(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String)

    public fun description(description: String)

    public fun properties(properties: IResolvable)

    public fun properties(properties: Map<String, String>)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnParameterGroup.Builder.create(scope, id)

    override fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
      cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun properties(properties: IResolvable) {
      cdkBuilder.properties(properties.let(IResolvable::unwrap))
    }

    override fun properties(properties: Map<String, String>) {
      cdkBuilder.properties(properties)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnParameterGroup):
        CfnParameterGroup = CfnParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroup):
        software.amazon.awscdk.services.elasticache.CfnParameterGroup = wrapped.cdkObject
  }
}
