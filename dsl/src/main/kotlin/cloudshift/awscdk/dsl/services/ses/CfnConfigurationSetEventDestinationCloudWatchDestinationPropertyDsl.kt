@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

/**
 * Contains information associated with an Amazon CloudWatch event destination to which email
 * sending events are published.
 *
 * Event destinations, such as Amazon CloudWatch, are associated with configuration sets, which
 * enable you to publish email sending events. For information about using configuration sets, see the
 * [Amazon SES Developer
 * Guide](https://docs.aws.amazon.com/ses/latest/dg/monitor-sending-activity.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CloudWatchDestinationProperty cloudWatchDestinationProperty =
 * CloudWatchDestinationProperty.builder()
 * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-configurationseteventdestination-cloudwatchdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationCloudWatchDestinationPropertyDsl {
  private val cdkBuilder: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
      = CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

  private val _dimensionConfigurations: MutableList<Any> = mutableListOf()

  /**
   * @param dimensionConfigurations A list of dimensions upon which to categorize your emails when
   * you publish email sending events to Amazon CloudWatch.
   */
  public fun dimensionConfigurations(vararg dimensionConfigurations: Any) {
    _dimensionConfigurations.addAll(listOf(*dimensionConfigurations))
  }

  /**
   * @param dimensionConfigurations A list of dimensions upon which to categorize your emails when
   * you publish email sending events to Amazon CloudWatch.
   */
  public fun dimensionConfigurations(dimensionConfigurations: Collection<Any>) {
    _dimensionConfigurations.addAll(dimensionConfigurations)
  }

  /**
   * @param dimensionConfigurations A list of dimensions upon which to categorize your emails when
   * you publish email sending events to Amazon CloudWatch.
   */
  public fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
    cdkBuilder.dimensionConfigurations(dimensionConfigurations)
  }

  public fun build(): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty {
    if(_dimensionConfigurations.isNotEmpty())
        cdkBuilder.dimensionConfigurations(_dimensionConfigurations)
    return cdkBuilder.build()
  }
}
