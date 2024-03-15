@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClusterProps {
  public fun aclName(): String

  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

  public fun clusterName(): String

  public fun dataTiering(): String? = unwrap(this).getDataTiering()

  public fun description(): String? = unwrap(this).getDescription()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

  public fun nodeType(): String

  public fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

  public fun numShards(): Number? = unwrap(this).getNumShards()

  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  @CdkDslMarker
  public interface Builder {
    public fun aclName(aclName: String)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun clusterEndpoint(clusterEndpoint: IResolvable)

    public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0321f528d8f2b81e84125a9061b941b51ee01fe1936f9baddd562083f0552768")
    public fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun dataTiering(dataTiering: String)

    public fun description(description: String)

    public fun engineVersion(engineVersion: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun maintenanceWindow(maintenanceWindow: String)

    public fun nodeType(nodeType: String)

    public fun numReplicasPerShard(numReplicasPerShard: Number)

    public fun numShards(numShards: Number)

    public fun parameterGroupName(parameterGroupName: String)

    public fun port(port: Number)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun snapshotArns(snapshotArns: List<String>)

    public fun snapshotArns(vararg snapshotArns: String)

    public fun snapshotName(snapshotName: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun snapshotWindow(snapshotWindow: String)

    public fun snsTopicArn(snsTopicArn: String)

    public fun snsTopicStatus(snsTopicStatus: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsEnabled(tlsEnabled: Boolean)

    public fun tlsEnabled(tlsEnabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnClusterProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnClusterProps.builder()

    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun clusterEndpoint(clusterEndpoint: IResolvable) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(IResolvable::unwrap))
    }

    override fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(CfnCluster.EndpointProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0321f528d8f2b81e84125a9061b941b51ee01fe1936f9baddd562083f0552768")
    override fun clusterEndpoint(clusterEndpoint: CfnCluster.EndpointProperty.Builder.() -> Unit):
        Unit = clusterEndpoint(CfnCluster.EndpointProperty(clusterEndpoint))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun dataTiering(dataTiering: String) {
      cdkBuilder.dataTiering(dataTiering)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun maintenanceWindow(maintenanceWindow: String) {
      cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    override fun numReplicasPerShard(numReplicasPerShard: Number) {
      cdkBuilder.numReplicasPerShard(numReplicasPerShard)
    }

    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    override fun snsTopicStatus(snsTopicStatus: String) {
      cdkBuilder.snsTopicStatus(snsTopicStatus)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.memorydb.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun aclName(): String = unwrap(this).getAclName()

    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun dataTiering(): String? = unwrap(this).getDataTiering()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

    override fun nodeType(): String = unwrap(this).getNodeType()

    override fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

    override fun numShards(): Number? = unwrap(this).getNumShards()

    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    override fun port(): Number? = unwrap(this).getPort()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    override fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    override fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.memorydb.CfnClusterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.memorydb.CfnClusterProps
  }
}
