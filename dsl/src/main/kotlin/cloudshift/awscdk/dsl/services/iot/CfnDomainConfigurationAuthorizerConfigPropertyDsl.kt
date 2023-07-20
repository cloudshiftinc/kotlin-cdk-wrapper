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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnDomainConfigurationAuthorizerConfigPropertyDsl {
    private val cdkBuilder: CfnDomainConfiguration.AuthorizerConfigProperty.Builder =
        CfnDomainConfiguration.AuthorizerConfigProperty.builder()

    public fun allowAuthorizerOverride(allowAuthorizerOverride: Boolean) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
    }

    public fun allowAuthorizerOverride(allowAuthorizerOverride: IResolvable) {
        cdkBuilder.allowAuthorizerOverride(allowAuthorizerOverride)
    }

    public fun defaultAuthorizerName(defaultAuthorizerName: String) {
        cdkBuilder.defaultAuthorizerName(defaultAuthorizerName)
    }

    public fun build(): CfnDomainConfiguration.AuthorizerConfigProperty = cdkBuilder.build()
}
