@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnQueue`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pcs.*;
 * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
 * .clusterId("clusterId")
 * // the properties below are optional
 * .computeNodeGroupConfigurations(List.of(ComputeNodeGroupConfigurationProperty.builder()
 * .computeNodeGroupId("computeNodeGroupId")
 * .build()))
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html)
 */
public interface CfnQueueProps {
  /**
   * The ID of the cluster of the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-clusterid)
   */
  public fun clusterId(): String

  /**
   * The list of compute node group configurations associated with the queue.
   *
   * Queues assign jobs to associated compute node groups.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
   */
  public fun computeNodeGroupConfigurations(): Any? =
      unwrap(this).getComputeNodeGroupConfigurations()

  /**
   * The name that identifies the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * 1 or more tags added to the resource.
   *
   * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
   * string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnQueueProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterId The ID of the cluster of the queue. 
     */
    public fun clusterId(clusterId: String)

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    public fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: IResolvable)

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    public fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: List<Any>)

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    public fun computeNodeGroupConfigurations(vararg computeNodeGroupConfigurations: Any)

    /**
     * @param name The name that identifies the queue.
     */
    public fun name(name: String)

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcs.CfnQueueProps.Builder =
        software.amazon.awscdk.services.pcs.CfnQueueProps.builder()

    /**
     * @param clusterId The ID of the cluster of the queue. 
     */
    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    override fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: IResolvable) {
      cdkBuilder.computeNodeGroupConfigurations(computeNodeGroupConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    override fun computeNodeGroupConfigurations(computeNodeGroupConfigurations: List<Any>) {
      cdkBuilder.computeNodeGroupConfigurations(computeNodeGroupConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param computeNodeGroupConfigurations The list of compute node group configurations
     * associated with the queue.
     * Queues assign jobs to associated compute node groups.
     */
    override fun computeNodeGroupConfigurations(vararg computeNodeGroupConfigurations: Any): Unit =
        computeNodeGroupConfigurations(computeNodeGroupConfigurations.toList())

    /**
     * @param name The name that identifies the queue.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags 1 or more tags added to the resource.
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.pcs.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pcs.CfnQueueProps,
  ) : CdkObject(cdkObject),
      CfnQueueProps {
    /**
     * The ID of the cluster of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-clusterid)
     */
    override fun clusterId(): String = unwrap(this).getClusterId()

    /**
     * The list of compute node group configurations associated with the queue.
     *
     * Queues assign jobs to associated compute node groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-computenodegroupconfigurations)
     */
    override fun computeNodeGroupConfigurations(): Any? =
        unwrap(this).getComputeNodeGroupConfigurations()

    /**
     * The name that identifies the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * 1 or more tags added to the resource.
     *
     * Each tag consists of a tag key and tag value. The tag value is optional and can be an empty
     * string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pcs-queue.html#cfn-pcs-queue-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcs.CfnQueueProps): CfnQueueProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnQueueProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps): software.amazon.awscdk.services.pcs.CfnQueueProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.pcs.CfnQueueProps
  }
}
