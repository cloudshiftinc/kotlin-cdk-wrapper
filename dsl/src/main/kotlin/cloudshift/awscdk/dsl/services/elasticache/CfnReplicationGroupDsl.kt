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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnReplicationGroup.Builder = CfnReplicationGroup.Builder.create(
        scope,
        id,
    )

    private val _cacheSecurityGroupNames: MutableList<String> = mutableListOf()

    private val _logDeliveryConfigurations: MutableList<Any> = mutableListOf()

    private val _nodeGroupConfiguration: MutableList<Any> = mutableListOf()

    private val _preferredCacheClusterAZs: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _snapshotArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userGroupIds: MutableList<String> = mutableListOf()

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
        cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
        cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    public fun authToken(authToken: String) {
        cdkBuilder.authToken(authToken)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

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

    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String) {
        _cacheSecurityGroupNames.addAll(listOf(*cacheSecurityGroupNames))
    }

    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: Collection<String>) {
        _cacheSecurityGroupNames.addAll(cacheSecurityGroupNames)
    }

    public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
        cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    public fun clusterMode(clusterMode: String) {
        cdkBuilder.clusterMode(clusterMode)
    }

    public fun dataTieringEnabled(dataTieringEnabled: Boolean) {
        cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    public fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
        cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun globalReplicationGroupId(globalReplicationGroupId: String) {
        cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
    }

    public fun ipDiscovery(ipDiscovery: String) {
        cdkBuilder.ipDiscovery(ipDiscovery)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any) {
        _logDeliveryConfigurations.addAll(listOf(*logDeliveryConfigurations))
    }

    public fun logDeliveryConfigurations(logDeliveryConfigurations: Collection<Any>) {
        _logDeliveryConfigurations.addAll(logDeliveryConfigurations)
    }

    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
        cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    public fun multiAzEnabled(multiAzEnabled: Boolean) {
        cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    public fun multiAzEnabled(multiAzEnabled: IResolvable) {
        cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    public fun networkType(networkType: String) {
        cdkBuilder.networkType(networkType)
    }

    public fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any) {
        _nodeGroupConfiguration.addAll(listOf(*nodeGroupConfiguration))
    }

    public fun nodeGroupConfiguration(nodeGroupConfiguration: Collection<Any>) {
        _nodeGroupConfiguration.addAll(nodeGroupConfiguration)
    }

    public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
        cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration)
    }

    public fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    public fun numCacheClusters(numCacheClusters: Number) {
        cdkBuilder.numCacheClusters(numCacheClusters)
    }

    public fun numNodeGroups(numNodeGroups: Number) {
        cdkBuilder.numNodeGroups(numNodeGroups)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String) {
        _preferredCacheClusterAZs.addAll(listOf(*preferredCacheClusterAZs))
    }

    public fun preferredCacheClusterAZs(preferredCacheClusterAZs: Collection<String>) {
        _preferredCacheClusterAZs.addAll(preferredCacheClusterAZs)
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public fun primaryClusterId(primaryClusterId: String) {
        cdkBuilder.primaryClusterId(primaryClusterId)
    }

    public fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
        cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
    }

    public fun replicationGroupDescription(replicationGroupDescription: String) {
        cdkBuilder.replicationGroupDescription(replicationGroupDescription)
    }

    public fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun snapshotArns(vararg snapshotArns: String) {
        _snapshotArns.addAll(listOf(*snapshotArns))
    }

    public fun snapshotArns(snapshotArns: Collection<String>) {
        _snapshotArns.addAll(snapshotArns)
    }

    public fun snapshotName(snapshotName: String) {
        cdkBuilder.snapshotName(snapshotName)
    }

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
        cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    public fun snapshotWindow(snapshotWindow: String) {
        cdkBuilder.snapshotWindow(snapshotWindow)
    }

    public fun snapshottingClusterId(snapshottingClusterId: String) {
        cdkBuilder.snapshottingClusterId(snapshottingClusterId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
        cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
        cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    public fun transitEncryptionMode(transitEncryptionMode: String) {
        cdkBuilder.transitEncryptionMode(transitEncryptionMode)
    }

    public fun userGroupIds(vararg userGroupIds: String) {
        _userGroupIds.addAll(listOf(*userGroupIds))
    }

    public fun userGroupIds(userGroupIds: Collection<String>) {
        _userGroupIds.addAll(userGroupIds)
    }

    public fun build(): CfnReplicationGroup {
        if (_cacheSecurityGroupNames.isNotEmpty()) {
            cdkBuilder.cacheSecurityGroupNames(_cacheSecurityGroupNames)
        }
        if (_logDeliveryConfigurations.isNotEmpty()) {
            cdkBuilder.logDeliveryConfigurations(_logDeliveryConfigurations)
        }
        if (_nodeGroupConfiguration.isNotEmpty()) {
            cdkBuilder.nodeGroupConfiguration(_nodeGroupConfiguration)
        }
        if (_preferredCacheClusterAZs.isNotEmpty()) {
            cdkBuilder.preferredCacheClusterAZs(_preferredCacheClusterAZs)
        }
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userGroupIds.isNotEmpty()) cdkBuilder.userGroupIds(_userGroupIds)
        return cdkBuilder.build()
    }
}
