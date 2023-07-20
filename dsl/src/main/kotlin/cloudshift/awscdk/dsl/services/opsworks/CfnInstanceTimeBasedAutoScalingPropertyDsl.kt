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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnInstance
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnInstanceTimeBasedAutoScalingPropertyDsl {
    private val cdkBuilder: CfnInstance.TimeBasedAutoScalingProperty.Builder =
        CfnInstance.TimeBasedAutoScalingProperty.builder()

    public fun friday(friday: Map<String, String>) {
        cdkBuilder.friday(friday)
    }

    public fun friday(friday: IResolvable) {
        cdkBuilder.friday(friday)
    }

    public fun monday(monday: Map<String, String>) {
        cdkBuilder.monday(monday)
    }

    public fun monday(monday: IResolvable) {
        cdkBuilder.monday(monday)
    }

    public fun saturday(saturday: Map<String, String>) {
        cdkBuilder.saturday(saturday)
    }

    public fun saturday(saturday: IResolvable) {
        cdkBuilder.saturday(saturday)
    }

    public fun sunday(sunday: Map<String, String>) {
        cdkBuilder.sunday(sunday)
    }

    public fun sunday(sunday: IResolvable) {
        cdkBuilder.sunday(sunday)
    }

    public fun thursday(thursday: Map<String, String>) {
        cdkBuilder.thursday(thursday)
    }

    public fun thursday(thursday: IResolvable) {
        cdkBuilder.thursday(thursday)
    }

    public fun tuesday(tuesday: Map<String, String>) {
        cdkBuilder.tuesday(tuesday)
    }

    public fun tuesday(tuesday: IResolvable) {
        cdkBuilder.tuesday(tuesday)
    }

    public fun wednesday(wednesday: Map<String, String>) {
        cdkBuilder.wednesday(wednesday)
    }

    public fun wednesday(wednesday: IResolvable) {
        cdkBuilder.wednesday(wednesday)
    }

    public fun build(): CfnInstance.TimeBasedAutoScalingProperty = cdkBuilder.build()
}
