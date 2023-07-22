@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies options for Spot Instances.
 *
 * `SpotOptions` is a property of [AWS::EC2::LaunchTemplate
 * InstanceMarketOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SpotOptionsProperty spotOptionsProperty = SpotOptionsProperty.builder()
 * .blockDurationMinutes(123)
 * .instanceInterruptionBehavior("instanceInterruptionBehavior")
 * .maxPrice("maxPrice")
 * .spotInstanceType("spotInstanceType")
 * .validUntil("validUntil")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-spotoptions.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateSpotOptionsPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.SpotOptionsProperty.Builder =
      CfnLaunchTemplate.SpotOptionsProperty.builder()

  /**
   * @param blockDurationMinutes Deprecated.
   */
  public fun blockDurationMinutes(blockDurationMinutes: Number) {
    cdkBuilder.blockDurationMinutes(blockDurationMinutes)
  }

  /**
   * @param instanceInterruptionBehavior The behavior when a Spot Instance is interrupted.
   * The default is `terminate` .
   */
  public fun instanceInterruptionBehavior(instanceInterruptionBehavior: String) {
    cdkBuilder.instanceInterruptionBehavior(instanceInterruptionBehavior)
  }

  /**
   * @param maxPrice The maximum hourly price you're willing to pay for the Spot Instances.
   * We do not recommend using this parameter because it can lead to increased interruptions. If you
   * do not specify this parameter, you will pay the current Spot price.
   *
   *
   * If you specify a maximum price, your Spot Instances will be interrupted more frequently than if
   * you do not specify this parameter.
   */
  public fun maxPrice(maxPrice: String) {
    cdkBuilder.maxPrice(maxPrice)
  }

  /**
   * @param spotInstanceType The Spot Instance request type.
   * If you are using Spot Instances with an Auto Scaling group, use `one-time` requests, as the
   * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is below
   * its desired capacity.
   */
  public fun spotInstanceType(spotInstanceType: String) {
    cdkBuilder.spotInstanceType(spotInstanceType)
  }

  /**
   * @param validUntil The end date of the request, in UTC format ( *YYYY-MM-DD* T *HH:MM:SS* Z).
   * Supported only for persistent requests.
   * * For a persistent request, the request remains active until the `ValidUntil` date and time is
   * reached. Otherwise, the request remains active until you cancel it.
   * * For a one-time request, `ValidUntil` is not supported. The request remains active until all
   * instances launch or you cancel the request.
   *
   * Default: 7 days from the current date
   */
  public fun validUntil(validUntil: String) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): CfnLaunchTemplate.SpotOptionsProperty = cdkBuilder.build()
}
