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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The details of the credentials required to access an Amazon Redshift cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RedshiftCredentialConfigurationProperty redshiftCredentialConfigurationProperty =
 * RedshiftCredentialConfigurationProperty.builder()
 * .secretManagerArn("secretManagerArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftcredentialconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftCredentialConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftCredentialConfigurationProperty.Builder =
        CfnDataSource.RedshiftCredentialConfigurationProperty.builder()

    /** @param secretManagerArn The ARN of a secret manager for an Amazon Redshift cluster. */
    public fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
    }

    public fun build(): CfnDataSource.RedshiftCredentialConfigurationProperty = cdkBuilder.build()
}
