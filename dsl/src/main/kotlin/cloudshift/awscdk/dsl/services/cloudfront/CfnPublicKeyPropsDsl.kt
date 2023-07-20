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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps

@CdkDslMarker
public class CfnPublicKeyPropsDsl {
    private val cdkBuilder: CfnPublicKeyProps.Builder = CfnPublicKeyProps.builder()

    public fun publicKeyConfig(publicKeyConfig: IResolvable) {
        cdkBuilder.publicKeyConfig(publicKeyConfig)
    }

    public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
        cdkBuilder.publicKeyConfig(publicKeyConfig)
    }

    public fun build(): CfnPublicKeyProps = cdkBuilder.build()
}
