@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnUserSettingsProps {
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  public fun cookieSynchronizationConfiguration(): Any? =
      unwrap(this).getCookieSynchronizationConfiguration()

  public fun copyAllowed(): String

  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public fun disconnectTimeoutInMinutes(): Number? = unwrap(this).getDisconnectTimeoutInMinutes()

  public fun downloadAllowed(): String

  public fun idleDisconnectTimeoutInMinutes(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInMinutes()

  public fun pasteAllowed(): String

  public fun printAllowed(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun uploadAllowed(): String

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable)

    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41653d4c76ea2e84cd0be422d9ab64d0907e443e697e821cf8b130c9769c0ca9")
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder.() -> Unit)

    public fun copyAllowed(copyAllowed: String)

    public fun customerManagedKey(customerManagedKey: String)

    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number)

    public fun downloadAllowed(downloadAllowed: String)

    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number)

    public fun pasteAllowed(pasteAllowed: String)

    public fun printAllowed(printAllowed: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uploadAllowed(uploadAllowed: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps.builder()

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(CfnUserSettings.CookieSynchronizationConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41653d4c76ea2e84cd0be422d9ab64d0907e443e697e821cf8b130c9769c0ca9")
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        cookieSynchronizationConfiguration(CfnUserSettings.CookieSynchronizationConfigurationProperty(cookieSynchronizationConfiguration))

    override fun copyAllowed(copyAllowed: String) {
      cdkBuilder.copyAllowed(copyAllowed)
    }

    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    override fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
      cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    override fun downloadAllowed(downloadAllowed: String) {
      cdkBuilder.downloadAllowed(downloadAllowed)
    }

    override fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
      cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    override fun pasteAllowed(pasteAllowed: String) {
      cdkBuilder.pasteAllowed(pasteAllowed)
    }

    override fun printAllowed(printAllowed: String) {
      cdkBuilder.printAllowed(printAllowed)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uploadAllowed(uploadAllowed: String) {
      cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps,
  ) : CdkObject(cdkObject), CfnUserSettingsProps {
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    override fun cookieSynchronizationConfiguration(): Any? =
        unwrap(this).getCookieSynchronizationConfiguration()

    override fun copyAllowed(): String = unwrap(this).getCopyAllowed()

    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    override fun disconnectTimeoutInMinutes(): Number? =
        unwrap(this).getDisconnectTimeoutInMinutes()

    override fun downloadAllowed(): String = unwrap(this).getDownloadAllowed()

    override fun idleDisconnectTimeoutInMinutes(): Number? =
        unwrap(this).getIdleDisconnectTimeoutInMinutes()

    override fun pasteAllowed(): String = unwrap(this).getPasteAllowed()

    override fun printAllowed(): String = unwrap(this).getPrintAllowed()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun uploadAllowed(): String = unwrap(this).getUploadAllowed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps):
        CfnUserSettingsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps
  }
}
