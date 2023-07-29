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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the Elastic Inference Accelerator for the instance.
 *
 * `ElasticInferenceAccelerator` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ElasticInferenceAcceleratorProperty elasticInferenceAcceleratorProperty =
 * ElasticInferenceAcceleratorProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .count(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-elasticinferenceaccelerator.html)
 */
@CdkDslMarker
public class CfnInstanceElasticInferenceAcceleratorPropertyDsl {
    private val cdkBuilder: CfnInstance.ElasticInferenceAcceleratorProperty.Builder =
        CfnInstance.ElasticInferenceAcceleratorProperty.builder()

    /** @param count The number of elastic inference accelerators to attach to the instance. */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    /**
     * @param type The type of elastic inference accelerator. The possible values are `eia1.medium`
     *   , `eia1.large` , `eia1.xlarge` , `eia2.medium` , `eia2.large` , and `eia2.xlarge` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnInstance.ElasticInferenceAcceleratorProperty = cdkBuilder.build()
}
