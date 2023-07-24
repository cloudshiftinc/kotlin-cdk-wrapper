@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Creates a new device profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnDeviceProfile cfnDeviceProfile = CfnDeviceProfile.Builder.create(this, "MyCfnDeviceProfile")
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
public class CfnDeviceProfileDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnDeviceProfile.Builder = CfnDeviceProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object.
     */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * LoRaWAN device profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-lorawan)
     * @param loRaWan LoRaWAN device profile object.
     */
    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-name)
     * @param name The name of the new resource.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-deviceprofile.html#cfn-iotwireless-deviceprofile-tags)
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
