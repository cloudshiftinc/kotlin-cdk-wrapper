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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation

/**
 * Access configuration parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * AccessConfigurationProperty accessConfigurationProperty = AccessConfigurationProperty.builder()
 * .accessType("accessType")
 * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
 * .headerName("headerName")
 * .secretArn("secretArn")
 * .secretStringKey("secretStringKey")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html)
 */
@CdkDslMarker
public class CfnSourceLocationAccessConfigurationPropertyDsl {
    private val cdkBuilder: CfnSourceLocation.AccessConfigurationProperty.Builder =
        CfnSourceLocation.AccessConfigurationProperty.builder()

    /**
     * @param accessType The type of authentication used to access content from
     *   `HttpConfiguration::BaseUrl` on your source location. Accepted value: `S3_SIGV4` .
     *   `S3_SIGV4` - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style
     *   access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS
     *   Signature Version 4 (SigV4) authentication to access the bucket where your source content
     *   is stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style
     *   request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     *
     * Before you can use `S3_SIGV4` , you must meet these requirements:
     *
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com
     * principal access in IAM. For information about configuring access in IAM, see Access
     * management in the IAM User Guide.
     *
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level
     * manifests referenced by the VodSource packaging configurations.
     *
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level
     * manifests referenced by your MediaTailor VodSource packaging configurations.
     */
    public fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
    }

    /**
     * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token configuration
     *   parameters.
     */
    public fun secretsManagerAccessTokenConfiguration(
        secretsManagerAccessTokenConfiguration: IResolvable
    ) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration)
    }

    /**
     * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token configuration
     *   parameters.
     */
    public fun secretsManagerAccessTokenConfiguration(
        secretsManagerAccessTokenConfiguration:
            CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
    ) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration)
    }

    public fun build(): CfnSourceLocation.AccessConfigurationProperty = cdkBuilder.build()
}
