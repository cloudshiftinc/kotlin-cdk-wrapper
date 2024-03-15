@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.location

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAPIKeyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun expireTime(): String? = unwrap(this).getExpireTime()

  public fun forceDelete(): Any? = unwrap(this).getForceDelete()

  public fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

  public fun keyName(): String

  public fun noExpiry(): Any? = unwrap(this).getNoExpiry()

  public fun restrictions(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

    public fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ce5501c93733aac7bff890abef8c6103b3ce86c9f5cf7069e975052698181d2")
    public fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.location.CfnAPIKeyProps.Builder =
        software.amazon.awscdk.services.location.CfnAPIKeyProps.builder()

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

    override fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty) {
      cdkBuilder.restrictions(restrictions.let(CfnAPIKey.ApiKeyRestrictionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ce5501c93733aac7bff890abef8c6103b3ce86c9f5cf7069e975052698181d2")
    override
        fun restrictions(restrictions: CfnAPIKey.ApiKeyRestrictionsProperty.Builder.() -> Unit):
        Unit = restrictions(CfnAPIKey.ApiKeyRestrictionsProperty(restrictions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.location.CfnAPIKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.location.CfnAPIKeyProps,
  ) : CdkObject(cdkObject), CfnAPIKeyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun expireTime(): String? = unwrap(this).getExpireTime()

    override fun forceDelete(): Any? = unwrap(this).getForceDelete()

    override fun forceUpdate(): Any? = unwrap(this).getForceUpdate()

    override fun keyName(): String = unwrap(this).getKeyName()

    override fun noExpiry(): Any? = unwrap(this).getNoExpiry()

    override fun restrictions(): Any = unwrap(this).getRestrictions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAPIKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.location.CfnAPIKeyProps):
        CfnAPIKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAPIKeyProps):
        software.amazon.awscdk.services.location.CfnAPIKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.location.CfnAPIKeyProps
  }
}
