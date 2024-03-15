@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a new AppMesh mesh.
 *
 * Example:
 *
 * ```
 * // This is the ARN for the mesh from different AWS IAM account ID.
 * // Ensure mesh is properly shared with your account. For more details, see:
 * https://github.com/aws/aws-cdk/issues/15404
 * String arn = "arn:aws:appmesh:us-east-1:123456789012:mesh/testMesh";
 * IMesh sharedMesh = Mesh.fromMeshArn(this, "imported-mesh", arn);
 * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
 * IAM account ID.
 * // This VirtualNode resource can communicate with the resources in the mesh from different AWS
 * IAM account ID.
 * VirtualNode.Builder.create(this, "test-node")
 * .mesh(sharedMesh)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/meshes.html)
 */
public open class Mesh internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.Mesh,
) : Resource(cdkObject), IMesh {
  /**
   * Adds a VirtualGateway to the Mesh.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualGateway(id: String): VirtualGateway =
      unwrap(this).addVirtualGateway(id).let(VirtualGateway::wrap)

  /**
   * Adds a VirtualGateway to the Mesh.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualGateway(id: String, props: VirtualGatewayBaseProps): VirtualGateway
      = unwrap(this).addVirtualGateway(id,
      props.let(VirtualGatewayBaseProps::unwrap)).let(VirtualGateway::wrap)

  /**
   * Adds a VirtualGateway to the Mesh.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("806769f186eaec3fa9e3209acdf24765b05ef2369fd0cab34a25f9215b419f1a")
  public override fun addVirtualGateway(id: String,
      props: VirtualGatewayBaseProps.Builder.() -> Unit): VirtualGateway = addVirtualGateway(id,
      VirtualGatewayBaseProps(props))

  /**
   * Adds a VirtualNode to the Mesh.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualNode(id: String): VirtualNode =
      unwrap(this).addVirtualNode(id).let(VirtualNode::wrap)

  /**
   * Adds a VirtualNode to the Mesh.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualNode(id: String, props: VirtualNodeBaseProps): VirtualNode =
      unwrap(this).addVirtualNode(id,
      props.let(VirtualNodeBaseProps::unwrap)).let(VirtualNode::wrap)

  /**
   * Adds a VirtualNode to the Mesh.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22cc54ebf16a50a601a96aa1328e0f5a527ace6c6fde8555f4d2981b06f92ec2")
  public override fun addVirtualNode(id: String, props: VirtualNodeBaseProps.Builder.() -> Unit):
      VirtualNode = addVirtualNode(id, VirtualNodeBaseProps(props))

  /**
   * Adds a VirtualRouter to the Mesh with the given id and props.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualRouter(id: String): VirtualRouter =
      unwrap(this).addVirtualRouter(id).let(VirtualRouter::wrap)

  /**
   * Adds a VirtualRouter to the Mesh with the given id and props.
   *
   * @param id 
   * @param props
   */
  public override fun addVirtualRouter(id: String, props: VirtualRouterBaseProps): VirtualRouter =
      unwrap(this).addVirtualRouter(id,
      props.let(VirtualRouterBaseProps::unwrap)).let(VirtualRouter::wrap)

  /**
   * Adds a VirtualRouter to the Mesh with the given id and props.
   *
   * @param id 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0ef76fc2c94e3105862487f46bac7bb438d623fe852d72b8a9b2f8e55302bff2")
  public override fun addVirtualRouter(id: String,
      props: VirtualRouterBaseProps.Builder.() -> Unit): VirtualRouter = addVirtualRouter(id,
      VirtualRouterBaseProps(props))

  /**
   * The Amazon Resource Name (ARN) of the AppMesh mesh.
   */
  public override fun meshArn(): String = unwrap(this).getMeshArn()

  /**
   * The name of the AppMesh mesh.
   */
  public override fun meshName(): String = unwrap(this).getMeshName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.Mesh].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Egress filter to be applied to the Mesh.
     *
     * Default: DROP_ALL
     *
     * @param egressFilter Egress filter to be applied to the Mesh. 
     */
    public fun egressFilter(egressFilter: MeshFilterType)

    /**
     * The name of the Mesh being defined.
     *
     * Default: - A name is automatically generated
     *
     * @param meshName The name of the Mesh being defined. 
     */
    public fun meshName(meshName: String)

    /**
     * Defines how upstream clients will discover VirtualNodes in the Mesh.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
     */
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery)

    /**
     * Defines how upstream clients will discover VirtualNodes in the Mesh.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f46f06016003ebdf0c0bf2751b049660800532528bdd97c5e4a5abda4a0c0df7")
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Mesh.Builder =
        software.amazon.awscdk.services.appmesh.Mesh.Builder.create(scope, id)

    /**
     * Egress filter to be applied to the Mesh.
     *
     * Default: DROP_ALL
     *
     * @param egressFilter Egress filter to be applied to the Mesh. 
     */
    override fun egressFilter(egressFilter: MeshFilterType) {
      cdkBuilder.egressFilter(egressFilter.let(MeshFilterType::unwrap))
    }

    /**
     * The name of the Mesh being defined.
     *
     * Default: - A name is automatically generated
     *
     * @param meshName The name of the Mesh being defined. 
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * Defines how upstream clients will discover VirtualNodes in the Mesh.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
     */
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscovery::unwrap))
    }

    /**
     * Defines how upstream clients will discover VirtualNodes in the Mesh.
     *
     * Default: - No Service Discovery
     *
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f46f06016003ebdf0c0bf2751b049660800532528bdd97c5e4a5abda4a0c0df7")
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit): Unit =
        serviceDiscovery(MeshServiceDiscovery(serviceDiscovery))

    public fun build(): software.amazon.awscdk.services.appmesh.Mesh = cdkBuilder.build()
  }

  public companion object {
    public fun fromMeshArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      meshArn: String,
    ): IMesh =
        software.amazon.awscdk.services.appmesh.Mesh.fromMeshArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, meshArn).let(IMesh::wrap)

    public fun fromMeshName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      meshName: String,
    ): IMesh =
        software.amazon.awscdk.services.appmesh.Mesh.fromMeshName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, meshName).let(IMesh::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Mesh {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Mesh(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Mesh): Mesh =
        Mesh(cdkObject)

    internal fun unwrap(wrapped: Mesh): software.amazon.awscdk.services.appmesh.Mesh =
        wrapped.cdkObject
  }
}
