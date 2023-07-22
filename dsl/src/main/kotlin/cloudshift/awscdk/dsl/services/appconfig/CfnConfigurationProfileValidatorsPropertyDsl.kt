@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile

/**
 * A validator provides a syntactic or semantic check to ensure the configuration that you want to
 * deploy functions as intended.
 *
 * To validate your application configuration data, you provide a schema or an AWS Lambda function
 * that runs against the configuration. The configuration deployment or update can only proceed when
 * the configuration data is valid.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * ValidatorsProperty validatorsProperty = ValidatorsProperty.builder()
 * .content("content")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-configurationprofile-validators.html)
 */
@CdkDslMarker
public class CfnConfigurationProfileValidatorsPropertyDsl {
  private val cdkBuilder: CfnConfigurationProfile.ValidatorsProperty.Builder =
      CfnConfigurationProfile.ValidatorsProperty.builder()

  /**
   * @param content Either the JSON Schema content or the Amazon Resource Name (ARN) of an Lambda
   * function.
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param type AWS AppConfig supports validators of type `JSON_SCHEMA` and `LAMBDA`.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnConfigurationProfile.ValidatorsProperty = cdkBuilder.build()
}
