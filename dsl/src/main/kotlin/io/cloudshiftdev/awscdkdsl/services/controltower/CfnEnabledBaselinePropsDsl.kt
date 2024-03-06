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
import software.amazon.awscdk.services.controltower.CfnEnabledBaselineProps

/**
 * Properties for defining a `CfnEnabledBaseline`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.controltower.*;
 * Object value;
 * CfnEnabledBaselineProps cfnEnabledBaselineProps = CfnEnabledBaselineProps.builder()
 * .baselineIdentifier("baselineIdentifier")
 * .baselineVersion("baselineVersion")
 * .targetIdentifier("targetIdentifier")
 * // the properties below are optional
 * .parameters(List.of(ParameterProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-controltower-enabledbaseline.html)
 */
@CdkDslMarker
public class CfnEnabledBaselinePropsDsl {
    private val cdkBuilder: CfnEnabledBaselineProps.Builder = CfnEnabledBaselineProps.builder()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param baselineIdentifier The specific `Baseline` enabled as part of the `EnabledBaseline`
     *   resource.
     */
    public fun baselineIdentifier(baselineIdentifier: String) {
        cdkBuilder.baselineIdentifier(baselineIdentifier)
    }

    /** @param baselineVersion The enabled version of the `Baseline` . */
    public fun baselineVersion(baselineVersion: String) {
        cdkBuilder.baselineVersion(baselineVersion)
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` . These
     *   parameters configure the behavior of the baseline.
     */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` . These
     *   parameters configure the behavior of the baseline.
     */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /**
     * @param parameters Parameters that are applied when enabling this `Baseline` . These
     *   parameters configure the behavior of the baseline.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /** @param tags Tags associated with input to `EnableBaseline` . */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Tags associated with input to `EnableBaseline` . */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param targetIdentifier The target on which to enable the `Baseline` . */
    public fun targetIdentifier(targetIdentifier: String) {
        cdkBuilder.targetIdentifier(targetIdentifier)
    }

    public fun build(): CfnEnabledBaselineProps {
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
