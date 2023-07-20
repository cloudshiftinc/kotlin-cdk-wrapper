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

package cloudshift.awscdk.dsl.services.healthlake

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder =
        CfnFHIRDatastore.IdentityProviderConfigurationProperty.builder()

    public fun authorizationStrategy(authorizationStrategy: String) {
        cdkBuilder.authorizationStrategy(authorizationStrategy)
    }

    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    public fun idpLambdaArn(idpLambdaArn: String) {
        cdkBuilder.idpLambdaArn(idpLambdaArn)
    }

    public fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
    }

    public fun build(): CfnFHIRDatastore.IdentityProviderConfigurationProperty = cdkBuilder.build()
}
