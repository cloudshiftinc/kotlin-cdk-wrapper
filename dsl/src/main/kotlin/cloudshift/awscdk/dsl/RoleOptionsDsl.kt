@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.RoleOptions

@CdkDslMarker
public class RoleOptionsDsl {
  private val cdkBuilder: RoleOptions.Builder = RoleOptions.builder()

  public fun assumeRoleArn(assumeRoleArn: String) {
    cdkBuilder.assumeRoleArn(assumeRoleArn)
  }

  public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
  }

  public fun build(): RoleOptions = cdkBuilder.build()
}
