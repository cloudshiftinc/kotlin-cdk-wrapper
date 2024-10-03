@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDelegatedAdmin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnDelegatedAdminProps cfnDelegatedAdminProps = CfnDelegatedAdminProps.builder()
 * .adminAccountId("adminAccountId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html)
 */
public interface CfnDelegatedAdminProps {
  /**
   * The AWS account identifier of the account to designate as the Security Hub administrator
   * account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html#cfn-securityhub-delegatedadmin-adminaccountid)
   */
  public fun adminAccountId(): String

  /**
   * A builder for [CfnDelegatedAdminProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adminAccountId The AWS account identifier of the account to designate as the Security
     * Hub administrator account. 
     */
    public fun adminAccountId(adminAccountId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps.Builder =
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps.builder()

    /**
     * @param adminAccountId The AWS account identifier of the account to designate as the Security
     * Hub administrator account. 
     */
    override fun adminAccountId(adminAccountId: String) {
      cdkBuilder.adminAccountId(adminAccountId)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps,
  ) : CdkObject(cdkObject),
      CfnDelegatedAdminProps {
    /**
     * The AWS account identifier of the account to designate as the Security Hub administrator
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-delegatedadmin.html#cfn-securityhub-delegatedadmin-adminaccountid)
     */
    override fun adminAccountId(): String = unwrap(this).getAdminAccountId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDelegatedAdminProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps):
        CfnDelegatedAdminProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDelegatedAdminProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDelegatedAdminProps):
        software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.securityhub.CfnDelegatedAdminProps
  }
}
