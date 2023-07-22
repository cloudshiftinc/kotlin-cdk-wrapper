@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import software.amazon.awscdk.services.ecs.LogDriverConfig

@CdkDslMarker
public class LogDriverConfigDsl {
  private val cdkBuilder: LogDriverConfig.Builder = LogDriverConfig.builder()

  private val _secretOptions: MutableList<CfnTaskDefinition.SecretProperty> = mutableListOf()

  /**
   * @param logDriver The log driver to use for the container. 
   * The valid values listed for this parameter are log drivers
   * that the Amazon ECS container agent can communicate with by default.
   *
   * For tasks using the Fargate launch type, the supported log drivers are awslogs, splunk, and
   * awsfirelens.
   * For tasks using the EC2 launch type, the supported log drivers are awslogs, fluentd, gelf,
   * json-file, journald,
   * logentries,syslog, splunk, and awsfirelens.
   *
   * For more information about using the awslogs log driver, see
   * [Using the awslogs Log
   * Driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html)
   * in the Amazon Elastic Container Service Developer Guide.
   *
   * For more information about using the awsfirelens log driver, see
   * [Custom Log
   * Routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html)
   * in the Amazon Elastic Container Service Developer Guide.
   */
  public fun logDriver(logDriver: String) {
    cdkBuilder.logDriver(logDriver)
  }

  /**
   * @param options The configuration options to send to the log driver.
   */
  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   */
  public fun secretOptions(secretOptions: CfnTaskDefinitionSecretPropertyDsl.() -> Unit) {
    _secretOptions.add(CfnTaskDefinitionSecretPropertyDsl().apply(secretOptions).build())
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   */
  public fun secretOptions(secretOptions: Collection<CfnTaskDefinition.SecretProperty>) {
    _secretOptions.addAll(secretOptions)
  }

  public fun build(): LogDriverConfig {
    if(_secretOptions.isNotEmpty()) cdkBuilder.secretOptions(_secretOptions)
    return cdkBuilder.build()
  }
}
