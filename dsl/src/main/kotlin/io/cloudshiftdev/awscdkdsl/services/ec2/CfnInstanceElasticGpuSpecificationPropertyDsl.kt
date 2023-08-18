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
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the type of Elastic GPU.
 *
 * An Elastic GPU is a GPU resource that you can attach to your Amazon EC2 instance to accelerate
 * the graphics performance of your applications. For more information, see
 * [Amazon EC2 Elastic GPUs](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-graphics.html)
 * in the *Amazon EC2 User Guide for Windows Instances* .
 *
 * `ElasticGpuSpecification` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticgpuspecification.html)
 */
@CdkDslMarker
public class CfnInstanceElasticGpuSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstance.ElasticGpuSpecificationProperty.Builder =
        CfnInstance.ElasticGpuSpecificationProperty.builder()

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

    public fun build(): CfnInstance.ElasticGpuSpecificationProperty = cdkBuilder.build()
}
