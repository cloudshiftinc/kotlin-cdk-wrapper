@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDeploymentStrategy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnDeploymentStrategyProps cfnDeploymentStrategyProps = CfnDeploymentStrategyProps.builder()
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
public interface CfnDeploymentStrategyProps {
  /**
   * Total amount of time for a deployment to last.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes)
   */
  public fun deploymentDurationInMinutes(): Number

  /**
   * A description of the deployment strategy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

  /**
   * The percentage of targets to receive a deployed configuration during each interval.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor)
   */
  public fun growthFactor(): Number

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
   * following formula: `G*(2^N)` . In this formula, `G` is the growth factor specified by the user and
   * `N` is the number of steps until the configuration is deployed to all targets. For example, if you
   * specify a growth factor of 2, then the system rolls out the configuration as follows:
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
   */
  public fun growthType(): String? = unwrap(this).getGrowthType()

  /**
   * A name for the deployment strategy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name)
   */
  public fun name(): String

  /**
   * Save the deployment strategy to a Systems Manager (SSM) document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto)
   */
  public fun replicateTo(): String

  /**
   * Assigns metadata to an AWS AppConfig resource.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define. You can specify a maximum of 50 tags for a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDeploymentStrategyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentDurationInMinutes Total amount of time for a deployment to last. 
     */
    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number)

    /**
     * @param description A description of the deployment strategy.
     */
    public fun description(description: String)

    /**
     * @param finalBakeTimeInMinutes Specifies the amount of time AWS AppConfig monitors for Amazon
     * CloudWatch alarms after the configuration has been deployed to 100% of its targets, before
     * considering the deployment to be complete.
     * If an alarm is triggered during this time, AWS AppConfig rolls back the deployment. You must
     * configure permissions for AWS AppConfig to roll back based on CloudWatch alarms. For more
     * information, see [Configuring permissions for rollback based on Amazon CloudWatch
     * alarms](https://docs.aws.amazon.com/appconfig/latest/userguide/getting-started-with-appconfig-cloudwatch-alarms-permissions.html)
     * in the *AWS AppConfig User Guide* .
     */
    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number)

    /**
     * @param growthFactor The percentage of targets to receive a deployed configuration during each
     * interval. 
     */
    public fun growthFactor(growthFactor: Number)

    /**
     * @param growthType The algorithm used to define how percentage grows over time. AWS AppConfig
     * supports the following growth types:.
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
     */
    public fun growthType(growthType: String)

    /**
     * @param name A name for the deployment strategy. 
     */
    public fun name(name: String)

    /**
     * @param replicateTo Save the deployment strategy to a Systems Manager (SSM) document. 
     */
    public fun replicateTo(replicateTo: String)

    /**
     * @param tags Assigns metadata to an AWS AppConfig resource.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Assigns metadata to an AWS AppConfig resource.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps.builder()

    /**
     * @param deploymentDurationInMinutes Total amount of time for a deployment to last. 
     */
    override fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
      cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    /**
     * @param description A description of the deployment strategy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param finalBakeTimeInMinutes Specifies the amount of time AWS AppConfig monitors for Amazon
     * CloudWatch alarms after the configuration has been deployed to 100% of its targets, before
     * considering the deployment to be complete.
     * If an alarm is triggered during this time, AWS AppConfig rolls back the deployment. You must
     * configure permissions for AWS AppConfig to roll back based on CloudWatch alarms. For more
     * information, see [Configuring permissions for rollback based on Amazon CloudWatch
     * alarms](https://docs.aws.amazon.com/appconfig/latest/userguide/getting-started-with-appconfig-cloudwatch-alarms-permissions.html)
     * in the *AWS AppConfig User Guide* .
     */
    override fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
      cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    /**
     * @param growthFactor The percentage of targets to receive a deployed configuration during each
     * interval. 
     */
    override fun growthFactor(growthFactor: Number) {
      cdkBuilder.growthFactor(growthFactor)
    }

    /**
     * @param growthType The algorithm used to define how percentage grows over time. AWS AppConfig
     * supports the following growth types:.
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
     */
    override fun growthType(growthType: String) {
      cdkBuilder.growthType(growthType)
    }

    /**
     * @param name A name for the deployment strategy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param replicateTo Save the deployment strategy to a Systems Manager (SSM) document. 
     */
    override fun replicateTo(replicateTo: String) {
      cdkBuilder.replicateTo(replicateTo)
    }

    /**
     * @param tags Assigns metadata to an AWS AppConfig resource.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Assigns metadata to an AWS AppConfig resource.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps,
  ) : CdkObject(cdkObject), CfnDeploymentStrategyProps {
    /**
     * Total amount of time for a deployment to last.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes)
     */
    override fun deploymentDurationInMinutes(): Number =
        unwrap(this).getDeploymentDurationInMinutes()

    /**
     * A description of the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun finalBakeTimeInMinutes(): Number? = unwrap(this).getFinalBakeTimeInMinutes()

    /**
     * The percentage of targets to receive a deployed configuration during each interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor)
     */
    override fun growthFactor(): Number = unwrap(this).getGrowthFactor()

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
     */
    override fun growthType(): String? = unwrap(this).getGrowthType()

    /**
     * A name for the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Save the deployment strategy to a Systems Manager (SSM) document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto)
     */
    override fun replicateTo(): String = unwrap(this).getReplicateTo()

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeploymentStrategyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps):
        CfnDeploymentStrategyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDeploymentStrategyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeploymentStrategyProps):
        software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnDeploymentStrategyProps
  }
}
