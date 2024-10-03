@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource schema for AWS::MediaLive::Network.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnNetwork cfnNetwork = CfnNetwork.Builder.create(this, "MyCfnNetwork")
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
public open class CfnNetwork(
  cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnNetworkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNetworkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNetworkProps(props)
  )

  /**
   * The ARN of the Network.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   *
   */
  public open fun attrAssociatedClusterIds(): List<String> =
      unwrap(this).getAttrAssociatedClusterIds()

  /**
   * The unique ID of the Network.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   *
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The list of IP address cidr pools for the network.
   */
  public open fun ipPools(): Any = unwrap(this).getIpPools()

  /**
   * The list of IP address cidr pools for the network.
   */
  public open fun ipPools(`value`: IResolvable) {
    unwrap(this).setIpPools(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The list of IP address cidr pools for the network.
   */
  public open fun ipPools(`value`: List<Any>) {
    unwrap(this).setIpPools(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The list of IP address cidr pools for the network.
   */
  public open fun ipPools(vararg `value`: Any): Unit = ipPools(`value`.toList())

  /**
   * The user-specified name of the Network to be created.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The user-specified name of the Network to be created.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The routes for the network.
   */
  public open fun routes(): Any? = unwrap(this).getRoutes()

  /**
   * The routes for the network.
   */
  public open fun routes(`value`: IResolvable) {
    unwrap(this).setRoutes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The routes for the network.
   */
  public open fun routes(`value`: List<Any>) {
    unwrap(this).setRoutes(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The routes for the network.
   */
  public open fun routes(vararg `value`: Any): Unit = routes(`value`.toList())

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A collection of key-value pairs.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnNetwork].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(ipPools: IResolvable)

    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(ipPools: List<Any>)

    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    public fun ipPools(vararg ipPools: Any)

    /**
     * The user-specified name of the Network to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-name)
     * @param name The user-specified name of the Network to be created. 
     */
    public fun name(name: String)

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    public fun routes(routes: IResolvable)

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    public fun routes(routes: List<Any>)

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    public fun routes(vararg routes: Any)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
     * @param tags A collection of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnNetwork.Builder =
        software.amazon.awscdk.services.medialive.CfnNetwork.Builder.create(scope, id)

    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(ipPools: IResolvable) {
      cdkBuilder.ipPools(ipPools.let(IResolvable.Companion::unwrap))
    }

    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(ipPools: List<Any>) {
      cdkBuilder.ipPools(ipPools.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The list of IP address cidr pools for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-ippools)
     * @param ipPools The list of IP address cidr pools for the network. 
     */
    override fun ipPools(vararg ipPools: Any): Unit = ipPools(ipPools.toList())

    /**
     * The user-specified name of the Network to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-name)
     * @param name The user-specified name of the Network to be created. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    override fun routes(routes: IResolvable) {
      cdkBuilder.routes(routes.let(IResolvable.Companion::unwrap))
    }

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    override fun routes(routes: List<Any>) {
      cdkBuilder.routes(routes.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The routes for the network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-routes)
     * @param routes The routes for the network. 
     */
    override fun routes(vararg routes: Any): Unit = routes(routes.toList())

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-network.html#cfn-medialive-network-tags)
     * @param tags A collection of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnNetwork = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnNetwork.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork): CfnNetwork =
        CfnNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnNetwork): software.amazon.awscdk.services.medialive.CfnNetwork =
        wrapped.cdkObject as software.amazon.awscdk.services.medialive.CfnNetwork
  }

  /**
   * IP address cidr pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * IpPoolProperty ipPoolProperty = IpPoolProperty.builder()
   * .cidr("cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-ippool.html)
   */
  public interface IpPoolProperty {
    /**
     * IP address cidr pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-ippool.html#cfn-medialive-network-ippool-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * A builder for [IpPoolProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr IP address cidr pool.
       */
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty.builder()

      /**
       * @param cidr IP address cidr pool.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty,
    ) : CdkObject(cdkObject),
        IpPoolProperty {
      /**
       * IP address cidr pool.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-ippool.html#cfn-medialive-network-ippool-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpPoolProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty):
          IpPoolProperty = CdkObjectWrappers.wrap(cdkObject) as? IpPoolProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpPoolProperty):
          software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnNetwork.IpPoolProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * RouteProperty routeProperty = RouteProperty.builder()
   * .cidr("cidr")
   * .gateway("gateway")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-route.html)
   */
  public interface RouteProperty {
    /**
     * Ip address cidr.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-route.html#cfn-medialive-network-route-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * IP address for the route packet paths.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-route.html#cfn-medialive-network-route-gateway)
     */
    public fun gateway(): String? = unwrap(this).getGateway()

    /**
     * A builder for [RouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr Ip address cidr.
       */
      public fun cidr(cidr: String)

      /**
       * @param gateway IP address for the route packet paths.
       */
      public fun gateway(gateway: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty.builder()

      /**
       * @param cidr Ip address cidr.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param gateway IP address for the route packet paths.
       */
      override fun gateway(gateway: String) {
        cdkBuilder.gateway(gateway)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty,
    ) : CdkObject(cdkObject),
        RouteProperty {
      /**
       * Ip address cidr.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-route.html#cfn-medialive-network-route-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()

      /**
       * IP address for the route packet paths.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-network-route.html#cfn-medialive-network-route-gateway)
       */
      override fun gateway(): String? = unwrap(this).getGateway()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty):
          RouteProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteProperty):
          software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnNetwork.RouteProperty
    }
  }
}
