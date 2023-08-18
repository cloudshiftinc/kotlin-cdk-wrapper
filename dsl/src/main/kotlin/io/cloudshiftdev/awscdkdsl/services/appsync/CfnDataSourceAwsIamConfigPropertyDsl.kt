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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

/**
 * Use the `AwsIamConfig` property type to specify `AwsIamConfig` for a AWS AppSync authorizaton.
 *
 * `AwsIamConfig` is a property of the
 * [AWS AppSync DataSource AuthorizationConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig-authorizationconfig.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * AwsIamConfigProperty awsIamConfigProperty = AwsIamConfigProperty.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html)
 */
@CdkDslMarker
public class CfnDataSourceAwsIamConfigPropertyDsl {
    private val cdkBuilder: CfnDataSource.AwsIamConfigProperty.Builder =
        CfnDataSource.AwsIamConfigProperty.builder()

    /**
     * @param signingRegion The signing Region for AWS Identity and Access Management authorization.
     */
    public fun signingRegion(signingRegion: String) {
        cdkBuilder.signingRegion(signingRegion)
    }

    /**
     * @param signingServiceName The signing service name for AWS Identity and Access Management
     *   authorization.
     */
    public fun signingServiceName(signingServiceName: String) {
        cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): CfnDataSource.AwsIamConfigProperty = cdkBuilder.build()
}
