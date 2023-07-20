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
import software.amazon.awscdk.services.iottwinmaker.CfnEntity
import kotlin.String

@CdkDslMarker
public class CfnEntityErrorPropertyDsl {
    private val cdkBuilder: CfnEntity.ErrorProperty.Builder = CfnEntity.ErrorProperty.builder()

    public fun code(code: String) {
        cdkBuilder.code(code)
    }

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun build(): CfnEntity.ErrorProperty = cdkBuilder.build()
}
