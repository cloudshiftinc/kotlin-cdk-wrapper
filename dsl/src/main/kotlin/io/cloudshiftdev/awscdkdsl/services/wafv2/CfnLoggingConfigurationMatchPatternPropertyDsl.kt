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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * Object all;
 * MatchPatternProperty matchPatternProperty = MatchPatternProperty.builder()
 * .all(all)
 * .includedPaths(List.of("includedPaths"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-matchpattern.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationMatchPatternPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.MatchPatternProperty.Builder =
        CfnLoggingConfiguration.MatchPatternProperty.builder()

    private val _includedPaths: MutableList<String> = mutableListOf()

    /** @param all the value to be set. */
    public fun all(all: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(all)
        cdkBuilder.all(builder.map)
    }

    /** @param all the value to be set. */
    public fun all(all: Any) {
        cdkBuilder.all(all)
    }

    /** @param includedPaths the value to be set. */
    public fun includedPaths(vararg includedPaths: String) {
        _includedPaths.addAll(listOf(*includedPaths))
    }

    /** @param includedPaths the value to be set. */
    public fun includedPaths(includedPaths: Collection<String>) {
        _includedPaths.addAll(includedPaths)
    }

    public fun build(): CfnLoggingConfiguration.MatchPatternProperty {
        if (_includedPaths.isNotEmpty()) cdkBuilder.includedPaths(_includedPaths)
        return cdkBuilder.build()
    }
}
