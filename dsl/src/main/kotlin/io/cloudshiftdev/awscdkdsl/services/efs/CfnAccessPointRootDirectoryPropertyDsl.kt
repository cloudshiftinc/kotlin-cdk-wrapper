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

package io.cloudshiftdev.awscdkdsl.services.efs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnAccessPoint

/**
 * Specifies the directory on the Amazon EFS file system that the access point provides access to.
 *
 * The access point exposes the specified file system path as the root directory of your file system
 * to applications using the access point. NFS clients using the access point can only access data
 * in the access point's `RootDirectory` and its subdirectories.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.efs.*;
 * RootDirectoryProperty rootDirectoryProperty = RootDirectoryProperty.builder()
 * .creationInfo(CreationInfoProperty.builder()
 * .ownerGid("ownerGid")
 * .ownerUid("ownerUid")
 * .permissions("permissions")
 * .build())
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-rootdirectory.html)
 */
@CdkDslMarker
public class CfnAccessPointRootDirectoryPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.RootDirectoryProperty.Builder =
        CfnAccessPoint.RootDirectoryProperty.builder()

    /**
     * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the access
     *   point's `RootDirectory` . If the `RootDirectory` &gt; `Path` specified does not exist, EFS
     *   creates the root directory using the `CreationInfo` settings when a client connects to an
     *   access point. When specifying the `CreationInfo` , you must provide values for all
     *   properties.
     *
     * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
     * exist, attempts to mount the file system using the access point will fail.
     */
    public fun creationInfo(creationInfo: IResolvable) {
        cdkBuilder.creationInfo(creationInfo)
    }

    /**
     * @param creationInfo (Optional) Specifies the POSIX IDs and permissions to apply to the access
     *   point's `RootDirectory` . If the `RootDirectory` &gt; `Path` specified does not exist, EFS
     *   creates the root directory using the `CreationInfo` settings when a client connects to an
     *   access point. When specifying the `CreationInfo` , you must provide values for all
     *   properties.
     *
     * If you do not provide `CreationInfo` and the specified `RootDirectory` &gt; `Path` does not
     * exist, attempts to mount the file system using the access point will fail.
     */
    public fun creationInfo(creationInfo: CfnAccessPoint.CreationInfoProperty) {
        cdkBuilder.creationInfo(creationInfo)
    }

    /**
     * @param path Specifies the path on the EFS file system to expose as the root directory to NFS
     *   clients using the access point to access the EFS file system. A path can have up to four
     *   subdirectories. If the specified path does not exist, you are required to provide the
     *   `CreationInfo` .
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnAccessPoint.RootDirectoryProperty = cdkBuilder.build()
}
