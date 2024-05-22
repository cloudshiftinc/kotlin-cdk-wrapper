@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new configuration in the AWS AppConfig hosted configuration store.
 *
 * Configurations must be 1 MB or smaller. The AWS AppConfig hosted configuration store provides the
 * following benefits over other configuration store options.
 *
 * * You don't need to set up and configure other services such as Amazon Simple Storage Service (
 * Amazon S3 ) or Parameter Store.
 * * You don't need to configure AWS Identity and Access Management ( IAM ) permissions to use the
 * configuration store.
 * * You can store configurations in any content type.
 * * There is no cost to use the store.
 * * You can create a configuration and add it to the store when you create a configuration profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnHostedConfigurationVersion cfnHostedConfigurationVersion =
 * CfnHostedConfigurationVersion.Builder.create(this, "MyCfnHostedConfigurationVersion")
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
public open class CfnHostedConfigurationVersion(
  cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHostedConfigurationVersionProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHostedConfigurationVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHostedConfigurationVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnHostedConfigurationVersionProps(props)
  )

  /**
   * The application ID.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The application ID.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The configuration version.
   */
  public open fun attrVersionNumber(): String = unwrap(this).getAttrVersionNumber()

  /**
   * The configuration profile ID.
   */
  public open fun configurationProfileId(): String = unwrap(this).getConfigurationProfileId()

  /**
   * The configuration profile ID.
   */
  public open fun configurationProfileId(`value`: String) {
    unwrap(this).setConfigurationProfileId(`value`)
  }

  /**
   * The content of the configuration or the configuration data.
   */
  public open fun content(): String = unwrap(this).getContent()

  /**
   * The content of the configuration or the configuration data.
   */
  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  /**
   * A standard MIME type describing the format of the configuration content.
   */
  public open fun contentType(): String = unwrap(this).getContentType()

  /**
   * A standard MIME type describing the format of the configuration content.
   */
  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  /**
   * A description of the configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * An optional locking token used to prevent race conditions from overwriting configuration
   * updates when creating a new version.
   */
  public open fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * An optional locking token used to prevent race conditions from overwriting configuration
   * updates when creating a new version.
   */
  public open fun latestVersionNumber(`value`: Number) {
    unwrap(this).setLatestVersionNumber(`value`)
  }

  /**
   * A user-defined label for an AWS AppConfig hosted configuration version.
   */
  public open fun versionLabel(): String? = unwrap(this).getVersionLabel()

  /**
   * A user-defined label for an AWS AppConfig hosted configuration version.
   */
  public open fun versionLabel(`value`: String) {
    unwrap(this).setVersionLabel(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.appconfig.CfnHostedConfigurationVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
     * @param configurationProfileId The configuration profile ID. 
     */
    public fun configurationProfileId(configurationProfileId: String)

    /**
     * The content of the configuration or the configuration data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
     * @param content The content of the configuration or the configuration data. 
     */
    public fun content(content: String)

    /**
     * A standard MIME type describing the format of the configuration content.
     *
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-contenttype)
     * @param contentType A standard MIME type describing the format of the configuration content. 
     */
    public fun contentType(contentType: String)

    /**
     * A description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
     * @param description A description of the configuration. 
     */
    public fun description(description: String)

    /**
     * An optional locking token used to prevent race conditions from overwriting configuration
     * updates when creating a new version.
     *
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
     * @param latestVersionNumber An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. 
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * A user-defined label for an AWS AppConfig hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
     * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version. 
     */
    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.Builder.create(scope,
        id)

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
     * @param configurationProfileId The configuration profile ID. 
     */
    override fun configurationProfileId(configurationProfileId: String) {
      cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * The content of the configuration or the configuration data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
     * @param content The content of the configuration or the configuration data. 
     */
    override fun content(content: String) {
      cdkBuilder.content(content)
    }

    /**
     * A standard MIME type describing the format of the configuration content.
     *
     * For more information, see
     * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-contenttype)
     * @param contentType A standard MIME type describing the format of the configuration content. 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * A description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
     * @param description A description of the configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An optional locking token used to prevent race conditions from overwriting configuration
     * updates when creating a new version.
     *
     * To ensure your data is not overwritten when creating multiple hosted configuration versions
     * in rapid succession, specify the version number of the latest hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
     * @param latestVersionNumber An optional locking token used to prevent race conditions from
     * overwriting configuration updates when creating a new version. 
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * A user-defined label for an AWS AppConfig hosted configuration version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
     * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version. 
     */
    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHostedConfigurationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHostedConfigurationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion):
        CfnHostedConfigurationVersion = CfnHostedConfigurationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnHostedConfigurationVersion):
        software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion = wrapped.cdkObject
        as software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
  }
}
