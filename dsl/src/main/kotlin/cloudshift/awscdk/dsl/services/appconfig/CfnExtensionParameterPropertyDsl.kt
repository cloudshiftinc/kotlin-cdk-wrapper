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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appconfig.CfnExtension
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnExtensionParameterPropertyDsl {
    private val cdkBuilder: CfnExtension.ParameterProperty.Builder =
        CfnExtension.ParameterProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    public fun build(): CfnExtension.ParameterProperty = cdkBuilder.build()
}
