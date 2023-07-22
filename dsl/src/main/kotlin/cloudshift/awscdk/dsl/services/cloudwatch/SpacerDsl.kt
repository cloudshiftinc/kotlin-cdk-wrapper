@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cloudwatch.Spacer

@CdkDslMarker
public class SpacerDsl {
  private val cdkBuilder: Spacer.Builder = Spacer.Builder.create()

  /**
   * Height of the spacer.
   *
   * Default: : 1
   *
   * @param height Height of the spacer. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * Width of the spacer.
   *
   * Default: 1
   *
   * @param width Width of the spacer. 
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): Spacer = cdkBuilder.build()
}
