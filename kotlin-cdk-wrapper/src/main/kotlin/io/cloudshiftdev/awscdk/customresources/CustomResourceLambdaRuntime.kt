@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.customresources

import io.cloudshiftdev.awscdk.IAspect
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.Runtime
import io.cloudshiftdev.constructs.IConstruct

/**
 * Manages lambda runtime for AWS-vended custom resources.
 *
 * This feature is currently experimental.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.customresources.*;
 * Runtime runtime;
 * CustomResourceLambdaRuntime customResourceLambdaRuntime = new
 * CustomResourceLambdaRuntime(runtime);
 * ```
 */
public open class CustomResourceLambdaRuntime(
  cdkObject: software.amazon.awscdk.customresources.CustomResourceLambdaRuntime,
) : CdkObject(cdkObject),
    IAspect {
  public constructor(lambdaRuntime: Runtime) :
      this(software.amazon.awscdk.customresources.CustomResourceLambdaRuntime(lambdaRuntime.let(Runtime.Companion::unwrap))
  )

  /**
   * All aspects can visit an IConstruct.
   *
   * @param node 
   */
  public override fun visit(node: IConstruct) {
    unwrap(this).visit(node.let(IConstruct.Companion::unwrap))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.customresources.CustomResourceLambdaRuntime):
        CustomResourceLambdaRuntime = CustomResourceLambdaRuntime(cdkObject)

    internal fun unwrap(wrapped: CustomResourceLambdaRuntime):
        software.amazon.awscdk.customresources.CustomResourceLambdaRuntime = wrapped.cdkObject as
        software.amazon.awscdk.customresources.CustomResourceLambdaRuntime
  }
}
