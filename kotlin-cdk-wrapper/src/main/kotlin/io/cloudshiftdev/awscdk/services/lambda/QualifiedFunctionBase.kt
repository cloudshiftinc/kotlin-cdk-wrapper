@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public abstract class QualifiedFunctionBase(
  cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase,
) : FunctionBase(cdkObject) {
  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions.Companion::unwrap))
  }

  /**
   * Configures options for asynchronous invocation.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  /**
   * A warning will be added to functions under the following conditions: - permissions that include
   * `lambda:InvokeFunction` are added to the unqualified function.
   *
   * * function.currentVersion is invoked before or after the permission is created.
   *
   * This applies only to permissions on Lambda functions, not versions or aliases.
   * This function is overridden as a noOp for QualifiedFunctionBase.
   *
   * @param _scope 
   * @param _action 
   */
  public override fun considerWarningOnInvokeFunctionPermissions(scope: Construct, action: String) {
    unwrap(this).considerWarningOnInvokeFunctionPermissions(scope.let(Construct.Companion::unwrap),
        action)
  }

  /**
   * The underlying `IFunction`.
   */
  public open fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  /**
   * The `$LATEST` version of this function.
   *
   * Note that this is reference to a non-specific AWS Lambda version, which
   * means the function this version refers to can return different results in
   * different invocations.
   *
   * To obtain a reference to an explicit version which references the current
   * function configuration, use `lambdaFunction.currentVersion` instead.
   */
  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  /**
   * The construct node where permissions are attached.
   */
  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  /**
   * The ARN(s) to put into the resource field of the generated IAM policy for grantInvoke().
   */
  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase,
  ) : QualifiedFunctionBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase):
        QualifiedFunctionBase = CdkObjectWrappers.wrap(cdkObject) as? QualifiedFunctionBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QualifiedFunctionBase):
        software.amazon.awscdk.services.lambda.QualifiedFunctionBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.QualifiedFunctionBase
  }
}
