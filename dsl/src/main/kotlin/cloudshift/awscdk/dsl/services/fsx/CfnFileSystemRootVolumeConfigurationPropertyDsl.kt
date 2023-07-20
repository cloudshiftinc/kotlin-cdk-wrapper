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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnFileSystem
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFileSystemRootVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnFileSystem.RootVolumeConfigurationProperty.Builder =
        CfnFileSystem.RootVolumeConfigurationProperty.builder()

    private val _nfsExports: MutableList<Any> = mutableListOf()

    private val _userAndGroupQuotas: MutableList<Any> = mutableListOf()

    public fun copyTagsToSnapshots(copyTagsToSnapshots: Boolean) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
    }

    public fun copyTagsToSnapshots(copyTagsToSnapshots: IResolvable) {
        cdkBuilder.copyTagsToSnapshots(copyTagsToSnapshots)
    }

    public fun dataCompressionType(dataCompressionType: String) {
        cdkBuilder.dataCompressionType(dataCompressionType)
    }

    public fun nfsExports(vararg nfsExports: Any) {
        _nfsExports.addAll(listOf(*nfsExports))
    }

    public fun nfsExports(nfsExports: Collection<Any>) {
        _nfsExports.addAll(nfsExports)
    }

    public fun nfsExports(nfsExports: IResolvable) {
        cdkBuilder.nfsExports(nfsExports)
    }

    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun recordSizeKiB(recordSizeKiB: Number) {
        cdkBuilder.recordSizeKiB(recordSizeKiB)
    }

    public fun userAndGroupQuotas(vararg userAndGroupQuotas: Any) {
        _userAndGroupQuotas.addAll(listOf(*userAndGroupQuotas))
    }

    public fun userAndGroupQuotas(userAndGroupQuotas: Collection<Any>) {
        _userAndGroupQuotas.addAll(userAndGroupQuotas)
    }

    public fun userAndGroupQuotas(userAndGroupQuotas: IResolvable) {
        cdkBuilder.userAndGroupQuotas(userAndGroupQuotas)
    }

    public fun build(): CfnFileSystem.RootVolumeConfigurationProperty {
        if (_nfsExports.isNotEmpty()) cdkBuilder.nfsExports(_nfsExports)
        if (_userAndGroupQuotas.isNotEmpty()) cdkBuilder.userAndGroupQuotas(_userAndGroupQuotas)
        return cdkBuilder.build()
    }
}
