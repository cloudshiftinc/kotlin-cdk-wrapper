@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * The interface representing a database cluster (as opposed to instance) engine.
 */
public interface IClusterEngine : IEngine {
  /**
   * Method called when the engine is used to create a new cluster.
   *
   * @param scope 
   * @param options 
   */
  public fun bindToCluster(scope: Construct, options: ClusterEngineBindOptions): ClusterEngineConfig

  /**
   * Method called when the engine is used to create a new cluster.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9db4165b6dd46987c5db0e71079e9d6a87f0e537509ad2fc4a4ffa36d17032ec")
  public fun bindToCluster(scope: Construct, options: ClusterEngineBindOptions.Builder.() -> Unit):
      ClusterEngineConfig

  /**
   * Whether the IAM Roles used for data importing and exporting need to be combined for this
   * Engine, or can they be kept separate.
   *
   * Default: false
   */
  public fun combineImportAndExportRoles(): Boolean? = unwrap(this).getCombineImportAndExportRoles()

  /**
   * The application used by this engine to perform rotation for a multi-user scenario.
   */
  public fun multiUserRotationApplication(): SecretRotationApplication

  /**
   * The application used by this engine to perform rotation for a single-user scenario.
   */
  public fun singleUserRotationApplication(): SecretRotationApplication

  /**
   * The log types that are available with this engine type.
   */
  public fun supportedLogTypes(): List<String>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IClusterEngine): IClusterEngine
        = CdkObjectWrappers.wrap(cdkObject) as IClusterEngine

    internal fun unwrap(wrapped: IClusterEngine): software.amazon.awscdk.services.rds.IClusterEngine
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.rds.IClusterEngine
  }
}
