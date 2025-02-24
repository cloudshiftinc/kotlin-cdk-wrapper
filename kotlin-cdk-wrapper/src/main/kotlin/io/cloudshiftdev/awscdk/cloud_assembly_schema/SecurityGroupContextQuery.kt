@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Query input for looking up a security group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * SecurityGroupContextQuery securityGroupContextQuery = SecurityGroupContextQuery.builder()
 * .account("account")
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .securityGroupId("securityGroupId")
 * .securityGroupName("securityGroupName")
 * .vpcId("vpcId")
 * .build();
 * ```
 */
public interface SecurityGroupContextQuery : ContextLookupRoleOptions {
  /**
   * Security group id.
   *
   * Default: - None
   */
  public fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

  /**
   * Security group name.
   *
   * Default: - None
   */
  public fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

  /**
   * VPC ID.
   *
   * Default: - None
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [SecurityGroupContextQuery]
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
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param lookupRoleExternalId The ExternalId that needs to be supplied while assuming this
     * role.
     */
    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)

    /**
     * @param securityGroupId Security group id.
     */
    public fun securityGroupId(securityGroupId: String)

    /**
     * @param securityGroupName Security group name.
     */
    public fun securityGroupName(securityGroupName: String)

    /**
     * @param vpcId VPC ID.
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery.Builder =
        software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery.builder()

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
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param securityGroupId Security group id.
     */
    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    /**
     * @param securityGroupName Security group name.
     */
    override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    /**
     * @param vpcId VPC ID.
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery,
  ) : CdkObject(cdkObject),
      SecurityGroupContextQuery {
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
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()

    /**
     * Security group id.
     *
     * Default: - None
     */
    override fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

    /**
     * Security group name.
     *
     * Default: - None
     */
    override fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

    /**
     * VPC ID.
     *
     * Default: - None
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery):
        SecurityGroupContextQuery = CdkObjectWrappers.wrap(cdkObject) as? SecurityGroupContextQuery
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextQuery):
        software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloud_assembly_schema.SecurityGroupContextQuery
  }
}
