@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.detective.CfnOrganizationAdminProps

/**
 * Properties for defining a `CfnOrganizationAdmin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.detective.*;
 * CfnOrganizationAdminProps cfnOrganizationAdminProps = CfnOrganizationAdminProps.builder()
 * .accountId("accountId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html)
 */
@CdkDslMarker
public class CfnOrganizationAdminPropsDsl {
  private val cdkBuilder: CfnOrganizationAdminProps.Builder = CfnOrganizationAdminProps.builder()

  /**
   * @param accountId The AWS account identifier of the account to designate as the Detective
   * administrator account for the organization. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun build(): CfnOrganizationAdminProps = cdkBuilder.build()
}
