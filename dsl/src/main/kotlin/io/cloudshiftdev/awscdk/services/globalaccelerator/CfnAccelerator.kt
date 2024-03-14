package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccelerator internal constructor(
  private val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the accelerator, such as
   * `arn:aws:globalaccelerator::012345678901:accelerator/1234abcd-abcd-1234-abcd-1234abcdefgh` .
   */
  public open fun attrAcceleratorArn(): String = unwrap(this).getAttrAcceleratorArn()

  /**
   * The Domain Name System (DNS) name that Global Accelerator creates that points to an
   * accelerator's static IPv4 addresses.
   */
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  /**
   * The DNS name that Global Accelerator creates that points to a dual-stack accelerator's four
   * static IP addresses: two IPv4 addresses and two IPv6 addresses.
   */
  public open fun attrDualStackDnsName(): String = unwrap(this).getAttrDualStackDnsName()

  /**
   * The array of IPv4 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public open fun attrIpv4Addresses(): List<String> = unwrap(this).getAttrIpv4Addresses()

  /**
   * The array of IPv6 addresses in the IP address set.
   *
   * An IP address set can have a maximum of two IP addresses.
   */
  public open fun attrIpv6Addresses(): List<String> = unwrap(this).getAttrIpv6Addresses()

  /**
   * Indicates whether the accelerator is enabled.
   *
   * The value is true or false. The default value is true.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Indicates whether the accelerator is enabled.
   *
   * The value is true or false. The default value is true.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Indicates whether the accelerator is enabled.
   *
   * The value is true or false. The default value is true.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP address type that an accelerator supports.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The IP address type that an accelerator supports.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
   * choose IP addresses from your own pool to use for the accelerator's static IP addresses when you
   * create an accelerator.
   */
  public open fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  /**
   * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
   * choose IP addresses from your own pool to use for the accelerator's static IP addresses when you
   * create an accelerator.
   */
  public open fun ipAddresses(`value`: List<String>) {
    unwrap(this).setIpAddresses(`value`)
  }

  /**
   * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
   * choose IP addresses from your own pool to use for the accelerator's static IP addresses when you
   * create an accelerator.
   */
  public open fun ipAddresses(vararg `value`: String): Unit = ipAddresses(`value`.toList())

  /**
   * The name of the accelerator.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the accelerator.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Create tags for an accelerator.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Create tags for an accelerator.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Create tags for an accelerator.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.CfnAccelerator].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true. 
     */
    public fun enabled(enabled: Boolean)

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
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresstype)
     * @param ipAddressType The IP address type that an accelerator supports. 
     */
    public fun ipAddressType(ipAddressType: String)

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
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator. 
     */
    public fun ipAddresses(ipAddresses: List<String>)

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
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator. 
     */
    public fun ipAddresses(vararg ipAddresses: String)

    /**
     * The name of the accelerator.
     *
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-name)
     * @param name The name of the accelerator. 
     */
    public fun name(name: String)

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     * @param tags Create tags for an accelerator. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     * @param tags Create tags for an accelerator. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator.Builder
        = software.amazon.awscdk.services.globalaccelerator.CfnAccelerator.Builder.create(scope, id)

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
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

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
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     * default value is true. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresstype)
     * @param ipAddressType The IP address type that an accelerator supports. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

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
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator. 
     */
    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

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
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     * (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static IP
     * addresses when you create an accelerator. 
     */
    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    /**
     * The name of the accelerator.
     *
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-name)
     * @param name The name of the accelerator. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     * @param tags Create tags for an accelerator. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     * @param tags Create tags for an accelerator. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnAccelerator =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccelerator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccelerator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAccelerator):
        CfnAccelerator = CfnAccelerator(cdkObject)

    internal fun unwrap(wrapped: CfnAccelerator):
        software.amazon.awscdk.services.globalaccelerator.CfnAccelerator = wrapped.cdkObject
  }
}
