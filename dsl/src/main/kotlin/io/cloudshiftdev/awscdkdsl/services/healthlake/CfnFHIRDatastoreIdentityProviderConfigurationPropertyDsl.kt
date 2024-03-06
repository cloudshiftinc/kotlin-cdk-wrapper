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
 * The identity provider configuration that you gave when the data store was created.
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
     * @param authorizationStrategy The authorization strategy that you selected when you created
     *   the data store.
     */
    public fun authorizationStrategy(authorizationStrategy: String) {
        cdkBuilder.authorizationStrategy(authorizationStrategy)
    }

    /**
     * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
     *   created the data store.
     */
    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: Boolean) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    /**
     * @param fineGrainedAuthorizationEnabled If you enabled fine-grained authorization when you
     *   created the data store.
     */
    public fun fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled: IResolvable) {
        cdkBuilder.fineGrainedAuthorizationEnabled(fineGrainedAuthorizationEnabled)
    }

    /**
     * @param idpLambdaArn The Amazon Resource Name (ARN) of the Lambda function that you want to
     *   use to decode the access token created by the authorization server.
     */
    public fun idpLambdaArn(idpLambdaArn: String) {
        cdkBuilder.idpLambdaArn(idpLambdaArn)
    }

    /**
     * @param metadata The JSON metadata elements that you want to use in your identity provider
     *   configuration. Required elements are listed based on the launch specification of the SMART
     *   application. For more information on all possible elements, see
     *   [Metadata](https://docs.aws.amazon.com/https://build.fhir.org/ig/HL7/smart-app-launch/conformance.html#metadata)
     *   in SMART's App Launch specification.
     *
     * `authorization_endpoint` : The URL to the OAuth2 authorization endpoint.
     *
     * `grant_types_supported` : An array of grant types that are supported at the token endpoint.
     * You must provide at least one grant type option. Valid options are `authorization_code` and
     * `client_credentials` .
     *
     * `token_endpoint` : The URL to the OAuth2 token endpoint.
     *
     * `capabilities` : An array of strings of the SMART capabilities that the authorization server
     * supports.
     *
     * `code_challenge_methods_supported` : An array of strings of supported PKCE code challenge
     * methods. You must include the `S256` method in the array of PKCE code challenge methods.
     */
    public fun metadata(metadata: String) {
        cdkBuilder.metadata(metadata)
    }

    public fun build(): CfnFHIRDatastore.IdentityProviderConfigurationProperty = cdkBuilder.build()
}
