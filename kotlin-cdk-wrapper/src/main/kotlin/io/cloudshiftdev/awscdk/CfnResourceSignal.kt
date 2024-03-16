@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * When AWS CloudFormation creates the associated resource, configures the number of required
 * success signals and the length of time that AWS CloudFormation waits for those signals.
 *
 * Example:
 *
 * ```
 * CfnResource resource;
 * resource.getCfnOptions().getCreationPolicy() = CfnCreationPolicy.builder()
 * .resourceSignal(CfnResourceSignal.builder()
 * .count(3)
 * .timeout("PR15M")
 * .build())
 * .build();
 * ```
 */
public interface CfnResourceSignal {
  /**
   * The number of success signals AWS CloudFormation must receive before it sets the resource
   * status as CREATE_COMPLETE.
   *
   * If the resource receives a failure signal or doesn't receive the specified number of signals
   * before the timeout period
   * expires, the resource creation fails and AWS CloudFormation rolls the stack back.
   */
  public fun count(): Number? = unwrap(this).getCount()

  /**
   * The length of time that AWS CloudFormation waits for the number of signals that was specified
   * in the Count property.
   *
   * The timeout period starts after AWS CloudFormation starts creating the resource, and the
   * timeout expires no sooner
   * than the time you specify but can occur shortly thereafter. The maximum time that you can
   * specify is 12 hours.
   */
  public fun timeout(): String? = unwrap(this).getTimeout()

  /**
   * A builder for [CfnResourceSignal]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param count The number of success signals AWS CloudFormation must receive before it sets the
     * resource status as CREATE_COMPLETE.
     * If the resource receives a failure signal or doesn't receive the specified number of signals
     * before the timeout period
     * expires, the resource creation fails and AWS CloudFormation rolls the stack back.
     */
    public fun count(count: Number)

    /**
     * @param timeout The length of time that AWS CloudFormation waits for the number of signals
     * that was specified in the Count property.
     * The timeout period starts after AWS CloudFormation starts creating the resource, and the
     * timeout expires no sooner
     * than the time you specify but can occur shortly thereafter. The maximum time that you can
     * specify is 12 hours.
     */
    public fun timeout(timeout: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnResourceSignal.Builder =
        software.amazon.awscdk.CfnResourceSignal.builder()

    /**
     * @param count The number of success signals AWS CloudFormation must receive before it sets the
     * resource status as CREATE_COMPLETE.
     * If the resource receives a failure signal or doesn't receive the specified number of signals
     * before the timeout period
     * expires, the resource creation fails and AWS CloudFormation rolls the stack back.
     */
    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    /**
     * @param timeout The length of time that AWS CloudFormation waits for the number of signals
     * that was specified in the Count property.
     * The timeout period starts after AWS CloudFormation starts creating the resource, and the
     * timeout expires no sooner
     * than the time you specify but can occur shortly thereafter. The maximum time that you can
     * specify is 12 hours.
     */
    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.CfnResourceSignal = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnResourceSignal,
  ) : CdkObject(cdkObject), CfnResourceSignal {
    /**
     * The number of success signals AWS CloudFormation must receive before it sets the resource
     * status as CREATE_COMPLETE.
     *
     * If the resource receives a failure signal or doesn't receive the specified number of signals
     * before the timeout period
     * expires, the resource creation fails and AWS CloudFormation rolls the stack back.
     */
    override fun count(): Number? = unwrap(this).getCount()

    /**
     * The length of time that AWS CloudFormation waits for the number of signals that was specified
     * in the Count property.
     *
     * The timeout period starts after AWS CloudFormation starts creating the resource, and the
     * timeout expires no sooner
     * than the time you specify but can occur shortly thereafter. The maximum time that you can
     * specify is 12 hours.
     */
    override fun timeout(): String? = unwrap(this).getTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSignal {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnResourceSignal): CfnResourceSignal =
        CdkObjectWrappers.wrap(cdkObject) as CfnResourceSignal

    internal fun unwrap(wrapped: CfnResourceSignal): software.amazon.awscdk.CfnResourceSignal =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnResourceSignal
  }
}
