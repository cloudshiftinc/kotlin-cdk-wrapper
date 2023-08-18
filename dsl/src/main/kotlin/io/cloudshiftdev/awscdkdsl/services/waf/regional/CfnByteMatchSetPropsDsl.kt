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

package io.cloudshiftdev.awscdkdsl.services.waf.regional

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSetProps

/**
 * Properties for defining a `CfnByteMatchSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnByteMatchSetProps cfnByteMatchSetProps = CfnByteMatchSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .byteMatchTuples(List.of(ByteMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .positionalConstraint("positionalConstraint")
 * .textTransformation("textTransformation")
 * // the properties below are optional
 * .targetString("targetString")
 * .targetStringBase64("targetStringBase64")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html)
 */
@CdkDslMarker
public class CfnByteMatchSetPropsDsl {
    private val cdkBuilder: CfnByteMatchSetProps.Builder = CfnByteMatchSetProps.builder()

    private val _byteMatchTuples: MutableList<Any> = mutableListOf()

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(vararg byteMatchTuples: Any) {
        _byteMatchTuples.addAll(listOf(*byteMatchTuples))
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: Collection<Any>) {
        _byteMatchTuples.addAll(byteMatchTuples)
    }

    /**
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: IResolvable) {
        cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    /**
     * @param name A friendly name or description of the `ByteMatchSet` . You can't change `Name`
     *   after you create a `ByteMatchSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnByteMatchSetProps {
        if (_byteMatchTuples.isNotEmpty()) cdkBuilder.byteMatchTuples(_byteMatchTuples)
        return cdkBuilder.build()
    }
}
