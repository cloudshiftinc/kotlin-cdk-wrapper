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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies a license configuration for an instance.
 *
 * `LicenseSpecification` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LicenseSpecificationProperty licenseSpecificationProperty =
 * LicenseSpecificationProperty.builder()
 * .licenseConfigurationArn("licenseConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-licensespecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateLicenseSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.LicenseSpecificationProperty.Builder =
        CfnLaunchTemplate.LicenseSpecificationProperty.builder()

    /**
     * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
     */
    public fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
    }

    public fun build(): CfnLaunchTemplate.LicenseSpecificationProperty = cdkBuilder.build()
}
