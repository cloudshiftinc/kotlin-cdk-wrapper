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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnFaq
import software.constructs.Construct

/**
 * Creates an new set of frequently asked question (FAQ) questions and answers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * CfnFaq cfnFaq = CfnFaq.Builder.create(this, "MyCfnFaq")
 * .indexId("indexId")
 * .name("name")
 * .roleArn("roleArn")
 * .s3Path(S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .fileFormat("fileFormat")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html)
 */
@CdkDslMarker
public class CfnFaqDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFaq.Builder = CfnFaq.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-description)
     *
     * @param description A description for the FAQ.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The format of the input file.
     *
     * You can choose between a basic CSV format, a CSV format that includes customs attributes in a
     * header, and a JSON format that includes custom attributes.
     *
     * The format must match the format of the file stored in the S3 bucket identified in the S3Path
     * parameter.
     *
     * Valid values are:
     * * `CSV`
     * * `CSV_WITH_HEADER`
     * * `JSON`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-fileformat)
     *
     * @param fileFormat The format of the input file.
     */
    public fun fileFormat(fileFormat: String) {
        cdkBuilder.fileFormat(fileFormat)
    }

    /**
     * The identifier of the index that contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-indexid)
     *
     * @param indexId The identifier of the index that contains the FAQ.
     */
    public fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
    }

    /**
     * The name that you assigned the FAQ when you created or updated the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-name)
     *
     * @param name The name that you assigned the FAQ when you created or updated the FAQ.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that
     * contains the FAQ.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     *   bucket that contains the FAQ.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     *
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     */
    public fun s3Path(s3Path: IResolvable) {
        cdkBuilder.s3Path(s3Path)
    }

    /**
     * The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-s3path)
     *
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     */
    public fun s3Path(s3Path: CfnFaq.S3PathProperty) {
        cdkBuilder.s3Path(s3Path)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-faq.html#cfn-kendra-faq-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFaq {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
