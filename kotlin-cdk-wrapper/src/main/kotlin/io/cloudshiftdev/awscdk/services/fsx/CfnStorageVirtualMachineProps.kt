@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageVirtualMachineProps {
  public fun activeDirectoryConfiguration(): Any? = unwrap(this).getActiveDirectoryConfiguration()

  public fun fileSystemId(): String

  public fun name(): String

  public fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

  public fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable)

    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82b1f737d3bf838fc7a2a37be078f5e0dab5975b2241323420db11f55c487621")
    public
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder.() -> Unit)

    public fun fileSystemId(fileSystemId: String)

    public fun name(name: String)

    public fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String)

    public fun svmAdminPassword(svmAdminPassword: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps.Builder =
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps.builder()

    override fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(IResolvable::unwrap))
    }

    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty) {
      cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration.let(CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82b1f737d3bf838fc7a2a37be078f5e0dab5975b2241323420db11f55c487621")
    override
        fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty.Builder.() -> Unit):
        Unit =
        activeDirectoryConfiguration(CfnStorageVirtualMachine.ActiveDirectoryConfigurationProperty(activeDirectoryConfiguration))

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rootVolumeSecurityStyle(rootVolumeSecurityStyle: String) {
      cdkBuilder.rootVolumeSecurityStyle(rootVolumeSecurityStyle)
    }

    override fun svmAdminPassword(svmAdminPassword: String) {
      cdkBuilder.svmAdminPassword(svmAdminPassword)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps,
  ) : CdkObject(cdkObject), CfnStorageVirtualMachineProps {
    override fun activeDirectoryConfiguration(): Any? =
        unwrap(this).getActiveDirectoryConfiguration()

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun name(): String = unwrap(this).getName()

    override fun rootVolumeSecurityStyle(): String? = unwrap(this).getRootVolumeSecurityStyle()

    override fun svmAdminPassword(): String? = unwrap(this).getSvmAdminPassword()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageVirtualMachineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps):
        CfnStorageVirtualMachineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageVirtualMachineProps):
        software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnStorageVirtualMachineProps
  }
}
