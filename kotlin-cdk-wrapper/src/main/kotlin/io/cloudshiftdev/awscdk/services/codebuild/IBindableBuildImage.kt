@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A variant of `IBuildImage` that allows binding to the project.
 */
public interface IBindableBuildImage : IBuildImage {
  /**
   * Function that allows the build image access to the construct tree.
   *
   * @param scope 
   * @param project 
   * @param options 
   */
  public fun bind(
    scope: Construct,
    project: IProject,
    options: BuildImageBindOptions,
  ): BuildImageConfig

  /**
   * Function that allows the build image access to the construct tree.
   *
   * @param scope 
   * @param project 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2217a711d386432885489a755d119db8cc713f4afd5a62af3c63f8f8f7197cd5")
  public fun bind(
    scope: Construct,
    project: IProject,
    options: BuildImageBindOptions.Builder.() -> Unit,
  ): BuildImageConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IBindableBuildImage):
        IBindableBuildImage = CdkObjectWrappers.wrap(cdkObject) as IBindableBuildImage

    internal fun unwrap(wrapped: IBindableBuildImage):
        software.amazon.awscdk.services.codebuild.IBindableBuildImage = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IBindableBuildImage
  }
}
