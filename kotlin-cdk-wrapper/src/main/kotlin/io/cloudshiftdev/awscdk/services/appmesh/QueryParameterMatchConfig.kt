@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration for `QueryParameterMatch`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * QueryParameterMatchConfig queryParameterMatchConfig = QueryParameterMatchConfig.builder()
 * .queryParameterMatch(QueryParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .match(HttpQueryParameterMatchProperty.builder()
 * .exact("exact")
 * .build())
 * .build())
 * .build();
 * ```
 */
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43b756913b6d339249175f1ff466e632b0864552cee341935e4f0536725218c8")
    override
        fun queryParameterMatch(queryParameterMatch: CfnRoute.QueryParameterProperty.Builder.() -> Unit):
        Unit = queryParameterMatch(CfnRoute.QueryParameterProperty(queryParameterMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig,
  ) : CdkObject(cdkObject), QueryParameterMatchConfig {
    /**
     * Route CFN configuration for route query parameter match.
     */
    override fun queryParameterMatch(): CfnRoute.QueryParameterProperty =
        unwrap(this).getQueryParameterMatch().let(CfnRoute.QueryParameterProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): QueryParameterMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig):
        QueryParameterMatchConfig = CdkObjectWrappers.wrap(cdkObject) as? QueryParameterMatchConfig
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueryParameterMatchConfig):
        software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.QueryParameterMatchConfig
  }
}
