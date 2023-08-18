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

package io.cloudshiftdev.awscdkdsl.services.pinpointemail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination
import software.constructs.Construct

/**
 * Create an event destination.
 *
 * In Amazon Pinpoint, *events* include message sends, deliveries, opens, clicks, bounces, and
 * complaints. *Event destinations* are places that you can send information about these events to.
 * For example, you can send event data to Amazon SNS to receive notifications when you receive
 * bounces or complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3
 * for long-term storage.
 *
 * A single configuration set can include more than one event destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * CfnConfigurationSetEventDestination cfnConfigurationSetEventDestination =
 * CfnConfigurationSetEventDestination.Builder.create(this, "MyCfnConfigurationSetEventDestination")
 * .configurationSetName("configurationSetName")
 * .eventDestinationName("eventDestinationName")
 * // the properties below are optional
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
 * .pinpointDestination(PinpointDestinationProperty.builder()
 * .applicationArn("applicationArn")
 * .build())
 * .snsDestination(SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html)
 */
@CdkDslMarker
public class CfnConfigurationSetEventDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationSetEventDestination.Builder =
        CfnConfigurationSetEventDestination.Builder.create(scope, id)

    /**
     * The name of the configuration set that contains the event destination that you want to
     * modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-configurationsetname)
     *
     * @param configurationSetName The name of the configuration set that contains the event
     *   destination that you want to modify.
     */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
     *
     * @param eventDestination An object that defines the event destination.
     */
    public fun eventDestination(eventDestination: IResolvable) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /**
     * An object that defines the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestination)
     *
     * @param eventDestination An object that defines the event destination.
     */
    public fun eventDestination(
        eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty
    ) {
        cdkBuilder.eventDestination(eventDestination)
    }

    /**
     * The name of the event destination that you want to modify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-configurationseteventdestination.html#cfn-pinpointemail-configurationseteventdestination-eventdestinationname)
     *
     * @param eventDestinationName The name of the event destination that you want to modify.
     */
    public fun eventDestinationName(eventDestinationName: String) {
        cdkBuilder.eventDestinationName(eventDestinationName)
    }

    public fun build(): CfnConfigurationSetEventDestination = cdkBuilder.build()
}
