@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnDeploymentStrategy
import software.constructs.Construct

/**
 * The `AWS::AppConfig::DeploymentStrategy` resource creates an AWS AppConfig deployment strategy.
 *
 * A deployment strategy defines important criteria for rolling out your configuration to the
 * designated targets. A deployment strategy includes: the overall duration required, a percentage
 * of targets to receive the deployment during each interval, an algorithm that defines how
 * percentage grows, and bake time.
 *
 * AWS AppConfig requires that you create resources and deploy a configuration in the following
 * order:
 * * Create an application
 * * Create an environment
 * * Create a configuration profile
 * * Create a deployment strategy
 * * Deploy the configuration
 *
 * For more information, see
 * [AWS AppConfig](https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html) in
 * the *AWS AppConfig User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
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
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html)
 */
@CdkDslMarker
public class CfnDeploymentStrategyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeploymentStrategy.Builder =
        CfnDeploymentStrategy.Builder.create(scope, id)

    private val _tags: MutableList<CfnDeploymentStrategy.TagsProperty> = mutableListOf()

    /**
     * Total amount of time for a deployment to last.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-deploymentdurationinminutes)
     *
     * @param deploymentDurationInMinutes Total amount of time for a deployment to last.
     */
    public fun deploymentDurationInMinutes(deploymentDurationInMinutes: Number) {
        cdkBuilder.deploymentDurationInMinutes(deploymentDurationInMinutes)
    }

    /**
     * A description of the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-description)
     *
     * @param description A description of the deployment strategy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after the
     * configuration has been deployed to 100% of its targets, before considering the deployment to
     * be complete.
     *
     * If an alarm is triggered during this time, AWS AppConfig rolls back the deployment. You must
     * configure permissions for AWS AppConfig to roll back based on CloudWatch alarms. For more
     * information, see
     * [Configuring permissions for rollback based on Amazon CloudWatch alarms](https://docs.aws.amazon.com/appconfig/latest/userguide/getting-started-with-appconfig-cloudwatch-alarms-permissions.html)
     * in the *AWS AppConfig User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-finalbaketimeinminutes)
     *
     * @param finalBakeTimeInMinutes Specifies the amount of time AWS AppConfig monitors for Amazon
     *   CloudWatch alarms after the configuration has been deployed to 100% of its targets, before
     *   considering the deployment to be complete.
     */
    public fun finalBakeTimeInMinutes(finalBakeTimeInMinutes: Number) {
        cdkBuilder.finalBakeTimeInMinutes(finalBakeTimeInMinutes)
    }

    /**
     * The percentage of targets to receive a deployed configuration during each interval.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-growthfactor)
     *
     * @param growthFactor The percentage of targets to receive a deployed configuration during each
     *   interval.
     */
    public fun growthFactor(growthFactor: Number) {
        cdkBuilder.growthFactor(growthFactor)
    }

    /**
     * The algorithm used to define how percentage grows over time. AWS AppConfig supports the
     * following growth types:.
     *
     * *Linear* : For this type, AWS AppConfig processes the deployment by dividing the total number
     * of targets by the value specified for `Step percentage` . For example, a linear deployment
     * that uses a `Step percentage` of 10 deploys the configuration to 10 percent of the hosts.
     * After those deployments are complete, the system deploys the configuration to the next 10
     * percent. This continues until 100% of the targets have successfully received the
     * configuration.
     *
     * *Exponential* : For this type, AWS AppConfig processes the deployment exponentially using the
     * following formula: `G*(2^N)` . In this formula, `G` is the growth factor specified by the
     * user and `N` is the number of steps until the configuration is deployed to all targets. For
     * example, if you specify a growth factor of 2, then the system rolls out the configuration as
     * follows:
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
     *
     * @param growthType The algorithm used to define how percentage grows over time. AWS AppConfig
     *   supports the following growth types:.
     */
    public fun growthType(growthType: String) {
        cdkBuilder.growthType(growthType)
    }

    /**
     * A name for the deployment strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-name)
     *
     * @param name A name for the deployment strategy.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Save the deployment strategy to a Systems Manager (SSM) document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-replicateto)
     *
     * @param replicateTo Save the deployment strategy to a Systems Manager (SSM) document.
     */
    public fun replicateTo(replicateTo: String) {
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
     *
     * @param tags Assigns metadata to an AWS AppConfig resource.
     */
    public fun tags(tags: CfnDeploymentStrategyTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDeploymentStrategyTagsPropertyDsl().apply(tags).build())
    }

    /**
     * Assigns metadata to an AWS AppConfig resource.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deploymentstrategy.html#cfn-appconfig-deploymentstrategy-tags)
     *
     * @param tags Assigns metadata to an AWS AppConfig resource.
     */
    public fun tags(tags: Collection<CfnDeploymentStrategy.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeploymentStrategy {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
