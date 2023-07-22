@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ecs.Ulimit
import software.amazon.awscdk.services.ecs.UlimitName

/**
 * The ulimit settings to pass to the container.
 *
 * NOTE: Does not work for Windows containers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Ulimit ulimit = Ulimit.builder()
 * .hardLimit(123)
 * .name(UlimitName.CORE)
 * .softLimit(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class UlimitDsl {
  private val cdkBuilder: Ulimit.Builder = Ulimit.builder()

  /**
   * @param hardLimit The hard limit for the ulimit type. 
   */
  public fun hardLimit(hardLimit: Number) {
    cdkBuilder.hardLimit(hardLimit)
  }

  /**
   * @param name The type of the ulimit. 
   * For more information, see
   * [UlimitName](https://docs.aws.amazon.com/cdk/api/latest/typescript/api/aws-ecs/ulimitname.html#aws_ecs_UlimitName).
   */
  public fun name(name: UlimitName) {
    cdkBuilder.name(name)
  }

  /**
   * @param softLimit The soft limit for the ulimit type. 
   */
  public fun softLimit(softLimit: Number) {
    cdkBuilder.softLimit(softLimit)
  }

  public fun build(): Ulimit = cdkBuilder.build()
}
