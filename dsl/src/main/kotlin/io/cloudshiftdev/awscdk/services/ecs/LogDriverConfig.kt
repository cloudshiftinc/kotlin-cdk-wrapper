package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LogDriverConfig {
  /**
   * The log driver to use for the container.
   *
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
  public fun logDriver(): String

  /**
   * The configuration options to send to the log driver.
   */
  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  /**
   * The secrets to pass to the log configuration.
   *
   * Default: - No secret options provided.
   */
  public fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
      unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()

  /**
   * A builder for [LogDriverConfig]
   */
  @CdkDslMarker
  public interface Builder {
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
    public fun logDriver(logDriver: String)

    /**
     * @param options The configuration options to send to the log driver.
     */
    public fun options(options: Map<String, String>)

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    public fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>)

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    public fun secretOptions(vararg secretOptions: CfnTaskDefinition.SecretProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LogDriverConfig.Builder =
        software.amazon.awscdk.services.ecs.LogDriverConfig.builder()

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
    override fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>) {
      cdkBuilder.secretOptions(secretOptions.map(CfnTaskDefinition.SecretProperty::unwrap))
    }

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    override fun secretOptions(vararg secretOptions: CfnTaskDefinition.SecretProperty): Unit =
        secretOptions(secretOptions.toList())

    public fun build(): software.amazon.awscdk.services.ecs.LogDriverConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig,
  ) : CdkObject(cdkObject), LogDriverConfig {
    /**
     * The log driver to use for the container.
     *
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
    override fun logDriver(): String = unwrap(this).getLogDriver()

    /**
     * The configuration options to send to the log driver.
     */
    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - No secret options provided.
     */
    override fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
        unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogDriverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig):
        LogDriverConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogDriverConfig):
        software.amazon.awscdk.services.ecs.LogDriverConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.LogDriverConfig
  }
}
