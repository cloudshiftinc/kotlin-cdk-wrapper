@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStoredQuery internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.config.CfnStoredQuery,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrQueryArn(): String = unwrap(this).getAttrQueryArn()

  public open fun attrQueryId(): String = unwrap(this).getAttrQueryId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun queryDescription(): String? = unwrap(this).getQueryDescription()

  public open fun queryDescription(`value`: String) {
    unwrap(this).setQueryDescription(`value`)
  }

  public open fun queryExpression(): String = unwrap(this).getQueryExpression()

  public open fun queryExpression(`value`: String) {
    unwrap(this).setQueryExpression(`value`)
  }

  public open fun queryName(): String = unwrap(this).getQueryName()

  public open fun queryName(`value`: String) {
    unwrap(this).setQueryName(`value`)
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
    public fun queryDescription(queryDescription: String)

    public fun queryExpression(queryExpression: String)

    public fun queryName(queryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.config.CfnStoredQuery.Builder =
        software.amazon.awscdk.services.config.CfnStoredQuery.Builder.create(scope, id)

    override fun queryDescription(queryDescription: String) {
      cdkBuilder.queryDescription(queryDescription)
    }

    override fun queryExpression(queryExpression: String) {
      cdkBuilder.queryExpression(queryExpression)
    }

    override fun queryName(queryName: String) {
      cdkBuilder.queryName(queryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.config.CfnStoredQuery = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.config.CfnStoredQuery.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStoredQuery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStoredQuery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnStoredQuery):
        CfnStoredQuery = CfnStoredQuery(cdkObject)

    internal fun unwrap(wrapped: CfnStoredQuery):
        software.amazon.awscdk.services.config.CfnStoredQuery = wrapped.cdkObject
  }
}
