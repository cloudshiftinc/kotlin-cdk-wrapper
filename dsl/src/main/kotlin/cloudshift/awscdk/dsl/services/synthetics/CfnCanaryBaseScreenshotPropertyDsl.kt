@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.synthetics.CfnCanary

@CdkDslMarker
public class CfnCanaryBaseScreenshotPropertyDsl {
  private val cdkBuilder: CfnCanary.BaseScreenshotProperty.Builder =
      CfnCanary.BaseScreenshotProperty.builder()

  private val _ignoreCoordinates: MutableList<String> = mutableListOf()

  /**
   * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
   * screenshot comparisons.
   * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on the
   * screen. For more information, see [Edit or delete a
   * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
   * .
   */
  public fun ignoreCoordinates(vararg ignoreCoordinates: String) {
    _ignoreCoordinates.addAll(listOf(*ignoreCoordinates))
  }

  /**
   * @param ignoreCoordinates Coordinates that define the part of a screen to ignore during
   * screenshot comparisons.
   * To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on the
   * screen. For more information, see [Edit or delete a
   * canary](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/synthetics_canaries_deletion.html)
   * .
   */
  public fun ignoreCoordinates(ignoreCoordinates: Collection<String>) {
    _ignoreCoordinates.addAll(ignoreCoordinates)
  }

  /**
   * @param screenshotName The name of the screenshot. 
   * This is generated the first time the canary is run after the `UpdateCanary` operation that
   * specified for this canary to perform visual monitoring.
   */
  public fun screenshotName(screenshotName: String) {
    cdkBuilder.screenshotName(screenshotName)
  }

  public fun build(): CfnCanary.BaseScreenshotProperty {
    if(_ignoreCoordinates.isNotEmpty()) cdkBuilder.ignoreCoordinates(_ignoreCoordinates)
    return cdkBuilder.build()
  }
}
