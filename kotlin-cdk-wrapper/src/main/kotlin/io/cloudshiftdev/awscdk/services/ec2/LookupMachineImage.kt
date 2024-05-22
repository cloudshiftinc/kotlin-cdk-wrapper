@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A machine image whose AMI ID will be searched using DescribeImages.
 *
 * The most recent, available, launchable image matching the given filter
 * criteria will be used. Looking up AMIs may take a long time; specify
 * as many filter criteria as possible to narrow down the search.
 *
 * The AMI selected will be cached in `cdk.context.json` and the same value
 * will be used on future runs. To refresh the AMI lookup, you will have to
 * evict the value from the cache using the `cdk context` command. See
 * https://docs.aws.amazon.com/cdk/latest/guide/context.html for more information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * UserData userData;
 * LookupMachineImage lookupMachineImage = LookupMachineImage.Builder.create()
 * .name("name")
 * // the properties below are optional
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .owners(List.of("owners"))
 * .userData(userData)
 * .windows(false)
 * .build();
 * ```
 */
public open class LookupMachineImage(
  cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImage,
) : CdkObject(cdkObject), IMachineImage {
  public constructor(props: LookupMachineImageProps) :
      this(software.amazon.awscdk.services.ec2.LookupMachineImage(props.let(LookupMachineImageProps.Companion::unwrap))
  )

  public constructor(props: LookupMachineImageProps.Builder.() -> Unit) :
      this(LookupMachineImageProps(props)
  )

  /**
   * Return the image to use in the given context.
   *
   * @param scope 
   */
  public override fun image(scope: Construct): MachineImageConfig =
      unwrap(this).getImage(scope.let(Construct.Companion::unwrap)).let(MachineImageConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.LookupMachineImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional filters on the AMI.
     *
     * Default: - No additional filters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
     * @param filters Additional filters on the AMI. 
     */
    public fun filters(filters: Map<String, List<String>>)

    /**
     * Name of the image (may contain wildcards).
     *
     * @param name Name of the image (may contain wildcards). 
     */
    public fun name(name: String)

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases. 
     */
    public fun owners(owners: List<String>)

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases. 
     */
    public fun owners(vararg owners: String)

    /**
     * Custom userdata for this image.
     *
     * Default: - Empty user data appropriate for the platform type
     *
     * @param userData Custom userdata for this image. 
     */
    public fun userData(userData: UserData)

    /**
     * Look for Windows images.
     *
     * Default: false
     *
     * @param windows Look for Windows images. 
     */
    public fun windows(windows: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LookupMachineImage.Builder =
        software.amazon.awscdk.services.ec2.LookupMachineImage.Builder.create()

    /**
     * Additional filters on the AMI.
     *
     * Default: - No additional filters
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html)
     * @param filters Additional filters on the AMI. 
     */
    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * Name of the image (may contain wildcards).
     *
     * @param name Name of the image (may contain wildcards). 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases. 
     */
    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    /**
     * Owner account IDs or aliases.
     *
     * Default: - All owners
     *
     * @param owners Owner account IDs or aliases. 
     */
    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    /**
     * Custom userdata for this image.
     *
     * Default: - Empty user data appropriate for the platform type
     *
     * @param userData Custom userdata for this image. 
     */
    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData.Companion::unwrap))
    }

    /**
     * Look for Windows images.
     *
     * Default: false
     *
     * @param windows Look for Windows images. 
     */
    override fun windows(windows: Boolean) {
      cdkBuilder.windows(windows)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LookupMachineImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LookupMachineImage {
      val builderImpl = BuilderImpl()
      return LookupMachineImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImage):
        LookupMachineImage = LookupMachineImage(cdkObject)

    internal fun unwrap(wrapped: LookupMachineImage):
        software.amazon.awscdk.services.ec2.LookupMachineImage = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.LookupMachineImage
  }
}
