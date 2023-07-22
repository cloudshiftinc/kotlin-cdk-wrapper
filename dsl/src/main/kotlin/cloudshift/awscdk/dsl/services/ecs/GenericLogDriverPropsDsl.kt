@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.GenericLogDriverProps
import software.amazon.awscdk.services.ecs.Secret

@CdkDslMarker
public class GenericLogDriverPropsDsl {
  private val cdkBuilder: GenericLogDriverProps.Builder = GenericLogDriverProps.builder()

  /**
   * @param logDriver The log driver to use for the container. 
   * The valid values listed for this parameter are log drivers
   * that the Amazon ECS container agent can communicate with by default.
   *
   * For tasks using the Fargate launch type, the supported log drivers are awslogs and splunk.
   * For tasks using the EC2 launch type, the supported log drivers are awslogs, syslog, gelf,
   * fluentd, splunk, journald, and json-file.
   *
   * For more information about using the awslogs log driver, see
   * [Using the awslogs Log
   * Driver](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_awslogs.html)
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
  public fun secretOptions(secretOptions: Map<String, Secret>) {
    cdkBuilder.secretOptions(secretOptions)
  }

  public fun build(): GenericLogDriverProps = cdkBuilder.build()
}
