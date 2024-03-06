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
import software.amazon.awscdk.services.iot.CfnCertificateProvider
import software.constructs.Construct

/**
 * Creates a certificate provider.
 *
 * AWS IoT Core certificate provider lets you customize how to sign a certificate signing request
 * (CSR) in fleet provisioning. For more information, see
 * [Self-managed certificate signing using AWS IoT Core certificate provider](https://docs.aws.amazon.com/iot/latest/developerguide/provisioning-cert-provider.html)
 * from the *AWS IoT Core Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnCertificateProvider cfnCertificateProvider = CfnCertificateProvider.Builder.create(this,
 * "MyCfnCertificateProvider")
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
public class CfnCertificateProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificateProvider.Builder =
        CfnCertificateProvider.Builder.create(scope, id)

    private val _accountDefaultForOperations: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     *
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     *   will use to generate certificates.
     */
    public fun accountDefaultForOperations(vararg accountDefaultForOperations: String) {
        _accountDefaultForOperations.addAll(listOf(*accountDefaultForOperations))
    }

    /**
     * A list of the operations that the certificate provider will use to generate certificates.
     *
     * Valid value: `CreateCertificateFromCsr` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-accountdefaultforoperations)
     *
     * @param accountDefaultForOperations A list of the operations that the certificate provider
     *   will use to generate certificates.
     */
    public fun accountDefaultForOperations(accountDefaultForOperations: Collection<String>) {
        _accountDefaultForOperations.addAll(accountDefaultForOperations)
    }

    /**
     * The name of the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-certificateprovidername)
     *
     * @param certificateProviderName The name of the certificate provider.
     */
    public fun certificateProviderName(certificateProviderName: String) {
        cdkBuilder.certificateProviderName(certificateProviderName)
    }

    /**
     * The ARN of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-lambdafunctionarn)
     *
     * @param lambdaFunctionArn The ARN of the Lambda function.
     */
    public fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
    }

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     *
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata that can be used to manage the certificate provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-certificateprovider.html#cfn-iot-certificateprovider-tags)
     *
     * @param tags Metadata that can be used to manage the certificate provider.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCertificateProvider {
        if (_accountDefaultForOperations.isNotEmpty())
            cdkBuilder.accountDefaultForOperations(_accountDefaultForOperations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
