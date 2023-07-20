@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBInstance

@CdkDslMarker
public class CfnDBInstanceDBInstanceRolePropertyDsl {
  private val cdkBuilder: CfnDBInstance.DBInstanceRoleProperty.Builder =
      CfnDBInstance.DBInstanceRoleProperty.builder()

  public fun featureName(featureName: String) {
    cdkBuilder.featureName(featureName)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDBInstance.DBInstanceRoleProperty = cdkBuilder.build()
}
