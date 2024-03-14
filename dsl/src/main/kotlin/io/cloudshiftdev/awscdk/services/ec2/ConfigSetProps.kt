package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface ConfigSetProps {
  public fun configSets(): Map<String, List<String>>

  public fun configs(): Map<String, InitConfig>

  public interface Builder {
    public fun configSets(configSets: Map<String, List<String>>)

    public fun configs(configs: Map<String, InitConfig>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConfigSetProps.Builder =
        software.amazon.awscdk.services.ec2.ConfigSetProps.builder()

    override fun configSets(configSets: Map<String, List<String>>) {
      cdkBuilder.configSets(configSets)
    }

    override fun configs(configs: Map<String, InitConfig>) {
      cdkBuilder.configs(configs.mapValues{InitConfig.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConfigSetProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps,
  ) : ConfigSetProps {
    override fun configSets(): Map<String, List<String>> = unwrap(this).getConfigSets() ?:
        emptyMap()

    override fun configs(): Map<String, InitConfig> =
        unwrap(this).getConfigs().mapValues{InitConfig.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConfigSetProps): ConfigSetProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigSetProps): software.amazon.awscdk.services.ec2.ConfigSetProps
        = (wrapped as Wrapper).cdkObject
  }
}
