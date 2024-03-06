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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnImageProps

/**
 * Properties for defining a `CfnImage`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnImageProps cfnImageProps = CfnImageProps.builder()
 * .imageName("imageName")
 * .imageRoleArn("imageRoleArn")
 * // the properties below are optional
 * .imageDescription("imageDescription")
 * .imageDisplayName("imageDisplayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-image.html)
 */
@CdkDslMarker
public class CfnImagePropsDsl {
    private val cdkBuilder: CfnImageProps.Builder = CfnImageProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param imageDescription The description of the image. */
    public fun imageDescription(imageDescription: String) {
        cdkBuilder.imageDescription(imageDescription)
    }

    /**
     * @param imageDisplayName The display name of the image. *Length Constraints* : Minimum length
     *   of 1. Maximum length of 128.
     *
     * *Pattern* : `^\S(.*\S)?$`
     */
    public fun imageDisplayName(imageDisplayName: String) {
        cdkBuilder.imageDisplayName(imageDisplayName)
    }

    /**
     * @param imageName The name of the Image. Must be unique by region in your account. *Length
     *   Constraints* : Minimum length of 1. Maximum length of 63.
     *
     * *Pattern* : `^[a-zA-Z0-9]([-.]?[a-zA-Z0-9]){0,62}$`
     */
    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    /**
     * @param imageRoleArn The Amazon Resource Name (ARN) of an IAM role that enables Amazon
     *   SageMaker to perform tasks on your behalf. *Length Constraints* : Minimum length of 20.
     *   Maximum length of 2048.
     *
     * *Pattern* : `^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.&#64;\-_/]+$`
     */
    public fun imageRoleArn(imageRoleArn: String) {
        cdkBuilder.imageRoleArn(imageRoleArn)
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource. *Array Members* : Minimum
     *   number of 0 items. Maximum number of 50 items.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of key-value pairs to apply to this resource. *Array Members* : Minimum
     *   number of 0 items. Maximum number of 50 items.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnImageProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
