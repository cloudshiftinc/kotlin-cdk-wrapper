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

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import kotlin.String

@CdkDslMarker
public class CfnTrustAnchorSourcePropertyDsl {
    private val cdkBuilder: CfnTrustAnchor.SourceProperty.Builder =
        CfnTrustAnchor.SourceProperty.builder()

    public fun sourceData(sourceData: IResolvable) {
        cdkBuilder.sourceData(sourceData)
    }

    public fun sourceData(sourceData: CfnTrustAnchor.SourceDataProperty) {
        cdkBuilder.sourceData(sourceData)
    }

    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun build(): CfnTrustAnchor.SourceProperty = cdkBuilder.build()
}
