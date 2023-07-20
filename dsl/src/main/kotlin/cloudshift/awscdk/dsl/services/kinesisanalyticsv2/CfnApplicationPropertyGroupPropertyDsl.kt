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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnApplicationPropertyGroupPropertyDsl {
    private val cdkBuilder: CfnApplication.PropertyGroupProperty.Builder =
        CfnApplication.PropertyGroupProperty.builder()

    public fun propertyGroupId(propertyGroupId: String) {
        cdkBuilder.propertyGroupId(propertyGroupId)
    }

    public fun propertyMap(propertyMap: Map<String, String>) {
        cdkBuilder.propertyMap(propertyMap)
    }

    public fun propertyMap(propertyMap: IResolvable) {
        cdkBuilder.propertyMap(propertyMap)
    }

    public fun build(): CfnApplication.PropertyGroupProperty = cdkBuilder.build()
}
