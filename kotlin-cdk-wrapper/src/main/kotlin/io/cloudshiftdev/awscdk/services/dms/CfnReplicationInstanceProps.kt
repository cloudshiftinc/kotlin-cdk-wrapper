@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dms

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

public interface CfnReplicationInstanceProps {
  public fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  public fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun multiAz(): Any? = unwrap(this).getMultiAz()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun replicationInstanceClass(): String

  public fun replicationInstanceIdentifier(): String? =
      unwrap(this).getReplicationInstanceIdentifier()

  public fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  public fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number)

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean)

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun engineVersion(engineVersion: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun multiAz(multiAz: Boolean)

    public fun multiAz(multiAz: IResolvable)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun replicationInstanceClass(replicationInstanceClass: String)

    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String)

    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.Builder
        = software.amazon.awscdk.services.dms.CfnReplicationInstanceProps.builder()

    override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun replicationInstanceClass(replicationInstanceClass: String) {
      cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    override fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
      cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps,
  ) : CdkObject(cdkObject), CfnReplicationInstanceProps {
    override fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

    override fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun multiAz(): Any? = unwrap(this).getMultiAz()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun replicationInstanceClass(): String = unwrap(this).getReplicationInstanceClass()

    override fun replicationInstanceIdentifier(): String? =
        unwrap(this).getReplicationInstanceIdentifier()

    override fun replicationSubnetGroupIdentifier(): String? =
        unwrap(this).getReplicationSubnetGroupIdentifier()

    override fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstanceProps):
        CfnReplicationInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationInstanceProps):
        software.amazon.awscdk.services.dms.CfnReplicationInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dms.CfnReplicationInstanceProps
  }
}
