package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HeaderMatchConfig {
  /**
   * Route CFN configuration for the route header match.
   */
  public fun headerMatch(): CfnRoute.HttpRouteHeaderProperty

  /**
   * A builder for [HeaderMatchConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty)

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c27a7fcd39f5eb13fc38f4a7eecc86d2b2eeccb91d1c9f490d650243ee950559")
    public fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HeaderMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.HeaderMatchConfig.builder()

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    override fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty) {
      cdkBuilder.headerMatch(headerMatch.let(CfnRoute.HttpRouteHeaderProperty::unwrap))
    }

    /**
     * @param headerMatch Route CFN configuration for the route header match. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c27a7fcd39f5eb13fc38f4a7eecc86d2b2eeccb91d1c9f490d650243ee950559")
    override fun headerMatch(headerMatch: CfnRoute.HttpRouteHeaderProperty.Builder.() -> Unit): Unit
        = headerMatch(CfnRoute.HttpRouteHeaderProperty(headerMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.HeaderMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatchConfig,
  ) : HeaderMatchConfig {
    /**
     * Route CFN configuration for the route header match.
     */
    override fun headerMatch(): CfnRoute.HttpRouteHeaderProperty =
        unwrap(this).getHeaderMatch().let(CfnRoute.HttpRouteHeaderProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HeaderMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HeaderMatchConfig):
        HeaderMatchConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HeaderMatchConfig):
        software.amazon.awscdk.services.appmesh.HeaderMatchConfig = (wrapped as Wrapper).cdkObject
  }
}
