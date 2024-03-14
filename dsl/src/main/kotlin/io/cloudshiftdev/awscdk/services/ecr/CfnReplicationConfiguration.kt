package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * The account ID of the destination registry.
   */
  public open fun attrRegistryId(): String = unwrap(this).getAttrRegistryId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The replication configuration for a registry.
   */
  public open fun replicationConfiguration(): Any = unwrap(this).getReplicationConfiguration()

  /**
   * The replication configuration for a registry.
   */
  public open fun replicationConfiguration(`value`: IResolvable) {
    unwrap(this).setReplicationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The replication configuration for a registry.
   */
  public open fun replicationConfiguration(`value`: ReplicationConfigurationProperty) {
    unwrap(this).setReplicationConfiguration(`value`.let(ReplicationConfigurationProperty::unwrap))
  }

  /**
   * The replication configuration for a registry.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02288237ee295614885b02735c8f2966f5ac0129e33cf93c4231df2e599877c9")
  public open
      fun replicationConfiguration(`value`: ReplicationConfigurationProperty.Builder.() -> Unit):
      Unit = replicationConfiguration(ReplicationConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnReplicationConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    public fun replicationConfiguration(replicationConfiguration: IResolvable)

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    public fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty)

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
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

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    override fun replicationConfiguration(replicationConfiguration: IResolvable) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty) {
      cdkBuilder.replicationConfiguration(replicationConfiguration.let(ReplicationConfigurationProperty::unwrap))
    }

    /**
     * The replication configuration for a registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration)
     * @param replicationConfiguration The replication configuration for a registry. 
     */
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
    /**
     * The Region to replicate to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html#cfn-ecr-replicationconfiguration-replicationdestination-region)
     */
    public fun region(): String

    /**
     * The AWS account ID of the Amazon ECR private registry to replicate to.
     *
     * When configuring cross-Region replication within your own registry, specify your own account
     * ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html#cfn-ecr-replicationconfiguration-replicationdestination-registryid)
     */
    public fun registryId(): String

    /**
     * A builder for [ReplicationDestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param region The Region to replicate to. 
       */
      public fun region(region: String)

      /**
       * @param registryId The AWS account ID of the Amazon ECR private registry to replicate to. 
       * When configuring cross-Region replication within your own registry, specify your own
       * account ID.
       */
      public fun registryId(registryId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty.builder()

      /**
       * @param region The Region to replicate to. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      /**
       * @param registryId The AWS account ID of the Amazon ECR private registry to replicate to. 
       * When configuring cross-Region replication within your own registry, specify your own
       * account ID.
       */
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
      /**
       * The Region to replicate to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html#cfn-ecr-replicationconfiguration-replicationdestination-region)
       */
      override fun region(): String = unwrap(this).getRegion()

      /**
       * The AWS account ID of the Amazon ECR private registry to replicate to.
       *
       * When configuring cross-Region replication within your own registry, specify your own
       * account ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html#cfn-ecr-replicationconfiguration-replicationdestination-registryid)
       */
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
    /**
     * An array of objects representing the replication destinations and repository filters for a
     * replication configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [ReplicationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty.builder()

      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules An array of objects representing the replication destinations and repository
       * filters for a replication configuration. 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty,
    ) : ReplicationConfigurationProperty {
      /**
       * An array of objects representing the replication destinations and repository filters for a
       * replication configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration-rules)
       */
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
    /**
     * An array of objects representing the destination for a replication rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html#cfn-ecr-replicationconfiguration-replicationrule-destinations)
     */
    public fun destinations(): Any

    /**
     * An array of objects representing the filters for a replication rule.
     *
     * Specifying a repository filter for a replication rule provides a method for controlling which
     * repositories in a private registry are replicated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html#cfn-ecr-replicationconfiguration-replicationrule-repositoryfilters)
     */
    public fun repositoryFilters(): Any? = unwrap(this).getRepositoryFilters()

    /**
     * A builder for [ReplicationRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
      public fun repositoryFilters(repositoryFilters: IResolvable)

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
      public fun repositoryFilters(repositoryFilters: List<Any>)

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
      public fun repositoryFilters(vararg repositoryFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty.builder()

      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      /**
       * @param destinations An array of objects representing the destination for a replication
       * rule. 
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
      override fun repositoryFilters(repositoryFilters: IResolvable) {
        cdkBuilder.repositoryFilters(repositoryFilters.let(IResolvable::unwrap))
      }

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
      override fun repositoryFilters(repositoryFilters: List<Any>) {
        cdkBuilder.repositoryFilters(repositoryFilters)
      }

      /**
       * @param repositoryFilters An array of objects representing the filters for a replication
       * rule.
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       */
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
      /**
       * An array of objects representing the destination for a replication rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html#cfn-ecr-replicationconfiguration-replicationrule-destinations)
       */
      override fun destinations(): Any = unwrap(this).getDestinations()

      /**
       * An array of objects representing the filters for a replication rule.
       *
       * Specifying a repository filter for a replication rule provides a method for controlling
       * which repositories in a private registry are replicated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html#cfn-ecr-replicationconfiguration-replicationrule-repositoryfilters)
       */
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
    /**
     * The repository filter details.
     *
     * When the `PREFIX_MATCH` filter type is specified, this value is required and should be the
     * repository name prefix to configure replication for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html#cfn-ecr-replicationconfiguration-repositoryfilter-filter)
     */
    public fun filter(): String

    /**
     * The repository filter type.
     *
     * The only supported value is `PREFIX_MATCH` , which is a repository name prefix specified with
     * the `filter` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html#cfn-ecr-replicationconfiguration-repositoryfilter-filtertype)
     */
    public fun filterType(): String

    /**
     * A builder for [RepositoryFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filter The repository filter details. 
       * When the `PREFIX_MATCH` filter type is specified, this value is required and should be the
       * repository name prefix to configure replication for.
       */
      public fun filter(filter: String)

      /**
       * @param filterType The repository filter type. 
       * The only supported value is `PREFIX_MATCH` , which is a repository name prefix specified
       * with the `filter` parameter.
       */
      public fun filterType(filterType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty.builder()

      /**
       * @param filter The repository filter details. 
       * When the `PREFIX_MATCH` filter type is specified, this value is required and should be the
       * repository name prefix to configure replication for.
       */
      override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      /**
       * @param filterType The repository filter type. 
       * The only supported value is `PREFIX_MATCH` , which is a repository name prefix specified
       * with the `filter` parameter.
       */
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
      /**
       * The repository filter details.
       *
       * When the `PREFIX_MATCH` filter type is specified, this value is required and should be the
       * repository name prefix to configure replication for.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html#cfn-ecr-replicationconfiguration-repositoryfilter-filter)
       */
      override fun filter(): String = unwrap(this).getFilter()

      /**
       * The repository filter type.
       *
       * The only supported value is `PREFIX_MATCH` , which is a repository name prefix specified
       * with the `filter` parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html#cfn-ecr-replicationconfiguration-repositoryfilter-filtertype)
       */
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
