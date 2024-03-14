package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Function internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.Function,
) : Resource(cdkObject), IFunction {
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun functionName(): String = unwrap(this).getFunctionName()

  public open fun functionRuntime(): String = unwrap(this).getFunctionRuntime()

  public open fun functionStage(): String = unwrap(this).getFunctionStage()

  public interface Builder {
    public fun code(code: FunctionCode)

    public fun comment(comment: String)

    public fun functionName(functionName: String)

    public fun keyValueStore(keyValueStore: IKeyValueStore)

    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Function.Builder =
        software.amazon.awscdk.services.cloudfront.Function.Builder.create(scope, id)

    override fun code(code: FunctionCode) {
      cdkBuilder.code(code.let(FunctionCode::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun keyValueStore(keyValueStore: IKeyValueStore) {
      cdkBuilder.keyValueStore(keyValueStore.let(IKeyValueStore::unwrap))
    }

    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Function = cdkBuilder.build()
  }

  public companion object {
    public open fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes,
    ): IFunction =
        software.amazon.awscdk.services.cloudfront.Function.fromFunctionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FunctionAttributes::unwrap)).let(IFunction::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91316568d90081b9d7f3c253151ac0e56a539482d4c8c8d96412d774c1738c7f")
    public open fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes.Builder.() -> Unit,
    ): IFunction = fromFunctionAttributes(scope, id, FunctionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Function {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Function(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Function): Function =
        Function(cdkObject)

    internal fun unwrap(wrapped: Function): software.amazon.awscdk.services.cloudfront.Function =
        wrapped.cdkObject
  }
}
