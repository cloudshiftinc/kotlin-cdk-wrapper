@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUserSettings`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnUserSettingsProps cfnUserSettingsProps = CfnUserSettingsProps.builder()
 * .copyAllowed("copyAllowed")
 * .downloadAllowed("downloadAllowed")
 * .pasteAllowed("pasteAllowed")
 * .printAllowed("printAllowed")
 * .uploadAllowed("uploadAllowed")
 * // the properties below are optional
 * .additionalEncryptionContext(Map.of(
 * "additionalEncryptionContextKey", "additionalEncryptionContext"))
 * .cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty.builder()
 * .allowlist(List.of(CookieSpecificationProperty.builder()
 * .domain("domain")
 * // the properties below are optional
 * .name("name")
 * .path("path")
 * .build()))
 * // the properties below are optional
 * .blocklist(List.of(CookieSpecificationProperty.builder()
 * .domain("domain")
 * // the properties below are optional
 * .name("name")
 * .path("path")
 * .build()))
 * .build())
 * .customerManagedKey("customerManagedKey")
 * .deepLinkAllowed("deepLinkAllowed")
 * .disconnectTimeoutInMinutes(123)
 * .idleDisconnectTimeoutInMinutes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .toolbarConfiguration(ToolbarConfigurationProperty.builder()
 * .hiddenToolbarItems(List.of("hiddenToolbarItems"))
 * .maxDisplayResolution("maxDisplayResolution")
 * .toolbarType("toolbarType")
 * .visualMode("visualMode")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html)
 */
public interface CfnUserSettingsProps {
  /**
   * The additional encryption context of the user settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
   */
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
   */
  public fun cookieSynchronizationConfiguration(): Any? =
      unwrap(this).getCookieSynchronizationConfiguration()

  /**
   * Specifies whether the user can copy text from the streaming session to the local device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-copyallowed)
   */
  public fun copyAllowed(): String

  /**
   * The customer managed key used to encrypt sensitive information in the user settings.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-customermanagedkey)
   */
  public fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * Specifies whether the user can use deep links that open automatically when connecting to a
   * session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-deeplinkallowed)
   */
  public fun deepLinkAllowed(): String? = unwrap(this).getDeepLinkAllowed()

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-disconnecttimeoutinminutes)
   */
  public fun disconnectTimeoutInMinutes(): Number? = unwrap(this).getDisconnectTimeoutInMinutes()

  /**
   * Specifies whether the user can download files from the streaming session to the local device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-downloadallowed)
   */
  public fun downloadAllowed(): String

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the disconnect timeout interval begins.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-idledisconnecttimeoutinminutes)
   */
  public fun idleDisconnectTimeoutInMinutes(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInMinutes()

  /**
   * Specifies whether the user can paste text from the local device to the streaming session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-pasteallowed)
   */
  public fun pasteAllowed(): String

  /**
   * Specifies whether the user can print to the local device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-printallowed)
   */
  public fun printAllowed(): String

  /**
   * The tags to add to the user settings resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The configuration of the toolbar.
   *
   * This allows administrators to select the toolbar type and visual mode, set maximum display
   * resolution for sessions, and choose which items are visible to end users during their sessions. If
   * administrators do not modify these settings, end users retain control over their toolbar
   * preferences.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
   */
  public fun toolbarConfiguration(): Any? = unwrap(this).getToolbarConfiguration()

  /**
   * Specifies whether the user can upload files from the local device to the streaming session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-uploadallowed)
   */
  public fun uploadAllowed(): String

  /**
   * A builder for [CfnUserSettingsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalEncryptionContext The additional encryption context of the user settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * @param additionalEncryptionContext The additional encryption context of the user settings.
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable)

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty)

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41653d4c76ea2e84cd0be422d9ab64d0907e443e697e821cf8b130c9769c0ca9")
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     * local device. 
     */
    public fun copyAllowed(copyAllowed: String)

    /**
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the user settings.
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * @param deepLinkAllowed Specifies whether the user can use deep links that open automatically
     * when connecting to a session.
     */
    public fun deepLinkAllowed(deepLinkAllowed: String)

    /**
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     * after users disconnect.
     */
    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number)

    /**
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     * session to the local device. 
     */
    public fun downloadAllowed(downloadAllowed: String)

    /**
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the disconnect timeout interval
     * begins.
     */
    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number)

    /**
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     * streaming session. 
     */
    public fun pasteAllowed(pasteAllowed: String)

    /**
     * @param printAllowed Specifies whether the user can print to the local device. 
     */
    public fun printAllowed(printAllowed: String)

    /**
     * @param tags The tags to add to the user settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the user settings resource.
     * A tag is a key-value pair.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    public fun toolbarConfiguration(toolbarConfiguration: IResolvable)

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    public
        fun toolbarConfiguration(toolbarConfiguration: CfnUserSettings.ToolbarConfigurationProperty)

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d9eafadec9800a711b13fceaab632283c1e0c190730647cb0cfaadaf8f27a69")
    public
        fun toolbarConfiguration(toolbarConfiguration: CfnUserSettings.ToolbarConfigurationProperty.Builder.() -> Unit)

    /**
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     * streaming session. 
     */
    public fun uploadAllowed(uploadAllowed: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps.builder()

    /**
     * @param additionalEncryptionContext The additional encryption context of the user settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * @param additionalEncryptionContext The additional encryption context of the user settings.
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(CfnUserSettings.CookieSynchronizationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("41653d4c76ea2e84cd0be422d9ab64d0907e443e697e821cf8b130c9769c0ca9")
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        cookieSynchronizationConfiguration(CfnUserSettings.CookieSynchronizationConfigurationProperty(cookieSynchronizationConfiguration))

    /**
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     * local device. 
     */
    override fun copyAllowed(copyAllowed: String) {
      cdkBuilder.copyAllowed(copyAllowed)
    }

    /**
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the user settings.
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * @param deepLinkAllowed Specifies whether the user can use deep links that open automatically
     * when connecting to a session.
     */
    override fun deepLinkAllowed(deepLinkAllowed: String) {
      cdkBuilder.deepLinkAllowed(deepLinkAllowed)
    }

    /**
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     * after users disconnect.
     */
    override fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
      cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    /**
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     * session to the local device. 
     */
    override fun downloadAllowed(downloadAllowed: String) {
      cdkBuilder.downloadAllowed(downloadAllowed)
    }

    /**
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the disconnect timeout interval
     * begins.
     */
    override fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
      cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    /**
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     * streaming session. 
     */
    override fun pasteAllowed(pasteAllowed: String) {
      cdkBuilder.pasteAllowed(pasteAllowed)
    }

    /**
     * @param printAllowed Specifies whether the user can print to the local device. 
     */
    override fun printAllowed(printAllowed: String) {
      cdkBuilder.printAllowed(printAllowed)
    }

    /**
     * @param tags The tags to add to the user settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the user settings resource.
     * A tag is a key-value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    override fun toolbarConfiguration(toolbarConfiguration: IResolvable) {
      cdkBuilder.toolbarConfiguration(toolbarConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    override
        fun toolbarConfiguration(toolbarConfiguration: CfnUserSettings.ToolbarConfigurationProperty) {
      cdkBuilder.toolbarConfiguration(toolbarConfiguration.let(CfnUserSettings.ToolbarConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param toolbarConfiguration The configuration of the toolbar.
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d9eafadec9800a711b13fceaab632283c1e0c190730647cb0cfaadaf8f27a69")
    override
        fun toolbarConfiguration(toolbarConfiguration: CfnUserSettings.ToolbarConfigurationProperty.Builder.() -> Unit):
        Unit =
        toolbarConfiguration(CfnUserSettings.ToolbarConfigurationProperty(toolbarConfiguration))

    /**
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     * streaming session. 
     */
    override fun uploadAllowed(uploadAllowed: String) {
      cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps,
  ) : CdkObject(cdkObject),
      CfnUserSettingsProps {
    /**
     * The additional encryption context of the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     */
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     */
    override fun cookieSynchronizationConfiguration(): Any? =
        unwrap(this).getCookieSynchronizationConfiguration()

    /**
     * Specifies whether the user can copy text from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-copyallowed)
     */
    override fun copyAllowed(): String = unwrap(this).getCopyAllowed()

    /**
     * The customer managed key used to encrypt sensitive information in the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-customermanagedkey)
     */
    override fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

    /**
     * Specifies whether the user can use deep links that open automatically when connecting to a
     * session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-deeplinkallowed)
     */
    override fun deepLinkAllowed(): String? = unwrap(this).getDeepLinkAllowed()

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-disconnecttimeoutinminutes)
     */
    override fun disconnectTimeoutInMinutes(): Number? =
        unwrap(this).getDisconnectTimeoutInMinutes()

    /**
     * Specifies whether the user can download files from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-downloadallowed)
     */
    override fun downloadAllowed(): String = unwrap(this).getDownloadAllowed()

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the disconnect timeout interval begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-idledisconnecttimeoutinminutes)
     */
    override fun idleDisconnectTimeoutInMinutes(): Number? =
        unwrap(this).getIdleDisconnectTimeoutInMinutes()

    /**
     * Specifies whether the user can paste text from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-pasteallowed)
     */
    override fun pasteAllowed(): String = unwrap(this).getPasteAllowed()

    /**
     * Specifies whether the user can print to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-printallowed)
     */
    override fun printAllowed(): String = unwrap(this).getPrintAllowed()

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     */
    override fun toolbarConfiguration(): Any? = unwrap(this).getToolbarConfiguration()

    /**
     * Specifies whether the user can upload files from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-uploadallowed)
     */
    override fun uploadAllowed(): String = unwrap(this).getUploadAllowed()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserSettingsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps):
        CfnUserSettingsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserSettingsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserSettingsProps):
        software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.workspacesweb.CfnUserSettingsProps
  }
}
