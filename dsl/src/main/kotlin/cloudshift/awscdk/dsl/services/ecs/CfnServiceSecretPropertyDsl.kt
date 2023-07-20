@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServiceSecretPropertyDsl {
  private val cdkBuilder: CfnService.SecretProperty.Builder = CfnService.SecretProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun valueFrom(valueFrom: String) {
    cdkBuilder.valueFrom(valueFrom)
  }

  public fun build(): CfnService.SecretProperty = cdkBuilder.build()
}
