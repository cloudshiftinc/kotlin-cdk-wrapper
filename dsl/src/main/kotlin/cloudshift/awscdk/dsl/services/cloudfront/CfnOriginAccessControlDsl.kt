@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.constructs.Construct

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
