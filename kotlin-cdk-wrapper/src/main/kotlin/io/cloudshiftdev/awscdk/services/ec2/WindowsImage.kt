@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

/**
 * Select the latest version of the indicated Windows version.
 *
 * This Machine Image automatically updates to the latest version on every
 * deployment. Be aware this will cause your instances to be replaced when a
 * new version of the image becomes available. Do not store stateful information
 * on the instance if you are using this image.
 *
 * The AMI ID is selected using the values published to the SSM parameter store.
 *
 * https://aws.amazon.com/blogs/mt/query-for-the-latest-windows-ami-using-systems-manager-parameter-store/
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
public open class WindowsImage(
  cdkObject: software.amazon.awscdk.services.ec2.WindowsImage,
) : GenericSSMParameterImage(cdkObject) {
  public constructor(version: WindowsVersion) :
      this(software.amazon.awscdk.services.ec2.WindowsImage(version.let(WindowsVersion.Companion::unwrap))
  )

  public constructor(version: WindowsVersion, props: WindowsImageProps) :
      this(software.amazon.awscdk.services.ec2.WindowsImage(version.let(WindowsVersion.Companion::unwrap),
      props.let(WindowsImageProps.Companion::unwrap))
  )

  public constructor(version: WindowsVersion, props: WindowsImageProps.Builder.() -> Unit) :
      this(version, WindowsImageProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.WindowsImage].
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
    version: software.amazon.awscdk.services.ec2.WindowsVersion,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.WindowsImage.Builder =
        software.amazon.awscdk.services.ec2.WindowsImage.Builder.create(version)

    /**
     * Initial user data.
     *
     * Default: - Empty UserData for Windows machines
     *
     * @param userData Initial user data. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.WindowsImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(version: WindowsVersion, block: Builder.() -> Unit = {}):
        WindowsImage {
      val builderImpl = BuilderImpl(WindowsVersion.unwrap(version))
      return WindowsImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.WindowsImage): WindowsImage =
        WindowsImage(cdkObject)

    internal fun unwrap(wrapped: WindowsImage): software.amazon.awscdk.services.ec2.WindowsImage =
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.WindowsImage
  }
}
