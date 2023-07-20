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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.memorydb.CfnCluster
import software.amazon.awscdk.services.memorydb.CfnClusterProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterPropsDsl {
    private val cdkBuilder: CfnClusterProps.Builder = CfnClusterProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _snapshotArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun aclName(aclName: String) {
        cdkBuilder.aclName(aclName)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
        cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public fun clusterEndpoint(clusterEndpoint: IResolvable) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty) {
        cdkBuilder.clusterEndpoint(clusterEndpoint)
    }

    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun dataTiering(dataTiering: String) {
        cdkBuilder.dataTiering(dataTiering)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun finalSnapshotName(finalSnapshotName: String) {
        cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun maintenanceWindow(maintenanceWindow: String) {
        cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    public fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
    }

    public fun numReplicasPerShard(numReplicasPerShard: Number) {
        cdkBuilder.numReplicasPerShard(numReplicasPerShard)
    }

    public fun numShards(numShards: Number) {
        cdkBuilder.numShards(numShards)
    }

    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
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

    public fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun snsTopicStatus(snsTopicStatus: String) {
        cdkBuilder.snsTopicStatus(snsTopicStatus)
    }

    public fun subnetGroupName(subnetGroupName: String) {
        cdkBuilder.subnetGroupName(subnetGroupName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun tlsEnabled(tlsEnabled: Boolean) {
        cdkBuilder.tlsEnabled(tlsEnabled)
    }

    public fun tlsEnabled(tlsEnabled: IResolvable) {
        cdkBuilder.tlsEnabled(tlsEnabled)
    }

    public fun build(): CfnClusterProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_snapshotArns.isNotEmpty()) cdkBuilder.snapshotArns(_snapshotArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
