package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class QualifiedFunctionBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase,
) : FunctionBase(cdkObject) {
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions) {
    unwrap(this).configureAsyncInvoke(options.let(EventInvokeConfigOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b85c1a6f6a657150d5fca517e75d094e687b3217c04d318f2be78e23e7c059ee")
  public override fun configureAsyncInvoke(options: EventInvokeConfigOptions.Builder.() -> Unit):
      Unit = configureAsyncInvoke(EventInvokeConfigOptions(options))

  public override fun considerWarningOnInvokeFunctionPermissions(_scope: Construct,
      _action: String) {
    unwrap(this).considerWarningOnInvokeFunctionPermissions(_scope.let(Construct::unwrap), _action)
  }

  public open fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

  public override fun latestVersion(): IVersion =
      unwrap(this).getLatestVersion().let(IVersion::wrap)

  public override fun permissionsNode(): Node = unwrap(this).getPermissionsNode().let(Node::wrap)

  public override fun resourceArnsForGrantInvoke(): List<String> =
      unwrap(this).getResourceArnsForGrantInvoke() ?: emptyList()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase,
  ) : QualifiedFunctionBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.QualifiedFunctionBase):
        QualifiedFunctionBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QualifiedFunctionBase):
        software.amazon.awscdk.services.lambda.QualifiedFunctionBase = (wrapped as
        Wrapper).cdkObject
  }
}
