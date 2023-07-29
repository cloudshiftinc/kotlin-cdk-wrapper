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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnFaq
import software.amazon.awscdk.services.kendra.CfnFaqProps

/**
 * Properties for defining a `CfnFaq`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * CfnFaqProps cfnFaqProps = CfnFaqProps.builder()
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
public class CfnFaqPropsDsl {
    private val cdkBuilder: CfnFaqProps.Builder = CfnFaqProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description for the FAQ. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fileFormat The format of the input file. You can choose between a basic CSV format, a
     *   CSV format that includes customs attributes in a header, and a JSON format that includes
     *   custom attributes.
     *
     * The format must match the format of the file stored in the S3 bucket identified in the S3Path
     * parameter.
     *
     * Valid values are:
     * * `CSV`
     * * `CSV_WITH_HEADER`
     * * `JSON`
     */
    public fun fileFormat(fileFormat: String) {
        cdkBuilder.fileFormat(fileFormat)
    }

    /** @param indexId The identifier of the index that contains the FAQ. */
    public fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
    }

    /** @param name The name that you assigned the FAQ when you created or updated the FAQ. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the S3
     *   bucket that contains the FAQ.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     */
    public fun s3Path(s3Path: IResolvable) {
        cdkBuilder.s3Path(s3Path)
    }

    /**
     * @param s3Path The Amazon Simple Storage Service (Amazon S3) location of the FAQ input data.
     */
    public fun s3Path(s3Path: CfnFaq.S3PathProperty) {
        cdkBuilder.s3Path(s3Path)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFaqProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
