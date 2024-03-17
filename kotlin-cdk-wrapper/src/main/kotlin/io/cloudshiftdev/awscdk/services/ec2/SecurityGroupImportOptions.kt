@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Additional options for imported security groups.
 *
 * Example:
 *
 * ```
 * ISecurityGroup securityGroup = SecurityGroup.fromSecurityGroupId(this, "SG", "sg-12345",
 * SecurityGroupImportOptions.builder()
 * .mutable(false)
 * .build());
 * ```
 */
public interface SecurityGroupImportOptions {
  /**
   * Mark the SecurityGroup as having been created allowing all outbound ipv6 traffic.
   *
   * Only if this is set to false will egress rules for ipv6 be added to this security
   * group. Be aware, this would undo any potential "all outbound traffic"
   * default.
   *
   * Default: false
   */
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  /**
   * Mark the SecurityGroup as having been created allowing all outbound traffic.
   *
   * Only if this is set to false will egress rules be added to this security
   * group. Be aware, this would undo any potential "all outbound traffic"
   * default.
   *
   * Default: true
   */
  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  /**
   * If a SecurityGroup is mutable CDK can add rules to existing groups.
   *
   * Beware that making a SecurityGroup immutable might lead to issue
   * due to missing ingress/egress rules for new resources.
   *
   * Default: true
   */
  public fun mutable(): Boolean? = unwrap(this).getMutable()

  /**
   * A builder for [SecurityGroupImportOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowAllIpv6Outbound Mark the SecurityGroup as having been created allowing all
     * outbound ipv6 traffic.
     * Only if this is set to false will egress rules for ipv6 be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     */
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    /**
     * @param allowAllOutbound Mark the SecurityGroup as having been created allowing all outbound
     * traffic.
     * Only if this is set to false will egress rules be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean)

    /**
     * @param mutable If a SecurityGroup is mutable CDK can add rules to existing groups.
     * Beware that making a SecurityGroup immutable might lead to issue
     * due to missing ingress/egress rules for new resources.
     */
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions.builder()

    /**
     * @param allowAllIpv6Outbound Mark the SecurityGroup as having been created allowing all
     * outbound ipv6 traffic.
     * Only if this is set to false will egress rules for ipv6 be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     */
    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    /**
     * @param allowAllOutbound Mark the SecurityGroup as having been created allowing all outbound
     * traffic.
     * Only if this is set to false will egress rules be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     */
    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param mutable If a SecurityGroup is mutable CDK can add rules to existing groups.
     * Beware that making a SecurityGroup immutable might lead to issue
     * due to missing ingress/egress rules for new resources.
     */
    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroupImportOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions,
  ) : CdkObject(cdkObject), SecurityGroupImportOptions {
    /**
     * Mark the SecurityGroup as having been created allowing all outbound ipv6 traffic.
     *
     * Only if this is set to false will egress rules for ipv6 be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     *
     * Default: false
     */
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    /**
     * Mark the SecurityGroup as having been created allowing all outbound traffic.
     *
     * Only if this is set to false will egress rules be added to this security
     * group. Be aware, this would undo any potential "all outbound traffic"
     * default.
     *
     * Default: true
     */
    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    /**
     * If a SecurityGroup is mutable CDK can add rules to existing groups.
     *
     * Beware that making a SecurityGroup immutable might lead to issue
     * due to missing ingress/egress rules for new resources.
     *
     * Default: true
     */
    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupImportOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupImportOptions):
        SecurityGroupImportOptions = CdkObjectWrappers.wrap(cdkObject) as?
        SecurityGroupImportOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupImportOptions):
        software.amazon.awscdk.services.ec2.SecurityGroupImportOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SecurityGroupImportOptions
  }
}
