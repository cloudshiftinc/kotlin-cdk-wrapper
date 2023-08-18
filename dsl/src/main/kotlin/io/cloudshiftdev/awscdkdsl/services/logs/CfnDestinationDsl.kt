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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnDestination
import software.constructs.Construct

/**
 * The AWS::Logs::Destination resource specifies a CloudWatch Logs destination.
 *
 * A destination encapsulates a physical resource (such as an Amazon Kinesis data stream) and
 * enables you to subscribe that resource to a stream of log events.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnDestination cfnDestination = CfnDestination.Builder.create(this, "MyCfnDestination")
 * .destinationName("destinationName")
 * .roleArn("roleArn")
 * .targetArn("targetArn")
 * // the properties below are optional
 * .destinationPolicy("destinationPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html)
 */
@CdkDslMarker
public class CfnDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDestination.Builder = CfnDestination.Builder.create(scope, id)

    /**
     * The name of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationname)
     *
     * @param destinationName The name of the destination.
     */
    public fun destinationName(destinationName: String) {
        cdkBuilder.destinationName(destinationName)
    }

    /**
     * An IAM policy document that governs which AWS accounts can create subscription filters
     * against this destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-destinationpolicy)
     *
     * @param destinationPolicy An IAM policy document that governs which AWS accounts can create
     *   subscription filters against this destination.
     */
    public fun destinationPolicy(destinationPolicy: String) {
        cdkBuilder.destinationPolicy(destinationPolicy)
    }

    /**
     * The ARN of an IAM role that permits CloudWatch Logs to send data to the specified AWS
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-rolearn)
     *
     * @param roleArn The ARN of an IAM role that permits CloudWatch Logs to send data to the
     *   specified AWS resource.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the physical target where the log events are delivered (for
     * example, a Kinesis stream).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-destination.html#cfn-logs-destination-targetarn)
     *
     * @param targetArn The Amazon Resource Name (ARN) of the physical target where the log events
     *   are delivered (for example, a Kinesis stream).
     */
    public fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
    }

    public fun build(): CfnDestination = cdkBuilder.build()
}
