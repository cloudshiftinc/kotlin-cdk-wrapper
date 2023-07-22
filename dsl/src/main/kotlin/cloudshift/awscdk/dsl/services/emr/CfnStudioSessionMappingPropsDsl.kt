@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnStudioSessionMappingProps

@CdkDslMarker
public class CfnStudioSessionMappingPropsDsl {
  private val cdkBuilder: CfnStudioSessionMappingProps.Builder =
      CfnStudioSessionMappingProps.builder()

  /**
   * @param identityName The name of the user or group. 
   * For more information, see
   * [UserName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName)
   * and
   * [DisplayName](https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName)
   * in the *IAM Identity Center Identity Store API Reference* .
   */
  public fun identityName(identityName: String) {
    cdkBuilder.identityName(identityName)
  }

  /**
   * @param identityType Specifies whether the identity to map to the Amazon EMR Studio is a user or
   * a group. 
   */
  public fun identityType(identityType: String) {
    cdkBuilder.identityType(identityType)
  }

  /**
   * @param sessionPolicyArn The Amazon Resource Name (ARN) for the session policy that will be
   * applied to the user or group. 
   * Session policies refine Studio user permissions without the need to use multiple IAM user
   * roles. For more information, see [Create an EMR Studio user role with session
   * policies](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-studio-user-role.html) in the
   * *Amazon EMR Management Guide* .
   */
  public fun sessionPolicyArn(sessionPolicyArn: String) {
    cdkBuilder.sessionPolicyArn(sessionPolicyArn)
  }

  /**
   * @param studioId The ID of the Amazon EMR Studio to which the user or group will be mapped. 
   */
  public fun studioId(studioId: String) {
    cdkBuilder.studioId(studioId)
  }

  public fun build(): CfnStudioSessionMappingProps = cdkBuilder.build()
}
