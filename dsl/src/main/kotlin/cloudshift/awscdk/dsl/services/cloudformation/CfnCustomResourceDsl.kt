@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnCustomResource
import software.constructs.Construct

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
