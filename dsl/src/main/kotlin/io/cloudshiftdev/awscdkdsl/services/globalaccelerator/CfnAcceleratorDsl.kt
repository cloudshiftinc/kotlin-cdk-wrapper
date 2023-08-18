@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.constructs.Construct

/**
 * The `AWS::GlobalAccelerator::Accelerator` resource is a Global Accelerator resource type that
 * contains information about how you create an accelerator.
 *
 * An accelerator includes one or more listeners that process inbound connections and direct traffic
 * to one or more endpoint groups, each of which includes endpoints, such as Application Load
 * Balancers, Network Load Balancers, and Amazon EC2 instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * CfnAccelerator cfnAccelerator = CfnAccelerator.Builder.create(this, "MyCfnAccelerator")
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
public class CfnAcceleratorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccelerator.Builder = CfnAccelerator.Builder.create(scope, id)

    private val _ipAddresses: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

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
     *
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     *   default value is true.
     */
    public fun enabled(enabled: Boolean) {
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
     *
     * @param enabled Indicates whether the accelerator is enabled. The value is true or false. The
     *   default value is true.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The IP address type that an accelerator supports.
     *
     * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
     *
     * Default: - "IPV4"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresstype)
     *
     * @param ipAddressType The IP address type that an accelerator supports.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP addresses from your own pool to use for the accelerator's static IP addresses when
     * you create an accelerator.
     *
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see
     * [Bring Your Own IP Addresses (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresses)
     *
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     *   (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static
     *   IP addresses when you create an accelerator.
     */
    public fun ipAddresses(vararg ipAddresses: String) {
        _ipAddresses.addAll(listOf(*ipAddresses))
    }

    /**
     * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you can
     * choose IP addresses from your own pool to use for the accelerator's static IP addresses when
     * you create an accelerator.
     *
     * You can specify one or two addresses, separated by a comma. Do not include the /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     *
     * For more information, see
     * [Bring Your Own IP Addresses (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-ipaddresses)
     *
     * @param ipAddresses Optionally, if you've added your own IP address pool to Global Accelerator
     *   (BYOIP), you can choose IP addresses from your own pool to use for the accelerator's static
     *   IP addresses when you create an accelerator.
     */
    public fun ipAddresses(ipAddresses: Collection<String>) {
        _ipAddresses.addAll(ipAddresses)
    }

    /**
     * The name of the accelerator.
     *
     * The name must contain only alphanumeric characters or hyphens (-), and must not begin or end
     * with a hyphen.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-name)
     *
     * @param name The name of the accelerator.
     */
    public fun name(name: String) {
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
     *
     * @param tags Create tags for an accelerator.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Create tags for an accelerator.
     *
     * For more information, see
     * [Tagging](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-accelerator.html#cfn-globalaccelerator-accelerator-tags)
     *
     * @param tags Create tags for an accelerator.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccelerator {
        if (_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
