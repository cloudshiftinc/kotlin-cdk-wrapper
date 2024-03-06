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
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnDomain

/**
 * Details about the POSIX identity that is used for file system operations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CustomPosixUserConfigProperty customPosixUserConfigProperty =
 * CustomPosixUserConfigProperty.builder()
 * .gid(123)
 * .uid(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-domain-customposixuserconfig.html)
 */
@CdkDslMarker
public class CfnDomainCustomPosixUserConfigPropertyDsl {
    private val cdkBuilder: CfnDomain.CustomPosixUserConfigProperty.Builder =
        CfnDomain.CustomPosixUserConfigProperty.builder()

    /** @param gid The POSIX group ID. */
    public fun gid(gid: Number) {
        cdkBuilder.gid(gid)
    }

    /** @param uid The POSIX user ID. */
    public fun uid(uid: Number) {
        cdkBuilder.uid(uid)
    }

    public fun build(): CfnDomain.CustomPosixUserConfigProperty = cdkBuilder.build()
}
