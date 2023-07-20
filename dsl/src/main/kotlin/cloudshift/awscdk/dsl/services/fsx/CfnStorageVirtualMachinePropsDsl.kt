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

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachine
import software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStorageVirtualMachinePropsDsl {
    private val cdkBuilder: CfnStorageVirtualMachineProps.Builder =
        CfnStorageVirtualMachineProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    public fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
        cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    public fun svmAdminPassword(svmAdminPassword: String) {
        cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStorageVirtualMachineProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
