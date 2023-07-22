@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionFirelensConfigurationPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.FirelensConfigurationProperty.Builder =
      CfnTaskDefinition.FirelensConfigurationProperty.builder()

  /**
   * @param options The options to use when configuring the log router.
   * This field is optional and can be used to add additional metadata, such as the task, task
   * definition, cluster, and container instance details to the log event.
   *
   * If specified, valid option keys are:
   *
   * * `enable-ecs-log-metadata` , which can be `true` or `false`
   * * `config-file-type` , which can be `s3` or `file`
   * * `config-file-value` , which is either an S3 ARN or a file path
   */
  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  /**
   * @param options The options to use when configuring the log router.
   * This field is optional and can be used to add additional metadata, such as the task, task
   * definition, cluster, and container instance details to the log event.
   *
   * If specified, valid option keys are:
   *
   * * `enable-ecs-log-metadata` , which can be `true` or `false`
   * * `config-file-type` , which can be `s3` or `file`
   * * `config-file-value` , which is either an S3 ARN or a file path
   */
  public fun options(options: IResolvable) {
    cdkBuilder.options(options)
  }

  /**
   * @param type The log router to use.
   * The valid values are `fluentd` or `fluentbit` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnTaskDefinition.FirelensConfigurationProperty = cdkBuilder.build()
}
