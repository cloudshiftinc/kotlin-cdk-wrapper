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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnComponentVersionComponentPlatformPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.ComponentPlatformProperty.Builder =
        CfnComponentVersion.ComponentPlatformProperty.builder()

    public fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnComponentVersion.ComponentPlatformProperty = cdkBuilder.build()
}
