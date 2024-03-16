@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnIPAMResourceDiscoveryAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnIPAMResourceDiscoveryAssociationProps cfnIPAMResourceDiscoveryAssociationProps =
 * CfnIPAMResourceDiscoveryAssociationProps.builder()
 * .ipamId("ipamId")
 * .ipamResourceDiscoveryId("ipamResourceDiscoveryId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html)
 */
public interface CfnIPAMResourceDiscoveryAssociationProps {
  /**
   * The IPAM ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamid)
   */
  public fun ipamId(): String

  /**
   * The resource discovery ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamresourcediscoveryid)
   */
  public fun ipamResourceDiscoveryId(): String

  /**
   * A tag is a label that you assign to an AWS resource.
   *
   * Each tag consists of a key and an optional value. You can use tags to search and filter your
   * resources or track your AWS costs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPAMResourceDiscoveryAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipamId The IPAM ID. 
     */
    public fun ipamId(ipamId: String)

    /**
     * @param ipamResourceDiscoveryId The resource discovery ID. 
     */
    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String)

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps.builder()

    /**
     * @param ipamId The IPAM ID. 
     */
    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    /**
     * @param ipamResourceDiscoveryId The resource discovery ID. 
     */
    override fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
      cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
    }

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A tag is a label that you assign to an AWS resource.
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps,
  ) : CdkObject(cdkObject), CfnIPAMResourceDiscoveryAssociationProps {
    /**
     * The IPAM ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamid)
     */
    override fun ipamId(): String = unwrap(this).getIpamId()

    /**
     * The resource discovery ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-ipamresourcediscoveryid)
     */
    override fun ipamResourceDiscoveryId(): String = unwrap(this).getIpamResourceDiscoveryId()

    /**
     * A tag is a label that you assign to an AWS resource.
     *
     * Each tag consists of a key and an optional value. You can use tags to search and filter your
     * resources or track your AWS costs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamresourcediscoveryassociation.html#cfn-ec2-ipamresourcediscoveryassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnIPAMResourceDiscoveryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps):
        CfnIPAMResourceDiscoveryAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnIPAMResourceDiscoveryAssociationProps

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryAssociationProps):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
  }
}
