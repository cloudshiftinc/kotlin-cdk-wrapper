package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostedZoneContextQuery {
  /**
   * Query account.
   */
  public fun account(): String

  /**
   * The domain name e.g. example.com to lookup.
   */
  public fun domainName(): String

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * True if the zone you want to find is a private hosted zone.
   *
   * Default: false
   */
  public fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

  /**
   * Query region.
   */
  public fun region(): String

  /**
   * The VPC ID to that the private zone must be associated with.
   *
   * If you provide VPC ID and privateZone is false, this will return no results
   * and raise an error.
   *
   * Default: - Required if privateZone=true
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [HostedZoneContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param domainName The domain name e.g. example.com to lookup. 
     */
    public fun domainName(domainName: String)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param privateZone True if the zone you want to find is a private hosted zone.
     */
    public fun privateZone(privateZone: Boolean)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)

    /**
     * @param vpcId The VPC ID to that the private zone must be associated with.
     * If you provide VPC ID and privateZone is false, this will return no results
     * and raise an error.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param domainName The domain name e.g. example.com to lookup. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param privateZone True if the zone you want to find is a private hosted zone.
     */
    override fun privateZone(privateZone: Boolean) {
      cdkBuilder.privateZone(privateZone)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param vpcId The VPC ID to that the private zone must be associated with.
     * If you provide VPC ID and privateZone is false, this will return no results
     * and raise an error.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery,
  ) : CdkObject(cdkObject), HostedZoneContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The domain name e.g. example.com to lookup.
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * True if the zone you want to find is a private hosted zone.
     *
     * Default: false
     */
    override fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * The VPC ID to that the private zone must be associated with.
     *
     * If you provide VPC ID and privateZone is false, this will return no results
     * and raise an error.
     *
     * Default: - Required if privateZone=true
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery):
        HostedZoneContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneContextQuery):
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery
  }
}
