@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construct properties of the Accelerator.
 *
 * Example:
 *
 * ```
 * Accelerator accelerator = Accelerator.Builder.create(this, "Accelerator")
 * .ipAddresses(List.of("1.1.1.1", "2.2.2.2"))
 * .ipAddressType(IpAddressType.IPV4)
 * .build();
 * ```
 */
public interface AcceleratorProps {
  /**
   * The name of the accelerator.
   *
   * Default: - resource ID
   */
  public fun acceleratorName(): String? = unwrap(this).getAcceleratorName()

  /**
   * Indicates whether the accelerator is enabled.
   *
   * Default: true
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * The IP address type that an accelerator supports.
   *
   * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
   *
   * Default: - "IPV4"
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * IP addresses associated with the accelerator.
   *
   * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
   * choose IP
   * addresses from your own pool to use for the accelerator's static IP addresses when you create
   * an accelerator.
   * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
   *
   * Only one IP address from each of your IP address ranges can be used for each accelerator. If
   * you specify
   * only one IP address from your IP address range, Global Accelerator assigns a second static IP
   * address for
   * the accelerator from the AWS IP address pool.
   *
   * Note that you can't update IP addresses for an existing accelerator. To change them, you must
   * create a
   * new accelerator with the new addresses.
   *
   * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
   */
  public fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  /**
   * A builder for [AcceleratorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceleratorName The name of the accelerator.
     */
    public fun acceleratorName(acceleratorName: String)

    /**
     * @param enabled Indicates whether the accelerator is enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param ipAddressType The IP address type that an accelerator supports.
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * @param ipAddresses IP addresses associated with the accelerator.
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     */
    public fun ipAddresses(ipAddresses: List<String>)

    /**
     * @param ipAddresses IP addresses associated with the accelerator.
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     */
    public fun ipAddresses(vararg ipAddresses: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps.builder()

    /**
     * @param acceleratorName The name of the accelerator.
     */
    override fun acceleratorName(acceleratorName: String) {
      cdkBuilder.acceleratorName(acceleratorName)
    }

    /**
     * @param enabled Indicates whether the accelerator is enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param ipAddressType The IP address type that an accelerator supports.
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    /**
     * @param ipAddresses IP addresses associated with the accelerator.
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     */
    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * @param ipAddresses IP addresses associated with the accelerator.
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     */
    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.AcceleratorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorProps,
  ) : CdkObject(cdkObject), AcceleratorProps {
    /**
     * The name of the accelerator.
     *
     * Default: - resource ID
     */
    override fun acceleratorName(): String? = unwrap(this).getAcceleratorName()

    /**
     * Indicates whether the accelerator is enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * IP addresses associated with the accelerator.
     *
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP
     * addresses from your own pool to use for the accelerator's static IP addresses when you create
     * an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify
     * only one IP address from your IP address range, Global Accelerator assigns a second static IP
     * address for
     * the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a
     * new accelerator with the new addresses.
     *
     * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
     */
    override fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorProps):
        AcceleratorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AcceleratorProps):
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
  }
}
