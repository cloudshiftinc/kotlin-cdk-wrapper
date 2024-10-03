@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for a SRV record value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * SrvRecordValue srvRecordValue = SrvRecordValue.builder()
 * .hostName("hostName")
 * .port(123)
 * .priority(123)
 * .weight(123)
 * .build();
 * ```
 */
public interface SrvRecordValue {
  /**
   * The server host name.
   */
  public fun hostName(): String

  /**
   * The port.
   */
  public fun port(): Number

  /**
   * The priority.
   */
  public fun priority(): Number

  /**
   * The weight.
   */
  public fun weight(): Number

  /**
   * A builder for [SrvRecordValue]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostName The server host name. 
     */
    public fun hostName(hostName: String)

    /**
     * @param port The port. 
     */
    public fun port(port: Number)

    /**
     * @param priority The priority. 
     */
    public fun priority(priority: Number)

    /**
     * @param weight The weight. 
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.SrvRecordValue.Builder =
        software.amazon.awscdk.services.route53.SrvRecordValue.builder()

    /**
     * @param hostName The server host name. 
     */
    override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    /**
     * @param port The port. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param priority The priority. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param weight The weight. 
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.route53.SrvRecordValue = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.SrvRecordValue,
  ) : CdkObject(cdkObject),
      SrvRecordValue {
    /**
     * The server host name.
     */
    override fun hostName(): String = unwrap(this).getHostName()

    /**
     * The port.
     */
    override fun port(): Number = unwrap(this).getPort()

    /**
     * The priority.
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The weight.
     */
    override fun weight(): Number = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SrvRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.SrvRecordValue):
        SrvRecordValue = CdkObjectWrappers.wrap(cdkObject) as? SrvRecordValue ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SrvRecordValue):
        software.amazon.awscdk.services.route53.SrvRecordValue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.SrvRecordValue
  }
}
