package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGrantProps {
  /**
   * Allowed operations for the grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
   */
  public fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?: emptyList()

  /**
   * Grant name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-grantname)
   */
  public fun grantName(): String? = unwrap(this).getGrantName()

  /**
   * Home Region of the grant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-homeregion)
   */
  public fun homeRegion(): String? = unwrap(this).getHomeRegion()

  /**
   * License ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-licensearn)
   */
  public fun licenseArn(): String? = unwrap(this).getLicenseArn()

  /**
   * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
   *
   * * An AWS account, which includes only the account specified.
   * * An organizational unit (OU), which includes all accounts in the OU.
   * * An organization, which will include all accounts across your organization.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
   */
  public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * Granted license status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnGrantProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    public fun allowedOperations(allowedOperations: List<String>)

    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    public fun allowedOperations(vararg allowedOperations: String)

    /**
     * @param grantName Grant name.
     */
    public fun grantName(grantName: String)

    /**
     * @param homeRegion Home Region of the grant.
     */
    public fun homeRegion(homeRegion: String)

    /**
     * @param licenseArn License ARN.
     */
    public fun licenseArn(licenseArn: String)

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    public fun principals(principals: List<String>)

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    public fun principals(vararg principals: String)

    /**
     * @param status Granted license status.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnGrantProps.Builder =
        software.amazon.awscdk.services.licensemanager.CfnGrantProps.builder()

    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    override fun allowedOperations(allowedOperations: List<String>) {
      cdkBuilder.allowedOperations(allowedOperations)
    }

    /**
     * @param allowedOperations Allowed operations for the grant.
     */
    override fun allowedOperations(vararg allowedOperations: String): Unit =
        allowedOperations(allowedOperations.toList())

    /**
     * @param grantName Grant name.
     */
    override fun grantName(grantName: String) {
      cdkBuilder.grantName(grantName)
    }

    /**
     * @param homeRegion Home Region of the grant.
     */
    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    /**
     * @param licenseArn License ARN.
     */
    override fun licenseArn(licenseArn: String) {
      cdkBuilder.licenseArn(licenseArn)
    }

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * @param principals The grant principals. You can specify one of the following as an Amazon
     * Resource Name (ARN):.
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * @param status Granted license status.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnGrantProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrantProps,
  ) : CdkObject(cdkObject), CfnGrantProps {
    /**
     * Allowed operations for the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-allowedoperations)
     */
    override fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?:
        emptyList()

    /**
     * Grant name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-grantname)
     */
    override fun grantName(): String? = unwrap(this).getGrantName()

    /**
     * Home Region of the grant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-homeregion)
     */
    override fun homeRegion(): String? = unwrap(this).getHomeRegion()

    /**
     * License ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-licensearn)
     */
    override fun licenseArn(): String? = unwrap(this).getLicenseArn()

    /**
     * The grant principals. You can specify one of the following as an Amazon Resource Name (ARN):.
     *
     * * An AWS account, which includes only the account specified.
     * * An organizational unit (OU), which includes all accounts in the OU.
     * * An organization, which will include all accounts across your organization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-principals)
     */
    override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    /**
     * Granted license status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html#cfn-licensemanager-grant-status)
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGrantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrantProps):
        CfnGrantProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGrantProps):
        software.amazon.awscdk.services.licensemanager.CfnGrantProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.licensemanager.CfnGrantProps
  }
}
