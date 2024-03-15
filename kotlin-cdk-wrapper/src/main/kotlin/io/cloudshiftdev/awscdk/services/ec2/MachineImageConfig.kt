@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface MachineImageConfig {
  public fun imageId(): String

  public fun osType(): OperatingSystemType

  public fun userData(): UserData

  @CdkDslMarker
  public interface Builder {
    public fun imageId(imageId: String)

    public fun osType(osType: OperatingSystemType)

    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MachineImageConfig.Builder =
        software.amazon.awscdk.services.ec2.MachineImageConfig.builder()

    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    override fun osType(osType: OperatingSystemType) {
      cdkBuilder.osType(osType.let(OperatingSystemType::unwrap))
    }

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.MachineImageConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig,
  ) : CdkObject(cdkObject), MachineImageConfig {
    override fun imageId(): String = unwrap(this).getImageId()

    override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    override fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MachineImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig):
        MachineImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MachineImageConfig):
        software.amazon.awscdk.services.ec2.MachineImageConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.MachineImageConfig
  }
}
