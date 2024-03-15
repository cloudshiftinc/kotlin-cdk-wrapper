@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ResourceServerScopeProps {
  public fun scopeDescription(): String

  public fun scopeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun scopeDescription(scopeDescription: String)

    public fun scopeName(scopeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.ResourceServerScopeProps.Builder
        = software.amazon.awscdk.services.cognito.ResourceServerScopeProps.builder()

    override fun scopeDescription(scopeDescription: String) {
      cdkBuilder.scopeDescription(scopeDescription)
    }

    override fun scopeName(scopeName: String) {
      cdkBuilder.scopeName(scopeName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScopeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScopeProps,
  ) : CdkObject(cdkObject), ResourceServerScopeProps {
    override fun scopeDescription(): String = unwrap(this).getScopeDescription()

    override fun scopeName(): String = unwrap(this).getScopeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScopeProps):
        ResourceServerScopeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceServerScopeProps):
        software.amazon.awscdk.services.cognito.ResourceServerScopeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.ResourceServerScopeProps
  }
}
