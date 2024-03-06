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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
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
 * // the properties below are optional
 * .alias("alias")
 * .aliases(List.of("aliases"))
 * .horovod(false)
 * .jobType("jobType")
 * .mlFramework("mlFramework")
 * .processor("processor")
 * .programmingLang("programmingLang")
 * .releaseNotes("releaseNotes")
 * .vendorGuidance("vendorGuidance")
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

    private val _aliases: MutableList<String> = mutableListOf()

    /**
     * The alias of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-alias)
     *
     * @param alias The alias of the image version.
     */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     *
     * @param aliases List of aliases for the image version.
     */
    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    /**
     * List of aliases for the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-aliases)
     *
     * @param aliases List of aliases for the image version.
     */
    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    /**
     * The container image that the SageMaker image version is based on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-baseimage)
     *
     * @param baseImage The container image that the SageMaker image version is based on.
     */
    public fun baseImage(baseImage: String) {
        cdkBuilder.baseImage(baseImage)
    }

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     *
     * @param horovod Indicates Horovod compatibility.
     */
    public fun horovod(horovod: Boolean) {
        cdkBuilder.horovod(horovod)
    }

    /**
     * Indicates Horovod compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-horovod)
     *
     * @param horovod Indicates Horovod compatibility.
     */
    public fun horovod(horovod: IResolvable) {
        cdkBuilder.horovod(horovod)
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

    /**
     * Indicates SageMaker job type compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-jobtype)
     *
     * @param jobType Indicates SageMaker job type compatibility.
     */
    public fun jobType(jobType: String) {
        cdkBuilder.jobType(jobType)
    }

    /**
     * The machine learning framework vended in the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-mlframework)
     *
     * @param mlFramework The machine learning framework vended in the image version.
     */
    public fun mlFramework(mlFramework: String) {
        cdkBuilder.mlFramework(mlFramework)
    }

    /**
     * Indicates CPU or GPU compatibility.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-processor)
     *
     * @param processor Indicates CPU or GPU compatibility.
     */
    public fun processor(processor: String) {
        cdkBuilder.processor(processor)
    }

    /**
     * The supported programming language and its version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-programminglang)
     *
     * @param programmingLang The supported programming language and its version.
     */
    public fun programmingLang(programmingLang: String) {
        cdkBuilder.programmingLang(programmingLang)
    }

    /**
     * The maintainer description of the image version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-releasenotes)
     *
     * @param releaseNotes The maintainer description of the image version.
     */
    public fun releaseNotes(releaseNotes: String) {
        cdkBuilder.releaseNotes(releaseNotes)
    }

    /**
     * The availability of the image version specified by the maintainer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-imageversion.html#cfn-sagemaker-imageversion-vendorguidance)
     *
     * @param vendorGuidance The availability of the image version specified by the maintainer.
     */
    public fun vendorGuidance(vendorGuidance: String) {
        cdkBuilder.vendorGuidance(vendorGuidance)
    }

    public fun build(): CfnImageVersion {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
