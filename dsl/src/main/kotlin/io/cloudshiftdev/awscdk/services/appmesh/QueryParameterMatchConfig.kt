package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface QueryParameterMatchConfig {
  /**
   * Route CFN configuration for route query parameter match.
   */
  public fun queryParameterMatch(): CfnRoute.QueryParameterProperty

  /**
   * A builder for [QueryParameterMatchConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param queryParameterMatch Route CFN configuration for route query parameter match. 
     */
    public fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty)

    /**
     * @param queryParameterMatch Route CFN configuration for route query parameter match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b756913b6d339249175f1ff466e632b0864552cee341935e4f0536725218c8")
    public
        fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig.builder()

    /**
     * @param queryParameterMatch Route CFN configuration for route query parameter match. 
     */
    override fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty) {
      cdkBuilder.queryParameterMatch(queryParameterMatch.let(CfnRoute.QueryParameterProperty::unwrap))
    }

    /**
     * @param queryParameterMatch Route CFN configuration for route query parameter match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b756913b6d339249175f1ff466e632b0864552cee341935e4f0536725218c8")
    override
        fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty.Builder.() -> Unit):
        Unit = queryParameterMatch(CfnRoute.QueryParameterProperty(queryParameterMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig,
  ) : QueryParameterMatchConfig {
    /**
     * Route CFN configuration for route query parameter match.
     */
    override fun queryParameterMatch(): CfnRoute.QueryParameterProperty =
        unwrap(this).getQueryParameterMatch().let(CfnRoute.QueryParameterProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig):
        QueryParameterMatchConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryParameterMatchConfig):
        software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig = (wrapped as
        Wrapper).cdkObject
  }
}
