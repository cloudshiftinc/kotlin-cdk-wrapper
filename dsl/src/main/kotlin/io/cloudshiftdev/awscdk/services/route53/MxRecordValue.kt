package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface MxRecordValue {
  /**
   * The mail server host name.
   */
  public fun hostName(): String

  /**
   * The priority.
   */
  public fun priority(): Number

  /**
   * A builder for [MxRecordValue]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostName The mail server host name. 
     */
    public fun hostName(hostName: String)

    /**
     * @param priority The priority. 
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.MxRecordValue.Builder =
        software.amazon.awscdk.services.route53.MxRecordValue.builder()

    /**
     * @param hostName The mail server host name. 
     */
    override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    /**
     * @param priority The priority. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.route53.MxRecordValue = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.MxRecordValue,
  ) : CdkObject(cdkObject), MxRecordValue {
    /**
     * The mail server host name.
     */
    override fun hostName(): String = unwrap(this).getHostName()

    /**
     * The priority.
     */
    override fun priority(): Number = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MxRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.MxRecordValue):
        MxRecordValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MxRecordValue):
        software.amazon.awscdk.services.route53.MxRecordValue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.MxRecordValue
  }
}
