@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

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

public open class CfnAccount internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.organizations.CfnAccount,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accountName(): String = unwrap(this).getAccountName()

  public open fun accountName(`value`: String) {
    unwrap(this).setAccountName(`value`)
  }

  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrJoinedMethod(): String = unwrap(this).getAttrJoinedMethod()

  public open fun attrJoinedTimestamp(): String = unwrap(this).getAttrJoinedTimestamp()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun email(): String = unwrap(this).getEmail()

  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun parentIds(): List<String> = unwrap(this).getParentIds() ?: emptyList()

  public open fun parentIds(`value`: List<String>) {
    unwrap(this).setParentIds(`value`)
  }

  public open fun parentIds(vararg `value`: String): Unit = parentIds(`value`.toList())

  public open fun roleName(): String? = unwrap(this).getRoleName()

  public open fun roleName(`value`: String) {
    unwrap(this).setRoleName(`value`)
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
    public fun accountName(accountName: String)

    public fun email(email: String)

    public fun parentIds(parentIds: List<String>)

    public fun parentIds(vararg parentIds: String)

    public fun roleName(roleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.organizations.CfnAccount.Builder =
        software.amazon.awscdk.services.organizations.CfnAccount.Builder.create(scope, id)

    override fun accountName(accountName: String) {
      cdkBuilder.accountName(accountName)
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun parentIds(parentIds: List<String>) {
      cdkBuilder.parentIds(parentIds)
    }

    override fun parentIds(vararg parentIds: String): Unit = parentIds(parentIds.toList())

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnAccount =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.organizations.CfnAccount.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccount {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccount(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnAccount):
        CfnAccount = CfnAccount(cdkObject)

    internal fun unwrap(wrapped: CfnAccount):
        software.amazon.awscdk.services.organizations.CfnAccount = wrapped.cdkObject
  }
}
