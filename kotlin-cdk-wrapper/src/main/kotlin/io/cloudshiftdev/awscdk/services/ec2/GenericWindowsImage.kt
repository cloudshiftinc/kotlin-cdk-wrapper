@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construct a Windows machine image from an AMI map.
 *
 * Allows you to create a generic Windows EC2 , manually specify an AMI map.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * GenericWindowsImage genericWindowsImage = GenericWindowsImage.Builder.create(Map.of(
 * "amiMapKey", "amiMap"))
 * .userData(userData)
 * .build();
 * ```
 */
public open class GenericWindowsImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.GenericWindowsImage,
) : CdkObject(cdkObject), IMachineImage {
  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.GenericWindowsImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Windows machines
     *
     * @param userData Initial user data. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    amiMap: Map<String, String>,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GenericWindowsImage.Builder =
        software.amazon.awscdk.services.ec2.GenericWindowsImage.Builder.create(amiMap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Windows machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GenericWindowsImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(amiMap: Map<String, String>, block: Builder.() -> Unit = {}):
        GenericWindowsImage {
      val builderImpl = BuilderImpl(amiMap)
      return GenericWindowsImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericWindowsImage):
        GenericWindowsImage = GenericWindowsImage(cdkObject)

    internal fun unwrap(wrapped: GenericWindowsImage):
        software.amazon.awscdk.services.ec2.GenericWindowsImage = wrapped.cdkObject
  }
}
