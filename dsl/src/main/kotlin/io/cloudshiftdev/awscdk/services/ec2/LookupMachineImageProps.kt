package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LookupMachineImageProps {
  /**
   * Additional filters on the AMI.
   *
   * Default: - No additional filters
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
   */
  public fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

  /**
   * Name of the image (may contain wildcards).
   */
  public fun name(): String

  /**
   * Owner account IDs or aliases.
   *
   * Default: - All owners
   */
  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  /**
   * Custom userdata for this image.
   *
   * Default: - Empty user data appropriate for the platform type
   */
  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  /**
   * Look for Windows images.
   *
   * Default: false
   */
  public fun windows(): Boolean? = unwrap(this).getWindows()

  /**
   * A builder for [LookupMachineImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param filters Additional filters on the AMI.
     */
    public fun filters(filters: Map<String, List<String>>)

    /**
     * @param name Name of the image (may contain wildcards). 
     */
    public fun name(name: String)

    /**
     * @param owners Owner account IDs or aliases.
     */
    public fun owners(owners: List<String>)

    /**
     * @param owners Owner account IDs or aliases.
     */
    public fun owners(vararg owners: String)

    /**
     * @param userData Custom userdata for this image.
     */
    public fun userData(userData: UserData)

    /**
     * @param windows Look for Windows images.
     */
    public fun windows(windows: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LookupMachineImageProps.Builder =
        software.amazon.awscdk.services.ec2.LookupMachineImageProps.builder()

    /**
     * @param filters Additional filters on the AMI.
     */
    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param name Name of the image (may contain wildcards). 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param owners Owner account IDs or aliases.
     */
    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    /**
     * @param owners Owner account IDs or aliases.
     */
    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    /**
     * @param userData Custom userdata for this image.
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    /**
     * @param windows Look for Windows images.
     */
    override fun windows(windows: Boolean) {
      cdkBuilder.windows(windows)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LookupMachineImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImageProps,
  ) : CdkObject(cdkObject), LookupMachineImageProps {
    /**
     * Additional filters on the AMI.
     *
     * Default: - No additional filters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
     */
    override fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

    /**
     * Name of the image (may contain wildcards).
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     */
    override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

    /**
     * Custom userdata for this image.
     *
     * Default: - Empty user data appropriate for the platform type
     */
    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    /**
     * Look for Windows images.
     *
     * Default: false
     */
    override fun windows(): Boolean? = unwrap(this).getWindows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LookupMachineImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImageProps):
        LookupMachineImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LookupMachineImageProps):
        software.amazon.awscdk.services.ec2.LookupMachineImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LookupMachineImageProps
  }
}
