@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RoleOptions

/**
 * Options for specifying a role.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * RoleOptions roleOptions = RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build();
 * ```
 */
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
