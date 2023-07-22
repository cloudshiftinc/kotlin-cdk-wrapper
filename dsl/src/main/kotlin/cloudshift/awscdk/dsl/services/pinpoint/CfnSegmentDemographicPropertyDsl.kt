@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

/**
 * Specifies demographic-based criteria, such as device platform, for the segment.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * DemographicProperty demographicProperty = DemographicProperty.builder()
 * .appVersion(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .channel(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .deviceType(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .make(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .model(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .platform(SetDimensionProperty.builder()
 * .dimensionType("dimensionType")
 * .values(List.of("values"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-demographic.html)
 */
@CdkDslMarker
public class CfnSegmentDemographicPropertyDsl {
  private val cdkBuilder: CfnSegment.DemographicProperty.Builder =
      CfnSegment.DemographicProperty.builder()

  /**
   * @param appVersion The app version criteria for the segment.
   */
  public fun appVersion(appVersion: IResolvable) {
    cdkBuilder.appVersion(appVersion)
  }

  /**
   * @param appVersion The app version criteria for the segment.
   */
  public fun appVersion(appVersion: CfnSegment.SetDimensionProperty) {
    cdkBuilder.appVersion(appVersion)
  }

  /**
   * @param channel The channel criteria for the segment.
   */
  public fun channel(channel: IResolvable) {
    cdkBuilder.channel(channel)
  }

  /**
   * @param channel The channel criteria for the segment.
   */
  public fun channel(channel: CfnSegment.SetDimensionProperty) {
    cdkBuilder.channel(channel)
  }

  /**
   * @param deviceType The device type criteria for the segment.
   */
  public fun deviceType(deviceType: IResolvable) {
    cdkBuilder.deviceType(deviceType)
  }

  /**
   * @param deviceType The device type criteria for the segment.
   */
  public fun deviceType(deviceType: CfnSegment.SetDimensionProperty) {
    cdkBuilder.deviceType(deviceType)
  }

  /**
   * @param make The device make criteria for the segment.
   */
  public fun make(make: IResolvable) {
    cdkBuilder.make(make)
  }

  /**
   * @param make The device make criteria for the segment.
   */
  public fun make(make: CfnSegment.SetDimensionProperty) {
    cdkBuilder.make(make)
  }

  /**
   * @param model The device model criteria for the segment.
   */
  public fun model(model: IResolvable) {
    cdkBuilder.model(model)
  }

  /**
   * @param model The device model criteria for the segment.
   */
  public fun model(model: CfnSegment.SetDimensionProperty) {
    cdkBuilder.model(model)
  }

  /**
   * @param platform The device platform criteria for the segment.
   */
  public fun platform(platform: IResolvable) {
    cdkBuilder.platform(platform)
  }

  /**
   * @param platform The device platform criteria for the segment.
   */
  public fun platform(platform: CfnSegment.SetDimensionProperty) {
    cdkBuilder.platform(platform)
  }

  public fun build(): CfnSegment.DemographicProperty = cdkBuilder.build()
}
