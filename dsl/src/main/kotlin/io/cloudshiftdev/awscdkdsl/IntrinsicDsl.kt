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
import kotlin.Any
import kotlin.Boolean
import software.amazon.awscdk.Intrinsic
import software.amazon.awscdk.ResolutionTypeHint

/**
 * Token subclass that represents values intrinsic to the target document language.
 *
 * WARNING: this class should not be externally exposed, but is currently visible because of a
 * limitation of jsii (https://github.com/aws/jsii/issues/524).
 *
 * This class will disappear in a future release and should not be used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object value;
 * Intrinsic intrinsic = Intrinsic.Builder.create(value)
 * .stackTrace(false)
 * .typeHint(ResolutionTypeHint.STRING)
 * .build();
 * ```
 */
@CdkDslMarker
public class IntrinsicDsl(
    `value`: Any,
) {
    private val cdkBuilder: Intrinsic.Builder = Intrinsic.Builder.create(value)

    /**
     * Capture the stack trace of where this token is created.
     *
     * Default: true
     *
     * @param stackTrace Capture the stack trace of where this token is created.
     */
    public fun stackTrace(stackTrace: Boolean) {
        cdkBuilder.stackTrace(stackTrace)
    }

    /**
     * Type that this token is expected to evaluate to.
     *
     * Default: ResolutionTypeHint.STRING
     *
     * @param typeHint Type that this token is expected to evaluate to.
     */
    public fun typeHint(typeHint: ResolutionTypeHint) {
        cdkBuilder.typeHint(typeHint)
    }

    public fun build(): Intrinsic = cdkBuilder.build()
}
