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

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelection

/**
 * A list of conditions that you define for resources in your restore testing plan using tags.
 *
 * For example, `"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },` .
 * Condition operators are case sensitive.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ProtectedResourceConditionsProperty protectedResourceConditionsProperty =
 * ProtectedResourceConditionsProperty.builder()
 * .stringEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .stringNotEquals(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-protectedresourceconditions.html)
 */
@CdkDslMarker
public class CfnRestoreTestingSelectionProtectedResourceConditionsPropertyDsl {
    private val cdkBuilder: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder =
        CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.builder()

    private val _stringEquals: MutableList<Any> = mutableListOf()

    private val _stringNotEquals: MutableList<Any> = mutableListOf()

    /**
     * @param stringEquals Filters the values of your tagged resources for only those resources that
     *   you tagged with the same value. Also called "exact matching."
     */
    public fun stringEquals(vararg stringEquals: Any) {
        _stringEquals.addAll(listOf(*stringEquals))
    }

    /**
     * @param stringEquals Filters the values of your tagged resources for only those resources that
     *   you tagged with the same value. Also called "exact matching."
     */
    public fun stringEquals(stringEquals: Collection<Any>) {
        _stringEquals.addAll(stringEquals)
    }

    /**
     * @param stringEquals Filters the values of your tagged resources for only those resources that
     *   you tagged with the same value. Also called "exact matching."
     */
    public fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals)
    }

    /**
     * @param stringNotEquals Filters the values of your tagged resources for only those resources
     *   that you tagged that do not have the same value. Also called "negated matching."
     */
    public fun stringNotEquals(vararg stringNotEquals: Any) {
        _stringNotEquals.addAll(listOf(*stringNotEquals))
    }

    /**
     * @param stringNotEquals Filters the values of your tagged resources for only those resources
     *   that you tagged that do not have the same value. Also called "negated matching."
     */
    public fun stringNotEquals(stringNotEquals: Collection<Any>) {
        _stringNotEquals.addAll(stringNotEquals)
    }

    /**
     * @param stringNotEquals Filters the values of your tagged resources for only those resources
     *   that you tagged that do not have the same value. Also called "negated matching."
     */
    public fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals)
    }

    public fun build(): CfnRestoreTestingSelection.ProtectedResourceConditionsProperty {
        if (_stringEquals.isNotEmpty()) cdkBuilder.stringEquals(_stringEquals)
        if (_stringNotEquals.isNotEmpty()) cdkBuilder.stringNotEquals(_stringNotEquals)
        return cdkBuilder.build()
    }
}
