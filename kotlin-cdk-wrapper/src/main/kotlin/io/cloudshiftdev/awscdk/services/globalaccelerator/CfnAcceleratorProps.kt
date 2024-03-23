@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAccelerator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnAcceleratorProps cfnAcceleratorProps = CfnAcceleratorProps.builder()
 * .name("name")
 * // the properties below are optional
 * .enabled(false)
 * .ipAddresses(List.of("ipAddresses"))
 * .ipAddressType("ipAddressType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html)
 */
public interface CfnAcceleratorProps {
  /**
   * Indicates whether the accelerator is enabled. The value is true or false. The default value is
   * true.
   *
   * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
   * can be deleted.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The IP address type that an accelerator supports.
   *
   * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
   *
   * Default: - "IPV4"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
   * choose IP addresses from your own pool to use for the accelerator's static IP addresses when you
   * create an accelerator.
   *
   * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
   *
   * Only one IP address from each of your IP address ranges can be used for each accelerator. If
   * you specify only one IP address from your IP address range, Global Accelerator assigns a second
   * static IP address for the accelerator from the AWS IP address pool.
   *
   * Note that you can't update IP addresses for an existing accelerator. To change them, you must
   * create a new accelerator with the new addresses.
   *
   * For more information, see [Bring Your Own IP Addresses
   * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
   * Global Accelerator Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresses)
   */
  public fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  /**
   * The name of the accelerator.
   *
   * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
   * with a hyphen.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-name)
   */
  public fun name(): String

  /**
   * Create tags for an accelerator.
   *
   * For more information, see
   * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
   * in the *AWS Global Accelerator Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAcceleratorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true.
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
     * can be deleted.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true.
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
     * can be deleted.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param ipAddressType The IP address type that an accelerator supports.
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a second
     * static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see [Bring Your Own IP Addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
     * Global Accelerator Developer Guide* .
     */
    public fun ipAddresses(ipAddresses: List<String>)

    /**
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a second
     * static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see [Bring Your Own IP Addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
     * Global Accelerator Developer Guide* .
     */
    public fun ipAddresses(vararg ipAddresses: String)

    /**
     * @param name The name of the accelerator. 
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     */
    public fun name(name: String)

    /**
     * @param tags Create tags for an accelerator.
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Create tags for an accelerator.
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.builder()

    /**
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true.
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
     * can be deleted.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true.
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
     * can be deleted.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param ipAddressType The IP address type that an accelerator supports.
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a second
     * static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see [Bring Your Own IP Addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
     * Global Accelerator Developer Guide* .
     */
    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator.
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a second
     * static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see [Bring Your Own IP Addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
     * Global Accelerator Developer Guide* .
     */
    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    /**
     * @param name The name of the accelerator. 
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Create tags for an accelerator.
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Create tags for an accelerator.
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps,
  ) : CdkObject(cdkObject), CfnAcceleratorProps {
    /**
     * Indicates whether the accelerator is enabled. The value is true or false. The default value
     * is true.
     *
     * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
     * can be deleted.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP addresses from your own pool to use for the accelerator's static IP addresses when you
     * create an accelerator.
     *
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a second
     * static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see [Bring Your Own IP Addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the *AWS
     * Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresses)
     */
    override fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

    /**
     * The name of the accelerator.
     *
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAcceleratorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps):
        CfnAcceleratorProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAcceleratorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAcceleratorProps):
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
  }
}
