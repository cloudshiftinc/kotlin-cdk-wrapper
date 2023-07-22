@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionEphemeralStoragePropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.EphemeralStorageProperty.Builder =
      CfnTaskDefinition.EphemeralStorageProperty.builder()

  /**
   * @param sizeInGiB The total amount, in GiB, of ephemeral storage to set for the task.
   * The minimum supported value is `21` GiB and the maximum supported value is `200` GiB.
   */
  public fun sizeInGiB(sizeInGiB: Number) {
    cdkBuilder.sizeInGiB(sizeInGiB)
  }

  public fun build(): CfnTaskDefinition.EphemeralStorageProperty = cdkBuilder.build()
}
