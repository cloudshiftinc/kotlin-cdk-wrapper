@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBInstanceProps {
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

  public fun dbClusterIdentifier(): String

  public fun dbInstanceClass(): String

  public fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

  public fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun availabilityZone(availabilityZone: String)

    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    public fun certificateRotationRestart(certificateRotationRestart: Boolean)

    public fun certificateRotationRestart(certificateRotationRestart: IResolvable)

    public fun dbClusterIdentifier(dbClusterIdentifier: String)

    public fun dbInstanceClass(dbInstanceClass: String)

    public fun dbInstanceIdentifier(dbInstanceIdentifier: String)

    public fun enablePerformanceInsights(enablePerformanceInsights: Boolean)

    public fun enablePerformanceInsights(enablePerformanceInsights: IResolvable)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBInstanceProps.Builder =
        software.amazon.awscdk.services.docdb.CfnDBInstanceProps.builder()

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    override fun certificateRotationRestart(certificateRotationRestart: Boolean) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart)
    }

    override fun certificateRotationRestart(certificateRotationRestart: IResolvable) {
      cdkBuilder.certificateRotationRestart(certificateRotationRestart.let(IResolvable::unwrap))
    }

    override fun dbClusterIdentifier(dbClusterIdentifier: String) {
      cdkBuilder.dbClusterIdentifier(dbClusterIdentifier)
    }

    override fun dbInstanceClass(dbInstanceClass: String) {
      cdkBuilder.dbInstanceClass(dbInstanceClass)
    }

    override fun dbInstanceIdentifier(dbInstanceIdentifier: String) {
      cdkBuilder.dbInstanceIdentifier(dbInstanceIdentifier)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: Boolean) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights)
    }

    override fun enablePerformanceInsights(enablePerformanceInsights: IResolvable) {
      cdkBuilder.enablePerformanceInsights(enablePerformanceInsights.let(IResolvable::unwrap))
    }

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstanceProps,
  ) : CdkObject(cdkObject), CfnDBInstanceProps {
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    override fun certificateRotationRestart(): Any? = unwrap(this).getCertificateRotationRestart()

    override fun dbClusterIdentifier(): String = unwrap(this).getDbClusterIdentifier()

    override fun dbInstanceClass(): String = unwrap(this).getDbInstanceClass()

    override fun dbInstanceIdentifier(): String? = unwrap(this).getDbInstanceIdentifier()

    override fun enablePerformanceInsights(): Any? = unwrap(this).getEnablePerformanceInsights()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBInstanceProps):
        CfnDBInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBInstanceProps):
        software.amazon.awscdk.services.docdb.CfnDBInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.docdb.CfnDBInstanceProps
  }
}
