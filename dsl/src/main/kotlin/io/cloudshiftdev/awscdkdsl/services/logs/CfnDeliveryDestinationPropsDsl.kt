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
import software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps

/**
 * Properties for defining a `CfnDeliveryDestination`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * Object deliveryDestinationPolicy;
 * CfnDeliveryDestinationProps cfnDeliveryDestinationProps = CfnDeliveryDestinationProps.builder()
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
public class CfnDeliveryDestinationPropsDsl {
    private val cdkBuilder: CfnDeliveryDestinationProps.Builder =
        CfnDeliveryDestinationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     *   destination policy.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(deliveryDestinationPolicy)
        cdkBuilder.deliveryDestinationPolicy(builder.map)
    }

    /**
     * @param deliveryDestinationPolicy A structure that contains information about one delivery
     *   destination policy.
     */
    public fun deliveryDestinationPolicy(deliveryDestinationPolicy: Any) {
        cdkBuilder.deliveryDestinationPolicy(deliveryDestinationPolicy)
    }

    /**
     * @param destinationResourceArn The ARN of the AWS destination that this delivery destination
     *   represents. That AWS destination can be a log group in CloudWatch Logs, an Amazon S3
     *   bucket, or a delivery stream in Firehose.
     */
    public fun destinationResourceArn(destinationResourceArn: String) {
        cdkBuilder.destinationResourceArn(destinationResourceArn)
    }

    /** @param name The name of this delivery destination. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The tags that have been assigned to this delivery destination. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags that have been assigned to this delivery destination. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliveryDestinationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
