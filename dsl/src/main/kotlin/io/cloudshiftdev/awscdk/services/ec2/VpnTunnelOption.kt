package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface VpnTunnelOption {
  /**
   * (deprecated) The pre-shared key (PSK) to establish initial authentication between the virtual
   * private gateway and customer gateway.
   *
   * Allowed characters are
   * alphanumeric characters period `.` and underscores `_`. Must be between 8
   * and 64 characters in length and cannot start with zero (0).
   *
   * Default: an Amazon generated pre-shared key
   *
   * @deprecated Use `preSharedKeySecret` instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

  /**
   * The pre-shared key (PSK) to establish initial authentication between the virtual private
   * gateway and customer gateway.
   *
   * Allowed characters are
   * alphanumeric characters period `.` and underscores `_`. Must be between 8
   * and 64 characters in length and cannot start with zero (0).
   *
   * Default: an Amazon generated pre-shared key
   */
  public fun preSharedKeySecret(): SecretValue? =
      unwrap(this).getPreSharedKeySecret()?.let(SecretValue::wrap)

  /**
   * The range of inside IP addresses for the tunnel.
   *
   * Any specified CIDR blocks must be
   * unique across all VPN connections that use the same virtual private gateway.
   * A size /30 CIDR block from the 169.254.0.0/16 range.
   *
   * Default: an Amazon generated inside IP CIDR
   */
  public fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()

  /**
   * A builder for [VpnTunnelOption]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * @deprecated Use `preSharedKeySecret` instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun preSharedKey(preSharedKey: String)

    /**
     * @param preSharedKeySecret The pre-shared key (PSK) to establish initial authentication
     * between the virtual private gateway and customer gateway.
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     */
    public fun preSharedKeySecret(preSharedKeySecret: SecretValue)

    /**
     * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
     * Any specified CIDR blocks must be
     * unique across all VPN connections that use the same virtual private gateway.
     * A size /30 CIDR block from the 169.254.0.0/16 range.
     */
    public fun tunnelInsideCidr(tunnelInsideCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnTunnelOption.Builder =
        software.amazon.awscdk.services.ec2.VpnTunnelOption.builder()

    /**
     * @param preSharedKey The pre-shared key (PSK) to establish initial authentication between the
     * virtual private gateway and customer gateway.
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     * @deprecated Use `preSharedKeySecret` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun preSharedKey(preSharedKey: String) {
      cdkBuilder.preSharedKey(preSharedKey)
    }

    /**
     * @param preSharedKeySecret The pre-shared key (PSK) to establish initial authentication
     * between the virtual private gateway and customer gateway.
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     */
    override fun preSharedKeySecret(preSharedKeySecret: SecretValue) {
      cdkBuilder.preSharedKeySecret(preSharedKeySecret.let(SecretValue::unwrap))
    }

    /**
     * @param tunnelInsideCidr The range of inside IP addresses for the tunnel.
     * Any specified CIDR blocks must be
     * unique across all VPN connections that use the same virtual private gateway.
     * A size /30 CIDR block from the 169.254.0.0/16 range.
     */
    override fun tunnelInsideCidr(tunnelInsideCidr: String) {
      cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnTunnelOption = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnTunnelOption,
  ) : VpnTunnelOption {
    /**
     * (deprecated) The pre-shared key (PSK) to establish initial authentication between the virtual
     * private gateway and customer gateway.
     *
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     *
     * Default: an Amazon generated pre-shared key
     *
     * @deprecated Use `preSharedKeySecret` instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

    /**
     * The pre-shared key (PSK) to establish initial authentication between the virtual private
     * gateway and customer gateway.
     *
     * Allowed characters are
     * alphanumeric characters period `.` and underscores `_`. Must be between 8
     * and 64 characters in length and cannot start with zero (0).
     *
     * Default: an Amazon generated pre-shared key
     */
    override fun preSharedKeySecret(): SecretValue? =
        unwrap(this).getPreSharedKeySecret()?.let(SecretValue::wrap)

    /**
     * The range of inside IP addresses for the tunnel.
     *
     * Any specified CIDR blocks must be
     * unique across all VPN connections that use the same virtual private gateway.
     * A size /30 CIDR block from the 169.254.0.0/16 range.
     *
     * Default: an Amazon generated inside IP CIDR
     */
    override fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpnTunnelOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnTunnelOption):
        VpnTunnelOption = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnTunnelOption):
        software.amazon.awscdk.services.ec2.VpnTunnelOption = (wrapped as Wrapper).cdkObject
  }
}
