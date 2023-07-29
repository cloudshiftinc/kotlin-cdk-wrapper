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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplate

/**
 * Describes constraints that apply to the template fields.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * ConstraintsProperty constraintsProperty = ConstraintsProperty.builder()
 * .invisibleFields(List.of(InvisibleFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .readOnlyFields(List.of(ReadOnlyFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .requiredFields(List.of(RequiredFieldInfoProperty.builder()
 * .id(FieldIdentifierProperty.builder()
 * .name("name")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-tasktemplate-constraints.html)
 */
@CdkDslMarker
public class CfnTaskTemplateConstraintsPropertyDsl {
    private val cdkBuilder: CfnTaskTemplate.ConstraintsProperty.Builder =
        CfnTaskTemplate.ConstraintsProperty.builder()

    private val _invisibleFields: MutableList<Any> = mutableListOf()

    private val _readOnlyFields: MutableList<Any> = mutableListOf()

    private val _requiredFields: MutableList<Any> = mutableListOf()

    /** @param invisibleFields Lists the fields that are invisible to agents. */
    public fun invisibleFields(vararg invisibleFields: Any) {
        _invisibleFields.addAll(listOf(*invisibleFields))
    }

    /** @param invisibleFields Lists the fields that are invisible to agents. */
    public fun invisibleFields(invisibleFields: Collection<Any>) {
        _invisibleFields.addAll(invisibleFields)
    }

    /** @param invisibleFields Lists the fields that are invisible to agents. */
    public fun invisibleFields(invisibleFields: IResolvable) {
        cdkBuilder.invisibleFields(invisibleFields)
    }

    /**
     * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
     */
    public fun readOnlyFields(vararg readOnlyFields: Any) {
        _readOnlyFields.addAll(listOf(*readOnlyFields))
    }

    /**
     * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
     */
    public fun readOnlyFields(readOnlyFields: Collection<Any>) {
        _readOnlyFields.addAll(readOnlyFields)
    }

    /**
     * @param readOnlyFields Lists the fields that are read-only to agents, and cannot be edited.
     */
    public fun readOnlyFields(readOnlyFields: IResolvable) {
        cdkBuilder.readOnlyFields(readOnlyFields)
    }

    /** @param requiredFields Lists the fields that are required to be filled by agents. */
    public fun requiredFields(vararg requiredFields: Any) {
        _requiredFields.addAll(listOf(*requiredFields))
    }

    /** @param requiredFields Lists the fields that are required to be filled by agents. */
    public fun requiredFields(requiredFields: Collection<Any>) {
        _requiredFields.addAll(requiredFields)
    }

    /** @param requiredFields Lists the fields that are required to be filled by agents. */
    public fun requiredFields(requiredFields: IResolvable) {
        cdkBuilder.requiredFields(requiredFields)
    }

    public fun build(): CfnTaskTemplate.ConstraintsProperty {
        if (_invisibleFields.isNotEmpty()) cdkBuilder.invisibleFields(_invisibleFields)
        if (_readOnlyFields.isNotEmpty()) cdkBuilder.readOnlyFields(_readOnlyFields)
        if (_requiredFields.isNotEmpty()) cdkBuilder.requiredFields(_requiredFields)
        return cdkBuilder.build()
    }
}
