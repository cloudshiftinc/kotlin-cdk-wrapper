package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface RestApiAttributes {
  /**
   * The ID of the API Gateway RestApi.
   */
  public fun restApiId(): String

  /**
   * The name of the API Gateway RestApi.
   *
   * Default: - ID of the RestApi construct.
   */
  public fun restApiName(): String? = unwrap(this).getRestApiName()

  /**
   * The resource ID of the root resource.
   */
  public fun rootResourceId(): String

  /**
   * A builder for [RestApiAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param restApiId The ID of the API Gateway RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param restApiName The name of the API Gateway RestApi.
     */
    public fun restApiName(restApiName: String)

    /**
     * @param rootResourceId The resource ID of the root resource. 
     */
    public fun rootResourceId(rootResourceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiAttributes.Builder =
        software.amazon.awscdk.services.apigateway.RestApiAttributes.builder()

    /**
     * @param restApiId The ID of the API Gateway RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param restApiName The name of the API Gateway RestApi.
     */
    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    /**
     * @param rootResourceId The resource ID of the root resource. 
     */
    override fun rootResourceId(rootResourceId: String) {
      cdkBuilder.rootResourceId(rootResourceId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes,
  ) : RestApiAttributes {
    /**
     * The ID of the API Gateway RestApi.
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The name of the API Gateway RestApi.
     *
     * Default: - ID of the RestApi construct.
     */
    override fun restApiName(): String? = unwrap(this).getRestApiName()

    /**
     * The resource ID of the root resource.
     */
    override fun rootResourceId(): String = unwrap(this).getRootResourceId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiAttributes):
        RestApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiAttributes):
        software.amazon.awscdk.services.apigateway.RestApiAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
