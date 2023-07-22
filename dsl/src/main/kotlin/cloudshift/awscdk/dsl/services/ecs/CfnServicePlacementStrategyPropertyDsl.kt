@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

@CdkDslMarker
public class CfnServicePlacementStrategyPropertyDsl {
  private val cdkBuilder: CfnService.PlacementStrategyProperty.Builder =
      CfnService.PlacementStrategyProperty.builder()

  /**
   * @param field The field to apply the placement strategy against.
   * For the `spread` placement strategy, valid values are `instanceId` (or `host` , which has the
   * same effect), or any platform or custom attribute that is applied to a container instance, such as
   * `attribute:ecs.availability-zone` . For the `binpack` placement strategy, valid values are `CPU`
   * and `MEMORY` . For the `random` placement strategy, this field is not used.
   */
  public fun `field`(`field`: String) {
    cdkBuilder.`field`(`field`)
  }

  /**
   * @param type The type of placement strategy. 
   * The `random` placement strategy randomly places tasks on available candidates. The `spread`
   * placement strategy spreads placement across available candidates evenly based on the `field`
   * parameter. The `binpack` strategy places tasks on available candidates that have the least
   * available amount of the resource that's specified with the `field` parameter. For example, if you
   * binpack on memory, a task is placed on the instance with the least amount of remaining memory but
   * still enough to run the task.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnService.PlacementStrategyProperty = cdkBuilder.build()
}
