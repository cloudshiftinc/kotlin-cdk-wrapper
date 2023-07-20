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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform
import software.amazon.awscdk.services.glue.CfnMLTransformProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnMLTransformPropsDsl {
    private val cdkBuilder: CfnMLTransformProps.Builder = CfnMLTransformProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun glueVersion(glueVersion: String) {
        cdkBuilder.glueVersion(glueVersion)
    }

    public fun inputRecordTables(inputRecordTables: IResolvable) {
        cdkBuilder.inputRecordTables(inputRecordTables)
    }

    public fun inputRecordTables(inputRecordTables: CfnMLTransform.InputRecordTablesProperty) {
        cdkBuilder.inputRecordTables(inputRecordTables)
    }

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun numberOfWorkers(numberOfWorkers: Number) {
        cdkBuilder.numberOfWorkers(numberOfWorkers)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun tags(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.tags(builder.map)
    }

    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun transformEncryption(transformEncryption: IResolvable) {
        cdkBuilder.transformEncryption(transformEncryption)
    }

    public fun transformEncryption(transformEncryption: CfnMLTransform.TransformEncryptionProperty) {
        cdkBuilder.transformEncryption(transformEncryption)
    }

    public fun transformParameters(transformParameters: IResolvable) {
        cdkBuilder.transformParameters(transformParameters)
    }

    public fun transformParameters(transformParameters: CfnMLTransform.TransformParametersProperty) {
        cdkBuilder.transformParameters(transformParameters)
    }

    public fun workerType(workerType: String) {
        cdkBuilder.workerType(workerType)
    }

    public fun build(): CfnMLTransformProps = cdkBuilder.build()
}
