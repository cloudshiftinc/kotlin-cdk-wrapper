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
 * `SourceAuth` is a property of the
 * [AWS CodeBuild Project Source](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
 * property type that specifies authorization settings for AWS CodeBuild to access the source code
 * to be built.
 *
 * `SourceAuth` is for use by the CodeBuild console only. Do not get or set it directly.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * SourceAuthProperty sourceAuthProperty = SourceAuthProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .resource("resource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html)
 */
@CdkDslMarker
public class CfnProjectSourceAuthPropertyDsl {
    private val cdkBuilder: CfnProject.SourceAuthProperty.Builder =
        CfnProject.SourceAuthProperty.builder()

    /**
     * @param resource The resource value that applies to the specified authorization type.
     *
     * This data type is used by the AWS CodeBuild console only.
     */
    public fun resource(resource: String) {
        cdkBuilder.resource(resource)
    }

    /**
     * @param type The authorization type to use. The only valid value is `OAUTH` , which represents
     *   the OAuth authorization type.
     *
     * This data type is used by the AWS CodeBuild console only.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.SourceAuthProperty = cdkBuilder.build()
}
