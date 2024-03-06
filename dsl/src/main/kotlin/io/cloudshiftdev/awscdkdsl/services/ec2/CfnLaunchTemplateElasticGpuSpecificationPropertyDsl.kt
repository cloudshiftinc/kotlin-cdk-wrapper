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
 * Amazon Elastic Graphics reached end of life on January 8, 2024.
 *
 * For workloads that require graphics acceleration, we recommend that you use Amazon EC2 G4ad,
 * G4dn, or G5 instances.
 *
 * Specifies a specification for an Elastic GPU for an Amazon EC2 launch template.
 *
 * `ElasticGpuSpecification` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ElasticGpuSpecificationProperty elasticGpuSpecificationProperty =
 * ElasticGpuSpecificationProperty.builder()
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-elasticgpuspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateElasticGpuSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.ElasticGpuSpecificationProperty.Builder =
        CfnLaunchTemplate.ElasticGpuSpecificationProperty.builder()

    /**
     * @param type The type of Elastic Graphics accelerator. For more information about the values
     *   to specify for `Type` , see
     *   [Elastic Graphics Basics](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html#elastic-graphics-basics)
     *   , specifically the Elastic Graphics accelerator column, in the *Amazon Elastic Compute
     *   Cloud User Guide for Windows Instances* .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLaunchTemplate.ElasticGpuSpecificationProperty = cdkBuilder.build()
}
