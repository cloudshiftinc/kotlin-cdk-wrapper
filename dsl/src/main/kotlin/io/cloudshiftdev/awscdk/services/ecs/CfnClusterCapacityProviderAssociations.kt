package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterCapacityProviderAssociations internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations,
) : CfnResource(cdkObject), IInspectable {
  public open fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?:
      emptyList()

  public open fun capacityProviders(`value`: List<String>) {
    unwrap(this).setCapacityProviders(`value`)
  }

  public open fun cluster(): String = unwrap(this).getCluster()

  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  public open fun defaultCapacityProviderStrategy(): Any =
      unwrap(this).getDefaultCapacityProviderStrategy()

  public open fun defaultCapacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setDefaultCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  public open fun defaultCapacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaultCapacityProviderStrategy(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun capacityProviders(capacityProviders: List<String>) {
    }

    public fun cluster(cluster: String) {
    }

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
    }

    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder =
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder.create(scope,
        id)

    public override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    public override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    public override
        fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    public override
        fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterCapacityProviderAssociations {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterCapacityProviderAssociations(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations):
        CfnClusterCapacityProviderAssociations = CfnClusterCapacityProviderAssociations(cdkObject)

    internal fun unwrap(wrapped: CfnClusterCapacityProviderAssociations):
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
        wrapped.cdkObject
  }

  public interface CapacityProviderStrategyProperty {
    public fun base(): Number? = unwrap(this).getBase()

    public fun capacityProvider(): String

    public fun weight(): Number? = unwrap(this).getWeight()

    public interface Builder {
      public fun base(base: Number) {
      }

      public fun capacityProvider(capacityProvider: String) {
      }

      public fun weight(weight: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.builder()

      public override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      public override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      public override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty,
    ) : CapacityProviderStrategyProperty {
      public override fun base(): Number? = unwrap(this).getBase()

      public override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      public override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProviderStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty):
          CapacityProviderStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyProperty):
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
