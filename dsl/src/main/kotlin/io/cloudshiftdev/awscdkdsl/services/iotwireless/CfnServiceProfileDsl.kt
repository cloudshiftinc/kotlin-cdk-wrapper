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
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.constructs.Construct

/**
 * Creates a new service profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnServiceProfile cfnServiceProfile = CfnServiceProfile.Builder.create(this,
 * "MyCfnServiceProfile")
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
public class CfnServiceProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceProfile.Builder = CfnServiceProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     *
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * LoRaWAN service profile object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-lorawan)
     *
     * @param loRaWan LoRaWAN service profile object.
     */
    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-name)
     *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-serviceprofile.html#cfn-iotwireless-serviceprofile-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
