@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

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

public open class CfnACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.memorydb.CfnACL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun aclName(): String = unwrap(this).getAclName()

  public open fun aclName(`value`: String) {
    unwrap(this).setAclName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()

  public open fun userNames(`value`: List<String>) {
    unwrap(this).setUserNames(`value`)
  }

  public open fun userNames(vararg `value`: String): Unit = userNames(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun aclName(aclName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userNames(userNames: List<String>)

    public fun userNames(vararg userNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnACL.Builder =
        software.amazon.awscdk.services.memorydb.CfnACL.Builder.create(scope, id)

    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userNames(userNames: List<String>) {
      cdkBuilder.userNames(userNames)
    }

    override fun userNames(vararg userNames: String): Unit = userNames(userNames.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnACL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnACL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnACL): CfnACL =
        CfnACL(cdkObject)

    internal fun unwrap(wrapped: CfnACL): software.amazon.awscdk.services.memorydb.CfnACL =
        wrapped.cdkObject
  }
}
