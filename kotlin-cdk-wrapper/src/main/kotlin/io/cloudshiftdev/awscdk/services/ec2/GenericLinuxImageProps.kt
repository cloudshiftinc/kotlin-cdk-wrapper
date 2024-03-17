@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Configuration options for GenericLinuxImage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * GenericLinuxImageProps genericLinuxImageProps = GenericLinuxImageProps.builder()
 * .userData(userData)
 * .build();
 * ```
 */
public interface GenericLinuxImageProps {
  /**
   * Initial user data.
   *
   * Default: - Empty UserData for Linux machines
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * A builder for [GenericLinuxImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param userData Initial user data.
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GenericLinuxImageProps.Builder =
        software.amazon.awscdk.services.ec2.GenericLinuxImageProps.builder()

    /**
     * @param userData Initial user data.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GenericLinuxImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImageProps,
  ) : CdkObject(cdkObject), GenericLinuxImageProps {
    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericLinuxImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImageProps):
        GenericLinuxImageProps = CdkObjectWrappers.wrap(cdkObject) as? GenericLinuxImageProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GenericLinuxImageProps):
        software.amazon.awscdk.services.ec2.GenericLinuxImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.GenericLinuxImageProps
  }
}
