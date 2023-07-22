@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.UserAttributes

@CdkDslMarker
public class UserAttributesDsl {
  private val cdkBuilder: UserAttributes.Builder = UserAttributes.builder()

  /**
   * @param userArn The ARN of the user. 
   * Format: arn:<partition>:iam::<account-id>:user/<user-name-with-path>
   */
  public fun userArn(userArn: String) {
    cdkBuilder.userArn(userArn)
  }

  public fun build(): UserAttributes = cdkBuilder.build()
}
