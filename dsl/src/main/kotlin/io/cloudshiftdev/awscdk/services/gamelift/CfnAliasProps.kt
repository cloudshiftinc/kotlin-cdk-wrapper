package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAliasProps {
  /**
   * A human-readable description of the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A descriptive label that is associated with an alias.
   *
   * Alias names do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
   */
  public fun name(): String

  /**
   * The routing configuration, including routing type and fleet target, for the alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
   */
  public fun routingStrategy(): Any

  /**
   * A builder for [CfnAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A human-readable description of the alias.
     */
    public fun description(description: String)

    /**
     * @param name A descriptive label that is associated with an alias. 
     * Alias names do not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    public fun routingStrategy(routingStrategy: IResolvable)

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty)

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bf9d49be72354e74e2571d314f327249134c546d35618838ab0070e15d0e606")
    public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnAliasProps.builder()

    /**
     * @param description A human-readable description of the alias.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A descriptive label that is associated with an alias. 
     * Alias names do not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    override fun routingStrategy(routingStrategy: IResolvable) {
      cdkBuilder.routingStrategy(routingStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    override fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
      cdkBuilder.routingStrategy(routingStrategy.let(CfnAlias.RoutingStrategyProperty::unwrap))
    }

    /**
     * @param routingStrategy The routing configuration, including routing type and fleet target,
     * for the alias. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bf9d49be72354e74e2571d314f327249134c546d35618838ab0070e15d0e606")
    override
        fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty.Builder.() -> Unit):
        Unit = routingStrategy(CfnAlias.RoutingStrategyProperty(routingStrategy))

    public fun build(): software.amazon.awscdk.services.gamelift.CfnAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    /**
     * A human-readable description of the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A descriptive label that is associated with an alias.
     *
     * Alias names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The routing configuration, including routing type and fleet target, for the alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-alias.html#cfn-gamelift-alias-routingstrategy)
     */
    override fun routingStrategy(): Any = unwrap(this).getRoutingStrategy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnAliasProps):
        CfnAliasProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAliasProps):
        software.amazon.awscdk.services.gamelift.CfnAliasProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnAliasProps
  }
}
