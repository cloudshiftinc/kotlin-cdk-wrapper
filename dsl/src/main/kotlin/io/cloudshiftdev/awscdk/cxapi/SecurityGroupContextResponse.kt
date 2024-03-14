package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SecurityGroupContextResponse {
  /**
   * Whether the security group allows all outbound traffic.
   *
   * This will be true
   * when the security group has all-protocol egress permissions to access both
   * `0.0.0.0/0` and `::/0`.
   */
  public fun allowAllOutbound(): Boolean

  /**
   * The security group's id.
   */
  public fun securityGroupId(): String

  /**
   * A builder for [SecurityGroupContextResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllOutbound Whether the security group allows all outbound traffic. 
     * This will be true
     * when the security group has all-protocol egress permissions to access both
     * `0.0.0.0/0` and `::/0`.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param securityGroupId The security group's id. 
     */
    public fun securityGroupId(securityGroupId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.SecurityGroupContextResponse.Builder =
        software.amazon.awscdk.cxapi.SecurityGroupContextResponse.builder()

    /**
     * @param allowAllOutbound Whether the security group allows all outbound traffic. 
     * This will be true
     * when the security group has all-protocol egress permissions to access both
     * `0.0.0.0/0` and `::/0`.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param securityGroupId The security group's id. 
     */
    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    public fun build(): software.amazon.awscdk.cxapi.SecurityGroupContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cxapi.SecurityGroupContextResponse,
  ) : CdkObject(cdkObject), SecurityGroupContextResponse {
    /**
     * Whether the security group allows all outbound traffic.
     *
     * This will be true
     * when the security group has all-protocol egress permissions to access both
     * `0.0.0.0/0` and `::/0`.
     */
    override fun allowAllOutbound(): Boolean = unwrap(this).getAllowAllOutbound()

    /**
     * The security group's id.
     */
    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.SecurityGroupContextResponse):
        SecurityGroupContextResponse = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextResponse):
        software.amazon.awscdk.cxapi.SecurityGroupContextResponse = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.cxapi.SecurityGroupContextResponse
  }
}
