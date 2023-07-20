@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.workspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspaces.CfnWorkspace
import software.amazon.awscdk.services.workspaces.CfnWorkspaceProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkspacePropsDsl {
    private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    public fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
    }

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: Boolean) {
        cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    public fun rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled: IResolvable) {
        cdkBuilder.rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: Boolean) {
        cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    public fun userVolumeEncryptionEnabled(userVolumeEncryptionEnabled: IResolvable) {
        cdkBuilder.userVolumeEncryptionEnabled(userVolumeEncryptionEnabled)
    }

    public fun volumeEncryptionKey(volumeEncryptionKey: String) {
        cdkBuilder.volumeEncryptionKey(volumeEncryptionKey)
    }

    public fun workspaceProperties(workspaceProperties: IResolvable) {
        cdkBuilder.workspaceProperties(workspaceProperties)
    }

    public fun workspaceProperties(workspaceProperties: CfnWorkspace.WorkspacePropertiesProperty) {
        cdkBuilder.workspaceProperties(workspaceProperties)
    }

    public fun build(): CfnWorkspaceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
