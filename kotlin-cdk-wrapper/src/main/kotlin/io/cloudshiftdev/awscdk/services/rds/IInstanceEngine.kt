@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretRotationApplication
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface representing a database instance (as opposed to cluster) engine.
 */
public interface IInstanceEngine : IEngine {
  /**
   * Method called when the engine is used to create a new instance.
   *
   * @param scope 
   * @param options 
   */
  public fun bindToInstance(scope: Construct, options: InstanceEngineBindOptions):
      InstanceEngineConfig

  /**
   * Method called when the engine is used to create a new instance.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("448f711cfcc63a10acaf117d67161b9831a322dfb27d011d1dcf9ff4e8ec125f")
  public fun bindToInstance(scope: Construct,
      options: InstanceEngineBindOptions.Builder.() -> Unit): InstanceEngineConfig

  /**
   * The application used by this engine to perform rotation for a multi-user scenario.
   */
  public fun multiUserRotationApplication(): SecretRotationApplication

  /**
   * The application used by this engine to perform rotation for a single-user scenario.
   */
  public fun singleUserRotationApplication(): SecretRotationApplication

  /**
   * Whether this engine supports automatic backups of a read replica instance.
   *
   * Default: false
   */
  public fun supportsReadReplicaBackups(): Boolean? = unwrap(this).getSupportsReadReplicaBackups()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IInstanceEngine):
        IInstanceEngine = CdkObjectWrappers.wrap(cdkObject) as IInstanceEngine

    internal fun unwrap(wrapped: IInstanceEngine):
        software.amazon.awscdk.services.rds.IInstanceEngine = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IInstanceEngine
  }
}
