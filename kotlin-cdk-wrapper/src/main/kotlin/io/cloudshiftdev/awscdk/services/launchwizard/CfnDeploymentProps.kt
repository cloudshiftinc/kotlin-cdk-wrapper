@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.launchwizard

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.launchwizard.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .deploymentPatternName("deploymentPatternName")
 * .name("name")
 * .workloadName("workloadName")
 * // the properties below are optional
 * .specifications(Map.of(
 * "specificationsKey", "specifications"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html)
 */
public interface CfnDeploymentProps {
  /**
   * The name of the deployment pattern.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-deploymentpatternname)
   */
  public fun deploymentPatternName(): String

  /**
   * The name of the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-name)
   */
  public fun name(): String

  /**
   * The settings specified for the deployment.
   *
   * These settings define how to deploy and configure your resources created by the deployment. For
   * more information about the specifications required for creating a deployment for a SAP workload,
   * see [SAP deployment
   * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
   * . To retrieve the specifications required to create a deployment for other workloads, use the
   * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
   * operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-specifications)
   */
  public fun specifications(): Any? = unwrap(this).getSpecifications()

  /**
   * Information about the tags attached to a deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the workload.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-workloadname)
   */
  public fun workloadName(): String

  /**
   * A builder for [CfnDeploymentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentPatternName The name of the deployment pattern. 
     */
    public fun deploymentPatternName(deploymentPatternName: String)

    /**
     * @param name The name of the deployment. 
     */
    public fun name(name: String)

    /**
     * @param specifications The settings specified for the deployment.
     * These settings define how to deploy and configure your resources created by the deployment.
     * For more information about the specifications required for creating a deployment for a SAP
     * workload, see [SAP deployment
     * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
     * . To retrieve the specifications required to create a deployment for other workloads, use the
     * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
     * operation.
     */
    public fun specifications(specifications: Map<String, String>)

    /**
     * @param specifications The settings specified for the deployment.
     * These settings define how to deploy and configure your resources created by the deployment.
     * For more information about the specifications required for creating a deployment for a SAP
     * workload, see [SAP deployment
     * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
     * . To retrieve the specifications required to create a deployment for other workloads, use the
     * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
     * operation.
     */
    public fun specifications(specifications: IResolvable)

    /**
     * @param tags Information about the tags attached to a deployment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Information about the tags attached to a deployment.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workloadName The name of the workload. 
     */
    public fun workloadName(workloadName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.launchwizard.CfnDeploymentProps.Builder
        = software.amazon.awscdk.services.launchwizard.CfnDeploymentProps.builder()

    /**
     * @param deploymentPatternName The name of the deployment pattern. 
     */
    override fun deploymentPatternName(deploymentPatternName: String) {
      cdkBuilder.deploymentPatternName(deploymentPatternName)
    }

    /**
     * @param name The name of the deployment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param specifications The settings specified for the deployment.
     * These settings define how to deploy and configure your resources created by the deployment.
     * For more information about the specifications required for creating a deployment for a SAP
     * workload, see [SAP deployment
     * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
     * . To retrieve the specifications required to create a deployment for other workloads, use the
     * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
     * operation.
     */
    override fun specifications(specifications: Map<String, String>) {
      cdkBuilder.specifications(specifications)
    }

    /**
     * @param specifications The settings specified for the deployment.
     * These settings define how to deploy and configure your resources created by the deployment.
     * For more information about the specifications required for creating a deployment for a SAP
     * workload, see [SAP deployment
     * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
     * . To retrieve the specifications required to create a deployment for other workloads, use the
     * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
     * operation.
     */
    override fun specifications(specifications: IResolvable) {
      cdkBuilder.specifications(specifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param tags Information about the tags attached to a deployment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Information about the tags attached to a deployment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workloadName The name of the workload. 
     */
    override fun workloadName(workloadName: String) {
      cdkBuilder.workloadName(workloadName)
    }

    public fun build(): software.amazon.awscdk.services.launchwizard.CfnDeploymentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.launchwizard.CfnDeploymentProps,
  ) : CdkObject(cdkObject),
      CfnDeploymentProps {
    /**
     * The name of the deployment pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-deploymentpatternname)
     */
    override fun deploymentPatternName(): String = unwrap(this).getDeploymentPatternName()

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The settings specified for the deployment.
     *
     * These settings define how to deploy and configure your resources created by the deployment.
     * For more information about the specifications required for creating a deployment for a SAP
     * workload, see [SAP deployment
     * specifications](https://docs.aws.amazon.com/launchwizard/latest/APIReference/launch-wizard-specifications-sap.html)
     * . To retrieve the specifications required to create a deployment for other workloads, use the
     * [`GetWorkloadDeploymentPattern`](https://docs.aws.amazon.com/launchwizard/latest/APIReference/API_GetWorkloadDeploymentPattern.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-specifications)
     */
    override fun specifications(): Any? = unwrap(this).getSpecifications()

    /**
     * Information about the tags attached to a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the workload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-workloadname)
     */
    override fun workloadName(): String = unwrap(this).getWorkloadName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.launchwizard.CfnDeploymentProps):
        CfnDeploymentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDeploymentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentProps):
        software.amazon.awscdk.services.launchwizard.CfnDeploymentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.launchwizard.CfnDeploymentProps
  }
}
