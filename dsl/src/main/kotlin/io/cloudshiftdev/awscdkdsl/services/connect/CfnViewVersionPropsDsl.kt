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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnViewVersionProps

/**
 * Properties for defining a `CfnViewVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * CfnViewVersionProps cfnViewVersionProps = CfnViewVersionProps.builder()
 * .viewArn("viewArn")
 * // the properties below are optional
 * .versionDescription("versionDescription")
 * .viewContentSha256("viewContentSha256")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html)
 */
@CdkDslMarker
public class CfnViewVersionPropsDsl {
    private val cdkBuilder: CfnViewVersionProps.Builder = CfnViewVersionProps.builder()

    /** @param versionDescription The description of the view version. */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    /**
     * @param viewArn The unqualified Amazon Resource Name (ARN) of the view. For example:
     *
     * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
     */
    public fun viewArn(viewArn: String) {
        cdkBuilder.viewArn(viewArn)
    }

    /**
     * @param viewContentSha256 Indicates the checksum value of the latest published view content.
     */
    public fun viewContentSha256(viewContentSha256: String) {
        cdkBuilder.viewContentSha256(viewContentSha256)
    }

    public fun build(): CfnViewVersionProps = cdkBuilder.build()
}
