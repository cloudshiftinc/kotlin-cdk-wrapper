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

public interface CfnPortalProps {
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  public fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

  public fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  public fun userAccessLoggingSettingsArn(): String? =
      unwrap(this).getUserAccessLoggingSettingsArn()

  public fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun authenticationType(authenticationType: String)

    public fun browserSettingsArn(browserSettingsArn: String)

    public fun customerManagedKey(customerManagedKey: String)

    public fun displayName(displayName: String)

    public fun ipAccessSettingsArn(ipAccessSettingsArn: String)

    public fun networkSettingsArn(networkSettingsArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trustStoreArn(trustStoreArn: String)

    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String)

    public fun userSettingsArn(userSettingsArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnPortalProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnPortalProps.builder()

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun browserSettingsArn(browserSettingsArn: String) {
      cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
      cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    override fun networkSettingsArn(networkSettingsArn: String) {
      cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    override fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
      cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    override fun userSettingsArn(userSettingsArn: String) {
      cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnPortalProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortalProps,
  ) : CdkObject(cdkObject), CfnPortalProps {
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    override fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

    override fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

    override fun userAccessLoggingSettingsArn(): String? =
        unwrap(this).getUserAccessLoggingSettingsArn()

    override fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPortalProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortalProps):
        CfnPortalProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPortalProps):
        software.amazon.awscdk.services.workspacesweb.CfnPortalProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnPortalProps
  }
}
