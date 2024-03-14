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

public interface CfnVirtualServiceProps {
  /**
   * The name of the service mesh to create the virtual service in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname)
   */
  public fun meshName(): String

  /**
   * The AWS IAM account ID of the service mesh owner.
   *
   * If the account ID is not your own, then the account that you specify must share the mesh with
   * your account before you can create the resource in the service mesh. For more information about
   * mesh sharing, see [Working with shared
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner)
   */
  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  /**
   * The virtual service specification to apply.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
   */
  public fun spec(): Any

  /**
   * Optional metadata that you can apply to the virtual service to assist with categorization and
   * organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name to use for the virtual service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename)
   */
  public fun virtualServiceName(): String

  /**
   * A builder for [CfnVirtualServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param meshName The name of the service mesh to create the virtual service in. 
     */
    public fun meshName(meshName: String)

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    public fun meshOwner(meshOwner: String)

    /**
     * @param spec The virtual service specification to apply. 
     */
    public fun spec(spec: IResolvable)

    /**
     * @param spec The virtual service specification to apply. 
     */
    public fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty)

    /**
     * @param spec The virtual service specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5015982db1d5e31c2ac4864f9eb9786434c2f9208d05e48e5656aae8c140407e")
    public fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty.Builder.() -> Unit)

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param virtualServiceName The name to use for the virtual service. 
     */
    public fun virtualServiceName(virtualServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps.builder()

    /**
     * @param meshName The name of the service mesh to create the virtual service in. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner.
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     */
    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    /**
     * @param spec The virtual service specification to apply. 
     */
    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    /**
     * @param spec The virtual service specification to apply. 
     */
    override fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty) {
      cdkBuilder.spec(spec.let(CfnVirtualService.VirtualServiceSpecProperty::unwrap))
    }

    /**
     * @param spec The virtual service specification to apply. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5015982db1d5e31c2ac4864f9eb9786434c2f9208d05e48e5656aae8c140407e")
    override fun spec(spec: CfnVirtualService.VirtualServiceSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnVirtualService.VirtualServiceSpecProperty(spec))

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual service to assist with
     * categorization and organization.
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param virtualServiceName The name to use for the virtual service. 
     */
    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps,
  ) : CdkObject(cdkObject), CfnVirtualServiceProps {
    /**
     * The name of the service mesh to create the virtual service in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshname)
     */
    override fun meshName(): String = unwrap(this).getMeshName()

    /**
     * The AWS IAM account ID of the service mesh owner.
     *
     * If the account ID is not your own, then the account that you specify must share the mesh with
     * your account before you can create the resource in the service mesh. For more information about
     * mesh sharing, see [Working with shared
     * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-meshowner)
     */
    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    /**
     * The virtual service specification to apply.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-spec)
     */
    override fun spec(): Any = unwrap(this).getSpec()

    /**
     * Optional metadata that you can apply to the virtual service to assist with categorization and
     * organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Tag keys can have
     * a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name to use for the virtual service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualservice.html#cfn-appmesh-virtualservice-virtualservicename)
     */
    override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps):
        CfnVirtualServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualServiceProps):
        software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnVirtualServiceProps
  }
}
