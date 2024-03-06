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
import software.amazon.awscdk.services.logs.CfnDeliverySourceProps

/**
 * Properties for defining a `CfnDeliverySource`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnDeliverySourceProps cfnDeliverySourceProps = CfnDeliverySourceProps.builder()
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
public class CfnDeliverySourcePropsDsl {
    private val cdkBuilder: CfnDeliverySourceProps.Builder = CfnDeliverySourceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param logType The type of log that the source is sending. For valid values for this
     *   parameter, see the documentation for the source service.
     */
    public fun logType(logType: String) {
        cdkBuilder.logType(logType)
    }

    /** @param name The unique name of the delivery source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies this delivery
     *   source.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    /** @param tags The tags that have been assigned to this delivery source. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags that have been assigned to this delivery source. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeliverySourceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
