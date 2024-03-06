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
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps

/**
 * Properties for defining a `CfnImageVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnImageVersionProps cfnImageVersionProps = CfnImageVersionProps.builder()
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
public class CfnImageVersionPropsDsl {
    private val cdkBuilder: CfnImageVersionProps.Builder = CfnImageVersionProps.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    /** @param alias The alias of the image version. */
    public fun alias(alias: String) {
        cdkBuilder.alias(alias)
    }

    /** @param aliases List of aliases for the image version. */
    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    /** @param aliases List of aliases for the image version. */
    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    /** @param baseImage The container image that the SageMaker image version is based on. */
    public fun baseImage(baseImage: String) {
        cdkBuilder.baseImage(baseImage)
    }

    /** @param horovod Indicates Horovod compatibility. */
    public fun horovod(horovod: Boolean) {
        cdkBuilder.horovod(horovod)
    }

    /** @param horovod Indicates Horovod compatibility. */
    public fun horovod(horovod: IResolvable) {
        cdkBuilder.horovod(horovod)
    }

    /**
     * @param imageName The name of the parent image. *Length Constraints* : Minimum length of 1.
     *   Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    /** @param jobType Indicates SageMaker job type compatibility. */
    public fun jobType(jobType: String) {
        cdkBuilder.jobType(jobType)
    }

    /** @param mlFramework The machine learning framework vended in the image version. */
    public fun mlFramework(mlFramework: String) {
        cdkBuilder.mlFramework(mlFramework)
    }

    /** @param processor Indicates CPU or GPU compatibility. */
    public fun processor(processor: String) {
        cdkBuilder.processor(processor)
    }

    /** @param programmingLang The supported programming language and its version. */
    public fun programmingLang(programmingLang: String) {
        cdkBuilder.programmingLang(programmingLang)
    }

    /** @param releaseNotes The maintainer description of the image version. */
    public fun releaseNotes(releaseNotes: String) {
        cdkBuilder.releaseNotes(releaseNotes)
    }

    /** @param vendorGuidance The availability of the image version specified by the maintainer. */
    public fun vendorGuidance(vendorGuidance: String) {
        cdkBuilder.vendorGuidance(vendorGuidance)
    }

    public fun build(): CfnImageVersionProps {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
