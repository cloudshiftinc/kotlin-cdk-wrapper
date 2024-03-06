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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * The application settings for a Code Editor space.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SpaceCodeEditorAppSettingsProperty spaceCodeEditorAppSettingsProperty =
 * SpaceCodeEditorAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacecodeeditorappsettings.html)
 */
@CdkDslMarker
public class CfnSpaceSpaceCodeEditorAppSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceCodeEditorAppSettingsProperty.Builder =
        CfnSpace.SpaceCodeEditorAppSettingsProperty.builder()

    /**
     * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
     *   version, and the instance type that the version runs on.
     */
    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param defaultResourceSpec Specifies the ARNs of a SageMaker image and SageMaker image
     *   version, and the instance type that the version runs on.
     */
    public fun defaultResourceSpec(defaultResourceSpec: CfnSpace.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    public fun build(): CfnSpace.SpaceCodeEditorAppSettingsProperty = cdkBuilder.build()
}
