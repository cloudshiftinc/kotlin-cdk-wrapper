@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnSegment

@CdkDslMarker
public class CfnSegmentDemographicPropertyDsl {
    private val cdkBuilder: CfnSegment.DemographicProperty.Builder =
        CfnSegment.DemographicProperty.builder()

    public fun appVersion(appVersion: IResolvable) {
        cdkBuilder.appVersion(appVersion)
    }

    public fun appVersion(appVersion: CfnSegment.SetDimensionProperty) {
        cdkBuilder.appVersion(appVersion)
    }

    public fun channel(channel: IResolvable) {
        cdkBuilder.channel(channel)
    }

    public fun channel(channel: CfnSegment.SetDimensionProperty) {
        cdkBuilder.channel(channel)
    }

    public fun deviceType(deviceType: IResolvable) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun deviceType(deviceType: CfnSegment.SetDimensionProperty) {
        cdkBuilder.deviceType(deviceType)
    }

    public fun make(make: IResolvable) {
        cdkBuilder.make(make)
    }

    public fun make(make: CfnSegment.SetDimensionProperty) {
        cdkBuilder.make(make)
    }

    public fun model(model: IResolvable) {
        cdkBuilder.model(model)
    }

    public fun model(model: CfnSegment.SetDimensionProperty) {
        cdkBuilder.model(model)
    }

    public fun platform(platform: IResolvable) {
        cdkBuilder.platform(platform)
    }

    public fun platform(platform: CfnSegment.SetDimensionProperty) {
        cdkBuilder.platform(platform)
    }

    public fun build(): CfnSegment.DemographicProperty = cdkBuilder.build()
}
