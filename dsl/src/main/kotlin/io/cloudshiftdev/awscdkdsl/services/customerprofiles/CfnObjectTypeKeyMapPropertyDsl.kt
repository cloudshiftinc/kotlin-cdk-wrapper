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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectType

/**
 * A unique key map that can be used to map data to the profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * KeyMapProperty keyMapProperty = KeyMapProperty.builder()
 * .name("name")
 * .objectTypeKeyList(List.of(ObjectTypeKeyProperty.builder()
 * .fieldNames(List.of("fieldNames"))
 * .standardIdentifiers(List.of("standardIdentifiers"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-objecttype-keymap.html)
 */
@CdkDslMarker
public class CfnObjectTypeKeyMapPropertyDsl {
    private val cdkBuilder: CfnObjectType.KeyMapProperty.Builder =
        CfnObjectType.KeyMapProperty.builder()

    private val _objectTypeKeyList: MutableList<Any> = mutableListOf()

    /** @param name Name of the key. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param objectTypeKeyList A list of ObjectTypeKey. */
    public fun objectTypeKeyList(vararg objectTypeKeyList: Any) {
        _objectTypeKeyList.addAll(listOf(*objectTypeKeyList))
    }

    /** @param objectTypeKeyList A list of ObjectTypeKey. */
    public fun objectTypeKeyList(objectTypeKeyList: Collection<Any>) {
        _objectTypeKeyList.addAll(objectTypeKeyList)
    }

    /** @param objectTypeKeyList A list of ObjectTypeKey. */
    public fun objectTypeKeyList(objectTypeKeyList: IResolvable) {
        cdkBuilder.objectTypeKeyList(objectTypeKeyList)
    }

    public fun build(): CfnObjectType.KeyMapProperty {
        if (_objectTypeKeyList.isNotEmpty()) cdkBuilder.objectTypeKeyList(_objectTypeKeyList)
        return cdkBuilder.build()
    }
}
