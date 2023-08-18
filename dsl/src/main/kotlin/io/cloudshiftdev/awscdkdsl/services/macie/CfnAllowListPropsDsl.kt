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

package io.cloudshiftdev.awscdkdsl.services.macie

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps

/**
 * Properties for defining a `CfnAllowList`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnAllowListProps cfnAllowListProps = CfnAllowListProps.builder()
 * .criteria(CriteriaProperty.builder()
 * .regex("regex")
 * .s3WordsList(S3WordsListProperty.builder()
 * .bucketName("bucketName")
 * .objectKey("objectKey")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-allowlist.html)
 */
@CdkDslMarker
public class CfnAllowListPropsDsl {
    private val cdkBuilder: CfnAllowListProps.Builder = CfnAllowListProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. The criteria
     *   can be the location and name of an Amazon S3 object that lists specific text to ignore (
     *   `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to ignore.
     */
    public fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria)
    }

    /**
     * @param criteria The criteria that specify the text or text pattern to ignore. The criteria
     *   can be the location and name of an Amazon S3 object that lists specific text to ignore (
     *   `S3WordsList` ), or a regular expression ( `Regex` ) that defines a text pattern to ignore.
     */
    public fun criteria(criteria: CfnAllowList.CriteriaProperty) {
        cdkBuilder.criteria(criteria)
    }

    /**
     * @param description A custom description of the allow list. The description can contain 1-512
     *   characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A custom name for the allow list. The name can contain 1-128 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to the allow list. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to the allow list. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAllowListProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
