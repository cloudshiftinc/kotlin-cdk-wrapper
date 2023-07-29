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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to websites that require basic user
 * authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * WebCrawlerBasicAuthenticationProperty webCrawlerBasicAuthenticationProperty =
 * WebCrawlerBasicAuthenticationProperty.builder()
 * .credentials("credentials")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-webcrawlerbasicauthentication.html)
 */
@CdkDslMarker
public class CfnDataSourceWebCrawlerBasicAuthenticationPropertyDsl {
    private val cdkBuilder: CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder =
        CfnDataSource.WebCrawlerBasicAuthenticationProperty.builder()

    /**
     * @param credentials Your secret ARN, which you can create in
     *   [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
     *   You use a secret if basic authentication credentials are required to connect to a website.
     *   The secret stores your credentials of user name and password.
     */
    public fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param host The name of the website host you want to connect to using authentication
     *   credentials. For example, the host name of https://a.example.com/page1.html is
     *   "a.example.com".
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * @param port The port number of the website host you want to connect to using authentication
     *   credentials. For example, the port for https://a.example.com/page1.html is 443, the
     *   standard port for HTTPS.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.WebCrawlerBasicAuthenticationProperty = cdkBuilder.build()
}
