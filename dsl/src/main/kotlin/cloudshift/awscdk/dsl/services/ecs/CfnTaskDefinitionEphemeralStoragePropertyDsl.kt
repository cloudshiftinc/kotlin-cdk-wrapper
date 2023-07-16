@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.EphemeralStorageProperty.Builder =
      CfnTaskDefinition.EphemeralStorageProperty.builder()

  public fun sizeInGiB(sizeInGiB: Number) {
    cdkBuilder.sizeInGiB(sizeInGiB)
  }

  public fun build(): CfnTaskDefinition.EphemeralStorageProperty = cdkBuilder.build()
}
