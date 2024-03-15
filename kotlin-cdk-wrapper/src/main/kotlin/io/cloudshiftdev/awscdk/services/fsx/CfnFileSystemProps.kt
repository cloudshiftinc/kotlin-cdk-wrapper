@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFileSystemProps {
  public fun backupId(): String? = unwrap(this).getBackupId()

  public fun fileSystemType(): String

  public fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

  public fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

  public fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

  public fun storageType(): String? = unwrap(this).getStorageType()

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()

  @CdkDslMarker
  public interface Builder {
    public fun backupId(backupId: String)

    public fun fileSystemType(fileSystemType: String)

    public fun fileSystemTypeVersion(fileSystemTypeVersion: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun lustreConfiguration(lustreConfiguration: IResolvable)

    public fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6008d372e61bee9305b367f8a8b889a4444c339fcfd06d44101c4f26afb70217")
    public
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit)

    public fun ontapConfiguration(ontapConfiguration: IResolvable)

    public fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969662ef7196eeedb20d8965ca0b9c9017c9c1850c7292c9c8c3768e47b730ee")
    public
        fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty.Builder.() -> Unit)

    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    public
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cfc7b987460a27f9cd662be0c3ed29f7de877ab35232f42a0449bb34c8e627")
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty.Builder.() -> Unit)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun storageCapacity(storageCapacity: Number)

    public fun storageType(storageType: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun windowsConfiguration(windowsConfiguration: IResolvable)

    public
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c519948299082c85c0be491844cb6b0e13d5b8b453446a7c4f85863f7a63b3")
    public
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder =
        software.amazon.awscdk.services.fsx.CfnFileSystemProps.builder()

    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    override fun fileSystemType(fileSystemType: String) {
      cdkBuilder.fileSystemType(fileSystemType)
    }

    override fun fileSystemTypeVersion(fileSystemTypeVersion: String) {
      cdkBuilder.fileSystemTypeVersion(fileSystemTypeVersion)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun lustreConfiguration(lustreConfiguration: IResolvable) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(IResolvable::unwrap))
    }

    override
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(CfnFileSystem.LustreConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6008d372e61bee9305b367f8a8b889a4444c339fcfd06d44101c4f26afb70217")
    override
        fun lustreConfiguration(lustreConfiguration: CfnFileSystem.LustreConfigurationProperty.Builder.() -> Unit):
        Unit = lustreConfiguration(CfnFileSystem.LustreConfigurationProperty(lustreConfiguration))

    override fun ontapConfiguration(ontapConfiguration: IResolvable) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(IResolvable::unwrap))
    }

    override fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty) {
      cdkBuilder.ontapConfiguration(ontapConfiguration.let(CfnFileSystem.OntapConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969662ef7196eeedb20d8965ca0b9c9017c9c1850c7292c9c8c3768e47b730ee")
    override
        fun ontapConfiguration(ontapConfiguration: CfnFileSystem.OntapConfigurationProperty.Builder.() -> Unit):
        Unit = ontapConfiguration(CfnFileSystem.OntapConfigurationProperty(ontapConfiguration))

    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(CfnFileSystem.OpenZFSConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cfc7b987460a27f9cd662be0c3ed29f7de877ab35232f42a0449bb34c8e627")
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnFileSystem.OpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit =
        openZfsConfiguration(CfnFileSystem.OpenZFSConfigurationProperty(openZfsConfiguration))

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun storageCapacity(storageCapacity: Number) {
      cdkBuilder.storageCapacity(storageCapacity)
    }

    override fun storageType(storageType: String) {
      cdkBuilder.storageType(storageType)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun windowsConfiguration(windowsConfiguration: IResolvable) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(IResolvable::unwrap))
    }

    override
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty) {
      cdkBuilder.windowsConfiguration(windowsConfiguration.let(CfnFileSystem.WindowsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8c519948299082c85c0be491844cb6b0e13d5b8b453446a7c4f85863f7a63b3")
    override
        fun windowsConfiguration(windowsConfiguration: CfnFileSystem.WindowsConfigurationProperty.Builder.() -> Unit):
        Unit =
        windowsConfiguration(CfnFileSystem.WindowsConfigurationProperty(windowsConfiguration))

    public fun build(): software.amazon.awscdk.services.fsx.CfnFileSystemProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystemProps,
  ) : CdkObject(cdkObject), CfnFileSystemProps {
    override fun backupId(): String? = unwrap(this).getBackupId()

    override fun fileSystemType(): String = unwrap(this).getFileSystemType()

    override fun fileSystemTypeVersion(): String? = unwrap(this).getFileSystemTypeVersion()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun lustreConfiguration(): Any? = unwrap(this).getLustreConfiguration()

    override fun ontapConfiguration(): Any? = unwrap(this).getOntapConfiguration()

    override fun openZfsConfiguration(): Any? = unwrap(this).getOpenZfsConfiguration()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun storageCapacity(): Number? = unwrap(this).getStorageCapacity()

    override fun storageType(): String? = unwrap(this).getStorageType()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun windowsConfiguration(): Any? = unwrap(this).getWindowsConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnFileSystemProps):
        CfnFileSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFileSystemProps):
        software.amazon.awscdk.services.fsx.CfnFileSystemProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.CfnFileSystemProps
  }
}
