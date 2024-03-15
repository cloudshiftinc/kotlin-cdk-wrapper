@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnBasePathMappingProps {
  public fun basePath(): String? = unwrap(this).getBasePath()

  public fun domainName(): String

  public fun id(): String? = unwrap(this).getId()

  public fun restApiId(): String? = unwrap(this).getRestApiId()

  public fun stage(): String? = unwrap(this).getStage()

  @CdkDslMarker
  public interface Builder {
    public fun basePath(basePath: String)

    public fun domainName(domainName: String)

    public fun id(id: String)

    public fun restApiId(restApiId: String)

    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps.builder()

    override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps,
  ) : CdkObject(cdkObject), CfnBasePathMappingProps {
    override fun basePath(): String? = unwrap(this).getBasePath()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun id(): String? = unwrap(this).getId()

    override fun restApiId(): String? = unwrap(this).getRestApiId()

    override fun stage(): String? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBasePathMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps):
        CfnBasePathMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBasePathMappingProps):
        software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
  }
}
