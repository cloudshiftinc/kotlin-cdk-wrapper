@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnHostedConfigurationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnHostedConfigurationVersionProps cfnHostedConfigurationVersionProps =
 * CfnHostedConfigurationVersionProps.builder()
 * .applicationId("applicationId")
 * .configurationProfileId("configurationProfileId")
 * .content("content")
 * .contentType("contentType")
 * // the properties below are optional
 * .description("description")
 * .latestVersionNumber(123)
 * .versionLabel("versionLabel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html)
 */
public interface CfnHostedConfigurationVersionProps {
  /**
   * The application ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
   */
  public fun applicationId(): String

  /**
   * The configuration profile ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
   */
  public fun configurationProfileId(): String

  /**
   * The configuration data, as bytes.
   *
   *
   * AWS AppConfig accepts any type of data, including text formats like JSON or TOML, or binary
   * formats like protocol buffers or compressed data.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
   */
  public fun content(): String

  /**
   * A standard MIME type describing the format of the configuration content.
   *
   * For more information, see
   * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-contenttype)
   */
  public fun contentType(): String

  /**
   * A description of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An optional locking token used to prevent race conditions from overwriting configuration
   * updates when creating a new version.
   *
   * To ensure your data is not overwritten when creating multiple hosted configuration versions in
   * rapid succession, specify the version number of the latest hosted configuration version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * A user-defined label for an AWS AppConfig hosted configuration version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
   */
  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  /**
   * A builder for [CfnHostedConfigurationVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param configurationProfileId The configuration profile ID. 
     */
    public fun configurationProfileId(configurationProfileId: String)

    /**
     * @param content The configuration data, as bytes. 
     *
     * AWS AppConfig accepts any type of data, including text formats like JSON or TOML, or binary
     * formats like protocol buffers or compressed data.
     */
    public fun content(content: String)

    /**
     * @param contentType A standard MIME type describing the format of the configuration content. 
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     */
    public fun contentType(contentType: String)

    /**
     * @param description A description of the configuration.
     */
    public fun description(description: String)

    /**
     * @param latestVersionNumber An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version.
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version.
     */
    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps.builder()

    /**
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param configurationProfileId The configuration profile ID. 
     */
    override fun configurationProfileId(configurationProfileId: String) {
      cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * @param content The configuration data, as bytes. 
     *
     * AWS AppConfig accepts any type of data, including text formats like JSON or TOML, or binary
     * formats like protocol buffers or compressed data.
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * @param contentType A standard MIME type describing the format of the configuration content. 
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param description A description of the configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param latestVersionNumber An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version.
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version.
     */
    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps,
  ) : CdkObject(cdkObject),
      CfnHostedConfigurationVersionProps {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
     */
    override fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

    /**
     * The configuration data, as bytes.
     *
     *
     * AWS AppConfig accepts any type of data, including text formats like JSON or TOML, or binary
     * formats like protocol buffers or compressed data.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
     */
    override fun content(): String = unwrap(this).getContent()

    /**
     * A standard MIME type describing the format of the configuration content.
     *
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-contenttype)
     */
    override fun contentType(): String = unwrap(this).getContentType()

    /**
     * A description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An optional locking token used to prevent race conditions from overwriting configuration
     * updates when creating a new version.
     *
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
     */
    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    /**
     * A user-defined label for an AWS AppConfig hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
     */
    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHostedConfigurationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps):
        CfnHostedConfigurationVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnHostedConfigurationVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHostedConfigurationVersionProps):
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
  }
}
