@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnPrimaryTaskSet`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnPrimaryTaskSetProps cfnPrimaryTaskSetProps = CfnPrimaryTaskSetProps.builder()
 * .cluster("cluster")
 * .service("service")
 * .taskSetId("taskSetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html)
 */
public interface CfnPrimaryTaskSetProps {
  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
   * the task set exists in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
   */
  public fun cluster(): String

  /**
   * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
   */
  public fun service(): String

  /**
   * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
   * set in the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
   */
  public fun taskSetId(): String

  /**
   * A builder for [CfnPrimaryTaskSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service that the task set exists in. 
     */
    public fun cluster(cluster: String)

    /**
     * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
     * set exists in. 
     */
    public fun service(service: String)

    /**
     * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
     * the primary task set in the deployment. 
     */
    public fun taskSetId(taskSetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.Builder =
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps.builder()

    /**
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service that the task set exists in. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
     * set exists in. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
     * the primary task set in the deployment. 
     */
    override fun taskSetId(taskSetId: String) {
      cdkBuilder.taskSetId(taskSetId)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps,
  ) : CdkObject(cdkObject),
      CfnPrimaryTaskSetProps {
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
     * the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
     */
    override fun cluster(): String = unwrap(this).getCluster()

    /**
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
     */
    override fun service(): String = unwrap(this).getService()

    /**
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
     * set in the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
     */
    override fun taskSetId(): String = unwrap(this).getTaskSetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrimaryTaskSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps):
        CfnPrimaryTaskSetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPrimaryTaskSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrimaryTaskSetProps):
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnPrimaryTaskSetProps
  }
}
