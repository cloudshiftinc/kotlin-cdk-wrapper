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

public interface CfnVirtualGatewayProps {
  /**
   * The name of the service mesh that the virtual gateway resides in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshname)
   */
  public fun meshName(): String

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with shared
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshowner)
   */
  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The specifications of the virtual gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
   */
  public fun spec(): Any

  /**
   * Optional metadata that you can apply to the virtual gateway to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the virtual gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-virtualgatewayname)
   */
  public fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()

  /**
   * A builder for [CfnVirtualGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param meshName The name of the service mesh that the virtual gateway resides in. 
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
     * @param spec The specifications of the virtual gateway. 
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The specifications of the virtual gateway. 
     */
    public fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty)

    /**
     * @param spec The specifications of the virtual gateway. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("846059b37f0b31ef6dc36f128a5e516205f47c5f459bb0bfeaa076389d6343d8")
    public fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param virtualGatewayName The name of the virtual gateway.
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps.builder()

    /**
     * @param meshName The name of the service mesh that the virtual gateway resides in. 
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
     * @param spec The specifications of the virtual gateway. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * @param spec The specifications of the virtual gateway. 
     */
    override fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualGateway.VirtualGatewaySpecProperty::unwrap))
    }

    /**
     * @param spec The specifications of the virtual gateway. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("846059b37f0b31ef6dc36f128a5e516205f47c5f459bb0bfeaa076389d6343d8")
    override fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualGateway.VirtualGatewaySpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param virtualGatewayName The name of the virtual gateway.
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps,
  ) : CdkObject(cdkObject), CfnVirtualGatewayProps {
    /**
     * The name of the service mesh that the virtual gateway resides in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshname)
     */
    override fun meshName(): String = unwrap(this).getMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then it's the ID of the account that shared the mesh with
     * your account. For more information about mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-meshowner)
     */
    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /**
     * The specifications of the virtual gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-spec)
     */
    override fun spec(): Any = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the virtual gateway to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the virtual gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html#cfn-appmesh-virtualgateway-virtualgatewayname)
     */
    override fun virtualGatewayName(): String? = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps):
        CfnVirtualGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualGatewayProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps
  }
}
