@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * This resource specifies user settings that can be associated with a web portal.
 *
 * Once associated with a web portal, user settings control how users can transfer data between a
 * streaming session and the their local devices.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
 * CfnUserSettings cfnUserSettings = CfnUserSettings.Builder.create(this, "MyCfnUserSettings")
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
public open class CfnUserSettings(
  cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserSettingsProps,
  ) :
      this(software.amazon.awscdk.services.workspacesweb.CfnUserSettings(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUserSettingsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserSettingsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserSettingsProps(props)
  )

  /**
   * The additional encryption context of the user settings.
   */
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  /**
   * The additional encryption context of the user settings.
   */
  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  /**
   * The additional encryption context of the user settings.
   */
  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of web portal ARNs that this user settings resource is associated with.
   */
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  /**
   * The ARN of the user settings.
   */
  public open fun attrUserSettingsArn(): String = unwrap(this).getAttrUserSettingsArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   */
  public open fun cookieSynchronizationConfiguration(): Any? =
      unwrap(this).getCookieSynchronizationConfiguration()

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   */
  public open fun cookieSynchronizationConfiguration(`value`: IResolvable) {
    unwrap(this).setCookieSynchronizationConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   */
  public open
      fun cookieSynchronizationConfiguration(`value`: CookieSynchronizationConfigurationProperty) {
    unwrap(this).setCookieSynchronizationConfiguration(`value`.let(CookieSynchronizationConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0b18b9ab10ccafece27ca119825a94d144595dceb17da12c0d27fa1e2d094259")
  public open
      fun cookieSynchronizationConfiguration(`value`: CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
      Unit = cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty(`value`))

  /**
   * Specifies whether the user can copy text from the streaming session to the local device.
   */
  public open fun copyAllowed(): String = unwrap(this).getCopyAllowed()

  /**
   * Specifies whether the user can copy text from the streaming session to the local device.
   */
  public open fun copyAllowed(`value`: String) {
    unwrap(this).setCopyAllowed(`value`)
  }

  /**
   * The customer managed key used to encrypt sensitive information in the user settings.
   */
  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  /**
   * The customer managed key used to encrypt sensitive information in the user settings.
   */
  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  /**
   * Specifies whether the user can use deep links that open automatically when connecting to a
   * session.
   */
  public open fun deepLinkAllowed(): String? = unwrap(this).getDeepLinkAllowed()

  /**
   * Specifies whether the user can use deep links that open automatically when connecting to a
   * session.
   */
  public open fun deepLinkAllowed(`value`: String) {
    unwrap(this).setDeepLinkAllowed(`value`)
  }

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   */
  public open fun disconnectTimeoutInMinutes(): Number? =
      unwrap(this).getDisconnectTimeoutInMinutes()

  /**
   * The amount of time that a streaming session remains active after users disconnect.
   */
  public open fun disconnectTimeoutInMinutes(`value`: Number) {
    unwrap(this).setDisconnectTimeoutInMinutes(`value`)
  }

  /**
   * Specifies whether the user can download files from the streaming session to the local device.
   */
  public open fun downloadAllowed(): String = unwrap(this).getDownloadAllowed()

  /**
   * Specifies whether the user can download files from the streaming session to the local device.
   */
  public open fun downloadAllowed(`value`: String) {
    unwrap(this).setDownloadAllowed(`value`)
  }

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the disconnect timeout interval begins.
   */
  public open fun idleDisconnectTimeoutInMinutes(): Number? =
      unwrap(this).getIdleDisconnectTimeoutInMinutes()

  /**
   * The amount of time that users can be idle (inactive) before they are disconnected from their
   * streaming session and the disconnect timeout interval begins.
   */
  public open fun idleDisconnectTimeoutInMinutes(`value`: Number) {
    unwrap(this).setIdleDisconnectTimeoutInMinutes(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Specifies whether the user can paste text from the local device to the streaming session.
   */
  public open fun pasteAllowed(): String = unwrap(this).getPasteAllowed()

  /**
   * Specifies whether the user can paste text from the local device to the streaming session.
   */
  public open fun pasteAllowed(`value`: String) {
    unwrap(this).setPasteAllowed(`value`)
  }

  /**
   * Specifies whether the user can print to the local device.
   */
  public open fun printAllowed(): String = unwrap(this).getPrintAllowed()

  /**
   * Specifies whether the user can print to the local device.
   */
  public open fun printAllowed(`value`: String) {
    unwrap(this).setPrintAllowed(`value`)
  }

  /**
   * The tags to add to the user settings resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to add to the user settings resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to add to the user settings resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The configuration of the toolbar.
   */
  public open fun toolbarConfiguration(): Any? = unwrap(this).getToolbarConfiguration()

  /**
   * The configuration of the toolbar.
   */
  public open fun toolbarConfiguration(`value`: IResolvable) {
    unwrap(this).setToolbarConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration of the toolbar.
   */
  public open fun toolbarConfiguration(`value`: ToolbarConfigurationProperty) {
    unwrap(this).setToolbarConfiguration(`value`.let(ToolbarConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration of the toolbar.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f9a2a7199798cd73c22a7e477c97289740fce784b4369b3a1c6f8ef325562a0")
  public open fun toolbarConfiguration(`value`: ToolbarConfigurationProperty.Builder.() -> Unit):
      Unit = toolbarConfiguration(ToolbarConfigurationProperty(`value`))

  /**
   * Specifies whether the user can upload files from the local device to the streaming session.
   */
  public open fun uploadAllowed(): String = unwrap(this).getUploadAllowed()

  /**
   * Specifies whether the user can upload files from the local device to the streaming session.
   */
  public open fun uploadAllowed(`value`: String) {
    unwrap(this).setUploadAllowed(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.workspacesweb.CfnUserSettings].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The additional encryption context of the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the user settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    /**
     * The additional encryption context of the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the user settings. 
     */
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    public fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable)

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty)

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb5a968876b8ff47bab3c96a6738da36f0321b45e40f0b06cbde77afdab9ff35")
    public
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies whether the user can copy text from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-copyallowed)
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     * local device. 
     */
    public fun copyAllowed(copyAllowed: String)

    /**
     * The customer managed key used to encrypt sensitive information in the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-customermanagedkey)
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the user settings. 
     */
    public fun customerManagedKey(customerManagedKey: String)

    /**
     * Specifies whether the user can use deep links that open automatically when connecting to a
     * session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-deeplinkallowed)
     * @param deepLinkAllowed Specifies whether the user can use deep links that open automatically
     * when connecting to a session. 
     */
    public fun deepLinkAllowed(deepLinkAllowed: String)

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-disconnecttimeoutinminutes)
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     * after users disconnect. 
     */
    public fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number)

    /**
     * Specifies whether the user can download files from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-downloadallowed)
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     * session to the local device. 
     */
    public fun downloadAllowed(downloadAllowed: String)

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the disconnect timeout interval begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-idledisconnecttimeoutinminutes)
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the disconnect timeout interval
     * begins. 
     */
    public fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number)

    /**
     * Specifies whether the user can paste text from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-pasteallowed)
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     * streaming session. 
     */
    public fun pasteAllowed(pasteAllowed: String)

    /**
     * Specifies whether the user can print to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-printallowed)
     * @param printAllowed Specifies whether the user can print to the local device. 
     */
    public fun printAllowed(printAllowed: String)

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     * @param tags The tags to add to the user settings resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     * @param tags The tags to add to the user settings resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    public fun toolbarConfiguration(toolbarConfiguration: IResolvable)

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    public fun toolbarConfiguration(toolbarConfiguration: ToolbarConfigurationProperty)

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111023312fedd986cb5a900ad147e4147fe99f064aba814338f0128861640025")
    public
        fun toolbarConfiguration(toolbarConfiguration: ToolbarConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies whether the user can upload files from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-uploadallowed)
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     * streaming session. 
     */
    public fun uploadAllowed(uploadAllowed: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings.Builder.create(scope, id)

    /**
     * The additional encryption context of the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the user settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    /**
     * The additional encryption context of the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-additionalencryptioncontext)
     * @param additionalEncryptionContext The additional encryption context of the user settings. 
     */
    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: IResolvable) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty) {
      cdkBuilder.cookieSynchronizationConfiguration(cookieSynchronizationConfiguration.let(CookieSynchronizationConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration that specifies which cookies should be synchronized from the end user's
     * local browser to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration)
     * @param cookieSynchronizationConfiguration The configuration that specifies which cookies
     * should be synchronized from the end user's local browser to the remote browser. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb5a968876b8ff47bab3c96a6738da36f0321b45e40f0b06cbde77afdab9ff35")
    override
        fun cookieSynchronizationConfiguration(cookieSynchronizationConfiguration: CookieSynchronizationConfigurationProperty.Builder.() -> Unit):
        Unit =
        cookieSynchronizationConfiguration(CookieSynchronizationConfigurationProperty(cookieSynchronizationConfiguration))

    /**
     * Specifies whether the user can copy text from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-copyallowed)
     * @param copyAllowed Specifies whether the user can copy text from the streaming session to the
     * local device. 
     */
    override fun copyAllowed(copyAllowed: String) {
      cdkBuilder.copyAllowed(copyAllowed)
    }

    /**
     * The customer managed key used to encrypt sensitive information in the user settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-customermanagedkey)
     * @param customerManagedKey The customer managed key used to encrypt sensitive information in
     * the user settings. 
     */
    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    /**
     * Specifies whether the user can use deep links that open automatically when connecting to a
     * session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-deeplinkallowed)
     * @param deepLinkAllowed Specifies whether the user can use deep links that open automatically
     * when connecting to a session. 
     */
    override fun deepLinkAllowed(deepLinkAllowed: String) {
      cdkBuilder.deepLinkAllowed(deepLinkAllowed)
    }

    /**
     * The amount of time that a streaming session remains active after users disconnect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-disconnecttimeoutinminutes)
     * @param disconnectTimeoutInMinutes The amount of time that a streaming session remains active
     * after users disconnect. 
     */
    override fun disconnectTimeoutInMinutes(disconnectTimeoutInMinutes: Number) {
      cdkBuilder.disconnectTimeoutInMinutes(disconnectTimeoutInMinutes)
    }

    /**
     * Specifies whether the user can download files from the streaming session to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-downloadallowed)
     * @param downloadAllowed Specifies whether the user can download files from the streaming
     * session to the local device. 
     */
    override fun downloadAllowed(downloadAllowed: String) {
      cdkBuilder.downloadAllowed(downloadAllowed)
    }

    /**
     * The amount of time that users can be idle (inactive) before they are disconnected from their
     * streaming session and the disconnect timeout interval begins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-idledisconnecttimeoutinminutes)
     * @param idleDisconnectTimeoutInMinutes The amount of time that users can be idle (inactive)
     * before they are disconnected from their streaming session and the disconnect timeout interval
     * begins. 
     */
    override fun idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes: Number) {
      cdkBuilder.idleDisconnectTimeoutInMinutes(idleDisconnectTimeoutInMinutes)
    }

    /**
     * Specifies whether the user can paste text from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-pasteallowed)
     * @param pasteAllowed Specifies whether the user can paste text from the local device to the
     * streaming session. 
     */
    override fun pasteAllowed(pasteAllowed: String) {
      cdkBuilder.pasteAllowed(pasteAllowed)
    }

    /**
     * Specifies whether the user can print to the local device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-printallowed)
     * @param printAllowed Specifies whether the user can print to the local device. 
     */
    override fun printAllowed(printAllowed: String) {
      cdkBuilder.printAllowed(printAllowed)
    }

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     * @param tags The tags to add to the user settings resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to add to the user settings resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-tags)
     * @param tags The tags to add to the user settings resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    override fun toolbarConfiguration(toolbarConfiguration: IResolvable) {
      cdkBuilder.toolbarConfiguration(toolbarConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    override fun toolbarConfiguration(toolbarConfiguration: ToolbarConfigurationProperty) {
      cdkBuilder.toolbarConfiguration(toolbarConfiguration.let(ToolbarConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration of the toolbar.
     *
     * This allows administrators to select the toolbar type and visual mode, set maximum display
     * resolution for sessions, and choose which items are visible to end users during their sessions.
     * If administrators do not modify these settings, end users retain control over their toolbar
     * preferences.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-toolbarconfiguration)
     * @param toolbarConfiguration The configuration of the toolbar. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("111023312fedd986cb5a900ad147e4147fe99f064aba814338f0128861640025")
    override
        fun toolbarConfiguration(toolbarConfiguration: ToolbarConfigurationProperty.Builder.() -> Unit):
        Unit = toolbarConfiguration(ToolbarConfigurationProperty(toolbarConfiguration))

    /**
     * Specifies whether the user can upload files from the local device to the streaming session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-usersettings.html#cfn-workspacesweb-usersettings-uploadallowed)
     * @param uploadAllowed Specifies whether the user can upload files from the local device to the
     * streaming session. 
     */
    override fun uploadAllowed(uploadAllowed: String) {
      cdkBuilder.uploadAllowed(uploadAllowed)
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings = wrapped.cdkObject as
        software.amazon.awscdk.services.workspacesweb.CfnUserSettings
  }

  /**
   * Specifies a single cookie or set of cookies in an end user's browser.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * CookieSpecificationProperty cookieSpecificationProperty = CookieSpecificationProperty.builder()
   * .domain("domain")
   * // the properties below are optional
   * .name("name")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html)
   */
  public interface CookieSpecificationProperty {
    /**
     * The domain of the cookie.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-domain)
     */
    public fun domain(): String

    /**
     * The name of the cookie.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The path of the cookie.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [CookieSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param domain The domain of the cookie. 
       */
      public fun domain(domain: String)

      /**
       * @param name The name of the cookie.
       */
      public fun name(name: String)

      /**
       * @param path The path of the cookie.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty.builder()

      /**
       * @param domain The domain of the cookie. 
       */
      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      /**
       * @param name The name of the cookie.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param path The path of the cookie.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty,
    ) : CdkObject(cdkObject),
        CookieSpecificationProperty {
      /**
       * The domain of the cookie.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-domain)
       */
      override fun domain(): String = unwrap(this).getDomain()

      /**
       * The name of the cookie.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The path of the cookie.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiespecification.html#cfn-workspacesweb-usersettings-cookiespecification-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookieSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty):
          CookieSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CookieSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieSpecificationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSpecificationProperty
    }
  }

  /**
   * The configuration that specifies which cookies should be synchronized from the end user's local
   * browser to the remote browser.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * CookieSynchronizationConfigurationProperty cookieSynchronizationConfigurationProperty =
   * CookieSynchronizationConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html)
   */
  public interface CookieSynchronizationConfigurationProperty {
    /**
     * The list of cookie specifications that are allowed to be synchronized to the remote browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration-allowlist)
     */
    public fun allowlist(): Any

    /**
     * The list of cookie specifications that are blocked from being synchronized to the remote
     * browser.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration-blocklist)
     */
    public fun blocklist(): Any? = unwrap(this).getBlocklist()

    /**
     * A builder for [CookieSynchronizationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      public fun allowlist(allowlist: IResolvable)

      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      public fun allowlist(allowlist: List<Any>)

      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      public fun allowlist(vararg allowlist: Any)

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      public fun blocklist(blocklist: IResolvable)

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      public fun blocklist(blocklist: List<Any>)

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      public fun blocklist(vararg blocklist: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty.builder()

      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      override fun allowlist(allowlist: IResolvable) {
        cdkBuilder.allowlist(allowlist.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      override fun allowlist(allowlist: List<Any>) {
        cdkBuilder.allowlist(allowlist.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param allowlist The list of cookie specifications that are allowed to be synchronized to
       * the remote browser. 
       */
      override fun allowlist(vararg allowlist: Any): Unit = allowlist(allowlist.toList())

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      override fun blocklist(blocklist: IResolvable) {
        cdkBuilder.blocklist(blocklist.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      override fun blocklist(blocklist: List<Any>) {
        cdkBuilder.blocklist(blocklist.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param blocklist The list of cookie specifications that are blocked from being synchronized
       * to the remote browser.
       */
      override fun blocklist(vararg blocklist: Any): Unit = blocklist(blocklist.toList())

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty,
    ) : CdkObject(cdkObject),
        CookieSynchronizationConfigurationProperty {
      /**
       * The list of cookie specifications that are allowed to be synchronized to the remote
       * browser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration-allowlist)
       */
      override fun allowlist(): Any = unwrap(this).getAllowlist()

      /**
       * The list of cookie specifications that are blocked from being synchronized to the remote
       * browser.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-cookiesynchronizationconfiguration.html#cfn-workspacesweb-usersettings-cookiesynchronizationconfiguration-blocklist)
       */
      override fun blocklist(): Any? = unwrap(this).getBlocklist()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CookieSynchronizationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty):
          CookieSynchronizationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CookieSynchronizationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieSynchronizationConfigurationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.CookieSynchronizationConfigurationProperty
    }
  }

  /**
   * The configuration of the toolbar.
   *
   * This allows administrators to select the toolbar type and visual mode, set maximum display
   * resolution for sessions, and choose which items are visible to end users during their sessions. If
   * administrators do not modify these settings, end users retain control over their toolbar
   * preferences.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.workspacesweb.*;
   * ToolbarConfigurationProperty toolbarConfigurationProperty =
   * ToolbarConfigurationProperty.builder()
   * .hiddenToolbarItems(List.of("hiddenToolbarItems"))
   * .maxDisplayResolution("maxDisplayResolution")
   * .toolbarType("toolbarType")
   * .visualMode("visualMode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html)
   */
  public interface ToolbarConfigurationProperty {
    /**
     * The list of toolbar items to be hidden.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-hiddentoolbaritems)
     */
    public fun hiddenToolbarItems(): List<String> = unwrap(this).getHiddenToolbarItems() ?:
        emptyList()

    /**
     * The maximum display resolution that is allowed for the session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-maxdisplayresolution)
     */
    public fun maxDisplayResolution(): String? = unwrap(this).getMaxDisplayResolution()

    /**
     * The type of toolbar displayed during the session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-toolbartype)
     */
    public fun toolbarType(): String? = unwrap(this).getToolbarType()

    /**
     * The visual mode of the toolbar.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-visualmode)
     */
    public fun visualMode(): String? = unwrap(this).getVisualMode()

    /**
     * A builder for [ToolbarConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hiddenToolbarItems The list of toolbar items to be hidden.
       */
      public fun hiddenToolbarItems(hiddenToolbarItems: List<String>)

      /**
       * @param hiddenToolbarItems The list of toolbar items to be hidden.
       */
      public fun hiddenToolbarItems(vararg hiddenToolbarItems: String)

      /**
       * @param maxDisplayResolution The maximum display resolution that is allowed for the session.
       */
      public fun maxDisplayResolution(maxDisplayResolution: String)

      /**
       * @param toolbarType The type of toolbar displayed during the session.
       */
      public fun toolbarType(toolbarType: String)

      /**
       * @param visualMode The visual mode of the toolbar.
       */
      public fun visualMode(visualMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty.builder()

      /**
       * @param hiddenToolbarItems The list of toolbar items to be hidden.
       */
      override fun hiddenToolbarItems(hiddenToolbarItems: List<String>) {
        cdkBuilder.hiddenToolbarItems(hiddenToolbarItems)
      }

      /**
       * @param hiddenToolbarItems The list of toolbar items to be hidden.
       */
      override fun hiddenToolbarItems(vararg hiddenToolbarItems: String): Unit =
          hiddenToolbarItems(hiddenToolbarItems.toList())

      /**
       * @param maxDisplayResolution The maximum display resolution that is allowed for the session.
       */
      override fun maxDisplayResolution(maxDisplayResolution: String) {
        cdkBuilder.maxDisplayResolution(maxDisplayResolution)
      }

      /**
       * @param toolbarType The type of toolbar displayed during the session.
       */
      override fun toolbarType(toolbarType: String) {
        cdkBuilder.toolbarType(toolbarType)
      }

      /**
       * @param visualMode The visual mode of the toolbar.
       */
      override fun visualMode(visualMode: String) {
        cdkBuilder.visualMode(visualMode)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty,
    ) : CdkObject(cdkObject),
        ToolbarConfigurationProperty {
      /**
       * The list of toolbar items to be hidden.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-hiddentoolbaritems)
       */
      override fun hiddenToolbarItems(): List<String> = unwrap(this).getHiddenToolbarItems() ?:
          emptyList()

      /**
       * The maximum display resolution that is allowed for the session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-maxdisplayresolution)
       */
      override fun maxDisplayResolution(): String? = unwrap(this).getMaxDisplayResolution()

      /**
       * The type of toolbar displayed during the session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-toolbartype)
       */
      override fun toolbarType(): String? = unwrap(this).getToolbarType()

      /**
       * The visual mode of the toolbar.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-usersettings-toolbarconfiguration.html#cfn-workspacesweb-usersettings-toolbarconfiguration-visualmode)
       */
      override fun visualMode(): String? = unwrap(this).getVisualMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ToolbarConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty):
          ToolbarConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ToolbarConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ToolbarConfigurationProperty):
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnUserSettings.ToolbarConfigurationProperty
    }
  }
}
