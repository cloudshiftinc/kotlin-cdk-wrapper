@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents a source for bucket deployments.
 */
public interface ISource {
  /**
   * Binds the source to a bucket deployment.
   *
   * @param scope The construct tree context. 
   * @param context
   */
  public fun bind(scope: Construct): SourceConfig

  /**
   * Binds the source to a bucket deployment.
   *
   * @param scope The construct tree context. 
   * @param context
   */
  public fun bind(scope: Construct, context: DeploymentSourceContext): SourceConfig

  /**
   * Binds the source to a bucket deployment.
   *
   * @param scope The construct tree context. 
   * @param context
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c74ab7b3dbc4afb550f71f4c55a9031c91cd50dd6eb18151c81c70e8d6e8f10f")
  public fun bind(scope: Construct, context: DeploymentSourceContext.Builder.() -> Unit):
      SourceConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.ISource): ISource =
        CdkObjectWrappers.wrap(cdkObject) as ISource

    internal fun unwrap(wrapped: ISource): software.amazon.awscdk.services.s3.deployment.ISource =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.deployment.ISource
  }
}
