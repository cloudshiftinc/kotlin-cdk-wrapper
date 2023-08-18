@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps

/**
 * Properties for defining a `CfnConfigurationSetEventDestination`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnConfigurationSetEventDestinationProps cfnConfigurationSetEventDestinationProps =
 * CfnConfigurationSetEventDestinationProps.builder()
 * .configurationSetName("configurationSetName")
 * .eventDestination(EventDestinationProperty.builder()
 * .matchingEventTypes(List.of("matchingEventTypes"))
 * // the properties below are optional
 * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
 * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build()))
 * .build())
 * .enabled(false)
 * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build())
 * .name("name")
 * .snsDestination(SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationPropsDsl {
    private val cdkBuilder: CfnConfigurationSetEventDestinationProps.Builder =
        CfnConfigurationSetEventDestinationProps.builder()

    /**
     * @param configurationSetName The name of the configuration set that contains the event
     *   destination.
     */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    /** @param eventDestination The event destination object. */
    public fun eventDestination(eventDestination: IResolvable) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /** @param eventDestination The event destination object. */
    public fun eventDestination(
        eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty
    ) {
        cdkBuilder.eventDestination(eventDestination)
    }

    public fun build(): CfnConfigurationSetEventDestinationProps = cdkBuilder.build()
}
