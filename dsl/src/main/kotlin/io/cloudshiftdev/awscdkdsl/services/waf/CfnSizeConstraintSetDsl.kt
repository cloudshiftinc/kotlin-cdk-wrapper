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

package io.cloudshiftdev.awscdkdsl.services.waf

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnSizeConstraintSet
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
 * A complex type that contains `SizeConstraint` objects, which specify the parts of web requests
 * that you want AWS WAF to inspect the size of. If a `SizeConstraintSet` contains more than one
 * `SizeConstraint` object, a request only needs to match one constraint to be considered a match.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnSizeConstraintSet cfnSizeConstraintSet = CfnSizeConstraintSet.Builder.create(this,
 * "MyCfnSizeConstraintSet")
 * .name("name")
 * .sizeConstraints(List.of(SizeConstraintProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .size(123)
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html)
 */
@CdkDslMarker
public class CfnSizeConstraintSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSizeConstraintSet.Builder =
        CfnSizeConstraintSet.Builder.create(scope, id)

    private val _sizeConstraints: MutableList<Any> = mutableListOf()

    /**
     * The name, if any, of the `SizeConstraintSet` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name)
     *
     * @param name The name, if any, of the `SizeConstraintSet` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
     *
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(vararg sizeConstraints: Any) {
        _sizeConstraints.addAll(listOf(*sizeConstraints))
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
     *
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(sizeConstraints: Collection<Any>) {
        _sizeConstraints.addAll(sizeConstraints)
    }

    /**
     * The size constraint and the part of the web request to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints)
     *
     * @param sizeConstraints The size constraint and the part of the web request to check.
     */
    public fun sizeConstraints(sizeConstraints: IResolvable) {
        cdkBuilder.sizeConstraints(sizeConstraints)
    }

    public fun build(): CfnSizeConstraintSet {
        if (_sizeConstraints.isNotEmpty()) cdkBuilder.sizeConstraints(_sizeConstraints)
        return cdkBuilder.build()
    }
}
