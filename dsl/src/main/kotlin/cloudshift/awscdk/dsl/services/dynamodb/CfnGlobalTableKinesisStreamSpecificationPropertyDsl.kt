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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

/**
 * The Kinesis Data Streams configuration for the specified global table replica.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * KinesisStreamSpecificationProperty kinesisStreamSpecificationProperty =
 * KinesisStreamSpecificationProperty.builder()
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableKinesisStreamSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.KinesisStreamSpecificationProperty.Builder =
        CfnGlobalTable.KinesisStreamSpecificationProperty.builder()

    /** @param streamArn The ARN for a specific Kinesis data stream. */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnGlobalTable.KinesisStreamSpecificationProperty = cdkBuilder.build()
}
