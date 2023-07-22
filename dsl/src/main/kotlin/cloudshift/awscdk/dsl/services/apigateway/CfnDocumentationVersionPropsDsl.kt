@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps

/**
 * Properties for defining a `CfnDocumentationVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnDocumentationVersionProps cfnDocumentationVersionProps =
 * CfnDocumentationVersionProps.builder()
 * .documentationVersion("documentationVersion")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html)
 */
@CdkDslMarker
public class CfnDocumentationVersionPropsDsl {
  private val cdkBuilder: CfnDocumentationVersionProps.Builder =
      CfnDocumentationVersionProps.builder()

  /**
   * @param description A description about the new documentation snapshot.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param documentationVersion The version identifier of the to-be-updated documentation version. 
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationVersionProps = cdkBuilder.build()
}
