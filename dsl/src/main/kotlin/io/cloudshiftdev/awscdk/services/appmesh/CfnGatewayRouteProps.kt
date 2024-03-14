package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGatewayRouteProps {
  /**
   * The name of the gateway route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-gatewayroutename)
   */
  public fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  /**
   * The name of the service mesh that the resource resides in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshname)
   */
  public fun meshName(): String

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with shared
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshowner)
   */
  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The specifications of the gateway route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
   */
  public fun spec(): Any

  /**
   * Optional metadata that you can apply to the gateway route to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The virtual gateway that the gateway route is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-virtualgatewayname)
   */
  public fun virtualGatewayName(): String

  /**
   * A builder for [CfnGatewayRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gatewayRouteName The name of the gateway route.
     */
    public fun gatewayRouteName(gatewayRouteName: String)

    /**
     * @param meshName The name of the service mesh that the resource resides in. 
     */
    public fun meshName(meshName: String)

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    public fun meshOwner(meshOwner: String)

    /**
     * @param spec The specifications of the gateway route. 
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The specifications of the gateway route. 
     */
    public fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty)

    /**
     * @param spec The specifications of the gateway route. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da30807f8dadb75945a17bec105643ee3428cf45f74eda39e826940fb7f993e")
    public fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param virtualGatewayName The virtual gateway that the gateway route is associated with. 
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.builder()

    /**
     * @param gatewayRouteName The name of the gateway route.
     */
    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    /**
     * @param meshName The name of the service mesh that the resource resides in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * @param spec The specifications of the gateway route. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * @param spec The specifications of the gateway route. 
     */
    override fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty) {
      cdkBuilder.spec(spec.let(CfnGatewayRoute.GatewayRouteSpecProperty::unwrap))
    }

    /**
     * @param spec The specifications of the gateway route. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da30807f8dadb75945a17bec105643ee3428cf45f74eda39e826940fb7f993e")
    override fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnGatewayRoute.GatewayRouteSpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the gateway route to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param virtualGatewayName The virtual gateway that the gateway route is associated with. 
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps,
  ) : CdkObject(cdkObject), CfnGatewayRouteProps {
    /**
     * The name of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-gatewayroutename)
     */
    override fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

    /**
     * The name of the service mesh that the resource resides in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshname)
     */
    override fun meshName(): String = unwrap(this).getMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-meshowner)
     */
    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /**
     * The specifications of the gateway route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-spec)
     */
    override fun spec(): Any = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the gateway route to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The virtual gateway that the gateway route is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-gatewayroute.html#cfn-appmesh-gatewayroute-virtualgatewayname)
     */
    override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps):
        CfnGatewayRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRouteProps):
        software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps
  }
}
