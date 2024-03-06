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
import software.amazon.awscdk.services.logs.CfnDeliveryProps

/**
 * Properties for defining a `CfnDelivery`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnDeliveryProps cfnDeliveryProps = CfnDeliveryProps.builder()
 * .deliveryDestinationArn("deliveryDestinationArn")
 * .deliverySourceName("deliverySourceName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-delivery.html)
 */
@CdkDslMarker
public class CfnDeliveryPropsDsl {
    private val cdkBuilder: CfnDeliveryProps.Builder = CfnDeliveryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deliveryDestinationArn The ARN of the delivery destination that is associated with
     *   this delivery.
     */
    public fun deliveryDestinationArn(deliveryDestinationArn: String) {
        cdkBuilder.deliveryDestinationArn(deliveryDestinationArn)
    }

    /**
     * @param deliverySourceName The name of the delivery source that is associated with this
     *   delivery.
     */
    public fun deliverySourceName(deliverySourceName: String) {
        cdkBuilder.deliverySourceName(deliverySourceName)
    }

    /** @param tags The tags that have been assigned to this delivery. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags that have been assigned to this delivery. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliveryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
