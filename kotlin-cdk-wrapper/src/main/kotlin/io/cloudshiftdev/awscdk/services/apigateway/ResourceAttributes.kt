@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Attributes that can be specified when importing a Resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * RestApi restApi;
 * ResourceAttributes resourceAttributes = ResourceAttributes.builder()
 * .path("path")
 * .resourceId("resourceId")
 * .restApi(restApi)
 * .build();
 * ```
 */
public interface ResourceAttributes {
  /**
   * The full path of this resource.
   */
  public fun path(): String

  /**
   * The ID of the resource.
   */
  public fun resourceId(): String

  /**
   * The rest API that this resource is part of.
   */
  public fun restApi(): IRestApi

  /**
   * A builder for [ResourceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param path The full path of this resource. 
     */
    public fun path(path: String)

    /**
     * @param resourceId The ID of the resource. 
     */
    public fun resourceId(resourceId: String)

    /**
     * @param restApi The rest API that this resource is part of. 
     */
    public fun restApi(restApi: IRestApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.ResourceAttributes.Builder =
        software.amazon.awscdk.services.apigateway.ResourceAttributes.builder()

    /**
     * @param path The full path of this resource. 
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param resourceId The ID of the resource. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param restApi The rest API that this resource is part of. 
     */
    override fun restApi(restApi: IRestApi) {
      cdkBuilder.restApi(restApi.let(IRestApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ResourceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.ResourceAttributes,
  ) : CdkObject(cdkObject), ResourceAttributes {
    /**
     * The full path of this resource.
     */
    override fun path(): String = unwrap(this).getPath()

    /**
     * The ID of the resource.
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * The rest API that this resource is part of.
     */
    override fun restApi(): IRestApi = unwrap(this).getRestApi().let(IRestApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResourceAttributes):
        ResourceAttributes = CdkObjectWrappers.wrap(cdkObject) as? ResourceAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceAttributes):
        software.amazon.awscdk.services.apigateway.ResourceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ResourceAttributes
  }
}
