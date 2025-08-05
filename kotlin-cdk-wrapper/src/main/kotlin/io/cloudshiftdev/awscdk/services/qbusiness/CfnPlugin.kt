@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Information about an Amazon Q Business plugin and its configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * Object noAuthConfiguration;
 * CfnPlugin cfnPlugin = CfnPlugin.Builder.create(this, "MyCfnPlugin")
 * .authConfiguration(PluginAuthConfigurationProperty.builder()
 * .basicAuthConfiguration(BasicAuthConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .secretArn("secretArn")
 * .build())
 * .noAuthConfiguration(noAuthConfiguration)
 * .oAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .secretArn("secretArn")
 * // the properties below are optional
 * .authorizationUrl("authorizationUrl")
 * .tokenUrl("tokenUrl")
 * .build())
 * .build())
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .applicationId("applicationId")
 * .customPluginConfiguration(CustomPluginConfigurationProperty.builder()
 * .apiSchema(APISchemaProperty.builder()
 * .payload("payload")
 * .s3(S3Property.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .apiSchemaType("apiSchemaType")
 * .description("description")
 * .build())
 * .serverUrl("serverUrl")
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html)
 */
public open class CfnPlugin(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPluginProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnPlugin(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPluginProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPluginProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPluginProps(props)
  )

  /**
   * The identifier of the application that will contain the plugin.
   */
  public open fun applicationId(): String? = unwrap(this).getApplicationId()

  /**
   * The identifier of the application that will contain the plugin.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The current status of a plugin.
   *
   * A plugin is modified asynchronously.
   */
  public open fun attrBuildStatus(): String = unwrap(this).getAttrBuildStatus()

  /**
   * The timestamp for when the plugin was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of a plugin.
   */
  public open fun attrPluginArn(): String = unwrap(this).getAttrPluginArn()

  /**
   * The identifier of the plugin.
   */
  public open fun attrPluginId(): String = unwrap(this).getAttrPluginId()

  /**
   * The timestamp for when the plugin was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   */
  public open fun authConfiguration(): Any = unwrap(this).getAuthConfiguration()

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   */
  public open fun authConfiguration(`value`: IResolvable) {
    unwrap(this).setAuthConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   */
  public open fun authConfiguration(`value`: PluginAuthConfigurationProperty) {
    unwrap(this).setAuthConfiguration(`value`.let(PluginAuthConfigurationProperty.Companion::unwrap))
  }

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fb6257db51ac4bfa3d3925debdd4a0956255852b02c5dd0ff8d05c6f2866bc1a")
  public open fun authConfiguration(`value`: PluginAuthConfigurationProperty.Builder.() -> Unit):
      Unit = authConfiguration(PluginAuthConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Configuration information required to create a custom plugin.
   */
  public open fun customPluginConfiguration(): Any? = unwrap(this).getCustomPluginConfiguration()

  /**
   * Configuration information required to create a custom plugin.
   */
  public open fun customPluginConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomPluginConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration information required to create a custom plugin.
   */
  public open fun customPluginConfiguration(`value`: CustomPluginConfigurationProperty) {
    unwrap(this).setCustomPluginConfiguration(`value`.let(CustomPluginConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration information required to create a custom plugin.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b1600aa54e915464dc73038099a01d160b70ec964f5f479e74336a6550e1ecfe")
  public open
      fun customPluginConfiguration(`value`: CustomPluginConfigurationProperty.Builder.() -> Unit):
      Unit = customPluginConfiguration(CustomPluginConfigurationProperty(`value`))

  /**
   * The name of the plugin.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the plugin.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * The plugin server URL used for configuration.
   */
  public open fun serverUrl(): String? = unwrap(this).getServerUrl()

  /**
   * The plugin server URL used for configuration.
   */
  public open fun serverUrl(`value`: String) {
    unwrap(this).setServerUrl(`value`)
  }

  /**
   * The current status of the plugin.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The current status of the plugin.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of the plugin.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of the plugin.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnPlugin].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the application that will contain the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-applicationid)
     * @param applicationId The identifier of the application that will contain the plugin. 
     */
    public fun applicationId(applicationId: String)

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    public fun authConfiguration(authConfiguration: IResolvable)

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    public fun authConfiguration(authConfiguration: PluginAuthConfigurationProperty)

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4ef85e5e13f470eb3b7919a33060cb7b1562ba604d768f80b11499ff3b9de45")
    public
        fun authConfiguration(authConfiguration: PluginAuthConfigurationProperty.Builder.() -> Unit)

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    public fun customPluginConfiguration(customPluginConfiguration: IResolvable)

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    public
        fun customPluginConfiguration(customPluginConfiguration: CustomPluginConfigurationProperty)

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a31f8a7e22f0de887308587fbc5481902f65d53b9c93234ad64a3325d0a0c1")
    public
        fun customPluginConfiguration(customPluginConfiguration: CustomPluginConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-displayname)
     * @param displayName The name of the plugin. 
     */
    public fun displayName(displayName: String)

    /**
     * The plugin server URL used for configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-serverurl)
     * @param serverUrl The plugin server URL used for configuration. 
     */
    public fun serverUrl(serverUrl: String)

    /**
     * The current status of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-state)
     * @param state The current status of the plugin. 
     */
    public fun state(state: String)

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-type)
     * @param type The type of the plugin. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPlugin.Builder =
        software.amazon.awscdk.services.qbusiness.CfnPlugin.Builder.create(scope, id)

    /**
     * The identifier of the application that will contain the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-applicationid)
     * @param applicationId The identifier of the application that will contain the plugin. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    override fun authConfiguration(authConfiguration: IResolvable) {
      cdkBuilder.authConfiguration(authConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    override fun authConfiguration(authConfiguration: PluginAuthConfigurationProperty) {
      cdkBuilder.authConfiguration(authConfiguration.let(PluginAuthConfigurationProperty.Companion::unwrap))
    }

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4ef85e5e13f470eb3b7919a33060cb7b1562ba604d768f80b11499ff3b9de45")
    override
        fun authConfiguration(authConfiguration: PluginAuthConfigurationProperty.Builder.() -> Unit):
        Unit = authConfiguration(PluginAuthConfigurationProperty(authConfiguration))

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    override fun customPluginConfiguration(customPluginConfiguration: IResolvable) {
      cdkBuilder.customPluginConfiguration(customPluginConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    override
        fun customPluginConfiguration(customPluginConfiguration: CustomPluginConfigurationProperty) {
      cdkBuilder.customPluginConfiguration(customPluginConfiguration.let(CustomPluginConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72a31f8a7e22f0de887308587fbc5481902f65d53b9c93234ad64a3325d0a0c1")
    override
        fun customPluginConfiguration(customPluginConfiguration: CustomPluginConfigurationProperty.Builder.() -> Unit):
        Unit =
        customPluginConfiguration(CustomPluginConfigurationProperty(customPluginConfiguration))

    /**
     * The name of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-displayname)
     * @param displayName The name of the plugin. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The plugin server URL used for configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-serverurl)
     * @param serverUrl The plugin server URL used for configuration. 
     */
    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    /**
     * The current status of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-state)
     * @param state The current status of the plugin. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-type)
     * @param type The type of the plugin. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnPlugin = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnPlugin.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPlugin {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPlugin(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin): CfnPlugin =
        CfnPlugin(cdkObject)

    internal fun unwrap(wrapped: CfnPlugin): software.amazon.awscdk.services.qbusiness.CfnPlugin =
        wrapped.cdkObject as software.amazon.awscdk.services.qbusiness.CfnPlugin
  }

  /**
   * Contains details about the OpenAPI schema for a custom plugin.
   *
   * For more information, see [custom plugin OpenAPI
   * schemas](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/custom-plugin.html#plugins-api-schema)
   * . You can either include the schema directly in the payload field or you can upload it to an S3
   * bucket and specify the S3 bucket location in the `s3` field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * APISchemaProperty aPISchemaProperty = APISchemaProperty.builder()
   * .payload("payload")
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-apischema.html)
   */
  public interface APISchemaProperty {
    /**
     * The JSON or YAML-formatted payload defining the OpenAPI schema for a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-apischema.html#cfn-qbusiness-plugin-apischema-payload)
     */
    public fun payload(): String? = unwrap(this).getPayload()

    /**
     * Contains details about the S3 object containing the OpenAPI schema for a custom plugin.
     *
     * The schema could be in either JSON or YAML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-apischema.html#cfn-qbusiness-plugin-apischema-s3)
     */
    public fun s3(): Any? = unwrap(this).getS3()

    /**
     * A builder for [APISchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param payload The JSON or YAML-formatted payload defining the OpenAPI schema for a custom
       * plugin.
       */
      public fun payload(payload: String)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      public fun s3(s3: IResolvable)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      public fun s3(s3: S3Property)

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("851131d3515aea140ed4021da166c7136257c219bd5d1af5a20a4c265b2d7474")
      public fun s3(s3: S3Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty.Builder =
          software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty.builder()

      /**
       * @param payload The JSON or YAML-formatted payload defining the OpenAPI schema for a custom
       * plugin.
       */
      override fun payload(payload: String) {
        cdkBuilder.payload(payload)
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      override fun s3(s3: S3Property) {
        cdkBuilder.s3(s3.let(S3Property.Companion::unwrap))
      }

      /**
       * @param s3 Contains details about the S3 object containing the OpenAPI schema for a custom
       * plugin.
       * The schema could be in either JSON or YAML format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("851131d3515aea140ed4021da166c7136257c219bd5d1af5a20a4c265b2d7474")
      override fun s3(s3: S3Property.Builder.() -> Unit): Unit = s3(S3Property(s3))

      public fun build(): software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty,
    ) : CdkObject(cdkObject),
        APISchemaProperty {
      /**
       * The JSON or YAML-formatted payload defining the OpenAPI schema for a custom plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-apischema.html#cfn-qbusiness-plugin-apischema-payload)
       */
      override fun payload(): String? = unwrap(this).getPayload()

      /**
       * Contains details about the S3 object containing the OpenAPI schema for a custom plugin.
       *
       * The schema could be in either JSON or YAML format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-apischema.html#cfn-qbusiness-plugin-apischema-s3)
       */
      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): APISchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty):
          APISchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? APISchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: APISchemaProperty):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPlugin.APISchemaProperty
    }
  }

  /**
   * Information about the basic authentication credentials used to configure a plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * BasicAuthConfigurationProperty basicAuthConfigurationProperty =
   * BasicAuthConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .secretArn("secretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-basicauthconfiguration.html)
   */
  public interface BasicAuthConfigurationProperty {
    /**
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication
     * credentials stored in a Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-basicauthconfiguration.html#cfn-qbusiness-plugin-basicauthconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the Secrets Manager secret that stores the basic authentication credentials used
     * for plugin configuration..
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-basicauthconfiguration.html#cfn-qbusiness-plugin-basicauthconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * A builder for [BasicAuthConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
       * authentication credentials stored in a Secrets Manager secret. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the Secrets Manager secret that stores the basic authentication
       * credentials used for plugin configuration.. 
       */
      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty.builder()

      /**
       * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
       * authentication credentials stored in a Secrets Manager secret. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the Secrets Manager secret that stores the basic authentication
       * credentials used for plugin configuration.. 
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty,
    ) : CdkObject(cdkObject),
        BasicAuthConfigurationProperty {
      /**
       * The ARN of an IAM role used by Amazon Q Business to access the basic authentication
       * credentials stored in a Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-basicauthconfiguration.html#cfn-qbusiness-plugin-basicauthconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the Secrets Manager secret that stores the basic authentication credentials used
       * for plugin configuration..
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-basicauthconfiguration.html#cfn-qbusiness-plugin-basicauthconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BasicAuthConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty):
          BasicAuthConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          BasicAuthConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BasicAuthConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPlugin.BasicAuthConfigurationProperty
    }
  }

  /**
   * Configuration information required to create a custom plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * CustomPluginConfigurationProperty customPluginConfigurationProperty =
   * CustomPluginConfigurationProperty.builder()
   * .apiSchema(APISchemaProperty.builder()
   * .payload("payload")
   * .s3(S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build())
   * .apiSchemaType("apiSchemaType")
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html)
   */
  public interface CustomPluginConfigurationProperty {
    /**
     * Contains either details about the S3 object containing the OpenAPI schema for the action
     * group or the JSON or YAML-formatted payload defining the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-apischema)
     */
    public fun apiSchema(): Any

    /**
     * The type of OpenAPI schema to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-apischematype)
     */
    public fun apiSchemaType(): String

    /**
     * A description for your custom plugin configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-description)
     */
    public fun description(): String

    /**
     * A builder for [CustomPluginConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      public fun apiSchema(apiSchema: IResolvable)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      public fun apiSchema(apiSchema: APISchemaProperty)

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51094b31962c018545f8073bb237d2e654c5c7f6a993122165f1fb283e39002c")
      public fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit)

      /**
       * @param apiSchemaType The type of OpenAPI schema to use. 
       */
      public fun apiSchemaType(apiSchemaType: String)

      /**
       * @param description A description for your custom plugin configuration. 
       */
      public fun description(description: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty.builder()

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      override fun apiSchema(apiSchema: IResolvable) {
        cdkBuilder.apiSchema(apiSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      override fun apiSchema(apiSchema: APISchemaProperty) {
        cdkBuilder.apiSchema(apiSchema.let(APISchemaProperty.Companion::unwrap))
      }

      /**
       * @param apiSchema Contains either details about the S3 object containing the OpenAPI schema
       * for the action group or the JSON or YAML-formatted payload defining the schema. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51094b31962c018545f8073bb237d2e654c5c7f6a993122165f1fb283e39002c")
      override fun apiSchema(apiSchema: APISchemaProperty.Builder.() -> Unit): Unit =
          apiSchema(APISchemaProperty(apiSchema))

      /**
       * @param apiSchemaType The type of OpenAPI schema to use. 
       */
      override fun apiSchemaType(apiSchemaType: String) {
        cdkBuilder.apiSchemaType(apiSchemaType)
      }

      /**
       * @param description A description for your custom plugin configuration. 
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty,
    ) : CdkObject(cdkObject),
        CustomPluginConfigurationProperty {
      /**
       * Contains either details about the S3 object containing the OpenAPI schema for the action
       * group or the JSON or YAML-formatted payload defining the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-apischema)
       */
      override fun apiSchema(): Any = unwrap(this).getApiSchema()

      /**
       * The type of OpenAPI schema to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-apischematype)
       */
      override fun apiSchemaType(): String = unwrap(this).getApiSchemaType()

      /**
       * A description for your custom plugin configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-custompluginconfiguration.html#cfn-qbusiness-plugin-custompluginconfiguration-description)
       */
      override fun description(): String = unwrap(this).getDescription()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomPluginConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty):
          CustomPluginConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomPluginConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomPluginConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPlugin.CustomPluginConfigurationProperty
    }
  }

  /**
   * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * OAuth2ClientCredentialConfigurationProperty oAuth2ClientCredentialConfigurationProperty =
   * OAuth2ClientCredentialConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .secretArn("secretArn")
   * // the properties below are optional
   * .authorizationUrl("authorizationUrl")
   * .tokenUrl("tokenUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html)
   */
  public interface OAuth2ClientCredentialConfigurationProperty {
    /**
     * The redirect URL required by the OAuth 2.0 protocol for Amazon Q Business to authenticate a
     * plugin user through a third party authentication server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-authorizationurl)
     */
    public fun authorizationUrl(): String? = unwrap(this).getAuthorizationUrl()

    /**
     * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication
     * credentials stored in a Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-rolearn)
     */
    public fun roleArn(): String

    /**
     * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for
     * plugin configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-secretarn)
     */
    public fun secretArn(): String

    /**
     * The URL required by the OAuth 2.0 protocol to exchange an end user authorization code for an
     * access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-tokenurl)
     */
    public fun tokenUrl(): String? = unwrap(this).getTokenUrl()

    /**
     * A builder for [OAuth2ClientCredentialConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationUrl The redirect URL required by the OAuth 2.0 protocol for Amazon Q
       * Business to authenticate a plugin user through a third party authentication server.
       */
      public fun authorizationUrl(authorizationUrl: String)

      /**
       * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0
       * authentication credentials stored in a Secrets Manager secret. 
       */
      public fun roleArn(roleArn: String)

      /**
       * @param secretArn The ARN of the Secrets Manager secret that stores the OAuth 2.0
       * credentials/token used for plugin configuration. 
       */
      public fun secretArn(secretArn: String)

      /**
       * @param tokenUrl The URL required by the OAuth 2.0 protocol to exchange an end user
       * authorization code for an access token.
       */
      public fun tokenUrl(tokenUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty.builder()

      /**
       * @param authorizationUrl The redirect URL required by the OAuth 2.0 protocol for Amazon Q
       * Business to authenticate a plugin user through a third party authentication server.
       */
      override fun authorizationUrl(authorizationUrl: String) {
        cdkBuilder.authorizationUrl(authorizationUrl)
      }

      /**
       * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0
       * authentication credentials stored in a Secrets Manager secret. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param secretArn The ARN of the Secrets Manager secret that stores the OAuth 2.0
       * credentials/token used for plugin configuration. 
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param tokenUrl The URL required by the OAuth 2.0 protocol to exchange an end user
       * authorization code for an access token.
       */
      override fun tokenUrl(tokenUrl: String) {
        cdkBuilder.tokenUrl(tokenUrl)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty,
    ) : CdkObject(cdkObject),
        OAuth2ClientCredentialConfigurationProperty {
      /**
       * The redirect URL required by the OAuth 2.0 protocol for Amazon Q Business to authenticate a
       * plugin user through a third party authentication server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-authorizationurl)
       */
      override fun authorizationUrl(): String? = unwrap(this).getAuthorizationUrl()

      /**
       * The ARN of an IAM role used by Amazon Q Business to access the OAuth 2.0 authentication
       * credentials stored in a Secrets Manager secret.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The ARN of the Secrets Manager secret that stores the OAuth 2.0 credentials/token used for
       * plugin configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-secretarn)
       */
      override fun secretArn(): String = unwrap(this).getSecretArn()

      /**
       * The URL required by the OAuth 2.0 protocol to exchange an end user authorization code for
       * an access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-oauth2clientcredentialconfiguration.html#cfn-qbusiness-plugin-oauth2clientcredentialconfiguration-tokenurl)
       */
      override fun tokenUrl(): String? = unwrap(this).getTokenUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OAuth2ClientCredentialConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty):
          OAuth2ClientCredentialConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OAuth2ClientCredentialConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OAuth2ClientCredentialConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPlugin.OAuth2ClientCredentialConfigurationProperty
    }
  }

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * Object noAuthConfiguration;
   * PluginAuthConfigurationProperty pluginAuthConfigurationProperty =
   * PluginAuthConfigurationProperty.builder()
   * .basicAuthConfiguration(BasicAuthConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .secretArn("secretArn")
   * .build())
   * .noAuthConfiguration(noAuthConfiguration)
   * .oAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfigurationProperty.builder()
   * .roleArn("roleArn")
   * .secretArn("secretArn")
   * // the properties below are optional
   * .authorizationUrl("authorizationUrl")
   * .tokenUrl("tokenUrl")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html)
   */
  public interface PluginAuthConfigurationProperty {
    /**
     * Information about the basic authentication credentials used to configure a plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-basicauthconfiguration)
     */
    public fun basicAuthConfiguration(): Any? = unwrap(this).getBasicAuthConfiguration()

    /**
     * Information about invoking a custom plugin without any authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-noauthconfiguration)
     */
    public fun noAuthConfiguration(): Any? = unwrap(this).getNoAuthConfiguration()

    /**
     * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-oauth2clientcredentialconfiguration)
     */
    public fun oAuth2ClientCredentialConfiguration(): Any? =
        unwrap(this).getOAuth2ClientCredentialConfiguration()

    /**
     * A builder for [PluginAuthConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      public fun basicAuthConfiguration(basicAuthConfiguration: IResolvable)

      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      public fun basicAuthConfiguration(basicAuthConfiguration: BasicAuthConfigurationProperty)

      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab903f2758457dde2340c917f56f9c3208f7c21e4f3b5fb057f89c060dc9953")
      public
          fun basicAuthConfiguration(basicAuthConfiguration: BasicAuthConfigurationProperty.Builder.() -> Unit)

      /**
       * @param noAuthConfiguration Information about invoking a custom plugin without any
       * authentication.
       */
      public fun noAuthConfiguration(noAuthConfiguration: Any)

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      public
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: IResolvable)

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      public
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: OAuth2ClientCredentialConfigurationProperty)

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64700368bd4e9a2d5d1485ac010188c80559f5d050b108e99e4934b8a7613d33")
      public
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: OAuth2ClientCredentialConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty.builder()

      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      override fun basicAuthConfiguration(basicAuthConfiguration: IResolvable) {
        cdkBuilder.basicAuthConfiguration(basicAuthConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      override fun basicAuthConfiguration(basicAuthConfiguration: BasicAuthConfigurationProperty) {
        cdkBuilder.basicAuthConfiguration(basicAuthConfiguration.let(BasicAuthConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param basicAuthConfiguration Information about the basic authentication credentials used
       * to configure a plugin.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bab903f2758457dde2340c917f56f9c3208f7c21e4f3b5fb057f89c060dc9953")
      override
          fun basicAuthConfiguration(basicAuthConfiguration: BasicAuthConfigurationProperty.Builder.() -> Unit):
          Unit = basicAuthConfiguration(BasicAuthConfigurationProperty(basicAuthConfiguration))

      /**
       * @param noAuthConfiguration Information about invoking a custom plugin without any
       * authentication.
       */
      override fun noAuthConfiguration(noAuthConfiguration: Any) {
        cdkBuilder.noAuthConfiguration(noAuthConfiguration)
      }

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      override
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: IResolvable) {
        cdkBuilder.oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      override
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: OAuth2ClientCredentialConfigurationProperty) {
        cdkBuilder.oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration.let(OAuth2ClientCredentialConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param oAuth2ClientCredentialConfiguration Information about the OAuth 2.0 authentication
       * credential/token used to configure a plugin.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64700368bd4e9a2d5d1485ac010188c80559f5d050b108e99e4934b8a7613d33")
      override
          fun oAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration: OAuth2ClientCredentialConfigurationProperty.Builder.() -> Unit):
          Unit =
          oAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfigurationProperty(oAuth2ClientCredentialConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty,
    ) : CdkObject(cdkObject),
        PluginAuthConfigurationProperty {
      /**
       * Information about the basic authentication credentials used to configure a plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-basicauthconfiguration)
       */
      override fun basicAuthConfiguration(): Any? = unwrap(this).getBasicAuthConfiguration()

      /**
       * Information about invoking a custom plugin without any authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-noauthconfiguration)
       */
      override fun noAuthConfiguration(): Any? = unwrap(this).getNoAuthConfiguration()

      /**
       * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-pluginauthconfiguration.html#cfn-qbusiness-plugin-pluginauthconfiguration-oauth2clientcredentialconfiguration)
       */
      override fun oAuth2ClientCredentialConfiguration(): Any? =
          unwrap(this).getOAuth2ClientCredentialConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PluginAuthConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty):
          PluginAuthConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PluginAuthConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PluginAuthConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnPlugin.PluginAuthConfigurationProperty
    }
  }

  /**
   * Information required for Amazon Q Business to find a specific file in an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * S3Property s3Property = S3Property.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-s3.html)
   */
  public interface S3Property {
    /**
     * The name of the S3 bucket that contains the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-s3.html#cfn-qbusiness-plugin-s3-bucket)
     */
    public fun bucket(): String

    /**
     * The name of the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-s3.html#cfn-qbusiness-plugin-s3-key)
     */
    public fun key(): String

    /**
     * A builder for [S3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name of the file. 
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property.Builder
          = software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property.builder()

      /**
       * @param bucket The name of the S3 bucket that contains the file. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name of the file. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property,
    ) : CdkObject(cdkObject),
        S3Property {
      /**
       * The name of the S3 bucket that contains the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-s3.html#cfn-qbusiness-plugin-s3-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The name of the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-plugin-s3.html#cfn-qbusiness-plugin-s3-key)
       */
      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property):
          S3Property = CdkObjectWrappers.wrap(cdkObject) as? S3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3Property):
          software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnPlugin.S3Property
    }
  }
}
