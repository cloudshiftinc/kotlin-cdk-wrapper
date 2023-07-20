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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnConnection
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnConnectionParameterPropertyDsl {
    private val cdkBuilder: CfnConnection.ParameterProperty.Builder =
        CfnConnection.ParameterProperty.builder()

    public fun isValueSecret(isValueSecret: Boolean) {
        cdkBuilder.isValueSecret(isValueSecret)
    }

    public fun isValueSecret(isValueSecret: IResolvable) {
        cdkBuilder.isValueSecret(isValueSecret)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConnection.ParameterProperty = cdkBuilder.build()
}
