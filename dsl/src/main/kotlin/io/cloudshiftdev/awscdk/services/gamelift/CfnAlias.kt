package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAliasId(): String = unwrap(this).getAttrAliasId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun routingStrategy(): Any = unwrap(this).getRoutingStrategy()

  public open fun routingStrategy(`value`: IResolvable) {
    unwrap(this).setRoutingStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun routingStrategy(`value`: RoutingStrategyProperty) {
    unwrap(this).setRoutingStrategy(`value`.let(RoutingStrategyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e386ccad993278a593306b65466fd22101590cb3f712a6640ada5b01ad566510")
  public open fun routingStrategy(`value`: RoutingStrategyProperty.Builder.() -> Unit): Unit =
      routingStrategy(RoutingStrategyProperty(`value`))

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun routingStrategy(routingStrategy: IResolvable)

    public fun routingStrategy(routingStrategy: RoutingStrategyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48db2f8128a66631467a218444363fbda68842721f78cbfaf41860c50d6f2b2b")
    public fun routingStrategy(routingStrategy: RoutingStrategyProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnAlias.Builder =
        software.amazon.awscdk.services.gamelift.CfnAlias.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun routingStrategy(routingStrategy: IResolvable) {
      cdkBuilder.routingStrategy(routingStrategy.let(IResolvable::unwrap))
    }

    override fun routingStrategy(routingStrategy: RoutingStrategyProperty) {
      cdkBuilder.routingStrategy(routingStrategy.let(RoutingStrategyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("48db2f8128a66631467a218444363fbda68842721f78cbfaf41860c50d6f2b2b")
    override fun routingStrategy(routingStrategy: RoutingStrategyProperty.Builder.() -> Unit): Unit
        = routingStrategy(RoutingStrategyProperty(routingStrategy))

    public fun build(): software.amazon.awscdk.services.gamelift.CfnAlias = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias): CfnAlias =
        CfnAlias(cdkObject)

    internal fun unwrap(wrapped: CfnAlias): software.amazon.awscdk.services.gamelift.CfnAlias =
        wrapped.cdkObject
  }

  public interface RoutingStrategyProperty {
    public fun fleetId(): String? = unwrap(this).getFleetId()

    public fun message(): String? = unwrap(this).getMessage()

    public fun type(): String

    public interface Builder {
      public fun fleetId(fleetId: String)

      public fun message(message: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.Builder =
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty.builder()

      override fun fleetId(fleetId: String) {
        cdkBuilder.fleetId(fleetId)
      }

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty,
    ) : RoutingStrategyProperty {
      override fun fleetId(): String? = unwrap(this).getFleetId()

      override fun message(): String? = unwrap(this).getMessage()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoutingStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty):
          RoutingStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoutingStrategyProperty):
          software.amazon.awscdk.services.gamelift.CfnAlias.RoutingStrategyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
