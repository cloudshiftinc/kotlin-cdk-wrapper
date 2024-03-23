@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Configuration for a machine image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * MachineImageConfig machineImageConfig = MachineImageConfig.builder()
 * .imageId("imageId")
 * .osType(OperatingSystemType.LINUX)
 * .userData(userData)
 * .build();
 * ```
 */
public interface MachineImageConfig {
  /**
   * The AMI ID of the image to use.
   */
  public fun imageId(): String

  /**
   * Operating system type for this image.
   */
  public fun osType(): OperatingSystemType

  /**
   * Initial UserData for this image.
   */
  public fun userData(): UserData

  /**
   * A builder for [MachineImageConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageId The AMI ID of the image to use. 
     */
    public fun imageId(imageId: String)

    /**
     * @param osType Operating system type for this image. 
     */
    public fun osType(osType: OperatingSystemType)

    /**
     * @param userData Initial UserData for this image. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MachineImageConfig.Builder =
        software.amazon.awscdk.services.ec2.MachineImageConfig.builder()

    /**
     * @param imageId The AMI ID of the image to use. 
     */
    override fun imageId(imageId: String) {
      cdkBuilder.imageId(imageId)
    }

    /**
     * @param osType Operating system type for this image. 
     */
    override fun osType(osType: OperatingSystemType) {
      cdkBuilder.osType(osType.let(OperatingSystemType::unwrap))
    }

    /**
     * @param userData Initial UserData for this image. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.MachineImageConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig,
  ) : CdkObject(cdkObject), MachineImageConfig {
    /**
     * The AMI ID of the image to use.
     */
    override fun imageId(): String = unwrap(this).getImageId()

    /**
     * Operating system type for this image.
     */
    override fun osType(): OperatingSystemType =
        unwrap(this).getOsType().let(OperatingSystemType::wrap)

    /**
     * Initial UserData for this image.
     */
    override fun userData(): UserData = unwrap(this).getUserData().let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MachineImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MachineImageConfig):
        MachineImageConfig = CdkObjectWrappers.wrap(cdkObject) as? MachineImageConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MachineImageConfig):
        software.amazon.awscdk.services.ec2.MachineImageConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.MachineImageConfig
  }
}
