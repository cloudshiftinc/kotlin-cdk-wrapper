package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LustreFileSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystem,
) : FileSystemBase(cdkObject) {
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun dnsName(): String = unwrap(this).getDnsName()

  public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public open fun mountName(): String = unwrap(this).getMountName()

  public interface Builder {
    public fun backupId(backupId: String) {
    }

    public fun kmsKey(kmsKey: IKey) {
    }

    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("947f8a9e89536a25714205f01b078cf895fa9d6392b7a1666f9491eb6dc9d46e")
    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit) {
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
    }

    public fun securityGroup(securityGroup: ISecurityGroup) {
    }

    public fun storageCapacityGiB(storageCapacityGiB: Number) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnet(vpcSubnet: ISubnet) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreFileSystem.Builder =
        software.amazon.awscdk.services.fsx.LustreFileSystem.Builder.create(scope, id)

    public override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    public override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    public override fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(LustreConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("947f8a9e89536a25714205f01b078cf895fa9d6392b7a1666f9491eb6dc9d46e")
    public override
        fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit): Unit =
        lustreConfiguration(LustreConfiguration(lustreConfiguration))

    public override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    public override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public override fun storageCapacityGiB(storageCapacityGiB: Number) {
      cdkBuilder.storageCapacityGiB(storageCapacityGiB)
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnet(vpcSubnet: ISubnet) {
      cdkBuilder.vpcSubnet(vpcSubnet.let(ISubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreFileSystem = cdkBuilder.build()
  }

  public companion object {
    public open fun fromLustreFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes,
    ): IFileSystem =
        software.amazon.awscdk.services.fsx.LustreFileSystem.fromLustreFileSystemAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FileSystemAttributes::unwrap)).let(IFileSystem::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cebd825229cf3b382afac49973d6ddd64b711e5f0ef72f664a1a0aaf4ef0bd42")
    public open fun fromLustreFileSystemAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FileSystemAttributes.Builder.() -> Unit,
    ): IFileSystem = fromLustreFileSystemAttributes(scope, id, FileSystemAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LustreFileSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LustreFileSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystem):
        LustreFileSystem = LustreFileSystem(cdkObject)

    internal fun unwrap(wrapped: LustreFileSystem):
        software.amazon.awscdk.services.fsx.LustreFileSystem = wrapped.cdkObject
  }
}
