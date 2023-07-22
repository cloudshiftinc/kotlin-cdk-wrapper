@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceKeyValuePairPropertyDsl {
  private val cdkBuilder: CfnService.KeyValuePairProperty.Builder =
      CfnService.KeyValuePairProperty.builder()

  /**
   * @param name The key name string to map to a value.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value string to which the key name is mapped.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnService.KeyValuePairProperty = cdkBuilder.build()
}
