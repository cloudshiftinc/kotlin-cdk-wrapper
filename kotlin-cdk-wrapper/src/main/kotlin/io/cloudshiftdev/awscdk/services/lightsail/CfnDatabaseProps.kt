@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDatabaseProps {
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public fun backupRetention(): Any? = unwrap(this).getBackupRetention()

  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  public fun masterDatabaseName(): String

  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  public fun masterUsername(): String

  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public fun relationalDatabaseBlueprintId(): String

  public fun relationalDatabaseBundleId(): String

  public fun relationalDatabaseName(): String

  public fun relationalDatabaseParameters(): Any? = unwrap(this).getRelationalDatabaseParameters()

  public fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun backupRetention(backupRetention: Boolean)

    public fun backupRetention(backupRetention: IResolvable)

    public fun caCertificateIdentifier(caCertificateIdentifier: String)

    public fun masterDatabaseName(masterDatabaseName: String)

    public fun masterUserPassword(masterUserPassword: String)

    public fun masterUsername(masterUsername: String)

    public fun preferredBackupWindow(preferredBackupWindow: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String)

    public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String)

    public fun relationalDatabaseName(relationalDatabaseName: String)

    public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable)

    public fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>)

    public fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any)

    public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean)

    public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDatabaseProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDatabaseProps.builder()

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun backupRetention(backupRetention: Boolean) {
      cdkBuilder.backupRetention(backupRetention)
    }

    override fun backupRetention(backupRetention: IResolvable) {
      cdkBuilder.backupRetention(backupRetention.let(IResolvable::unwrap))
    }

    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

    override fun masterDatabaseName(masterDatabaseName: String) {
      cdkBuilder.masterDatabaseName(masterDatabaseName)
    }

    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
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

    override fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
      cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
    }

    override fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
      cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
    }

    override fun relationalDatabaseName(relationalDatabaseName: String) {
      cdkBuilder.relationalDatabaseName(relationalDatabaseName)
    }

    override fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters.let(IResolvable::unwrap))
    }

    override fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters)
    }

    override fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any): Unit =
        relationalDatabaseParameters(relationalDatabaseParameters.toList())

    override fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

    override fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDatabaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabaseProps,
  ) : CdkObject(cdkObject), CfnDatabaseProps {
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    override fun backupRetention(): Any? = unwrap(this).getBackupRetention()

    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    override fun masterDatabaseName(): String = unwrap(this).getMasterDatabaseName()

    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    override fun masterUsername(): String = unwrap(this).getMasterUsername()

    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    override fun relationalDatabaseBlueprintId(): String =
        unwrap(this).getRelationalDatabaseBlueprintId()

    override fun relationalDatabaseBundleId(): String = unwrap(this).getRelationalDatabaseBundleId()

    override fun relationalDatabaseName(): String = unwrap(this).getRelationalDatabaseName()

    override fun relationalDatabaseParameters(): Any? =
        unwrap(this).getRelationalDatabaseParameters()

    override fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatabaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabaseProps):
        CfnDatabaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatabaseProps):
        software.amazon.awscdk.services.lightsail.CfnDatabaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDatabaseProps
  }
}
