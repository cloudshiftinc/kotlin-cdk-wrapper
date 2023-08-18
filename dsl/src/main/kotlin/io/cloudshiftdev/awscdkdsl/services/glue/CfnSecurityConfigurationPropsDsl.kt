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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps

/**
 * Properties for defining a `CfnSecurityConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * CfnSecurityConfigurationProps cfnSecurityConfigurationProps =
 * CfnSecurityConfigurationProps.builder()
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .s3Encryptions(List.of(S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build()))
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationPropsDsl {
    private val cdkBuilder: CfnSecurityConfigurationProps.Builder =
        CfnSecurityConfigurationProps.builder()

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     *   configuration.
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     *   configuration.
     */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /** @param name The name of the security configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSecurityConfigurationProps = cdkBuilder.build()
}
