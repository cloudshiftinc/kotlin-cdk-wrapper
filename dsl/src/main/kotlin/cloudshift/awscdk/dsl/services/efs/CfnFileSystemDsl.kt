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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.efs.CfnFileSystem
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFileSystemDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFileSystem.Builder = CfnFileSystem.Builder.create(scope, id)

    private val _fileSystemTags: MutableList<CfnFileSystem.ElasticFileSystemTagProperty> =
        mutableListOf()

    private val _lifecyclePolicies: MutableList<Any> = mutableListOf()

    public fun availabilityZoneName(availabilityZoneName: String) {
        cdkBuilder.availabilityZoneName(availabilityZoneName)
    }

    public fun backupPolicy(backupPolicy: IResolvable) {
        cdkBuilder.backupPolicy(backupPolicy)
    }

    public fun backupPolicy(backupPolicy: CfnFileSystem.BackupPolicyProperty) {
        cdkBuilder.backupPolicy(backupPolicy)
    }

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
        cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
        cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun fileSystemPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.fileSystemPolicy(builder.map)
    }

    public fun fileSystemPolicy(fileSystemPolicy: Any) {
        cdkBuilder.fileSystemPolicy(fileSystemPolicy)
    }

    public fun fileSystemTags(fileSystemTags: CfnFileSystemElasticFileSystemTagPropertyDsl.() -> Unit) {
        _fileSystemTags.add(CfnFileSystemElasticFileSystemTagPropertyDsl().apply(fileSystemTags).build())
    }

    public fun fileSystemTags(fileSystemTags: Collection<CfnFileSystem.ElasticFileSystemTagProperty>) {
        _fileSystemTags.addAll(fileSystemTags)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun lifecyclePolicies(vararg lifecyclePolicies: Any) {
        _lifecyclePolicies.addAll(listOf(*lifecyclePolicies))
    }

    public fun lifecyclePolicies(lifecyclePolicies: Collection<Any>) {
        _lifecyclePolicies.addAll(lifecyclePolicies)
    }

    public fun lifecyclePolicies(lifecyclePolicies: IResolvable) {
        cdkBuilder.lifecyclePolicies(lifecyclePolicies)
    }

    public fun performanceMode(performanceMode: String) {
        cdkBuilder.performanceMode(performanceMode)
    }

    public fun provisionedThroughputInMibps(provisionedThroughputInMibps: Number) {
        cdkBuilder.provisionedThroughputInMibps(provisionedThroughputInMibps)
    }

    public fun throughputMode(throughputMode: String) {
        cdkBuilder.throughputMode(throughputMode)
    }

    public fun build(): CfnFileSystem {
        if (_fileSystemTags.isNotEmpty()) cdkBuilder.fileSystemTags(_fileSystemTags)
        if (_lifecyclePolicies.isNotEmpty()) cdkBuilder.lifecyclePolicies(_lifecyclePolicies)
        return cdkBuilder.build()
    }
}
