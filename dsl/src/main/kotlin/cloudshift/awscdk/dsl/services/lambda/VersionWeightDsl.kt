@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lambda.IVersion
import software.amazon.awscdk.services.lambda.VersionWeight

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
