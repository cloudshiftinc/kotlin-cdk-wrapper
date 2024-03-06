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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
 * // the properties below are optional
 * .approximateCreationDateTimePrecision("approximateCreationDateTimePrecision")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-globaltable-kinesisstreamspecification.html)
 */
@CdkDslMarker
public class CfnGlobalTableKinesisStreamSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.KinesisStreamSpecificationProperty.Builder =
        CfnGlobalTable.KinesisStreamSpecificationProperty.builder()

    /**
     * @param approximateCreationDateTimePrecision The precision for the time and date that the
     *   stream was created.
     */
    public fun approximateCreationDateTimePrecision(approximateCreationDateTimePrecision: String) {
        cdkBuilder.approximateCreationDateTimePrecision(approximateCreationDateTimePrecision)
    }

    /** @param streamArn The ARN for a specific Kinesis data stream. */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnGlobalTable.KinesisStreamSpecificationProperty = cdkBuilder.build()
}
