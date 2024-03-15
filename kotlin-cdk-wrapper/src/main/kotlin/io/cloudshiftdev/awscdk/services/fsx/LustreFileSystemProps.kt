@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.ISubnet
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface LustreFileSystemProps : FileSystemProps {
  public fun lustreConfiguration(): LustreConfiguration

  public fun vpcSubnet(): ISubnet

  @CdkDslMarker
  public interface Builder {
    public fun backupId(backupId: String)

    public fun kmsKey(kmsKey: IKey)

    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484ff5adcf314819d4010e533d3d3c48fb4c65de704598e532a2dc08170a462b")
    public fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun securityGroup(securityGroup: ISecurityGroup)

    public fun storageCapacityGiB(storageCapacityGiB: Number)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnet(vpcSubnet: ISubnet)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.LustreFileSystemProps.Builder =
        software.amazon.awscdk.services.fsx.LustreFileSystemProps.builder()

    override fun backupId(backupId: String) {
      cdkBuilder.backupId(backupId)
    }

    override fun kmsKey(kmsKey: IKey) {
      cdkBuilder.kmsKey(kmsKey.let(IKey::unwrap))
    }

    override fun lustreConfiguration(lustreConfiguration: LustreConfiguration) {
      cdkBuilder.lustreConfiguration(lustreConfiguration.let(LustreConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("484ff5adcf314819d4010e533d3d3c48fb4c65de704598e532a2dc08170a462b")
    override fun lustreConfiguration(lustreConfiguration: LustreConfiguration.Builder.() -> Unit):
        Unit = lustreConfiguration(LustreConfiguration(lustreConfiguration))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    override fun storageCapacityGiB(storageCapacityGiB: Number) {
      cdkBuilder.storageCapacityGiB(storageCapacityGiB)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnet(vpcSubnet: ISubnet) {
      cdkBuilder.vpcSubnet(vpcSubnet.let(ISubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.fsx.LustreFileSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystemProps,
  ) : CdkObject(cdkObject), LustreFileSystemProps {
    override fun backupId(): String? = unwrap(this).getBackupId()

    override fun kmsKey(): IKey? = unwrap(this).getKmsKey()?.let(IKey::wrap)

    override fun lustreConfiguration(): LustreConfiguration =
        unwrap(this).getLustreConfiguration().let(LustreConfiguration::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    override fun storageCapacityGiB(): Number = unwrap(this).getStorageCapacityGiB()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnet(): ISubnet = unwrap(this).getVpcSubnet().let(ISubnet::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LustreFileSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreFileSystemProps):
        LustreFileSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LustreFileSystemProps):
        software.amazon.awscdk.services.fsx.LustreFileSystemProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fsx.LustreFileSystemProps
  }
}
