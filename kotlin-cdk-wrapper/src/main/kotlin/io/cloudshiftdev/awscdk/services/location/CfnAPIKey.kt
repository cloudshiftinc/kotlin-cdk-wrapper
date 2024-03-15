@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAPIKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.location.CfnAPIKey,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreateTime(): String = unwrap(this).getAttrCreateTime()

  public open fun attrKeyArn(): String = unwrap(this).getAttrKeyArn()

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun expireTime(): String? = unwrap(this).getExpireTime()

  public open fun expireTime(`value`: String) {
    unwrap(this).setExpireTime(`value`)
  }

  public open fun forceDelete(): Any? = unwrap(this).getForceDelete()

  public open fun forceDelete(`value`: Boolean) {
    unwrap(this).setForceDelete(`value`)
  }

  public open fun forceDelete(`value`: IResolvable) {
    unwrap(this).setForceDelete(`value`.let(IResolvable::unwrap))
  }

  public open fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

  public open fun forceUpdate(`value`: Boolean) {
    unwrap(this).setForceUpdate(`value`)
  }

  public open fun forceUpdate(`value`: IResolvable) {
    unwrap(this).setForceUpdate(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyName(): String = unwrap(this).getKeyName()

  public open fun keyName(`value`: String) {
    unwrap(this).setKeyName(`value`)
  }

  public open fun noExpiry(): Any? = unwrap(this).getNoExpiry()

  public open fun noExpiry(`value`: Boolean) {
    unwrap(this).setNoExpiry(`value`)
  }

  public open fun noExpiry(`value`: IResolvable) {
    unwrap(this).setNoExpiry(`value`.let(IResolvable::unwrap))
  }

  public open fun restrictions(): Any = unwrap(this).getRestrictions()

  public open fun restrictions(`value`: IResolvable) {
    unwrap(this).setRestrictions(`value`.let(IResolvable::unwrap))
  }

  public open fun restrictions(`value`: ApiKeyRestrictionsProperty) {
    unwrap(this).setRestrictions(`value`.let(ApiKeyRestrictionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("de2d779539a481439a314d1ac07203d94326f20c265005251ab2980ac4da871c")
  public open fun restrictions(`value`: ApiKeyRestrictionsProperty.Builder.() -> Unit): Unit =
      restrictions(ApiKeyRestrictionsProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun expireTime(expireTime: String)

    public fun forceDelete(forceDelete: Boolean)

    public fun forceDelete(forceDelete: IResolvable)

    public fun forceUpdate(forceUpdate: Boolean)

    public fun forceUpdate(forceUpdate: IResolvable)

    public fun keyName(keyName: String)

    public fun noExpiry(noExpiry: Boolean)

    public fun noExpiry(noExpiry: IResolvable)

    public fun restrictions(restrictions: IResolvable)

    public fun restrictions(restrictions: ApiKeyRestrictionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28df308d066f6b9260576bb3b0f83accbb556eecab505dc18fb18a99fee74a1d")
    public fun restrictions(restrictions: ApiKeyRestrictionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnAPIKey.Builder =
        software.amazon.awscdk.services.location.CfnAPIKey.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun expireTime(expireTime: String) {
      cdkBuilder.expireTime(expireTime)
    }

    override fun forceDelete(forceDelete: Boolean) {
      cdkBuilder.forceDelete(forceDelete)
    }

    override fun forceDelete(forceDelete: IResolvable) {
      cdkBuilder.forceDelete(forceDelete.let(IResolvable::unwrap))
    }

    override fun forceUpdate(forceUpdate: Boolean) {
      cdkBuilder.forceUpdate(forceUpdate)
    }

    override fun forceUpdate(forceUpdate: IResolvable) {
      cdkBuilder.forceUpdate(forceUpdate.let(IResolvable::unwrap))
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun noExpiry(noExpiry: Boolean) {
      cdkBuilder.noExpiry(noExpiry)
    }

    override fun noExpiry(noExpiry: IResolvable) {
      cdkBuilder.noExpiry(noExpiry.let(IResolvable::unwrap))
    }

    override fun restrictions(restrictions: IResolvable) {
      cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
    }

    override fun restrictions(restrictions: ApiKeyRestrictionsProperty) {
      cdkBuilder.restrictions(restrictions.let(ApiKeyRestrictionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28df308d066f6b9260576bb3b0f83accbb556eecab505dc18fb18a99fee74a1d")
    override fun restrictions(restrictions: ApiKeyRestrictionsProperty.Builder.() -> Unit): Unit =
        restrictions(ApiKeyRestrictionsProperty(restrictions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnAPIKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.location.CfnAPIKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAPIKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAPIKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKey): CfnAPIKey =
        CfnAPIKey(cdkObject)

    internal fun unwrap(wrapped: CfnAPIKey): software.amazon.awscdk.services.location.CfnAPIKey =
        wrapped.cdkObject
  }

  public interface ApiKeyRestrictionsProperty {
    public fun allowActions(): List<String>

    public fun allowReferers(): List<String> = unwrap(this).getAllowReferers() ?: emptyList()

    public fun allowResources(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun allowActions(allowActions: List<String>)

      public fun allowActions(vararg allowActions: String)

      public fun allowReferers(allowReferers: List<String>)

      public fun allowReferers(vararg allowReferers: String)

      public fun allowResources(allowResources: List<String>)

      public fun allowResources(vararg allowResources: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty.Builder =
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty.builder()

      override fun allowActions(allowActions: List<String>) {
        cdkBuilder.allowActions(allowActions)
      }

      override fun allowActions(vararg allowActions: String): Unit =
          allowActions(allowActions.toList())

      override fun allowReferers(allowReferers: List<String>) {
        cdkBuilder.allowReferers(allowReferers)
      }

      override fun allowReferers(vararg allowReferers: String): Unit =
          allowReferers(allowReferers.toList())

      override fun allowResources(allowResources: List<String>) {
        cdkBuilder.allowResources(allowResources)
      }

      override fun allowResources(vararg allowResources: String): Unit =
          allowResources(allowResources.toList())

      public fun build():
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty,
    ) : CdkObject(cdkObject), ApiKeyRestrictionsProperty {
      override fun allowActions(): List<String> = unwrap(this).getAllowActions()

      override fun allowReferers(): List<String> = unwrap(this).getAllowReferers() ?: emptyList()

      override fun allowResources(): List<String> = unwrap(this).getAllowResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApiKeyRestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty):
          ApiKeyRestrictionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiKeyRestrictionsProperty):
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.location.CfnAPIKey.ApiKeyRestrictionsProperty
    }
  }
}
