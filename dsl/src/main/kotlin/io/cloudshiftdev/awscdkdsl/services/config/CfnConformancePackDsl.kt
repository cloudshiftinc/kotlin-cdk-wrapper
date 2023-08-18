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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConformancePack
import software.constructs.Construct

/**
 * A conformance pack is a collection of AWS Config rules and remediation actions that can be easily
 * deployed in an account and a region.
 *
 * ConformancePack creates a service linked role in your account. The service linked role is created
 * only when the role does not exist in your account.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object templateSsmDocumentDetails;
 * CfnConformancePack cfnConformancePack = CfnConformancePack.Builder.create(this,
 * "MyCfnConformancePack")
 * .conformancePackName("conformancePackName")
 * // the properties below are optional
 * .conformancePackInputParameters(List.of(ConformancePackInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .deliveryS3Bucket("deliveryS3Bucket")
 * .deliveryS3KeyPrefix("deliveryS3KeyPrefix")
 * .templateBody("templateBody")
 * .templateS3Uri("templateS3Uri")
 * .templateSsmDocumentDetails(templateSsmDocumentDetails)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html)
 */
@CdkDslMarker
public class CfnConformancePackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConformancePack.Builder =
        CfnConformancePack.Builder.create(scope, id)

    private val _conformancePackInputParameters: MutableList<Any> = mutableListOf()

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     *
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(vararg conformancePackInputParameters: Any) {
        _conformancePackInputParameters.addAll(listOf(*conformancePackInputParameters))
    }

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     *
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: Collection<Any>) {
        _conformancePackInputParameters.addAll(conformancePackInputParameters)
    }

    /**
     * A list of ConformancePackInputParameter objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackinputparameters)
     *
     * @param conformancePackInputParameters A list of ConformancePackInputParameter objects.
     */
    public fun conformancePackInputParameters(conformancePackInputParameters: IResolvable) {
        cdkBuilder.conformancePackInputParameters(conformancePackInputParameters)
    }

    /**
     * Name of the conformance pack you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-conformancepackname)
     *
     * @param conformancePackName Name of the conformance pack you want to create.
     */
    public fun conformancePackName(conformancePackName: String) {
        cdkBuilder.conformancePackName(conformancePackName)
    }

    /**
     * The name of the Amazon S3 bucket where AWS Config stores conformance pack templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3bucket)
     *
     * @param deliveryS3Bucket The name of the Amazon S3 bucket where AWS Config stores conformance
     *   pack templates.
     */
    public fun deliveryS3Bucket(deliveryS3Bucket: String) {
        cdkBuilder.deliveryS3Bucket(deliveryS3Bucket)
    }

    /**
     * The prefix for the Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-deliverys3keyprefix)
     *
     * @param deliveryS3KeyPrefix The prefix for the Amazon S3 bucket.
     */
    public fun deliveryS3KeyPrefix(deliveryS3KeyPrefix: String) {
        cdkBuilder.deliveryS3KeyPrefix(deliveryS3KeyPrefix)
    }

    /**
     * A string containing full conformance pack template body.
     *
     * Structure containing the template body with a minimum length of 1 byte and a maximum length
     * of 51,200 bytes.
     *
     * You can only use a YAML template with two resource types: config rule (
     * `AWS::Config::ConfigRule` ) and a remediation action (
     * `AWS::Config::RemediationConfiguration` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatebody)
     *
     * @param templateBody A string containing full conformance pack template body.
     */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /**
     * Location of file containing the template body (s3://bucketname/prefix).
     *
     * The uri must point to the conformance pack template (max size: 300 KB) that is located in an
     * Amazon S3 bucket.
     *
     * You must have access to read Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templates3uri)
     *
     * @param templateS3Uri Location of file containing the template body (s3://bucketname/prefix).
     */
    public fun templateS3Uri(templateS3Uri: String) {
        cdkBuilder.templateS3Uri(templateS3Uri)
    }

    /**
     * The TemplateSSMDocumentDetails object contains the name of the SSM document and the version
     * of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
     *
     * @param templateSsmDocumentDetails The TemplateSSMDocumentDetails object contains the name of
     *   the SSM document and the version of the SSM document.
     */
    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(templateSsmDocumentDetails)
        cdkBuilder.templateSsmDocumentDetails(builder.map)
    }

    /**
     * The TemplateSSMDocumentDetails object contains the name of the SSM document and the version
     * of the SSM document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-conformancepack.html#cfn-config-conformancepack-templatessmdocumentdetails)
     *
     * @param templateSsmDocumentDetails The TemplateSSMDocumentDetails object contains the name of
     *   the SSM document and the version of the SSM document.
     */
    public fun templateSsmDocumentDetails(templateSsmDocumentDetails: Any) {
        cdkBuilder.templateSsmDocumentDetails(templateSsmDocumentDetails)
    }

    public fun build(): CfnConformancePack {
        if (_conformancePackInputParameters.isNotEmpty())
            cdkBuilder.conformancePackInputParameters(_conformancePackInputParameters)
        return cdkBuilder.build()
    }
}
