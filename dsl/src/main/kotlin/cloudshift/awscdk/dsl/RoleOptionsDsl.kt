@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RoleOptions

@CdkDslMarker
public class RoleOptionsDsl {
  private val cdkBuilder: RoleOptions.Builder = RoleOptions.builder()

  /**
   * @param assumeRoleArn ARN of the role to assume. 
   */
  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  /**
   * @param assumeRoleExternalId External ID to use when assuming the role.
   */
  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  public fun build(): RoleOptions = cdkBuilder.build()
}
