package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class FunctionUrl internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrl,
) : Resource(cdkObject), IFunctionUrl {
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  public override fun grantInvokeUrl(grantee: IGrantable): Grant =
      unwrap(this).grantInvokeUrl(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun url(): String = unwrap(this).getUrl()

  public interface Builder {
    public fun authType(authType: FunctionUrlAuthType)

    public fun cors(cors: FunctionUrlCorsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1275251e5ca38e8a5c47388fd0491e845d1fee149206164025cf21e3d7bc17a6")
    public fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit)

    public fun function(function: IFunction)

    public fun invokeMode(invokeMode: InvokeMode)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrl.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrl.Builder.create(scope, id)

    override fun authType(authType: FunctionUrlAuthType) {
      cdkBuilder.authType(authType.let(FunctionUrlAuthType::unwrap))
    }

    override fun cors(cors: FunctionUrlCorsOptions) {
      cdkBuilder.cors(cors.let(FunctionUrlCorsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1275251e5ca38e8a5c47388fd0491e845d1fee149206164025cf21e3d7bc17a6")
    override fun cors(cors: FunctionUrlCorsOptions.Builder.() -> Unit): Unit =
        cors(FunctionUrlCorsOptions(cors))

    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    override fun invokeMode(invokeMode: InvokeMode) {
      cdkBuilder.invokeMode(invokeMode.let(InvokeMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrl = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): FunctionUrl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return FunctionUrl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrl): FunctionUrl =
        FunctionUrl(cdkObject)

    internal fun unwrap(wrapped: FunctionUrl): software.amazon.awscdk.services.lambda.FunctionUrl =
        wrapped.cdkObject
  }
}
