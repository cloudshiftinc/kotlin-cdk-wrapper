@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnUrlProps {
  public fun authType(): String

  public fun cors(): Any? = unwrap(this).getCors()

  public fun invokeMode(): String? = unwrap(this).getInvokeMode()

  public fun qualifier(): String? = unwrap(this).getQualifier()

  public fun targetFunctionArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun cors(cors: IResolvable)

    public fun cors(cors: CfnUrl.CorsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3593d16b618ac085cb40e18d89350f3fbaf5cba06fe707494e4cfc28151e21f7")
    public fun cors(cors: CfnUrl.CorsProperty.Builder.() -> Unit)

    public fun invokeMode(invokeMode: String)

    public fun qualifier(qualifier: String)

    public fun targetFunctionArn(targetFunctionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrlProps.Builder =
        software.amazon.awscdk.services.lambda.CfnUrlProps.builder()

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable::unwrap))
    }

    override fun cors(cors: CfnUrl.CorsProperty) {
      cdkBuilder.cors(cors.let(CfnUrl.CorsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3593d16b618ac085cb40e18d89350f3fbaf5cba06fe707494e4cfc28151e21f7")
    override fun cors(cors: CfnUrl.CorsProperty.Builder.() -> Unit): Unit =
        cors(CfnUrl.CorsProperty(cors))

    override fun invokeMode(invokeMode: String) {
      cdkBuilder.invokeMode(invokeMode)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    override fun targetFunctionArn(targetFunctionArn: String) {
      cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnUrlProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnUrlProps,
  ) : CdkObject(cdkObject), CfnUrlProps {
    override fun authType(): String = unwrap(this).getAuthType()

    override fun cors(): Any? = unwrap(this).getCors()

    override fun invokeMode(): String? = unwrap(this).getInvokeMode()

    override fun qualifier(): String? = unwrap(this).getQualifier()

    override fun targetFunctionArn(): String = unwrap(this).getTargetFunctionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUrlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrlProps): CfnUrlProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUrlProps): software.amazon.awscdk.services.lambda.CfnUrlProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnUrlProps
  }
}
