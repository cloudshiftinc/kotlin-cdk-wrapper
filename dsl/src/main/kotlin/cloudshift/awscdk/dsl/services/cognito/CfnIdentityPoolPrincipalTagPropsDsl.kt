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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnIdentityPoolPrincipalTagPropsDsl {
    private val cdkBuilder: CfnIdentityPoolPrincipalTagProps.Builder =
        CfnIdentityPoolPrincipalTagProps.builder()

    public fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
    }

    public fun identityProviderName(identityProviderName: String) {
        cdkBuilder.identityProviderName(identityProviderName)
    }

    public fun principalTags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.principalTags(builder.map)
    }

    public fun principalTags(principalTags: Any) {
        cdkBuilder.principalTags(principalTags)
    }

    public fun useDefaults(useDefaults: Boolean) {
        cdkBuilder.useDefaults(useDefaults)
    }

    public fun useDefaults(useDefaults: IResolvable) {
        cdkBuilder.useDefaults(useDefaults)
    }

    public fun build(): CfnIdentityPoolPrincipalTagProps = cdkBuilder.build()
}
