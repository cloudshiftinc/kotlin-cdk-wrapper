@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnAliasProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun routingStrategy(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun routingStrategy(routingStrategy: IResolvable)

    public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bf9d49be72354e74e2571d314f327249134c546d35618838ab0070e15d0e606")
    public fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnAliasProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnAliasProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun routingStrategy(routingStrategy: IResolvable) {
      cdkBuilder.routingStrategy(routingStrategy.let(IResolvable::unwrap))
    }

    override fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty) {
      cdkBuilder.routingStrategy(routingStrategy.let(CfnAlias.RoutingStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bf9d49be72354e74e2571d314f327249134c546d35618838ab0070e15d0e606")
    override
        fun routingStrategy(routingStrategy: CfnAlias.RoutingStrategyProperty.Builder.() -> Unit):
        Unit = routingStrategy(CfnAlias.RoutingStrategyProperty(routingStrategy))

    public fun build(): software.amazon.awscdk.services.gamelift.CfnAliasProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.gamelift.CfnAliasProps,
  ) : CdkObject(cdkObject), CfnAliasProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

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
