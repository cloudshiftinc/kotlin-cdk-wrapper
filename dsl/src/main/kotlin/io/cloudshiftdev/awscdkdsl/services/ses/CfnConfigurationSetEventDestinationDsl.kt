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
import software.constructs.Construct

/**
 * Specifies a configuration set event destination.
 *
 * An event destination is an AWS service that Amazon SES publishes email sending events to. When
 * you specify an event destination, you provide one, and only one, destination. You can send event
 * data to Amazon CloudWatch, Amazon Kinesis Data Firehose, or Amazon Simple Notification Service
 * (Amazon SNS).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnConfigurationSetEventDestination cfnConfigurationSetEventDestination =
 * CfnConfigurationSetEventDestination.Builder.create(this, "MyCfnConfigurationSetEventDestination")
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
public class CfnConfigurationSetEventDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationSetEventDestination.Builder =
        CfnConfigurationSetEventDestination.Builder.create(scope, id)

    /**
     * The name of the configuration set that contains the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
     *
     * @param configurationSetName The name of the configuration set that contains the event
     *   destination.
     */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     *
     * @param eventDestination The event destination object.
     */
    public fun eventDestination(eventDestination: IResolvable) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     *
     * @param eventDestination The event destination object.
     */
    public fun eventDestination(
        eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty
    ) {
        cdkBuilder.eventDestination(eventDestination)
    }

    public fun build(): CfnConfigurationSetEventDestination = cdkBuilder.build()
}
