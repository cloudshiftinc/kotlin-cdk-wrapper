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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * LogTypeMapKeyValuePairProperty logTypeMapKeyValuePairProperty =
 * LogTypeMapKeyValuePairProperty.builder()
 * .key("key")
 * .value(List.of("value"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-logtypemapkeyvaluepair.html)
 */
@CdkDslMarker
public class CfnApplicationLogTypeMapKeyValuePairPropertyDsl {
    private val cdkBuilder: CfnApplication.LogTypeMapKeyValuePairProperty.Builder =
        CfnApplication.LogTypeMapKeyValuePairProperty.builder()

    private val _value: MutableList<String> = mutableListOf()

    /** @param key the value to be set. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. */
    public fun `value`(vararg `value`: String) {
        _value.addAll(listOf(*`value`))
    }

    /** @param value List of Applicable values: [STDOUT, STDERR, HIVE_LOG, TEZ_AM, SYSTEM_LOGS]. */
    public fun `value`(`value`: Collection<String>) {
        _value.addAll(`value`)
    }

    public fun build(): CfnApplication.LogTypeMapKeyValuePairProperty {
        if (_value.isNotEmpty()) cdkBuilder.`value`(_value)
        return cdkBuilder.build()
    }
}
