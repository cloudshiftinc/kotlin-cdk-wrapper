package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns() ?: emptyList()

  public open fun attrUserSettingsArn(): String = unwrap(this).getAttrUserSettingsArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun cookieSynchronizationConfiguration(): Any? =
      unwrap(this).getCookieSynchronizationConfiguration()

  public open fun cookieSynchronizationConfiguration(`value`: IResolvable) {
    unwrap(this).setCookieSynchronizationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun cookieSynchronizationConfiguration(`value`: CookieSynchronizationConfigurationProperty) {
    unwrap(this).setCookieSynchronizationConfiguration(`value`.let(CookieSynchronizationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b18b9ab10ccafece27ca119825a94d144595dceb17da12c0d27fa1e2d094259")
  public open
      fun cookieSynchronizationConfiguration(`value`: CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
      Unit = cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty(`value`))

  public open fun copyAllowed(): String = unwrap(this).getCopyAllowed()

  public open fun copyAllowed(`value`: String) {
    unwrap(this).setCopyAllowed(`value`)
  }

  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  public open fun disconnectTimeoutInMinutes(): Number? =
      unwrap(this).getDisconnectTimeoutInMinutes()

  public open fun disconnectTimeoutInMinutes(`value`: Number) {
    unwrap(this).setDisconnectTimeoutInMinutes(`value`)
  }

  public open fun downloadAllowed(): String = unwrap(this).getDownloadAllowed()

  public open fun downloadAllowed(`value`: String) {
    unwrap(this).setDownloadAllowed(`value`)
  }

  public open fun idleDisconnectTimeoutInMinutes(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInMinutes()

  public open fun idleDisconnectTimeoutInMinutes(`value`: Number) {
    unwrap(this).setIdleDisconnectTimeoutInMinutes(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun pasteAllowed(): String = unwrap(this).getPasteAllowed()

  public open fun pasteAllowed(`value`: String) {
    unwrap(this).setPasteAllowed(`value`)
  }

  public open fun printAllowed(): String = unwrap(this).getPrintAllowed()

  public open fun printAllowed(`value`: String) {
    unwrap(this).setPrintAllowed(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun uploadAllowed(): String = unwrap(this).getUploadAllowed()

  public open fun uploadAllowed(`value`: String) {
    unwrap(this).setUploadAllowed(`value`)
  }

  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
    }

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
    }

    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
    }

    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb5a968876b8ff47bab3c96a6738da36f0321b45e40f0b06cbde77afdab9ff35")
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty.Builder.() -> Unit) {
    }

    public fun copyAllowed(copyAllowed: String) {
    }

    public fun customerManagedKey(customerManagedKey: String) {
    }

    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
    }

    public fun downloadAllowed(downloadAllowed: String) {
    }

    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
    }

    public fun pasteAllowed(pasteAllowed: String) {
    }

    public fun printAllowed(printAllowed: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun uploadAllowed(uploadAllowed: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings.Builder.create(scope, id)

    public override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    public override
        fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    public override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(CookieSynchronizationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb5a968876b8ff47bab3c96a6738da36f0321b45e40f0b06cbde77afdab9ff35")
    public override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty(cookieSynchronizationConfiguration))

    public override fun copyAllowed(copyAllowed: String) {
      cdkBuilder.copyAllowed(copyAllowed)
    }

    public override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    public override fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
      cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    public override fun downloadAllowed(downloadAllowed: String) {
      cdkBuilder.downloadAllowed(downloadAllowed)
    }

    public override fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
      cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    public override fun pasteAllowed(pasteAllowed: String) {
      cdkBuilder.pasteAllowed(pasteAllowed)
    }

    public override fun printAllowed(printAllowed: String) {
      cdkBuilder.printAllowed(printAllowed)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun uploadAllowed(uploadAllowed: String) {
      cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings):
        CfnUserSettings = CfnUserSettings(cdkObject)

    internal fun unwrap(wrapped: CfnUserSettings):
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings = wrapped.cdkObject
  }

  public interface CookieSynchronizationConfigurationProperty {
    public fun allowlist(): Any

    public fun blocklist(): Any? = unwrap(this).getBlocklist()

    public interface Builder {
      public fun allowlist(allowlist: IResolvable) {
      }

      public fun allowlist(allowlist: List<Any>) {
      }

      public fun blocklist(blocklist: IResolvable) {
      }

      public fun blocklist(blocklist: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty.builder()

      public override fun allowlist(allowlist: IResolvable) {
        cdkBuilder.allowlist(allowlist.let(IResolvable::unwrap))
      }

      public override fun allowlist(allowlist: List<Any>) {
        cdkBuilder.allowlist(allowlist)
      }

      public override fun blocklist(blocklist: IResolvable) {
        cdkBuilder.blocklist(blocklist.let(IResolvable::unwrap))
      }

      public override fun blocklist(blocklist: List<Any>) {
        cdkBuilder.blocklist(blocklist)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty,
    ) : CookieSynchronizationConfigurationProperty {
      public override fun allowlist(): Any = unwrap(this).getAllowlist()

      public override fun blocklist(): Any? = unwrap(this).getBlocklist()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CookieSynchronizationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty):
          CookieSynchronizationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieSynchronizationConfigurationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CookieSpecificationProperty {
    public fun domain(): String

    public fun name(): String? = unwrap(this).getName()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun domain(domain: String) {
      }

      public fun name(name: String) {
      }

      public fun path(path: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty.builder()

      public override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty,
    ) : CookieSpecificationProperty {
      public override fun domain(): String = unwrap(this).getDomain()

      public override fun name(): String? = unwrap(this).getName()

      public override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CookieSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty):
          CookieSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieSpecificationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
