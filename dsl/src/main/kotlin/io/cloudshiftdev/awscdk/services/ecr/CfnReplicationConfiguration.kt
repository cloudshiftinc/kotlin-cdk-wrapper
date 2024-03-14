package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrRegistryId(): String = unwrap(this).getAttrRegistryId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun replicationConfiguration(): Any = unwrap(this).getReplicationConfiguration()

  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02288237ee295614885b02735c8f2966f5ac0129e33cf93c4231df2e599877c9")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  public interface Builder {
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762bbc6d209327be38da800159550f0200c9dcc39614a4bfd99efa2d329edc0b")
    public
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.Builder
        = software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.Builder.create(scope, id)

    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762bbc6d209327be38da800159550f0200c9dcc39614a4bfd99efa2d329edc0b")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    public fun build(): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration):
        CfnReplicationConfiguration = CfnReplicationConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfiguration):
        software.amazon.awscdk.services.ecr.CfnReplicationConfiguration = wrapped.cdkObject
  }

  public interface ReplicationDestinationProperty {
    public fun region(): String

    public fun registryId(): String

    public interface Builder {
      public fun region(region: String)

      public fun registryId(registryId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.builder()

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun registryId(registryId: String) {
        cdkBuilder.registryId(registryId)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty,
    ) : ReplicationDestinationProperty {
      override fun region(): String = unwrap(this).getRegion()

      override fun registryId(): String = unwrap(this).getRegistryId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty):
          ReplicationDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationDestinationProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicationConfigurationProperty {
    public fun rules(): Any

    public interface Builder {
      public fun rules(rules: IResolvable)

      public fun rules(rules: List<Any>)

      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty.builder()

      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty,
    ) : ReplicationConfigurationProperty {
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ReplicationRuleProperty {
    public fun destinations(): Any

    public fun repositoryFilters(): Any? = unwrap(this).getRepositoryFilters()

    public interface Builder {
      public fun destinations(destinations: IResolvable)

      public fun destinations(destinations: List<Any>)

      public fun destinations(vararg destinations: Any)

      public fun repositoryFilters(repositoryFilters: IResolvable)

      public fun repositoryFilters(repositoryFilters: List<Any>)

      public fun repositoryFilters(vararg repositoryFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty.builder()

      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      override fun repositoryFilters(repositoryFilters: IResolvable) {
        cdkBuilder.repositoryFilters(repositoryFilters.let(IResolvable::unwrap))
      }

      override fun repositoryFilters(repositoryFilters: List<Any>) {
        cdkBuilder.repositoryFilters(repositoryFilters)
      }

      override fun repositoryFilters(vararg repositoryFilters: Any): Unit =
          repositoryFilters(repositoryFilters.toList())

      public fun build():
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty,
    ) : ReplicationRuleProperty {
      override fun destinations(): Any = unwrap(this).getDestinations()

      override fun repositoryFilters(): Any? = unwrap(this).getRepositoryFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty):
          ReplicationRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRuleProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RepositoryFilterProperty {
    public fun filter(): String

    public fun filterType(): String

    public interface Builder {
      public fun filter(filter: String)

      public fun filterType(filterType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.builder()

      override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty,
    ) : RepositoryFilterProperty {
      override fun filter(): String = unwrap(this).getFilter()

      override fun filterType(): String = unwrap(this).getFilterType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty):
          RepositoryFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryFilterProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
