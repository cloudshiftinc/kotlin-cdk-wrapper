@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.constructs.Construct

@CdkDslMarker
public class CfnDocumentationVersionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDocumentationVersion.Builder =
      CfnDocumentationVersion.Builder.create(scope, id)

  /**
   * A description about the new documentation snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description)
   * @param description A description about the new documentation snapshot. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The version identifier of the to-be-updated documentation version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion)
   * @param documentationVersion The version identifier of the to-be-updated documentation version. 
   */
  public fun documentationVersion(documentationVersion: String) {
    cdkBuilder.documentationVersion(documentationVersion)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnDocumentationVersion = cdkBuilder.build()
}
