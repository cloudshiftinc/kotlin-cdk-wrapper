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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnFrameworkProps

/**
 * Properties for defining a `CfnFramework`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object controlScope;
 * CfnFrameworkProps cfnFrameworkProps = CfnFrameworkProps.builder()
 * .frameworkControls(List.of(FrameworkControlProperty.builder()
 * .controlName("controlName")
 * // the properties below are optional
 * .controlInputParameters(List.of(ControlInputParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .controlScope(controlScope)
 * .build()))
 * // the properties below are optional
 * .frameworkDescription("frameworkDescription")
 * .frameworkName("frameworkName")
 * .frameworkTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-framework.html)
 */
@CdkDslMarker
public class CfnFrameworkPropsDsl {
    private val cdkBuilder: CfnFrameworkProps.Builder = CfnFrameworkProps.builder()

    private val _frameworkControls: MutableList<Any> = mutableListOf()

    private val _frameworkTags: MutableList<Any> = mutableListOf()

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework. Each framework must contain at least one control.
     */
    public fun frameworkControls(vararg frameworkControls: Any) {
        _frameworkControls.addAll(listOf(*frameworkControls))
    }

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework. Each framework must contain at least one control.
     */
    public fun frameworkControls(frameworkControls: Collection<Any>) {
        _frameworkControls.addAll(frameworkControls)
    }

    /**
     * @param frameworkControls Contains detailed information about all of the controls of a
     *   framework. Each framework must contain at least one control.
     */
    public fun frameworkControls(frameworkControls: IResolvable) {
        cdkBuilder.frameworkControls(frameworkControls)
    }

    /**
     * @param frameworkDescription An optional description of the framework with a maximum 1,024
     *   characters.
     */
    public fun frameworkDescription(frameworkDescription: String) {
        cdkBuilder.frameworkDescription(frameworkDescription)
    }

    /**
     * @param frameworkName The unique name of a framework. This name is between 1 and 256
     *   characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9),
     *   and underscores (_).
     */
    public fun frameworkName(frameworkName: String) {
        cdkBuilder.frameworkName(frameworkName)
    }

    /** @param frameworkTags A list of tags with which to tag your framework. */
    public fun frameworkTags(vararg frameworkTags: Any) {
        _frameworkTags.addAll(listOf(*frameworkTags))
    }

    /** @param frameworkTags A list of tags with which to tag your framework. */
    public fun frameworkTags(frameworkTags: Collection<Any>) {
        _frameworkTags.addAll(frameworkTags)
    }

    /** @param frameworkTags A list of tags with which to tag your framework. */
    public fun frameworkTags(frameworkTags: IResolvable) {
        cdkBuilder.frameworkTags(frameworkTags)
    }

    public fun build(): CfnFrameworkProps {
        if (_frameworkControls.isNotEmpty()) cdkBuilder.frameworkControls(_frameworkControls)
        if (_frameworkTags.isNotEmpty()) cdkBuilder.frameworkTags(_frameworkTags)
        return cdkBuilder.build()
    }
}
