@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.Credentials
import software.amazon.awscdk.services.stepfunctions.TaskRole

@CdkDslMarker
public class CredentialsDsl {
  private val cdkBuilder: Credentials.Builder = Credentials.builder()

  public fun role(role: TaskRole) {
    cdkBuilder.role(role)
  }

  public fun build(): Credentials = cdkBuilder.build()
}
