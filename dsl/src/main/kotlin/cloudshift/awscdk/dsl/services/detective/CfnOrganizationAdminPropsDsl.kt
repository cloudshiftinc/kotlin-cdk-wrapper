@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.detective.CfnOrganizationAdminProps

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
