@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import software.amazon.awscdk.services.licensemanager.CfnGrant
import software.amazon.awscdk.services.licensemanager.CfnGrantProps
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object licensemanager {
    /**
     * Specifies a grant.
     *
     * A grant shares the use of license entitlements with specific AWS accounts . For more
     * information, see [Granted
   * licenses](https://docs.aws.amazon.com/license-manager/latest/userguide/granted-licenses.html) in
     * the *AWS License Manager User Guide* .
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * CfnGrant cfnGrant = CfnGrant.Builder.create(this, "MyCfnGrant")
     * .allowedOperations(List.of("allowedOperations"))
     * .grantName("grantName")
     * .homeRegion("homeRegion")
     * .licenseArn("licenseArn")
     * .principals(List.of("principals"))
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html)
     */
    public inline fun cfnGrant(
        scope: Construct,
        id: String,
        block: CfnGrantDsl.() -> Unit = {}
    ): CfnGrant {
        val builder = CfnGrantDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnGrant`.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * CfnGrantProps cfnGrantProps = CfnGrantProps.builder()
     * .allowedOperations(List.of("allowedOperations"))
     * .grantName("grantName")
     * .homeRegion("homeRegion")
     * .licenseArn("licenseArn")
     * .principals(List.of("principals"))
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-grant.html)
     */
    public inline fun cfnGrantProps(block: CfnGrantPropsDsl.() -> Unit = {}): CfnGrantProps {
        val builder = CfnGrantPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a granted license.
     *
     * Granted licenses are licenses for products that your organization purchased from AWS
     * Marketplace or directly from a seller who integrated their software with managed entitlements. For
     * more information, see [Granted
   * licenses](https://docs.aws.amazon.com/license-manager/latest/userguide/granted-licenses.html) in
     * the *AWS License Manager User Guide* .
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
    public inline fun cfnLicense(
        scope: Construct,
        id: String,
        block: CfnLicenseDsl.() -> Unit = {}
    ): CfnLicense {
        val builder = CfnLicenseDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about a borrow configuration.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * BorrowConfigurationProperty borrowConfigurationProperty = BorrowConfigurationProperty.builder()
     * .allowEarlyCheckIn(false)
     * .maxTimeToLiveInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html)
     */
    public inline fun cfnLicenseBorrowConfigurationProperty(
        block: CfnLicenseBorrowConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.BorrowConfigurationProperty {
        val builder = CfnLicenseBorrowConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about a consumption configuration.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * ConsumptionConfigurationProperty consumptionConfigurationProperty =
     * ConsumptionConfigurationProperty.builder()
     * .borrowConfiguration(BorrowConfigurationProperty.builder()
     * .allowEarlyCheckIn(false)
     * .maxTimeToLiveInMinutes(123)
     * .build())
     * .provisionalConfiguration(ProvisionalConfigurationProperty.builder()
     * .maxTimeToLiveInMinutes(123)
     * .build())
     * .renewType("renewType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html)
     */
    public inline fun cfnLicenseConsumptionConfigurationProperty(
        block: CfnLicenseConsumptionConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.ConsumptionConfigurationProperty {
        val builder = CfnLicenseConsumptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes a resource entitled for use with a license.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * EntitlementProperty entitlementProperty = EntitlementProperty.builder()
     * .name("name")
     * .unit("unit")
     * // the properties below are optional
     * .allowCheckIn(false)
     * .maxCount(123)
     * .overage(false)
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html)
     */
    public inline fun cfnLicenseEntitlementProperty(
        block: CfnLicenseEntitlementPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.EntitlementProperty {
        val builder = CfnLicenseEntitlementPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details associated with the issuer of a license.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * IssuerDataProperty issuerDataProperty = IssuerDataProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .signKey("signKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html)
     */
    public inline fun cfnLicenseIssuerDataProperty(
        block: CfnLicenseIssuerDataPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.IssuerDataProperty {
        val builder = CfnLicenseIssuerDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes key/value pairs.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * MetadataProperty metadataProperty = MetadataProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html)
     */
    public inline fun cfnLicenseMetadataProperty(
        block: CfnLicenseMetadataPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.MetadataProperty {
        val builder = CfnLicenseMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnLicenseProps(block: CfnLicensePropsDsl.() -> Unit = {}): CfnLicenseProps {
        val builder = CfnLicensePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Details about a provisional configuration.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * ProvisionalConfigurationProperty provisionalConfigurationProperty =
     * ProvisionalConfigurationProperty.builder()
     * .maxTimeToLiveInMinutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-provisionalconfiguration.html)
     */
    public inline fun cfnLicenseProvisionalConfigurationProperty(
        block: CfnLicenseProvisionalConfigurationPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.ProvisionalConfigurationProperty {
        val builder = CfnLicenseProvisionalConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Date and time range during which the license is valid, in ISO8601-UTC format.
     *
     * Example:
     *
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.licensemanager.*;
     * ValidityDateFormatProperty validityDateFormatProperty = ValidityDateFormatProperty.builder()
     * .begin("begin")
     * .end("end")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html)
     */
    public inline fun cfnLicenseValidityDateFormatProperty(
        block: CfnLicenseValidityDateFormatPropertyDsl.() -> Unit =
            {}
    ): CfnLicense.ValidityDateFormatProperty {
        val builder = CfnLicenseValidityDateFormatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
