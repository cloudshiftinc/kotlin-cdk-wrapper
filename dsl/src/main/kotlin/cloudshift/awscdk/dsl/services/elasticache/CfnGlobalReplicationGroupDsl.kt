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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGlobalReplicationGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGlobalReplicationGroup.Builder =
        CfnGlobalReplicationGroup.Builder.create(scope, id)

    private val _members: MutableList<Any> = mutableListOf()

    private val _regionalConfigurations: MutableList<Any> = mutableListOf()

    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
        cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
        cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    public fun cacheNodeType(cacheNodeType: String) {
        cdkBuilder.cacheNodeType(cacheNodeType)
    }

    public fun cacheParameterGroupName(cacheParameterGroupName: String) {
        cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun globalNodeGroupCount(globalNodeGroupCount: Number) {
        cdkBuilder.globalNodeGroupCount(globalNodeGroupCount)
    }

    public fun globalReplicationGroupDescription(globalReplicationGroupDescription: String) {
        cdkBuilder.globalReplicationGroupDescription(globalReplicationGroupDescription)
    }

    public fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String) {
        cdkBuilder.globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix)
    }

    public fun members(vararg members: Any) {
        _members.addAll(listOf(*members))
    }

    public fun members(members: Collection<Any>) {
        _members.addAll(members)
    }

    public fun members(members: IResolvable) {
        cdkBuilder.members(members)
    }

    public fun regionalConfigurations(vararg regionalConfigurations: Any) {
        _regionalConfigurations.addAll(listOf(*regionalConfigurations))
    }

    public fun regionalConfigurations(regionalConfigurations: Collection<Any>) {
        _regionalConfigurations.addAll(regionalConfigurations)
    }

    public fun regionalConfigurations(regionalConfigurations: IResolvable) {
        cdkBuilder.regionalConfigurations(regionalConfigurations)
    }

    public fun build(): CfnGlobalReplicationGroup {
        if (_members.isNotEmpty()) cdkBuilder.members(_members)
        if (_regionalConfigurations.isNotEmpty()) {
            cdkBuilder.regionalConfigurations(_regionalConfigurations)
        }
        return cdkBuilder.build()
    }
}
