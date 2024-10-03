@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.constructs.IConstruct

/**
 * Manages AWS-vended Custom Resources.
 *
 * This feature is currently experimental.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.customresources.*;
 * CustomResourceConfig customResourceConfig = CustomResourceConfig.of(this);
 * ```
 */
public open class CustomResourceConfig(
  cdkObject: software.amazon.awscdk.customresources.CustomResourceConfig,
) : CdkObject(cdkObject) {
  /**
   * Set the runtime version on AWS-vended custom resources lambdas.
   *
   * This feature is currently experimental.
   *
   * @param lambdaRuntime 
   */
  public open fun addLambdaRuntime(lambdaRuntime: Runtime) {
    unwrap(this).addLambdaRuntime(lambdaRuntime.let(Runtime.Companion::unwrap))
  }

  /**
   * Set the log retention of AWS-vended custom resource lambdas.
   *
   * This feature is currently experimental.
   *
   * @param rentention 
   */
  public open fun addLogRetentionLifetime(rentention: RetentionDays) {
    unwrap(this).addLogRetentionLifetime(rentention.let(RetentionDays.Companion::unwrap))
  }

  /**
   * Set the removal policy of AWS-vended custom resource logGroup.
   *
   * This feature is currently experimental.
   *
   * @param removalPolicy 
   */
  public open fun addRemovalPolicy(removalPolicy: RemovalPolicy) {
    unwrap(this).addRemovalPolicy(removalPolicy.let(RemovalPolicy.Companion::unwrap))
  }

  public companion object {
    public fun of(scope: IConstruct): CustomResourceConfig =
        software.amazon.awscdk.customresources.CustomResourceConfig.of(scope.let(IConstruct.Companion::unwrap)).let(CustomResourceConfig::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.customresources.CustomResourceConfig):
        CustomResourceConfig = CustomResourceConfig(cdkObject)

    internal fun unwrap(wrapped: CustomResourceConfig):
        software.amazon.awscdk.customresources.CustomResourceConfig = wrapped.cdkObject as
        software.amazon.awscdk.customresources.CustomResourceConfig
  }
}
