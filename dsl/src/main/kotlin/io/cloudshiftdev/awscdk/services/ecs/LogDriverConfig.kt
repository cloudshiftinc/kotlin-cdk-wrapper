package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LogDriverConfig {
  public fun logDriver(): String

  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  public fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
      unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()

  public interface Builder {
    public fun logDriver(logDriver: String)

    public fun options(options: Map<String, String>)

    public fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LogDriverConfig.Builder =
        software.amazon.awscdk.services.ecs.LogDriverConfig.builder()

    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    override fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>) {
      cdkBuilder.secretOptions(secretOptions.map(CfnTaskDefinition.SecretProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.LogDriverConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig,
  ) : LogDriverConfig {
    override fun logDriver(): String = unwrap(this).getLogDriver()

    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    override fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
        unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LogDriverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig):
        LogDriverConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogDriverConfig):
        software.amazon.awscdk.services.ecs.LogDriverConfig = (wrapped as Wrapper).cdkObject
  }
}
