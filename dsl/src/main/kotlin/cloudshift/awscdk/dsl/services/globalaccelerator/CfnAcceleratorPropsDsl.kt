@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps

/**
 * Properties for defining a `CfnAccelerator`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
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
@CdkDslMarker
public class CfnAcceleratorPropsDsl {
  private val cdkBuilder: CfnAcceleratorProps.Builder = CfnAcceleratorProps.builder()

  private val _ipAddresses: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
   * default value is true.
   * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
   * can be deleted.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
   * default value is true.
   * If the value is set to true, the accelerator cannot be deleted. If set to false, accelerator
   * can be deleted.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param ipAddressType The IP address type that an accelerator supports.
   * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
   */
  public fun ipAddressType(ipAddressType: String) {
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
  public fun ipAddresses(vararg ipAddresses: String) {
    _ipAddresses.addAll(listOf(*ipAddresses))
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
  public fun ipAddresses(ipAddresses: Collection<String>) {
    _ipAddresses.addAll(ipAddresses)
  }

  /**
   * @param name The name of the accelerator. 
   * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
   * with a hyphen.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Create tags for an accelerator.
   * For more information, see
   * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
   * in the *AWS Global Accelerator Developer Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Create tags for an accelerator.
   * For more information, see
   * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
   * in the *AWS Global Accelerator Developer Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAcceleratorProps {
    if(_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
