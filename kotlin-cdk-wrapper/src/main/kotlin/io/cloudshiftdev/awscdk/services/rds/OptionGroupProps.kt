@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface OptionGroupProps {
  public fun configurations(): List<OptionConfiguration>

  public fun description(): String? = unwrap(this).getDescription()

  public fun engine(): IInstanceEngine

  @CdkDslMarker
  public interface Builder {
    public fun configurations(configurations: List<OptionConfiguration>)

    public fun configurations(vararg configurations: OptionConfiguration)

    public fun description(description: String)

    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroupProps.Builder =
        software.amazon.awscdk.services.rds.OptionGroupProps.builder()

    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    override fun configurations(vararg configurations: OptionConfiguration): Unit =
        configurations(configurations.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OptionGroupProps,
  ) : CdkObject(cdkObject), OptionGroupProps {
    override fun configurations(): List<OptionConfiguration> =
        unwrap(this).getConfigurations().map(OptionConfiguration::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun engine(): IInstanceEngine = unwrap(this).getEngine().let(IInstanceEngine::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OptionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionGroupProps):
        OptionGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OptionGroupProps):
        software.amazon.awscdk.services.rds.OptionGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.OptionGroupProps
  }
}
