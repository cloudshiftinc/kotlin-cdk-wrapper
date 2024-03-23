@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for creating a CloudFront Function.
 *
 * Example:
 *
 * ```
 * Bucket s3Bucket;
 * // Add a cloudfront Function to a Distribution
 * Function cfFunction = Function.Builder.create(this, "Function")
 * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
 * .runtime(FunctionRuntime.JS_2_0)
 * .build();
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .function(cfFunction)
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface FunctionProps {
  /**
   * The source code of the function.
   */
  public fun code(): FunctionCode

  /**
   * A comment to describe the function.
   *
   * Default: - same as `functionName`
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A name to identify the function.
   *
   * Default: - generated from the `id`
   */
  public fun functionName(): String? = unwrap(this).getFunctionName()

  /**
   * The Key Value Store to associate with this function.
   *
   * In order to associate a Key Value Store, the `runtime` must be
   * `cloudfront-js-2.0` or newer.
   *
   * Default: - no key value store is associated
   */
  public fun keyValueStore(): IKeyValueStore? =
      unwrap(this).getKeyValueStore()?.let(IKeyValueStore::wrap)

  /**
   * The runtime environment for the function.
   *
   * Default: FunctionRuntime.JS_1_0 (unless `keyValueStore` is specified, then
   * `FunctionRuntime.JS_2_0`)
   */
  public fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)

  /**
   * A builder for [FunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The source code of the function. 
     */
    public fun code(code: FunctionCode)

    /**
     * @param comment A comment to describe the function.
     */
    public fun comment(comment: String)

    /**
     * @param functionName A name to identify the function.
     */
    public fun functionName(functionName: String)

    /**
     * @param keyValueStore The Key Value Store to associate with this function.
     * In order to associate a Key Value Store, the `runtime` must be
     * `cloudfront-js-2.0` or newer.
     */
    public fun keyValueStore(keyValueStore: IKeyValueStore)

    /**
     * @param runtime The runtime environment for the function.
     */
    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionProps.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionProps.builder()

    /**
     * @param code The source code of the function. 
     */
    override fun code(code: FunctionCode) {
      cdkBuilder.code(code.let(FunctionCode::unwrap))
    }

    /**
     * @param comment A comment to describe the function.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param functionName A name to identify the function.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param keyValueStore The Key Value Store to associate with this function.
     * In order to associate a Key Value Store, the `runtime` must be
     * `cloudfront-js-2.0` or newer.
     */
    override fun keyValueStore(keyValueStore: IKeyValueStore) {
      cdkBuilder.keyValueStore(keyValueStore.let(IKeyValueStore::unwrap))
    }

    /**
     * @param runtime The runtime environment for the function.
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.FunctionProps,
  ) : CdkObject(cdkObject), FunctionProps {
    /**
     * The source code of the function.
     */
    override fun code(): FunctionCode = unwrap(this).getCode().let(FunctionCode::wrap)

    /**
     * A comment to describe the function.
     *
     * Default: - same as `functionName`
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * A name to identify the function.
     *
     * Default: - generated from the `id`
     */
    override fun functionName(): String? = unwrap(this).getFunctionName()

    /**
     * The Key Value Store to associate with this function.
     *
     * In order to associate a Key Value Store, the `runtime` must be
     * `cloudfront-js-2.0` or newer.
     *
     * Default: - no key value store is associated
     */
    override fun keyValueStore(): IKeyValueStore? =
        unwrap(this).getKeyValueStore()?.let(IKeyValueStore::wrap)

    /**
     * The runtime environment for the function.
     *
     * Default: FunctionRuntime.JS_1_0 (unless `keyValueStore` is specified, then
     * `FunctionRuntime.JS_2_0`)
     */
    override fun runtime(): FunctionRuntime? = unwrap(this).getRuntime()?.let(FunctionRuntime::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionProps):
        FunctionProps = CdkObjectWrappers.wrap(cdkObject) as? FunctionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionProps):
        software.amazon.awscdk.services.cloudfront.FunctionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.FunctionProps
  }
}
