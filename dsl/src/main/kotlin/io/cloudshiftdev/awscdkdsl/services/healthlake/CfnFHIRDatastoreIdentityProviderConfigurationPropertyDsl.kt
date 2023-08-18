@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.healthlake

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

/**
 * The identity provider configuration for the datastore.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.healthlake.*;
 * IdentityProviderConfigurationProperty identityProviderConfigurationProperty =
 * IdentityProviderConfigurationProperty.builder()
 * .authorizationStrategy("authorizationStrategy")
 * // the properties below are optional
 * .fineGrainedAuthorizationEnabled(false)
 * .idpLambdaArn("idpLambdaArn")
 * .metadata("metadata")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-healthlake-fhirdatastore-identityproviderconfiguration.html)
 */
@CdkDslMarker
public class CfnFHIRDatastoreIdentityProviderConfigurationPropertyDsl {
    private val cdkBuilder: CfnFHIRDatastore.IdentityProviderConfigurationProperty.Builder =
        CfnFHIRDatastore.IdentityProviderConfigurationProperty.builder()

    /**
     * @param authorizationStrategy Type of Authorization Strategy. The two types of supported
     *   Authorization strategies are SMART_ON_FHIR_V1 and AWS_AUTH.
     */
    public fun authorizationStrategy(authorizationStrategy: String) {
        cdkBuilder.authorizationStrategy(authorizationStrategy)
    }

    /**
     * @param fineGrainedAuthorizationEnabled Flag to indicate if fine-grained authorization will be
     *   enabled for the datastore.
     */
    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    /**
     * @param fineGrainedAuthorizationEnabled Flag to indicate if fine-grained authorization will be
     *   enabled for the datastore.
     */
    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    /**
     * @param idpLambdaArn The Amazon Resource Name (ARN) of the Lambda function that will be used
     *   to decode the access token created by the authorization server.
     */
    public fun idpLambdaArn(idpLambdaArn: String) {
        cdkBuilder.idpLambdaArn(idpLambdaArn)
    }

    /** @param metadata The JSON metadata elements for identity provider configuration. */
    public fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
    }

    public fun build(): CfnFHIRDatastore.IdentityProviderConfigurationProperty = cdkBuilder.build()
}
