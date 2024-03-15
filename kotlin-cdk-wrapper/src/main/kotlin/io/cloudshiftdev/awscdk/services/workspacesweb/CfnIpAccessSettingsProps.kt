@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnIpAccessSettingsProps {
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun ipRules(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun customerManagedKey(customerManagedKey: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun ipRules(ipRules: IResolvable)

    public fun ipRules(ipRules: List<Any>)

    public fun ipRules(vararg ipRules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps.builder()

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun ipRules(ipRules: IResolvable) {
      cdkBuilder.ipRules(ipRules.let(IResolvable::unwrap))
    }

    override fun ipRules(ipRules: List<Any>) {
      cdkBuilder.ipRules(ipRules)
    }

    override fun ipRules(vararg ipRules: Any): Unit = ipRules(ipRules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps,
  ) : CdkObject(cdkObject), CfnIpAccessSettingsProps {
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun ipRules(): Any = unwrap(this).getIpRules()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIpAccessSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps):
        CfnIpAccessSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIpAccessSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettingsProps
  }
}
