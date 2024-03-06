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
import software.amazon.awscdk.services.glue.CfnCustomEntityTypeProps

/**
 * Properties for defining a `CfnCustomEntityType`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object tags;
 * CfnCustomEntityTypeProps cfnCustomEntityTypeProps = CfnCustomEntityTypeProps.builder()
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
public class CfnCustomEntityTypePropsDsl {
    private val cdkBuilder: CfnCustomEntityTypeProps.Builder = CfnCustomEntityTypeProps.builder()

    private val _contextWords: MutableList<String> = mutableListOf()

    /**
     * @param contextWords A list of context words. If none of these context words are found within
     *   the vicinity of the regular expression the data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    public fun contextWords(vararg contextWords: String) {
        _contextWords.addAll(listOf(*contextWords))
    }

    /**
     * @param contextWords A list of context words. If none of these context words are found within
     *   the vicinity of the regular expression the data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     */
    public fun contextWords(contextWords: Collection<String>) {
        _contextWords.addAll(contextWords)
    }

    /**
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later.
     *   This name must be unique per AWS account.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     *   custom pattern.
     */
    public fun regexString(regexString: String) {
        cdkBuilder.regexString(regexString)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     *   line, or API.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnCustomEntityTypeProps {
        if (_contextWords.isNotEmpty()) cdkBuilder.contextWords(_contextWords)
        return cdkBuilder.build()
    }
}
