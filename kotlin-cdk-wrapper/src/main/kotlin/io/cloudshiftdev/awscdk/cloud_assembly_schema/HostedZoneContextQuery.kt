@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Query to hosted zone context provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * HostedZoneContextQuery hostedZoneContextQuery = HostedZoneContextQuery.builder()
 * .account("account")
 * .domainName("domainName")
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .privateZone(false)
 * .vpcId("vpcId")
 * .build();
 * ```
 */
public interface HostedZoneContextQuery : ContextLookupRoleOptions {
  /**
   * The domain name e.g. example.com to lookup.
   */
  public fun domainName(): String

  /**
   * True if the zone you want to find is a private hosted zone.
   *
   * Default: false
   */
  public fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

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
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    /**
     * @param domainName The domain name e.g. example.com to lookup. 
     */
    public fun domainName(domainName: String)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

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
        software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery.Builder =
        software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param assumeRoleAdditionalOptions Additional options to pass to STS when assuming the lookup
     * role.
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     */
    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
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
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
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

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery,
  ) : CdkObject(cdkObject),
      HostedZoneContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * Additional options to pass to STS when assuming the lookup role.
     *
     * * `RoleArn` should not be used. Use the dedicated `lookupRoleArn` property instead.
     * * `ExternalId` should not be used. Use the dedicated `lookupRoleExternalId` instead.
     *
     * Default: - No additional options.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/STS.html#assumeRole-property)
     */
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

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
     * The ExternalId that needs to be supplied while assuming this role.
     *
     * Default: - No ExternalId will be supplied
     */
    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

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
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery):
        HostedZoneContextQuery = CdkObjectWrappers.wrap(cdkObject) as? HostedZoneContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.HostedZoneContextQuery
  }
}
