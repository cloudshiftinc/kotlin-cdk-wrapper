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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that defines a Redis target endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For information about other available settings,
 * see
 * [Specifying endpoint settings for Redis as a target](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Redis.html#CHAP_Target.Redis.EndpointSettings)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * RedisSettingsProperty redisSettingsProperty = RedisSettingsProperty.builder()
 * .authPassword("authPassword")
 * .authType("authType")
 * .authUserName("authUserName")
 * .port(123)
 * .serverName("serverName")
 * .sslCaCertificateArn("sslCaCertificateArn")
 * .sslSecurityProtocol("sslSecurityProtocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-redissettings.html)
 */
@CdkDslMarker
public class CfnEndpointRedisSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.RedisSettingsProperty.Builder =
        CfnEndpoint.RedisSettingsProperty.builder()

    /**
     * @param authPassword The password provided with the `auth-role` and `auth-token` options of
     *   the `AuthType` setting for a Redis target endpoint.
     */
    public fun authPassword(authPassword: String) {
        cdkBuilder.authPassword(authPassword)
    }

    /**
     * @param authType The type of authentication to perform when connecting to a Redis target.
     *   Options include `none` , `auth-token` , and `auth-role` . The `auth-token` option requires
     *   an `AuthPassword` value to be provided. The `auth-role` option requires `AuthUserName` and
     *   `AuthPassword` values to be provided.
     */
    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    /**
     * @param authUserName The user name provided with the `auth-role` option of the `AuthType`
     *   setting for a Redis target endpoint.
     */
    public fun authUserName(authUserName: String) {
        cdkBuilder.authUserName(authUserName)
    }

    /** @param port Transmission Control Protocol (TCP) port for the endpoint. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /** @param serverName Fully qualified domain name of the endpoint. */
    public fun serverName(serverName: String) {
        cdkBuilder.serverName(serverName)
    }

    /**
     * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the certificate authority (CA)
     *   that DMS uses to connect to your Redis target endpoint.
     */
    public fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
    }

    /**
     * @param sslSecurityProtocol The connection to a Redis target endpoint using Transport Layer
     *   Security (TLS). Valid values include `plaintext` and `ssl-encryption` . The default is
     *   `ssl-encryption` . The `ssl-encryption` option makes an encrypted connection. Optionally,
     *   you can identify an Amazon Resource Name (ARN) for an SSL certificate authority (CA) using
     *   the `SslCaCertificateArn` setting. If an ARN isn't given for a CA, DMS uses the Amazon root
     *   CA.
     *
     * The `plaintext` option doesn't provide Transport Layer Security (TLS) encryption for traffic
     * between endpoint and database.
     */
    public fun sslSecurityProtocol(sslSecurityProtocol: String) {
        cdkBuilder.sslSecurityProtocol(sslSecurityProtocol)
    }

    public fun build(): CfnEndpoint.RedisSettingsProperty = cdkBuilder.build()
}
