@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackRdsDbInstancePropertyDsl {
  private val cdkBuilder: CfnStack.RdsDbInstanceProperty.Builder =
      CfnStack.RdsDbInstanceProperty.builder()

  /**
   * @param dbPassword AWS OpsWorks Stacks returns `*****FILTERED*****` instead of the actual value.
   * 
   */
  public fun dbPassword(dbPassword: String) {
    cdkBuilder.dbPassword(dbPassword)
  }

  /**
   * @param dbUser The master user name. 
   */
  public fun dbUser(dbUser: String) {
    cdkBuilder.dbUser(dbUser)
  }

  /**
   * @param rdsDbInstanceArn The instance's ARN. 
   */
  public fun rdsDbInstanceArn(rdsDbInstanceArn: String) {
    cdkBuilder.rdsDbInstanceArn(rdsDbInstanceArn)
  }

  public fun build(): CfnStack.RdsDbInstanceProperty = cdkBuilder.build()
}
