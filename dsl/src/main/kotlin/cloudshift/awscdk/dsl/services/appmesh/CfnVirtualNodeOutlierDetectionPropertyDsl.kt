@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the outlier detection for a virtual node's listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * OutlierDetectionProperty outlierDetectionProperty = OutlierDetectionProperty.builder()
 * .baseEjectionDuration(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .interval(DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .maxEjectionPercent(123)
 * .maxServerErrors(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-outlierdetection.html)
 */
@CdkDslMarker
public class CfnVirtualNodeOutlierDetectionPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.OutlierDetectionProperty.Builder =
      CfnVirtualNode.OutlierDetectionProperty.builder()

  /**
   * @param baseEjectionDuration The base amount of time for which a host is ejected. 
   */
  public fun baseEjectionDuration(baseEjectionDuration: IResolvable) {
    cdkBuilder.baseEjectionDuration(baseEjectionDuration)
  }

  /**
   * @param baseEjectionDuration The base amount of time for which a host is ejected. 
   */
  public fun baseEjectionDuration(baseEjectionDuration: CfnVirtualNode.DurationProperty) {
    cdkBuilder.baseEjectionDuration(baseEjectionDuration)
  }

  /**
   * @param interval The time interval between ejection sweep analysis. 
   */
  public fun interval(interval: IResolvable) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param interval The time interval between ejection sweep analysis. 
   */
  public fun interval(interval: CfnVirtualNode.DurationProperty) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
   * service that can be ejected. 
   * Will eject at least one host regardless of the value.
   */
  public fun maxEjectionPercent(maxEjectionPercent: Number) {
    cdkBuilder.maxEjectionPercent(maxEjectionPercent)
  }

  /**
   * @param maxServerErrors Number of consecutive `5xx` errors required for ejection. 
   */
  public fun maxServerErrors(maxServerErrors: Number) {
    cdkBuilder.maxServerErrors(maxServerErrors)
  }

  public fun build(): CfnVirtualNode.OutlierDetectionProperty = cdkBuilder.build()
}
