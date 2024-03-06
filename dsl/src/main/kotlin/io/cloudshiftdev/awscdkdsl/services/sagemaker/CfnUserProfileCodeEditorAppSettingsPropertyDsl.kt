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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The Code Editor application settings.
 *
 * For more information about Code Editor, see
 * [Get started with Code Editor in Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/code-editor.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CodeEditorAppSettingsProperty codeEditorAppSettingsProperty =
 * CodeEditorAppSettingsProperty.builder()
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-codeeditorappsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileCodeEditorAppSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.CodeEditorAppSettingsProperty.Builder =
        CfnUserProfile.CodeEditorAppSettingsProperty.builder()

    private val _lifecycleConfigArns: MutableList<String> = mutableListOf()

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the Code Editor app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the Code Editor app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: CfnUserProfile.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
     *   lifecycle configuration.
     */
    public fun lifecycleConfigArns(vararg lifecycleConfigArns: String) {
        _lifecycleConfigArns.addAll(listOf(*lifecycleConfigArns))
    }

    /**
     * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the Code Editor application
     *   lifecycle configuration.
     */
    public fun lifecycleConfigArns(lifecycleConfigArns: Collection<String>) {
        _lifecycleConfigArns.addAll(lifecycleConfigArns)
    }

    public fun build(): CfnUserProfile.CodeEditorAppSettingsProperty {
        if (_lifecycleConfigArns.isNotEmpty()) cdkBuilder.lifecycleConfigArns(_lifecycleConfigArns)
        return cdkBuilder.build()
    }
}
