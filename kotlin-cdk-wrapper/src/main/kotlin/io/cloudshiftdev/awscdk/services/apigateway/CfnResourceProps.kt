@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnResourceProps {
  public fun parentId(): String

  public fun pathPart(): String

  public fun restApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun parentId(parentId: String)

    public fun pathPart(pathPart: String)

    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnResourceProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnResourceProps.builder()

    override fun parentId(parentId: String) {
      cdkBuilder.parentId(parentId)
    }

    override fun pathPart(pathPart: String) {
      cdkBuilder.pathPart(pathPart)
    }

    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnResourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnResourceProps,
  ) : CdkObject(cdkObject), CfnResourceProps {
    override fun parentId(): String = unwrap(this).getParentId()

    override fun pathPart(): String = unwrap(this).getPathPart()

    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnResourceProps):
        CfnResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceProps):
        software.amazon.awscdk.services.apigateway.CfnResourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnResourceProps
  }
}
