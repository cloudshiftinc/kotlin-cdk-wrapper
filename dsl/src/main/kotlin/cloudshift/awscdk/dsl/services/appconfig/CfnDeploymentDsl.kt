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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.constructs.Construct

/**
 * The `AWS::AppConfig::Deployment` resource starts a deployment.
 *
 * Starting a deployment in AWS AppConfig calls the `StartDeployment` API action. This call includes
 * the IDs of the AWS AppConfig application, the environment, the configuration profile, and
 * (optionally) the configuration data version to deploy. The call also includes the ID of the
 * deployment strategy to use, which determines how the configuration data is deployed.
 *
 * AWS AppConfig monitors the distribution to all hosts and reports status. If a distribution fails,
 * then AWS AppConfig rolls back the configuration.
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
 * CfnDeployment cfnDeployment = CfnDeployment.Builder.create(this, "MyCfnDeployment")
 * .applicationId("applicationId")
 * .configurationProfileId("configurationProfileId")
 * .configurationVersion("configurationVersion")
 * .deploymentStrategyId("deploymentStrategyId")
 * .environmentId("environmentId")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyIdentifier("kmsKeyIdentifier")
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html)
 */
@CdkDslMarker
public class CfnDeploymentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeployment.Builder = CfnDeployment.Builder.create(scope, id)

    private val _tags: MutableList<CfnDeployment.TagsProperty> = mutableListOf()

    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-applicationid)
     *
     * @param applicationId The application ID.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The configuration profile ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid)
     *
     * @param configurationProfileId The configuration profile ID.
     */
    public fun configurationProfileId(configurationProfileId: String) {
        cdkBuilder.configurationProfileId(configurationProfileId)
    }

    /**
     * The configuration version to deploy.
     *
     * If deploying an AWS AppConfig hosted configuration version, you can specify either the
     * version number or version label. For all other configurations, you must specify the version
     * number.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion)
     *
     * @param configurationVersion The configuration version to deploy.
     */
    public fun configurationVersion(configurationVersion: String) {
        cdkBuilder.configurationVersion(configurationVersion)
    }

    /**
     * The deployment strategy ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid)
     *
     * @param deploymentStrategyId The deployment strategy ID.
     */
    public fun deploymentStrategyId(deploymentStrategyId: String) {
        cdkBuilder.deploymentStrategyId(deploymentStrategyId)
    }

    /**
     * A description of the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description)
     *
     * @param description A description of the deployment.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The environment ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid)
     *
     * @param environmentId The environment ID.
     */
    public fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
    }

    /**
     * The AWS KMS key identifier (key ID, key alias, or key ARN).
     *
     * AWS AppConfig uses this ID to encrypt the configuration data using a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-kmskeyidentifier)
     *
     * @param kmsKeyIdentifier The AWS KMS key identifier (key ID, key alias, or key ARN).
     */
    public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     *
     * @param tags Metadata to assign to the deployment.
     */
    public fun tags(tags: CfnDeploymentTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDeploymentTagsPropertyDsl().apply(tags).build())
    }

    /**
     * Metadata to assign to the deployment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
     *
     * @param tags Metadata to assign to the deployment.
     */
    public fun tags(tags: Collection<CfnDeployment.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeployment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
