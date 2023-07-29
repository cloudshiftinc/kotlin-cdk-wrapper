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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName

/**
 * If specified, API Gateway performs two-way authentication between the client and the server.
 *
 * Clients must present a trusted certificate to access your API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * MutualTlsAuthenticationProperty mutualTlsAuthenticationProperty =
 * MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-domainname-mutualtlsauthentication.html)
 */
@CdkDslMarker
public class CfnDomainNameMutualTlsAuthenticationPropertyDsl {
    private val cdkBuilder: CfnDomainName.MutualTlsAuthenticationProperty.Builder =
        CfnDomainName.MutualTlsAuthenticationProperty.builder()

    /**
     * @param truststoreUri An Amazon S3 URL that specifies the truststore for mutual TLS
     *   authentication, for example, `s3:// bucket-name / key-name` . The truststore can contain
     *   certificates from public or private certificate authorities. To update the truststore,
     *   upload a new version to S3, and then update your custom domain name to use the new version.
     *   To update the truststore, you must have permissions to access the S3 object.
     */
    public fun truststoreUri(truststoreUri: String) {
        cdkBuilder.truststoreUri(truststoreUri)
    }

    /**
     * @param truststoreVersion The version of the S3 object that contains your truststore. To
     *   specify a version, you must have versioning enabled for the S3 bucket.
     */
    public fun truststoreVersion(truststoreVersion: String) {
        cdkBuilder.truststoreVersion(truststoreVersion)
    }

    public fun build(): CfnDomainName.MutualTlsAuthenticationProperty = cdkBuilder.build()
}
