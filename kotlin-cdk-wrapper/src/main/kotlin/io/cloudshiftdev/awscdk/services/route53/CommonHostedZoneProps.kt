@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Common properties to create a Route 53 hosted zone.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * CommonHostedZoneProps commonHostedZoneProps = CommonHostedZoneProps.builder()
 * .zoneName("zoneName")
 * // the properties below are optional
 * .addTrailingDot(false)
 * .comment("comment")
 * .queryLogsLogGroupArn("queryLogsLogGroupArn")
 * .build();
 * ```
 */
public interface CommonHostedZoneProps {
  /**
   * Whether to add a trailing dot to the zone name.
   *
   * Default: true
   */
  public fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

  /**
   * Any comments that you want to include about the hosted zone.
   *
   * Default: none
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
   * logs to.
   *
   * Default: disabled
   */
  public fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

  /**
   * The name of the domain.
   *
   * For resource record types that include a domain
   * name, specify a fully qualified domain name.
   */
  public fun zoneName(): String

  /**
   * A builder for [CommonHostedZoneProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    public fun addTrailingDot(addTrailingDot: Boolean)

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    public fun comment(comment: String)

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CommonHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.CommonHostedZoneProps.builder()

    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.CommonHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CommonHostedZoneProps,
  ) : CdkObject(cdkObject), CommonHostedZoneProps {
    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     */
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     */
    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CommonHostedZoneProps):
        CommonHostedZoneProps = CdkObjectWrappers.wrap(cdkObject) as? CommonHostedZoneProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonHostedZoneProps):
        software.amazon.awscdk.services.route53.CommonHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.CommonHostedZoneProps
  }
}
