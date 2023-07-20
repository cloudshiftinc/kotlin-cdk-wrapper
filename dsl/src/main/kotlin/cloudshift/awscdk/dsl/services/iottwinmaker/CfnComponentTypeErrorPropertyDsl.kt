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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import kotlin.String

@CdkDslMarker
public class CfnComponentTypeErrorPropertyDsl {
    private val cdkBuilder: CfnComponentType.ErrorProperty.Builder =
        CfnComponentType.ErrorProperty.builder()

    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnComponentType.ErrorProperty = cdkBuilder.build()
}
