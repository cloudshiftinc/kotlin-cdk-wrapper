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
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.constructs.Construct

/**
 * Creates a version of the SageMaker image specified by `ImageName` .
 *
 * The version represents the Amazon Container Registry (ECR) container image specified by
 * `BaseImage` .
 *
 * You can use the `DependsOn` attribute to specify that the creation of a specific resource follows
 * another. You can use it for the following use cases. For more information, see
 * [`DependsOn` attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * .
 * * `DependsOn` can be used to establish a parent/child relationship between `ImageVersion` and
 *   `Image` where the `ImageVersion` `DependsOn` the `Image` .
 * * `DependsOn` can be used to establish order among `ImageVersion` s within the same `Image`
 *   namespace. For example, if ImageVersionB `DependsOn` ImageVersionA and both share the same
 *   parent `Image` , then ImageVersionA is version N and ImageVersionB is N+1.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnImageVersion cfnImageVersion = CfnImageVersion.Builder.create(this, "MyCfnImageVersion")
 * .baseImage("baseImage")
 * .imageName("imageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html)
 */
@CdkDslMarker
public class CfnImageVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnImageVersion.Builder = CfnImageVersion.Builder.create(scope, id)

    /**
     * The container image that the SageMaker image version is based on.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 255.
     *
     * *Pattern* : `.*`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
     *
     * @param baseImage The container image that the SageMaker image version is based on.
     */
    public fun baseImage(baseImage: String) {
        cdkBuilder.baseImage(baseImage)
    }

    /**
     * The name of the parent image.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-imagename)
     *
     * @param imageName The name of the parent image.
     */
    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun build(): CfnImageVersion = cdkBuilder.build()
}
