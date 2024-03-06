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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.logs.CfnDeliveryDestination
import software.constructs.Construct

/**
 * This structure contains information about one *delivery destination* in your account.
 *
 * A delivery destination is an AWS resource that represents an AWS service that logs can be sent
 * to. CloudWatch Logs, Amazon S3, are supported as Firehose delivery destinations.
 *
 * To configure logs delivery between a supported AWS service and a destination, you must do the
 * following:
 * * Create a delivery source, which is a logical object that represents the resource that is
 *   actually sending the logs. For more information, see
 *   [PutDeliverySource](https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_PutDeliverySource.html)
 *   .
 * * Create a *delivery destination* , which is a logical object that represents the actual delivery
 *   destination.
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
 * Object deliveryDestinationPolicy;
 * CfnDeliveryDestination cfnDeliveryDestination = CfnDeliveryDestination.Builder.create(this,
 * "MyCfnDeliveryDestination")
 * .name("name")
 * // the properties below are optional
 * .deliveryDestinationPolicy(deliveryDestinationPolicy)
 * .destinationResourceArn("destinationResourceArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html)
 */
@CdkDslMarker
public class CfnDeliveryDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeliveryDestination.Builder =
        CfnDeliveryDestination.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A structure that contains information about one delivery destination policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     *
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     *   destination policy.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(deliveryDestinationPolicy)
        cdkBuilder.deliveryDestinationPolicy(builder.map)
    }

    /**
     * A structure that contains information about one delivery destination policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-deliverydestinationpolicy)
     *
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     *   destination policy.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
        cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
    }

    /**
     * The ARN of the AWS destination that this delivery destination represents.
     *
     * That AWS destination can be a log group in CloudWatch Logs, an Amazon S3 bucket, or a
     * delivery stream in Firehose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-destinationresourcearn)
     *
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     *   represents.
     */
    public fun destinationResourceArn(destinationResourceArn: String) {
        cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    /**
     * The name of this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-name)
     *
     * @param name The name of this delivery destination.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     *
     * @param tags The tags that have been assigned to this delivery destination.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags that have been assigned to this delivery destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-deliverydestination.html#cfn-logs-deliverydestination-tags)
     *
     * @param tags The tags that have been assigned to this delivery destination.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliveryDestination {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
