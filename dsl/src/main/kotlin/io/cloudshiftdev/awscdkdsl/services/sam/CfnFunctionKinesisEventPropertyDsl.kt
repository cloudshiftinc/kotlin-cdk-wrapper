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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * KinesisEventProperty kinesisEventProperty = KinesisEventProperty.builder()
 * .startingPosition("startingPosition")
 * .stream("stream")
 * // the properties below are optional
 * .batchSize(123)
 * .enabled(false)
 * .functionResponseTypes(List.of("functionResponseTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-function-kinesisevent.html)
 */
@CdkDslMarker
public class CfnFunctionKinesisEventPropertyDsl {
    private val cdkBuilder: CfnFunction.KinesisEventProperty.Builder =
        CfnFunction.KinesisEventProperty.builder()

    private val _functionResponseTypes: MutableList<String> = mutableListOf()

    /** @param batchSize the value to be set. */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled the value to be set. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param functionResponseTypes the value to be set. */
    public fun functionResponseTypes(vararg functionResponseTypes: String) {
        _functionResponseTypes.addAll(listOf(*functionResponseTypes))
    }

    /** @param functionResponseTypes the value to be set. */
    public fun functionResponseTypes(functionResponseTypes: Collection<String>) {
        _functionResponseTypes.addAll(functionResponseTypes)
    }

    /** @param startingPosition the value to be set. */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /** @param stream the value to be set. */
    public fun stream(stream: String) {
        cdkBuilder.stream(stream)
    }

    public fun build(): CfnFunction.KinesisEventProperty {
        if (_functionResponseTypes.isNotEmpty())
            cdkBuilder.functionResponseTypes(_functionResponseTypes)
        return cdkBuilder.build()
    }
}
