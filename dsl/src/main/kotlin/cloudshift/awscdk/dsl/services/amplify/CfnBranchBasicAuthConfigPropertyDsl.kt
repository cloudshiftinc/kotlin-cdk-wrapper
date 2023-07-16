@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnBranch

@CdkDslMarker
public class CfnBranchBasicAuthConfigPropertyDsl {
  private val cdkBuilder: CfnBranch.BasicAuthConfigProperty.Builder =
      CfnBranch.BasicAuthConfigProperty.builder()

  public fun enableBasicAuth(enableBasicAuth: Boolean) {
    cdkBuilder.enableBasicAuth(enableBasicAuth)
  }

  public fun enableBasicAuth(enableBasicAuth: IResolvable) {
    cdkBuilder.enableBasicAuth(enableBasicAuth)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun username(username: String) {
    cdkBuilder.username(username)
  }

  public fun build(): CfnBranch.BasicAuthConfigProperty = cdkBuilder.build()
}
