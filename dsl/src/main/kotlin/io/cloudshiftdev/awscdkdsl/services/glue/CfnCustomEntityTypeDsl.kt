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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.glue.CfnCustomEntityType
import software.constructs.Construct

/**
 * Creates a custom pattern that is used to detect sensitive data across the columns and rows of
 * your structured data.
 *
 * Each custom pattern you create specifies a regular expression and an optional list of context
 * words. If no context words are passed only a regular expression is checked.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnCustomEntityType cfnCustomEntityType = CfnCustomEntityType.Builder.create(this,
 * "MyCfnCustomEntityType")
 * .contextWords(List.of("contextWords"))
 * .name("name")
 * .regexString("regexString")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html)
 */
@CdkDslMarker
public class CfnCustomEntityTypeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomEntityType.Builder =
        CfnCustomEntityType.Builder.create(scope, id)

    private val _contextWords: MutableList<String> = mutableListOf()

    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     *
     * @param contextWords A list of context words.
     */
    public fun contextWords(vararg contextWords: String) {
        _contextWords.addAll(listOf(*contextWords))
    }

    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     *
     * @param contextWords A list of context words.
     */
    public fun contextWords(contextWords: Collection<String>) {
        _contextWords.addAll(contextWords)
    }

    /**
     * A name for the custom pattern that allows it to be retrieved or deleted later.
     *
     * This name must be unique per AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-name)
     *
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-regexstring)
     *
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     *   custom pattern.
     */
    public fun regexString(regexString: String) {
        cdkBuilder.regexString(regexString)
    }

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
     *
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
     *
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnCustomEntityType {
        if (_contextWords.isNotEmpty()) cdkBuilder.contextWords(_contextWords)
        return cdkBuilder.build()
    }
}
