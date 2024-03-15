@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesthinclient

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnEnvironmentProps {
  public fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

  public fun desktopArn(): String

  public fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

  public fun name(): String? = unwrap(this).getName()

  public fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

  public fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun desiredSoftwareSetId(desiredSoftwareSetId: String)

    public fun desktopArn(desktopArn: String)

    public fun desktopEndpoint(desktopEndpoint: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun maintenanceWindow(maintenanceWindow: IResolvable)

    public fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("587eeb0625dce4bfdd9c67a264f02c68b6d8ed34e035feec04d1a3186819993a")
    public
        fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun softwareSetUpdateMode(softwareSetUpdateMode: String)

    public fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps.builder()

    override fun desiredSoftwareSetId(desiredSoftwareSetId: String) {
      cdkBuilder.desiredSoftwareSetId(desiredSoftwareSetId)
    }

    override fun desktopArn(desktopArn: String) {
      cdkBuilder.desktopArn(desktopArn)
    }

    override fun desktopEndpoint(desktopEndpoint: String) {
      cdkBuilder.desktopEndpoint(desktopEndpoint)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun maintenanceWindow(maintenanceWindow: IResolvable) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(IResolvable::unwrap))
    }

    override fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty) {
      cdkBuilder.maintenanceWindow(maintenanceWindow.let(CfnEnvironment.MaintenanceWindowProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("587eeb0625dce4bfdd9c67a264f02c68b6d8ed34e035feec04d1a3186819993a")
    override
        fun maintenanceWindow(maintenanceWindow: CfnEnvironment.MaintenanceWindowProperty.Builder.() -> Unit):
        Unit = maintenanceWindow(CfnEnvironment.MaintenanceWindowProperty(maintenanceWindow))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun softwareSetUpdateMode(softwareSetUpdateMode: String) {
      cdkBuilder.softwareSetUpdateMode(softwareSetUpdateMode)
    }

    override fun softwareSetUpdateSchedule(softwareSetUpdateSchedule: String) {
      cdkBuilder.softwareSetUpdateSchedule(softwareSetUpdateSchedule)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    override fun desiredSoftwareSetId(): String? = unwrap(this).getDesiredSoftwareSetId()

    override fun desktopArn(): String = unwrap(this).getDesktopArn()

    override fun desktopEndpoint(): String? = unwrap(this).getDesktopEndpoint()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun maintenanceWindow(): Any? = unwrap(this).getMaintenanceWindow()

    override fun name(): String? = unwrap(this).getName()

    override fun softwareSetUpdateMode(): String? = unwrap(this).getSoftwareSetUpdateMode()

    override fun softwareSetUpdateSchedule(): String? = unwrap(this).getSoftwareSetUpdateSchedule()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.workspacesthinclient.CfnEnvironmentProps
  }
}
