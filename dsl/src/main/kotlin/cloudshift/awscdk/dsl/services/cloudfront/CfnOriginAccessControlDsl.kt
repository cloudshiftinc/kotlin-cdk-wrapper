@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.constructs.Construct

/**
 * Creates a new origin access control in CloudFront.
 *
 * After you create an origin access control, you can add it to an origin in a CloudFront
 * distribution so that CloudFront sends authenticated (signed) requests to the origin.
 *
 * This makes it possible to block public access to the origin, allowing viewers (users) to access
 * the origin's content only through CloudFront.
 *
 * For more information about using a CloudFront origin access control, see [Restricting access to
 * an AWS
 * origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnOriginAccessControl cfnOriginAccessControl = CfnOriginAccessControl.Builder.create(this,
 * "MyCfnOriginAccessControl")
 * .originAccessControlConfig(OriginAccessControlConfigProperty.builder()
 * .name("name")
 * .originAccessControlOriginType("originAccessControlOriginType")
 * .signingBehavior("signingBehavior")
 * .signingProtocol("signingProtocol")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
 */
@CdkDslMarker
public class CfnOriginAccessControlDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOriginAccessControl.Builder =
      CfnOriginAccessControl.Builder.create(scope, id)

  /**
   * The origin access control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
   * @param originAccessControlConfig The origin access control. 
   */
  public fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
    cdkBuilder.originAccessControlConfig(originAccessControlConfig)
  }

  /**
   * The origin access control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
   * @param originAccessControlConfig The origin access control. 
   */
  public
      fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty) {
    cdkBuilder.originAccessControlConfig(originAccessControlConfig)
  }

  public fun build(): CfnOriginAccessControl = cdkBuilder.build()
}
