package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPAMScopeProps {
  /**
   * The description of the scope.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the IPAM for which you're creating this scope.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-ipamid)
   */
  public fun ipamId(): String

  /**
   * The key/value combination of a tag assigned to the resource.
   *
   * Use the tag key in the filter name and the tag value as the filter value. For example, to find
   * all resources that have a tag with the key `Owner` and the value `TeamA` , specify `tag:Owner` for
   * the filter name and `TeamA` for the filter value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnIPAMScopeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the scope.
     */
    public fun description(description: String)

    /**
     * @param ipamId The ID of the IPAM for which you're creating this scope. 
     */
    public fun ipamId(ipamId: String)

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps.builder()

    /**
     * @param description The description of the scope.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ipamId The ID of the IPAM for which you're creating this scope. 
     */
    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The key/value combination of a tag assigned to the resource.
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMScopeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps,
  ) : CdkObject(cdkObject), CfnIPAMScopeProps {
    /**
     * The description of the scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the IPAM for which you're creating this scope.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-ipamid)
     */
    override fun ipamId(): String = unwrap(this).getIpamId()

    /**
     * The key/value combination of a tag assigned to the resource.
     *
     * Use the tag key in the filter name and the tag value as the filter value. For example, to
     * find all resources that have a tag with the key `Owner` and the value `TeamA` , specify
     * `tag:Owner` for the filter name and `TeamA` for the filter value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ipamscope.html#cfn-ec2-ipamscope-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps):
        CfnIPAMScopeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMScopeProps):
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps
  }
}
