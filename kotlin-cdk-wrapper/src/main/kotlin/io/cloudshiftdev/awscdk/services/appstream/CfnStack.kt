@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppStream::Stack` resource creates a stack to start streaming applications to Amazon
 * AppStream 2.0 users. A stack consists of an associated fleet, user access policies, and storage
 * configurations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appstream.*;
 * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
 * .accessEndpoints(List.of(AccessEndpointProperty.builder()
 * .endpointType("endpointType")
 * .vpceId("vpceId")
 * .build()))
 * .applicationSettings(ApplicationSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .settingsGroup("settingsGroup")
 * .build())
 * .attributesToDelete(List.of("attributesToDelete"))
 * .deleteStorageConnectors(false)
 * .description("description")
 * .displayName("displayName")
 * .embedHostDomains(List.of("embedHostDomains"))
 * .feedbackUrl("feedbackUrl")
 * .name("name")
 * .redirectUrl("redirectUrl")
 * .storageConnectors(List.of(StorageConnectorProperty.builder()
 * .connectorType("connectorType")
 * // the properties below are optional
 * .domains(List.of("domains"))
 * .resourceIdentifier("resourceIdentifier")
 * .build()))
 * .streamingExperienceSettings(StreamingExperienceSettingsProperty.builder()
 * .preferredProtocol("preferredProtocol")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userSettings(List.of(UserSettingProperty.builder()
 * .action("action")
 * .permission("permission")
 * // the properties below are optional
 * .maximumLength(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html)
 */
public open class CfnStack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnStack,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.appstream.CfnStack(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackProps,
  ) :
      this(software.amazon.awscdk.services.appstream.CfnStack(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnStackProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnStackProps.Builder.() -> Unit,
  ) : this(scope, id, CfnStackProps(props)
  )

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(`value`: List<Any>) {
    unwrap(this).setAccessEndpoints(`value`)
  }

  /**
   * The list of virtual private cloud (VPC) interface endpoint objects.
   */
  public open fun accessEndpoints(vararg `value`: Any): Unit = accessEndpoints(`value`.toList())

  /**
   * The persistent application settings for users of the stack.
   */
  public open fun applicationSettings(): Any? = unwrap(this).getApplicationSettings()

  /**
   * The persistent application settings for users of the stack.
   */
  public open fun applicationSettings(`value`: IResolvable) {
    unwrap(this).setApplicationSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The persistent application settings for users of the stack.
   */
  public open fun applicationSettings(`value`: ApplicationSettingsProperty) {
    unwrap(this).setApplicationSettings(`value`.let(ApplicationSettingsProperty::unwrap))
  }

  /**
   * The persistent application settings for users of the stack.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("20b2c66862e40bacd3d87c5bed237471a91ed16bdc20283e4f47a046ebd88136")
  public open fun applicationSettings(`value`: ApplicationSettingsProperty.Builder.() -> Unit): Unit
      = applicationSettings(ApplicationSettingsProperty(`value`))

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The stack attributes to delete.
   */
  public open fun attributesToDelete(): List<String> = unwrap(this).getAttributesToDelete() ?:
      emptyList()

  /**
   * The stack attributes to delete.
   */
  public open fun attributesToDelete(`value`: List<String>) {
    unwrap(this).setAttributesToDelete(`value`)
  }

  /**
   * The stack attributes to delete.
   */
  public open fun attributesToDelete(vararg `value`: String): Unit =
      attributesToDelete(`value`.toList())

  /**
   * *This parameter has been deprecated.*.
   */
  public open fun deleteStorageConnectors(): Any? = unwrap(this).getDeleteStorageConnectors()

  /**
   * *This parameter has been deprecated.*.
   */
  public open fun deleteStorageConnectors(`value`: Boolean) {
    unwrap(this).setDeleteStorageConnectors(`value`)
  }

  /**
   * *This parameter has been deprecated.*.
   */
  public open fun deleteStorageConnectors(`value`: IResolvable) {
    unwrap(this).setDeleteStorageConnectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * The description to display.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description to display.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The stack name to display.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The stack name to display.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
   * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
   */
  public open fun embedHostDomains(): List<String> = unwrap(this).getEmbedHostDomains() ?:
      emptyList()

  /**
   * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
   * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
   */
  public open fun embedHostDomains(`value`: List<String>) {
    unwrap(this).setEmbedHostDomains(`value`)
  }

  /**
   * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
   * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
   */
  public open fun embedHostDomains(vararg `value`: String): Unit =
      embedHostDomains(`value`.toList())

  /**
   * The URL that users are redirected to after they click the Send Feedback link.
   */
  public open fun feedbackUrl(): String? = unwrap(this).getFeedbackUrl()

  /**
   * The URL that users are redirected to after they click the Send Feedback link.
   */
  public open fun feedbackUrl(`value`: String) {
    unwrap(this).setFeedbackUrl(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the stack.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the stack.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The URL that users are redirected to after their streaming session ends.
   */
  public open fun redirectUrl(): String? = unwrap(this).getRedirectUrl()

  /**
   * The URL that users are redirected to after their streaming session ends.
   */
  public open fun redirectUrl(`value`: String) {
    unwrap(this).setRedirectUrl(`value`)
  }

  /**
   * The storage connectors to enable.
   */
  public open fun storageConnectors(): Any? = unwrap(this).getStorageConnectors()

  /**
   * The storage connectors to enable.
   */
  public open fun storageConnectors(`value`: IResolvable) {
    unwrap(this).setStorageConnectors(`value`.let(IResolvable::unwrap))
  }

  /**
   * The storage connectors to enable.
   */
  public open fun storageConnectors(`value`: List<Any>) {
    unwrap(this).setStorageConnectors(`value`)
  }

  /**
   * The storage connectors to enable.
   */
  public open fun storageConnectors(vararg `value`: Any): Unit = storageConnectors(`value`.toList())

  /**
   * The streaming protocol that you want your stack to prefer.
   */
  public open fun streamingExperienceSettings(): Any? =
      unwrap(this).getStreamingExperienceSettings()

  /**
   * The streaming protocol that you want your stack to prefer.
   */
  public open fun streamingExperienceSettings(`value`: IResolvable) {
    unwrap(this).setStreamingExperienceSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The streaming protocol that you want your stack to prefer.
   */
  public open fun streamingExperienceSettings(`value`: StreamingExperienceSettingsProperty) {
    unwrap(this).setStreamingExperienceSettings(`value`.let(StreamingExperienceSettingsProperty::unwrap))
  }

  /**
   * The streaming protocol that you want your stack to prefer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d92e2d0c17ef191ab5880afdccc498244c00040f5781c30f5fb3ea535568c4c3")
  public open
      fun streamingExperienceSettings(`value`: StreamingExperienceSettingsProperty.Builder.() -> Unit):
      Unit = streamingExperienceSettings(StreamingExperienceSettingsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The actions that are enabled or disabled for users during their streaming sessions.
   */
  public open fun userSettings(): Any? = unwrap(this).getUserSettings()

  /**
   * The actions that are enabled or disabled for users during their streaming sessions.
   */
  public open fun userSettings(`value`: IResolvable) {
    unwrap(this).setUserSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The actions that are enabled or disabled for users during their streaming sessions.
   */
  public open fun userSettings(`value`: List<Any>) {
    unwrap(this).setUserSettings(`value`)
  }

  /**
   * The actions that are enabled or disabled for users during their streaming sessions.
   */
  public open fun userSettings(vararg `value`: Any): Unit = userSettings(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnStack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    public fun applicationSettings(applicationSettings: IResolvable)

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    public fun applicationSettings(applicationSettings: ApplicationSettingsProperty)

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5521ad540d558a6fa627e935cb49c5305b635b45c5dbc7afd88c845843101b7a")
    public
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit)

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     * @param attributesToDelete The stack attributes to delete. 
     */
    public fun attributesToDelete(attributesToDelete: List<String>)

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     * @param attributesToDelete The stack attributes to delete. 
     */
    public fun attributesToDelete(vararg attributesToDelete: String)

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     * @param deleteStorageConnectors *This parameter has been deprecated.*. 
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: Boolean)

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     * @param deleteStorageConnectors *This parameter has been deprecated.*. 
     */
    public fun deleteStorageConnectors(deleteStorageConnectors: IResolvable)

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description)
     * @param description The description to display. 
     */
    public fun description(description: String)

    /**
     * The stack name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname)
     * @param displayName The stack name to display. 
     */
    public fun displayName(displayName: String)

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions. 
     */
    public fun embedHostDomains(embedHostDomains: List<String>)

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions. 
     */
    public fun embedHostDomains(vararg embedHostDomains: String)

    /**
     * The URL that users are redirected to after they click the Send Feedback link.
     *
     * If no URL is specified, no Send Feedback link is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl)
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     * link. 
     */
    public fun feedbackUrl(feedbackUrl: String)

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name)
     * @param name The name of the stack. 
     */
    public fun name(name: String)

    /**
     * The URL that users are redirected to after their streaming session ends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl)
     * @param redirectUrl The URL that users are redirected to after their streaming session ends. 
     */
    public fun redirectUrl(redirectUrl: String)

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    public fun storageConnectors(storageConnectors: IResolvable)

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    public fun storageConnectors(storageConnectors: List<Any>)

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    public fun storageConnectors(vararg storageConnectors: Any)

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    public fun streamingExperienceSettings(streamingExperienceSettings: IResolvable)

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    public
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty)

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e3723ba6e054771664539223e2397dd47bc378c2e7c6b849153c4ceef8c001d")
    public
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    public fun userSettings(userSettings: IResolvable)

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    public fun userSettings(userSettings: List<Any>)

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    public fun userSettings(vararg userSettings: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnStack.Builder =
        software.amazon.awscdk.services.appstream.CfnStack.Builder.create(scope, id)

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * The list of virtual private cloud (VPC) interface endpoint objects.
     *
     * Users of the stack can connect to AppStream 2.0 only through the specified endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-accessendpoints)
     * @param accessEndpoints The list of virtual private cloud (VPC) interface endpoint objects. 
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    override fun applicationSettings(applicationSettings: IResolvable) {
      cdkBuilder.applicationSettings(applicationSettings.let(IResolvable::unwrap))
    }

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    override fun applicationSettings(applicationSettings: ApplicationSettingsProperty) {
      cdkBuilder.applicationSettings(applicationSettings.let(ApplicationSettingsProperty::unwrap))
    }

    /**
     * The persistent application settings for users of the stack.
     *
     * When these settings are enabled, changes that users make to applications and Windows settings
     * are automatically saved after each session and applied to the next session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-applicationsettings)
     * @param applicationSettings The persistent application settings for users of the stack. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5521ad540d558a6fa627e935cb49c5305b635b45c5dbc7afd88c845843101b7a")
    override
        fun applicationSettings(applicationSettings: ApplicationSettingsProperty.Builder.() -> Unit):
        Unit = applicationSettings(ApplicationSettingsProperty(applicationSettings))

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     * @param attributesToDelete The stack attributes to delete. 
     */
    override fun attributesToDelete(attributesToDelete: List<String>) {
      cdkBuilder.attributesToDelete(attributesToDelete)
    }

    /**
     * The stack attributes to delete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-attributestodelete)
     * @param attributesToDelete The stack attributes to delete. 
     */
    override fun attributesToDelete(vararg attributesToDelete: String): Unit =
        attributesToDelete(attributesToDelete.toList())

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     * @param deleteStorageConnectors *This parameter has been deprecated.*. 
     */
    override fun deleteStorageConnectors(deleteStorageConnectors: Boolean) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors)
    }

    /**
     * *This parameter has been deprecated.*.
     *
     * Deletes the storage connectors currently enabled for the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-deletestorageconnectors)
     * @param deleteStorageConnectors *This parameter has been deprecated.*. 
     */
    override fun deleteStorageConnectors(deleteStorageConnectors: IResolvable) {
      cdkBuilder.deleteStorageConnectors(deleteStorageConnectors.let(IResolvable::unwrap))
    }

    /**
     * The description to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-description)
     * @param description The description to display. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The stack name to display.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-displayname)
     * @param displayName The stack name to display. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions. 
     */
    override fun embedHostDomains(embedHostDomains: List<String>) {
      cdkBuilder.embedHostDomains(embedHostDomains)
    }

    /**
     * The domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must
     * approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-embedhostdomains)
     * @param embedHostDomains The domains where AppStream 2.0 streaming sessions can be embedded in
     * an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming
     * sessions. 
     */
    override fun embedHostDomains(vararg embedHostDomains: String): Unit =
        embedHostDomains(embedHostDomains.toList())

    /**
     * The URL that users are redirected to after they click the Send Feedback link.
     *
     * If no URL is specified, no Send Feedback link is displayed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-feedbackurl)
     * @param feedbackUrl The URL that users are redirected to after they click the Send Feedback
     * link. 
     */
    override fun feedbackUrl(feedbackUrl: String) {
      cdkBuilder.feedbackUrl(feedbackUrl)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-name)
     * @param name The name of the stack. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The URL that users are redirected to after their streaming session ends.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-redirecturl)
     * @param redirectUrl The URL that users are redirected to after their streaming session ends. 
     */
    override fun redirectUrl(redirectUrl: String) {
      cdkBuilder.redirectUrl(redirectUrl)
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    override fun storageConnectors(storageConnectors: IResolvable) {
      cdkBuilder.storageConnectors(storageConnectors.let(IResolvable::unwrap))
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    override fun storageConnectors(storageConnectors: List<Any>) {
      cdkBuilder.storageConnectors(storageConnectors)
    }

    /**
     * The storage connectors to enable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-storageconnectors)
     * @param storageConnectors The storage connectors to enable. 
     */
    override fun storageConnectors(vararg storageConnectors: Any): Unit =
        storageConnectors(storageConnectors.toList())

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    override fun streamingExperienceSettings(streamingExperienceSettings: IResolvable) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(IResolvable::unwrap))
    }

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    override
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty) {
      cdkBuilder.streamingExperienceSettings(streamingExperienceSettings.let(StreamingExperienceSettingsProperty::unwrap))
    }

    /**
     * The streaming protocol that you want your stack to prefer.
     *
     * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-streamingexperiencesettings)
     * @param streamingExperienceSettings The streaming protocol that you want your stack to prefer.
     * 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e3723ba6e054771664539223e2397dd47bc378c2e7c6b849153c4ceef8c001d")
    override
        fun streamingExperienceSettings(streamingExperienceSettings: StreamingExperienceSettingsProperty.Builder.() -> Unit):
        Unit =
        streamingExperienceSettings(StreamingExperienceSettingsProperty(streamingExperienceSettings))

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    override fun userSettings(userSettings: List<Any>) {
      cdkBuilder.userSettings(userSettings)
    }

    /**
     * The actions that are enabled or disabled for users during their streaming sessions.
     *
     * By default, these actions are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stack.html#cfn-appstream-stack-usersettings)
     * @param userSettings The actions that are enabled or disabled for users during their streaming
     * sessions. 
     */
    override fun userSettings(vararg userSettings: Any): Unit = userSettings(userSettings.toList())

    public fun build(): software.amazon.awscdk.services.appstream.CfnStack = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnStack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack): CfnStack =
        CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.services.appstream.CfnStack =
        wrapped.cdkObject
  }

  /**
   * Describes an interface VPC endpoint (interface endpoint) that lets you create a private
   * connection between the virtual private cloud (VPC) that you specify and AppStream 2.0. When you
   * specify an interface endpoint for a stack, users of the stack can connect to AppStream 2.0 only
   * through that endpoint. When you specify an interface endpoint for an image builder, administrators
   * can connect to the image builder only through that endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * AccessEndpointProperty accessEndpointProperty = AccessEndpointProperty.builder()
   * .endpointType("endpointType")
   * .vpceId("vpceId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html)
   */
  public interface AccessEndpointProperty {
    /**
     * The type of interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype)
     */
    public fun endpointType(): String

    /**
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid)
     */
    public fun vpceId(): String

    /**
     * A builder for [AccessEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointType The type of interface endpoint. 
       */
      public fun endpointType(endpointType: String)

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty.builder()

      /**
       * @param endpointType The type of interface endpoint. 
       */
      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty,
    ) : CdkObject(cdkObject), AccessEndpointProperty {
      /**
       * The type of interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-endpointtype)
       */
      override fun endpointType(): String = unwrap(this).getEndpointType()

      /**
       * The identifier (ID) of the VPC in which the interface endpoint is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-accessendpoint.html#cfn-appstream-stack-accessendpoint-vpceid)
       */
      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty):
          AccessEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnStack.AccessEndpointProperty
    }
  }

  /**
   * The persistent application settings for users of a stack.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * ApplicationSettingsProperty applicationSettingsProperty = ApplicationSettingsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .settingsGroup("settingsGroup")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html)
   */
  public interface ApplicationSettingsProperty {
    /**
     * Enables or disables persistent application settings for users during their streaming
     * sessions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html#cfn-appstream-stack-applicationsettings-enabled)
     */
    public fun enabled(): Any

    /**
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     *
     * You can allow the same persistent application settings to be used across multiple stacks by
     * specifying the same settings group for each stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html#cfn-appstream-stack-applicationsettings-settingsgroup)
     */
    public fun settingsGroup(): String? = unwrap(this).getSettingsGroup()

    /**
     * A builder for [ApplicationSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Enables or disables persistent application settings for users during their
       * streaming sessions. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enables or disables persistent application settings for users during their
       * streaming sessions. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
       * settings are stored.
       * You can allow the same persistent application settings to be used across multiple stacks by
       * specifying the same settings group for each stack.
       */
      public fun tingsGroup(settingsGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty.builder()

      /**
       * @param enabled Enables or disables persistent application settings for users during their
       * streaming sessions. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enables or disables persistent application settings for users during their
       * streaming sessions. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param settingsGroup The path prefix for the S3 bucket where users’ persistent application
       * settings are stored.
       * You can allow the same persistent application settings to be used across multiple stacks by
       * specifying the same settings group for each stack.
       */
      override fun tingsGroup(settingsGroup: String) {
        cdkBuilder.settingsGroup(settingsGroup)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty,
    ) : CdkObject(cdkObject), ApplicationSettingsProperty {
      /**
       * Enables or disables persistent application settings for users during their streaming
       * sessions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html#cfn-appstream-stack-applicationsettings-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The path prefix for the S3 bucket where users’ persistent application settings are stored.
       *
       * You can allow the same persistent application settings to be used across multiple stacks by
       * specifying the same settings group for each stack.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-applicationsettings.html#cfn-appstream-stack-applicationsettings-settingsgroup)
       */
      override fun settingsGroup(): String? = unwrap(this).getSettingsGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty):
          ApplicationSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ApplicationSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationSettingsProperty):
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnStack.ApplicationSettingsProperty
    }
  }

  /**
   * A connector that enables persistent storage for users.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * StorageConnectorProperty storageConnectorProperty = StorageConnectorProperty.builder()
   * .connectorType("connectorType")
   * // the properties below are optional
   * .domains(List.of("domains"))
   * .resourceIdentifier("resourceIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html)
   */
  public interface StorageConnectorProperty {
    /**
     * The type of storage connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype)
     */
    public fun connectorType(): String

    /**
     * The names of the domains for the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains)
     */
    public fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

    /**
     * The ARN of the storage connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier)
     */
    public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    /**
     * A builder for [StorageConnectorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectorType The type of storage connector. 
       */
      public fun connectorType(connectorType: String)

      /**
       * @param domains The names of the domains for the account.
       */
      public fun domains(domains: List<String>)

      /**
       * @param domains The names of the domains for the account.
       */
      public fun domains(vararg domains: String)

      /**
       * @param resourceIdentifier The ARN of the storage connector.
       */
      public fun resourceIdentifier(resourceIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty.builder()

      /**
       * @param connectorType The type of storage connector. 
       */
      override fun connectorType(connectorType: String) {
        cdkBuilder.connectorType(connectorType)
      }

      /**
       * @param domains The names of the domains for the account.
       */
      override fun domains(domains: List<String>) {
        cdkBuilder.domains(domains)
      }

      /**
       * @param domains The names of the domains for the account.
       */
      override fun domains(vararg domains: String): Unit = domains(domains.toList())

      /**
       * @param resourceIdentifier The ARN of the storage connector.
       */
      override fun resourceIdentifier(resourceIdentifier: String) {
        cdkBuilder.resourceIdentifier(resourceIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty,
    ) : CdkObject(cdkObject), StorageConnectorProperty {
      /**
       * The type of storage connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-connectortype)
       */
      override fun connectorType(): String = unwrap(this).getConnectorType()

      /**
       * The names of the domains for the account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-domains)
       */
      override fun domains(): List<String> = unwrap(this).getDomains() ?: emptyList()

      /**
       * The ARN of the storage connector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-storageconnector.html#cfn-appstream-stack-storageconnector-resourceidentifier)
       */
      override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageConnectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty):
          StorageConnectorProperty = CdkObjectWrappers.wrap(cdkObject) as? StorageConnectorProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageConnectorProperty):
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnStack.StorageConnectorProperty
    }
  }

  /**
   * The streaming protocol that you want your stack to prefer.
   *
   * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * StreamingExperienceSettingsProperty streamingExperienceSettingsProperty =
   * StreamingExperienceSettingsProperty.builder()
   * .preferredProtocol("preferredProtocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-streamingexperiencesettings.html)
   */
  public interface StreamingExperienceSettingsProperty {
    /**
     * The preferred protocol that you want to use while streaming your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-streamingexperiencesettings.html#cfn-appstream-stack-streamingexperiencesettings-preferredprotocol)
     */
    public fun preferredProtocol(): String? = unwrap(this).getPreferredProtocol()

    /**
     * A builder for [StreamingExperienceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param preferredProtocol The preferred protocol that you want to use while streaming your
       * application.
       */
      public fun preferredProtocol(preferredProtocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty.builder()

      /**
       * @param preferredProtocol The preferred protocol that you want to use while streaming your
       * application.
       */
      override fun preferredProtocol(preferredProtocol: String) {
        cdkBuilder.preferredProtocol(preferredProtocol)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty,
    ) : CdkObject(cdkObject), StreamingExperienceSettingsProperty {
      /**
       * The preferred protocol that you want to use while streaming your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-streamingexperiencesettings.html#cfn-appstream-stack-streamingexperiencesettings-preferredprotocol)
       */
      override fun preferredProtocol(): String? = unwrap(this).getPreferredProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StreamingExperienceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty):
          StreamingExperienceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StreamingExperienceSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamingExperienceSettingsProperty):
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnStack.StreamingExperienceSettingsProperty
    }
  }

  /**
   * Specifies an action and whether the action is enabled or disabled for users during their
   * streaming sessions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appstream.*;
   * UserSettingProperty userSettingProperty = UserSettingProperty.builder()
   * .action("action")
   * .permission("permission")
   * // the properties below are optional
   * .maximumLength(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html)
   */
  public interface UserSettingProperty {
    /**
     * The action that is enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-action)
     */
    public fun action(): String

    /**
     * Specifies the number of characters that can be copied by end users from the local device to
     * the remote session, and to the local device from the remote session.
     *
     * This can be specified only for the `CLIPBOARD_COPY_FROM_LOCAL_DEVICE` and
     * `CLIPBOARD_COPY_TO_LOCAL_DEVICE` actions.
     *
     * This defaults to 20,971,520 (20 MB) when unspecified and the permission is `ENABLED` . This
     * can't be specified when the permission is `DISABLED` .
     *
     * The value can be between 1 and 20,971,520 (20 MB).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-maximumlength)
     */
    public fun maximumLength(): Number? = unwrap(this).getMaximumLength()

    /**
     * Indicates whether the action is enabled or disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-permission)
     */
    public fun permission(): String

    /**
     * A builder for [UserSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that is enabled or disabled. 
       */
      public fun action(action: String)

      /**
       * @param maximumLength Specifies the number of characters that can be copied by end users
       * from the local device to the remote session, and to the local device from the remote session.
       * This can be specified only for the `CLIPBOARD_COPY_FROM_LOCAL_DEVICE` and
       * `CLIPBOARD_COPY_TO_LOCAL_DEVICE` actions.
       *
       * This defaults to 20,971,520 (20 MB) when unspecified and the permission is `ENABLED` . This
       * can't be specified when the permission is `DISABLED` .
       *
       * The value can be between 1 and 20,971,520 (20 MB).
       */
      public fun maximumLength(maximumLength: Number)

      /**
       * @param permission Indicates whether the action is enabled or disabled. 
       */
      public fun permission(permission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.builder()

      /**
       * @param action The action that is enabled or disabled. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param maximumLength Specifies the number of characters that can be copied by end users
       * from the local device to the remote session, and to the local device from the remote session.
       * This can be specified only for the `CLIPBOARD_COPY_FROM_LOCAL_DEVICE` and
       * `CLIPBOARD_COPY_TO_LOCAL_DEVICE` actions.
       *
       * This defaults to 20,971,520 (20 MB) when unspecified and the permission is `ENABLED` . This
       * can't be specified when the permission is `DISABLED` .
       *
       * The value can be between 1 and 20,971,520 (20 MB).
       */
      override fun maximumLength(maximumLength: Number) {
        cdkBuilder.maximumLength(maximumLength)
      }

      /**
       * @param permission Indicates whether the action is enabled or disabled. 
       */
      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public fun build(): software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty,
    ) : CdkObject(cdkObject), UserSettingProperty {
      /**
       * The action that is enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * Specifies the number of characters that can be copied by end users from the local device to
       * the remote session, and to the local device from the remote session.
       *
       * This can be specified only for the `CLIPBOARD_COPY_FROM_LOCAL_DEVICE` and
       * `CLIPBOARD_COPY_TO_LOCAL_DEVICE` actions.
       *
       * This defaults to 20,971,520 (20 MB) when unspecified and the permission is `ENABLED` . This
       * can't be specified when the permission is `DISABLED` .
       *
       * The value can be between 1 and 20,971,520 (20 MB).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-maximumlength)
       */
      override fun maximumLength(): Number? = unwrap(this).getMaximumLength()

      /**
       * Indicates whether the action is enabled or disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-usersetting.html#cfn-appstream-stack-usersetting-permission)
       */
      override fun permission(): String = unwrap(this).getPermission()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty):
          UserSettingProperty = CdkObjectWrappers.wrap(cdkObject) as? UserSettingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserSettingProperty):
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty
    }
  }
}
