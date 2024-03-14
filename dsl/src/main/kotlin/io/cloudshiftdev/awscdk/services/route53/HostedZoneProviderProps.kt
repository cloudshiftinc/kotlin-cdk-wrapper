package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostedZoneProviderProps {
  /**
   * The zone domain e.g. example.com.
   */
  public fun domainName(): String

  /**
   * Whether the zone that is being looked up is a private hosted zone.
   *
   * Default: false
   */
  public fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

  /**
   * Specifies the ID of the VPC associated with a private hosted zone.
   *
   * If a VPC ID is provided and privateZone is false, no results will be returned
   * and an error will be raised
   *
   * Default: - No VPC ID
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [HostedZoneProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The zone domain e.g. example.com. 
     */
    public fun domainName(domainName: String)

    /**
     * @param privateZone Whether the zone that is being looked up is a private hosted zone.
     */
    public fun privateZone(privateZone: Boolean)

    /**
     * @param vpcId Specifies the ID of the VPC associated with a private hosted zone.
     * If a VPC ID is provided and privateZone is false, no results will be returned
     * and an error will be raised
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneProviderProps.Builder
        = software.amazon.awscdk.services.route53.HostedZoneProviderProps.builder()

    /**
     * @param domainName The zone domain e.g. example.com. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param privateZone Whether the zone that is being looked up is a private hosted zone.
     */
    override fun privateZone(privateZone: Boolean) {
      cdkBuilder.privateZone(privateZone)
    }

    /**
     * @param vpcId Specifies the ID of the VPC associated with a private hosted zone.
     * If a VPC ID is provided and privateZone is false, no results will be returned
     * and an error will be raised
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.HostedZoneProviderProps,
  ) : CdkObject(cdkObject), HostedZoneProviderProps {
    /**
     * The zone domain e.g. example.com.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * Whether the zone that is being looked up is a private hosted zone.
     *
     * Default: false
     */
    override fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

    /**
     * Specifies the ID of the VPC associated with a private hosted zone.
     *
     * If a VPC ID is provided and privateZone is false, no results will be returned
     * and an error will be raised
     *
     * Default: - No VPC ID
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneProviderProps):
        HostedZoneProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneProviderProps):
        software.amazon.awscdk.services.route53.HostedZoneProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.HostedZoneProviderProps
  }
}