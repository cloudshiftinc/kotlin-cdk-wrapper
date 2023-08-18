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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps

/**
 * Properties for defining a `CfnHoursOfOperation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnHoursOfOperationProps cfnHoursOfOperationProps = CfnHoursOfOperationProps.builder()
 * .config(List.of(HoursOfOperationConfigProperty.builder()
 * .day("day")
 * .endTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .startTime(HoursOfOperationTimeSliceProperty.builder()
 * .hours(123)
 * .minutes(123)
 * .build())
 * .build()))
 * .instanceArn("instanceArn")
 * .name("name")
 * .timeZone("timeZone")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-hoursofoperation.html)
 */
@CdkDslMarker
public class CfnHoursOfOperationPropsDsl {
    private val cdkBuilder: CfnHoursOfOperationProps.Builder = CfnHoursOfOperationProps.builder()

    private val _config: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param config Configuration information for the hours of operation. */
    public fun config(vararg config: Any) {
        _config.addAll(listOf(*config))
    }

    /** @param config Configuration information for the hours of operation. */
    public fun config(config: Collection<Any>) {
        _config.addAll(config)
    }

    /** @param config Configuration information for the hours of operation. */
    public fun config(config: IResolvable) {
        cdkBuilder.config(config)
    }

    /** @param description The description for the hours of operation. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param instanceArn The Amazon Resource Name (ARN) of the instance. */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /** @param name The name for the hours of operation. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource. For
     *   example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param timeZone The time zone for the hours of operation. */
    public fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
    }

    public fun build(): CfnHoursOfOperationProps {
        if (_config.isNotEmpty()) cdkBuilder.config(_config)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
