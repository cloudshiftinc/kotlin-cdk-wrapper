@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.IVersion
import software.amazon.awscdk.services.lambda.VersionWeight

/**
 * A version/weight pair for routing traffic to Lambda functions.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * Version version;
 * VersionWeight versionWeight = VersionWeight.builder()
 * .version(version)
 * .weight(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class VersionWeightDsl {
  private val cdkBuilder: VersionWeight.Builder = VersionWeight.builder()

  /**
   * @param version The version to route traffic to. 
   */
  public fun version(version: IVersion) {
    cdkBuilder.version(version)
  }

  /**
   * @param weight How much weight to assign to this version (0..1). 
   */
  public fun weight(weight: Number) {
    cdkBuilder.weight(weight)
  }

  public fun build(): VersionWeight = cdkBuilder.build()
}
