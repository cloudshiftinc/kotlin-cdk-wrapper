@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCloudFormationProvisionedProduct`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnCloudFormationProvisionedProductProps cfnCloudFormationProvisionedProductProps =
 * CfnCloudFormationProvisionedProductProps.builder()
 * .acceptLanguage("acceptLanguage")
 * .notificationArns(List.of("notificationArns"))
 * .pathId("pathId")
 * .pathName("pathName")
 * .productId("productId")
 * .productName("productName")
 * .provisionedProductName("provisionedProductName")
 * .provisioningArtifactId("provisioningArtifactId")
 * .provisioningArtifactName("provisioningArtifactName")
 * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .provisioningPreferences(ProvisioningPreferencesProperty.builder()
 * .stackSetAccounts(List.of("stackSetAccounts"))
 * .stackSetFailureToleranceCount(123)
 * .stackSetFailureTolerancePercentage(123)
 * .stackSetMaxConcurrencyCount(123)
 * .stackSetMaxConcurrencyPercentage(123)
 * .stackSetOperationType("stackSetOperationType")
 * .stackSetRegions(List.of("stackSetRegions"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
 */
public interface CfnCloudFormationProvisionedProductProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * Passed to AWS CloudFormation .
   *
   * The SNS topic ARNs to which to publish stack-related events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
   */
  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  /**
   * The path identifier of the product.
   *
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
   */
  public fun pathId(): String? = unwrap(this).getPathId()

  /**
   * The name of the path.
   *
   * This value is optional if the product has a default path, and required if the product has more
   * than one path. To list the paths for a product, use
   * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html) .
   *
   *
   * You must provide the name or ID, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathname)
   */
  public fun pathName(): String? = unwrap(this).getPathName()

  /**
   * The product identifier.
   *
   *
   * You must specify either the ID or the name of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
   */
  public fun productId(): String? = unwrap(this).getProductId()

  /**
   * The name of the Service Catalog product.
   *
   * Each time a stack is created or updated, if `ProductName` is provided it will successfully
   * resolve to `ProductId` as long as only one product exists in the account or Region with that
   * `ProductName` .
   *
   *
   * You must specify either the name or the ID of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
   */
  public fun productName(): String? = unwrap(this).getProductName()

  /**
   * A user-friendly name for the provisioned product.
   *
   * This value must be unique for the AWS account and cannot be updated after the product is
   * provisioned.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
   */
  public fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

  /**
   * The identifier of the provisioning artifact (also known as a version).
   *
   *
   * You must specify either the ID or the name of the provisioning artifact, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
   */
  public fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

  /**
   * The name of the provisioning artifact (also known as a version) for the product.
   *
   * This name must be unique for the product.
   *
   *
   * You must specify either the name or the ID of the provisioning artifact, but not both. You must
   * also specify either the name or the ID of the product, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
   */
  public fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

  /**
   * Parameters specified by the administrator that are required for provisioning the product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
   */
  public fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

  /**
   * StackSet preferences that are required for provisioning the product or updating a provisioned
   * product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
   */
  public fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

  /**
   * One or more tags.
   *
   *
   * Requires the provisioned product to have an
   * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
   * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
   * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCloudFormationProvisionedProductProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param notificationArns Passed to AWS CloudFormation .
     * The SNS topic ARNs to which to publish stack-related events.
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * @param notificationArns Passed to AWS CloudFormation .
     * The SNS topic ARNs to which to publish stack-related events.
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * @param pathId The path identifier of the product.
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     */
    public fun pathId(pathId: String)

    /**
     * @param pathName The name of the path.
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     */
    public fun pathName(pathName: String)

    /**
     * @param productId The product identifier.
     *
     * You must specify either the ID or the name of the product, but not both.
     */
    public fun productId(productId: String)

    /**
     * @param productName The name of the Service Catalog product.
     * Each time a stack is created or updated, if `ProductName` is provided it will successfully
     * resolve to `ProductId` as long as only one product exists in the account or Region with that
     * `ProductName` .
     *
     *
     * You must specify either the name or the ID of the product, but not both.
     */
    public fun productName(productName: String)

    /**
     * @param provisionedProductName A user-friendly name for the provisioned product.
     * This value must be unique for the AWS account and cannot be updated after the product is
     * provisioned.
     */
    public fun provisionedProductName(provisionedProductName: String)

    /**
     * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
     * version).
     *
     * You must specify either the ID or the name of the provisioning artifact, but not both.
     */
    public fun provisioningArtifactId(provisioningArtifactId: String)

    /**
     * @param provisioningArtifactName The name of the provisioning artifact (also known as a
     * version) for the product.
     * This name must be unique for the product.
     *
     *
     * You must specify either the name or the ID of the provisioning artifact, but not both. You
     * must also specify either the name or the ID of the product, but not both.
     */
    public fun provisioningArtifactName(provisioningArtifactName: String)

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    public fun provisioningParameters(provisioningParameters: IResolvable)

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    public fun provisioningParameters(provisioningParameters: List<Any>)

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    public fun provisioningParameters(vararg provisioningParameters: Any)

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    public fun provisioningPreferences(provisioningPreferences: IResolvable)

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    public
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty)

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49d4cf67454648625c4764d68cee0d703ff27506e9016a0242ed7a6feef53fea")
    public
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder.() -> Unit)

    /**
     * @param tags One or more tags.
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags.
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps.Builder
        =
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param notificationArns Passed to AWS CloudFormation .
     * The SNS topic ARNs to which to publish stack-related events.
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * @param notificationArns Passed to AWS CloudFormation .
     * The SNS topic ARNs to which to publish stack-related events.
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * @param pathId The path identifier of the product.
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     */
    override fun pathId(pathId: String) {
      cdkBuilder.pathId(pathId)
    }

    /**
     * @param pathName The name of the path.
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     */
    override fun pathName(pathName: String) {
      cdkBuilder.pathName(pathName)
    }

    /**
     * @param productId The product identifier.
     *
     * You must specify either the ID or the name of the product, but not both.
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param productName The name of the Service Catalog product.
     * Each time a stack is created or updated, if `ProductName` is provided it will successfully
     * resolve to `ProductId` as long as only one product exists in the account or Region with that
     * `ProductName` .
     *
     *
     * You must specify either the name or the ID of the product, but not both.
     */
    override fun productName(productName: String) {
      cdkBuilder.productName(productName)
    }

    /**
     * @param provisionedProductName A user-friendly name for the provisioned product.
     * This value must be unique for the AWS account and cannot be updated after the product is
     * provisioned.
     */
    override fun provisionedProductName(provisionedProductName: String) {
      cdkBuilder.provisionedProductName(provisionedProductName)
    }

    /**
     * @param provisioningArtifactId The identifier of the provisioning artifact (also known as a
     * version).
     *
     * You must specify either the ID or the name of the provisioning artifact, but not both.
     */
    override fun provisioningArtifactId(provisioningArtifactId: String) {
      cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * @param provisioningArtifactName The name of the provisioning artifact (also known as a
     * version) for the product.
     * This name must be unique for the product.
     *
     *
     * You must specify either the name or the ID of the provisioning artifact, but not both. You
     * must also specify either the name or the ID of the product, but not both.
     */
    override fun provisioningArtifactName(provisioningArtifactName: String) {
      cdkBuilder.provisioningArtifactName(provisioningArtifactName)
    }

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    override fun provisioningParameters(provisioningParameters: IResolvable) {
      cdkBuilder.provisioningParameters(provisioningParameters.let(IResolvable::unwrap))
    }

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    override fun provisioningParameters(provisioningParameters: List<Any>) {
      cdkBuilder.provisioningParameters(provisioningParameters)
    }

    /**
     * @param provisioningParameters Parameters specified by the administrator that are required for
     * provisioning the product.
     */
    override fun provisioningParameters(vararg provisioningParameters: Any): Unit =
        provisioningParameters(provisioningParameters.toList())

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    override fun provisioningPreferences(provisioningPreferences: IResolvable) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(IResolvable::unwrap))
    }

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    override
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty) {
      cdkBuilder.provisioningPreferences(provisioningPreferences.let(CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty::unwrap))
    }

    /**
     * @param provisioningPreferences StackSet preferences that are required for provisioning the
     * product or updating a provisioned product.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49d4cf67454648625c4764d68cee0d703ff27506e9016a0242ed7a6feef53fea")
    override
        fun provisioningPreferences(provisioningPreferences: CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty.Builder.() -> Unit):
        Unit =
        provisioningPreferences(CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty(provisioningPreferences))

    /**
     * @param tags One or more tags.
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags One or more tags.
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps,
  ) : CdkObject(cdkObject), CfnCloudFormationProvisionedProductProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * Passed to AWS CloudFormation .
     *
     * The SNS topic ARNs to which to publish stack-related events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-notificationarns)
     */
    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    /**
     * The path identifier of the product.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathid)
     */
    override fun pathId(): String? = unwrap(this).getPathId()

    /**
     * The name of the path.
     *
     * This value is optional if the product has a default path, and required if the product has
     * more than one path. To list the paths for a product, use
     * [ListLaunchPaths](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_ListLaunchPaths.html)
     * .
     *
     *
     * You must provide the name or ID, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-pathname)
     */
    override fun pathName(): String? = unwrap(this).getPathName()

    /**
     * The product identifier.
     *
     *
     * You must specify either the ID or the name of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productid)
     */
    override fun productId(): String? = unwrap(this).getProductId()

    /**
     * The name of the Service Catalog product.
     *
     * Each time a stack is created or updated, if `ProductName` is provided it will successfully
     * resolve to `ProductId` as long as only one product exists in the account or Region with that
     * `ProductName` .
     *
     *
     * You must specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-productname)
     */
    override fun productName(): String? = unwrap(this).getProductName()

    /**
     * A user-friendly name for the provisioned product.
     *
     * This value must be unique for the AWS account and cannot be updated after the product is
     * provisioned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisionedproductname)
     */
    override fun provisionedProductName(): String? = unwrap(this).getProvisionedProductName()

    /**
     * The identifier of the provisioning artifact (also known as a version).
     *
     *
     * You must specify either the ID or the name of the provisioning artifact, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactid)
     */
    override fun provisioningArtifactId(): String? = unwrap(this).getProvisioningArtifactId()

    /**
     * The name of the provisioning artifact (also known as a version) for the product.
     *
     * This name must be unique for the product.
     *
     *
     * You must specify either the name or the ID of the provisioning artifact, but not both. You
     * must also specify either the name or the ID of the product, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningartifactname)
     */
    override fun provisioningArtifactName(): String? = unwrap(this).getProvisioningArtifactName()

    /**
     * Parameters specified by the administrator that are required for provisioning the product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningparameters)
     */
    override fun provisioningParameters(): Any? = unwrap(this).getProvisioningParameters()

    /**
     * StackSet preferences that are required for provisioning the product or updating a provisioned
     * product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences)
     */
    override fun provisioningPreferences(): Any? = unwrap(this).getProvisioningPreferences()

    /**
     * One or more tags.
     *
     *
     * Requires the provisioned product to have an
     * [ResourceUpdateConstraint](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     * resource with `TagUpdatesOnProvisionedProduct` set to `ALLOWED` to allow tag updates. If
     * `RESOURCE_UPDATE` constraint is not present, tags updates are ignored.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html#cfn-servicecatalog-cloudformationprovisionedproduct-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCloudFormationProvisionedProductProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps):
        CfnCloudFormationProvisionedProductProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudFormationProvisionedProductProps):
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
  }
}
