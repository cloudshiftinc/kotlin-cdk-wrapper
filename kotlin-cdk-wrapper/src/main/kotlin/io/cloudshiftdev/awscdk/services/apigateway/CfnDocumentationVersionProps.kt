@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDocumentationVersionProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun documentationVersion(): String

  public fun restApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun documentationVersion(documentationVersion: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun documentationVersion(documentationVersion: String) {
      cdkBuilder.documentationVersion(documentationVersion)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps,
  ) : CdkObject(cdkObject), CfnDocumentationVersionProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun documentationVersion(): String = unwrap(this).getDocumentationVersion()

    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps):
        CfnDocumentationVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentationVersionProps):
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
  }
}
