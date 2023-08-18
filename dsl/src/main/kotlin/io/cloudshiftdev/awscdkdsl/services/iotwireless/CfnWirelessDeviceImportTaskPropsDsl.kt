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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTask
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceImportTaskProps

/**
 * Properties for defining a `CfnWirelessDeviceImportTask`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnWirelessDeviceImportTaskProps cfnWirelessDeviceImportTaskProps =
 * CfnWirelessDeviceImportTaskProps.builder()
 * .destinationName("destinationName")
 * .sidewalk(SidewalkProperty.builder()
 * .deviceCreationFile("deviceCreationFile")
 * .deviceCreationFileList(List.of("deviceCreationFileList"))
 * .role("role")
 * .sidewalkManufacturingSn("sidewalkManufacturingSn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-wirelessdeviceimporttask.html)
 */
@CdkDslMarker
public class CfnWirelessDeviceImportTaskPropsDsl {
    private val cdkBuilder: CfnWirelessDeviceImportTaskProps.Builder =
        CfnWirelessDeviceImportTaskProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param destinationName The name of the destination that describes the IoT rule to route
     *   messages from the Sidewalk devices in the import task to other applications.
     */
    public fun destinationName(destinationName: String) {
        cdkBuilder.destinationName(destinationName)
    }

    /** @param sidewalk The Sidewalk-related information of the wireless device import task. */
    public fun sidewalk(sidewalk: IResolvable) {
        cdkBuilder.sidewalk(sidewalk)
    }

    /** @param sidewalk The Sidewalk-related information of the wireless device import task. */
    public fun sidewalk(sidewalk: CfnWirelessDeviceImportTask.SidewalkProperty) {
        cdkBuilder.sidewalk(sidewalk)
    }

    /**
     * @param tags Adds to or modifies the tags of the given resource. Tags are metadata that you
     *   can use to manage a resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Adds to or modifies the tags of the given resource. Tags are metadata that you
     *   can use to manage a resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnWirelessDeviceImportTaskProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
