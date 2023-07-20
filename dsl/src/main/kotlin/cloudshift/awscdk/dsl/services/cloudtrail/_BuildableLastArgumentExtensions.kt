@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudtrail

import software.amazon.awscdk.services.cloudtrail.DataResourceType
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.cloudtrail.Trail
import software.amazon.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public inline fun Trail.addEventSelector(
    dataResourceType: DataResourceType,
    dataResourceValues: List<String>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {},
) {
    val builder = AddEventSelectorOptionsDsl()
    builder.apply(block)
    return addEventSelector(dataResourceType, dataResourceValues, builder.build())
}

public inline fun Trail.addLambdaEventSelector(
    handlers: List<IFunction>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {},
) {
    val builder = AddEventSelectorOptionsDsl()
    builder.apply(block)
    return addLambdaEventSelector(handlers, builder.build())
}

public inline fun Trail.addS3EventSelector(
    s3Selector: List<S3EventSelector>,
    block: AddEventSelectorOptionsDsl.() -> Unit = {},
) {
    val builder = AddEventSelectorOptionsDsl()
    builder.apply(block)
    return addS3EventSelector(s3Selector, builder.build())
}

public inline fun Trail.logAllLambdaDataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
    val builder = AddEventSelectorOptionsDsl()
    builder.apply(block)
    return logAllLambdaDataEvents(builder.build())
}

public inline fun Trail.logAllS3DataEvents(block: AddEventSelectorOptionsDsl.() -> Unit = {}) {
    val builder = AddEventSelectorOptionsDsl()
    builder.apply(block)
    return logAllS3DataEvents(builder.build())
}
