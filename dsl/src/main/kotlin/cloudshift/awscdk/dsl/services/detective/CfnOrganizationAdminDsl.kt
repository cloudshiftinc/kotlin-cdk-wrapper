@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.detective

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.detective.CfnOrganizationAdmin
import software.constructs.Construct

@CdkDslMarker
public class CfnOrganizationAdminDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOrganizationAdmin.Builder = CfnOrganizationAdmin.Builder.create(scope,
      id)

  /**
   * The AWS account identifier of the account to designate as the Detective administrator account
   * for the organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
   * @param accountId The AWS account identifier of the account to designate as the Detective
   * administrator account for the organization. 
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  public fun build(): CfnOrganizationAdmin = cdkBuilder.build()
}
