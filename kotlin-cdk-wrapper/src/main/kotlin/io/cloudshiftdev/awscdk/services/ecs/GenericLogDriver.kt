@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * A log driver that sends logs to the specified driver.
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
public open class GenericLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriver,
) : LogDriver(cdkObject) {
  public constructor(props: GenericLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.GenericLogDriver(props.let(GenericLogDriverProps::unwrap))
  )

  public constructor(props: GenericLogDriverProps.Builder.() -> Unit) :
      this(GenericLogDriverProps(props)
  )

  /**
   * Called when the log driver is configured on a container.
   *
   * @param _scope 
   * @param _containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.GenericLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param logDriver The log driver to use for the container. 
     */
    public fun logDriver(logDriver: String)

    /**
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options.
     *
     * @param options The configuration options to send to the log driver. 
     */
    public fun options(options: Map<String, String>)

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - no secret options provided.
     *
     * @param secretOptions The secrets to pass to the log configuration. 
     */
    public fun secretOptions(secretOptions: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GenericLogDriver.Builder =
        software.amazon.awscdk.services.ecs.GenericLogDriver.Builder.create()

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
     *
     * @param logDriver The log driver to use for the container. 
     */
    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    /**
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options.
     *
     * @param options The configuration options to send to the log driver. 
     */
    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - no secret options provided.
     *
     * @param secretOptions The secrets to pass to the log configuration. 
     */
    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.GenericLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GenericLogDriver {
      val builderImpl = BuilderImpl()
      return GenericLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GenericLogDriver):
        GenericLogDriver = GenericLogDriver(cdkObject)

    internal fun unwrap(wrapped: GenericLogDriver):
        software.amazon.awscdk.services.ecs.GenericLogDriver = wrapped.cdkObject
  }
}
