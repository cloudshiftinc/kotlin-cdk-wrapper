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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnComponentVersion

/**
 * Contains information about a device that Linux processes in a container can access.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * LambdaDeviceMountProperty lambdaDeviceMountProperty = LambdaDeviceMountProperty.builder()
 * .addGroupOwner(false)
 * .path("path")
 * .permission("permission")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-componentversion-lambdadevicemount.html)
 */
@CdkDslMarker
public class CfnComponentVersionLambdaDeviceMountPropertyDsl {
    private val cdkBuilder: CfnComponentVersion.LambdaDeviceMountProperty.Builder =
        CfnComponentVersion.LambdaDeviceMountProperty.builder()

    /**
     * @param addGroupOwner Whether or not to add the component's system user as an owner of the
     *   device. Default: `false`
     */
    public fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
    }

    /**
     * @param addGroupOwner Whether or not to add the component's system user as an owner of the
     *   device. Default: `false`
     */
    public fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner)
    }

    /** @param path The mount path for the device in the file system. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param permission The permission to access the device: read/only ( `ro` ) or read/write (
     *   `rw` ). Default: `ro`
     */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    public fun build(): CfnComponentVersion.LambdaDeviceMountProperty = cdkBuilder.build()
}
