@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * The configuration to use when creating a log driver.
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(GenericLogDriver.Builder.create()
 * .logDriver("fluentd")
 * .options(Map.of(
 * "tag", "example-tag"))
 * .build())
 * .build());
 * ```
 */
public interface GenericLogDriverProps {
  /**
   * The log driver to use for the container.
   *
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
  public fun logDriver(): String

  /**
   * The configuration options to send to the log driver.
   *
   * Default: - the log driver options.
   */
  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  /**
   * The secrets to pass to the log configuration.
   *
   * Default: - no secret options provided.
   */
  public fun secretOptions(): Map<String, Secret> =
      unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [GenericLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun logDriver(logDriver: String)

    /**
     * @param options The configuration options to send to the log driver.
     */
    public fun options(options: Map<String, String>)

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    public fun secretOptions(secretOptions: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GenericLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.GenericLogDriverProps.builder()

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
    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    /**
     * @param options The configuration options to send to the log driver.
     */
    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.GenericLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriverProps,
  ) : CdkObject(cdkObject), GenericLogDriverProps {
    /**
     * The log driver to use for the container.
     *
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
    override fun logDriver(): String = unwrap(this).getLogDriver()

    /**
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options.
     */
    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - no secret options provided.
     */
    override fun secretOptions(): Map<String, Secret> =
        unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriverProps):
        GenericLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as? GenericLogDriverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GenericLogDriverProps):
        software.amazon.awscdk.services.ecs.GenericLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.GenericLogDriverProps
  }
}
