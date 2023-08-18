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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `GitSubmodulesConfig` is a property of the
 * [AWS CodeBuild Project Source](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
 * property type that specifies information about the Git submodules configuration for the build
 * project.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * GitSubmodulesConfigProperty gitSubmodulesConfigProperty = GitSubmodulesConfigProperty.builder()
 * .fetchSubmodules(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html)
 */
@CdkDslMarker
public class CfnProjectGitSubmodulesConfigPropertyDsl {
    private val cdkBuilder: CfnProject.GitSubmodulesConfigProperty.Builder =
        CfnProject.GitSubmodulesConfigProperty.builder()

    /**
     * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
     *   project.
     */
    public fun fetchSubmodules(fetchSubmodules: Boolean) {
        cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    /**
     * @param fetchSubmodules Set to true to fetch Git submodules for your AWS CodeBuild build
     *   project.
     */
    public fun fetchSubmodules(fetchSubmodules: IResolvable) {
        cdkBuilder.fetchSubmodules(fetchSubmodules)
    }

    public fun build(): CfnProject.GitSubmodulesConfigProperty = cdkBuilder.build()
}
