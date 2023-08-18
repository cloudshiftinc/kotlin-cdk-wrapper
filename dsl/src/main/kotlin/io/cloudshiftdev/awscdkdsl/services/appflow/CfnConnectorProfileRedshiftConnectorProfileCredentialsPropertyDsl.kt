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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

/**
 * The connector-specific profile credentials required when using Amazon Redshift.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * RedshiftConnectorProfileCredentialsProperty redshiftConnectorProfileCredentialsProperty =
 * RedshiftConnectorProfileCredentialsProperty.builder()
 * .password("password")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-redshiftconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileRedshiftConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty.builder()

    /** @param password The password that corresponds to the user name. */
    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    /** @param username The name of the user. */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnConnectorProfile.RedshiftConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
