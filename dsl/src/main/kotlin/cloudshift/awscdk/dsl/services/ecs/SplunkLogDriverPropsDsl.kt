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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.SplunkLogDriverProps
import software.amazon.awscdk.services.ecs.SplunkLogFormat
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SplunkLogDriverPropsDsl {
    private val cdkBuilder: SplunkLogDriverProps.Builder = SplunkLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    public fun caName(caName: String) {
        cdkBuilder.caName(caName)
    }

    public fun caPath(caPath: String) {
        cdkBuilder.caPath(caPath)
    }

    public fun env(vararg env: String) {
        _env.addAll(listOf(*env))
    }

    public fun env(env: Collection<String>) {
        _env.addAll(env)
    }

    public fun envRegex(envRegex: String) {
        cdkBuilder.envRegex(envRegex)
    }

    public fun format(format: SplunkLogFormat) {
        cdkBuilder.format(format)
    }

    public fun gzip(gzip: Boolean) {
        cdkBuilder.gzip(gzip)
    }

    public fun gzipLevel(gzipLevel: Number) {
        cdkBuilder.gzipLevel(gzipLevel)
    }

    public fun index(index: String) {
        cdkBuilder.index(index)
    }

    public fun insecureSkipVerify(insecureSkipVerify: String) {
        cdkBuilder.insecureSkipVerify(insecureSkipVerify)
    }

    public fun labels(vararg labels: String) {
        _labels.addAll(listOf(*labels))
    }

    public fun labels(labels: Collection<String>) {
        _labels.addAll(labels)
    }

    public fun secretToken(secretToken: Secret) {
        cdkBuilder.secretToken(secretToken)
    }

    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun verifyConnection(verifyConnection: Boolean) {
        cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): SplunkLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
