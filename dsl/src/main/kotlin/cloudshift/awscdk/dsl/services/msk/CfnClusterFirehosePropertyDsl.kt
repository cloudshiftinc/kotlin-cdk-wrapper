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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Firehose details for BrokerLogs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-firehose.html)
 */
@CdkDslMarker
public class CfnClusterFirehosePropertyDsl {
    private val cdkBuilder: CfnCluster.FirehoseProperty.Builder =
        CfnCluster.FirehoseProperty.builder()

    /**
     * @param deliveryStream The Kinesis Data Firehose delivery stream that is the destination for
     *   broker logs.
     */
    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    /**
     * @param enabled Specifies whether broker logs get send to the specified Kinesis Data Firehose
     *   delivery stream.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether broker logs get send to the specified Kinesis Data Firehose
     *   delivery stream.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnCluster.FirehoseProperty = cdkBuilder.build()
}
