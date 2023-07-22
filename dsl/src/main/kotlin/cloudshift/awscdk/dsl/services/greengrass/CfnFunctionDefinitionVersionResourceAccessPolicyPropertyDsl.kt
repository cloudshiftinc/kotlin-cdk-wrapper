@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

/**
 * A list of the
 * [resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
 * in the group that the function can access, with the corresponding read-only or read-write
 * permissions. The maximum is 10 resources.
 *
 *
 * This property applies only to Lambda functions that run in a Greengrass container.
 *
 *
 * In an AWS CloudFormation template, `ResourceAccessPolicy` is a property of the
 * [`Environment`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-environment.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * ResourceAccessPolicyProperty resourceAccessPolicyProperty =
 * ResourceAccessPolicyProperty.builder()
 * .resourceId("resourceId")
 * // the properties below are optional
 * .permission("permission")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-functiondefinitionversion-resourceaccesspolicy.html)
 */
@CdkDslMarker
public class CfnFunctionDefinitionVersionResourceAccessPolicyPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.Builder =
      CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty.builder()

  /**
   * @param permission The read-only or read-write access that the Lambda function has to the
   * resource.
   * Valid values are `ro` or `rw` .
   */
  public fun permission(permission: String) {
    cdkBuilder.permission(permission)
  }

  /**
   * @param resourceId The ID of the resource. 
   * This ID is assigned to the resource when you create the resource definition.
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnFunctionDefinitionVersion.ResourceAccessPolicyProperty = cdkBuilder.build()
}
