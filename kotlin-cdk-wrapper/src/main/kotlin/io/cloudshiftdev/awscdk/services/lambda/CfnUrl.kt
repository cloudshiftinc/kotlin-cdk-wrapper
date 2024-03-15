@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUrl internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lambda.CfnUrl,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  public open fun attrFunctionUrl(): String = unwrap(this).getAttrFunctionUrl()

  public open fun authType(): String = unwrap(this).getAuthType()

  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  public open fun cors(): Any? = unwrap(this).getCors()

  public open fun cors(`value`: IResolvable) {
    unwrap(this).setCors(`value`.let(IResolvable::unwrap))
  }

  public open fun cors(`value`: CorsProperty) {
    unwrap(this).setCors(`value`.let(CorsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f0d7ee6657ffecedf3b3276313ad4d8dec6e9c6d79513633cdbe241acb21866")
  public open fun cors(`value`: CorsProperty.Builder.() -> Unit): Unit = cors(CorsProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun invokeMode(): String? = unwrap(this).getInvokeMode()

  public open fun invokeMode(`value`: String) {
    unwrap(this).setInvokeMode(`value`)
  }

  public open fun qualifier(): String? = unwrap(this).getQualifier()

  public open fun qualifier(`value`: String) {
    unwrap(this).setQualifier(`value`)
  }

  public open fun targetFunctionArn(): String = unwrap(this).getTargetFunctionArn()

  public open fun targetFunctionArn(`value`: String) {
    unwrap(this).setTargetFunctionArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun authType(authType: String)

    public fun cors(cors: IResolvable)

    public fun cors(cors: CorsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb00e11b11a16df477e0773c2b9462c72137d14c0e7628a27c63bbe1cbe0c1a")
    public fun cors(cors: CorsProperty.Builder.() -> Unit)

    public fun invokeMode(invokeMode: String)

    public fun qualifier(qualifier: String)

    public fun targetFunctionArn(targetFunctionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrl.Builder =
        software.amazon.awscdk.services.lambda.CfnUrl.Builder.create(scope, id)

    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable::unwrap))
    }

    override fun cors(cors: CorsProperty) {
      cdkBuilder.cors(cors.let(CorsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb00e11b11a16df477e0773c2b9462c72137d14c0e7628a27c63bbe1cbe0c1a")
    override fun cors(cors: CorsProperty.Builder.() -> Unit): Unit = cors(CorsProperty(cors))

    override fun invokeMode(invokeMode: String) {
      cdkBuilder.invokeMode(invokeMode)
    }

    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    override fun targetFunctionArn(targetFunctionArn: String) {
      cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnUrl = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnUrl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUrl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUrl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrl): CfnUrl =
        CfnUrl(cdkObject)

    internal fun unwrap(wrapped: CfnUrl): software.amazon.awscdk.services.lambda.CfnUrl =
        wrapped.cdkObject
  }

  public interface CorsProperty {
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    @CdkDslMarker
    public interface Builder {
      public fun allowCredentials(allowCredentials: Boolean)

      public fun allowCredentials(allowCredentials: IResolvable)

      public fun allowHeaders(allowHeaders: List<String>)

      public fun allowHeaders(vararg allowHeaders: String)

      public fun allowMethods(allowMethods: List<String>)

      public fun allowMethods(vararg allowMethods: String)

      public fun allowOrigins(allowOrigins: List<String>)

      public fun allowOrigins(vararg allowOrigins: String)

      public fun exposeHeaders(exposeHeaders: List<String>)

      public fun exposeHeaders(vararg exposeHeaders: String)

      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty.builder()

      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      override fun allowHeaders(vararg allowHeaders: String): Unit =
          allowHeaders(allowHeaders.toList())

      override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      override fun allowMethods(vararg allowMethods: String): Unit =
          allowMethods(allowMethods.toList())

      override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      override fun allowOrigins(vararg allowOrigins: String): Unit =
          allowOrigins(allowOrigins.toList())

      override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      override fun exposeHeaders(vararg exposeHeaders: String): Unit =
          exposeHeaders(exposeHeaders.toList())

      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty,
    ) : CdkObject(cdkObject), CorsProperty {
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

      override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

      override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

      override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty):
          CorsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsProperty):
          software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty
    }
  }
}
