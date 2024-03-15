@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSecurityProfileProps {
  public fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

  public fun description(): String? = unwrap(this).getDescription()

  public fun instanceArn(): String

  public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  public fun securityProfileName(): String

  public fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources() ?:
      emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allowedAccessControlTags(allowedAccessControlTags: IResolvable)

    public fun allowedAccessControlTags(allowedAccessControlTags: List<Any>)

    public fun allowedAccessControlTags(vararg allowedAccessControlTags: Any)

    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun permissions(permissions: List<String>)

    public fun permissions(vararg permissions: String)

    public fun securityProfileName(securityProfileName: String)

    public fun tagRestrictedResources(tagRestrictedResources: List<String>)

    public fun tagRestrictedResources(vararg tagRestrictedResources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityProfileProps.Builder
        = software.amazon.awscdk.services.connect.CfnSecurityProfileProps.builder()

    override fun allowedAccessControlTags(allowedAccessControlTags: IResolvable) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags.let(IResolvable::unwrap))
    }

    override fun allowedAccessControlTags(allowedAccessControlTags: List<Any>) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags)
    }

    override fun allowedAccessControlTags(vararg allowedAccessControlTags: Any): Unit =
        allowedAccessControlTags(allowedAccessControlTags.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    override fun tagRestrictedResources(tagRestrictedResources: List<String>) {
      cdkBuilder.tagRestrictedResources(tagRestrictedResources)
    }

    override fun tagRestrictedResources(vararg tagRestrictedResources: String): Unit =
        tagRestrictedResources(tagRestrictedResources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfileProps,
  ) : CdkObject(cdkObject), CfnSecurityProfileProps {
    override fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

    override fun description(): String? = unwrap(this).getDescription()

    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    override fun securityProfileName(): String = unwrap(this).getSecurityProfileName()

    override fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources()
        ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfileProps):
        CfnSecurityProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfileProps):
        software.amazon.awscdk.services.connect.CfnSecurityProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnSecurityProfileProps
  }
}
