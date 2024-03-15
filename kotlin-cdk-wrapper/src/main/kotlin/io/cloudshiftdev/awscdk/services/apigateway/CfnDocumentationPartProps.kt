@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnDocumentationPartProps {
  public fun location(): Any

  public fun properties(): String

  public fun restApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun location(location: IResolvable)

    public fun location(location: CfnDocumentationPart.LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8532e46812d07871c382139cb8414ff9676bf02260a3a5f353269301a02bbbc")
    public fun location(location: CfnDocumentationPart.LocationProperty.Builder.() -> Unit)

    public fun properties(properties: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps.builder()

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnDocumentationPart.LocationProperty) {
      cdkBuilder.location(location.let(CfnDocumentationPart.LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8532e46812d07871c382139cb8414ff9676bf02260a3a5f353269301a02bbbc")
    override fun location(location: CfnDocumentationPart.LocationProperty.Builder.() -> Unit): Unit
        = location(CfnDocumentationPart.LocationProperty(location))

    override fun properties(properties: String) {
      cdkBuilder.properties(properties)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps,
  ) : CdkObject(cdkObject), CfnDocumentationPartProps {
    override fun location(): Any = unwrap(this).getLocation()

    override fun properties(): String = unwrap(this).getProperties()

    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentationPartProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps):
        CfnDocumentationPartProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationPartProps):
        software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
  }
}
