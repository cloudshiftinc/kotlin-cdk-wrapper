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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies an elastic inference accelerator.
 *
 * `LaunchTemplateElasticInferenceAccelerator` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LaunchTemplateElasticInferenceAcceleratorProperty
 * launchTemplateElasticInferenceAcceleratorProperty =
 * LaunchTemplateElasticInferenceAcceleratorProperty.builder()
 * .count(123)
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplateelasticinferenceaccelerator.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateLaunchTemplateElasticInferenceAcceleratorPropertyDsl {
    private val cdkBuilder:
        CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.Builder =
        CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty.builder()

    /**
     * @param count The number of elastic inference accelerators to attach to the instance. Default:
     *   1
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * @param type The type of elastic inference accelerator. The possible values are eia1.medium,
     *   eia1.large, and eia1.xlarge.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLaunchTemplate.LaunchTemplateElasticInferenceAcceleratorProperty =
        cdkBuilder.build()
}
