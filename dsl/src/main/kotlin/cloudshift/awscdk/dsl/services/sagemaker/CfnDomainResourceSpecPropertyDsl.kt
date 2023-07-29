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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type that
 * the version runs on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-resourcespec.html)
 */
@CdkDslMarker
public class CfnDomainResourceSpecPropertyDsl {
    private val cdkBuilder: CfnDomain.ResourceSpecProperty.Builder =
        CfnDomain.ResourceSpecProperty.builder()

    /**
     * @param instanceType The instance type that the image version runs on.
     *
     * *JupyterServer apps* only support the `system` value.
     *
     * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
     * apps also support all other values for available instance types.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param lifecycleConfigArn The Amazon Resource Name (ARN) of the Lifecycle Configuration
     *   attached to the Resource.
     */
    public fun lifecycleConfigArn(lifecycleConfigArn: String) {
        cdkBuilder.lifecycleConfigArn(lifecycleConfigArn)
    }

    /**
     * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
     */
    public fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
    }

    /** @param sageMakerImageVersionArn The ARN of the image version created on the instance. */
    public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
    }

    public fun build(): CfnDomain.ResourceSpecProperty = cdkBuilder.build()
}
