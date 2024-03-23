@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ECR::ReplicationConfiguration` resource creates or updates the replication
 * configuration for a private registry.
 *
 * The first time a replication configuration is applied to a private registry, a service-linked IAM
 * role is created in your account for the replication process. For more information, see [Using
 * Service-Linked Roles for Amazon
 * ECR](https://docs.aws.amazon.com/AmazonECR/latest/userguide/using-service-linked-roles.html) in the
 * *Amazon Elastic Container Registry User Guide* .
 *
 *
 * When configuring cross-account replication, the destination account must grant the source account
 * permission to replicate. This permission is controlled using a private registry permissions policy.
 * For more information, see `AWS::ECR::RegistryPolicy` .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnReplicationConfiguration cfnReplicationConfiguration =
 * CfnReplicationConfiguration.Builder.create(this, "MyCfnReplicationConfiguration")
 * .replicationConfiguration(ReplicationConfigurationProperty.builder()
 * .rules(List.of(ReplicationRuleProperty.builder()
 * .destinations(List.of(ReplicationDestinationProperty.builder()
 * .region("region")
 * .registryId("registryId")
 * .build()))
 * // the properties below are optional
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
 */
public open class CfnReplicationConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnReplicationConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReplicationConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReplicationConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReplicationConfigurationProps(props)
  )

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("762bbc6d209327be38da800159550f0200c9dcc39614a4bfd99efa2d329edc0b")
    override
        fun replicationConfiguration(replicationConfiguration: ReplicationConfigurationProperty.Builder.() -> Unit):
        Unit = replicationConfiguration(ReplicationConfigurationProperty(replicationConfiguration))

    public fun build(): software.amazon.awscdk.services.ecr.CfnReplicationConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.CFN_RESOURCE_TYPE_NAME

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

  /**
   * The replication configuration for a registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * ReplicationConfigurationProperty replicationConfigurationProperty =
   * ReplicationConfigurationProperty.builder()
   * .rules(List.of(ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html)
   */
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty,
    ) : CdkObject(cdkObject), ReplicationConfigurationProperty {
      /**
       * An array of objects representing the replication destinations and repository filters for a
       * replication configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html#cfn-ecr-replicationconfiguration-replicationconfiguration-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty):
          ReplicationConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationConfigurationProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationConfigurationProperty
    }
  }

  /**
   * An array of objects representing the destination for a replication rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * ReplicationDestinationProperty replicationDestinationProperty =
   * ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html)
   */
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty,
    ) : CdkObject(cdkObject), ReplicationDestinationProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty):
          ReplicationDestinationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicationDestinationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationDestinationProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationDestinationProperty
    }
  }

  /**
   * An array of objects representing the replication destinations and repository filters for a
   * replication configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * ReplicationRuleProperty replicationRuleProperty = ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html)
   */
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty,
    ) : CdkObject(cdkObject), ReplicationRuleProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicationRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty):
          ReplicationRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ReplicationRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicationRuleProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.ReplicationRuleProperty
    }
  }

  /**
   * The filter settings used with image replication.
   *
   * Specifying a repository filter to a replication rule provides a method for controlling which
   * repositories in a private registry are replicated. If no filters are added, the contents of all
   * repositories are replicated.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * RepositoryFilterProperty repositoryFilterProperty = RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html)
   */
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

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty,
    ) : CdkObject(cdkObject), RepositoryFilterProperty {
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
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty):
          RepositoryFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? RepositoryFilterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryFilterProperty):
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnReplicationConfiguration.RepositoryFilterProperty
    }
  }
}
