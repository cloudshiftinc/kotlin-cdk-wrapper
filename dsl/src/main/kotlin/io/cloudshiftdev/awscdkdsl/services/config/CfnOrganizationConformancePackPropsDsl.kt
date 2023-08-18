@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnOrganizationConformancePackProps

/**
 * Properties for defining a `CfnOrganizationConformancePack`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CfnOrganizationConformancePackProps cfnOrganizationConformancePackProps =
 * CfnOrganizationConformancePackProps.builder()
 * .organizationConformancePackName("organizationConformancePackName")
 * // the properties below are optional
 * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .deliveryS3Bucket("deliveryS3Bucket")
 * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
 * .excludedAccounts(List.of("excludedAccounts"))
 * .templateBody("templateBody")
 * .templateS3Uri("templateS3Uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-organizationconformancepack.html)
 */
@CdkDslMarker
public class CfnOrganizationConformancePackPropsDsl {
    private val cdkBuilder: CfnOrganizationConformancePackProps.Builder =
        CfnOrganizationConformancePackProps.builder()

    private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

    private val _excludedAccounts: MutableList<String> = mutableListOf()

    /** @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
        _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
    }

    /** @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. */
    public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
        _conformancePackInputParameters.addAll(conformancePackInputParameters)
    }

    /** @param conformancePackInputParameters A list of `ConformancePackInputParameter` objects. */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
        cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     *   pack templates.
     *
     * This field is optional.
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String) {
        cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * @param deliveryS3KeyPrefix Any folder structure you want to add to an Amazon S3 bucket.
     *
     * This field is optional.
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
        cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     *   conformance pack.
     */
    public fun excludedAccounts(vararg excludedAccounts: String) {
        _excludedAccounts.addAll(listOf(*excludedAccounts))
    }

    /**
     * @param excludedAccounts A comma-separated list of accounts excluded from organization
     *   conformance pack.
     */
    public fun excludedAccounts(excludedAccounts: Collection<String>) {
        _excludedAccounts.addAll(excludedAccounts)
    }

    /**
     * @param organizationConformancePackName The name you assign to an organization conformance
     *   pack.
     */
    public fun organizationConformancePackName(organizationConformancePackName: String) {
        cdkBuilder.organizationConformancePackName(organizationConformancePackName)
    }

    /**
     * @param templateBody A string containing full conformance pack template body. Structure
     *   containing the template body with a minimum length of 1 byte and a maximum length of 51,200
     *   bytes.
     */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /**
     * @param templateS3Uri Location of file containing the template body. The uri must point to the
     *   conformance pack template (max size: 300 KB).
     */
    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    public fun build(): CfnOrganizationConformancePackProps {
        if (_conformancePackInputParameters.isNotEmpty())
            cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
        if (_excludedAccounts.isNotEmpty()) cdkBuilder.excludedAccounts(_excludedAccounts)
        return cdkBuilder.build()
    }
}
