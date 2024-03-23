@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Construct a Linux machine image from an AMI map.
 *
 * Linux images IDs are not published to SSM parameter store yet, so you'll have to
 * manually specify an AMI map.
 *
 * Example:
 *
 * ```
 * // Pick a Windows edition to use
 * WindowsImage windows = new WindowsImage(WindowsVersion.WINDOWS_SERVER_2019_ENGLISH_FULL_BASE);
 * // Pick the right Amazon Linux edition. All arguments shown are optional
 * // and will default to these values when omitted.
 * AmazonLinuxImage amznLinux = AmazonLinuxImage.Builder.create()
 * .generation(AmazonLinuxGeneration.AMAZON_LINUX)
 * .edition(AmazonLinuxEdition.STANDARD)
 * .virtualization(AmazonLinuxVirt.HVM)
 * .storage(AmazonLinuxStorage.GENERAL_PURPOSE)
 * .build();
 * // For other custom (Linux) images, instantiate a `GenericLinuxImage` with
 * // a map giving the AMI to in for each region:
 * GenericLinuxImage linux = new GenericLinuxImage(Map.of(
 * "us-east-1", "ami-97785bed",
 * "eu-west-1", "ami-12345678"));
 * ```
 */
public open class GenericLinuxImage(
  cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImage,
) : CdkObject(cdkObject), IMachineImage {
  public constructor(amiMap: Map<String, String>) :
      this(software.amazon.awscdk.services.ec2.GenericLinuxImage(amiMap)
  )

  public constructor(amiMap: Map<String, String>, props: GenericLinuxImageProps) :
      this(software.amazon.awscdk.services.ec2.GenericLinuxImage(amiMap,
      props.let(GenericLinuxImageProps::unwrap))
  )

  public constructor(amiMap: Map<String, String>, props: GenericLinuxImageProps.Builder.() -> Unit)
      : this(amiMap, GenericLinuxImageProps(props)
  )

  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.GenericLinuxImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    public fun userData(userData: UserData)
  }

  private class BuilderImpl(
    amiMap: Map<String, String>,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.GenericLinuxImage.Builder =
        software.amazon.awscdk.services.ec2.GenericLinuxImage.Builder.create(amiMap)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Linux machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.GenericLinuxImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(amiMap: Map<String, String>, block: Builder.() -> Unit = {}):
        GenericLinuxImage {
      val builderImpl = BuilderImpl(amiMap)
      return GenericLinuxImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.GenericLinuxImage):
        GenericLinuxImage = GenericLinuxImage(cdkObject)

    internal fun unwrap(wrapped: GenericLinuxImage):
        software.amazon.awscdk.services.ec2.GenericLinuxImage = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.GenericLinuxImage
  }
}
