@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnDeployment
import software.constructs.Construct

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
   * @param applicationId The application ID. 
   */
  public fun applicationId(applicationId: String) {
    cdkBuilder.applicationId(applicationId)
  }

  /**
   * The configuration profile ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationprofileid)
   * @param configurationProfileId The configuration profile ID. 
   */
  public fun configurationProfileId(configurationProfileId: String) {
    cdkBuilder.configurationProfileId(configurationProfileId)
  }

  /**
   * The configuration version to deploy.
   *
   * If deploying an AWS AppConfig hosted configuration version, you can specify either the version
   * number or version label. For all other configurations, you must specify the version number.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-configurationversion)
   * @param configurationVersion The configuration version to deploy. 
   */
  public fun configurationVersion(configurationVersion: String) {
    cdkBuilder.configurationVersion(configurationVersion)
  }

  /**
   * The deployment strategy ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-deploymentstrategyid)
   * @param deploymentStrategyId The deployment strategy ID. 
   */
  public fun deploymentStrategyId(deploymentStrategyId: String) {
    cdkBuilder.deploymentStrategyId(deploymentStrategyId)
  }

  /**
   * A description of the deployment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-description)
   * @param description A description of the deployment. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The environment ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-environmentid)
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
   * @param kmsKeyIdentifier The AWS KMS key identifier (key ID, key alias, or key ARN). 
   */
  public fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
    cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
  }

  /**
   * Metadata to assign to the deployment.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
   * @param tags Metadata to assign to the deployment. 
   */
  public fun tags(tags: CfnDeploymentTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnDeploymentTagsPropertyDsl().apply(tags).build())
  }

  /**
   * Metadata to assign to the deployment.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-deployment.html#cfn-appconfig-deployment-tags)
   * @param tags Metadata to assign to the deployment. 
   */
  public fun tags(tags: Collection<CfnDeployment.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDeployment {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
