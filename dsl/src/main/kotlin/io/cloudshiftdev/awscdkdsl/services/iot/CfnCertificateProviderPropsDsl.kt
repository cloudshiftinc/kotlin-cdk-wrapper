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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnCertificateProviderProps

/**
 * Properties for defining a `CfnCertificateProvider`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnCertificateProviderProps cfnCertificateProviderProps = CfnCertificateProviderProps.builder()
 * .accountDefaultForOperations(List.of("accountDefaultForOperations"))
 * .lambdaFunctionArn("lambdaFunctionArn")
 * // the properties below are optional
 * .certificateProviderName("certificateProviderName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html)
 */
@CdkDslMarker
public class CfnCertificateProviderPropsDsl {
    private val cdkBuilder: CfnCertificateProviderProps.Builder =
        CfnCertificateProviderProps.builder()

    private val _accountDefaultForOperations: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     *   will use to generate certificates. Valid value: `CreateCertificateFromCsr` .
     */
    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String) {
        _accountDefaultForOperations.addAll(listOf(*accountDefaultForOperations))
    }

    /**
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     *   will use to generate certificates. Valid value: `CreateCertificateFromCsr` .
     */
    public fun accountDefaultForOperations(accountDefaultForOperations: Collection<String>) {
        _accountDefaultForOperations.addAll(accountDefaultForOperations)
    }

    /** @param certificateProviderName The name of the certificate provider. */
    public fun certificateProviderName(certificateProviderName: String) {
        cdkBuilder.certificateProviderName(certificateProviderName)
    }

    /** @param lambdaFunctionArn The ARN of the Lambda function. */
    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    /** @param tags Metadata that can be used to manage the certificate provider. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata that can be used to manage the certificate provider. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCertificateProviderProps {
        if (_accountDefaultForOperations.isNotEmpty())
            cdkBuilder.accountDefaultForOperations(_accountDefaultForOperations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
