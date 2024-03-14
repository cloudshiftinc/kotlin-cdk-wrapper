package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSubnetGroupProps {
  /**
   * A description of the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the subnet group to be used for the cluster .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetgroupname)
   */
  public fun subnetGroupName(): String

  /**
   * A list of Amazon VPC subnet IDs for the subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the subnet group.
     */
    public fun description(description: String)

    /**
     * @param subnetGroupName The name of the subnet group to be used for the cluster . 
     */
    public fun subnetGroupName(subnetGroupName: String)

    /**
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps.builder()

    /**
     * @param description A description of the subnet group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param subnetGroupName The name of the subnet group to be used for the cluster . 
     */
    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    /**
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of Amazon VPC subnet IDs for the subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnSubnetGroupProps {
    /**
     * A description of the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the subnet group to be used for the cluster .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetgroupname)
     */
    override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

    /**
     * A list of Amazon VPC subnet IDs for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-subnetgroup.html#cfn-memorydb-subnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps):
        CfnSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroupProps):
        software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.memorydb.CfnSubnetGroupProps
  }
}
