@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::AppConfig::DeploymentStrategy` resource creates an AWS AppConfig deployment strategy.
 *
 * A deployment strategy defines important criteria for rolling out your configuration to the
 * designated targets. A deployment strategy includes: the overall duration required, a percentage of
 * targets to receive the deployment during each interval, an algorithm that defines how percentage
 * grows, and bake time.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 *
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Choose a pre-defined deployment strategy or create your own
 * * Deploy the configuration
 *
 * For more information, see [AWS
 * AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in the
 * *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnDeploymentStrategy cfnDeploymentStrategy = CfnDeploymentStrategy.Builder.create(this,
 * "MyCfnDeploymentStrategy")
 * .deploymentDurationInMinutes(123)
 * .growthFactor(123)
 * .name("name")
 * .replicateTo("replicateTo")
 * // the properties below are optional
 * .description("description")
 * .finalBakeTimeInMinutes(123)
 * .growthType("growthType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html)
 */
public open class CfnDeploymentStrategy(
  cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentStrategyProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDeploymentStrategyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDeploymentStrategyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDeploymentStrategyProps(props)
  )

  /**
   * The deployment strategy ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Total amount of time for a deployment to last.
   */
  public open fun deploymentDurationInMinutes(): Number =
      unwrap(this).getDeploymentDurationInMinutes()

  /**
   * Total amount of time for a deployment to last.
   */
  public open fun deploymentDurationInMinutes(`value`: Number) {
    unwrap(this).setDeploymentDurationInMinutes(`value`)
  }

  /**
   * A description of the deployment strategy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the deployment strategy.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
   * configuration has been deployed to 100% of its targets, before considering the deployment to be
   * complete.
   */
  public open fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  /**
   * Specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
   * configuration has been deployed to 100% of its targets, before considering the deployment to be
   * complete.
   */
  public open fun finalBakeTimeInMinutes(`value`: Number) {
    unwrap(this).setFinalBakeTimeInMinutes(`value`)
  }

  /**
   * The percentage of targets to receive a deployed configuration during each interval.
   */
  public open fun growthFactor(): Number = unwrap(this).getGrowthFactor()

  /**
   * The percentage of targets to receive a deployed configuration during each interval.
   */
  public open fun growthFactor(`value`: Number) {
    unwrap(this).setGrowthFactor(`value`)
  }

  /**
   * The algorithm used to define how percentage grows over time.
   *
   * AWS AppConfig supports the following growth types:.
   */
  public open fun growthType(): String? = unwrap(this).getGrowthType()

  /**
   * The algorithm used to define how percentage grows over time.
   *
   * AWS AppConfig supports the following growth types:.
   */
  public open fun growthType(`value`: String) {
    unwrap(this).setGrowthType(`value`)
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
   * A name for the deployment strategy.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the deployment strategy.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Save the deployment strategy to a Systems Manager (SSM) document.
   */
  public open fun replicateTo(): String = unwrap(this).getReplicateTo()

  /**
   * Save the deployment strategy to a Systems Manager (SSM) document.
   */
  public open fun replicateTo(`value`: String) {
    unwrap(this).setReplicateTo(`value`)
  }

  /**
   * Assigns metadata to an AWS AppConfig resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Assigns metadata to an AWS AppConfig resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Assigns metadata to an AWS AppConfig resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnDeploymentStrategy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Total amount of time for a deployment to last.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes)
     * @param deploymentDurationInMinutes Total amount of time for a deployment to last. 
     */
    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number)

    /**
     * A description of the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description)
     * @param description A description of the deployment strategy. 
     */
    public fun description(description: String)

    /**
     * Specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
     * configuration has been deployed to 100% of its targets, before considering the deployment to be
     * complete.
     *
     * If an alarm is triggered during this time, AWS AppConfig rolls back the deployment. You must
     * configure permissions for AWS AppConfig to roll back based on CloudWatch alarms. For more
     * information, see [Configuring permissions for rollback based on Amazon CloudWatch
     * alarms](https://docs.aws.amazon.com/appconfig/latest/userguide/getting-started-with-appconfig-cloudwatch-alarms-permissions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes)
     * @param finalBakeTimeInMinutes Specifies the amount of time AWS AppConfig monitors for Amazon
     * CloudWatch alarms after the configuration has been deployed to 100% of its targets, before
     * considering the deployment to be complete. 
     */
    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number)

    /**
     * The percentage of targets to receive a deployed configuration during each interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor)
     * @param growthFactor The percentage of targets to receive a deployed configuration during each
     * interval. 
     */
    public fun growthFactor(growthFactor: Number)

    /**
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the
     * following growth types:.
     *
     * *Linear* : For this type, AWS AppConfig processes the deployment by dividing the total number
     * of targets by the value specified for `Step percentage` . For example, a linear deployment that
     * uses a `Step percentage` of 10 deploys the configuration to 10 percent of the hosts. After those
     * deployments are complete, the system deploys the configuration to the next 10 percent. This
     * continues until 100% of the targets have successfully received the configuration.
     *
     * *Exponential* : For this type, AWS AppConfig processes the deployment exponentially using the
     * following formula: `G*(2^N)` . In this formula, `G` is the growth factor specified by the user
     * and `N` is the number of steps until the configuration is deployed to all targets. For example,
     * if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *
     * `2*(2^0)`
     *
     * `2*(2^1)`
     *
     * `2*(2^2)`
     *
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the
     * targets, 8% of the targets, and continues until the configuration has been deployed to all
     * targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype)
     * @param growthType The algorithm used to define how percentage grows over time. AWS AppConfig
     * supports the following growth types:. 
     */
    public fun growthType(growthType: String)

    /**
     * A name for the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name)
     * @param name A name for the deployment strategy. 
     */
    public fun name(name: String)

    /**
     * Save the deployment strategy to a Systems Manager (SSM) document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto)
     * @param replicateTo Save the deployment strategy to a Systems Manager (SSM) document. 
     */
    public fun replicateTo(replicateTo: String)

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     * @param tags Assigns metadata to an AWS AppConfig resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     * @param tags Assigns metadata to an AWS AppConfig resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.Builder
        = software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.Builder.create(scope, id)

    /**
     * Total amount of time for a deployment to last.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes)
     * @param deploymentDurationInMinutes Total amount of time for a deployment to last. 
     */
    override fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
      cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    /**
     * A description of the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description)
     * @param description A description of the deployment strategy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
     * configuration has been deployed to 100% of its targets, before considering the deployment to be
     * complete.
     *
     * If an alarm is triggered during this time, AWS AppConfig rolls back the deployment. You must
     * configure permissions for AWS AppConfig to roll back based on CloudWatch alarms. For more
     * information, see [Configuring permissions for rollback based on Amazon CloudWatch
     * alarms](https://docs.aws.amazon.com/appconfig/latest/userguide/getting-started-with-appconfig-cloudwatch-alarms-permissions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes)
     * @param finalBakeTimeInMinutes Specifies the amount of time AWS AppConfig monitors for Amazon
     * CloudWatch alarms after the configuration has been deployed to 100% of its targets, before
     * considering the deployment to be complete. 
     */
    override fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
      cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    /**
     * The percentage of targets to receive a deployed configuration during each interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor)
     * @param growthFactor The percentage of targets to receive a deployed configuration during each
     * interval. 
     */
    override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    /**
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the
     * following growth types:.
     *
     * *Linear* : For this type, AWS AppConfig processes the deployment by dividing the total number
     * of targets by the value specified for `Step percentage` . For example, a linear deployment that
     * uses a `Step percentage` of 10 deploys the configuration to 10 percent of the hosts. After those
     * deployments are complete, the system deploys the configuration to the next 10 percent. This
     * continues until 100% of the targets have successfully received the configuration.
     *
     * *Exponential* : For this type, AWS AppConfig processes the deployment exponentially using the
     * following formula: `G*(2^N)` . In this formula, `G` is the growth factor specified by the user
     * and `N` is the number of steps until the configuration is deployed to all targets. For example,
     * if you specify a growth factor of 2, then the system rolls out the configuration as follows:
     *
     * `2*(2^0)`
     *
     * `2*(2^1)`
     *
     * `2*(2^2)`
     *
     * Expressed numerically, the deployment rolls out as follows: 2% of the targets, 4% of the
     * targets, 8% of the targets, and continues until the configuration has been deployed to all
     * targets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthtype)
     * @param growthType The algorithm used to define how percentage grows over time. AWS AppConfig
     * supports the following growth types:. 
     */
    override fun growthType(growthType: String) {
      cdkBuilder.growthType(growthType)
    }

    /**
     * A name for the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name)
     * @param name A name for the deployment strategy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Save the deployment strategy to a Systems Manager (SSM) document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto)
     * @param replicateTo Save the deployment strategy to a Systems Manager (SSM) document. 
     */
    override fun replicateTo(replicateTo: String) {
      cdkBuilder.replicateTo(replicateTo)
    }

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     * @param tags Assigns metadata to an AWS AppConfig resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     * @param tags Assigns metadata to an AWS AppConfig resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDeploymentStrategy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDeploymentStrategy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy):
        CfnDeploymentStrategy = CfnDeploymentStrategy(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentStrategy):
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
  }
}
