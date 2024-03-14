package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterCapacityProviderAssociations internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders()

  /**
   * The capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(`value`: List<String>) {
    unwrap(this).setCapacityProviders(`value`)
  }

  /**
   * The capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(vararg `value`: String): Unit =
      capacityProviders(`value`.toList())

  /**
   * The cluster the capacity provider association is the target of.
   */
  public open fun cluster(): String = unwrap(this).getCluster()

  /**
   * The cluster the capacity provider association is the target of.
   */
  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  /**
   * The default capacity provider strategy to associate with the cluster.
   */
  public open fun defaultCapacityProviderStrategy(): Any =
      unwrap(this).getDefaultCapacityProviderStrategy()

  /**
   * The default capacity provider strategy to associate with the cluster.
   */
  public open fun defaultCapacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setDefaultCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default capacity provider strategy to associate with the cluster.
   */
  public open fun defaultCapacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaultCapacityProviderStrategy(__idx_ac66f0)
  }

  /**
   * The default capacity provider strategy to associate with the cluster.
   */
  public open fun defaultCapacityProviderStrategy(vararg __idx_ac66f0: Any): Unit =
      defaultCapacityProviderStrategy(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ecs.CfnClusterCapacityProviderAssociations].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    public fun capacityProviders(capacityProviders: List<String>)

    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    public fun capacityProviders(vararg capacityProviders: String)

    /**
     * The cluster the capacity provider association is the target of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-cluster)
     * @param cluster The cluster the capacity provider association is the target of. 
     */
    public fun cluster(cluster: String)

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder =
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.Builder.create(scope,
        id)

    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    /**
     * The cluster the capacity provider association is the target of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-cluster)
     * @param cluster The cluster the capacity provider association is the target of. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CFN_RESOURCE_TYPE_NAME

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
    /**
     * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
     * value is specified, the default value of `0` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-capacityprovider)
     */
    public fun capacityProvider(): String

    /**
     * The *weight* value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The `weight` value is taken into consideration after the `base` value, if defined, is
     * satisfied.
     *
     * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity
     * providers must have a weight value greater than zero and any capacity providers with a weight of
     * `0` will not be used to place tasks. If you specify multiple capacity providers in a strategy
     * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
     * provider strategy will fail.
     *
     * An example scenario for using weights is defining a strategy that contains two capacity
     * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
     * split evenly across the two capacity providers. Using that same logic, if you specify a weight
     * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every one
     * task that is run using *capacityProviderA* , four tasks would use *capacityProviderB* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` will not be used to place tasks. If you specify multiple capacity providers in a
       * strategy that all have a weight of `0` , any `RunTask` or `CreateService` actions using the
       * capacity provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that is run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty.builder()

      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` will not be used to place tasks. If you specify multiple capacity providers in a
       * strategy that all have a weight of `0` , any `RunTask` or `CreateService` actions using the
       * capacity provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that is run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyProperty {
      /**
       * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-capacityprovider)
       */
      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      /**
       * The *weight* value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` will not be used to place tasks. If you specify multiple capacity providers in a
       * strategy that all have a weight of `0` , any `RunTask` or `CreateService` actions using the
       * capacity provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that is run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-clustercapacityproviderassociations-capacityproviderstrategy.html#cfn-ecs-clustercapacityproviderassociations-capacityproviderstrategy-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CapacityProviderStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty):
          CapacityProviderStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyProperty):
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociations.CapacityProviderStrategyProperty
    }
  }
}
