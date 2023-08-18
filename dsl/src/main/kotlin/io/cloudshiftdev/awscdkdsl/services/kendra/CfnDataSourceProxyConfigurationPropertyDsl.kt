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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for a web proxy to connect to website hosts.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ProxyConfigurationProperty proxyConfigurationProperty = ProxyConfigurationProperty.builder()
 * .host("host")
 * .port(123)
 * // the properties below are optional
 * .credentials("credentials")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-proxyconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceProxyConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ProxyConfigurationProperty.Builder =
        CfnDataSource.ProxyConfigurationProperty.builder()

    /**
     * @param credentials Your secret ARN, which you can create in
     *   [AWS Secrets Manager](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html).
     *   The credentials are optional. You use a secret if web proxy credentials are required to
     *   connect to a website host. Amazon Kendra currently support basic authentication to connect
     *   to a web proxy server. The secret stores your credentials.
     */
    public fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
    }

    /**
     * @param host The name of the website host you want to connect to via a web proxy server. For
     *   example, the host name of https://a.example.com/page1.html is "a.example.com".
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * @param port The port number of the website host you want to connect to via a web proxy
     *   server. For example, the port for https://a.example.com/page1.html is 443, the standard
     *   port for HTTPS.
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.ProxyConfigurationProperty = cdkBuilder.build()
}
