@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing managed prefix list.
 *
 * Example:
 *
 * ```
 * ApplicationLoadBalancer alb;
 * IPrefixList cfOriginFacing = PrefixList.fromLookup(this, "CloudFrontOriginFacing",
 * PrefixListLookupOptions.builder()
 * .prefixListName("com.amazonaws.global.cloudfront.origin-facing")
 * .build());
 * alb.connections.allowFrom(cfOriginFacing, Port.HTTP);
 * ```
 */
public interface PrefixListLookupOptions {
  /**
   * The address family of the managed prefix list.
   *
   * Default: - Don't filter on addressFamily
   */
  public fun addressFamily(): AddressFamily? =
      unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

  /**
   * The ID of the AWS account that owns the managed prefix list.
   *
   * Default: - Don't filter on ownerId
   */
  public fun ownerId(): String? = unwrap(this).getOwnerId()

  /**
   * The name of the managed prefix list.
   */
  public fun prefixListName(): String

  /**
   * A builder for [PrefixListLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addressFamily The address family of the managed prefix list.
     */
    public fun addressFamily(addressFamily: AddressFamily)

    /**
     * @param ownerId The ID of the AWS account that owns the managed prefix list.
     */
    public fun ownerId(ownerId: String)

    /**
     * @param prefixListName The name of the managed prefix list. 
     */
    public fun prefixListName(prefixListName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixListLookupOptions.Builder =
        software.amazon.awscdk.services.ec2.PrefixListLookupOptions.builder()

    /**
     * @param addressFamily The address family of the managed prefix list.
     */
    override fun addressFamily(addressFamily: AddressFamily) {
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily.Companion::unwrap))
    }

    /**
     * @param ownerId The ID of the AWS account that owns the managed prefix list.
     */
    override fun ownerId(ownerId: String) {
      cdkBuilder.ownerId(ownerId)
    }

    /**
     * @param prefixListName The name of the managed prefix list. 
     */
    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixListLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.PrefixListLookupOptions,
  ) : CdkObject(cdkObject),
      PrefixListLookupOptions {
    /**
     * The address family of the managed prefix list.
     *
     * Default: - Don't filter on addressFamily
     */
    override fun addressFamily(): AddressFamily? =
        unwrap(this).getAddressFamily()?.let(AddressFamily::wrap)

    /**
     * The ID of the AWS account that owns the managed prefix list.
     *
     * Default: - Don't filter on ownerId
     */
    override fun ownerId(): String? = unwrap(this).getOwnerId()

    /**
     * The name of the managed prefix list.
     */
    override fun prefixListName(): String = unwrap(this).getPrefixListName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrefixListLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixListLookupOptions):
        PrefixListLookupOptions = CdkObjectWrappers.wrap(cdkObject) as? PrefixListLookupOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrefixListLookupOptions):
        software.amazon.awscdk.services.ec2.PrefixListLookupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.PrefixListLookupOptions
  }
}
