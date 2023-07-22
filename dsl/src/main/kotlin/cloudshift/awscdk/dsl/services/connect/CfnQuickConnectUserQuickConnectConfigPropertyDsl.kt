@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnQuickConnect

/**
 * Contains information about the quick connect configuration settings for a user.
 *
 * The contact flow must be of type Transfer to Agent.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * UserQuickConnectConfigProperty userQuickConnectConfigProperty =
 * UserQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .userArn("userArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html)
 */
@CdkDslMarker
public class CfnQuickConnectUserQuickConnectConfigPropertyDsl {
  private val cdkBuilder: CfnQuickConnect.UserQuickConnectConfigProperty.Builder =
      CfnQuickConnect.UserQuickConnectConfigProperty.builder()

  /**
   * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
   */
  public fun contactFlowArn(contactFlowArn: String) {
    cdkBuilder.contactFlowArn(contactFlowArn)
  }

  /**
   * @param userArn The Amazon Resource Name (ARN) of the user. 
   */
  public fun userArn(userArn: String) {
    cdkBuilder.userArn(userArn)
  }

  public fun build(): CfnQuickConnect.UserQuickConnectConfigProperty = cdkBuilder.build()
}
