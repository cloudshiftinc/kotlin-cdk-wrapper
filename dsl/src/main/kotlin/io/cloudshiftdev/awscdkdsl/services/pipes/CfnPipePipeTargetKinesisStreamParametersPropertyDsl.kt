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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Kinesis stream as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetKinesisStreamParametersProperty pipeTargetKinesisStreamParametersProperty =
 * PipeTargetKinesisStreamParametersProperty.builder()
 * .partitionKey("partitionKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetkinesisstreamparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetKinesisStreamParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetKinesisStreamParametersProperty.Builder =
        CfnPipe.PipeTargetKinesisStreamParametersProperty.builder()

    /**
     * @param partitionKey Determines which shard in the stream the data record is assigned to.
     *   Partition keys are Unicode strings with a maximum length limit of 256 characters for each
     *   key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that
     *   maps the partition key and associated data to a specific shard. Specifically, an MD5 hash
     *   function is used to map partition keys to 128-bit integer values and to map associated data
     *   records to shards. As a result of this hashing mechanism, all data records with the same
     *   partition key map to the same shard within the stream.
     */
    public fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
    }

    public fun build(): CfnPipe.PipeTargetKinesisStreamParametersProperty = cdkBuilder.build()
}
