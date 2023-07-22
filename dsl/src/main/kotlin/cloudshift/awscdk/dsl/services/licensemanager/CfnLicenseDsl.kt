@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.constructs.Construct

/**
 * Specifies a granted license.
 *
 * Granted licenses are licenses for products that your organization purchased from AWS Marketplace
 * or directly from a seller who integrated their software with managed entitlements. For more
 * information, see [Granted
 * licenses](https://docs.aws.amazon.com/license-manager/latest/userguide/granted-licenses.html) in the
 * *AWS License Manager User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * CfnLicense cfnLicense = CfnLicense.Builder.create(this, "MyCfnLicense")
 * .consumptionConfiguration(ConsumptionConfigurationProperty.builder()
 * .borrowConfiguration(BorrowConfigurationProperty.builder()
 * .allowEarlyCheckIn(false)
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .provisionalConfiguration(ProvisionalConfigurationProperty.builder()
 * .maxTimeToLiveInMinutes(123)
 * .build())
 * .renewType("renewType")
 * .build())
 * .entitlements(List.of(EntitlementProperty.builder()
 * .name("name")
 * .unit("unit")
 * // the properties below are optional
 * .allowCheckIn(false)
 * .maxCount(123)
 * .overage(false)
 * .value("value")
 * .build()))
 * .homeRegion("homeRegion")
 * .issuer(IssuerDataProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .signKey("signKey")
 * .build())
 * .licenseName("licenseName")
 * .productName("productName")
 * .validity(ValidityDateFormatProperty.builder()
 * .begin("begin")
 * .end("end")
 * .build())
 * // the properties below are optional
 * .beneficiary("beneficiary")
 * .licenseMetadata(List.of(MetadataProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .productSku("productSku")
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html)
 */
@CdkDslMarker
public class CfnLicenseDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLicense.Builder = CfnLicense.Builder.create(scope, id)

  private val _entitlements: MutableList<Any> = mutableListOf()

  private val _licenseMetadata: MutableList<Any> = mutableListOf()

  /**
   * License beneficiary.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-beneficiary)
   * @param beneficiary License beneficiary. 
   */
  public fun beneficiary(beneficiary: String) {
    cdkBuilder.beneficiary(beneficiary)
  }

  /**
   * Configuration for consumption of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
   * @param consumptionConfiguration Configuration for consumption of the license. 
   */
  public fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  /**
   * Configuration for consumption of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
   * @param consumptionConfiguration Configuration for consumption of the license. 
   */
  public
      fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
    cdkBuilder.consumptionConfiguration(consumptionConfiguration)
  }

  /**
   * License entitlements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
   * @param entitlements License entitlements. 
   */
  public fun entitlements(vararg entitlements: Any) {
    _entitlements.addAll(listOf(*entitlements))
  }

  /**
   * License entitlements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
   * @param entitlements License entitlements. 
   */
  public fun entitlements(entitlements: Collection<Any>) {
    _entitlements.addAll(entitlements)
  }

  /**
   * License entitlements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
   * @param entitlements License entitlements. 
   */
  public fun entitlements(entitlements: IResolvable) {
    cdkBuilder.entitlements(entitlements)
  }

  /**
   * Home Region of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-homeregion)
   * @param homeRegion Home Region of the license. 
   */
  public fun homeRegion(homeRegion: String) {
    cdkBuilder.homeRegion(homeRegion)
  }

  /**
   * License issuer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
   * @param issuer License issuer. 
   */
  public fun issuer(issuer: IResolvable) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * License issuer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
   * @param issuer License issuer. 
   */
  public fun issuer(issuer: CfnLicense.IssuerDataProperty) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * License metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
   * @param licenseMetadata License metadata. 
   */
  public fun licenseMetadata(vararg licenseMetadata: Any) {
    _licenseMetadata.addAll(listOf(*licenseMetadata))
  }

  /**
   * License metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
   * @param licenseMetadata License metadata. 
   */
  public fun licenseMetadata(licenseMetadata: Collection<Any>) {
    _licenseMetadata.addAll(licenseMetadata)
  }

  /**
   * License metadata.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
   * @param licenseMetadata License metadata. 
   */
  public fun licenseMetadata(licenseMetadata: IResolvable) {
    cdkBuilder.licenseMetadata(licenseMetadata)
  }

  /**
   * License name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensename)
   * @param licenseName License name. 
   */
  public fun licenseName(licenseName: String) {
    cdkBuilder.licenseName(licenseName)
  }

  /**
   * Product name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productname)
   * @param productName Product name. 
   */
  public fun productName(productName: String) {
    cdkBuilder.productName(productName)
  }

  /**
   * Product SKU.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productsku)
   * @param productSku Product SKU. 
   */
  public fun productSku(productSku: String) {
    cdkBuilder.productSku(productSku)
  }

  /**
   * License status.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-status)
   * @param status License status. 
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * Date and time range during which the license is valid, in ISO8601-UTC format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
   * @param validity Date and time range during which the license is valid, in ISO8601-UTC format. 
   */
  public fun validity(validity: IResolvable) {
    cdkBuilder.validity(validity)
  }

  /**
   * Date and time range during which the license is valid, in ISO8601-UTC format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
   * @param validity Date and time range during which the license is valid, in ISO8601-UTC format. 
   */
  public fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
    cdkBuilder.validity(validity)
  }

  public fun build(): CfnLicense {
    if(_entitlements.isNotEmpty()) cdkBuilder.entitlements(_entitlements)
    if(_licenseMetadata.isNotEmpty()) cdkBuilder.licenseMetadata(_licenseMetadata)
    return cdkBuilder.build()
  }
}
