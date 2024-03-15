@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RestApiAttributes {
  public fun restApiId(): String

  public fun restApiName(): String? = unwrap(this).getRestApiName()

  public fun rootResourceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun restApiId(restApiId: String)

    public fun restApiName(restApiName: String)

    public fun rootResourceId(rootResourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder =
        software.amazon.awscdk.services.apigateway.RestApiAttributes.builder()

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun rootResourceId(rootResourceId: String) {
      cdkBuilder.rootResourceId(rootResourceId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes,
  ) : CdkObject(cdkObject), RestApiAttributes {
    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun restApiName(): String? = unwrap(this).getRestApiName()

    override fun rootResourceId(): String = unwrap(this).getRootResourceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes):
        RestApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiAttributes):
        software.amazon.awscdk.services.apigateway.RestApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RestApiAttributes
  }
}
