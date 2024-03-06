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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnFramework

/**
 * Contains detailed information about all of the controls of a framework.
 *
 * Each framework must contain at least one control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object controlScope;
 * FrameworkControlProperty frameworkControlProperty = FrameworkControlProperty.builder()
 * .controlName("controlName")
 * // the properties below are optional
 * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .controlScope(controlScope)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-framework-frameworkcontrol.html)
 */
@CdkDslMarker
public class CfnFrameworkFrameworkControlPropertyDsl {
    private val cdkBuilder: CfnFramework.FrameworkControlProperty.Builder =
        CfnFramework.FrameworkControlProperty.builder()

    private val _controlInputParameters: MutableList<Any> = mutableListOf()

    /** @param controlInputParameters A list of `ParameterName` and `ParameterValue` pairs. */
    public fun controlInputParameters(vararg controlInputParameters: Any) {
        _controlInputParameters.addAll(listOf(*controlInputParameters))
    }

    /** @param controlInputParameters A list of `ParameterName` and `ParameterValue` pairs. */
    public fun controlInputParameters(controlInputParameters: Collection<Any>) {
        _controlInputParameters.addAll(controlInputParameters)
    }

    /** @param controlInputParameters A list of `ParameterName` and `ParameterValue` pairs. */
    public fun controlInputParameters(controlInputParameters: IResolvable) {
        cdkBuilder.controlInputParameters(controlInputParameters)
    }

    /** @param controlName The name of a control. This name is between 1 and 256 characters. */
    public fun controlName(controlName: String) {
        cdkBuilder.controlName(controlName)
    }

    /**
     * @param controlScope The scope of a control. The control scope defines what the control will
     *   evaluate. Three examples of control scopes are: a specific backup plan, all backup plans
     *   with a specific tag, or all backup plans.
     *
     * For more information, see
     * [`ControlScope` .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
     */
    public fun controlScope(controlScope: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(controlScope)
        cdkBuilder.controlScope(builder.map)
    }

    /**
     * @param controlScope The scope of a control. The control scope defines what the control will
     *   evaluate. Three examples of control scopes are: a specific backup plan, all backup plans
     *   with a specific tag, or all backup plans.
     *
     * For more information, see
     * [`ControlScope` .](https://docs.aws.amazon.com/aws-backup/latest/devguide/API_ControlScope.html)
     */
    public fun controlScope(controlScope: Any) {
        cdkBuilder.controlScope(controlScope)
    }

    public fun build(): CfnFramework.FrameworkControlProperty {
        if (_controlInputParameters.isNotEmpty())
            cdkBuilder.controlInputParameters(_controlInputParameters)
        return cdkBuilder.build()
    }
}
