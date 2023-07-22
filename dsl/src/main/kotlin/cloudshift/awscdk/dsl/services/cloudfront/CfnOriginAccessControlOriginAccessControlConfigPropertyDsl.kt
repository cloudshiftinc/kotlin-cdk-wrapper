@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl

@CdkDslMarker
public class CfnOriginAccessControlOriginAccessControlConfigPropertyDsl {
  private val cdkBuilder: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder =
      CfnOriginAccessControl.OriginAccessControlConfigProperty.builder()

  /**
   * @param description A description of the origin access control.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A name to identify the origin access control. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param originAccessControlOriginType The type of origin that this origin access control is for.
   * 
   */
  public fun originAccessControlOriginType(originAccessControlOriginType: String) {
    cdkBuilder.originAccessControlOriginType(originAccessControlOriginType)
  }

  /**
   * @param signingBehavior Specifies which requests CloudFront signs (adds authentication
   * information to). 
   * Specify `always` for the most common use case. For more information, see [origin access control
   * advanced
   * settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html#oac-advanced-settings)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * This field can have one of the following values:
   *
   * * `always` – CloudFront signs all origin requests, overwriting the `Authorization` header from
   * the viewer request if one exists.
   * * `never` – CloudFront doesn't sign any origin requests. This value turns off origin access
   * control for all origins in all distributions that use this origin access control.
   * * `no-override` – If the viewer request doesn't contain the `Authorization` header, then
   * CloudFront signs the origin request. If the viewer request contains the `Authorization` header,
   * then CloudFront doesn't sign the origin request and instead passes along the `Authorization`
   * header from the viewer request. *WARNING: To pass along the `Authorization` header from the viewer
   * request, you *must* add the `Authorization` header to a [cache
   * policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html)
   * for all cache behaviors that use origins associated with this origin access control.*
   */
  public fun signingBehavior(signingBehavior: String) {
    cdkBuilder.signingBehavior(signingBehavior)
  }

  /**
   * @param signingProtocol The signing protocol of the origin access control, which determines how
   * CloudFront signs (authenticates) requests. 
   * The only valid value is `sigv4` .
   */
  public fun signingProtocol(signingProtocol: String) {
    cdkBuilder.signingProtocol(signingProtocol)
  }

  public fun build(): CfnOriginAccessControl.OriginAccessControlConfigProperty = cdkBuilder.build()
}
