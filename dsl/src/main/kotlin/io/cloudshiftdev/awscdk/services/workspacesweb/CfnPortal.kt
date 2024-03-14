package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPortal internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortal,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  public open fun attrBrowserType(): String = unwrap(this).getAttrBrowserType()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrPortalArn(): String = unwrap(this).getAttrPortalArn()

  public open fun attrPortalEndpoint(): String = unwrap(this).getAttrPortalEndpoint()

  public open fun attrPortalStatus(): String = unwrap(this).getAttrPortalStatus()

  public open fun attrRendererType(): String = unwrap(this).getAttrRendererType()

  public open fun attrServiceProviderSamlMetadata(): String =
      unwrap(this).getAttrServiceProviderSamlMetadata()

  public open fun attrStatusReason(): String = unwrap(this).getAttrStatusReason()

  public open fun authenticationType(): String? = unwrap(this).getAuthenticationType()

  public open fun authenticationType(`value`: String) {
    unwrap(this).setAuthenticationType(`value`)
  }

  public open fun browserSettingsArn(): String? = unwrap(this).getBrowserSettingsArn()

  public open fun browserSettingsArn(`value`: String) {
    unwrap(this).setBrowserSettingsArn(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAccessSettingsArn(): String? = unwrap(this).getIpAccessSettingsArn()

  public open fun ipAccessSettingsArn(`value`: String) {
    unwrap(this).setIpAccessSettingsArn(`value`)
  }

  public open fun networkSettingsArn(): String? = unwrap(this).getNetworkSettingsArn()

  public open fun networkSettingsArn(`value`: String) {
    unwrap(this).setNetworkSettingsArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  public open fun trustStoreArn(`value`: String) {
    unwrap(this).setTrustStoreArn(`value`)
  }

  public open fun userAccessLoggingSettingsArn(): String? =
      unwrap(this).getUserAccessLoggingSettingsArn()

  public open fun userAccessLoggingSettingsArn(`value`: String) {
    unwrap(this).setUserAccessLoggingSettingsArn(`value`)
  }

  public open fun userSettingsArn(): String? = unwrap(this).getUserSettingsArn()

  public open fun userSettingsArn(`value`: String) {
    unwrap(this).setUserSettingsArn(`value`)
  }

  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
    }

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
    }

    public fun authenticationType(authenticationType: String) {
    }

    public fun browserSettingsArn(browserSettingsArn: String) {
    }

    public fun customerManagedKey(customerManagedKey: String) {
    }

    public fun displayName(displayName: String) {
    }

    public fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
    }

    public fun networkSettingsArn(networkSettingsArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun trustStoreArn(trustStoreArn: String) {
    }

    public fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
    }

    public fun userSettingsArn(userSettingsArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnPortal.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnPortal.Builder.create(scope, id)

    public override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    public override
        fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    public override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    public override fun browserSettingsArn(browserSettingsArn: String) {
      cdkBuilder.browserSettingsArn(browserSettingsArn)
    }

    public override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun ipAccessSettingsArn(ipAccessSettingsArn: String) {
      cdkBuilder.ipAccessSettingsArn(ipAccessSettingsArn)
    }

    public override fun networkSettingsArn(networkSettingsArn: String) {
      cdkBuilder.networkSettingsArn(networkSettingsArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public override fun userAccessLoggingSettingsArn(userAccessLoggingSettingsArn: String) {
      cdkBuilder.userAccessLoggingSettingsArn(userAccessLoggingSettingsArn)
    }

    public override fun userSettingsArn(userSettingsArn: String) {
      cdkBuilder.userSettingsArn(userSettingsArn)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnPortal = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPortal {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPortal(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnPortal): CfnPortal
        = CfnPortal(cdkObject)

    internal fun unwrap(wrapped: CfnPortal): software.amazon.awscdk.services.workspacesweb.CfnPortal
        = wrapped.cdkObject
  }
}
