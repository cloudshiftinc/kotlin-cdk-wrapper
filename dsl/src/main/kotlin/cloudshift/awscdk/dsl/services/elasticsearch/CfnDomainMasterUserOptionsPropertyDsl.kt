@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@CdkDslMarker
public class CfnDomainMasterUserOptionsPropertyDsl {
  private val cdkBuilder: CfnDomain.MasterUserOptionsProperty.Builder =
      CfnDomain.MasterUserOptionsProperty.builder()

  /**
   * @param masterUserArn ARN for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is false in `AdvancedSecurityOptions` .
   */
  public fun masterUserArn(masterUserArn: String) {
    cdkBuilder.masterUserArn(masterUserArn)
  }

  /**
   * @param masterUserName Username for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
   */
  public fun masterUserName(masterUserName: String) {
    cdkBuilder.masterUserName(masterUserName)
  }

  /**
   * @param masterUserPassword Password for the master user.
   * Only specify if `InternalUserDatabaseEnabled` is true in `AdvancedSecurityOptions` .
   */
  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  public fun build(): CfnDomain.MasterUserOptionsProperty = cdkBuilder.build()
}
