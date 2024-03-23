@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface ILayerVersion : IResource {
  /**
   * Add permission for this layer version to specific entities.
   *
   * Usage within
   * the same account where the layer is defined is always allowed and does not
   * require calling this method. Note that the principal that creates the
   * Lambda function using the layer (for example, a CloudFormation changeset
   * execution role) also needs to have the `lambda:GetLayerVersion`
   * permission on the layer version.
   *
   * @param id the ID of the grant in the construct tree. 
   * @param permission the identification of the grantee. 
   */
  public fun addPermission(id: String, permission: LayerVersionPermission)

  /**
   * Add permission for this layer version to specific entities.
   *
   * Usage within
   * the same account where the layer is defined is always allowed and does not
   * require calling this method. Note that the principal that creates the
   * Lambda function using the layer (for example, a CloudFormation changeset
   * execution role) also needs to have the `lambda:GetLayerVersion`
   * permission on the layer version.
   *
   * @param id the ID of the grant in the construct tree. 
   * @param permission the identification of the grantee. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
  public fun addPermission(id: String, permission: LayerVersionPermission.Builder.() -> Unit)

  /**
   * The runtimes compatible with this Layer.
   *
   * Default: Runtime.All
   */
  public fun compatibleRuntimes(): List<Runtime> =
      unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

  /**
   * The ARN of the Lambda Layer version that this Layer defines.
   */
  public fun layerVersionArn(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion,
  ) : CdkObject(cdkObject), ILayerVersion {
    /**
     * Add permission for this layer version to specific entities.
     *
     * Usage within
     * the same account where the layer is defined is always allowed and does not
     * require calling this method. Note that the principal that creates the
     * Lambda function using the layer (for example, a CloudFormation changeset
     * execution role) also needs to have the `lambda:GetLayerVersion`
     * permission on the layer version.
     *
     * @param id the ID of the grant in the construct tree. 
     * @param permission the identification of the grantee. 
     */
    override fun addPermission(id: String, permission: LayerVersionPermission) {
      unwrap(this).addPermission(id, permission.let(LayerVersionPermission::unwrap))
    }

    /**
     * Add permission for this layer version to specific entities.
     *
     * Usage within
     * the same account where the layer is defined is always allowed and does not
     * require calling this method. Note that the principal that creates the
     * Lambda function using the layer (for example, a CloudFormation changeset
     * execution role) also needs to have the `lambda:GetLayerVersion`
     * permission on the layer version.
     *
     * @param id the ID of the grant in the construct tree. 
     * @param permission the identification of the grantee. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eec498e4e61d6da6cbaf711269e77f3d0940f81924a2490180fb8f64482ccdbd")
    override fun addPermission(id: String, permission: LayerVersionPermission.Builder.() -> Unit):
        Unit = addPermission(id, LayerVersionPermission(permission))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * The runtimes compatible with this Layer.
     *
     * Default: Runtime.All
     */
    override fun compatibleRuntimes(): List<Runtime> =
        unwrap(this).getCompatibleRuntimes()?.map(Runtime::wrap) ?: emptyList()

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The ARN of the Lambda Layer version that this Layer defines.
     */
    override fun layerVersionArn(): String = unwrap(this).getLayerVersionArn()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion):
        ILayerVersion = CdkObjectWrappers.wrap(cdkObject) as? ILayerVersion ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILayerVersion):
        software.amazon.awscdk.services.lambda.ILayerVersion = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.ILayerVersion
  }
}
