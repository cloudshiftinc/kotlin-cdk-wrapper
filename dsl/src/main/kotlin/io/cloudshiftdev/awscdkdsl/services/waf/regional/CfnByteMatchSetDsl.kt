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
import software.amazon.awscdk.services.waf.regional.CfnByteMatchSet
import software.constructs.Construct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see
 * [AWS WAF Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html)
 * in the developer guide.
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the
 * [AWS WAF Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html)
 * . With the latest version, AWS WAF has a single set of endpoints for regional and global use.
 *
 * The `AWS::WAFRegional::ByteMatchSet` resource creates an AWS WAF `ByteMatchSet` that identifies a
 * part of a web request that you want to inspect.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnByteMatchSet cfnByteMatchSet = CfnByteMatchSet.Builder.create(this, "MyCfnByteMatchSet")
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
public class CfnByteMatchSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnByteMatchSet.Builder = CfnByteMatchSet.Builder.create(scope, id)

    private val _byteMatchTuples: MutableList<Any> = mutableListOf()

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to
     * search, and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     *
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(vararg byteMatchTuples: Any) {
        _byteMatchTuples.addAll(listOf(*byteMatchTuples))
    }

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to
     * search, and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     *
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: Collection<Any>) {
        _byteMatchTuples.addAll(byteMatchTuples)
    }

    /**
     * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want
     * AWS WAF to search for in web requests, the location in requests that you want AWS WAF to
     * search, and other settings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-bytematchtuples)
     *
     * @param byteMatchTuples Specifies the bytes (typically a string that corresponds with ASCII
     *   characters) that you want AWS WAF to search for in web requests, the location in requests
     *   that you want AWS WAF to search, and other settings.
     */
    public fun byteMatchTuples(byteMatchTuples: IResolvable) {
        cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    /**
     * A friendly name or description of the `ByteMatchSet` .
     *
     * You can't change `Name` after you create a `ByteMatchSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-bytematchset.html#cfn-wafregional-bytematchset-name)
     *
     * @param name A friendly name or description of the `ByteMatchSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnByteMatchSet {
        if (_byteMatchTuples.isNotEmpty()) cdkBuilder.byteMatchTuples(_byteMatchTuples)
        return cdkBuilder.build()
    }
}
