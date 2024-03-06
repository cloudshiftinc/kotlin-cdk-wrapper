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
import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.constructs.Construct

/**
 * The resource represents an enabled control.
 *
 * It specifies an asynchronous operation that creates AWS resources on the specified organizational
 * unit and the accounts it contains. The resources created will vary according to the control that
 * you specify.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledControl cfnEnabledControl = CfnEnabledControl.Builder.create(this,
 * "MyCfnEnabledControl")
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
public class CfnEnabledControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEnabledControl.Builder = CfnEnabledControl.Builder.create(scope, id)

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ARN of the control.
     *
     * Only *Strongly recommended* and *Elective* controls are permitted, with the exception of the
     * *Region deny* control. For information on how to find the `controlIdentifier` , see
     * [the overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-controlidentifier)
     *
     * @param controlIdentifier The ARN of the control.
     */
    public fun controlIdentifier(controlIdentifier: String) {
        cdkBuilder.controlIdentifier(controlIdentifier)
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     *
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     *
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /**
     * Array of `EnabledControlParameter` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-parameters)
     *
     * @param parameters Array of `EnabledControlParameter` objects.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     *
     * @param tags Tags to be applied to the enabled control.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags to be applied to the enabled control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-tags)
     *
     * @param tags Tags to be applied to the enabled control.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the organizational unit.
     *
     * For information on how to find the `targetIdentifier` , see
     * [the overview page](https://docs.aws.amazon.com//controltower/latest/APIReference/Welcome.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledcontrol.html#cfn-controltower-enabledcontrol-targetidentifier)
     *
     * @param targetIdentifier The ARN of the organizational unit.
     */
    public fun targetIdentifier(targetIdentifier: String) {
        cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): CfnEnabledControl {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
