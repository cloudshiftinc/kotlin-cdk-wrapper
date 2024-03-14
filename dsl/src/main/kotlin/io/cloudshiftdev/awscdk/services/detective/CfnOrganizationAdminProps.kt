package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnOrganizationAdminProps {
  /**
   * The AWS account identifier of the account to designate as the Detective administrator account
   * for the organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
   */
  public fun accountId(): String

  /**
   * A builder for [CfnOrganizationAdminProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId The AWS account identifier of the account to designate as the Detective
     * administrator account for the organization. 
     */
    public fun accountId(accountId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps.Builder =
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps.builder()

    /**
     * @param accountId The AWS account identifier of the account to designate as the Detective
     * administrator account for the organization. 
     */
    override fun accountId(accountId: String) {
      cdkBuilder.accountId(accountId)
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnOrganizationAdminProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdminProps,
  ) : CdkObject(cdkObject), CfnOrganizationAdminProps {
    /**
     * The AWS account identifier of the account to designate as the Detective administrator account
     * for the organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-detective-organizationadmin.html#cfn-detective-organizationadmin-accountid)
     */
    override fun accountId(): String = unwrap(this).getAccountId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationAdminProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnOrganizationAdminProps):
        CfnOrganizationAdminProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationAdminProps):
        software.amazon.awscdk.services.detective.CfnOrganizationAdminProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.detective.CfnOrganizationAdminProps
  }
}
