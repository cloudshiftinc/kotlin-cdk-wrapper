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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.connect.CfnPredefinedAttribute

/**
 * The values of a predefined attribute.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * ValuesProperty valuesProperty = ValuesProperty.builder()
 * .stringList(List.of("stringList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-predefinedattribute-values.html)
 */
@CdkDslMarker
public class CfnPredefinedAttributeValuesPropertyDsl {
    private val cdkBuilder: CfnPredefinedAttribute.ValuesProperty.Builder =
        CfnPredefinedAttribute.ValuesProperty.builder()

    private val _stringList: MutableList<String> = mutableListOf()

    /** @param stringList Predefined attribute values of type string list. */
    public fun stringList(vararg stringList: String) {
        _stringList.addAll(listOf(*stringList))
    }

    /** @param stringList Predefined attribute values of type string list. */
    public fun stringList(stringList: Collection<String>) {
        _stringList.addAll(stringList)
    }

    public fun build(): CfnPredefinedAttribute.ValuesProperty {
        if (_stringList.isNotEmpty()) cdkBuilder.stringList(_stringList)
        return cdkBuilder.build()
    }
}
