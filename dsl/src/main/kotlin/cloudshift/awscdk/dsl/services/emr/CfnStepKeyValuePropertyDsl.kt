@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnStep

@CdkDslMarker
public class CfnStepKeyValuePropertyDsl {
  private val cdkBuilder: CfnStep.KeyValueProperty.Builder = CfnStep.KeyValueProperty.builder()

  /**
   * @param key The unique identifier of a key-value pair.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value part of the identified key.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnStep.KeyValueProperty = cdkBuilder.build()
}
