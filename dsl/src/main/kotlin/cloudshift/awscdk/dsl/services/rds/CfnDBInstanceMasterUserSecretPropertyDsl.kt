@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

@CdkDslMarker
public class CfnDBInstanceMasterUserSecretPropertyDsl {
  private val cdkBuilder: CfnDBInstance.MasterUserSecretProperty.Builder =
      CfnDBInstance.MasterUserSecretProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun build(): CfnDBInstance.MasterUserSecretProperty = cdkBuilder.build()
}
