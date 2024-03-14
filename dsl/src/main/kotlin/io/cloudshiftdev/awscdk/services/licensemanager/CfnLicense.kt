package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLicense
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense,
) : CfnResource(cdkObject), IInspectable {
    /** The Amazon Resource Name (ARN) of the license. */
    public open fun attrLicenseArn(): String = unwrap(this).getAttrLicenseArn()

    /** The license version. */
    public open fun attrVersion(): String = unwrap(this).getAttrVersion()

    /** License beneficiary. */
    public open fun beneficiary(): String? = unwrap(this).getBeneficiary()

    /** License beneficiary. */
    public open fun beneficiary(`value`: String) {
        unwrap(this).setBeneficiary(`value`)
    }

    /** Configuration for consumption of the license. */
    public open fun consumptionConfiguration(): Any = unwrap(this).getConsumptionConfiguration()

    /** Configuration for consumption of the license. */
    public open fun consumptionConfiguration(`value`: IResolvable) {
        unwrap(this).setConsumptionConfiguration(`value`.let(IResolvable::unwrap))
    }

    /** Configuration for consumption of the license. */
    public open fun consumptionConfiguration(`value`: ConsumptionConfigurationProperty) {
        unwrap(this)
            .setConsumptionConfiguration(`value`.let(ConsumptionConfigurationProperty::unwrap))
    }

    /** Configuration for consumption of the license. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32250de8c68b2c67ee65f366aef37a9612205e77e80421280aa1e1159f63cde7")
    public open fun consumptionConfiguration(
        `value`: ConsumptionConfigurationProperty.Builder.() -> Unit
    ): Unit = consumptionConfiguration(ConsumptionConfigurationProperty(`value`))

    /** License entitlements. */
    public open fun entitlements(): Any = unwrap(this).getEntitlements()

    /** License entitlements. */
    public open fun entitlements(`value`: IResolvable) {
        unwrap(this).setEntitlements(`value`.let(IResolvable::unwrap))
    }

    /** License entitlements. */
    public open fun entitlements(__idx_ac66f0: List<Any>) {
        unwrap(this).setEntitlements(__idx_ac66f0)
    }

    /** License entitlements. */
    public open fun entitlements(vararg __idx_ac66f0: Any): Unit =
        entitlements(__idx_ac66f0.toList())

    /** Home Region of the license. */
    public open fun homeRegion(): String = unwrap(this).getHomeRegion()

    /** Home Region of the license. */
    public open fun homeRegion(`value`: String) {
        unwrap(this).setHomeRegion(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** License issuer. */
    public open fun issuer(): Any = unwrap(this).getIssuer()

    /** License issuer. */
    public open fun issuer(`value`: IResolvable) {
        unwrap(this).setIssuer(`value`.let(IResolvable::unwrap))
    }

    /** License issuer. */
    public open fun issuer(`value`: IssuerDataProperty) {
        unwrap(this).setIssuer(`value`.let(IssuerDataProperty::unwrap))
    }

    /** License issuer. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8c1df88c5ed6a0046ddf8f789e5d62d22af4c3324c7175be74f758453b80bb3")
    public open fun issuer(`value`: IssuerDataProperty.Builder.() -> Unit): Unit =
        issuer(IssuerDataProperty(`value`))

    /** License metadata. */
    public open fun licenseMetadata(): Any? = unwrap(this).getLicenseMetadata()

    /** License metadata. */
    public open fun licenseMetadata(`value`: IResolvable) {
        unwrap(this).setLicenseMetadata(`value`.let(IResolvable::unwrap))
    }

    /** License metadata. */
    public open fun licenseMetadata(__idx_ac66f0: List<Any>) {
        unwrap(this).setLicenseMetadata(__idx_ac66f0)
    }

    /** License metadata. */
    public open fun licenseMetadata(vararg __idx_ac66f0: Any): Unit =
        licenseMetadata(__idx_ac66f0.toList())

    /** License name. */
    public open fun licenseName(): String = unwrap(this).getLicenseName()

    /** License name. */
    public open fun licenseName(`value`: String) {
        unwrap(this).setLicenseName(`value`)
    }

    /** Product name. */
    public open fun productName(): String = unwrap(this).getProductName()

    /** Product name. */
    public open fun productName(`value`: String) {
        unwrap(this).setProductName(`value`)
    }

    /** Product SKU. */
    public open fun productSku(): String? = unwrap(this).getProductSku()

    /** Product SKU. */
    public open fun productSku(`value`: String) {
        unwrap(this).setProductSku(`value`)
    }

    /** License status. */
    public open fun status(): String? = unwrap(this).getStatus()

    /** License status. */
    public open fun status(`value`: String) {
        unwrap(this).setStatus(`value`)
    }

    /** Date and time range during which the license is valid, in ISO8601-UTC format. */
    public open fun validity(): Any = unwrap(this).getValidity()

    /** Date and time range during which the license is valid, in ISO8601-UTC format. */
    public open fun validity(`value`: IResolvable) {
        unwrap(this).setValidity(`value`.let(IResolvable::unwrap))
    }

    /** Date and time range during which the license is valid, in ISO8601-UTC format. */
    public open fun validity(`value`: ValidityDateFormatProperty) {
        unwrap(this).setValidity(`value`.let(ValidityDateFormatProperty::unwrap))
    }

    /** Date and time range during which the license is valid, in ISO8601-UTC format. */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fb2d18d4b77e2f0c689348c35b1e2545b29bae9f9ffccf83cf1104dc27f7232")
    public open fun validity(`value`: ValidityDateFormatProperty.Builder.() -> Unit): Unit =
        validity(ValidityDateFormatProperty(`value`))

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.licensemanager.CfnLicense]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * License beneficiary.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-beneficiary)
         *
         * @param beneficiary License beneficiary.
         */
        public fun beneficiary(beneficiary: String)

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        public fun consumptionConfiguration(consumptionConfiguration: IResolvable)

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        public fun consumptionConfiguration(
            consumptionConfiguration: ConsumptionConfigurationProperty
        )

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c381d3007db790ac6ebe995147719eaff4f7a7474f744d357cf799ca507facf5")
        public fun consumptionConfiguration(
            consumptionConfiguration: ConsumptionConfigurationProperty.Builder.() -> Unit
        )

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        public fun entitlements(entitlements: IResolvable)

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        public fun entitlements(entitlements: List<Any>)

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        public fun entitlements(vararg entitlements: Any)

        /**
         * Home Region of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-homeregion)
         *
         * @param homeRegion Home Region of the license.
         */
        public fun homeRegion(homeRegion: String)

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        public fun issuer(issuer: IResolvable)

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        public fun issuer(issuer: IssuerDataProperty)

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3b2d010e90f715de699d60a129aeec6f7ac92a4faf1d4e51fa354509b02b5f94")
        public fun issuer(issuer: IssuerDataProperty.Builder.() -> Unit)

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        public fun licenseMetadata(licenseMetadata: IResolvable)

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        public fun licenseMetadata(licenseMetadata: List<Any>)

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        public fun licenseMetadata(vararg licenseMetadata: Any)

        /**
         * License name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensename)
         *
         * @param licenseName License name.
         */
        public fun licenseName(licenseName: String)

        /**
         * Product name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productname)
         *
         * @param productName Product name.
         */
        public fun productName(productName: String)

        /**
         * Product SKU.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productsku)
         *
         * @param productSku Product SKU.
         */
        public fun productSku(productSku: String)

        /**
         * License status.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-status)
         *
         * @param status License status.
         */
        public fun status(status: String)

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        public fun validity(validity: IResolvable)

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        public fun validity(validity: ValidityDateFormatProperty)

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b49fdc58228a7e055f6a063c67168019576b3a8b23cbc543b8083466e26e70aa")
        public fun validity(validity: ValidityDateFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnLicense.Builder =
            software.amazon.awscdk.services.licensemanager.CfnLicense.Builder.create(scope, id)

        /**
         * License beneficiary.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-beneficiary)
         *
         * @param beneficiary License beneficiary.
         */
        override fun beneficiary(beneficiary: String) {
            cdkBuilder.beneficiary(beneficiary)
        }

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        override fun consumptionConfiguration(consumptionConfiguration: IResolvable) {
            cdkBuilder.consumptionConfiguration(consumptionConfiguration.let(IResolvable::unwrap))
        }

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        override fun consumptionConfiguration(
            consumptionConfiguration: ConsumptionConfigurationProperty
        ) {
            cdkBuilder.consumptionConfiguration(
                consumptionConfiguration.let(ConsumptionConfigurationProperty::unwrap)
            )
        }

        /**
         * Configuration for consumption of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-consumptionconfiguration)
         *
         * @param consumptionConfiguration Configuration for consumption of the license.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c381d3007db790ac6ebe995147719eaff4f7a7474f744d357cf799ca507facf5")
        override fun consumptionConfiguration(
            consumptionConfiguration: ConsumptionConfigurationProperty.Builder.() -> Unit
        ): Unit =
            consumptionConfiguration(ConsumptionConfigurationProperty(consumptionConfiguration))

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        override fun entitlements(entitlements: IResolvable) {
            cdkBuilder.entitlements(entitlements.let(IResolvable::unwrap))
        }

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        override fun entitlements(entitlements: List<Any>) {
            cdkBuilder.entitlements(entitlements)
        }

        /**
         * License entitlements.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-entitlements)
         *
         * @param entitlements License entitlements.
         */
        override fun entitlements(vararg entitlements: Any): Unit =
            entitlements(entitlements.toList())

        /**
         * Home Region of the license.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-homeregion)
         *
         * @param homeRegion Home Region of the license.
         */
        override fun homeRegion(homeRegion: String) {
            cdkBuilder.homeRegion(homeRegion)
        }

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        override fun issuer(issuer: IResolvable) {
            cdkBuilder.issuer(issuer.let(IResolvable::unwrap))
        }

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        override fun issuer(issuer: IssuerDataProperty) {
            cdkBuilder.issuer(issuer.let(IssuerDataProperty::unwrap))
        }

        /**
         * License issuer.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-issuer)
         *
         * @param issuer License issuer.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("3b2d010e90f715de699d60a129aeec6f7ac92a4faf1d4e51fa354509b02b5f94")
        override fun issuer(issuer: IssuerDataProperty.Builder.() -> Unit): Unit =
            issuer(IssuerDataProperty(issuer))

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        override fun licenseMetadata(licenseMetadata: IResolvable) {
            cdkBuilder.licenseMetadata(licenseMetadata.let(IResolvable::unwrap))
        }

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        override fun licenseMetadata(licenseMetadata: List<Any>) {
            cdkBuilder.licenseMetadata(licenseMetadata)
        }

        /**
         * License metadata.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensemetadata)
         *
         * @param licenseMetadata License metadata.
         */
        override fun licenseMetadata(vararg licenseMetadata: Any): Unit =
            licenseMetadata(licenseMetadata.toList())

        /**
         * License name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-licensename)
         *
         * @param licenseName License name.
         */
        override fun licenseName(licenseName: String) {
            cdkBuilder.licenseName(licenseName)
        }

        /**
         * Product name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productname)
         *
         * @param productName Product name.
         */
        override fun productName(productName: String) {
            cdkBuilder.productName(productName)
        }

        /**
         * Product SKU.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-productsku)
         *
         * @param productSku Product SKU.
         */
        override fun productSku(productSku: String) {
            cdkBuilder.productSku(productSku)
        }

        /**
         * License status.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-status)
         *
         * @param status License status.
         */
        override fun status(status: String) {
            cdkBuilder.status(status)
        }

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        override fun validity(validity: IResolvable) {
            cdkBuilder.validity(validity.let(IResolvable::unwrap))
        }

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        override fun validity(validity: ValidityDateFormatProperty) {
            cdkBuilder.validity(validity.let(ValidityDateFormatProperty::unwrap))
        }

        /**
         * Date and time range during which the license is valid, in ISO8601-UTC format.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-licensemanager-license.html#cfn-licensemanager-license-validity)
         *
         * @param validity Date and time range during which the license is valid, in ISO8601-UTC
         *   format.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b49fdc58228a7e055f6a063c67168019576b3a8b23cbc543b8083466e26e70aa")
        override fun validity(validity: ValidityDateFormatProperty.Builder.() -> Unit): Unit =
            validity(ValidityDateFormatProperty(validity))

        public fun build(): software.amazon.awscdk.services.licensemanager.CfnLicense =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnLicense {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnLicense(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.licensemanager.CfnLicense
        ): CfnLicense = CfnLicense(cdkObject)

        internal fun unwrap(
            wrapped: CfnLicense
        ): software.amazon.awscdk.services.licensemanager.CfnLicense = wrapped.cdkObject
    }

    public interface ProvisionalConfigurationProperty {
        /**
         * Maximum time for the provisional configuration, in minutes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-provisionalconfiguration.html#cfn-licensemanager-license-provisionalconfiguration-maxtimetoliveinminutes)
         */
        public fun maxTimeToLiveInMinutes(): Number

        /** A builder for [ProvisionalConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param maxTimeToLiveInMinutes Maximum time for the provisional configuration, in
             *   minutes.
             */
            public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense
                    .ProvisionalConfigurationProperty
                    .builder()

            /**
             * @param maxTimeToLiveInMinutes Maximum time for the provisional configuration, in
             *   minutes.
             */
            override fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
                cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty,
        ) : ProvisionalConfigurationProperty {
            /**
             * Maximum time for the provisional configuration, in minutes.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-provisionalconfiguration.html#cfn-licensemanager-license-provisionalconfiguration-maxtimetoliveinminutes)
             */
            override fun maxTimeToLiveInMinutes(): Number = unwrap(this).getMaxTimeToLiveInMinutes()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ProvisionalConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty
            ): ProvisionalConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ProvisionalConfigurationProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.ProvisionalConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface MetadataProperty {
        /**
         * The key name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html#cfn-licensemanager-license-metadata-name)
         */
        public fun name(): String

        /**
         * The value.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html#cfn-licensemanager-license-metadata-value)
         */
        public fun `value`(): String

        /** A builder for [MetadataProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name The key name. */
            public fun name(name: String)

            /** @param value The value. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty.builder()

            /** @param name The key name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /** @param value The value. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty,
        ) : MetadataProperty {
            /**
             * The key name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html#cfn-licensemanager-license-metadata-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * The value.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-metadata.html#cfn-licensemanager-license-metadata-value)
             */
            override fun `value`(): String = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty
            ): MetadataProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: MetadataProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.MetadataProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface EntitlementProperty {
        /**
         * Indicates whether check-ins are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-allowcheckin)
         */
        public fun allowCheckIn(): Any? = unwrap(this).getAllowCheckIn()

        /**
         * Maximum entitlement count.
         *
         * Use if the unit is not None.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-maxcount)
         */
        public fun maxCount(): Number? = unwrap(this).getMaxCount()

        /**
         * Entitlement name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-name)
         */
        public fun name(): String

        /**
         * Indicates whether overages are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-overage)
         */
        public fun overage(): Any? = unwrap(this).getOverage()

        /**
         * Entitlement unit.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-unit)
         */
        public fun unit(): String

        /**
         * Entitlement resource.
         *
         * Use only if the unit is None.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-value)
         */
        public fun `value`(): String? = unwrap(this).getValue()

        /** A builder for [EntitlementProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param allowCheckIn Indicates whether check-ins are allowed. */
            public fun allowCheckIn(allowCheckIn: Boolean)

            /** @param allowCheckIn Indicates whether check-ins are allowed. */
            public fun allowCheckIn(allowCheckIn: IResolvable)

            /** @param maxCount Maximum entitlement count. Use if the unit is not None. */
            public fun maxCount(maxCount: Number)

            /** @param name Entitlement name. */
            public fun name(name: String)

            /** @param overage Indicates whether overages are allowed. */
            public fun overage(overage: Boolean)

            /** @param overage Indicates whether overages are allowed. */
            public fun overage(overage: IResolvable)

            /** @param unit Entitlement unit. */
            public fun unit(unit: String)

            /** @param value Entitlement resource. Use only if the unit is None. */
            public fun `value`(`value`: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty
                    .builder()

            /** @param allowCheckIn Indicates whether check-ins are allowed. */
            override fun allowCheckIn(allowCheckIn: Boolean) {
                cdkBuilder.allowCheckIn(allowCheckIn)
            }

            /** @param allowCheckIn Indicates whether check-ins are allowed. */
            override fun allowCheckIn(allowCheckIn: IResolvable) {
                cdkBuilder.allowCheckIn(allowCheckIn.let(IResolvable::unwrap))
            }

            /** @param maxCount Maximum entitlement count. Use if the unit is not None. */
            override fun maxCount(maxCount: Number) {
                cdkBuilder.maxCount(maxCount)
            }

            /** @param name Entitlement name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /** @param overage Indicates whether overages are allowed. */
            override fun overage(overage: Boolean) {
                cdkBuilder.overage(overage)
            }

            /** @param overage Indicates whether overages are allowed. */
            override fun overage(overage: IResolvable) {
                cdkBuilder.overage(overage.let(IResolvable::unwrap))
            }

            /** @param unit Entitlement unit. */
            override fun unit(unit: String) {
                cdkBuilder.unit(unit)
            }

            /** @param value Entitlement resource. Use only if the unit is None. */
            override fun `value`(`value`: String) {
                cdkBuilder.`value`(`value`)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty,
        ) : EntitlementProperty {
            /**
             * Indicates whether check-ins are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-allowcheckin)
             */
            override fun allowCheckIn(): Any? = unwrap(this).getAllowCheckIn()

            /**
             * Maximum entitlement count.
             *
             * Use if the unit is not None.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-maxcount)
             */
            override fun maxCount(): Number? = unwrap(this).getMaxCount()

            /**
             * Entitlement name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * Indicates whether overages are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-overage)
             */
            override fun overage(): Any? = unwrap(this).getOverage()

            /**
             * Entitlement unit.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-unit)
             */
            override fun unit(): String = unwrap(this).getUnit()

            /**
             * Entitlement resource.
             *
             * Use only if the unit is None.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-entitlement.html#cfn-licensemanager-license-entitlement-value)
             */
            override fun `value`(): String? = unwrap(this).getValue()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): EntitlementProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty
            ): EntitlementProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: EntitlementProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.EntitlementProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ValidityDateFormatProperty {
        /**
         * Start of the time range.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html#cfn-licensemanager-license-validitydateformat-begin)
         */
        public fun begin(): String

        /**
         * End of the time range.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html#cfn-licensemanager-license-validitydateformat-end)
         */
        public fun end(): String

        /** A builder for [ValidityDateFormatProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param begin Start of the time range. */
            public fun begin(begin: String)

            /** @param end End of the time range. */
            public fun end(end: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty
                    .builder()

            /** @param begin Start of the time range. */
            override fun begin(begin: String) {
                cdkBuilder.begin(begin)
            }

            /** @param end End of the time range. */
            override fun end(end: String) {
                cdkBuilder.end(end)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty,
        ) : ValidityDateFormatProperty {
            /**
             * Start of the time range.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html#cfn-licensemanager-license-validitydateformat-begin)
             */
            override fun begin(): String = unwrap(this).getBegin()

            /**
             * End of the time range.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-validitydateformat.html#cfn-licensemanager-license-validitydateformat-end)
             */
            override fun end(): String = unwrap(this).getEnd()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): ValidityDateFormatProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty
            ): ValidityDateFormatProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ValidityDateFormatProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.ValidityDateFormatProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface IssuerDataProperty {
        /**
         * Issuer name.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html#cfn-licensemanager-license-issuerdata-name)
         */
        public fun name(): String

        /**
         * Asymmetric KMS key from AWS Key Management Service .
         *
         * The KMS key must have a key usage of sign and verify, and support the RSASSA-PSS SHA-256
         * signing algorithm.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html#cfn-licensemanager-license-issuerdata-signkey)
         */
        public fun signKey(): String? = unwrap(this).getSignKey()

        /** A builder for [IssuerDataProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param name Issuer name. */
            public fun name(name: String)

            /**
             * @param signKey Asymmetric KMS key from AWS Key Management Service . The KMS key must
             *   have a key usage of sign and verify, and support the RSASSA-PSS SHA-256 signing
             *   algorithm.
             */
            public fun signKey(signKey: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty
                    .builder()

            /** @param name Issuer name. */
            override fun name(name: String) {
                cdkBuilder.name(name)
            }

            /**
             * @param signKey Asymmetric KMS key from AWS Key Management Service . The KMS key must
             *   have a key usage of sign and verify, and support the RSASSA-PSS SHA-256 signing
             *   algorithm.
             */
            override fun signKey(signKey: String) {
                cdkBuilder.signKey(signKey)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty,
        ) : IssuerDataProperty {
            /**
             * Issuer name.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html#cfn-licensemanager-license-issuerdata-name)
             */
            override fun name(): String = unwrap(this).getName()

            /**
             * Asymmetric KMS key from AWS Key Management Service .
             *
             * The KMS key must have a key usage of sign and verify, and support the RSASSA-PSS
             * SHA-256 signing algorithm.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-issuerdata.html#cfn-licensemanager-license-issuerdata-signkey)
             */
            override fun signKey(): String? = unwrap(this).getSignKey()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): IssuerDataProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty
            ): IssuerDataProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: IssuerDataProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.IssuerDataProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface BorrowConfigurationProperty {
        /**
         * Indicates whether early check-ins are allowed.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html#cfn-licensemanager-license-borrowconfiguration-allowearlycheckin)
         */
        public fun allowEarlyCheckIn(): Any

        /**
         * Maximum time for the borrow configuration, in minutes.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html#cfn-licensemanager-license-borrowconfiguration-maxtimetoliveinminutes)
         */
        public fun maxTimeToLiveInMinutes(): Number

        /** A builder for [BorrowConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param allowEarlyCheckIn Indicates whether early check-ins are allowed. */
            public fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean)

            /** @param allowEarlyCheckIn Indicates whether early check-ins are allowed. */
            public fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable)

            /**
             * @param maxTimeToLiveInMinutes Maximum time for the borrow configuration, in minutes.
             */
            public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense
                    .BorrowConfigurationProperty
                    .builder()

            /** @param allowEarlyCheckIn Indicates whether early check-ins are allowed. */
            override fun allowEarlyCheckIn(allowEarlyCheckIn: Boolean) {
                cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn)
            }

            /** @param allowEarlyCheckIn Indicates whether early check-ins are allowed. */
            override fun allowEarlyCheckIn(allowEarlyCheckIn: IResolvable) {
                cdkBuilder.allowEarlyCheckIn(allowEarlyCheckIn.let(IResolvable::unwrap))
            }

            /**
             * @param maxTimeToLiveInMinutes Maximum time for the borrow configuration, in minutes.
             */
            override fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
                cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty,
        ) : BorrowConfigurationProperty {
            /**
             * Indicates whether early check-ins are allowed.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html#cfn-licensemanager-license-borrowconfiguration-allowearlycheckin)
             */
            override fun allowEarlyCheckIn(): Any = unwrap(this).getAllowEarlyCheckIn()

            /**
             * Maximum time for the borrow configuration, in minutes.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-borrowconfiguration.html#cfn-licensemanager-license-borrowconfiguration-maxtimetoliveinminutes)
             */
            override fun maxTimeToLiveInMinutes(): Number = unwrap(this).getMaxTimeToLiveInMinutes()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): BorrowConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty
            ): BorrowConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: BorrowConfigurationProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.BorrowConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }

    public interface ConsumptionConfigurationProperty {
        /**
         * Details about a borrow configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-borrowconfiguration)
         */
        public fun borrowConfiguration(): Any? = unwrap(this).getBorrowConfiguration()

        /**
         * Details about a provisional configuration.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-provisionalconfiguration)
         */
        public fun provisionalConfiguration(): Any? = unwrap(this).getProvisionalConfiguration()

        /**
         * Renewal frequency.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-renewtype)
         */
        public fun renewType(): String? = unwrap(this).getRenewType()

        /** A builder for [ConsumptionConfigurationProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param borrowConfiguration Details about a borrow configuration. */
            public fun borrowConfiguration(borrowConfiguration: IResolvable)

            /** @param borrowConfiguration Details about a borrow configuration. */
            public fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty)

            /** @param borrowConfiguration Details about a borrow configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e17b42d180bed9064b92db2ed67943a13fd53dba08f9509bb51af24a6728592a")
            public fun borrowConfiguration(
                borrowConfiguration: BorrowConfigurationProperty.Builder.() -> Unit
            )

            /** @param provisionalConfiguration Details about a provisional configuration. */
            public fun provisionalConfiguration(provisionalConfiguration: IResolvable)

            /** @param provisionalConfiguration Details about a provisional configuration. */
            public fun provisionalConfiguration(
                provisionalConfiguration: ProvisionalConfigurationProperty
            )

            /** @param provisionalConfiguration Details about a provisional configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("deec56397e9f8598e97e6b157023f292b91f6df1781d03d5b810783919c042c3")
            public fun provisionalConfiguration(
                provisionalConfiguration: ProvisionalConfigurationProperty.Builder.() -> Unit
            )

            /** @param renewType Renewal frequency. */
            public fun renewType(renewType: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty.Builder =
                software.amazon.awscdk.services.licensemanager.CfnLicense
                    .ConsumptionConfigurationProperty
                    .builder()

            /** @param borrowConfiguration Details about a borrow configuration. */
            override fun borrowConfiguration(borrowConfiguration: IResolvable) {
                cdkBuilder.borrowConfiguration(borrowConfiguration.let(IResolvable::unwrap))
            }

            /** @param borrowConfiguration Details about a borrow configuration. */
            override fun borrowConfiguration(borrowConfiguration: BorrowConfigurationProperty) {
                cdkBuilder.borrowConfiguration(
                    borrowConfiguration.let(BorrowConfigurationProperty::unwrap)
                )
            }

            /** @param borrowConfiguration Details about a borrow configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("e17b42d180bed9064b92db2ed67943a13fd53dba08f9509bb51af24a6728592a")
            override fun borrowConfiguration(
                borrowConfiguration: BorrowConfigurationProperty.Builder.() -> Unit
            ): Unit = borrowConfiguration(BorrowConfigurationProperty(borrowConfiguration))

            /** @param provisionalConfiguration Details about a provisional configuration. */
            override fun provisionalConfiguration(provisionalConfiguration: IResolvable) {
                cdkBuilder.provisionalConfiguration(
                    provisionalConfiguration.let(IResolvable::unwrap)
                )
            }

            /** @param provisionalConfiguration Details about a provisional configuration. */
            override fun provisionalConfiguration(
                provisionalConfiguration: ProvisionalConfigurationProperty
            ) {
                cdkBuilder.provisionalConfiguration(
                    provisionalConfiguration.let(ProvisionalConfigurationProperty::unwrap)
                )
            }

            /** @param provisionalConfiguration Details about a provisional configuration. */
            @Suppress("INAPPLICABLE_JVM_NAME")
            @JvmName("deec56397e9f8598e97e6b157023f292b91f6df1781d03d5b810783919c042c3")
            override fun provisionalConfiguration(
                provisionalConfiguration: ProvisionalConfigurationProperty.Builder.() -> Unit
            ): Unit =
                provisionalConfiguration(ProvisionalConfigurationProperty(provisionalConfiguration))

            /** @param renewType Renewal frequency. */
            override fun renewType(renewType: String) {
                cdkBuilder.renewType(renewType)
            }

            public fun build():
                software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject:
                software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty,
        ) : ConsumptionConfigurationProperty {
            /**
             * Details about a borrow configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-borrowconfiguration)
             */
            override fun borrowConfiguration(): Any? = unwrap(this).getBorrowConfiguration()

            /**
             * Details about a provisional configuration.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-provisionalconfiguration)
             */
            override fun provisionalConfiguration(): Any? =
                unwrap(this).getProvisionalConfiguration()

            /**
             * Renewal frequency.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-consumptionconfiguration.html#cfn-licensemanager-license-consumptionconfiguration-renewtype)
             */
            override fun renewType(): String? = unwrap(this).getRenewType()
        }

        public companion object {
            init {}

            public operator fun invoke(
                block: Builder.() -> Unit = {}
            ): ConsumptionConfigurationProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject:
                    software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty
            ): ConsumptionConfigurationProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: ConsumptionConfigurationProperty
            ): software.amazon.awscdk.services.licensemanager.CfnLicense.ConsumptionConfigurationProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
