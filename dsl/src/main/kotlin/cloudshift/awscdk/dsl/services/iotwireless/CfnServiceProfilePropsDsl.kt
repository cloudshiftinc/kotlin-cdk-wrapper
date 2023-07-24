@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnServiceProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnServiceProfileProps cfnServiceProfileProps = CfnServiceProfileProps.builder()
 * .loRaWan(LoRaWANServiceProfileProperty.builder()
 * .addGwMetadata(false)
 * .channelMask("channelMask")
 * .devStatusReqFreq(123)
 * .dlBucketSize(123)
 * .dlRate(123)
 * .dlRatePolicy("dlRatePolicy")
 * .drMax(123)
 * .drMin(123)
 * .hrAllowed(false)
 * .minGwDiversity(123)
 * .nwkGeoLoc(false)
 * .prAllowed(false)
 * .raAllowed(false)
 * .reportDevStatusBattery(false)
 * .reportDevStatusMargin(false)
 * .targetPer(123)
 * .ulBucketSize(123)
 * .ulRate(123)
 * .ulRatePolicy("ulRatePolicy")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html)
 */
@CdkDslMarker
public class CfnServiceProfilePropsDsl {
    private val cdkBuilder: CfnServiceProfileProps.Builder = CfnServiceProfileProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * @param name The name of the new resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceProfileProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
