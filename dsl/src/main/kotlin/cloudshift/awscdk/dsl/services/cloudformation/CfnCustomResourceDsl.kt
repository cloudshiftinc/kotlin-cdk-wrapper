@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.constructs.Construct

/**
 * In a CloudFormation template, you use the `AWS::CloudFormation::CustomResource` or `Custom::
 * *String*` resource type to specify custom resources.
 *
 * Custom resources provide a way for you to write custom provisioning logic in CloudFormation
 * template and have CloudFormation run it during a stack operation, such as when you create, update or
 * delete a stack. For more information, see [Custom
 * resources](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-custom-resources.html)
 * .
 *
 *
 * If you use the [VPC
 * endpoints](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints.html) feature, custom
 * resources in the VPC must have access to CloudFormation -specific Amazon Simple Storage Service (
 * Amazon S3 ) buckets. Custom resources must send responses to a presigned Amazon S3 URL. If they
 * can't send responses to Amazon S3 , CloudFormation won't receive a response and the stack operation
 * fails. For more information, see [Setting up VPC endpoints for AWS
 * CloudFormation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-vpce-bucketnames.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnCustomResource cfnCustomResource = CfnCustomResource.Builder.create(this,
 * "MyCfnCustomResource")
 * .serviceToken("serviceToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
 */
@CdkDslMarker
public class CfnCustomResourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCustomResource.Builder = CfnCustomResource.Builder.create(scope, id)

  /**
   * Only one property is defined by AWS for a custom resource: `ServiceToken` .
   *
   * All other properties are defined by the service provider.
   *
   * The service token that was given to the template developer by the service provider to access
   * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
   * from the same Region in which you are creating the stack.
   *
   * Updates aren't supported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html#cfn-cloudformation-customresource-servicetoken)
   * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken` .
   * 
   */
  public fun serviceToken(serviceToken: String) {
    cdkBuilder.serviceToken(serviceToken)
  }

  public fun build(): CfnCustomResource = cdkBuilder.build()
}
