package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDocumentationPart internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDocumentationPartId(): String = unwrap(this).getAttrDocumentationPartId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun location(): Any = unwrap(this).getLocation()

  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f775ea8587d4f6b7d4e216b50506d59245e9132d1700eb472e40a5820ed0db66")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  public open fun properties(): String = unwrap(this).getProperties()

  public open fun properties(`value`: String) {
    unwrap(this).setProperties(`value`)
  }

  public open fun restApiId(): String = unwrap(this).getRestApiId()

  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  public interface Builder {
    public fun location(location: IResolvable)

    public fun location(location: LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("007c62623872feb70c8fab744c082daa348ed138da9d3521c1388ee6a20b895f")
    public fun location(location: LocationProperty.Builder.() -> Unit)

    public fun properties(properties: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder
        = software.amazon.awscdk.services.apigateway.CfnDocumentationPart.Builder.create(scope, id)

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("007c62623872feb70c8fab744c082daa348ed138da9d3521c1388ee6a20b895f")
    override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    override fun properties(properties: String) {
      cdkBuilder.properties(properties)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationPart =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentationPart {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentationPart(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart):
        CfnDocumentationPart = CfnDocumentationPart(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationPart):
        software.amazon.awscdk.services.apigateway.CfnDocumentationPart = wrapped.cdkObject
  }

  public interface LocationProperty {
    public fun method(): String? = unwrap(this).getMethod()

    public fun name(): String? = unwrap(this).getName()

    public fun path(): String? = unwrap(this).getPath()

    public fun statusCode(): String? = unwrap(this).getStatusCode()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun method(method: String)

      public fun name(name: String)

      public fun path(path: String)

      public fun statusCode(statusCode: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty.builder()

      override fun method(method: String) {
        cdkBuilder.method(method)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty,
    ) : LocationProperty {
      override fun method(): String? = unwrap(this).getMethod()

      override fun name(): String? = unwrap(this).getName()

      override fun path(): String? = unwrap(this).getPath()

      override fun statusCode(): String? = unwrap(this).getStatusCode()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.apigateway.CfnDocumentationPart.LocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
