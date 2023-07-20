@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceKeyValuePairPropertyDsl {
  private val cdkBuilder: CfnService.KeyValuePairProperty.Builder =
      CfnService.KeyValuePairProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnService.KeyValuePairProperty = cdkBuilder.build()
}
