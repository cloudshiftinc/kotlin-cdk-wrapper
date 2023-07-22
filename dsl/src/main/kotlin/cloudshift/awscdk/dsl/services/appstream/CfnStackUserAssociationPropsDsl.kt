@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps

@CdkDslMarker
public class CfnStackUserAssociationPropsDsl {
  private val cdkBuilder: CfnStackUserAssociationProps.Builder =
      CfnStackUserAssociationProps.builder()

  /**
   * @param authenticationType The authentication type for the user who is associated with the
   * stack. 
   * You must specify USERPOOL.
   */
  public fun authenticationType(authenticationType: String) {
    cdkBuilder.authenticationType(authenticationType)
  }

  /**
   * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user
   * is created in the user pool.
   */
  public fun sendEmailNotification(sendEmailNotification: Boolean) {
    cdkBuilder.sendEmailNotification(sendEmailNotification)
  }

  /**
   * @param sendEmailNotification Specifies whether a welcome email is sent to a user after the user
   * is created in the user pool.
   */
  public fun sendEmailNotification(sendEmailNotification: IResolvable) {
    cdkBuilder.sendEmailNotification(sendEmailNotification)
  }

  /**
   * @param stackName The name of the stack that is associated with the user. 
   */
  public fun stackName(stackName: String) {
    cdkBuilder.stackName(stackName)
  }

  /**
   * @param userName The email address of the user who is associated with the stack. 
   *
   * Users' email addresses are case-sensitive.
   */
  public fun userName(userName: String) {
    cdkBuilder.userName(userName)
  }

  public fun build(): CfnStackUserAssociationProps = cdkBuilder.build()
}
