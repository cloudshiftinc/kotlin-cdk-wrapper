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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lakeformation.CfnTag
import software.constructs.Construct

/**
 * The `AWS::LakeFormation::Tag` resource represents an LF-tag, which consists of a key and one or
 * more possible values for the key.
 *
 * During a stack operation, AWS CloudFormation calls the AWS Lake Formation `CreateLFTag` API to
 * create a tag, and `UpdateLFTag` API to update a tag resource, and a `DeleteLFTag` to delete it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CfnTag cfnTag = CfnTag.Builder.create(this, "MyCfnTag")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * // the properties below are optional
 * .catalogId("catalogId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html)
 */
@CdkDslMarker
public class CfnTagDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTag.Builder = CfnTag.Builder.create(scope, id)

    private val _tagValues: MutableList<String> = mutableListOf()

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The identifier for the Data Catalog . By default, the account ID. The Data Catalog is the
     * persistent metadata store. It contains database definitions, table definitions, and other
     * control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-catalogid)
     *
     * @param catalogId Catalog id string, not less than 1 or more than 255 bytes long, matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   .
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagkey)
     *
     * @param tagKey UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   .
     */
    public fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     *
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings.
     */
    public fun tagValues(vararg tagValues: String) {
        _tagValues.addAll(listOf(*tagValues))
    }

    /**
     * An array of UTF-8 strings, not less than 1 or more than 50 strings.
     *
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tag.html#cfn-lakeformation-tag-tagvalues)
     *
     * @param tagValues An array of UTF-8 strings, not less than 1 or more than 50 strings.
     */
    public fun tagValues(tagValues: Collection<String>) {
        _tagValues.addAll(tagValues)
    }

    public fun build(): CfnTag {
        if (_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
        return cdkBuilder.build()
    }
}
