@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigateway.CfnResource
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::Resource` resource creates a resource in an API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * CfnResource cfnResource = CfnResource.Builder.create(this, "MyCfnResource")
 * .parentId("parentId")
 * .pathPart("pathPart")
 * .restApiId("restApiId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html)
 */
@CdkDslMarker
public class CfnResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResource.Builder = CfnResource.Builder.create(scope, id)

  /**
   * The parent resource's identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid)
   * @param parentId The parent resource's identifier. 
   */
  public fun parentId(parentId: String) {
    cdkBuilder.parentId(parentId)
  }

  /**
   * The last path segment for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart)
   * @param pathPart The last path segment for this resource. 
   */
  public fun pathPart(pathPart: String) {
    cdkBuilder.pathPart(pathPart)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnResource = cdkBuilder.build()
}
