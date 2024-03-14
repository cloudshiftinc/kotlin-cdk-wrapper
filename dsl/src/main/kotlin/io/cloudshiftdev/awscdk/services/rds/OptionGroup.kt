package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class OptionGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rds.OptionGroup,
) : Resource(cdkObject), IOptionGroup {
  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @param configuration 
   */
  public override fun addConfiguration(configuration: OptionConfiguration): Boolean =
      unwrap(this).addConfiguration(configuration.let(OptionConfiguration::unwrap))

  /**
   * Adds a configuration to this OptionGroup.
   *
   * This method is a no-op for an imported OptionGroup.
   *
   * @param configuration 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12b43bc5b68d5862bb4430eddcc0fef9fc36fe009a38b9e972fbd6e89f47a190")
  public override fun addConfiguration(configuration: OptionConfiguration.Builder.() -> Unit):
      Boolean = addConfiguration(OptionConfiguration(configuration))

  /**
   * The connections object for the options.
   */
  public open fun optionConnections(): Map<String, Connections> =
      unwrap(this).getOptionConnections().mapValues{Connections.wrap(it.value)} ?: emptyMap()

  /**
   * The name of the option group.
   */
  public override fun optionGroupName(): String = unwrap(this).getOptionGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.OptionGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(configurations: List<OptionConfiguration>)

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    public fun configurations(vararg configurations: OptionConfiguration)

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     *
     * @param description A description of the option group. 
     */
    public fun description(description: String)

    /**
     * The database engine that this option group is associated with.
     *
     * @param engine The database engine that this option group is associated with. 
     */
    public fun engine(engine: IInstanceEngine)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OptionGroup.Builder =
        software.amazon.awscdk.services.rds.OptionGroup.Builder.create(scope, id)

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(configurations: List<OptionConfiguration>) {
      cdkBuilder.configurations(configurations.map(OptionConfiguration::unwrap))
    }

    /**
     * The configurations for this option group.
     *
     * @param configurations The configurations for this option group. 
     */
    override fun configurations(vararg configurations: OptionConfiguration): Unit =
        configurations(configurations.toList())

    /**
     * A description of the option group.
     *
     * Default: a CDK generated description
     *
     * @param description A description of the option group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The database engine that this option group is associated with.
     *
     * @param engine The database engine that this option group is associated with. 
     */
    override fun engine(engine: IInstanceEngine) {
      cdkBuilder.engine(engine.let(IInstanceEngine::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OptionGroup = cdkBuilder.build()
  }

  public companion object {
    public fun fromOptionGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      optionGroupName: String,
    ): IOptionGroup =
        software.amazon.awscdk.services.rds.OptionGroup.fromOptionGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, optionGroupName).let(IOptionGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): OptionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return OptionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OptionGroup): OptionGroup =
        OptionGroup(cdkObject)

    internal fun unwrap(wrapped: OptionGroup): software.amazon.awscdk.services.rds.OptionGroup =
        wrapped.cdkObject
  }
}
