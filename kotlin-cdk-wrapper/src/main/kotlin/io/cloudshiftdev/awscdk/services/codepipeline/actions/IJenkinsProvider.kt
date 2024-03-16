@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

/**
 * A Jenkins provider.
 *
 * If you want to create a new Jenkins provider managed alongside your CDK code,
 * instantiate the `JenkinsProvider` class directly.
 *
 * If you want to reference an already registered provider,
 * use the `JenkinsProvider#fromJenkinsProviderAttributes` method.
 */
public interface IJenkinsProvider : IConstruct {
  /**
   *
   */
  public fun providerName(): String

  /**
   *
   */
  public fun serverUrl(): String

  /**
   *
   */
  public fun version(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider):
        IJenkinsProvider = CdkObjectWrappers.wrap(cdkObject) as IJenkinsProvider

    internal fun unwrap(wrapped: IJenkinsProvider):
        software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider
  }
}
