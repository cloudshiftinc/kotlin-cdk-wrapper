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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.CfnJsonProps

/**
 * Example:
 * ```
 * CfnParameter tagParam = new CfnParameter(this, "TagName");
 * CfnJson stringEquals = CfnJson.Builder.create(this, "ConditionJson")
 * .value(Map.of(
 * String.format("aws:PrincipalTag/%s", tagParam.getValueAsString()), true))
 * .build();
 * PrincipalBase principal = new AccountRootPrincipal().withConditions(Map.of(
 * "StringEquals", stringEquals));
 * Role.Builder.create(this, "MyRole").assumedBy(principal).build();
 * ```
 */
@CdkDslMarker
public class CfnJsonPropsDsl {
    private val cdkBuilder: CfnJsonProps.Builder = CfnJsonProps.builder()

    /**
     * @param value The value to resolve. Can be any JavaScript object, including tokens and
     *   references in keys or values.
     */
    public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(`value`)
        cdkBuilder.`value`(builder.map)
    }

    /**
     * @param value The value to resolve. Can be any JavaScript object, including tokens and
     *   references in keys or values.
     */
    public fun `value`(`value`: Any) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnJsonProps = cdkBuilder.build()
}
