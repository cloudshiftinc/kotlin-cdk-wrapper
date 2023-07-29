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

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnXssMatchSetProps

/**
 * Properties for defining a `CfnXssMatchSet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * CfnXssMatchSetProps cfnXssMatchSetProps = CfnXssMatchSetProps.builder()
 * .name("name")
 * // the properties below are optional
 * .xssMatchTuples(List.of(XssMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-xssmatchset.html)
 */
@CdkDslMarker
public class CfnXssMatchSetPropsDsl {
    private val cdkBuilder: CfnXssMatchSetProps.Builder = CfnXssMatchSetProps.builder()

    private val _xssMatchTuples: MutableList<Any> = mutableListOf()

    /** @param name The name, if any, of the `XssMatchSet` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     *   cross-site scripting attacks.
     */
    public fun xssMatchTuples(vararg xssMatchTuples: Any) {
        _xssMatchTuples.addAll(listOf(*xssMatchTuples))
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     *   cross-site scripting attacks.
     */
    public fun xssMatchTuples(xssMatchTuples: Collection<Any>) {
        _xssMatchTuples.addAll(xssMatchTuples)
    }

    /**
     * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
     *   cross-site scripting attacks.
     */
    public fun xssMatchTuples(xssMatchTuples: IResolvable) {
        cdkBuilder.xssMatchTuples(xssMatchTuples)
    }

    public fun build(): CfnXssMatchSetProps {
        if (_xssMatchTuples.isNotEmpty()) cdkBuilder.xssMatchTuples(_xssMatchTuples)
        return cdkBuilder.build()
    }
}
