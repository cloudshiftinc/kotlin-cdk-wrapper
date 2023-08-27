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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.connect.CfnTrafficDistributionGroupProps

/**
 * Properties for defining a `CfnTrafficDistributionGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnTrafficDistributionGroupProps cfnTrafficDistributionGroupProps =
 * CfnTrafficDistributionGroupProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-trafficdistributiongroup.html)
 */
@CdkDslMarker
public class CfnTrafficDistributionGroupPropsDsl {
    private val cdkBuilder: CfnTrafficDistributionGroupProps.Builder =
        CfnTrafficDistributionGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the traffic distribution group. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The Amazon Resource Name (ARN). */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name of the traffic distribution group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, {"tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, {"tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrafficDistributionGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
