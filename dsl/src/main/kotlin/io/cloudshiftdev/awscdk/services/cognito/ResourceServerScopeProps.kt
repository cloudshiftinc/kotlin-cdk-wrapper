package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ResourceServerScopeProps {
  /**
   * A description of the scope.
   */
  public fun scopeDescription(): String

  /**
   * The name of the scope.
   */
  public fun scopeName(): String

  /**
   * A builder for [ResourceServerScopeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scopeDescription A description of the scope. 
     */
    public fun scopeDescription(scopeDescription: String)

    /**
     * @param scopeName The name of the scope. 
     */
    public fun scopeName(scopeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.ResourceServerScopeProps.Builder
        = software.amazon.awscdk.services.cognito.ResourceServerScopeProps.builder()

    /**
     * @param scopeDescription A description of the scope. 
     */
    override fun scopeDescription(scopeDescription: String) {
      cdkBuilder.scopeDescription(scopeDescription)
    }

    /**
     * @param scopeName The name of the scope. 
     */
    override fun scopeName(scopeName: String) {
      cdkBuilder.scopeName(scopeName)
    }

    public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScopeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScopeProps,
  ) : CdkObject(cdkObject), ResourceServerScopeProps {
    /**
     * A description of the scope.
     */
    override fun scopeDescription(): String = unwrap(this).getScopeDescription()

    /**
     * The name of the scope.
     */
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
