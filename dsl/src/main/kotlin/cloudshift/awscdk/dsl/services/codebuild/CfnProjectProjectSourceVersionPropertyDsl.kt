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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * A source identifier and its corresponding version.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ProjectSourceVersionProperty projectSourceVersionProperty =
 * ProjectSourceVersionProperty.builder()
 * .sourceIdentifier("sourceIdentifier")
 * // the properties below are optional
 * .sourceVersion("sourceVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html)
 */
@CdkDslMarker
public class CfnProjectProjectSourceVersionPropertyDsl {
    private val cdkBuilder: CfnProject.ProjectSourceVersionProperty.Builder =
        CfnProject.ProjectSourceVersionProperty.builder()

    /**
     * @param sourceIdentifier An identifier for a source in the build project. The identifier can
     *   only contain alphanumeric characters and underscores, and must be less than 128 characters
     *   in length.
     */
    public fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
    }

    /**
     * @param sourceVersion The source version for the corresponding source identifier. If
     *   specified, must be one of:.
     * * For CodeCommit: the commit ID, branch, or Git tag to use.
     * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
     *   the version of the source code you want to build. If a pull request ID is specified, it
     *   must use the format `pr/pull-request-ID` (for example, `pr/25` ). If a branch name is
     *   specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     *   commit ID is used.
     * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
     *   the source code you want to build. If a branch name is specified, the branch's HEAD commit
     *   ID is used. If not specified, the default branch's HEAD commit ID is used.
     * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
     *   use.
     *
     * For more information, see
     * [Source Version Sample with CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html)
     * in the *AWS CodeBuild User Guide* .
     */
    public fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): CfnProject.ProjectSourceVersionProperty = cdkBuilder.build()
}
