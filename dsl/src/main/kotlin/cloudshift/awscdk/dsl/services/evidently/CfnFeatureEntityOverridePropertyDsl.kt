@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.evidently.CfnFeature

@CdkDslMarker
public class CfnFeatureEntityOverridePropertyDsl {
  private val cdkBuilder: CfnFeature.EntityOverrideProperty.Builder =
      CfnFeature.EntityOverrideProperty.builder()

  /**
   * @param entityId The entity ID to be served the variation specified in `Variation` .
   */
  public fun entityId(entityId: String) {
    cdkBuilder.entityId(entityId)
  }

  /**
   * @param variation The name of the variation to serve to the user session that matches the
   * `EntityId` .
   */
  public fun variation(variation: String) {
    cdkBuilder.variation(variation)
  }

  public fun build(): CfnFeature.EntityOverrideProperty = cdkBuilder.build()
}
