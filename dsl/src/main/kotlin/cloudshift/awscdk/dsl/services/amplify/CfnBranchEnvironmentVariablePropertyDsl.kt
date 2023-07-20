@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnBranch

@CdkDslMarker
public class CfnBranchEnvironmentVariablePropertyDsl {
  private val cdkBuilder: CfnBranch.EnvironmentVariableProperty.Builder =
      CfnBranch.EnvironmentVariableProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBranch.EnvironmentVariableProperty = cdkBuilder.build()
}
