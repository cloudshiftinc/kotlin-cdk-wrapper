@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCustomResourceProps

/**
 * Properties for defining a `CfnCustomResource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * CfnCustomResourceProps cfnCustomResourceProps = CfnCustomResourceProps.builder()
 * .serviceToken("serviceToken")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-customresource.html)
 */
@CdkDslMarker
public class CfnCustomResourcePropsDsl {
  private val cdkBuilder: CfnCustomResourceProps.Builder = CfnCustomResourceProps.builder()

  /**
   * @param serviceToken Only one property is defined by AWS for a custom resource: `ServiceToken` .
   * 
   * All other properties are defined by the service provider.
   *
   * The service token that was given to the template developer by the service provider to access
   * the service, such as an Amazon SNS topic ARN or Lambda function ARN. The service token must be
   * from the same Region in which you are creating the stack.
   *
   * Updates aren't supported.
   */
  public fun serviceToken(serviceToken: String) {
    cdkBuilder.serviceToken(serviceToken)
  }

  public fun build(): CfnCustomResourceProps = cdkBuilder.build()
}
