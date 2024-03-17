@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Query input for looking up a security group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloudassembly.schema.*;
 * SecurityGroupContextQuery securityGroupContextQuery = SecurityGroupContextQuery.builder()
 * .account("account")
 * .region("region")
 * // the properties below are optional
 * .lookupRoleArn("lookupRoleArn")
 * .securityGroupId("securityGroupId")
 * .securityGroupName("securityGroupName")
 * .vpcId("vpcId")
 * .build();
 * ```
 */
public interface SecurityGroupContextQuery {
  /**
   * Query account.
   */
  public fun account(): String

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * Query region.
   */
  public fun region(): String

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
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

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
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
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

    public fun build(): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery,
  ) : CdkObject(cdkObject), SecurityGroupContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

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
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery):
        SecurityGroupContextQuery = CdkObjectWrappers.wrap(cdkObject) as? SecurityGroupContextQuery
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery
  }
}
