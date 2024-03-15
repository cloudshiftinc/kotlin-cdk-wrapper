@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmincidents

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnReplicationSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmincidents.*;
 * CfnReplicationSetProps cfnReplicationSetProps = CfnReplicationSetProps.builder()
 * .regions(List.of(ReplicationRegionProperty.builder()
 * .regionConfiguration(RegionConfigurationProperty.builder()
 * .sseKmsKeyId("sseKmsKeyId")
 * .build())
 * .regionName("regionName")
 * .build()))
 * // the properties below are optional
 * .deletionProtected(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html)
 */
public interface CfnReplicationSetProps {
  /**
   * Determines if the replication set deletion protection is enabled or not.
   *
   * If deletion protection is enabled, you can't delete the last Region in the replication set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
   */
  public fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

  /**
   * Specifies the Regions of the replication set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
   */
  public fun regions(): Any

  /**
   * A list of tags to add to the replication set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnReplicationSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not.
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     */
    public fun deletionProtected(deletionProtected: Boolean)

    /**
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not.
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     */
    public fun deletionProtected(deletionProtected: IResolvable)

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(regions: IResolvable)

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(regions: List<Any>)

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    public fun regions(vararg regions: Any)

    /**
     * @param tags A list of tags to add to the replication set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags to add to the replication set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps.Builder =
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps.builder()

    /**
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not.
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     */
    override fun deletionProtected(deletionProtected: Boolean) {
      cdkBuilder.deletionProtected(deletionProtected)
    }

    /**
     * @param deletionProtected Determines if the replication set deletion protection is enabled or
     * not.
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     */
    override fun deletionProtected(deletionProtected: IResolvable) {
      cdkBuilder.deletionProtected(deletionProtected.let(IResolvable::unwrap))
    }

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(regions: IResolvable) {
      cdkBuilder.regions(regions.let(IResolvable::unwrap))
    }

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(regions: List<Any>) {
      cdkBuilder.regions(regions)
    }

    /**
     * @param regions Specifies the Regions of the replication set. 
     */
    override fun regions(vararg regions: Any): Unit = regions(regions.toList())

    /**
     * @param tags A list of tags to add to the replication set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags to add to the replication set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps,
  ) : CdkObject(cdkObject), CfnReplicationSetProps {
    /**
     * Determines if the replication set deletion protection is enabled or not.
     *
     * If deletion protection is enabled, you can't delete the last Region in the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-deletionprotected)
     */
    override fun deletionProtected(): Any? = unwrap(this).getDeletionProtected()

    /**
     * Specifies the Regions of the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-regions)
     */
    override fun regions(): Any = unwrap(this).getRegions()

    /**
     * A list of tags to add to the replication set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmincidents-replicationset.html#cfn-ssmincidents-replicationset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps):
        CfnReplicationSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSetProps):
        software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
  }
}
