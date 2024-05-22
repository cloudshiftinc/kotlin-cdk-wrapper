@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudfront.IOrigin
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindConfig
import io.cloudshiftdev.awscdk.services.cloudfront.OriginBindOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * An Origin that represents a group.
 *
 * Consists of a primary Origin,
 * and a fallback Origin called when the primary returns one of the provided HTTP status codes.
 *
 * Example:
 *
 * ```
 * Bucket myBucket = new Bucket(this, "myBucket");
 * Distribution.Builder.create(this, "myDist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(OriginGroup.Builder.create()
 * .primaryOrigin(new S3Origin(myBucket))
 * .fallbackOrigin(new HttpOrigin("www.example.com"))
 * // optional, defaults to: 500, 502, 503 and 504
 * .fallbackStatusCodes(List.of(404))
 * .build())
 * .build())
 * .build();
 * ```
 */
public open class OriginGroup(
  cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroup,
) : CdkObject(cdkObject), IOrigin {
  public constructor(props: OriginGroupProps) :
      this(software.amazon.awscdk.services.cloudfront.origins.OriginGroup(props.let(OriginGroupProps.Companion::unwrap))
  )

  public constructor(props: OriginGroupProps.Builder.() -> Unit) : this(OriginGroupProps(props)
  )

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: OriginBindOptions): OriginBindConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(OriginBindOptions.Companion::unwrap)).let(OriginBindConfig::wrap)

  /**
   * The method called when a given Origin is added (for the first time) to a Distribution.
   *
   * @param scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4d8f445ceb4e4ebb177be4645de7fd3d72f0f5d66bcf420280cc1b7bc73b342")
  public override fun bind(scope: Construct, options: OriginBindOptions.Builder.() -> Unit):
      OriginBindConfig = bind(scope, OriginBindOptions(options))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.origins.OriginGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The fallback origin that should serve requests when the primary fails.
     *
     * @param fallbackOrigin The fallback origin that should serve requests when the primary fails. 
     */
    public fun fallbackOrigin(fallbackOrigin: IOrigin)

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin. 
     */
    public fun fallbackStatusCodes(fallbackStatusCodes: List<Number>)

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin. 
     */
    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number)

    /**
     * The primary origin that should serve requests for this group.
     *
     * @param primaryOrigin The primary origin that should serve requests for this group. 
     */
    public fun primaryOrigin(primaryOrigin: IOrigin)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.origins.OriginGroup.Builder =
        software.amazon.awscdk.services.cloudfront.origins.OriginGroup.Builder.create()

    /**
     * The fallback origin that should serve requests when the primary fails.
     *
     * @param fallbackOrigin The fallback origin that should serve requests when the primary fails. 
     */
    override fun fallbackOrigin(fallbackOrigin: IOrigin) {
      cdkBuilder.fallbackOrigin(fallbackOrigin.let(IOrigin.Companion::unwrap))
    }

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin. 
     */
    override fun fallbackStatusCodes(fallbackStatusCodes: List<Number>) {
      cdkBuilder.fallbackStatusCodes(fallbackStatusCodes)
    }

    /**
     * The list of HTTP status codes that, when returned from the primary origin, would cause
     * querying the fallback origin.
     *
     * Default: - 500, 502, 503 and 504
     *
     * @param fallbackStatusCodes The list of HTTP status codes that, when returned from the primary
     * origin, would cause querying the fallback origin. 
     */
    override fun fallbackStatusCodes(vararg fallbackStatusCodes: Number): Unit =
        fallbackStatusCodes(fallbackStatusCodes.toList())

    /**
     * The primary origin that should serve requests for this group.
     *
     * @param primaryOrigin The primary origin that should serve requests for this group. 
     */
    override fun primaryOrigin(primaryOrigin: IOrigin) {
      cdkBuilder.primaryOrigin(primaryOrigin.let(IOrigin.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.OriginGroup =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroup {
      val builderImpl = BuilderImpl()
      return OriginGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.OriginGroup):
        OriginGroup = OriginGroup(cdkObject)

    internal fun unwrap(wrapped: OriginGroup):
        software.amazon.awscdk.services.cloudfront.origins.OriginGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.OriginGroup
  }
}
