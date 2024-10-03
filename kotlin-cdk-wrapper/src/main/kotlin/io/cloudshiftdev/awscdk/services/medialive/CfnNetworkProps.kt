@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnNetworkProps cfnNetworkProps = CfnNetworkProps.builder()
 * .ipPools(List.of(IpPoolProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .routes(List.of(RouteProperty.builder()
 * .cidr("cidr")
 * .gateway("gateway")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html)
 */
public interface CfnNetworkProps {
  /**
   * The list of IP address cidr pools for the network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
   */
  public fun ipPools(): Any

  /**
   * The user-specified name of the Network to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-name)
   */
  public fun name(): String

  /**
   * The routes for the network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
   */
  public fun routes(): Any? = unwrap(this).getRoutes()

  /**
   * A collection of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnNetworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(ipPools: IResolvable)

    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(ipPools: List<Any>)

    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(vararg ipPools: Any)

    /**
     * @param name The user-specified name of the Network to be created. 
     */
    public fun name(name: String)

    /**
     * @param routes The routes for the network.
     */
    public fun routes(routes: IResolvable)

    /**
     * @param routes The routes for the network.
     */
    public fun routes(routes: List<Any>)

    /**
     * @param routes The routes for the network.
     */
    public fun routes(vararg routes: Any)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnNetworkProps.Builder =
        software.amazon.awscdk.services.medialive.CfnNetworkProps.builder()

    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(ipPools: IResolvable) {
      cdkBuilder.ipPools(ipPools.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(ipPools: List<Any>) {
      cdkBuilder.ipPools(ipPools.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(vararg ipPools: Any): Unit = ipPools(ipPools.toList())

    /**
     * @param name The user-specified name of the Network to be created. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param routes The routes for the network.
     */
    override fun routes(routes: IResolvable) {
      cdkBuilder.routes(routes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param routes The routes for the network.
     */
    override fun routes(routes: List<Any>) {
      cdkBuilder.routes(routes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param routes The routes for the network.
     */
    override fun routes(vararg routes: Any): Unit = routes(routes.toList())

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnNetworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnNetworkProps,
  ) : CdkObject(cdkObject),
      CfnNetworkProps {
    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     */
    override fun ipPools(): Any = unwrap(this).getIpPools()

    /**
     * The user-specified name of the Network to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     */
    override fun routes(): Any? = unwrap(this).getRoutes()

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnNetworkProps):
        CfnNetworkProps = CdkObjectWrappers.wrap(cdkObject) as? CfnNetworkProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkProps):
        software.amazon.awscdk.services.medialive.CfnNetworkProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnNetworkProps
  }
}
