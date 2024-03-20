@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFront Function.
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
public open class Function internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.Function,
) : Resource(cdkObject), IFunction {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FunctionProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.Function(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(FunctionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: FunctionProps.Builder.() -> Unit,
  ) : this(scope, id, FunctionProps(props)
  )

  /**
   * the ARN of the CloudFront function.
   */
  public override fun functionArn(): String = unwrap(this).getFunctionArn()

  /**
   * the name of the CloudFront function.
   */
  public override fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * the runtime of the CloudFront function.
   */
  public open fun functionRuntime(): String = unwrap(this).getFunctionRuntime()

  /**
   * the deployment stage of the CloudFront function.
   */
  public open fun functionStage(): String = unwrap(this).getFunctionStage()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.Function].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The source code of the function.
     *
     * @param code The source code of the function. 
     */
    public fun code(code: FunctionCode)

    /**
     * A comment to describe the function.
     *
     * Default: - same as `functionName`
     *
     * @param comment A comment to describe the function. 
     */
    public fun comment(comment: String)

    /**
     * A name to identify the function.
     *
     * Default: - generated from the `id`
     *
     * @param functionName A name to identify the function. 
     */
    public fun functionName(functionName: String)

    /**
     * The Key Value Store to associate with this function.
     *
     * In order to associate a Key Value Store, the `runtime` must be
     * `cloudfront-js-2.0` or newer.
     *
     * Default: - no key value store is associated
     *
     * @param keyValueStore The Key Value Store to associate with this function. 
     */
    public fun keyValueStore(keyValueStore: IKeyValueStore)

    /**
     * The runtime environment for the function.
     *
     * Default: FunctionRuntime.JS_1_0 (unless `keyValueStore` is specified, then
     * `FunctionRuntime.JS_2_0`)
     *
     * @param runtime The runtime environment for the function. 
     */
    public fun runtime(runtime: FunctionRuntime)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Function.Builder =
        software.amazon.awscdk.services.cloudfront.Function.Builder.create(scope, id)

    /**
     * The source code of the function.
     *
     * @param code The source code of the function. 
     */
    override fun code(code: FunctionCode) {
      cdkBuilder.code(code.let(FunctionCode::unwrap))
    }

    /**
     * A comment to describe the function.
     *
     * Default: - same as `functionName`
     *
     * @param comment A comment to describe the function. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * A name to identify the function.
     *
     * Default: - generated from the `id`
     *
     * @param functionName A name to identify the function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * The Key Value Store to associate with this function.
     *
     * In order to associate a Key Value Store, the `runtime` must be
     * `cloudfront-js-2.0` or newer.
     *
     * Default: - no key value store is associated
     *
     * @param keyValueStore The Key Value Store to associate with this function. 
     */
    override fun keyValueStore(keyValueStore: IKeyValueStore) {
      cdkBuilder.keyValueStore(keyValueStore.let(IKeyValueStore::unwrap))
    }

    /**
     * The runtime environment for the function.
     *
     * Default: FunctionRuntime.JS_1_0 (unless `keyValueStore` is specified, then
     * `FunctionRuntime.JS_2_0`)
     *
     * @param runtime The runtime environment for the function. 
     */
    override fun runtime(runtime: FunctionRuntime) {
      cdkBuilder.runtime(runtime.let(FunctionRuntime::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Function = cdkBuilder.build()
  }

  public companion object {
    public fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes,
    ): IFunction =
        software.amazon.awscdk.services.cloudfront.Function.fromFunctionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(FunctionAttributes::unwrap)).let(IFunction::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("91316568d90081b9d7f3c253151ac0e56a539482d4c8c8d96412d774c1738c7f")
    public fun fromFunctionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: FunctionAttributes.Builder.() -> Unit,
    ): IFunction = fromFunctionAttributes(scope, id, FunctionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Function {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Function(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Function): Function =
        Function(cdkObject)

    internal fun unwrap(wrapped: Function): software.amazon.awscdk.services.cloudfront.Function =
        wrapped.cdkObject
  }
}
