@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnHostedConfigurationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHostedConfigurationVersion.Builder =
      CfnHostedConfigurationVersion.Builder.create(scope, id)

  /**
   * The application ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-applicationid)
   * @param applicationId The application ID. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * The configuration profile ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-configurationprofileid)
   * @param configurationProfileId The configuration profile ID. 
   */
  public fun configurationProfileId(configurationProfileId: String) {
    cdkBuilder.configurationProfileId(configurationProfileId)
  }

  /**
   * The content of the configuration or the configuration data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-content)
   * @param content The content of the configuration or the configuration data. 
   */
  public fun content(content: String) {
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
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * A description of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-description)
   * @param description A description of the configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An optional locking token used to prevent race conditions from overwriting configuration
   * updates when creating a new version.
   *
   * To ensure your data is not overwritten when creating multiple hosted configuration versions in
   * rapid succession, specify the version number of the latest hosted configuration version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-latestversionnumber)
   * @param latestVersionNumber An optional locking token used to prevent race conditions from
   * overwriting configuration updates when creating a new version. 
   */
  public fun latestVersionNumber(latestVersionNumber: Number) {
    cdkBuilder.latestVersionNumber(latestVersionNumber)
  }

  /**
   * A user-defined label for an AWS AppConfig hosted configuration version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-hostedconfigurationversion.html#cfn-appconfig-hostedconfigurationversion-versionlabel)
   * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version. 
   */
  public fun versionLabel(versionLabel: String) {
    cdkBuilder.versionLabel(versionLabel)
  }

  public fun build(): CfnHostedConfigurationVersion = cdkBuilder.build()
}
