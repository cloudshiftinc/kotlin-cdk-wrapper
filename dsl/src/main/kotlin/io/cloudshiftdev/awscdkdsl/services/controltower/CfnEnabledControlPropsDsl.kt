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

package io.cloudshiftdev.awscdkdsl.services.controltower

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps

/**
 * Properties for defining a `CfnEnabledControl`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledControlProps cfnEnabledControlProps = CfnEnabledControlProps.builder()
 * .controlIdentifier("controlIdentifier")
 * .targetIdentifier("targetIdentifier")
 * // the properties below are optional
 * .parameters(List.of(EnabledControlParameterProperty.builder()
 * .key("key")
 * .value(value)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html)
 */
@CdkDslMarker
public class CfnEnabledControlPropsDsl {
    private val cdkBuilder: CfnEnabledControlProps.Builder = CfnEnabledControlProps.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param controlIdentifier The ARN of the control. Only *Strongly recommended* and *Elective*
     *   controls are permitted, with the exception of the *Region deny* control. For information on
     *   how to find the `controlIdentifier` , see
     *   [the overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html)
     *   .
     */
    public fun controlIdentifier(controlIdentifier: String) {
        cdkBuilder.controlIdentifier(controlIdentifier)
    }

    /** @param parameters Array of `EnabledControlParameter` objects. */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /** @param parameters Array of `EnabledControlParameter` objects. */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /** @param parameters Array of `EnabledControlParameter` objects. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param tags Tags to be applied to the enabled control. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags to be applied to the enabled control. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param targetIdentifier The ARN of the organizational unit. For information on how to find
     *   the `targetIdentifier` , see
     *   [the overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html)
     *   .
     */
    public fun targetIdentifier(targetIdentifier: String) {
        cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): CfnEnabledControlProps {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
