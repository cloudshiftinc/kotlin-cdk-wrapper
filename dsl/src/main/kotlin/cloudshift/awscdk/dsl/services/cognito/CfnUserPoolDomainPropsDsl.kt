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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import kotlin.String

@CdkDslMarker
public class CfnUserPoolDomainPropsDsl {
    private val cdkBuilder: CfnUserPoolDomainProps.Builder = CfnUserPoolDomainProps.builder()

    public fun customDomainConfig(customDomainConfig: IResolvable) {
        cdkBuilder.customDomainConfig(customDomainConfig)
    }

    public fun customDomainConfig(customDomainConfig: CfnUserPoolDomain.CustomDomainConfigTypeProperty) {
        cdkBuilder.customDomainConfig(customDomainConfig)
    }

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolDomainProps = cdkBuilder.build()
}
