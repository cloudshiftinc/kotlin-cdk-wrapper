@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnApiMappingProps {
  public fun apiId(): String

  public fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

  public fun domainName(): String

  public fun stage(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun apiMappingKey(apiMappingKey: String)

    public fun domainName(domainName: String)

    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps,
  ) : CdkObject(cdkObject), CfnApiMappingProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun stage(): String = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps):
        CfnApiMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiMappingProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
  }
}
