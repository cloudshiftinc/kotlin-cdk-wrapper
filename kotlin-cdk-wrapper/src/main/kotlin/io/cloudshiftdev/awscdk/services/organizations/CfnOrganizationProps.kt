@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnOrganization`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * CfnOrganizationProps cfnOrganizationProps = CfnOrganizationProps.builder()
 * .featureSet("featureSet")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html)
 */
public interface CfnOrganizationProps {
  /**
   * Specifies the feature set supported by the new organization. Each feature set supports
   * different levels of functionality.
   *
   * * `ALL`  In addition to all the features supported by the consolidated billing feature set, the
   * management account gains access to advanced features that give you more control over accounts in
   * your organization. For more information, see [All
   * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
   * in the *AWS Organizations User Guide* .
   * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by the
   * management account. For more information, see [Consolidated
   * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
   * in the *AWS Organizations User Guide* .
   *
   *
   * The consolidated billing feature feature set isn't available for organizations in the AWS
   * GovCloud (US) Region.
   *
   *
   * If you don't specify this property, the default value is `ALL` .
   *
   * Default: - "ALL"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html#cfn-organizations-organization-featureset)
   */
  public fun featureSet(): String? = unwrap(this).getFeatureSet()

  /**
   * A builder for [CfnOrganizationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param featureSet Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set,
     * the management account gains access to advanced features that give you more control over
     * accounts in your organization. For more information, see [All
     * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by
     * the management account. For more information, see [Consolidated
     * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide* .
     *
     *
     * The consolidated billing feature feature set isn't available for organizations in the AWS
     * GovCloud (US) Region.
     *
     *
     * If you don't specify this property, the default value is `ALL` .
     */
    public fun featureSet(featureSet: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnOrganizationProps.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganizationProps.builder()

    /**
     * @param featureSet Specifies the feature set supported by the new organization. Each feature
     * set supports different levels of functionality.
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set,
     * the management account gains access to advanced features that give you more control over
     * accounts in your organization. For more information, see [All
     * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by
     * the management account. For more information, see [Consolidated
     * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide* .
     *
     *
     * The consolidated billing feature feature set isn't available for organizations in the AWS
     * GovCloud (US) Region.
     *
     *
     * If you don't specify this property, the default value is `ALL` .
     */
    override fun featureSet(featureSet: String) {
      cdkBuilder.featureSet(featureSet)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationProps,
  ) : CdkObject(cdkObject),
      CfnOrganizationProps {
    /**
     * Specifies the feature set supported by the new organization. Each feature set supports
     * different levels of functionality.
     *
     * * `ALL`  In addition to all the features supported by the consolidated billing feature set,
     * the management account gains access to advanced features that give you more control over
     * accounts in your organization. For more information, see [All
     * features](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-all)
     * in the *AWS Organizations User Guide* .
     * * `CONSOLIDATED_BILLING`  All member accounts have their bills consolidated to and paid by
     * the management account. For more information, see [Consolidated
     * billing](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#feature-set-cb-only)
     * in the *AWS Organizations User Guide* .
     *
     *
     * The consolidated billing feature feature set isn't available for organizations in the AWS
     * GovCloud (US) Region.
     *
     *
     * If you don't specify this property, the default value is `ALL` .
     *
     * Default: - "ALL"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organization.html#cfn-organizations-organization-featureset)
     */
    override fun featureSet(): String? = unwrap(this).getFeatureSet()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationProps):
        CfnOrganizationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOrganizationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationProps):
        software.amazon.awscdk.services.organizations.CfnOrganizationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnOrganizationProps
  }
}
