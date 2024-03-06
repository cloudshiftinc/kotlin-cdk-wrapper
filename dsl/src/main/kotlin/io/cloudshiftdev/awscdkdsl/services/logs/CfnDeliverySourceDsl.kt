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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.logs.CfnDeliverySource
import software.constructs.Construct

/**
 * This structure contains information about one *delivery source* in your account.
 *
 * A delivery source is an AWS resource that sends logs to an AWS destination. The destination can
 * be CloudWatch Logs, Amazon S3, or Firehose.
 *
 * Only some AWS services support being configured as a delivery source. These services are listed
 * as *Supported [V2 Permissions]* in the table at
 * [Enabling logging from AWS services.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 * * Create a delivery source, which is a logical object that represents the resource that is
 *   actually sending the logs. For more information, see
 *   [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
 *   .
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 *   destination. For more information, see
 *   [PutDeliveryDestination](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestination.html)
 *   .
 * * If you are delivering logs cross-account, you must use
 *   [PutDeliveryDestinationPolicy](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliveryDestinationPolicy.html)
 *   in the destination account to assign an IAM policy to the destination. This policy allows
 *   delivery to that destination.
 * * Create a *delivery* by pairing exactly one delivery source and one delivery destination. For
 *   more information, see
 *   [CreateDelivery](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_CreateDelivery.html)
 *   .
 *
 * You can configure a single delivery source to send logs to multiple destinations by creating
 * multiple deliveries. You can also create multiple deliveries to configure multiple delivery
 * sources to send logs to the same delivery destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnDeliverySource cfnDeliverySource = CfnDeliverySource.Builder.create(this,
 * "MyCfnDeliverySource")
 * .name("name")
 * // the properties below are optional
 * .logType("logType")
 * .resourceArn("resourceArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html)
 */
@CdkDslMarker
public class CfnDeliverySourceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeliverySource.Builder = CfnDeliverySource.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The type of log that the source is sending.
     *
     * For valid values for this parameter, see the documentation for the source service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-logtype)
     *
     * @param logType The type of log that the source is sending.
     */
    public fun logType(logType: String) {
        cdkBuilder.logType(logType)
    }

    /**
     * The unique name of the delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-name)
     *
     * @param name The unique name of the delivery source.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-resourcearn)
     *
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     *   source.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     *
     * @param tags The tags that have been assigned to this delivery source.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags that have been assigned to this delivery source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverysource.html#cfn-logs-deliverysource-tags)
     *
     * @param tags The tags that have been assigned to this delivery source.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliverySource {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
