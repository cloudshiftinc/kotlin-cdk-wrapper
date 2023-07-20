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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnApplicationV2PropertyGroupPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.PropertyGroupProperty.Builder =
        CfnApplicationV2.PropertyGroupProperty.builder()

    public fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
    }

    public fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
    }

    public fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap)
    }

    public fun build(): CfnApplicationV2.PropertyGroupProperty = cdkBuilder.build()
}
