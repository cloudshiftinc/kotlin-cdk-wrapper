@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionLogConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.LogConfigurationProperty.Builder =
      CfnTaskDefinition.LogConfigurationProperty.builder()

  private val _secretOptions: MutableList<Any> = mutableListOf()

  /**
   * @param logDriver The log driver to use for the container. 
   * For tasks on AWS Fargate , the supported log drivers are `awslogs` , `splunk` , and
   * `awsfirelens` .
   *
   * For tasks hosted on Amazon EC2 instances, the supported log drivers are `awslogs` , `fluentd` ,
   * `gelf` , `json-file` , `journald` , `logentries` , `syslog` , `splunk` , and `awsfirelens` .
   *
   * For more information about using the `awslogs` log driver, see [Using the awslogs log
   * driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * For more information about using the `awsfirelens` log driver, see [Custom log
   * routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   *
   * If you have a custom driver that isn't listed, you can fork the Amazon ECS container agent
   * project that's [available on
   * GitHub](https://docs.aws.amazon.com/https://github.com/aws/amazon-ecs-agent) and customize it to
   * work with that driver. We encourage you to submit pull requests for changes that you would like to
   * have included. However, we don't currently provide support for running modified copies of this
   * software.
   */
  public fun logDriver(logDriver: String) {
    cdkBuilder.logDriver(logDriver)
  }

  /**
   * @param options The configuration options to send to the log driver.
   * This parameter requires version 1.19 of the Docker Remote API or greater on your container
   * instance. To check the Docker Remote API version on your container instance, log in to your
   * container instance and run the following command: `sudo docker version --format
   * '{{.Server.APIVersion}}'`
   */
  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  /**
   * @param options The configuration options to send to the log driver.
   * This parameter requires version 1.19 of the Docker Remote API or greater on your container
   * instance. To check the Docker Remote API version on your container instance, log in to your
   * container instance and run the following command: `sudo docker version --format
   * '{{.Server.APIVersion}}'`
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun secretOptions(vararg secretOptions: Any) {
    _secretOptions.addAll(listOf(*secretOptions))
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun secretOptions(secretOptions: Collection<Any>) {
    _secretOptions.addAll(secretOptions)
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   * For more information, see [Specifying sensitive
   * data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun secretOptions(secretOptions: IResolvable) {
    cdkBuilder.secretOptions(secretOptions)
  }

  public fun build(): CfnTaskDefinition.LogConfigurationProperty {
    if(_secretOptions.isNotEmpty()) cdkBuilder.secretOptions(_secretOptions)
    return cdkBuilder.build()
  }
}
