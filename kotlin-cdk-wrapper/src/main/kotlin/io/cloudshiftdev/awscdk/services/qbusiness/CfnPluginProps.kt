@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPlugin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * Object noAuthConfiguration;
 * CfnPluginProps cfnPluginProps = CfnPluginProps.builder()
 * .applicationId("applicationId")
 * .authConfiguration(PluginAuthConfigurationProperty.builder()
 * .basicAuthConfiguration(BasicAuthConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .secretArn("secretArn")
 * .build())
 * .noAuthConfiguration(noAuthConfiguration)
 * .oAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfigurationProperty.builder()
 * .roleArn("roleArn")
 * .secretArn("secretArn")
 * .build())
 * .build())
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
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
public interface CfnPluginProps {
  /**
   * The identifier of the application that will contain the plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-applicationid)
   */
  public fun applicationId(): String

  /**
   * Authentication configuration information for an Amazon Q Business plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
   */
  public fun authConfiguration(): Any

  /**
   * Configuration information required to create a custom plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
   */
  public fun customPluginConfiguration(): Any? = unwrap(this).getCustomPluginConfiguration()

  /**
   * The name of the plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-displayname)
   */
  public fun displayName(): String

  /**
   * The plugin server URL used for configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-serverurl)
   */
  public fun serverUrl(): String? = unwrap(this).getServerUrl()

  /**
   * The current status of the plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   *
   * You can also use tags to help control access to the data source connector. Tag keys and values
   * can consist of Unicode letters, digits, white space, and any of the following symbols: _ . : /
   * = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnPluginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The identifier of the application that will contain the plugin. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    public fun authConfiguration(authConfiguration: IResolvable)

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    public fun authConfiguration(authConfiguration: CfnPlugin.PluginAuthConfigurationProperty)

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77d22e5d186e57fcadef82784e225ea8c98122b5bf9d7c34d4f2c9d112140d38")
    public
        fun authConfiguration(authConfiguration: CfnPlugin.PluginAuthConfigurationProperty.Builder.() -> Unit)

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    public fun customPluginConfiguration(customPluginConfiguration: IResolvable)

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    public
        fun customPluginConfiguration(customPluginConfiguration: CfnPlugin.CustomPluginConfigurationProperty)

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9712c609fa2f9832d5d3156e61d84a5007544de30c2da51d34936fc918343f2")
    public
        fun customPluginConfiguration(customPluginConfiguration: CfnPlugin.CustomPluginConfigurationProperty.Builder.() -> Unit)

    /**
     * @param displayName The name of the plugin. 
     */
    public fun displayName(displayName: String)

    /**
     * @param serverUrl The plugin server URL used for configuration.
     */
    public fun serverUrl(serverUrl: String)

    /**
     * @param state The current status of the plugin.
     */
    public fun state(state: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the plugin. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnPluginProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnPluginProps.builder()

    /**
     * @param applicationId The identifier of the application that will contain the plugin. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    override fun authConfiguration(authConfiguration: IResolvable) {
      cdkBuilder.authConfiguration(authConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    override fun authConfiguration(authConfiguration: CfnPlugin.PluginAuthConfigurationProperty) {
      cdkBuilder.authConfiguration(authConfiguration.let(CfnPlugin.PluginAuthConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param authConfiguration Authentication configuration information for an Amazon Q Business
     * plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77d22e5d186e57fcadef82784e225ea8c98122b5bf9d7c34d4f2c9d112140d38")
    override
        fun authConfiguration(authConfiguration: CfnPlugin.PluginAuthConfigurationProperty.Builder.() -> Unit):
        Unit = authConfiguration(CfnPlugin.PluginAuthConfigurationProperty(authConfiguration))

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    override fun customPluginConfiguration(customPluginConfiguration: IResolvable) {
      cdkBuilder.customPluginConfiguration(customPluginConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    override
        fun customPluginConfiguration(customPluginConfiguration: CfnPlugin.CustomPluginConfigurationProperty) {
      cdkBuilder.customPluginConfiguration(customPluginConfiguration.let(CfnPlugin.CustomPluginConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param customPluginConfiguration Configuration information required to create a custom
     * plugin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9712c609fa2f9832d5d3156e61d84a5007544de30c2da51d34936fc918343f2")
    override
        fun customPluginConfiguration(customPluginConfiguration: CfnPlugin.CustomPluginConfigurationProperty.Builder.() -> Unit):
        Unit =
        customPluginConfiguration(CfnPlugin.CustomPluginConfigurationProperty(customPluginConfiguration))

    /**
     * @param displayName The name of the plugin. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param serverUrl The plugin server URL used for configuration.
     */
    override fun serverUrl(serverUrl: String) {
      cdkBuilder.serverUrl(serverUrl)
    }

    /**
     * @param state The current status of the plugin.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the plugin. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnPluginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnPluginProps,
  ) : CdkObject(cdkObject),
      CfnPluginProps {
    /**
     * The identifier of the application that will contain the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Authentication configuration information for an Amazon Q Business plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-authconfiguration)
     */
    override fun authConfiguration(): Any = unwrap(this).getAuthConfiguration()

    /**
     * Configuration information required to create a custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-custompluginconfiguration)
     */
    override fun customPluginConfiguration(): Any? = unwrap(this).getCustomPluginConfiguration()

    /**
     * The name of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The plugin server URL used for configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-serverurl)
     */
    override fun serverUrl(): String? = unwrap(this).getServerUrl()

    /**
     * The current status of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-plugin.html#cfn-qbusiness-plugin-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPluginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnPluginProps):
        CfnPluginProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPluginProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPluginProps):
        software.amazon.awscdk.services.qbusiness.CfnPluginProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.qbusiness.CfnPluginProps
  }
}
