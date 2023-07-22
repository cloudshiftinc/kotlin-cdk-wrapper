@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.LayerVersionPermission

@CdkDslMarker
public class LayerVersionPermissionDsl {
  private val cdkBuilder: LayerVersionPermission.Builder = LayerVersionPermission.builder()

  /**
   * @param accountId The AWS Account id of the account that is authorized to use a Lambda Layer
   * Version. 
   * The wild-card `'*'` can be
   * used to grant access to "any" account (or any account in an organization when `organizationId`
   * is specified).
   */
  public fun accountId(accountId: String) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param organizationId The ID of the AWS Organization to which the grant is restricted.
   * Can only be specified if `accountId` is `'*'`
   */
  public fun organizationId(organizationId: String) {
    cdkBuilder.organizationId(organizationId)
  }

  public fun build(): LayerVersionPermission = cdkBuilder.build()
}
