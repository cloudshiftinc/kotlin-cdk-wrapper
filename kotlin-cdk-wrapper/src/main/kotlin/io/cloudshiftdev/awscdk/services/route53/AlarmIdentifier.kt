@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A CloudWatch alarm that you want Amazon Route 53 health checker to use to determine whether this
 * health check is healthy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * AlarmIdentifier alarmIdentifier = AlarmIdentifier.builder()
 * .name("name")
 * .region("region")
 * .build();
 * ```
 */
public interface AlarmIdentifier {
  /**
   * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
   * determine whether this health check is healthy.
   */
  public fun name(): String

  /**
   * The region of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
   * determine whether this health check is healthy.
   */
  public fun region(): String

  /**
   * A builder for [AlarmIdentifier]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to
     * use to determine whether this health check is healthy. 
     */
    public fun name(name: String)

    /**
     * @param region The region of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.AlarmIdentifier.Builder =
        software.amazon.awscdk.services.route53.AlarmIdentifier.builder()

    /**
     * @param name The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to
     * use to determine whether this health check is healthy. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param region The region of the CloudWatch alarm that you want Amazon Route 53 health
     * checkers to use to determine whether this health check is healthy. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.services.route53.AlarmIdentifier = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.AlarmIdentifier,
  ) : CdkObject(cdkObject),
      AlarmIdentifier {
    /**
     * The name of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether this health check is healthy.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The region of the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether this health check is healthy.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmIdentifier {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.AlarmIdentifier):
        AlarmIdentifier = CdkObjectWrappers.wrap(cdkObject) as? AlarmIdentifier ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmIdentifier):
        software.amazon.awscdk.services.route53.AlarmIdentifier = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.AlarmIdentifier
  }
}
