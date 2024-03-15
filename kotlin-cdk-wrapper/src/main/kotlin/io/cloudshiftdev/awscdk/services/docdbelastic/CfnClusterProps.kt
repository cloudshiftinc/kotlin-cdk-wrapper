@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdbelastic

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnClusterProps {
  public fun adminUserName(): String

  public fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

  public fun authType(): String

  public fun clusterName(): String

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun shardCapacity(): Number

  public fun shardCount(): Number

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun adminUserName(adminUserName: String)

    public fun adminUserPassword(adminUserPassword: String)

    public fun authType(authType: String)

    public fun clusterName(clusterName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun shardCapacity(shardCapacity: Number)

    public fun shardCount(shardCount: Number)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdbelastic.CfnClusterProps.Builder =
        software.amazon.awscdk.services.docdbelastic.CfnClusterProps.builder()

    override fun adminUserName(adminUserName: String) {
      cdkBuilder.adminUserName(adminUserName)
    }

    override fun adminUserPassword(adminUserPassword: String) {
      cdkBuilder.adminUserPassword(adminUserPassword)
    }

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun shardCapacity(shardCapacity: Number) {
      cdkBuilder.shardCapacity(shardCapacity)
    }

    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.docdbelastic.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdbelastic.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    override fun adminUserName(): String = unwrap(this).getAdminUserName()

    override fun adminUserPassword(): String? = unwrap(this).getAdminUserPassword()

    override fun authType(): String = unwrap(this).getAuthType()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun shardCapacity(): Number = unwrap(this).getShardCapacity()

    override fun shardCount(): Number = unwrap(this).getShardCount()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdbelastic.CfnClusterProps):
        CfnClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.docdbelastic.CfnClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdbelastic.CfnClusterProps
  }
}
