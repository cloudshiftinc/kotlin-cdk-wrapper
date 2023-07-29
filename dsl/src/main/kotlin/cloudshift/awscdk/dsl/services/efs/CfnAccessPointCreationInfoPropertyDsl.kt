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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnAccessPoint

/**
 * Required if the `RootDirectory` &gt; `Path` specified does not exist.
 *
 * Specifies the POSIX IDs and permissions to apply to the access point's `RootDirectory` &gt;
 * `Path` . If the access point root directory does not exist, EFS creates it with these settings
 * when a client connects to the access point. When specifying `CreationInfo` , you must include
 * values for all properties.
 *
 * Amazon EFS creates a root directory only if you have provided the CreationInfo: OwnUid, OwnGID,
 * and permissions for the directory. If you do not provide this information, Amazon EFS does not
 * create the root directory. If the root directory does not exist, attempts to mount using the
 * access point will fail.
 *
 * If you do not provide `CreationInfo` and the specified `RootDirectory` does not exist, attempts
 * to mount the file system using the access point will fail.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * CreationInfoProperty creationInfoProperty = CreationInfoProperty.builder()
 * .ownerGid("ownerGid")
 * .ownerUid("ownerUid")
 * .permissions("permissions")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html)
 */
@CdkDslMarker
public class CfnAccessPointCreationInfoPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.CreationInfoProperty.Builder =
        CfnAccessPoint.CreationInfoProperty.builder()

    /**
     * @param ownerGid Specifies the POSIX group ID to apply to the `RootDirectory` . Accepts values
     *   from 0 to 2^32 (4294967295).
     */
    public fun ownerGid(ownerGid: String) {
        cdkBuilder.ownerGid(ownerGid)
    }

    /**
     * @param ownerUid Specifies the POSIX user ID to apply to the `RootDirectory` . Accepts values
     *   from 0 to 2^32 (4294967295).
     */
    public fun ownerUid(ownerUid: String) {
        cdkBuilder.ownerUid(ownerUid)
    }

    /**
     * @param permissions Specifies the POSIX permissions to apply to the `RootDirectory` , in the
     *   format of an octal number representing the file's mode bits.
     */
    public fun permissions(permissions: String) {
        cdkBuilder.permissions(permissions)
    }

    public fun build(): CfnAccessPoint.CreationInfoProperty = cdkBuilder.build()
}
