package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface FunctionAssociation {
  /**
   * The type of event which should invoke the function.
   */
  public fun eventType(): FunctionEventType

  /**
   * The CloudFront function that will be invoked.
   */
  public fun function(): IFunction

  /**
   * A builder for [FunctionAssociation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventType The type of event which should invoke the function. 
     */
    public fun eventType(eventType: FunctionEventType)

    /**
     * @param function The CloudFront function that will be invoked. 
     */
    public fun function(function: IFunction)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.FunctionAssociation.Builder =
        software.amazon.awscdk.services.cloudfront.FunctionAssociation.builder()

    /**
     * @param eventType The type of event which should invoke the function. 
     */
    override fun eventType(eventType: FunctionEventType) {
      cdkBuilder.eventType(eventType.let(FunctionEventType::unwrap))
    }

    /**
     * @param function The CloudFront function that will be invoked. 
     */
    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.FunctionAssociation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAssociation,
  ) : FunctionAssociation {
    /**
     * The type of event which should invoke the function.
     */
    override fun eventType(): FunctionEventType =
        unwrap(this).getEventType().let(FunctionEventType::wrap)

    /**
     * The CloudFront function that will be invoked.
     */
    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAssociation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.FunctionAssociation):
        FunctionAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionAssociation):
        software.amazon.awscdk.services.cloudfront.FunctionAssociation = (wrapped as
        Wrapper).cdkObject
  }
}
