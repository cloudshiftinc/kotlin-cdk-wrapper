package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBSubnetGroupProps {
  /**
   * Provides the description of the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription)
   */
  public fun dbSubnetGroupDescription(): String

  /**
   * The name of the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname)
   */
  public fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  /**
   * The Amazon EC2 subnet IDs for the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The tags that you want to attach to the DB subnet group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBSubnetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dbSubnetGroupDescription Provides the description of the DB subnet group. 
     */
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String)

    /**
     * @param dbSubnetGroupName The name of the DB subnet group.
     */
    public fun dbSubnetGroupName(dbSubnetGroupName: String)

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The tags that you want to attach to the DB subnet group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that you want to attach to the DB subnet group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.Builder =
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps.builder()

    /**
     * @param dbSubnetGroupDescription Provides the description of the DB subnet group. 
     */
    override fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
      cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    /**
     * @param dbSubnetGroupName The name of the DB subnet group.
     */
    override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds The Amazon EC2 subnet IDs for the DB subnet group. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The tags that you want to attach to the DB subnet group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags that you want to attach to the DB subnet group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps,
  ) : CdkObject(cdkObject), CfnDBSubnetGroupProps {
    /**
     * Provides the description of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupdescription)
     */
    override fun dbSubnetGroupDescription(): String = unwrap(this).getDbSubnetGroupDescription()

    /**
     * The name of the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-dbsubnetgroupname)
     */
    override fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

    /**
     * The Amazon EC2 subnet IDs for the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The tags that you want to attach to the DB subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbsubnetgroup.html#cfn-neptune-dbsubnetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSubnetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps):
        CfnDBSubnetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSubnetGroupProps):
        software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptune.CfnDBSubnetGroupProps
  }
}
