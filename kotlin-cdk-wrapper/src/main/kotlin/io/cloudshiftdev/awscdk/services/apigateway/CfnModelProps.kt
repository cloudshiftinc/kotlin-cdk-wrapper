@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface CfnModelProps {
  public fun contentType(): String? = unwrap(this).getContentType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun restApiId(): String

  public fun schema(): Any? = unwrap(this).getSchema()

  @CdkDslMarker
  public interface Builder {
    public fun contentType(contentType: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun restApiId(restApiId: String)

    public fun schema(schema: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnModelProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnModelProps.builder()

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnModelProps,
  ) : CdkObject(cdkObject), CfnModelProps {
    override fun contentType(): String? = unwrap(this).getContentType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun restApiId(): String = unwrap(this).getRestApiId()

    override fun schema(): Any? = unwrap(this).getSchema()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnModelProps):
        CfnModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelProps):
        software.amazon.awscdk.services.apigateway.CfnModelProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnModelProps
  }
}
