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
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps

/**
 * Properties for defining a `CfnDeviceProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnDeviceProfileProps cfnDeviceProfileProps = CfnDeviceProfileProps.builder()
 * .loRaWan(LoRaWANDeviceProfileProperty.builder()
 * .classBTimeout(123)
 * .classCTimeout(123)
 * .factoryPresetFreqsList(List.of(123))
 * .macVersion("macVersion")
 * .maxDutyCycle(123)
 * .maxEirp(123)
 * .pingSlotDr(123)
 * .pingSlotFreq(123)
 * .pingSlotPeriod(123)
 * .regParamsRevision("regParamsRevision")
 * .rfRegion("rfRegion")
 * .rxDataRate2(123)
 * .rxDelay1(123)
 * .rxDrOffset1(123)
 * .rxFreq2(123)
 * .supports32BitFCnt(false)
 * .supportsClassB(false)
 * .supportsClassC(false)
 * .supportsJoin(false)
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html)
 */
@CdkDslMarker
public class CfnDeviceProfilePropsDsl {
    private val cdkBuilder: CfnDeviceProfileProps.Builder = CfnDeviceProfileProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param loRaWan LoRaWAN device profile object. */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /** @param loRaWan LoRaWAN device profile object. */
    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /** @param name The name of the new resource. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     *   Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     *   Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
