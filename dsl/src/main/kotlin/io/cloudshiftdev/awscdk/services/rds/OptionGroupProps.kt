package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface OptionGroupProps {
  /**
   * The configurations for this option group.
   */
  public fun configurations(): List<OptionConfiguration>

  /**
   * A description of the option group.
   *
   * Default: a CDK generated description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The database engine that this option group is associated with.
   */
  public fun engine(): IInstanceEngine

  /**
   * A builder for [OptionGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(configurations: List<OptionConfiguration>)

    /**
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(vararg configurations: OptionConfiguration)

    /**
     * @param description A description of the option group.
     */
    public fun description(description: String)

    /**
     * @param engine The database engine that this option group is associated with. 
     */
    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroupProps.Builder =
        software.amazon.awscdk.services.rds.OptionGroupProps.builder()

    /**
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    /**
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(vararg configurations: OptionConfiguration): Unit =
        configurations(configurations.toList())

    /**
     * @param description A description of the option group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engine The database engine that this option group is associated with. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OptionGroupProps,
  ) : CdkObject(cdkObject), OptionGroupProps {
    /**
     * The configurations for this option group.
     */
    override fun configurations(): List<OptionConfiguration> =
        unwrap(this).getConfigurations().map(OptionConfiguration::wrap)

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The database engine that this option group is associated with.
     */
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
