@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.m2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.m2.CfnApplication

/**
 * The application definition for a particular application.
 *
 * You can specify either inline JSON or an Amazon S3 bucket location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
 * DefinitionProperty definitionProperty = DefinitionProperty.builder()
 * .content("content")
 * .s3Location("s3Location")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html)
 */
@CdkDslMarker
public class CfnApplicationDefinitionPropertyDsl {
  private val cdkBuilder: CfnApplication.DefinitionProperty.Builder =
      CfnApplication.DefinitionProperty.builder()

  /**
   * @param content The content of the application definition.
   * This is a JSON object that contains the resource configuration/definitions that identify an
   * application.
   */
  public fun content(content: String) {
    cdkBuilder.content(content)
  }

  /**
   * @param s3Location The S3 bucket that contains the application definition.
   */
  public fun s3Location(s3Location: String) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CfnApplication.DefinitionProperty = cdkBuilder.build()
}
