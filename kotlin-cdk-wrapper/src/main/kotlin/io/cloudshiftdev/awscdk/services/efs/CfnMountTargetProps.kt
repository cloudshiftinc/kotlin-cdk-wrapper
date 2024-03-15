@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMountTargetProps {
  public fun fileSystemId(): String

  public fun ipAddress(): String? = unwrap(this).getIpAddress()

  public fun securityGroups(): List<String>

  public fun subnetId(): String

  @CdkDslMarker
  public interface Builder {
    public fun fileSystemId(fileSystemId: String)

    public fun ipAddress(ipAddress: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnMountTargetProps.Builder =
        software.amazon.awscdk.services.efs.CfnMountTargetProps.builder()

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.efs.CfnMountTargetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps,
  ) : CdkObject(cdkObject), CfnMountTargetProps {
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun ipAddress(): String? = unwrap(this).getIpAddress()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMountTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnMountTargetProps):
        CfnMountTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMountTargetProps):
        software.amazon.awscdk.services.efs.CfnMountTargetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.CfnMountTargetProps
  }
}
