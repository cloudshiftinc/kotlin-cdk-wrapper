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
 * The connector-specific profile credentials required when using Trend Micro.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * TrendmicroConnectorProfileCredentialsProperty trendmicroConnectorProfileCredentialsProperty =
 * TrendmicroConnectorProfileCredentialsProperty.builder()
 * .apiSecretKey("apiSecretKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connectorprofile-trendmicroconnectorprofilecredentials.html)
 */
@CdkDslMarker
public class CfnConnectorProfileTrendmicroConnectorProfileCredentialsPropertyDsl {
    private val cdkBuilder:
        CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder =
        CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.builder()

    /** @param apiSecretKey The Secret Access Key portion of the credentials. */
    public fun apiSecretKey(apiSecretKey: String) {
        cdkBuilder.apiSecretKey(apiSecretKey)
    }

    public fun build(): CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty =
        cdkBuilder.build()
}
