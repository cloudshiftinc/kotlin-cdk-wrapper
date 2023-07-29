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

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspaces.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
 * .bundleId("bundleId")
 * .directoryId("directoryId")
 * .userName("userName")
 * // the properties below are optional
 * .rootVolumeEncryptionEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userVolumeEncryptionEnabled(false)
 * .volumeEncryptionKey("volumeEncryptionKey")
 * .workspaceProperties(WorkspacePropertiesProperty.builder()
 * .computeTypeName("computeTypeName")
 * .rootVolumeSizeGib(123)
 * .runningMode("runningMode")
 * .runningModeAutoStopTimeoutInMinutes(123)
 * .userVolumeSizeGib(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspaces-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspacePropsDsl {
    private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param bundleId The identifier of the bundle for the WorkSpace. */
    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param directoryId The identifier of the AWS Directory Service directory for the WorkSpace.
     */
    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     *   encrypted.
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
        cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    /**
     * @param rootVolumeEncryptionEnabled Indicates whether the data stored on the root volume is
     *   encrypted.
     */
    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
        cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    /** @param tags The tags for the WorkSpace. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the WorkSpace. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param userName The user name of the user for the WorkSpace. This user name must exist in the
     *   AWS Directory Service directory for the WorkSpace.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     *   encrypted.
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
        cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    /**
     * @param userVolumeEncryptionEnabled Indicates whether the data stored on the user volume is
     *   encrypted.
     */
    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
        cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    /**
     * @param volumeEncryptionKey The symmetric AWS KMS key used to encrypt data stored on your
     *   WorkSpace. Amazon WorkSpaces does not support asymmetric KMS keys.
     */
    public fun volumeEncryptionKey(volumeEncryptionKey: String) {
        cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    /** @param workspaceProperties The WorkSpace properties. */
    public fun workspaceProperties(workspaceProperties: IResolvable) {
        cdkBuilder.workspaceProperties(workspaceProperties)
    }

    /** @param workspaceProperties The WorkSpace properties. */
    public fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty) {
        cdkBuilder.workspaceProperties(workspaceProperties)
    }

    public fun build(): CfnWorkspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
