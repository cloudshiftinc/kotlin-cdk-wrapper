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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

/**
 * The FirehoseDestinationConfiguration property type specifies a Kinesis Firehose location where
 * chat logs will be stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * FirehoseDestinationConfigurationProperty firehoseDestinationConfigurationProperty =
 * FirehoseDestinationConfigurationProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-firehosedestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder()

    /**
     * @param deliveryStreamName Name of the Amazon Kinesis Firehose delivery stream where chat
     *   activity will be logged.
     */
    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    public fun build(): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty =
        cdkBuilder.build()
}
