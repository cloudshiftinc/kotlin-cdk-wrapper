@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.UserPoolConfig
import software.amazon.awscdk.services.appsync.UserPoolDefaultAction
import software.amazon.awscdk.services.cognito.IUserPool

@CdkDslMarker
public class UserPoolConfigDsl {
  private val cdkBuilder: UserPoolConfig.Builder = UserPoolConfig.builder()

  public fun appIdClientRegex(appIdClientRegex: String) {
    cdkBuilder.appIdClientRegex(appIdClientRegex)
  }

  public fun defaultAction(defaultAction: UserPoolDefaultAction) {
    cdkBuilder.defaultAction(defaultAction)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolConfig = cdkBuilder.build()
}
