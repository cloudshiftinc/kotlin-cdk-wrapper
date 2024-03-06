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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The settings for the JupyterLab application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * JupyterLabAppSettingsProperty jupyterLabAppSettingsProperty =
 * JupyterLabAppSettingsProperty.builder()
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .customImages(List.of(CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .lifecycleConfigArns(List.of("lifecycleConfigArns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-jupyterlabappsettings.html)
 */
@CdkDslMarker
public class CfnUserProfileJupyterLabAppSettingsPropertyDsl {
    private val cdkBuilder: CfnUserProfile.JupyterLabAppSettingsProperty.Builder =
        CfnUserProfile.JupyterLabAppSettingsProperty.builder()

    private val _codeRepositories: MutableList<Any> = mutableListOf()

    private val _customImages: MutableList<Any> = mutableListOf()

    private val _lifecycleConfigArns: MutableList<String> = mutableListOf()

    /**
     * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
     *   users for cloning in the JupyterLab application.
     */
    public fun codeRepositories(vararg codeRepositories: Any) {
        _codeRepositories.addAll(listOf(*codeRepositories))
    }

    /**
     * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
     *   users for cloning in the JupyterLab application.
     */
    public fun codeRepositories(codeRepositories: Collection<Any>) {
        _codeRepositories.addAll(codeRepositories)
    }

    /**
     * @param codeRepositories A list of Git repositories that SageMaker automatically displays to
     *   users for cloning in the JupyterLab application.
     */
    public fun codeRepositories(codeRepositories: IResolvable) {
        cdkBuilder.codeRepositories(codeRepositories)
    }

    /**
     * @param customImages A list of custom SageMaker images that are configured to run as a
     *   JupyterLab app.
     */
    public fun customImages(vararg customImages: Any) {
        _customImages.addAll(listOf(*customImages))
    }

    /**
     * @param customImages A list of custom SageMaker images that are configured to run as a
     *   JupyterLab app.
     */
    public fun customImages(customImages: Collection<Any>) {
        _customImages.addAll(customImages)
    }

    /**
     * @param customImages A list of custom SageMaker images that are configured to run as a
     *   JupyterLab app.
     */
    public fun customImages(customImages: IResolvable) {
        cdkBuilder.customImages(customImages)
    }

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the JupyterLab app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: IResolvable) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of
     *   the default SageMaker image used by the JupyterLab app.
     */
    public fun defaultResourceSpec(defaultResourceSpec: CfnUserProfile.ResourceSpecProperty) {
        cdkBuilder.defaultResourceSpec(defaultResourceSpec)
    }

    /**
     * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
     *   attached to the user profile or domain. To remove a lifecycle config, you must set
     *   `LifecycleConfigArns` to an empty list.
     */
    public fun lifecycleConfigArns(vararg lifecycleConfigArns: String) {
        _lifecycleConfigArns.addAll(listOf(*lifecycleConfigArns))
    }

    /**
     * @param lifecycleConfigArns The Amazon Resource Name (ARN) of the lifecycle configurations
     *   attached to the user profile or domain. To remove a lifecycle config, you must set
     *   `LifecycleConfigArns` to an empty list.
     */
    public fun lifecycleConfigArns(lifecycleConfigArns: Collection<String>) {
        _lifecycleConfigArns.addAll(lifecycleConfigArns)
    }

    public fun build(): CfnUserProfile.JupyterLabAppSettingsProperty {
        if (_codeRepositories.isNotEmpty()) cdkBuilder.codeRepositories(_codeRepositories)
        if (_customImages.isNotEmpty()) cdkBuilder.customImages(_customImages)
        if (_lifecycleConfigArns.isNotEmpty()) cdkBuilder.lifecycleConfigArns(_lifecycleConfigArns)
        return cdkBuilder.build()
    }
}
