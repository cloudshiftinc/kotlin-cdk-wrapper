@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) of an App Runner automatic scaling configuration resource that
   * you want to associate with your service.
   *
   * If not provided, App Runner associates the latest revision of a default auto scaling
   * configuration.
   *
   * Specify an ARN with a name and a revision number to associate that revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability/3`
   *
   * Specify just the name to associate the latest revision. For example:
   * `arn:aws:apprunner:us-east-1:123456789012:autoscalingconfiguration/high-availability`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-autoscalingconfigurationarn)
   * @param autoScalingConfigurationArn The Amazon Resource Name (ARN) of an App Runner automatic
   * scaling configuration resource that you want to associate with your service. 
   */
  public fun autoScalingConfigurationArn(autoScalingConfigurationArn: String) {
    cdkBuilder.autoScalingConfigurationArn(autoScalingConfigurationArn)
  }

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   *
   * By default, App Runner uses an AWS managed key .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
   * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
   * encrypt the copy of your source repository that it maintains and your service logs. 
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * An optional custom encryption key that App Runner uses to encrypt the copy of your source
   * repository that it maintains and your service logs.
   *
   * By default, App Runner uses an AWS managed key .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-encryptionconfiguration)
   * @param encryptionConfiguration An optional custom encryption key that App Runner uses to
   * encrypt the copy of your source repository that it maintains and your service logs. 
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnService.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
   * @param healthCheckConfiguration The settings for the health check that AWS App Runner performs
   * to monitor the health of the App Runner service. 
   */
  public fun healthCheckConfiguration(healthCheckConfiguration: IResolvable) {
    cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
  }

  /**
   * The settings for the health check that AWS App Runner performs to monitor the health of the App
   * Runner service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-healthcheckconfiguration)
   * @param healthCheckConfiguration The settings for the health check that AWS App Runner performs
   * to monitor the health of the App Runner service. 
   */
  public
      fun healthCheckConfiguration(healthCheckConfiguration: CfnService.HealthCheckConfigurationProperty) {
    cdkBuilder.healthCheckConfiguration(healthCheckConfiguration)
  }

  /**
   * The runtime configuration of instances (scaling units) of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
   * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
   * service. 
   */
  public fun instanceConfiguration(instanceConfiguration: IResolvable) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  /**
   * The runtime configuration of instances (scaling units) of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-instanceconfiguration)
   * @param instanceConfiguration The runtime configuration of instances (scaling units) of your
   * service. 
   */
  public
      fun instanceConfiguration(instanceConfiguration: CfnService.InstanceConfigurationProperty) {
    cdkBuilder.instanceConfiguration(instanceConfiguration)
  }

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
   * @param networkConfiguration Configuration settings related to network traffic of the web
   * application that the App Runner service runs. 
   */
  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * Configuration settings related to network traffic of the web application that the App Runner
   * service runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-networkconfiguration)
   * @param networkConfiguration Configuration settings related to network traffic of the web
   * application that the App Runner service runs. 
   */
  public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  /**
   * The observability configuration of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
   * @param observabilityConfiguration The observability configuration of your service. 
   */
  public fun observabilityConfiguration(observabilityConfiguration: IResolvable) {
    cdkBuilder.observabilityConfiguration(observabilityConfiguration)
  }

  /**
   * The observability configuration of your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-observabilityconfiguration)
   * @param observabilityConfiguration The observability configuration of your service. 
   */
  public
      fun observabilityConfiguration(observabilityConfiguration: CfnService.ServiceObservabilityConfigurationProperty) {
    cdkBuilder.observabilityConfiguration(observabilityConfiguration)
  }

  /**
   * A name for the App Runner service.
   *
   * It must be unique across all the running App Runner services in your AWS account in the AWS
   * Region .
   *
   * If you don't specify a name, AWS CloudFormation generates a name for your service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-servicename)
   * @param serviceName A name for the App Runner service. 
   */
  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  /**
   * The source to deploy to the App Runner service.
   *
   * It can be a code or an image repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
   * @param sourceConfiguration The source to deploy to the App Runner service. 
   */
  public fun sourceConfiguration(sourceConfiguration: IResolvable) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  /**
   * The source to deploy to the App Runner service.
   *
   * It can be a code or an image repository.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-sourceconfiguration)
   * @param sourceConfiguration The source to deploy to the App Runner service. 
   */
  public fun sourceConfiguration(sourceConfiguration: CfnService.SourceConfigurationProperty) {
    cdkBuilder.sourceConfiguration(sourceConfiguration)
  }

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
   * @param tags An optional list of metadata items that you can associate with the App Runner
   * service resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An optional list of metadata items that you can associate with the App Runner service resource.
   *
   * A tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-service.html#cfn-apprunner-service-tags)
   * @param tags An optional list of metadata items that you can associate with the App Runner
   * service resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnService {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
