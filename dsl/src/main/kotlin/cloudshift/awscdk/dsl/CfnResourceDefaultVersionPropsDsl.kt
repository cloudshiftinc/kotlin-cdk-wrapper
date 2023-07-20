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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnResourceDefaultVersionProps
import kotlin.String

@CdkDslMarker
public class CfnResourceDefaultVersionPropsDsl {
    private val cdkBuilder: CfnResourceDefaultVersionProps.Builder =
        CfnResourceDefaultVersionProps.builder()

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun typeVersionArn(typeVersionArn: String) {
        cdkBuilder.typeVersionArn(typeVersionArn)
    }

    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    public fun build(): CfnResourceDefaultVersionProps = cdkBuilder.build()
}
