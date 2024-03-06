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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * The settings for the JupyterLab application within a space.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SpaceJupyterLabAppSettingsProperty spaceJupyterLabAppSettingsProperty =
 * SpaceJupyterLabAppSettingsProperty.builder()
 * .codeRepositories(List.of(CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build()))
 * .defaultResourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacejupyterlabappsettings.html)
 */
@CdkDslMarker
public class CfnSpaceSpaceJupyterLabAppSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceJupyterLabAppSettingsProperty.Builder =
        CfnSpace.SpaceJupyterLabAppSettingsProperty.builder()

    private val _codeRepositories: MutableList<Any> = mutableListOf()

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

    public fun build(): CfnSpace.SpaceJupyterLabAppSettingsProperty {
        if (_codeRepositories.isNotEmpty()) cdkBuilder.codeRepositories(_codeRepositories)
        return cdkBuilder.build()
    }
}
