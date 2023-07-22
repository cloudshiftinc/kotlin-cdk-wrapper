@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps

/**
 * Properties for defining a `CfnHostedConfigurationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
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
@CdkDslMarker
public class CfnHostedConfigurationVersionPropsDsl {
  private val cdkBuilder: CfnHostedConfigurationVersionProps.Builder =
      CfnHostedConfigurationVersionProps.builder()

  /**
   * @param applicationId The application ID. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * @param configurationProfileId The configuration profile ID. 
   */
  public fun configurationProfileId(configurationProfileId: String) {
    cdkBuilder.configurationProfileId(configurationProfileId)
  }

  /**
   * @param content The content of the configuration or the configuration data. 
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param contentType A standard MIME type describing the format of the configuration content. 
   * For more information, see
   * [Content-Type](https://docs.aws.amazon.com/https://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17)
   * .
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param description A description of the configuration.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param latestVersionNumber An optional locking token used to prevent race conditions from
   * overwriting configuration updates when creating a new version.
   * To ensure your data is not overwritten when creating multiple hosted configuration versions in
   * rapid succession, specify the version number of the latest hosted configuration version.
   */
  public fun latestVersionNumber(latestVersionNumber: Number) {
    cdkBuilder.latestVersionNumber(latestVersionNumber)
  }

  /**
   * @param versionLabel A user-defined label for an AWS AppConfig hosted configuration version.
   */
  public fun versionLabel(versionLabel: String) {
    cdkBuilder.versionLabel(versionLabel)
  }

  public fun build(): CfnHostedConfigurationVersionProps = cdkBuilder.build()
}
