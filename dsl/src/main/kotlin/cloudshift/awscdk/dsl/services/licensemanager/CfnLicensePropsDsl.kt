@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties for defining a `CfnLicense`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * CfnLicenseProps cfnLicenseProps = CfnLicenseProps.builder()
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
public class CfnLicensePropsDsl {
    private val cdkBuilder: CfnLicenseProps.Builder = CfnLicenseProps.builder()

    private val _entitlements: MutableList<Any> = mutableListOf()

    private val _licenseMetadata: MutableList<Any> = mutableListOf()

    /**
     * @param beneficiary License beneficiary.
     */
    public fun beneficiary(beneficiary: String) {
        cdkBuilder.beneficiary(beneficiary)
    }

    /**
     * @param consumptionConfiguration Configuration for consumption of the license.
     */
    public fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
        cdkBuilder.consumptionConfiguration(consumptionConfiguration)
    }

    /**
     * @param consumptionConfiguration Configuration for consumption of the license.
     */
    public fun consumptionConfiguration(consumptionConfiguration: CfnLicense.ConsumptionConfigurationProperty) {
        cdkBuilder.consumptionConfiguration(consumptionConfiguration)
    }

    /**
     * @param entitlements License entitlements.
     */
    public fun entitlements(vararg entitlements: Any) {
        _entitlements.addAll(listOf(*entitlements))
    }

    /**
     * @param entitlements License entitlements.
     */
    public fun entitlements(entitlements: Collection<Any>) {
        _entitlements.addAll(entitlements)
    }

    /**
     * @param entitlements License entitlements.
     */
    public fun entitlements(entitlements: IResolvable) {
        cdkBuilder.entitlements(entitlements)
    }

    /**
     * @param homeRegion Home Region of the license.
     */
    public fun homeRegion(homeRegion: String) {
        cdkBuilder.homeRegion(homeRegion)
    }

    /**
     * @param issuer License issuer.
     */
    public fun issuer(issuer: IResolvable) {
        cdkBuilder.issuer(issuer)
    }

    /**
     * @param issuer License issuer.
     */
    public fun issuer(issuer: CfnLicense.IssuerDataProperty) {
        cdkBuilder.issuer(issuer)
    }

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(vararg licenseMetadata: Any) {
        _licenseMetadata.addAll(listOf(*licenseMetadata))
    }

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(licenseMetadata: Collection<Any>) {
        _licenseMetadata.addAll(licenseMetadata)
    }

    /**
     * @param licenseMetadata License metadata.
     */
    public fun licenseMetadata(licenseMetadata: IResolvable) {
        cdkBuilder.licenseMetadata(licenseMetadata)
    }

    /**
     * @param licenseName License name.
     */
    public fun licenseName(licenseName: String) {
        cdkBuilder.licenseName(licenseName)
    }

    /**
     * @param productName Product name.
     */
    public fun productName(productName: String) {
        cdkBuilder.productName(productName)
    }

    /**
     * @param productSku Product SKU.
     */
    public fun productSku(productSku: String) {
        cdkBuilder.productSku(productSku)
    }

    /**
     * @param status License status.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     */
    public fun validity(validity: IResolvable) {
        cdkBuilder.validity(validity)
    }

    /**
     * @param validity Date and time range during which the license is valid, in ISO8601-UTC format.
     */
    public fun validity(validity: CfnLicense.ValidityDateFormatProperty) {
        cdkBuilder.validity(validity)
    }

    public fun build(): CfnLicenseProps {
        if (_entitlements.isNotEmpty()) cdkBuilder.entitlements(_entitlements)
        if (_licenseMetadata.isNotEmpty()) cdkBuilder.licenseMetadata(_licenseMetadata)
        return cdkBuilder.build()
    }
}
