@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnClusterCapacityProviderAssociations`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnClusterCapacityProviderAssociationsProps cfnClusterCapacityProviderAssociationsProps =
 * CfnClusterCapacityProviderAssociationsProps.builder()
 * .capacityProviders(List.of("capacityProviders"))
 * .cluster("cluster")
 * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html)
 */
public interface CfnClusterCapacityProviderAssociationsProps {
  /**
   * The capacity providers to associate with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
   */
  public fun capacityProviders(): List<String>

  /**
   * The cluster the capacity provider association is the target of.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-cluster)
   */
  public fun cluster(): String

  /**
   * The default capacity provider strategy to associate with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
   */
  public fun defaultCapacityProviderStrategy(): Any

  /**
   * A builder for [CfnClusterCapacityProviderAssociationsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    public fun capacityProviders(capacityProviders: List<String>)

    /**
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    public fun capacityProviders(vararg capacityProviders: String)

    /**
     * @param cluster The cluster the capacity provider association is the target of. 
     */
    public fun cluster(cluster: String)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps.Builder =
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps.builder()

    /**
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    /**
     * @param capacityProviders The capacity providers to associate with the cluster. 
     */
    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    /**
     * @param cluster The cluster the capacity provider association is the target of. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy to associate
     * with the cluster. 
     */
    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    public fun build():
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps,
  ) : CdkObject(cdkObject), CfnClusterCapacityProviderAssociationsProps {
    /**
     * The capacity providers to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-capacityproviders)
     */
    override fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders()

    /**
     * The cluster the capacity provider association is the target of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-cluster)
     */
    override fun cluster(): String = unwrap(this).getCluster()

    /**
     * The default capacity provider strategy to associate with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-clustercapacityproviderassociations.html#cfn-ecs-clustercapacityproviderassociations-defaultcapacityproviderstrategy)
     */
    override fun defaultCapacityProviderStrategy(): Any =
        unwrap(this).getDefaultCapacityProviderStrategy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnClusterCapacityProviderAssociationsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps):
        CfnClusterCapacityProviderAssociationsProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnClusterCapacityProviderAssociationsProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterCapacityProviderAssociationsProps):
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps
  }
}
