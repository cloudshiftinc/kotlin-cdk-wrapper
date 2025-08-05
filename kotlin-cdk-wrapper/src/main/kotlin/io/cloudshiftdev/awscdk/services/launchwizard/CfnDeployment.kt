@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.launchwizard

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a deployment for the given workload.
 *
 * Deployments created by this operation are not available in the Launch Wizard console to use the
 * `Clone deployment` action on.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.launchwizard.*;
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
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
public open class CfnDeployment(
  cdkObject: software.amazon.awscdk.services.launchwizard.CfnDeployment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps,
  ) :
      this(software.amazon.awscdk.services.launchwizard.CfnDeployment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeploymentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the deployment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the deployment was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The time the deployment was deleted.
   */
  public open fun attrDeletedAt(): String = unwrap(this).getAttrDeletedAt()

  /**
   * The ID of the deployment.
   */
  public open fun attrDeploymentId(): String = unwrap(this).getAttrDeploymentId()

  /**
   * The resource group of the deployment.
   */
  public open fun attrResourceGroup(): String = unwrap(this).getAttrResourceGroup()

  /**
   * The status of the deployment.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the deployment pattern.
   */
  public open fun deploymentPatternName(): String = unwrap(this).getDeploymentPatternName()

  /**
   * The name of the deployment pattern.
   */
  public open fun deploymentPatternName(`value`: String) {
    unwrap(this).setDeploymentPatternName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the deployment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the deployment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The settings specified for the deployment.
   */
  public open fun specifications(): Any? = unwrap(this).getSpecifications()

  /**
   * The settings specified for the deployment.
   */
  public open fun specifications(`value`: Map<String, String>) {
    unwrap(this).setSpecifications(`value`)
  }

  /**
   * The settings specified for the deployment.
   */
  public open fun specifications(`value`: IResolvable) {
    unwrap(this).setSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information about the tags attached to a deployment.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Information about the tags attached to a deployment.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Information about the tags attached to a deployment.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the workload.
   */
  public open fun workloadName(): String = unwrap(this).getWorkloadName()

  /**
   * The name of the workload.
   */
  public open fun workloadName(`value`: String) {
    unwrap(this).setWorkloadName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.launchwizard.CfnDeployment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the deployment pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-deploymentpatternname)
     * @param deploymentPatternName The name of the deployment pattern. 
     */
    public fun deploymentPatternName(deploymentPatternName: String)

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-name)
     * @param name The name of the deployment. 
     */
    public fun name(name: String)

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
     * @param specifications The settings specified for the deployment. 
     */
    public fun specifications(specifications: Map<String, String>)

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
     * @param specifications The settings specified for the deployment. 
     */
    public fun specifications(specifications: IResolvable)

    /**
     * Information about the tags attached to a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
     * @param tags Information about the tags attached to a deployment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Information about the tags attached to a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
     * @param tags Information about the tags attached to a deployment. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the workload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-workloadname)
     * @param workloadName The name of the workload. 
     */
    public fun workloadName(workloadName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.launchwizard.CfnDeployment.Builder =
        software.amazon.awscdk.services.launchwizard.CfnDeployment.Builder.create(scope, id)

    /**
     * The name of the deployment pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-deploymentpatternname)
     * @param deploymentPatternName The name of the deployment pattern. 
     */
    override fun deploymentPatternName(deploymentPatternName: String) {
      cdkBuilder.deploymentPatternName(deploymentPatternName)
    }

    /**
     * The name of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-name)
     * @param name The name of the deployment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

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
     * @param specifications The settings specified for the deployment. 
     */
    override fun specifications(specifications: Map<String, String>) {
      cdkBuilder.specifications(specifications)
    }

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
     * @param specifications The settings specified for the deployment. 
     */
    override fun specifications(specifications: IResolvable) {
      cdkBuilder.specifications(specifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information about the tags attached to a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
     * @param tags Information about the tags attached to a deployment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Information about the tags attached to a deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-tags)
     * @param tags Information about the tags attached to a deployment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the workload.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-launchwizard-deployment.html#cfn-launchwizard-deployment-workloadname)
     * @param workloadName The name of the workload. 
     */
    override fun workloadName(workloadName: String) {
      cdkBuilder.workloadName(workloadName)
    }

    public fun build(): software.amazon.awscdk.services.launchwizard.CfnDeployment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.launchwizard.CfnDeployment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeployment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeployment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.launchwizard.CfnDeployment):
        CfnDeployment = CfnDeployment(cdkObject)

    internal fun unwrap(wrapped: CfnDeployment):
        software.amazon.awscdk.services.launchwizard.CfnDeployment = wrapped.cdkObject as
        software.amazon.awscdk.services.launchwizard.CfnDeployment
  }
}
