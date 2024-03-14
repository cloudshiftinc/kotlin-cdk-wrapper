package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface MachineImageConfig {
  public fun imageId(): String

  public fun osType(): OperatingSystemType

  public fun userData(): UserData

  public interface Builder {
    public fun imageId(imageId: String) {
    }

    public fun osType(osType: OperatingSystemType) {
    }

    public fun userData(userData: UserData) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MachineImageConfig.Builder =
        software.amazon.awscdk.services.ec2.MachineImageConfig.builder()

    public override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    public override fun osType(osType: OperatingSystemType) {
      cdkBuilder.osType(osType.let(OperatingSystemType::unwrap))
    }

    public override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.MachineImageConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig,
  ) : MachineImageConfig {
    public override fun imageId(): String = unwrap(this).getImageId()

    public override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    public override fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MachineImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig):
        MachineImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MachineImageConfig):
        software.amazon.awscdk.services.ec2.MachineImageConfig = (wrapped as Wrapper).cdkObject
  }
}
