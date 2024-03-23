@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCoreNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * Object policyDocument;
 * CfnCoreNetworkProps cfnCoreNetworkProps = CfnCoreNetworkProps.builder()
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument(policyDocument)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html)
 */
public interface CfnCoreNetworkProps {
  /**
   * The description of a core network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the global network that your core network is a part of.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-globalnetworkid)
   */
  public fun globalNetworkId(): String

  /**
   * Describes a core network policy. For more information, see [Core network
   * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
   * .
   *
   * If you update the policy document, CloudFormation will apply the core network change set
   * generated from the updated policy document, and then set it as the LIVE policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-policydocument)
   */
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * The list of key-value tags associated with a core network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCoreNetworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of a core network.
     */
    public fun description(description: String)

    /**
     * @param globalNetworkId The ID of the global network that your core network is a part of. 
     */
    public fun globalNetworkId(globalNetworkId: String)

    /**
     * @param policyDocument Describes a core network policy. For more information, see [Core
     * network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * .
     * If you update the policy document, CloudFormation will apply the core network change set
     * generated from the updated policy document, and then set it as the LIVE policy.
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param tags The list of key-value tags associated with a core network.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value tags associated with a core network.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps.builder()

    /**
     * @param description The description of a core network.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param globalNetworkId The ID of the global network that your core network is a part of. 
     */
    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /**
     * @param policyDocument Describes a core network policy. For more information, see [Core
     * network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * .
     * If you update the policy document, CloudFormation will apply the core network change set
     * generated from the updated policy document, and then set it as the LIVE policy.
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param tags The list of key-value tags associated with a core network.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of key-value tags associated with a core network.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps,
  ) : CdkObject(cdkObject), CfnCoreNetworkProps {
    /**
     * The description of a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the global network that your core network is a part of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-globalnetworkid)
     */
    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    /**
     * Describes a core network policy. For more information, see [Core network
     * policies](https://docs.aws.amazon.com/network-manager/latest/cloudwan/cloudwan-policy-change-sets.html)
     * .
     *
     * If you update the policy document, CloudFormation will apply the core network change set
     * generated from the updated policy document, and then set it as the LIVE policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-policydocument)
     */
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    /**
     * The list of key-value tags associated with a core network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-corenetwork.html#cfn-networkmanager-corenetwork-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCoreNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps):
        CfnCoreNetworkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCoreNetworkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCoreNetworkProps):
        software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps
  }
}
