@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.ILayerVersion):
        ILayerVersion = CdkObjectWrappers.wrap(cdkObject) as ILayerVersion

    internal fun unwrap(wrapped: ILayerVersion):
        software.amazon.awscdk.services.lambda.ILayerVersion = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.ILayerVersion
  }
}
