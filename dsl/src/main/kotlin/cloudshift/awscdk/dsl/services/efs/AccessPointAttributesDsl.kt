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
import software.amazon.awscdk.services.efs.AccessPointAttributes
import software.amazon.awscdk.services.efs.IFileSystem

/**
 * Attributes that can be specified when importing an AccessPoint.
 *
 * Example:
 * ```
 * AccessPoint.fromAccessPointAttributes(this, "ap", AccessPointAttributes.builder()
 * .accessPointId("fsap-1293c4d9832fo0912")
 * .fileSystem(FileSystem.fromFileSystemAttributes(this, "efs", FileSystemAttributes.builder()
 * .fileSystemId("fs-099d3e2f")
 * .securityGroup(SecurityGroup.fromSecurityGroupId(this, "sg", "sg-51530134"))
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class AccessPointAttributesDsl {
    private val cdkBuilder: AccessPointAttributes.Builder = AccessPointAttributes.builder()

    /**
     * @param accessPointArn The ARN of the AccessPoint One of this, or `accessPointId` is required.
     */
    public fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
    }

    /**
     * @param accessPointId The ID of the AccessPoint One of this, or `accessPointArn` is required.
     */
    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    /** @param fileSystem The EFS file system. */
    public fun fileSystem(fileSystem: IFileSystem) {
        cdkBuilder.fileSystem(fileSystem)
    }

    public fun build(): AccessPointAttributes = cdkBuilder.build()
}
