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

public interface CfnBrowserSettingsProps {
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  public fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun browserPolicy(browserPolicy: String)

    public fun customerManagedKey(customerManagedKey: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps.builder()

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override fun browserPolicy(browserPolicy: String) {
      cdkBuilder.browserPolicy(browserPolicy)
    }

    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps,
  ) : CdkObject(cdkObject), CfnBrowserSettingsProps {
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    override fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBrowserSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps):
        CfnBrowserSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBrowserSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettingsProps
  }
}
