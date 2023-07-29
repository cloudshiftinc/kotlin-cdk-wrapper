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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBProxy

/**
 * Specifies the details of authentication used by a proxy to log in as a specific database user.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * AuthFormatProperty authFormatProperty = AuthFormatProperty.builder()
 * .authScheme("authScheme")
 * .clientPasswordAuthType("clientPasswordAuthType")
 * .description("description")
 * .iamAuth("iamAuth")
 * .secretArn("secretArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html)
 */
@CdkDslMarker
public class CfnDBProxyAuthFormatPropertyDsl {
    private val cdkBuilder: CfnDBProxy.AuthFormatProperty.Builder =
        CfnDBProxy.AuthFormatProperty.builder()

    /**
     * @param authScheme The type of authentication that the proxy uses for connections from the
     *   proxy to the underlying database. Valid Values: `SECRETS`
     */
    public fun authScheme(authScheme: String) {
        cdkBuilder.authScheme(authScheme)
    }

    /**
     * @param clientPasswordAuthType Specifies the details of authentication used by a proxy to log
     *   in as a specific database user.
     */
    public fun clientPasswordAuthType(clientPasswordAuthType: String) {
        cdkBuilder.clientPasswordAuthType(clientPasswordAuthType)
    }

    /**
     * @param description A user-specified description about the authentication used by a proxy to
     *   log in as a specific database user.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param iamAuth Whether to require or disallow AWS Identity and Access Management (IAM)
     *   authentication for connections to the proxy. The `ENABLED` value is valid only for proxies
     *   with RDS for Microsoft SQL Server.
     *
     * Valid Values: `ENABLED | DISABLED | REQUIRED`
     */
    public fun iamAuth(iamAuth: String) {
        cdkBuilder.iamAuth(iamAuth)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) representing the secret that the proxy uses
     *   to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored
     *   within Amazon Secrets Manager.
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun build(): CfnDBProxy.AuthFormatProperty = cdkBuilder.build()
}
